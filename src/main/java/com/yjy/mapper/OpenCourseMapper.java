package com.yjy.mapper;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Course;
import com.yjy.model.OpenCourse;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 哆哆
 * @description
 * @date 2022-09-05 16:26:19
 * @describe: TODO
 */
@Repository
public interface OpenCourseMapper {
    /**
     * 公共课程信息查询
     * @param dto
     * @return
     */
    public List<OpenCourse> listOpenCourse(LayUiDto dto);
    /**
     * 页面总数
     * @param dto
     * @return
     */
    public Integer count(LayUiDto dto);

    /**
     * 添加公共课程信息
     * @param opencourse
     * @return
     */
    public Integer insertOpenCourse(OpenCourse opencourse);

    /**
     * 修改公共课程信息
     * @param opencourse
     * @return
     */
    public Integer updateOpenCourse(OpenCourse opencourse);

    /**
     * 删除公共课程信息
     * @param openId
     * @return
     */

    public Integer deleteOpenCourse(String openId);

    /**
     * 删除时更新时间
     * @param opencourse
     * @return
     */

    public Integer deleteTime(OpenCourse opencourse);

    /**
     * 更改状态
     * @param openCourse
     * @return
     */
    public Integer openCourseState(OpenCourse openCourse);
}
