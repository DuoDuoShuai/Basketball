package com.app.mapper;

import com.app.dto.WxUpdateDto;
import org.springframework.stereotype.Repository;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/15
 * @Description:
 */
@Repository
public interface WxStyleMapper {
    /**
     * 接口-根据id修改学员的展示状态
     * @param wxUpdateDto
     * @return
     */
    Integer updateStyle(WxUpdateDto wxUpdateDto);
}
