package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.StudentMapper;
import com.yjy.model.Student;
import com.yjy.service.StudentService;
import com.yjy.vo.JsonPageResult;
import com.yjy.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/29
 * @Description: TODO 修改的生日时间怎么由date类转毫秒值 啦啦啦啦
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    /**
     * 获取当前时间
     */
    private Date currentTime=new Date(System.currentTimeMillis());
    /**
     * 列表
     * @param dto
     * @return 返回mapvo页面表格数据
     */
    @Override
    public JsonPageResult list(LayUiDto dto) {
        Integer count = studentMapper.count(dto);
        if(count==0){
            return JsonPageResult.successPage();
        }
        List<Student> list = studentMapper.list(dto);
        JsonPageResult mapVo = JsonPageResult.successPage(list, count);
        return mapVo;
    }

    /**
     * 详情
     * @param studentId
     * @return 返回已个学生对象
     */
    @Override
    public Student load(String studentId) {
        Student student = studentMapper.loadById(studentId);
        return student;
    }


    /**
     * 修改
     * @param student
     * @return 成功返回整数i=1
     */
    @Override
    public Integer update(Student student,MultipartFile img) {
        Integer update=0;
        try {
            if (img != null) {
                //设置图片路径
                String filename = img.getOriginalFilename();
                String filepath = "E:\\upload\\" + filename;
                //转存文件
                img.transferTo(new File(filepath));
                //把文件路径存入student数据表中
                student.setPhoto(filename);
                student.setUpdateTime(currentTime.getTime());
                update= studentMapper.update(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return update;
    }

    /**
     * 删除
     * @param studentId
     * @return 成功返回整数i=1
     */
    @Override
    public Integer delete(String studentId) {
        Integer delete = studentMapper.delete(studentId);
        if(delete==1){
            Student student=new Student();
            student.setUpdateTime(currentTime.getTime());
            return studentMapper.updateTime(student);
        }
        return delete;
    }

    /**
     * 批量删除
     * @param studentIds
     * @return 成功返回整数i=1
     */
    @Override
    public Integer deleteMore(String[] studentIds) {
        Integer delete=0;
        for (String studentId : studentIds) {
            delete = studentMapper.delete(studentId);
            if(delete==1){
                Student student=new Student();
                student.setUpdateTime(currentTime.getTime());
                studentMapper.updateTime(student);
            }
        }
        return delete;
    }

    /**
     * 增加
     * @param student
     * @return 成功返回整数i=1
     */
    @Override
    public Integer insert(Student student, MultipartFile img) {
        Integer insert=0;
        try {
            if (img != null) {
                //设置图片路径
                String filename = img.getOriginalFilename();
                String filepath = "E:\\upload\\" + filename;
                //转存文件
                img.transferTo(new File(filepath));
                //把文件路径存入student数据表中
                student.setPhoto(filename);
                student.setStudentId(String.valueOf(UUID.randomUUID()));
                student.setCreateTime(currentTime.getTime());
                student.setUpdateTime(currentTime.getTime());
                insert= studentMapper.insert(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return insert;
    }
}
