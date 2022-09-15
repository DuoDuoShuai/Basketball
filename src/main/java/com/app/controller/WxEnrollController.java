package com.app.controller;

import com.app.dto.WxAllDto;
import com.app.dto.WxInsertDto;
import com.app.service.WxEnrollService;
import com.app.support.WxCourseSupport;
import com.app.support.WxEnrollSupport;
import com.app.vo.WxJsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
    @Autowired
    private WxEnrollService wxEnrollService;

    /**
     * 查询为未班学员
     * @param wxAllDto
     * @return
     */
    @RequestMapping("listByGrade")
    public WxJsonResult listByGrade(WxAllDto wxAllDto){
        return WxJsonResult.success(wxEnrollSupport.listByGrade(wxAllDto));
    }

    /**
     * 报名页面显示报名课程信息
     * @param courseId
     * @return
     */
    @RequestMapping("loadCourse")
    public WxJsonResult loadCourse(String courseId){
        return WxJsonResult.success(wxCourseSupport.loadCourseById(courseId));
    }

    /**
     * 支付成功后生成报名记录
     * @param wxInsertDto
     * @return
     */
    @RequestMapping("insertEnroll")
    public WxJsonResult insertEnroll(WxInsertDto wxInsertDto){
        return WxJsonResult.success(wxEnrollService.insertEnroll(wxInsertDto));
    }
}
