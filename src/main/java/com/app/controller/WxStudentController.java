package com.app.controller;

import com.app.dto.WxAllDto;
import com.app.dto.WxInsertDto;
import com.app.service.impl.WxStudentServiceImpl;
import com.app.support.WxStudentSupport;
import com.app.vo.WxJsonResult;
import com.yjy.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
     * 根据id查出对应学员信息、班级、校区、报名
     * @param studentId
     * @return
     */
    @RequestMapping("loadInfo")
    public WxJsonResult loadInfo(String studentId){
        return WxJsonResult.success(wxStudentService.loadInfo(studentId));
    }

    /**
     * 接口-根据id查出对应学员信息-给班级模块查看班级学员信息
     * @param studentId
     * @return
     */
    @RequestMapping("loadById")
    public WxJsonResult loadById(String studentId){
        return WxJsonResult.success(wxStudentSupport.loadById(studentId));
    }

    /**
     * 根据班级id查询班级下的所有学员
     * @param wxAllDto
     * @return
     */
    @RequestMapping("listStudent")
    public WxJsonResult listStudent(WxAllDto wxAllDto){
        List<Student> list = wxStudentSupport.listStudent(wxAllDto);
        System.out.println(list);
        return WxJsonResult.success(list);
    }

    /**
     * 学员管理-学员列表
     * @param wxAllDto
     * @return
     */
    @RequestMapping("listAllStudent")
    public WxJsonResult listAllStudent(WxAllDto wxAllDto) {
        return WxJsonResult.success(wxStudentService.listAllStudent(wxAllDto));
    }

    /**
     * 生成新学员--同时新增报名 最初课时
     * @param wxInsertDto
     * @return
     */
    @RequestMapping("insertStudent")
    public WxJsonResult insertStudent(WxInsertDto wxInsertDto){
        return WxJsonResult.success(wxStudentService.insertStudent(wxInsertDto));
    }

    /**
     * 学员列表--根据家长id查询名下学员--家长端学员列表
     * @param parentId
     * @return
     */
    @RequestMapping("listByUser")
    public WxJsonResult listByUser(String parentId){
        return WxJsonResult.success(wxStudentService.listByUser(parentId));
    }
}
