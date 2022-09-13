package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.CourseMapper;
import com.yjy.mapper.SchoolMapper;
import com.yjy.model.Course;
import com.yjy.model.School;
import com.yjy.model.Student;
import com.yjy.service.CourseService;
import com.yjy.util.QiniuFile;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author 哆哆
 * @description
 * @date 2022-08-29 17:23:41
 * @describe:TODO
 */
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

    /**
     * 查询课程
     * @param dto
     * @return
     */
    @Override
    public JsonPageResult listCourse(LayUiDto dto) {
        /*判断是否有数据*/
        int count = courseMapper.count(dto);
        if (count == 0) {
            return JsonPageResult.successPage();
        }
        List<Course> course = courseMapper.listCourse(dto);
        JsonPageResult mapVo = JsonPageResult.successPage(course,count);
        return mapVo;
    }

    /**
     *添加课程
     * @param course
     * @return
     */
    @Override
    public Integer insertCourse(Course course,MultipartFile img)  {
        try {
            course.setCourseId(UUID.randomUUID().toString());
            Date currentTime=new Date(System.currentTimeMillis());
            course.setUpdateTime(currentTime.getTime());
            course.setStartTime(currentTime.getTime());
            if (img !=null) {
                course.setPhoto(QiniuFile.uploadFile(img.getBytes()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return courseMapper.insertCourse(course);
    }

    /**
     * 修改课程
     * @param course,img
     * @return
     */
    @Override
    public Integer updateCourse(Course course,MultipartFile img) {
        try {
            Date currentTime=new Date(System.currentTimeMillis());
            course.setUpdateTime(currentTime.getTime());
            if (img != null) {
                course.setPhoto(QiniuFile.uploadFile(img.getBytes()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return courseMapper.updateCourse(course);
    }
    /**
     * 删除课程
     * @param courseId
     * @return
     */
    @Override
    public Integer deleteCourse(String courseId) {
        Integer delete = courseMapper.deleteCourse(courseId);
        if(delete==1){
            Course course = new Course();
            Date currentTime=new Date(System.currentTimeMillis());
            course.setUpdateTime(currentTime.getTime());
            return courseMapper.deleteTime(course);
        }
        return delete;
    }

    /**
     * 批量删除
     * @param courseIds
     * @return
     */

    @Override
    public Integer delete(String[] courseIds) {
        Integer delete=0;
        for (String courseId : courseIds) {
            delete = courseMapper.deleteCourse(courseId);
            if(delete==1){
                Course course = new Course();
                Date currentTime=new Date(System.currentTimeMillis());
                course.setUpdateTime(currentTime.getTime());
                courseMapper.deleteTime(course);
            }
        }
        return delete;
    }

    /**
     * 更改状态
     * @param course
     * @return
     */
    @Override
    public Integer courseState(Course course) {
        Date currentTime=new Date(System.currentTimeMillis());
        course.setShelfLeftTime(currentTime.getTime());

        return courseMapper.courseState(course);
    }


}
