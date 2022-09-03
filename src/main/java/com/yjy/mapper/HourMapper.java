package com.yjy.mapper;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Hour;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 哆哆
 * @description
 * @date 2022-09-01 14:39:00
 * @describe: TODO
 */
@Repository
public interface HourMapper {
    /**
     * 查询
     * @param dto
     * @return
     */

    public List<Hour> listHour(LayUiDto dto);

    /**
     * 总页数
     * @param dto
     * @return
     */

    public Integer count(LayUiDto dto);

}
