package com.app.controller;

import com.app.service.impl.WxSchoolServiceImpl;
import com.app.vo.WxJsonResult;
import com.yjy.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/14
 * @Description:
 */
@RestController
@RequestMapping("wx_school")
public class WxSchoolController {
    @Autowired
    private WxSchoolServiceImpl wxSchoolService;

    /**
     * 默认编号为1校区
     * @param
     * @return
     */
    @RequestMapping("loadDefault")
    public WxJsonResult loadDefault(){
        return WxJsonResult.success(wxSchoolService.loadDefault());
    }

    /**
     * 根据id查询某个校区-选择校区
     * @param schoolId
     * @return
     */
    @RequestMapping("loadById")
    public WxJsonResult loadById(String schoolId){
        return WxJsonResult.success(wxSchoolService.loadById(schoolId));
    }

    /**
     * 根据id查询某个校区-选择校区
     * @return
     */
    @RequestMapping("listSchool")
    public WxJsonResult listSchool(){
        return WxJsonResult.success(wxSchoolService.listSchool());
    }
}
