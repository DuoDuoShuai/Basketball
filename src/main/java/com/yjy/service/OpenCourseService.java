package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenCourse;
import com.yjy.vo.JsonPageResult;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author 哆哆
 * @description
 * @date 2022-09-05 17:47:50
 * @describe: TODO
 */
public interface OpenCourseService {
    /**
     * 公共课程信息查询
     * @param dto
     * @return
     */
    public JsonPageResult listOpenCourse(LayUiDto dto);

    /**
     * 添加公共信息课程
     * @param opencourse
     * @param img
     * @return
     */

    public Integer insertOpenCourse(OpenCourse opencourse,MultipartFile img);

    /**
     * 修改公共信息课程
     * @param opencourse
     * @param img
     * @return
     */

    public Integer updateOpenCourse(OpenCourse opencourse,MultipartFile img);

    /**
     * 删除公共信息课程
     * @param openId
     * @return
     */

    public Integer deleteOpenCourse(String openId);

    /**
     * 批量删除公共信息课程
     * @param openIds
     * @return
     */

    public Integer deleteOpen(String[] openIds);
}
