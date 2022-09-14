package com.app.service.impl;

import com.app.mapper.WxCourseMapper;
import com.app.service.WxCourseService;
import com.app.vo.JsonPageResult;
import com.yjy.dto.LayUiDto;
import com.yjy.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 哆哆
 * @description
 * @date 2022-09-10 10:31:55
 * @describe: TODO
 */
@Service
public class WxCourseServiceImpl implements WxCourseService {
    @Autowired
    private WxCourseMapper wxCourseMapper;

    /**
     * 课程列表
     * @param dto
     * @return
     */

    @Override
    public List<Course> listCourse(LayUiDto dto) {
        return wxCourseMapper.listCourse(dto);
    }
}
