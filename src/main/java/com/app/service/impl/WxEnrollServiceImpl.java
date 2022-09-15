package com.app.service.impl;

import com.app.dto.WxInsertDto;
import com.app.mapper.WxEnAndStuMapper;
import com.app.mapper.WxEnrollMapper;
import com.app.mapper.WxEnrollTypeMapper;
import com.app.service.WxEnrollService;
import com.app.support.WxStudentSupport;
import com.yjy.model.Enroll;
import com.yjy.model.EnrollAndStudent;
import com.yjy.model.EnrollType;
import com.yjy.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author 徐晓瑞
 * @date 2022/9/14 11:29
 * @describe:
 */

@Service
public class WxEnrollServiceImpl implements WxEnrollService {

    @Autowired
    private WxEnrollMapper wxEnrollMapper;
    @Autowired
    private WxEnrollTypeMapper wxEnrollTypeMapper;
    @Autowired
    private WxStudentSupport wxStudentSupport;
    @Autowired
    private WxEnAndStuMapper wxEnAndStuMapper;

    /**
     * 支付成功后生成报名记录
     * @param wxInsertDto
     * @return
     */
    @Override
    public Integer insertEnroll(WxInsertDto wxInsertDto) {
        String studentName = wxInsertDto.getStudentName();
        EnrollType enrollType = new EnrollType();
        enrollType.setStudentName(studentName);
        wxEnrollTypeMapper.updateEnrollType(enrollType);
        wxStudentSupport.insertByEnroll(wxInsertDto);

        Enroll enroll = new Enroll();
        enroll.setEnrollId(UUID.randomUUID().toString());
        Date currentTime=new Date(System.currentTimeMillis());
        enroll.setCreatTime(currentTime.getTime());
        enroll.setCourseName(wxInsertDto.getCourseName());
        enroll.setPayType(wxInsertDto.getPayType());
        enroll.setSchoolNme(wxInsertDto.getSchoolName());
        enroll.setStudentName(wxInsertDto.getStudentName());

        EnrollAndStudent enrollAndStudent = new EnrollAndStudent();
        enrollAndStudent.setEnrollId(enroll.getEnrollId());
        enrollAndStudent.setStudentId(wxInsertDto.getStudentId());
        wxEnAndStuMapper.insertEnAndStu(enrollAndStudent);
        return wxEnrollMapper.insertEnroll(enroll);
    }
}
