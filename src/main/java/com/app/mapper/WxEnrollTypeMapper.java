package com.app.mapper;

import com.app.dto.WxAllDto;
import com.yjy.model.Enroll;
import com.yjy.model.EnrollType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/9
 * @Description:
 */
@Repository
public interface WxEnrollTypeMapper {

    /**
     * 点击支付后生成支付状态
     * @param enrollType
     * @return
     */
    Integer insertEnrollType(EnrollType enrollType);

    /**
     * 支付成功后修改支付状态
     * @param enrollType
     * @return
     */
    Integer updateEnrollType(EnrollType enrollType);
}
