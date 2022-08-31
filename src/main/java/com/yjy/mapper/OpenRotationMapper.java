package com.yjy.mapper;

import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenRotation;
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
     *
     * @param dto
     * @return
     */
    List<OpenRotation> listOpenRotation(LayUiDto dto);

    /**
     * 列表总数
     * @param dto
     * @return
     */
    Integer count(LayUiDto dto);
}
