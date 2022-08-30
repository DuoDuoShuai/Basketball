package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.AdminMapper;
import com.yjy.mapper.ParentMapper;
import com.yjy.model.Admin;
import com.yjy.model.Parent;
import com.yjy.service.ParentService;
import com.yjy.vo.MapVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 徐晓瑞
 * @date 2022/8/29 23:25
 * @describe: TODO
 */

@Service
public class ParentServiceImpl implements ParentService {
    @Autowired
    private ParentMapper parentMapper;

    /**
     * 家长信息查询全部
     * @param dto
     * @return
     */
    @Override
    public MapVo list(LayUiDto dto) {
        //判断是否有数据
        Integer count = parentMapper.count(dto);
        if(count ==0) {
            return MapVo.successPage();
        }
        List<Admin> list = parentMapper.list(dto);
        return MapVo.successPage(list, count);
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
}
