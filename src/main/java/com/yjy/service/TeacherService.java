package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.vo.MapVo;

public interface TeacherService {
    /**
     * 列表
     */
    MapVo list(LayUiDto dto);
}
