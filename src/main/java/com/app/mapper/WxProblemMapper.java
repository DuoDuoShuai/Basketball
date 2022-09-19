package com.app.mapper;

import com.app.dto.WxAllDto;
import com.yjy.dto.LayUiDto;
import com.yjy.model.Problem;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 徐晓瑞
 * @create 2022/9/5 15:34
 * @describe
 */

@Repository
public interface WxProblemMapper {
    /**
     * 查询全部问题
     * @param wxAllDto
     * @return
     */
    List<Problem> list(WxAllDto wxAllDto);

    /**
     * 列表总数
     * @param wxAllDto
     * @return
     */
    Integer count(WxAllDto wxAllDto);

}
