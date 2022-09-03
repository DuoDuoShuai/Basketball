package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Grade;
import com.yjy.model.Student;
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
@RequestMapping("grade")
public class GradeController {
    @Autowired
    private GradeServiceImpl gradeService;

    /**
     * 列表+检索
     * @param dto
     * @return
     */
    @RequestMapping("list")
    @ResponseBody
    public JsonPageResult list(LayUiDto dto){
        JsonPageResult list = gradeService.list(dto);
        return list;
    }
    /**
     * 添加
     * @param grade
     * @return 返回成功结果
     */
    @RequestMapping("insert")
    @ResponseBody
    public JsonResult insert(Grade grade, MultipartFile img){
        Integer insert = gradeService.insert(grade, img);
        return JsonResult.success(insert);
    }

    /**
     * 编辑
     * @param grade
     * @return 返回成功结果
     */
    @RequestMapping("edit")
    @ResponseBody
    public JsonResult edit(Grade grade,MultipartFile img){
        Integer update = gradeService.update(grade, img);
        return JsonResult.success(update);
    }

    /**
     * 批量删除
     * @param gradeIds
     * @return 返回成功结果
     */
    @RequestMapping("deleteMore")
    @ResponseBody
    public JsonResult deleteMore(@RequestParam("gradeIds[]")String[] gradeIds){
        Integer remove = gradeService.deleteMore(gradeIds);
        JsonResult success = JsonResult.success(remove);
        return success;
    }

    /**
     * 删除
     * @param gradeId
     * @return 返回成功结果
     */
    @RequestMapping("delete")
    @ResponseBody
    public JsonResult delete(String gradeId){
        Integer remove = gradeService.delete(gradeId);
        JsonResult success = JsonResult.success(remove);
        return success;
    }
}
