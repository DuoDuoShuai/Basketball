package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Teacher;
import com.yjy.service.TeacherService;
import com.yjy.util.QiniuFile;
import com.yjy.vo.JsonPageResult;
import com.yjy.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

/**
 * @author 徐晓瑞
 * @date 2022/8/29 23:29
 * @describe:
 */

@RestController
@RequestMapping("teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    /**
     * 教练信息查询全部
     * @param dto
     * @return
     */
    @RequestMapping("list")
    public JsonPageResult list(LayUiDto dto){
        JsonPageResult map = teacherService.list(dto);
        return map;
    }

    /**
     * 添加教练信息
     * @param teacher,img
     * @return
     */
    @RequestMapping("insertTeacher")
    public JsonResult insertTeacher(Teacher teacher, MultipartFile img) throws IOException {
        Integer integer = teacherService.insertTeacher(teacher, img);
        return JsonResult.success(integer);
    }

    /**
     * 批量删除教练信息
     * @param str
     * @return
     */
    @RequestMapping("deleteTeacherMore")
    public JsonResult deleteTeacherMore(String str){
        Integer integer = teacherService.deleteTeacherMore(str);
        return JsonResult.success(integer);
    }

    /**
     * 删除单条教练信息
     * @param teacherId
     * @return
     */
    @RequestMapping("deleteTeacher")
    public JsonResult deleteTeacher(String teacherId){
        Integer integer = teacherService.deleteTeacher(teacherId);
        return JsonResult.success(integer);
    }

    /**
     * 修改教练信息
     * @param teacher
     * @return
     */
    @RequestMapping("updateTeacher")
    public JsonResult deleteParent(Teacher teacher,MultipartFile img) throws IOException {
        Integer integer = teacherService.updateTeacher(teacher, img);
        return JsonResult.success(integer);
    }
}
