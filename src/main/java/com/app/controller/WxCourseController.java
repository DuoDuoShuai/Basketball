package com.app.controller;

import com.app.service.WxCourseService;
import com.app.vo.WxJsonResult;
import com.yjy.dto.LayUiDto;
import com.yjy.model.Course;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 哆哆
 * @description
 * @date 2022-09-14 10:48:47
 * @describe: TODO
 */
@Controller
@RequestMapping("WxCourse")
public class WxCourseController {
    @Resource
    private WxCourseService wxCourseService;

    /**
     * 课程列表
     * @param dto
     * @return
     */
    @RequestMapping("listCourse")
    @ResponseBody
    public List<Course> listCourse(LayUiDto dto){
        List<Course> courses = wxCourseService.listCourse(dto);
        return courses;
    }
}
