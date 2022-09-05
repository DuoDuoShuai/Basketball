package com.yjy.mapper;

import com.yjy.dto.LayUiDto;
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
}
