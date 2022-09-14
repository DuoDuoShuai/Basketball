package com.app.controller;

import com.app.dto.WxAllDto;
import com.app.support.WxCourseSupport;
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
public class WxEnrollController {

    @Autowired
    private WxEnrollSupport wxEnrollSupport;
    @Autowired
    private WxCourseSupport wxCourseSupport;

    /**
     * 查询为未班学员
     * @param wxAllDto
     * @return
     */
    @RequestMapping("listByGrade")
    public WxJsonResult listByGrade(WxAllDto wxAllDto){
        return WxJsonResult.success(wxEnrollSupport.listByGrade(wxAllDto));
    }

    @RequestMapping("loadCourse")
    public WxJsonResult loadCourse(String courseId){
        return WxJsonResult.success(wxCourseSupport.loadCourseById(courseId));
    }
}
