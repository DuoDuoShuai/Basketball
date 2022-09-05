package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.dto.OpenDto;
import com.yjy.mapper.OpenSchoolMapper;
import com.yjy.mapper.SchoolMapper;
import com.yjy.model.OpenSchool;
import com.yjy.model.School;
import com.yjy.service.OpenSchoolService;
import com.yjy.service.SchoolService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/4
 * @Description:
 */
@Service
public class OpenSchoolServiceImpl implements OpenSchoolService {
    @Autowired
    private OpenSchoolMapper openSchoolMapper;

    /**
     * 获取当前时间
     */
    private Date currentTime=new Date(System.currentTimeMillis());

    /**
     * 列表+检索
     * @param dto
     * @return
     */
    @Override
    public JsonPageResult list(OpenDto dto) {
        Integer count = openSchoolMapper.count(dto);
        if(count==0){
            return JsonPageResult.successPage();
        }
        List<OpenSchool> list = openSchoolMapper.list(dto);
        JsonPageResult mapVo = JsonPageResult.successPage(list, count);
        return mapVo;
    }


    /**
     * 修改
     * @param openSchool
     * @return
     */
    @Override
    public Integer update(OpenSchool openSchool) {
        openSchool.setUpdateTime(currentTime.getTime());
        return openSchoolMapper.update(openSchool);
    }

    /**
     * 删除
     * @param openSchoolId
     * @return
     */
    @Override
    public Integer delete(String openSchoolId) {
        Integer delete = openSchoolMapper.delete(openSchoolId);
        if(delete==1){
            OpenSchool openSchool = new OpenSchool();
            openSchool.setUpdateTime(currentTime.getTime());
            return openSchoolMapper.updateTime(openSchool);
        }
        return delete;
    }

    /**
     * 批量删除
     * @param openSchoolIds
     * @return
     */
    @Override
    public Integer deleteMore(String[] openSchoolIds) {
        Integer delete=0;
        for (String openSchoolId : openSchoolIds) {
            delete= openSchoolMapper.delete(openSchoolId);
            if(delete==1){
                OpenSchool openSchool = new OpenSchool();
                openSchool.setUpdateTime(currentTime.getTime());
                openSchoolMapper.updateTime(openSchool);
            }
        }
        return delete;
    }

    /**
     * 添加
     * @param openSchool
     * @return
     */
    @Override
    public Integer insert(OpenSchool openSchool) {
        openSchool.setOpenSchoolId(UUID.randomUUID().toString());
        openSchool.setCreateTime(currentTime.getTime());
        openSchool.setUpdateTime(currentTime.getTime());
        Integer insert = openSchoolMapper.insert(openSchool);
        return insert;
    }
}
