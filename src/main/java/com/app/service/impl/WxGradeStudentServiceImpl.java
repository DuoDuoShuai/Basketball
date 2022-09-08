package com.app.service.impl;

import com.app.mapper.WxGradeStudentMapper;
import com.app.service.WxGradeStudentService;
import com.yjy.model.GradeStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/7
 * @Description:
 */
@Service
public class WxGradeStudentServiceImpl implements WxGradeStudentService {
    @Autowired
    private WxGradeStudentMapper wxGradeStudentMapper;
    /**
     * 获取当前时间
     */
    private Date currentTime=new Date(System.currentTimeMillis());

    /**
     * 添加到班级-新增班级学员关系
     * @param gradeStudent
     * @return
     */
    @Override
    public Integer insertGrade(GradeStudent gradeStudent) {
        gradeStudent.setId(UUID.randomUUID().toString());
        gradeStudent.setJoinTime(currentTime.getTime());
        gradeStudent.setStudentState(false);
        return wxGradeStudentMapper.insertGrade(gradeStudent);
    }

    /**
     * 移除班级-改变学员状态
     * @param gradeStudent
     * @return
     */
    @Override
    public Integer updateState(GradeStudent gradeStudent) {
        gradeStudent.setLeftTime(currentTime.getTime());
        return wxGradeStudentMapper.updateState(gradeStudent);
    }
}
