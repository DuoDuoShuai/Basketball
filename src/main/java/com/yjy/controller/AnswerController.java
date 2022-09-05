package com.yjy.controller;

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
public class AnswerController {

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

    /**
     * 添加
     * @param ansewr
     * @return
     */
    @RequestMapping("insertAnswer")
    public JsonResult insertAnswer(Ansewr ansewr){
        Integer integer = answerService.insertAnswer(ansewr);
        return JsonResult.success(integer);
    }

    /**
     * 批量删除
     * @param str
     * @return
     */
    @RequestMapping("deleteAnswerMore")
    public JsonResult deletetAnswerMore(String str){
        Integer integer = answerService.deleteAnswerMore(str);
        return JsonResult.success(integer);
    }

    /**
     * 删除单条
     * @param answerId
     * @return
     */
    @RequestMapping("deleteAnswer")
    public JsonResult deleteAnswer(String answerId){
        Integer integer = answerService.deleteAnswer(answerId);
        return JsonResult.success(integer);
    }

    /**
     * 修改
     * @param answer
     * @return
     */
    @RequestMapping("updateAnswer")
    public JsonResult deleteAnswer(Ansewr answer){
        Integer integer = answerService.updateAnswer(answer);
        return JsonResult.success(integer);
    }
}
