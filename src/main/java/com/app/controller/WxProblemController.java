package com.app.controller;

import com.app.dto.WxAllDto;
import com.app.service.WxProblemService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 徐晓瑞
 * @date 2022/8/29 23:24
 * @describe:
 */

@RestController
@RequestMapping("problem")
public class WxProblemController {

    @Autowired
    private WxProblemService wxProblemService;

    /**
     * 问题信息展示
     * @param wxAllDto
     * @return
     */
    @RequestMapping("list")
    public JsonPageResult list(WxAllDto wxAllDto){
        JsonPageResult map = wxProblemService.list(wxAllDto);
        return map;
    }
}
