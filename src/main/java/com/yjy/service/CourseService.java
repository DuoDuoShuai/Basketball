package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Course;
import com.yjy.model.School;
import com.yjy.vo.JsonPageResult;
import org.springframework.web.multipart.MultipartFile;

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
     * @param course,img
     * @return
     */
    public Integer insertCourse(Course course, MultipartFile img);

    /**
     * 修改课程
     * @param course,img
     * @return
     */
    public Integer updateCourse(Course course,MultipartFile img);

    /**
     * 删除课程
     * @param courseId
     * @return
     */

    public Integer deleteCourse(String courseId);

    /**
     * 批量删除
     * @param courseIds
     * @return
     */
    public Integer delete(String[] courseIds);



}
