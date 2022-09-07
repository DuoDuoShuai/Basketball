package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenIntegral;
import com.yjy.model.OpenRotation;
import com.yjy.vo.JsonPageResult;

/**
 * @author 任凭
 * @create 2022/9/6 01:19
 * @describe TODO
 */
public interface OpenIntegralService {

    /**
     * 积分渠道数据全查询
     *
     * @param dto
     * @return
     */
    JsonPageResult listOpenIntegral(LayUiDto dto);

    /**
     * 获取单个OpenIntegral对象，根据Id查询
     *
     * @param integralId
     * @return 一个轮播图对象
     */
    OpenIntegral loadOpenIntegral(String integralId);

    /**
     * 增加
     *
     * @param openIntegral
     * @return
     */
    Integer insertOpenIntegral(OpenIntegral openIntegral);

    /**
     * 删除
     *
     * @param integralId
     * @return 整数i=1
     */
    Integer deleteOpenIntegral(String integralId);

    /**
     * 批量删除
     *
     * @param openIntegralIds
     * @return
     */
    Integer deleteMore(String openIntegralIds);

    /**
     * 修改
     *
     * @param openIntegral
     * @return
     */
    Integer updateOpenIntegral(OpenIntegral openIntegral);
}
