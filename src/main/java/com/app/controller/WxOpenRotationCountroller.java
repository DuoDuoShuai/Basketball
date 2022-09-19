package com.app.controller;

import com.app.dto.WxAllDto;
import com.app.service.WxOpenRotationService;
import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenRotation;
import com.yjy.service.OpenRotationService;
import com.yjy.vo.JsonPageResult;
import com.yjy.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author 任凭
 * @create 2022/8/31 13:12
 * @describe TODO
 */

@RestController
@RequestMapping("OpenRotation")
public class WxOpenRotationCountroller {

    @Autowired
    private WxOpenRotationService wxOpenRotationService;

    /**
     * 轮播图数据全查询列表
     *
     * @param wxAllDto
     * @return map
     */
    @RequestMapping("list")
    public JsonPageResult listOpenRotation(WxAllDto wxAllDto) {
        JsonPageResult map = wxOpenRotationService.listOpenRotation(wxAllDto);
        return map;
    }
    
}

