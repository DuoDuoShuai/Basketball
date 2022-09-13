package com.app.controller;

import com.app.dto.WxAllDto;
import com.app.support.WxEnrollSupport;
import com.app.vo.WxJsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/9
 * @Description:
 */
@RestController
@RequestMapping("wx_enroll")
public class WxEnrollControll {
    @Autowired
    private WxEnrollSupport wxEnrollSupport;
    @RequestMapping("listByGrade")
    public WxJsonResult listByGrade(WxAllDto wxAllDto){
        return WxJsonResult.success(wxEnrollSupport.listByGrade(wxAllDto));
    }
}
