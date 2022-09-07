package com.app.mapper;


import com.yjy.model.Teacher;

import java.util.List;

/**
 * @author 徐晓瑞
 * @create 2022/9/7 10:00
 * @describe
 */
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
}
