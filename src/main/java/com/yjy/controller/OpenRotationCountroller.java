package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.service.OpenRotationService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 任凭
 * @create 2022/8/31 13:12
 * @describe TODO
 */
@Controller
@RequestMapping("OpenRotation")
public class OpenRotationCountroller {

    @Autowired
    private OpenRotationService openRotationService;

    /**
     * 轮播图数据全查询列表
     * @param dto
     * @return map
     */
    @RequestMapping("list")
    @ResponseBody
    public JsonPageResult listOpenRotation(LayUiDto dto) {
        JsonPageResult map = openRotationService.listOpenRotation(dto);
        return map;
    }
}
