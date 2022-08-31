package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Parent;
import com.yjy.vo.JsonPageResult;
/**
 * @Author:
 * @CreatTime:2022/8/29
 * @Description:
 */
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

    /**
     * 批量删除家长信息
     * @param str
     * @return
     */
    Integer deleteParentMore(String str);

    /**
     * 删除家长信息
     * @param parentId
     * @return
     */
    Integer deleteParent(String parentId);

    /**
     * 修改家长信息
     * @param parent
     * @return
     */
    Integer updateParent(Parent parent);
}
