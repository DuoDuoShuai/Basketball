package com.app.service;

import com.app.dto.WxAllDto;
import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenCourse;
import com.yjy.vo.JsonPageResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 哆哆
 * @description
 * @date 2022-09-05 17:47:50
 * @describe: TODO
 */
public interface WxOpenCourseService {
    /**
     * 公共课程信息查询
     * @param wxAllDto
     * @return
     */
    public JsonPageResult listOpenCourse(WxAllDto wxAllDto);

}
