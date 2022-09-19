package com.app.service;

import com.app.dto.WxAllDto;
import com.yjy.model.OpenStyle;
import com.yjy.vo.JsonPageResult;

/**
 * @author 任凭
 * @create 2022/9/19 11:08
 * @describe TODO
 */
public interface WxOpenStyleService {

    /**
     * 列表
     * @param wxAllDto
     * @return 页面表格数据
     */
    JsonPageResult listOpenStyle(WxAllDto wxAllDto);
    /**
     * 获取单个OpenStyle对象，根据Id查询
     *
     * @param styleId
     * @return 一个公共风采
     */
    OpenStyle loadOpenStyle(String styleId);
}
