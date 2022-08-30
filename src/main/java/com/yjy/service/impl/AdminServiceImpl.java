package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.AdminMapper;
import com.yjy.model.Admin;
import com.yjy.service.AdminService;
import com.yjy.vo.MapVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 徐晓瑞
 * @date 2022/8/29 17:11
 * @describe: TODO
 */

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    /**
     * 管理员信息查询全部
     * @param dto
     * @return
     */
    @Override
    public MapVo list(LayUiDto dto) {
        //判断是否有数据
        Integer count = adminMapper.count(dto);
        if(count ==0) {
            return MapVo.successPage();
        }
        List<Admin> list = adminMapper.list(dto);
        return MapVo.successPage(list, count);
    }
}
