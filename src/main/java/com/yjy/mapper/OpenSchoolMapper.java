package com.yjy.mapper;

import com.yjy.dto.LayUiDto;
import com.yjy.dto.OpenDto;
import com.yjy.model.OpenSchool;
import com.yjy.model.School;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/4
 * @Description:
 */
@Repository
public interface OpenSchoolMapper {
    /**
     * 列表+查询
     * @param dto
     * @return
     */
    List<OpenSchool> list(OpenDto dto);
    /**
     * 列表总数
     * @param dto
     * @return
     */
    Integer count(OpenDto dto);

    /**
     * 修改
     * @param openSchool
     * @return
     */
    Integer update(OpenSchool openSchool);

    /**
     * 删除时修改时间
     * @param openSchool
     * @return
     */
    Integer updateTime(OpenSchool openSchool);

    /**
     * 删除
     * @param openSchoolId
     * @return
     */
    Integer delete(String openSchoolId);

    /**
     * 增加
     * @param openSchool
     * @return
     */
    Integer insert(OpenSchool openSchool);

}
