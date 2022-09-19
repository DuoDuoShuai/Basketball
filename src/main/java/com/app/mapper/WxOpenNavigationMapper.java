package com.app.mapper;

import com.app.dto.WxAllDto;
import com.yjy.dto.OpenDto;
import com.yjy.model.Navigation;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/5
 * @Description:
 */
@Repository
public interface WxOpenNavigationMapper {
    /**
     * 列表+查询
     * @param wxAllDto
     * @return
     */
    List<Navigation> list(WxAllDto wxAllDto);
    /**
     * 列表总数
     * @param dto
     * @return
     */
    Integer count(WxAllDto wxAllDto);

}
