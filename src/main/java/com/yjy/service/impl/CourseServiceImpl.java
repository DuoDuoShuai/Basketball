package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.CourseMapper;
import com.yjy.model.Course;
import com.yjy.service.CourseService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    /*
     * 查询列表
     * */
    @Override
    public JsonPageResult listCourse(LayUiDto dto) {
        /*判断是否有数据*/
        int count = courseMapper.count(dto);
        if (count == 0) {
            return JsonPageResult.successPage();
        }
        List<Course> course = courseMapper.listCourse(dto);
        JsonPageResult mapVo = JsonPageResult.successPage(course, count);
        return mapVo;
    }

    /**
     *添加课程
     * @param course
     * @return
     */

    @Override
    public Integer insertCourse(Course course) {
        course.setCourseId(UUID.randomUUID().toString());
        Date currentTime=new Date(System.currentTimeMillis());
        course.setUpdateTime(currentTime.getTime());
        course.setStartTime(currentTime.getTime());
        return courseMapper.insertCourse(course);
    }

    /**
     * 修改课程
     * @param course
     * @return
     */
    @Override
    public Integer updateCourse(Course course) {
        Date currentTime=new Date(System.currentTimeMillis());
        course.setUpdateTime(currentTime.getTime());
        return null;
    }
}
