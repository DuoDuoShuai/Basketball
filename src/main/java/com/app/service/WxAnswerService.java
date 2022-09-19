package com.app.service;/**
 * @author 徐晓瑞
 * @create 2022/9/5 16:15
 * @describe
 */

import com.app.dto.WxAllDto;
import com.yjy.dto.LayUiDto;
import com.yjy.model.Ansewr;
import com.yjy.vo.JsonPageResult;

/**
 * @author 徐晓瑞
 * @date 2022/9/5 16:15
 * @describe:
 */

public interface WxAnswerService {
    /**
     * 问题信息展示
     * @param wxAllDto
     * @return
     */
    JsonPageResult list(WxAllDto wxAllDto);

}
