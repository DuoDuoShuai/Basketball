package com.app.service;

import com.yjy.model.EnrollType;

/**
 * @author 徐晓瑞
 * @create 2022/9/7 10:03
 * @describe
 */

public interface WxEnrollTypeService {

    /**
     * 点击支付后生成支付状态
     * @param enrollType
     * @return
     */
    Integer insertEnrollType(EnrollType enrollType);
}
