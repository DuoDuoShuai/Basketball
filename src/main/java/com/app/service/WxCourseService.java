package com.app.service;

import com.app.vo.JsonPageResult;
import com.yjy.dto.LayUiDto;
import com.yjy.model.Course;

import java.util.List;

/**
 * @author 哆哆
 * @description
 * @date 2022-09-10 10:24:04
 * @describe: TODO
 */
public interface WxCourseService {
    /**
     * 课程列表
     * @param dto
     * @return
     */
   public List<Course> listCourse(LayUiDto dto);
}
