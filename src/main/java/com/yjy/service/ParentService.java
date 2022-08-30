package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Parent;
import com.yjy.vo.JsonPageResult;

public interface ParentService {
    /**
     * 列表
     */
    JsonPageResult list(LayUiDto dto);
    /**
     * 添加家长信息
     * @param parent
     * @return
     */
    Integer insertParent(Parent parent);
}
