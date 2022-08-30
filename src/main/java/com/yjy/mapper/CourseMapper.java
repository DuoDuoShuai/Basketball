package com.yjy.mapper;

import com.yjy.model.Course;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 哆哆
 * @description TODO
 * @date 2022-08-29 14:15:59
 */
@Repository
public interface CourseMapper {
  /*查询*/
   public List<Course> findCourse(@Param("pageno")int pageno,@Param("pageno") int pagesize);
}
