package com.app.service.impl;

import com.app.mapper.WxEnrollMapper;
import com.app.mapper.WxEnrollTypeMapper;
import com.app.service.WxEnrollService;
import com.yjy.model.Enroll;
import com.yjy.model.EnrollType;
import com.yjy.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    /**
     * 支付成功后生成报名记录
     * @param enroll
     * @return
     */
    @Override
    public Integer insertEnroll(Enroll enroll, Student student) {
        String studentName = student.getStudentName();
        EnrollType enrollType = new EnrollType();
        enrollType.setStudentName(studentName);
        wxEnrollTypeMapper.updateEnrollType(enrollType);
        return null;
    }
}
