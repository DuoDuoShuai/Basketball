package com.app.service;

import com.app.dto.WxAllDto;
import com.yjy.dto.LayUiDto;
import com.yjy.model.Problem;
import com.yjy.vo.JsonPageResult;

/**
 * @author 徐晓瑞
 * @create 2022/9/5 16:14
 * @describe
 */
public interface WxProblemService {
    /**
     * 问题信息展示
     * @param wxAllDto
     * @return
     */
    JsonPageResult list(WxAllDto wxAllDto);

}
