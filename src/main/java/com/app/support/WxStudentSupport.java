package com.app.support;

import com.app.mapper.WxStudentMapper;
import com.yjy.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/7
 * @Description:
 */
@Component
public class WxStudentSupport {
    @Autowired
    private WxStudentMapper wxStudentMapper;

    /**
     * 接口-根据id查出对应学员信息-给班级模块查看班级学员信息
     * @param studentId
     * @return
     */
    public Student loadById(String studentId){
        return wxStudentMapper.loadById(studentId);
    }

    /**
     * 接口-查询全部学员信息
     * @return
     */
    public List<Student> listAll(){
        return null;
    }
}
