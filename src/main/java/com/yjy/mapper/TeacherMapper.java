package com.yjy.mapper;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherMapper {
    /**
     * 列表+查询
     * @param dto
     * @return
     */
    List<Admin> list(LayUiDto dto);

    /**
     * 列表总数
     */
    Integer count(LayUiDto dto);
}
