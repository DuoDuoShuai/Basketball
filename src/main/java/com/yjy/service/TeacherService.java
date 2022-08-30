package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.vo.JsonPageResult;

public interface TeacherService {
    /**
     * 列表
     */
    JsonPageResult list(LayUiDto dto);
}
