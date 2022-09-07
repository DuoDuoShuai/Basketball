package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Course;
import com.yjy.service.CourseService;
import com.yjy.vo.JsonResult;
import com.yjy.vo.JsonPageResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

/**
 * @author 哆哆
 * @description
 * @date 2022-08-29 14:44:36
 * @describe:TODO
 */
@Controller
@RequestMapping("Course")
public class CourseController {
    @Resource
    private CourseService courseService;

    /**
     * 查询列表
     * @param dto
     * @return
     */

    @ResponseBody
    @RequestMapping("listCourse")
    public JsonPageResult listCourse(LayUiDto dto){
        JsonPageResult course = courseService.listCourse(dto);
        return course;
    }

    /**
     * 添加
     * @param course
     * @param img
     * @return
     * @throws IOException
     */
    @RequestMapping("insertCourse")
    @ResponseBody
    public JsonResult insertCourse(Course course, MultipartFile img) throws IOException {
            Integer integer = courseService.insertCourse(course,img);
        return JsonResult.success(integer);
    }

    /**
     * 修改课程
     * @param course
     * @param img
     * @return
     * @throws IOException
     */
  @RequestMapping("updateCourse")
  @ResponseBody
    public JsonResult updateCourse(Course course,MultipartFile img) throws IOException {
          Integer integer = courseService.updateCourse(course,img);
          return JsonResult.success(integer);
  }

    /**
     * 单个删除课程
     * @param courseId
     * @return
     */

  @RequestMapping("deleteById")
  @ResponseBody
  public  JsonResult deleteById(String courseId){
      Integer integer = courseService.deleteCourse(courseId);
      JsonResult success = JsonResult.success(integer);
      return success;
  }

    /**
     * 批量删除
     * @param courseIds
     * @return
     */
  @RequestMapping("deleteMore")
  @ResponseBody
    public JsonResult deleteMore(@RequestParam(value = "courseIds[]",required = false)String[] courseIds){
      Integer delete = courseService.delete(courseIds);
      JsonResult success = JsonResult.success(delete);
      return success;
  }
}
