package com.app.service;

import com.yjy.model.GradeStudent;
import org.springframework.stereotype.Repository;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/7
 * @Description:
 */

public interface WxGradeStudentService {
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
}
