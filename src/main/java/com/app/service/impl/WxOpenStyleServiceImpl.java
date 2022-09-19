package com.app.service.impl;

import com.app.dto.WxAllDto;
import com.app.mapper.WxOpenStyleMapper;
import com.app.service.WxOpenStyleService;
import com.yjy.model.OpenStyle;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


/**
 * @author 任凭
 * @create 2022/8/30 15:39
 * @describe TODO
 */
@Service
public class WxOpenStyleServiceImpl implements WxOpenStyleService {

    @Autowired
    private WxOpenStyleMapper WxopenStyleMapper;

    /**
     * 列表
     *
     * @param wxAllDto
     * @return 返回mapvo页面表格数据
     */
    @Override
    public JsonPageResult listOpenStyle(WxAllDto wxAllDto) {
        Integer count = WxopenStyleMapper.count(wxAllDto);
        if (count == 0) {
            return JsonPageResult.successPage();
        }
        List<OpenStyle> list = WxopenStyleMapper.listOpenStyle(wxAllDto);
        JsonPageResult mapVo = JsonPageResult.successPage(list, count);
        return mapVo;
    }

    /**
     * 详情
     *
     * @param styleId
     * @return 返回一个OpenRotation对象
     */
    @Override
    public OpenStyle loadOpenStyle(String styleId) {
        OpenStyle openStyle = WxopenStyleMapper.loadOpenStyle(styleId);
        return openStyle;
    }

}
