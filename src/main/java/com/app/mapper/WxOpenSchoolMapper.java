package com.app.mapper;

import com.app.dto.WxAllDto;
import com.yjy.dto.OpenDto;
import com.yjy.model.OpenSchool;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/4
 * @Description:
 */
@Repository
public interface WxOpenSchoolMapper {
    /**
     * 列表+查询
     * @param wxAllDto
     * @return
     */
    List<OpenSchool> list(WxAllDto wxAllDto);
    /**
     * 列表总数
     * @param wxAllDto
     * @return
     */
    Integer count(WxAllDto wxAllDto);

}
