package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Parent;
import com.yjy.vo.JsonPageResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author:
 * @CreatTime:2022/8/29
 * @Description:
 */
public interface ParentService {

    /**
     * 家长信息展示
     * @param dto
     * @return
     */
    JsonPageResult list(LayUiDto dto);

    /**
     * 添加
     * @param parent
     * @param img
     * @return
     */
    Integer insertParent(Parent parent, MultipartFile img);

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
     * 修改
     * @param parent
     * @param img
     * @return
     */
    Integer updateParent(Parent parent,MultipartFile img);
}
