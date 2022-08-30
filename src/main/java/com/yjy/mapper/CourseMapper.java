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
   * 查询
   */
   public List<Course> listCourse(LayUiDto dto);
   /**
    * 页面总数
    */
    public Integer count(LayUiDto dto);
    /**
     * 添加
     */
    public Integer insertCourse(Course course);
}
