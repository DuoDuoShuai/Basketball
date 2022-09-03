package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.service.HourService;
import com.yjy.vo.JsonPageResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author 哆哆
 * @description
 * @date 2022-09-02 15:01:20
 * @describe: TODO
 */
@Controller
@RequestMapping("Hour")
public class HourController {
    @Resource
    private HourService hourService;

    @RequestMapping("listHour")
    @ResponseBody
    public JsonPageResult listHour(LayUiDto dto){
        JsonPageResult map= hourService.listHour(dto);
        return map;
    }
}
