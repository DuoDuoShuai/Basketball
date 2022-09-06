package com.yjy.service;/**
 * @author 徐晓瑞
 * @create 2022/9/5 16:15
 * @describe
 */

import com.yjy.dto.LayUiDto;
import com.yjy.model.Ansewr;
import com.yjy.model.Problem;
import com.yjy.vo.JsonPageResult;

/**
 * @author 徐晓瑞
 * @date 2022/9/5 16:15
 * @describe:
 */

public interface AnswerService {
    /**
     * 问题信息展示
     * @param dto
     * @return
     */
    JsonPageResult list(LayUiDto dto);

    /**
     * 添加
     * @param ansewr
     * @return
     */
    Integer insertAnswer(Ansewr ansewr);

    /**
     * 批量删除问题
     * @param str
     * @return
     */
    Integer deleteAnswerMore(String str);

    /**
     * 删除问题
     * @param ansewrId
     * @return
     */
    Integer deleteAnswer(String ansewrId);

    /**
     * 修改
     * @param ansewr
     * @return
     */
    Integer updateAnswer(Ansewr ansewr);
}
