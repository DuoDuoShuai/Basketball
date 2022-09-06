package com.yjy.mapper;

import com.yjy.dto.OpenDto;
import com.yjy.model.Navigation;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/5
 * @Description:
 */
@Repository
public interface OpenNavigationMapper {
    /**
     * 列表+查询
     * @param dto
     * @return
     */
    List<Navigation> list(OpenDto dto);
    /**
     * 列表总数
     * @param dto
     * @return
     */
    Integer count(OpenDto dto);

    /**
     * 修改
     * @param navigation
     * @return
     */
    Integer update(Navigation navigation);

    /**
     * 删除时修改时间
     * @param navigation
     * @return
     */
    Integer updateTime(Navigation navigation);

    /**
     * 删除
     * @param openNavigationId
     * @return
     */
    Integer delete(String openNavigationId);

    /**
     * 增加
     * @param navigation
     * @return
     */
    Integer insert(Navigation navigation);

}
