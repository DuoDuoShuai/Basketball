package com.app.mapper;

import com.yjy.model.GradeStudent;
import com.yjy.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/7
 * @Description:
 */
@Repository
public interface WxStudentMapper {
    /**
     * 接口-根据id查出对应学员信息-给班级模块查看班级学员信息
     * @param studentId
     * @return
     */
    Student loadById(String studentId);
}
