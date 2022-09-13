package com.app.service.impl;

import com.app.mapper.WxTeacherMapper;
import com.app.service.WxTeacherService;
import com.yjy.model.Teacher;
import com.yjy.util.QiniuFile;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Date;

/**
 * @author 徐晓瑞
 * @date 2022/9/7 10:03
 * @describe:
 */

@Service
public class WxTeacherServiceImpl implements WxTeacherService {

    @Resource
    private WxTeacherMapper wxTeacherMapper;

    @Override
    public Teacher loadTeacher(String name) {
        return wxTeacherMapper.loadTeacher(name);
    }

    @Override
    public Integer updateTeacherById(Teacher teacher, MultipartFile img) {
        try {
            Date currentTime=new Date(System.currentTimeMillis());
            teacher.setUpdateTime(currentTime.getTime());
            if (img != null){
                teacher.setTeacherPhoto(QiniuFile.uploadFile(img.getBytes()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wxTeacherMapper.updateTeacherById(teacher);
    }
}
