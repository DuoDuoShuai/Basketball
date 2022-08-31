package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.ParentMapper;
import com.yjy.model.Admin;
import com.yjy.model.Parent;
import com.yjy.service.ParentService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author 徐晓瑞
 * @date 2022/8/29 23:25
 * @describe: TODO-
 */

@Service
public class ParentServiceImpl implements ParentService {
    @Autowired
    private ParentMapper parentMapper;

    /**
     * 家长信息展示
     * @param dto
     * @return
     */
    @Override
    public JsonPageResult list(LayUiDto dto) {
        //判断是否有数据
        Integer count = parentMapper.count(dto);
        if(count ==0) {
            return JsonPageResult.successPage();
        }
        List<Admin> list = parentMapper.list(dto);
        JsonPageResult map = JsonPageResult.successPage(list, count);
        return map;
    }

    /**
     * 添加家长信息
     * @param parent
     * @return
     */
    @Override
    public Integer insertParent(Parent parent) {
        return parentMapper.insertParent(parent);
    }

    /**
     * 批量删除家长信息
     * @param str
     * @return
     */
    @Override
    public Integer deleteParentMore(String str) {
        String[] split = str.split(",");
        Integer integer = 0;
        for (String s : split) {
            Parent parent = new Parent();
            parent.setParentId(s);
            Date currentTime = new Date(System.currentTimeMillis());
            parent.setParentRegtime(currentTime.getTime());
            integer = parentMapper.deleteParent(parent);
        }
        return integer;
    }

    /**
     * 删除家长信息
     * @param parentId
     * @return
     */
    @Override
    public Integer deleteParent(String parentId) {
        Parent parent = new Parent();
        parent.setParentId(parentId);
        Date currentTime = new Date(System.currentTimeMillis());
        parent.setParentRegtime(currentTime.getTime());
        return parentMapper.deleteParent(parent);
    }

    @Override
    public Integer updateParent(Parent parent) {
        return parentMapper.updateParent(parent);
    }
}
