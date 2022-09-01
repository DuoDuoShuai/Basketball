package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenRotation;
import com.yjy.vo.JsonPageResult;

/**
 * @author 任凭
 * @create 2022/8/31 13:04
 * @describe TODO
 */
public interface OpenRotationService {

    /**
     * 轮播图数据全查询
     *
     * @param dto
     * @return
     */
    JsonPageResult listOpenRotation(LayUiDto dto);

    /**
     * 获取单个OpenRotation对象，根据Id查询
     *
     * @param openRotationId
     * @return 一个轮播图对象
     */
    OpenRotation loadOpenRotation(String openRotationId);

    /**
     * 增加
     *
     * @param openRotation
     * @return 整数i=1
     */
    Integer insertOpenRotation(OpenRotation openRotation);

    /**
     * 删除
     *
     * @param openRotationId
     * @return 整数i=1
     */
    Integer deleteOpenRotation(String openRotationId);

    /**
     * 批量删除
     *
     * @param openRotationIds
     * @return
     */
    Integer deleteMore(String openRotationIds);

    /**
     * 修改
     *
     * @param openRotation
     * @return 整数i=1
     */
    Integer updateOpenRotation(OpenRotation openRotation);
}
