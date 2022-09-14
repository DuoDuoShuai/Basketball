package com.app.service;

import com.yjy.model.Enroll;
import com.yjy.model.Student;

/**
 * @author 徐晓瑞
 * @date 2022/9/14 11:29
 * @describe:
 */

public interface WxEnrollService {

    /**
     * 支付成功后生成报名记录
     * @param enroll
     * @return
     */
    Integer insertEnroll(Enroll enroll, Student student);
}
