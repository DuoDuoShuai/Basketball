package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenRotation;
import com.yjy.model.OpenStyle;
import com.yjy.service.OpenStyleService;
import com.yjy.vo.JsonPageResult;
import com.yjy.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author 任凭
 * @create 2022/8/30 15:37
 * @describe TODO
 */
@RestController
@RequestMapping("OpenStyle")
public class OpenStyleController {

    @Autowired
    private OpenStyleService openStyleService;

    /**
     * 公共风采数据全查询列表
     *
     * @param dto
     * @return map
     */
    @RequestMapping("list")
    public JsonPageResult listOpenStyle(LayUiDto dto) {
        JsonPageResult map = openStyleService.listOpenStyle(dto);
        return map;
    }

    /**
     * 新增公共风采
     * @param openStyle
     * @param img
     * @param movice
     * @return
     */
    @RequestMapping("insert")
    public JsonResult insertOpenStyle(OpenStyle openStyle, MultipartFile img, MultipartFile movice) {
        Integer insert = openStyleService.insertOpenStyle(openStyle, img,movice);
        return JsonResult.success(insert);
    }

    /**
     * 批量删除轮播图数据
     *
     * @param str
     * @return
     */
    @RequestMapping("deleteMore")
    public JsonResult deleteOpenStyleMore(String str) {
        Integer deleteMore = openStyleService.deleteMore(str);
        return JsonResult.success(deleteMore);
    }

    /**
     * 删除单条风采数据
     *
     * @param styleId
     * @return
     */
    @RequestMapping("delete")
    public JsonResult deleteOpenStyle(String styleId) {
        Integer delete = openStyleService.deleteOpenStyle(styleId);
        return JsonResult.success(delete);
    }

    /**
     * 编辑公共风采
     * @param openStyle
     * @param img
     * @param video
     * @return
     */
    @RequestMapping("update")
    public JsonResult updateOpenStyle(OpenStyle openStyle, MultipartFile img,MultipartFile video) {
        Integer update = openStyleService.updateOpenStyle(openStyle, img,video);
        return JsonResult.success(update);
    }
}
