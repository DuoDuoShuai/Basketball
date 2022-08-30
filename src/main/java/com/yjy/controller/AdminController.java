package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.service.AdminService;
import com.yjy.vo.MapVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 徐晓瑞
 * @date 2022/8/29 17:14
 * @describe: TODO
 */

@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("list")
    public MapVo list(LayUiDto dto){
        MapVo map = adminService.list(dto);
        return map;
    }
}
