package com.yjy.mapper;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Grade;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/30
 * @Description:
 */
@Repository
public interface GradeMapper {
    /**
     * 列表+检索
     * @param dto
     * @return
     */
    List<Grade> list(LayUiDto dto);

    /**
     * 总条数
     * @param dto
     * @return
     */
    Integer count(LayUiDto dto);
}
