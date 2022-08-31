package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.vo.JsonPageResult;

/**
 * @author 任凭
 * @create 2022/8/31 13:04
 * @describe TODO
 */
public interface OpenRotationService {

    /**
     * 轮播图数据全查询
     * @param dto
     * @return
     */
    JsonPageResult listOpenRotation(LayUiDto dto);
}
