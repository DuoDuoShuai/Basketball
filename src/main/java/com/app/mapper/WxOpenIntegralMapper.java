package com.app.mapper;

import com.app.dto.WxAllDto;
import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenIntegral;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 任凭
 * @create 2022/9/6 00:36
 * @describe TODO
 */

@Repository
public interface WxOpenIntegralMapper {

    /**
     * 积分渠道数据列表
     *
     * @param wxAllDto
     * @return
     */
    List<OpenIntegral> listOpenIntegral(WxAllDto wxAllDto);

    /**
     * 列表总数
     *
     * @param wxAllDto
     * @return
     */
    Integer count(WxAllDto wxAllDto);

    /**
     * 获取单个OpenIntegral对象，根据Id查询
     *
     * @param integralId
     * @return
     */
    OpenIntegral loadOpenIntegral(String integralId);


}
