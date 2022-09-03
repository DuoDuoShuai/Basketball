package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.vo.JsonPageResult;
import com.yjy.vo.JsonResult;

/**
 * @author 哆哆
 * @description
 * @date 2022-09-01 14:53:53
 * @describe: TODO
 */
public interface HourService {
    /**
     * 查询销课
     * @param dto
     * @return
     */

    public JsonPageResult listHour(LayUiDto dto);
}
