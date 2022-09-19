package com.app.mapper;

import com.app.dto.WxAllDto;
import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenRotation;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 任凭
 * @create 2022/8/31 12:24
 * @describe TODO
 */

@Repository
public interface WxOpenRotationMapper {

    /**
     * 轮播图数据列表
     *
     * @param wxAllDto
     * @return
     */
    List<OpenRotation> listOpenRotation(WxAllDto wxAllDto);

    /**
     * 列表总数
     *
     * @param wxAllDto
     * @return
     */
    Integer count(WxAllDto wxAllDto);

    /**
     * 获取单个OpenRotation对象，根据Id查询
     *
     * @param rotationId
     * @return
     */
    OpenRotation loadOpenRotation(String rotationId);

}
