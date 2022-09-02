package com.yjy.support;

import com.yjy.mapper.StudentMapper;
import com.yjy.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/1
 * @Description:
 */
@Component
public class StudentSupport {
    @Autowired
    private StudentMapper studentMapper;

    /**
     * 接口-根据id查出对应学员信息
     * @param studentId
     * @return
     */
    public Student loadById(String studentId){
        return studentMapper.loadById(studentId);
    }

    /**
     * 接口-查询全部学员信息
     * @return
     */
    public List<Student> listAll(){
        return studentMapper.listAll();
    }
}
