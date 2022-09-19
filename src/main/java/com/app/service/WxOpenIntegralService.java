package com.app.service;

import com.app.dto.WxAllDto;
import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenIntegral;
import com.yjy.vo.JsonPageResult;

/**
 * @author 任凭
 * @create 2022/9/6 01:19
 * @describe TODO
 */
public interface WxOpenIntegralService {

    /**
     * 积分渠道数据全查询
     *
     * @param wxAllDto
     * @return
     */
    JsonPageResult listOpenIntegral(WxAllDto wxAllDto);

    /**
     * 获取单个OpenIntegral对象，根据Id查询
     *
     * @param integralId
     * @return 一个轮播图对象
     */
    OpenIntegral loadOpenIntegral(String integralId);

}
