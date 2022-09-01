package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.vo.JsonPageResult;

/**
 * @author 徐晓瑞
 * @create 2022/9/1 10:28
 * @describe
 */
public interface EnrollService {

    /**
     * 报名记录信息展示
     * @param dto
     * @return
     */
    JsonPageResult list(LayUiDto dto);
}
