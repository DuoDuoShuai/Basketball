package com.app.service;

import com.yjy.model.Teacher;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 徐晓瑞
 * @create 2022/9/7 10:03
 * @describe
 */
public interface WxTeacherService {

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
    Integer updateTeacherById(Teacher teacher, MultipartFile img);
}
