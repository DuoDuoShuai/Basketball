package com.yjy.mapper;

import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenRotation;
import com.yjy.model.OpenWe;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 任凭
 * @create 2022/8/31 12:24
 * @describe TODO
 */

@Repository
public interface OpenWeMapper {

    /**
     * 关于我们数据列表
     *
     * @param dto
     * @return
     */
    List<OpenWe> listOpenWe(LayUiDto dto);

    /**
     * 列表总数
     *
     * @param dto
     * @return
     */
    Integer count(LayUiDto dto);

    /**
     * 获取单个OpenRotation对象，根据Id查询
     *
     * @param weId
     * @return
     */
    OpenWe loadOpenWe(String weId);

    /**
     * 增加
     *
     * @param openWe
     * @return
     */
    Integer insertOpenWe(OpenWe openWe);

    /**
     * 删除
     *
     * @param openWe
     * @return
     */
    Integer deleteOpenWe(OpenWe openWe);

    /**
     * 修改
     *
     * @param openWe
     * @return
     */
    Integer updateOpenWe(OpenWe openWe);

    /**
     * 删除时改变修改时间
     *
     * @param openWe
     * @return
     */
    Integer updateTime(OpenWe openWe);

}
