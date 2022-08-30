package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.StudentMapper;
import com.yjy.model.Student;
import com.yjy.service.StudentService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/29
 * @Description: TODO 修改的生日时间怎么由date类转毫秒值
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
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
        Student student = studentMapper.load(studentId);
        return student;
    }


    /**
     * 修改
     * @param student
     * @return 成功返回整数i=1
     */
    @Override
    public Integer update(Student student) {
        Date currentTime=new Date(System.currentTimeMillis());
        student.setUpdateTime(currentTime.getTime());
        Integer update = studentMapper.update(student);
        return update;
    }

    /**
     * 删除
     * @param studentId
     * @return 成功返回整数i=1
     */
    @Override
    public Integer remove(String studentId) {
        Integer remove = studentMapper.remove(studentId);
        return remove;
    }

    /**
     * 批量删除
     * @param studentIds
     * @return 成功返回整数i=1
     */
    @Override
    public Integer removeMore(String[] studentIds) {
        Integer remove=0;
        for (String studentId : studentIds) {
            remove = studentMapper.remove(studentId);
        }
        return remove;
    }

    /**
     * 增加
     * @param student
     * @return 成功返回整数i=1
     */
    @Override
    public Integer insert(Student student) {
        student.setStudentId(String.valueOf(UUID.randomUUID()));
        Date currentTime=new Date(System.currentTimeMillis());
        student.setCreateTime(currentTime.getTime());
        student.setUpdateTime(currentTime.getTime());
        Integer add = studentMapper.insert(student);
        return add;
    }
}
