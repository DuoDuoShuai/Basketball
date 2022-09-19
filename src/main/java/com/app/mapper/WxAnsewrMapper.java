package com.app.mapper;

import com.app.dto.WxAllDto;
import com.yjy.dto.LayUiDto;
import com.yjy.model.Ansewr;

import java.util.List;

/**
 * @author 徐晓瑞
 * @create 2022/9/5 15:34
 * @describe
 */

public interface WxAnsewrMapper {
    /**
     * 查询全部回答
     * @param wxAllDto
     * @return
     */
    List<Ansewr> list(WxAllDto wxAllDto);

    /**
     * 列表总数
     * @param wxAllDto
     * @return
     */
    Integer count(WxAllDto wxAllDto);

}
