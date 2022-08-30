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
    /*查询*/
    public JsonPageResult listCourse(LayUiDto dto);
   /*添加*/
    public int insertCourse(Course course);
}
