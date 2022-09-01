package com.yjy.mapper;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Enroll;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 徐晓瑞
 * @create 2022/9/1 10:20
 * @describe
 */
@Repository
public interface EnrollMapper {
    /**
     * 报名记录信息展示
     * @param dto
     * @return
     */
    List<Enroll> list(LayUiDto dto);

    /**
     * 列表总数
     * @param dto
     * @return
     */
    Integer count(LayUiDto dto);
}
