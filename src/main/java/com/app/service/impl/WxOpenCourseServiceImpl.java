package com.app.service.impl;

import com.app.dto.WxAllDto;
import com.app.mapper.WxOpenCourseMapper;
import com.app.service.WxOpenCourseService;
import com.yjy.dto.LayUiDto;
import com.yjy.mapper.OpenCourseMapper;
import com.yjy.model.OpenCourse;
import com.yjy.service.OpenCourseService;
import com.yjy.util.QiniuFile;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author 哆哆
 * @description
 * @date 2022-09-05 17:52:30
 * @describe: TODO
 */
@Service
public class WxOpenCourseServiceImpl implements WxOpenCourseService {
    @Autowired
    private WxOpenCourseMapper wxOpenCourseMapper;

    /**
     * 公共信息课程查询
     * @param wxAllDto
     * @return
     */
    @Override
    public JsonPageResult listOpenCourse(WxAllDto wxAllDto) {
        /*判断是否有数据*/
        int count = wxOpenCourseMapper.count(wxAllDto);
        if (count == 0) {
            return JsonPageResult.successPage();
        }
        List<OpenCourse> openCourses = wxOpenCourseMapper.listOpenCourse(wxAllDto);
        JsonPageResult mapVo = JsonPageResult.successPage(openCourses,count);
        return mapVo;
    }
}
