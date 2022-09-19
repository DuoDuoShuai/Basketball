package com.app.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Ansewr;
import com.yjy.service.AnswerService;
import com.yjy.vo.JsonPageResult;
import com.yjy.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author 徐晓瑞
 * @date 2022/8/29 23:24
 * @describe:
 */

@RestController
@RequestMapping("answer")
public class WxAnswerController {

    @Autowired
    private AnswerService answerService;

    /**
     * 回答信息展示
     * @param dto
     * @return
     */
    @RequestMapping("list")
    public JsonPageResult list(LayUiDto dto){
        JsonPageResult map = answerService.list(dto);
        return map;
    }
}
