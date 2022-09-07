package com.yjy.controller;

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
public class OpenWeCountroller {

    @Autowired
    private OpenWeService openWeService;

    /**
     * 关于我们图片数据全查询列表
     *
     * @param dto
     * @return map
     */
    @RequestMapping("list")
    public JsonPageResult listOpenWe(LayUiDto dto) {
        JsonPageResult map = openWeService.listOpenWe(dto);
        return map;
    }

    /**
     * 新增关于我们图
     *
     * @param openWe
     * @param img
     * @return 返回添加是否成功参数 success
     * @throws IOException
     */
    @RequestMapping("insert")
    public JsonResult insertOpenWe(OpenWe openWe, MultipartFile img) {
        Integer insert = openWeService.insertOpenWe(openWe, img);
        return JsonResult.success(insert);
    }

    /**
     * 批量删除关于我们图数据
     *
     * @param str
     * @return
     */
    @RequestMapping("deleteMore")
    public JsonResult deleteOpenWeMore(String str) {
        Integer deleteMore = openWeService.deleteMore(str);
        return JsonResult.success(deleteMore);
    }

    /**
     * 删除单条轮播图数据
     *
     * @param weId
     * @return
     */
    @RequestMapping("delete")
    public JsonResult deleteOpenWe(String weId) {
        Integer delete = openWeService.deleteOpenWe(weId);
        return JsonResult.success(delete);
    }

    /**
     * 修改关于我们图详细信息
     *
     * @param openWe
     * @param img
     * @return
     * @throws IOException
     */
    @RequestMapping("update")
    public JsonResult updateOpenWe(OpenWe openWe, MultipartFile img) {
        Integer update = openWeService.updateOpenWe(openWe, img);
        return JsonResult.success(update);
    }
}

