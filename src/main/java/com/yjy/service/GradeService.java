package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.vo.JsonPageResult;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/30
 * @Description:
 */
public interface GradeService {
    /**
     * 列表+检索
     * @param dto
     * @return
     */
    JsonPageResult list(LayUiDto dto);
}
