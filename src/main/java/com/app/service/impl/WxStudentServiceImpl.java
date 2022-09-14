package com.app.service.impl;

import com.app.dto.WxAllDto;
import com.app.dto.WxInsertDto;
import com.app.mapper.WxStudentMapper;
import com.app.service.WxStudentService;
import com.yjy.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

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
     * 获取当前时间
     */
    private Date currentTime=new Date(System.currentTimeMillis());

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

    /**
     * 生成新学员--同时新增报名 最初课时
     * @param wxInsertDto
     * @return
     */
    @Override
    public  Integer insertStudent(WxInsertDto wxInsertDto){
        wxInsertDto.setStudentId(UUID.randomUUID().toString());
        wxInsertDto.setCreateTime(currentTime.getTime());
        wxInsertDto.setUpdateTime(currentTime.getTime());
        return wxStudentMapper.insertStudent(wxInsertDto);
    }

}
