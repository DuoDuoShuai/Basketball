package com.app.mapper;

import com.app.dto.WxAllDto;
import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenWe;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 任凭
 * @create 2022/8/31 12:24
 * @describe TODO
 */

@Repository
public interface WxOpenWeMapper {

    /**
     * 关于我们数据列表
     *
     * @param wxAllDto
     * @return
     */
    List<OpenWe> listOpenWe(WxAllDto wxAllDto);

    /**
     * 列表总数
     *
     * @param wxAllDto
     * @return
     */
    Integer count(WxAllDto wxAllDto);

    /**
     * 获取单个OpenRotation对象，根据Id查询
     *
     * @param weId
     * @return
     */
    OpenWe loadOpenWe(String weId);
}
