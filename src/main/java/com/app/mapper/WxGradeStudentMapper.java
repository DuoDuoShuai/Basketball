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
public interface WxGradeStudentMapper {
    /**
     * 添加到班级-新增班级学员关系
     * @param gradeStudent
     * @return
     */
    Integer insertGrade(GradeStudent gradeStudent);

    /**
     * 移除班级-改变学员状态
     * @param gradeStudent
     * @return
     */
    Integer updateState(GradeStudent gradeStudent);

    /**
     * 根据班级id查询班级下的所有学员
     * @param gradeId
     * @return
     */
    List<Student> listStudent(String gradeId);
}
