package com.yjy.controller;

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
public class OpenCourseController {
    @Resource
    private OpenCourseService openCourseService;

    /**
     * 公共信息课程查询
     * @param dto
     * @return
     */
    @RequestMapping("listOpenCourse")
    @ResponseBody
    public JsonPageResult listOpenCourse(LayUiDto dto){
        JsonPageResult jsonPageResult = openCourseService.listOpenCourse(dto);
        return jsonPageResult;
    }

    /**
     * 添加公共信息课程
     * @param openCourse
     * @param img
     * @return
     */

    @RequestMapping("insertOpenCourse")
    @ResponseBody
    public JsonResult insertOpenCourse(OpenCourse openCourse, MultipartFile img){
        Integer integer = openCourseService.insertOpenCourse(openCourse, img);
        return JsonResult.success(integer);
    }

    /**
     * 修改公共信息课程
     * @param openCourse
     * @param img
     * @return
     */

    @RequestMapping("updateOpenCourse")
    @ResponseBody
    public JsonResult updateOpenCourse(OpenCourse openCourse,MultipartFile img){
        Integer integer = openCourseService.updateOpenCourse(openCourse, img);
        return JsonResult.success(integer);
    }

    /**
     * 单个删除公共信息课程
     * @param openId
     * @return
     */
    @RequestMapping("deleteOpenCourse")
    @ResponseBody
    public JsonResult deleteOpenCourse(String openId){
        Integer integer = openCourseService.deleteOpenCourse(openId);
        JsonResult success = JsonResult.success(integer);
        return success;
    }

    /**
     * 批量删除公共信息课程
     * @param openIds
     * @return
     */
    @RequestMapping("deleteOpen")
    @ResponseBody
    public JsonResult deleteOpen(@RequestParam("openIds[]")String[] openIds){
        Integer integer = openCourseService.deleteOpen(openIds);
        return JsonResult.success(integer);
    }


}
