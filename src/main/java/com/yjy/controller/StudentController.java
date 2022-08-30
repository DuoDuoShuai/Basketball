package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Student;
import com.yjy.service.StudentService;
import com.yjy.vo.JsonResult;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/29
 * @Description:
 */
@Controller
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**
     * 列表
     * @param dto
     * @return
     */
    @RequestMapping("list")
    @ResponseBody
    public JsonPageResult list(LayUiDto dto){
        JsonPageResult map = studentService.list(dto);
        return map;
    }

    /**
     * 添加
     * @param student
     * @return 返回成功结果
     */
    @RequestMapping("insert")
    @ResponseBody
    public JsonResult insert(Student student){
        Integer add = studentService.insert(student);
        JsonResult success = JsonResult.success(add);
        return success;
    }

    /**
     * 编辑
     * @param student
     * @return 返回成功结果
     */
    @RequestMapping("edit")
    @ResponseBody
    public JsonResult edit(Student student){
        Integer update = studentService.update(student);
        JsonResult success = JsonResult.success(update);
        return success;
    }

    /**
     * 批量删除
     * @param studentIds
     * @return 返回成功结果
     */
    @RequestMapping("removemore")
    @ResponseBody
    public JsonResult removeMore(@RequestParam("studentIds[]")String[] studentIds){
        Integer remove = studentService.removeMore(studentIds);
        JsonResult success = JsonResult.success(remove);
        return success;
    }

    /**
     * 删除
     * @param studentId
     * @return 返回成功结果
     */
    @RequestMapping("remove")
    @ResponseBody
    public JsonResult remove(String studentId){
        Integer remove = studentService.remove(studentId);
        JsonResult success = JsonResult.success(remove);
        return success;
    }
}
