package com.app.controller;

import com.app.dto.WxAllDto;
import com.app.service.WxOpenStyleService;
import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenStyle;
import com.yjy.service.OpenStyleService;
import com.yjy.vo.JsonPageResult;
import com.yjy.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 任凭
 * @create 2022/8/30 15:37
 * @describe TODO
 */
@RestController
@RequestMapping("WxOpenStyle")
public class WxOpenStyleController {

    @Autowired
    private WxOpenStyleService wxOpenStyleService;

    /**
     * 公共风采数据全查询列表
     *
     * @param wxAllDto
     * @return map
     */
    @RequestMapping("list")
    public JsonPageResult listOpenStyle(WxAllDto wxAllDto) {
        JsonPageResult map = wxOpenStyleService.listOpenStyle(wxAllDto);
        return map;
    }

}
