package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.vo.JsonPageResult;

/**
 * @author 任凭
 * @create 2022/8/30 14:30
 * @describe TODO
 */
public interface OpenStyleService {
    /**
     * 列表
     * @param dto
     * @return 页面表格数据
     */
    JsonPageResult listOpenStyle(LayUiDto dto);
}
