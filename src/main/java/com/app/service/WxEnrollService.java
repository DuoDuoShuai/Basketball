package com.app.service;

import com.app.dto.WxInsertDto;
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
     * @param wxInsertDto
     * @return
     */
    Integer insertEnroll(WxInsertDto wxInsertDto);
}
