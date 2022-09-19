package com.app.controller;

import com.app.dto.WxAllDto;
import com.app.service.impl.WxOpenNavigationServiceImpl;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/5
 * @Description:
 */
@Controller
@RequestMapping("navigation")
public class WxOpenNavigationController {
    @Autowired
    private WxOpenNavigationServiceImpl wxOpenNavigationService;

    /**
     * 列表
     * @param wxAllDto
     * @return
     */
    @RequestMapping("list")
    @ResponseBody
    public JsonPageResult list(WxAllDto wxAllDto){
        return wxOpenNavigationService.list(wxAllDto);
    }

}
