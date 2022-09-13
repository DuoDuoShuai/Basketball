package com.app.service;

import com.app.dto.WxAllDto;
import com.yjy.model.Student;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/7
 * @Description:
 */
public interface WxStudentService {
    /**
     * 根据id查出对应学员信息、班级、校区、报名
     * @param studentId
     * @return
     */
    Student loadInfo(String studentId);

    /**
     * 学员管理-学员列表
     * @param wxAllDto
     * @return
     */
    List<Student> listAllStudent(WxAllDto wxAllDto);
}
