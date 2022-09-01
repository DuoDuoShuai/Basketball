package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.service.impl.GradeServiceImpl;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/30
 * @Description:
 */
@Controller
@RequestMapping("grade")
public class GradeController {
    @Autowired
    private GradeServiceImpl gradeService;
    @RequestMapping("list")
    @ResponseBody
    public JsonPageResult list(LayUiDto dto){
        JsonPageResult list = gradeService.list(dto);
        return list;
    }
}
