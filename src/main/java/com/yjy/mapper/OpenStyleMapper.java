package com.yjy.mapper;

import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenRotation;
import com.yjy.model.OpenStyle;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 任凭
 * @create 2022/8/30 10:07
 * @describe TODO
 */
@Repository
public interface OpenStyleMapper {

    /**
     * 列表+查询
     * @param dto
     * @return
     */
    List<OpenStyle> listOpenStyle(LayUiDto dto);

    /**
     * 列表数据总条数
     * @param dto
     * @return
     */
    Integer count(LayUiDto dto);

    /**
     * 获取单个OpenStyle对象，根据Id查询
     *
     * @param styleId
     * @return
     */
    OpenStyle loadOpenStyle(String styleId);

    /**
     * 增加
     *
     * @param openStyle
     * @return
     */
    Integer insertOpenStyle(OpenStyle openStyle);

    /**
     * 删除
     *
     * @param openStyle
     * @return
     */
    Integer deleteOpenStyle(OpenStyle openStyle);

    /**
     * 修改
     *
     * @param openStyle
     * @return
     */
    Integer updateOpenStyle(OpenStyle openStyle);

    /**
     * 删除时改变修改时间
     *
     * @param openStyle
     * @return
     */
    Integer updateTime(OpenStyle openStyle);
}
