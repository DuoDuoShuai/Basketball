package com.app.service.impl;

import com.app.mapper.WxEnrollTypeMapper;
import com.app.service.WxEnrollTypeService;
import com.yjy.model.EnrollType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 徐晓瑞
 * @date 2022/9/13 17:08
 * @describe:
 */

@Service
public class WxEnrollTypeServiceImpl implements WxEnrollTypeService {

    @Resource
    private WxEnrollTypeMapper wxEnrollTypeMapper;

    /**
     * 点击支付后生成支付状态
     * @param enrollType
     * @return
     */
    @Override
    public Integer insertEnrollType(EnrollType enrollType) {
        return wxEnrollTypeMapper.insertEnrollType(enrollType);
    }
}
