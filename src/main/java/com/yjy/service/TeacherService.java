package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.vo.MapVo;

/**
 * @author 徐晓瑞
 * @date 2022/8/29 17:14
 * @describe: TODO
 */
public interface TeacherService {
    /**
     * 教练信息查询全部
     * @param dto
     * @return
     */
    MapVo list(LayUiDto dto);
}
