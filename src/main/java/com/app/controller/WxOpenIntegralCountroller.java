package com.app.controller;

import com.app.dto.WxAllDto;
import com.app.service.impl.WxOpenIntegralServiceImpl;
import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenIntegral;
import com.yjy.service.impl.OpenIntegralServiceImpl;
import com.yjy.vo.JsonPageResult;
import com.yjy.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 任凭
 * @create 2022/9/6 01:49
 * @describe TODO
 */

@RestController
@RequestMapping("OpenIntegral")
public class WxOpenIntegralCountroller {

    @Autowired
    private WxOpenIntegralServiceImpl wxOpenIntegralService;

    /**
     * 积分渠道全查询列表
     *
     * @param wxAllDto
     * @return map
     */
    @RequestMapping("list")
    public JsonPageResult listOpenRotation(WxAllDto wxAllDto) {
        JsonPageResult map = wxOpenIntegralService.listOpenIntegral(wxAllDto);
        return map;
    }
}

