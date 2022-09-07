package com.yjy.mapper;

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
public interface OpenIntegralMapper {

    /**
     * 积分渠道数据列表
     *
     * @param dto
     * @return
     */
    List<OpenIntegral> listOpenIntegral(LayUiDto dto);

    /**
     * 列表总数
     *
     * @param dto
     * @return
     */
    Integer count(LayUiDto dto);

    /**
     * 获取单个OpenIntegral对象，根据Id查询
     *
     * @param integralId
     * @return
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
     * @param openIntegral
     * @return
     */
    Integer deleteOpenIntegral(OpenIntegral openIntegral);

    /**
     * 修改
     *
     * @param openIntegral
     * @return
     */
    Integer updateOpenIntegral(OpenIntegral openIntegral);

    /**
     * 删除时改变修改时间
     *
     * @param openIntegral
     * @return
     */
    Integer updateTime(OpenIntegral openIntegral);

}
