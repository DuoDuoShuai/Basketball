package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.SchoolMapper;
import com.yjy.model.School;
import com.yjy.model.Student;
import com.yjy.service.SchoolService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/31
 * @Description:
 */
@Service
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    private SchoolMapper schoolMapper;

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
    public JsonPageResult list(LayUiDto dto) {
        Integer count = schoolMapper.count(dto);
        if(count==0){
            return JsonPageResult.successPage();
        }
        List<School> list = schoolMapper.list(dto);
        JsonPageResult mapVo = JsonPageResult.successPage(list, count);
        return mapVo;
    }

    /**
     * 查询单个校区
     * @param schoolName
     * @return
     */
    @Override
    public School load(String schoolName) {
        return schoolMapper.loadByName(schoolName);
    }

    /**
     * 修改
     * @param school
     * @return
     */
    @Override
    public Integer update(School school) {
        school.setUpdateTime(currentTime.getTime());
        return schoolMapper.update(school);
    }

    /**
     * 删除
     * @param schoolId
     * @return
     */
    @Override
    public Integer delete(String schoolId) {
        Integer delete = schoolMapper.delete(schoolId);
        if(delete==1){
            School school=new School();
            school.setUpdateTime(currentTime.getTime());
            school.setSchoolId(schoolId);
            Integer integer = schoolMapper.updateTime(school);
        }
        return delete;
    }

    /**
     * 批量删除
     * @param schoolIds
     * @return
     */
    @Override
    public Integer deleteMore(String[] schoolIds) {
        Integer delete=0;
        for (String schoolId : schoolIds) {
            delete= schoolMapper.delete(schoolId);
            if(delete==1){
                School school=new School();
                school.setUpdateTime(currentTime.getTime());
                schoolMapper.updateTime(school);
            }
        }
        return delete;
    }

    /**
     * 添加
     * @param school
     * @return
     */
    @Override
    public Integer insert(School school) {
        school.setSchoolId(UUID.randomUUID().toString());
        school.setCreateTime(currentTime.getTime());
        school.setUpdateTime(currentTime.getTime());
        Integer insert = schoolMapper.insert(school);
        return insert;
    }
}
