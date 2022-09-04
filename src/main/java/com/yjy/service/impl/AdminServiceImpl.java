package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.AdminMapper;
import com.yjy.model.Admin;
import com.yjy.service.AdminService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 徐晓瑞
 * @date 2022/8/29 17:11
 * @describe:
 */

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    /**
     * 管理员信息展示
     * @param dto
     * @return
     */
    @Override
    public JsonPageResult list(LayUiDto dto) {
        //判断是否有数据
        Integer count = adminMapper.count(dto);
        if(count ==0) {
            return JsonPageResult.successPage();
        }
        List<Admin> list = adminMapper.list(dto);
        JsonPageResult map = JsonPageResult.successPage(list, count);
        return map;
    }
}
