package com.app.support;

import com.app.dto.WxAllDto;
import com.app.dto.WxInsertDto;
import com.app.mapper.WxEnrollMapper;
import com.app.mapper.WxEnrollTypeMapper;
import com.yjy.model.Enroll;
import com.yjy.model.EnrollType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/9
 * @Description:
 */
@Component
public class WxEnrollSupport {
    @Autowired
    private WxEnrollMapper wxEnrollMapper;
    @Autowired
    private WxEnrollTypeMapper wxEnrollTypeMapper;

    /**
     * 接口--查询学员不在班级学员表中的报名记录
     * @return
     */
    public List<Enroll> listByGrade(WxAllDto wxAllDto){
        return wxEnrollMapper.listByGrade(wxAllDto);
    }

    /**
     * 接口--添加新学员时生成报名记录
     * @param wxInsertDto
     * @return
     */
    public Integer insertEnroll(WxInsertDto wxInsertDto) {
        String studentName = wxInsertDto.getStudentName();
        EnrollType enrollType = new EnrollType();
        enrollType.setStudentName(studentName);
        wxEnrollTypeMapper.updateEnrollType(enrollType);

        Enroll enroll = new Enroll();
        enroll.setEnrollId(UUID.randomUUID().toString());
        Date currentTime=new Date(System.currentTimeMillis());
        enroll.setCreatTime(currentTime.getTime());
        enroll.setCourseName(wxInsertDto.getCourseName());
        enroll.setPayType(wxInsertDto.getPayType());
        enroll.setSchoolNme(wxInsertDto.getSchoolName());
        enroll.setStudentName(wxInsertDto.getStudentName());
        return wxEnrollMapper.insertEnroll(enroll);
    }
}
