package com.yjy.service.impl;

import com.yjy.dto.OpenDto;
import com.yjy.mapper.NavigationMapper;
import com.yjy.mapper.OpenSchoolMapper;
import com.yjy.model.Navigation;
import com.yjy.model.OpenSchool;
import com.yjy.service.NavigationService;
import com.yjy.service.OpenSchoolService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/5
 * @Description:
 */
@Service
public class NavigationServiceImpl implements NavigationService {
    @Autowired
    private NavigationMapper navigationMapper;

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
        Integer count = navigationMapper.count(dto);
        if(count==0){
            return JsonPageResult.successPage();
        }
        List<Navigation> list = navigationMapper.list(dto);
        JsonPageResult mapVo = JsonPageResult.successPage(list, count);
        return mapVo;
    }


    /**
     * 修改
     * @param navigation
     * @return
     */
    @Override
    public Integer update(Navigation navigation) {
        navigation.setUpdateTime(currentTime.getTime());
        return navigationMapper.update(navigation);
    }

    /**
     * 删除
     * @param openNavigationId
     * @return
     */
    @Override
    public Integer delete(String openNavigationId) {
        Integer delete = navigationMapper.delete(openNavigationId);
        if(delete==1){
            Navigation navigation=new Navigation();
            navigation.setUpdateTime(currentTime.getTime());
            return navigationMapper.updateTime(navigation);
        }
        return delete;
    }

    /**
     * 批量删除
     * @param openNavigationIds
     * @return
     */
    @Override
    public Integer deleteMore(String[] openNavigationIds) {
        Integer delete=0;
        for (String openNavigationId : openNavigationIds) {
            delete= navigationMapper.delete(openNavigationId);
            if(delete==1){
                Navigation navigation=new Navigation();
                navigation.setUpdateTime(currentTime.getTime());
                navigationMapper.updateTime(navigation);
            }
        }
        return delete;
    }

    /**
     * 添加
     * @param navigation
     * @return
     */
    @Override
    public Integer insert(Navigation navigation) {
        navigation.setOpenNavigationId(UUID.randomUUID().toString());
        navigation.setCreateTime(currentTime.getTime());
        navigation.setUpdateTime(currentTime.getTime());
        Integer insert=navigationMapper.insert(navigation);
        return insert;
    }
}
