package com.app.mapper;

import com.app.dto.WxAllDto;
import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenStyle;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 任凭
 * @create 2022/9/17 12:10
 * @describe TODO
 */

@Repository
public interface WxOpenStyleMapper {

    /**
     * 公共风采信息展示
     * @param wxAllDto
     * @return
     */
    List<OpenStyle> listOpenStyle(WxAllDto wxAllDto);

    /**
     * 列表数据总条数
     * @param wxAllDto
     * @return
     */
    Integer count(WxAllDto wxAllDto);

    /**
     * 获取单个OpenStyle对象，根据Id查询
     *
     * @param styleId
     * @return
     */
    OpenStyle loadOpenStyle(String styleId);
}
