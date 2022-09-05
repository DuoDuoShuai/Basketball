package com.yjy.service;

import com.yjy.dto.OpenDto;
import com.yjy.model.Navigation;
import com.yjy.model.OpenSchool;
import com.yjy.vo.JsonPageResult;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/5
 * @Description:
 */
public interface NavigationService {
    /**
     * 列表
     * @param dto
     * @return 页面表格数据
     */
    JsonPageResult list(OpenDto dto);

    /**
     * 修改
     * @param navigation
     * @return 整数i=1
     */
    Integer update(Navigation navigation);

    /**
     * 删除
     * @param openNavigationId
     * @return 整数i=1
     */
    Integer delete(String openNavigationId);

    /**
     * 批量删除
     * @param openNavigationIds
     * @return 整数i=1
     */
    Integer deleteMore(String[] openNavigationIds);

    /**
     * 增加
     * @param navigation
     * @return 整数i=1
     */
    Integer insert(Navigation navigation);
}
