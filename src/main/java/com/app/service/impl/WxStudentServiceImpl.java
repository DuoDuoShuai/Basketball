package com.app.service.impl;

import com.app.mapper.WxStudentMapper;
import com.app.service.WxStudentService;
import com.yjy.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/7
 * @Description:
 */
@Service
public class WxStudentServiceImpl implements WxStudentService {
    @Autowired
    private WxStudentMapper wxStudentMapper;

}
