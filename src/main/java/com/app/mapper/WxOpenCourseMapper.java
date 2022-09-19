package com.app.mapper;

import com.app.dto.WxAllDto;
import com.yjy.dto.LayUiDto;
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
public interface WxOpenCourseMapper {
    /**
     * 公共课程信息查询
     * @param wxAllDto
     * @return
     */
    public List<OpenCourse> listOpenCourse(WxAllDto wxAllDto);
    /**
     * 页面总数
     * @param wxAllDto
     * @return
     */
    public Integer count(WxAllDto wxAllDto);

}
