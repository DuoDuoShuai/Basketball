package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.TeacherMapper;
import com.yjy.model.Admin;
import com.yjy.model.Teacher;
import com.yjy.service.TeacherService;
import com.yjy.util.QiniuFile;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author 徐晓瑞
 * @date 2022/8/29 23:27
 * @describe:
 */

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    /**
     * 教练信息展示
     * @param dto
     * @return
     */
    @Override
    public JsonPageResult list(LayUiDto dto) {
        //判断是否有数据
        Integer count = teacherMapper.count(dto);
        if(count ==0) {
            return JsonPageResult.successPage();
        }
        List<Admin> list = teacherMapper.list(dto);
        JsonPageResult map = JsonPageResult.successPage(list, count);
        return map;
    }

    /**
     * 添加教练信息
     * @param teacher
     * @return
     */
    @Override
    public Integer insertTeacher(Teacher teacher, MultipartFile img) {
        try {
            teacher.setTeacherId(UUID.randomUUID().toString());
            Date currentTime=new Date(System.currentTimeMillis());
            teacher.setTeacherRegtime(currentTime.getTime());
            if (img != null){
                teacher.setTeacherPhoto(QiniuFile.uploadFile(img.getBytes()));
            } else {
                teacher.setTeacherPhoto("Ft7t33aDzKOQ_-99zzefF1kWU7dw");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return teacherMapper.insertTeacher(teacher);
    }

    /**
     * 批量删除教练信息
     * @param str
     * @return
     */
    @Override
    public Integer deleteTeacherMore(String str) {
        String[] split = str.split(",");
        Integer integer = 0;
        for (String s : split) {
            Teacher teacher = new Teacher();
            teacher.setTeacherId(s);
            Date currentTime = new Date(System.currentTimeMillis());
            teacher.setUpdateTime(currentTime.getTime());
            teacherMapper.updateTime(teacher);
            integer = teacherMapper.deleteTeacher(teacher);
        }
        return integer;
    }

    /**
     * 删除教练信息
     * @param teacherId
     * @return
     */
    @Override
    public Integer deleteTeacher(String teacherId) {
        Teacher teacher = new Teacher();
        teacher.setTeacherId(teacherId);
        Date currentTime = new Date(System.currentTimeMillis());
        teacher.setUpdateTime(currentTime.getTime());
        teacherMapper.updateTime(teacher);
        return teacherMapper.deleteTeacher(teacher);
    }

    /**
     * 修改教练信息
     * @param teacher
     * @return
     */
    @Override
    public Integer updateTeacher(Teacher teacher,MultipartFile img) {
        try {
            Date currentTime=new Date(System.currentTimeMillis());
            teacher.setUpdateTime(currentTime.getTime());
            if (img != null){
                teacher.setTeacherPhoto(QiniuFile.uploadFile(img.getBytes()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return teacherMapper.updateTeacher(teacher);
    }
}
