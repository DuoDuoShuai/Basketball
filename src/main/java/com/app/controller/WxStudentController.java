package com.app.controller;

import com.app.service.impl.WxStudentServiceImpl;
import com.app.support.WxStudentSupport;
import com.app.vo.WxJsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/7
 * @Description:
 */
@RestController
@RequestMapping("wx_student")
public class WxStudentController {
    @Autowired
    private WxStudentServiceImpl wxStudentService;
    @Autowired
    private WxStudentSupport wxStudentSupport;
    /**
     * 接口-根据id查出对应学员信息-给班级模块查看班级学员信息
     * @param studentId
     * @return
     */
    @RequestMapping("loadById")
    public WxJsonResult loadById(String studentId){
        return WxJsonResult.success(wxStudentSupport.loadById(studentId));
    }
}
