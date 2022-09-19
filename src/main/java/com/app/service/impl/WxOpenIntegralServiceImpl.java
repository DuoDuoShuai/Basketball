package com.app.service.impl;

import com.app.dto.WxAllDto;
import com.app.mapper.WxOpenIntegralMapper;
import com.app.service.WxOpenIntegralService;
import com.yjy.dto.LayUiDto;
import com.yjy.mapper.OpenIntegralMapper;
import com.yjy.model.OpenIntegral;
import com.yjy.service.OpenIntegralService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author 任凭
 * @create 2022/9/6 01:25
 * @describe TODO
 */

@Service
public class WxOpenIntegralServiceImpl implements WxOpenIntegralService {

    @Autowired
    private WxOpenIntegralMapper wxOpenIntegralMapper;

    /**
     * 列表
     *
     * @param wxAllDto
     * @return 返回mapvo页面表格数据
     */
    @Override
    public JsonPageResult listOpenIntegral(WxAllDto wxAllDto) {
        Integer count = wxOpenIntegralMapper.count(wxAllDto);
        if (count == 0) {
            return JsonPageResult.successPage();
        }
        List<OpenIntegral> list = wxOpenIntegralMapper.listOpenIntegral(wxAllDto);
        JsonPageResult mapVo = JsonPageResult.successPage(list, count);
        return mapVo;
    }

    /**
     * 详情
     *
     * @param integralId
     * @return OpenIntegral
     */
    @Override
    public OpenIntegral loadOpenIntegral(String integralId) {
        OpenIntegral openIntegral = wxOpenIntegralMapper.loadOpenIntegral(integralId);
        return openIntegral;
    }

}
