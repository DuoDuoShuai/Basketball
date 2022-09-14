package com.app.support;

import com.app.mapper.WxCourseMapper;
import com.yjy.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 哆哆
 * @description
 * @date 2022-09-14 10:00:06
 * @describe: TODO
 */

@Component
public class WxCourseSupport {
    @Autowired
    private WxCourseMapper wxCourseMapper;

    /**
     * 接口--报名模块接口
     * @param courseId
     * @return
     */
    public Course loadCourseById(String courseId){
        return wxCourseMapper.loadCourseById(courseId);
    }
}
