package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Student;
import com.yjy.service.StudentService;
import com.yjy.vo.JsonResult;
import com.yjy.vo.MapVo;
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
    public MapVo list(LayUiDto dto){
        MapVo map = studentService.list(dto);
        return map;
    }

    /**
     * 添加
     * @param student
     * @return 返回成功结果
     */
    @RequestMapping("add")
    @ResponseBody
    public JsonResult add(Student student){
        Integer add = studentService.add(student);
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
     * @param ids
     * @return 返回成功结果
     */
    @RequestMapping("removemore")
    @ResponseBody
    public JsonResult removeMore(@RequestParam("ids[]")Integer[] ids){
        Integer remove = studentService.removeMore(ids);
        JsonResult success = JsonResult.success(remove);
        return success;
    }

    /**
     * 删除
     * @param id
     * @return 返回成功结果
     */
    @RequestMapping("remove")
    @ResponseBody
    public JsonResult remove(Integer id){
        Integer remove = studentService.remove(id);
        JsonResult success = JsonResult.success(remove);
        return success;
    }
}
