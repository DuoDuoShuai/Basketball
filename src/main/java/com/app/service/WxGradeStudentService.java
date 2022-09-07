package com.app.service;

import com.yjy.model.GradeStudent;

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
}
