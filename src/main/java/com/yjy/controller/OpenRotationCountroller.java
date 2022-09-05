package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenRotation;
import com.yjy.model.Parent;
import com.yjy.service.OpenRotationService;
import com.yjy.vo.JsonPageResult;
import com.yjy.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

/**
 * @author 任凭
 * @create 2022/8/31 13:12
 * @describe TODO
 */

@RestController
@RequestMapping("OpenRotation")
public class OpenRotationCountroller {

    @Autowired
    private OpenRotationService openRotationService;

    /**
     * 轮播图数据全查询列表
     *
     * @param dto
     * @return map
     */
    @RequestMapping("list")
    public JsonPageResult listOpenRotation(LayUiDto dto) {
        JsonPageResult map = openRotationService.listOpenRotation(dto);
        return map;
    }

    /**
     * 新增轮播图
     *
     * @param openRotation
     * @param img
     * @return 返回添加是否成功参数 success
     * @throws IOException
     */
    @RequestMapping("insert")
    public JsonResult insertOpenRotation(OpenRotation openRotation, MultipartFile img){
        Integer insert = openRotationService.insertOpenRotation(openRotation, img);
        return JsonResult.success(insert);
    }

    /**
     * 批量删除轮播图数据
     *
     * @param str
     * @return
     */
    @RequestMapping("deleteMore")
    public JsonResult deleteOpenRotationMore(String str) {
        Integer deleteMore = openRotationService.deleteMore(str);
        return JsonResult.success(deleteMore);
    }

    /**
     * 删除单条轮播图数据
     *
     * @param rotationId
     * @return
     */
    @RequestMapping("delete")
    public JsonResult deleteOpenRotation(String rotationId) {
        Integer delete = openRotationService.deleteOpenRotation(rotationId);
        return JsonResult.success(delete);
    }

    /**
     * 修改轮播图详细信息
     *
     * @param openRotation
     * @param img
     * @return
     * @throws IOException
     */
    @RequestMapping("update")
    public JsonResult updateOpenRotation(OpenRotation openRotation, MultipartFile img){
        Integer update = openRotationService.updateOpenRotation(openRotation,img);
        return JsonResult.success(update);
    }
}

