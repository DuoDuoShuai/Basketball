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
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/29
 * @Description: TODO
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
    public JsonResult insert(Student student, MultipartFile img)throws IOException {
        JsonResult success = null;
        if(img!=null){
            //设置图片路径
            String filename=img.getOriginalFilename();
            String filepath="E:\\upload\\"+filename;
            //转存文件
            img.transferTo(new File(filepath));
            //把文件路径存入student数据表中
            student.setPhoto(filename);
            Integer add = studentService.insert(student);
            success=JsonResult.success(add);
        }
        return success;
    }

    /**
     * 编辑
     * @param student
     * @return 返回成功结果
     */
    @RequestMapping("edit")
    @ResponseBody
    public JsonResult edit(Student student,MultipartFile img)throws IOException{
        JsonResult success = null;
        if(img!=null){
            //设置图片路径
            String filename=img.getOriginalFilename();
            String filepath="E:\\upload\\"+filename;
            //转存文件
            img.transferTo(new File(filepath));
            //把文件路径存入student数据表中
            student.setPhoto(filename);
            Integer update = studentService.update(student);
            success = JsonResult.success(update);
        }
        return success;
    }

    /**
     * 批量删除
     * @param studentIds
     * @return 返回成功结果
     */
    @RequestMapping("deleteMore")
    @ResponseBody
    public JsonResult deleteMore(@RequestParam("studentIds[]")String[] studentIds){
        Integer remove = studentService.deleteMore(studentIds);
        JsonResult success = JsonResult.success(remove);
        return success;
    }

    /**
     * 删除
     * @param studentId
     * @return 返回成功结果
     */
    @RequestMapping("delete")
    @ResponseBody
    public JsonResult delete(String studentId){
        Integer remove = studentService.delete(studentId);
        JsonResult success = JsonResult.success(remove);
        return success;
    }
}
