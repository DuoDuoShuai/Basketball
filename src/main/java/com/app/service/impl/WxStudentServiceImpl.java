package com.app.service.impl;

import com.app.dto.WxAllDto;
import com.app.mapper.WxStudentMapper;
import com.app.service.WxStudentService;
import com.yjy.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/7
 * @Description:
 */
@Service
public class WxStudentServiceImpl implements WxStudentService {
    @Autowired
    private WxStudentMapper wxStudentMapper;

    /**
     * 根据id查出对应学员信息
     * @param studentId
     * @return
     */
    @Override
    public Student loadInfo(String studentId) {
        return wxStudentMapper.loadInfo(studentId);
    }

    /**
     * 学员管理-学员列表
     * @param wxAllDto
     * @return
     */
    @Override
    public List<Student> listAllStudent(WxAllDto wxAllDto) {
        return wxStudentMapper.listAllStudent(wxAllDto);
    }


}
