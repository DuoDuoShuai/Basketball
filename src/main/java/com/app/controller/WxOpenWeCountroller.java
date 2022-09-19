package com.app.controller;

import com.app.dto.WxAllDto;
import com.app.service.WxOpenWeService;
import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenWe;
import com.yjy.service.OpenWeService;
import com.yjy.vo.JsonPageResult;
import com.yjy.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author 任凭
 * @create 2022/9/7 00:55
 * @describe TODO
 */

@RestController
@RequestMapping("OpenWe")
public class WxOpenWeCountroller {

    @Autowired
    private WxOpenWeService wxOpenWeService;

    /**
     * 关于我们图片数据全查询列表
     *
     * @param wxAllDto
     * @return map
     */
    @RequestMapping("list")
    public JsonPageResult listOpenWe(WxAllDto wxAllDto) {
        JsonPageResult map = wxOpenWeService.listOpenWe(wxAllDto);
        return map;
    }
}

