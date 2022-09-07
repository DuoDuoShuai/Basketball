package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Style;
import com.yjy.service.StyleService;
import com.yjy.vo.JsonPageResult;
import com.yjy.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author 任凭
 * @create 2022/9/7 15:09
 * @describe TODO
 */

@RestController
@RequestMapping("Style")
public class StyleCountroller {

    @Autowired
    private StyleService styleService;

    /**
     * 风采数据全查询列表
     *
     * @param dto
     * @return map
     */
    @RequestMapping("list")
    public JsonPageResult listStyle(LayUiDto dto) {
        JsonPageResult map = styleService.listStyle(dto);
        return map;
    }

    /**
     * 上传风采数据
     *
     * @param style
     * @param img
     * @return 返回添加是否成功参数 success
     * @throws IOException
     */
    @RequestMapping("insert")
    public JsonResult insertOpenRotation(Style style, MultipartFile img, MultipartFile video) {
        Integer insert = styleService.insertStyle(style, img, video);
        return JsonResult.success(insert);
    }

    /**
     * 批量删除轮播图数据
     *
     * @param str
     * @return
     */
    @RequestMapping("deleteMore")
    public JsonResult deleteMore(String str) {
        Integer deleteMore = styleService.deleteMore(str);
        return JsonResult.success(deleteMore);
    }

    /**
     * 删除单条轮播图数据
     *
     * @param styleId
     * @return
     */
    @RequestMapping("delete")
    public JsonResult deleteStyle(String styleId) {
        Integer delete = styleService.deleteStyle(styleId);
        return JsonResult.success(delete);
    }

}

