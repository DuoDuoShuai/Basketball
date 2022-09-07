package com.yjy.mapper;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Style;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 任凭
 * @create 2022/9/7 03:04
 * @describe TODO
 */

@Repository
public interface StyleMapper {

    /**
     * 轮播图数据列表
     *
     * @param dto
     * @return
     */
    List<Style> listStyle(LayUiDto dto);

    /**
     * 列表总数
     *
     * @param dto
     * @return
     */
    Integer count(LayUiDto dto);

    /**
     * 获取单个Style对象，根据Id查询
     *
     * @param styleId
     * @return
     */
    Style loadStyle(String styleId);

    /**
     * 增加
     *
     * @param style
     * @return
     */
    Integer insertStyle(Style style);

    /**
     * 删除
     style
     * @param style
     * @return
     */
    Integer deleteStyle(Style style);


    /**
     * 删除时改变修改时间
     *
     * @param style
     * @return
     */
    Integer updateTime(Style style);

}
