package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Course;
import com.yjy.vo.JsonPageResult;

/**
 * @author 哆哆
 * @description TODO
 * @date 2022-08-29 14:44:58
 * @describe:TODO
 */
public interface CourseService {
    /**
     * 查询课程
     * @param dto
     * @return
     */
    public JsonPageResult listCourse(LayUiDto dto);

    /**
     * 添加课程
     * @param course
     * @return
     */
    public Integer insertCourse(Course course);

    /**
     * 修改课程
     * @param course
     * @return
     */
    public Integer updateCourse(Course course);
}
