package com.app.mapper;

import com.app.model.AppTeacher;

/**
 * @author 徐晓瑞
 * @create 2022/9/7 10:00
 * @describe
 */
public interface AppTeacherMapper {

    /**
     * 登录认证
     * @param name
     * @return
     */
    AppTeacher loadByTeacherName(String name);
}
