package com.app.controller;

import com.app.service.WxTeacherService;
import com.app.vo.WxJsonResult;
import com.yjy.model.Teacher;
import com.yjy.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author 徐晓瑞
 * @date 2022/9/13 11:30
 * @describe:
 */

@RestController
@RequestMapping("wxTeacher")
public class WxTeacherController {

    @Autowired
    private WxTeacherService wxTeacherService;

    /**
     * 根据教练姓名查询教练基本信息
     * @param name
     * @return
     */
    @RequestMapping("loadTeacher")
    public WxJsonResult loadTeacher(String name){
        return WxJsonResult.success(wxTeacherService.loadTeacher(name));
    }

    /**
     * 修改教练信息
     * @param teacher
     * @return
     */
    @RequestMapping("updateTeacher")
    public JsonResult deleteParent(Teacher teacher, MultipartFile img){
        Integer integer = wxTeacherService.updateTeacherById(teacher, img);
        return JsonResult.success(integer);
    }
}
