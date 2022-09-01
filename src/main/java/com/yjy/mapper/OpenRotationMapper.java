package com.yjy.mapper;

import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenRotation;
import com.yjy.model.Parent;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 任凭
 * @create 2022/8/31 12:24
 * @describe TODO
 */

@Repository
public interface OpenRotationMapper {

    /**
     * @param dto
     * @return
     */
    List<OpenRotation> listOpenRotation(LayUiDto dto);

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
     * @param openRotationId
     * @return
     */
    OpenRotation loadOpenRotation(String openRotationId);

    /**
     * 增加
     *
     * @param openRotation
     * @return
     */
    Integer insertOpenRotation(OpenRotation openRotation);

    /**
     * 删除
     *
     * @param openRotation
     * @return
     */
    Integer deleteOpenRotation(OpenRotation openRotation);

    /**
     * 修改
     *
     * @param openRotation
     * @return
     */
    Integer updateOpenRotation(OpenRotation openRotation);

    /**
     * 删除时改变修改时间
     *
     * @param openRotation
     * @return
     */
    Integer updateTime(OpenRotation openRotation);

}
