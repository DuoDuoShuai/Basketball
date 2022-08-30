package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.vo.JsonPageResult;

public interface ParentService {
    /**
     * 列表
     */
    JsonPageResult list(LayUiDto dto);
}
