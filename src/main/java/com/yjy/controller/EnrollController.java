package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.service.EnrollService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 徐晓瑞
 * @date 2022/9/1 10:32
 * @describe:
 */

@RestController
@RequestMapping("enroll")
public class EnrollController {

    @Autowired
    private EnrollService enrollService;

    /**
     * 报名记录信息展示
     * @param dto
     * @return
     */
    @RequestMapping("list")
    public JsonPageResult list(LayUiDto dto){
        JsonPageResult map = enrollService.list(dto);
        return map;
    }
}
