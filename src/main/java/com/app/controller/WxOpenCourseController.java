package com.app.controller;

import com.app.dto.WxAllDto;
import com.app.service.WxOpenCourseService;
import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenCourse;
import com.yjy.service.OpenCourseService;
import com.yjy.vo.JsonPageResult;
import com.yjy.vo.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @author 哆哆
 * @description
 * @date 2022-09-05 22:52:42
 * @describe: TODO
 */
@Controller
@RequestMapping("OpenCourse")
public class WxOpenCourseController {
    @Resource
    private WxOpenCourseService wxOpenCourseService;

    /**
     * 公共信息课程查询
     * @param wxAllDto
     * @return
     */
    @RequestMapping("listOpenCourse")
    @ResponseBody
    public JsonPageResult listOpenCourse(WxAllDto wxAllDto){
        JsonPageResult jsonPageResult = wxOpenCourseService.listOpenCourse(wxAllDto);
        return jsonPageResult;
    }
}
