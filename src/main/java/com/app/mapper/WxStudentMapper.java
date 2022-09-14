package com.app.mapper;

import com.app.dto.WxAllDto;
import com.app.dto.WxInsertDto;
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
     * 根据id查出对应学员信息-给班级模块查看班级学员信息
     * @param studentId
     * @return
     */

    Student loadById(String studentId);

    /**
     * 根据id查出对应学员信息、班级、校区、报名
     * @param studentId
     * @return
     */
    Student loadInfo(String studentId);

    /**
     * 根据班级id查询班级下的所有学员
     * @param wxAllDto
     * @return
     */
    List<Student> listStudent(WxAllDto wxAllDto);

    /**
     * 学员管理-学员列表
     * @param wxAllDto
     * @return
     */
    List<Student> listAllStudent(WxAllDto wxAllDto);

    /**
     * 生成新学员--同时新增报名 最初课时 + 报名时添加未有的学员
     * @param wxInsertDto
     * @return
     */
    Integer insertStudent(WxInsertDto wxInsertDto);

//    /**
//     * 添加新学员--报名时添加未有的学员
//     * @param wxInsertDto
//     * @return
//     */
//    Integer insertByEnroll(WxInsertDto wxInsertDto);

    /**
     * 查询校区下所有学员信息-报名支付选择学员
     * @param wxAllDto
     * @return
     */
    List<Student> listByEnroll(WxAllDto wxAllDto);
}
