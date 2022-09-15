package com.app.service;

import com.app.dto.WxAllDto;
import com.app.dto.WxInsertDto;
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
    /**
     * 生成新学员--同时新增报名 最初课时
     * @param wxInsertDto
     * @return
     */
    Integer insertStudent(WxInsertDto wxInsertDto);

    /**
     * 学员列表--根据家长id查询名下学员--家长端学员列表
     * @param parentId
     * @return
     */
    List<Student> listByUser(String parentId);
}
