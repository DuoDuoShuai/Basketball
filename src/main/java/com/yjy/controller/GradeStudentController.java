package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.dto.RelationDto;
import com.yjy.model.Grade;
import com.yjy.model.GradeStudent;
import com.yjy.service.GradeStudentService;
import com.yjy.service.impl.GradeServiceImpl;
import com.yjy.vo.JsonPageResult;
import com.yjy.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/30
 * @Description:
 */
@Controller
@RequestMapping("gradeStudent")
public class GradeStudentController {
    @Autowired
    private GradeStudentService gradeStudentService;

    /**
     * 列表+检索
     * @param dto
     * @return
     */
    @RequestMapping("list")
    @ResponseBody
    public JsonPageResult list(RelationDto dto){
        JsonPageResult list = gradeStudentService.list(dto);
        return list;
    }
    /**
     * 添加
     * @param gradeStudent
     * @return 返回成功结果
     */
    @RequestMapping("insert")
    @ResponseBody
    public JsonResult insert(GradeStudent gradeStudent){
        Integer insert = gradeStudentService.insert(gradeStudent);
        return JsonResult.success(insert);
    }

    /**
     * 编辑
     * @param gradeStudent
     * @return 返回成功结果
     */
    @RequestMapping("edit")
    @ResponseBody
    public JsonResult edit(GradeStudent gradeStudent){
        Integer update = gradeStudentService.update(gradeStudent);
        return JsonResult.success(update);
    }

}
