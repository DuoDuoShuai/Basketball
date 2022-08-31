package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Course;
import com.yjy.service.CourseService;
import com.yjy.vo.JsonResult;
import com.yjy.vo.JsonPageResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
     */
    @ResponseBody
    @RequestMapping("listCourse")
    public JsonPageResult listCourse(LayUiDto dto){
        JsonPageResult course = courseService.listCourse(dto);
        return course;
    }
    /**
     * 添加
     */

   @RequestMapping("insertCourse")
   @ResponseBody
    public JsonResult insertCourse(Course course,MultipartFile img) throws IOException {
       JsonResult success=null;
       if(img !=null){
           //设置图片路劲
           String originalFilename = img.getOriginalFilename();
           String filepath="E:\\IDEA\\basketball\\src\\main\\resources\\static\\images\\"+originalFilename;
           //转存
           img.transferTo(new File(filepath));
           course.setPhoto(originalFilename);
           course.setCourseId(UUID.randomUUID().toString());
           Date currentTime=new Date(System.currentTimeMillis());
           course.setUpdateTime(currentTime.getTime());
           course.setCreateTime(currentTime.getTime());
           Integer integer = courseService.insertCourse(course);
           success = JsonResult.success(integer);
       }
       return success;
   }
}
