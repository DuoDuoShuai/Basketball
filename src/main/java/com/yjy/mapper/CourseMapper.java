package com.yjy.mapper;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Course;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 哆哆
 * @description TODO
 * @date 2022-08-29 14:15:59
 * @describe:TODO
 */
@Repository
public interface CourseMapper {
 /**
  * 查询课程
  * @param dto
  * @return
  */
   public List<Course> listCourse(LayUiDto dto);

 /**
  * 页面总数
  * @param dto
  * @return
  */
    public Integer count(LayUiDto dto);

 /**
  * 添加课程
  * @param course
  * @return
  */
 public Integer insertCourse(Course course);

 public Integer updateCourse(Course course);
}
