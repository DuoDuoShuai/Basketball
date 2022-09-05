package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.service.OpenStyleService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 任凭
 * @create 2022/8/30 15:37
 * @describe TODO
 */
@Controller
@RequestMapping("openStyle")
public class OpenStyleController {

    @Autowired
    private OpenStyleService service;

    /**
     * 列表
     * @param dto
     * @return
     */
    @RequestMapping("listOpenStyle")
    public JsonPageResult listOpenStyle(LayUiDto dto){
        JsonPageResult map = service.listOpenStyle(dto);
        return map;
    }
}
