package com.app.mapper;


import com.yjy.model.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 徐晓瑞
 * @create 2022/9/7 10:00
 * @describe
 */
@Repository
public interface WxTeacherMapper {

    /**
     * 登录认证
     * @param name
     * @return
     */
    Teacher loadByTeacherName(String name);

    /**
     * 为班级模块提供接口  查询所有教练名称
     * @return
     */
    List<Teacher> listTeacherName();

    /**
     * 根据教练姓名查询教练基本信息
     * @param name
     * @return
     */
    Teacher loadTeacher(String name);

    /**
     * 教练修改基本信息
     * @param teacher
     * @return
     */
    Integer updateTeacherById(Teacher teacher);
}
