package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.service.ParentService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 徐晓瑞
 * @date 2022/8/29 23:24
 * @describe: TODO
 */

@RestController
@RequestMapping("parent")
public class ParentController {

    @Autowired
    private ParentService parentService;

    @RequestMapping("list")
    public JsonPageResult list(LayUiDto dto){
        JsonPageResult map = parentService.list(dto);
        return map;
    }
}
