package com.app.mapper;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 哆哆
 * @description
 * @date 2022-09-07 15:25:56
 * @describe: TODO
 */
@Repository
public interface WxCourseMapper {
    /**
     * 查询课程
     * @param dto
     * @return
     */
    public List<Course> listCourse(LayUiDto dto);
}
