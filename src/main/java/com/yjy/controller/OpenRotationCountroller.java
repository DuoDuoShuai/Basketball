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
    public JsonResult insertOpenRotation(OpenRotation openRotation, MultipartFile img) throws IOException {
        JsonResult success = null;
        if (img != null) {
//            设置图片路径
            String oldname = img.getOriginalFilename();
            String filepath = "D:\\MavenProject\\basketball\\src\\main\\resources\\static\\images" + oldname;
//            转存图片
            img.transferTo(new File(filepath));
            openRotation.setRotationName(oldname);
            openRotation.setRotationId(UUID.randomUUID().toString());
            Date currentTime = new Date(System.currentTimeMillis());
            openRotation.setCreatTime(currentTime.getTime());
            Integer insert = openRotationService.insertOpenRotation(openRotation);
            success = JsonResult.success(insert);
        }
        return success;
    }

    /**
     * 批量删除轮播图数据
     *
     * @param openRotationIds
     * @return
     */
    @RequestMapping("deleteMore")
    public JsonResult deleteOpenRotationMore(String openRotationIds) {
        Integer integer = openRotationService.deleteMore(openRotationIds);
        return JsonResult.success(integer);
    }

    /**
     * 删除单条轮播图数据
     *
     * @param openRotationId
     * @return
     */
    @RequestMapping("delete")
    public JsonResult deleteOpenRotation(String openRotationId) {
        Integer integer = openRotationService.deleteOpenRotation(openRotationId);
        return JsonResult.success(integer);
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
    public JsonResult updateOpenRotation(OpenRotation openRotation, MultipartFile img) throws IOException {
        JsonResult success = null;
        if (img != null) {
            // 设置图片路径
            String oldname = img.getOriginalFilename();
            String filepath = "D:\\MavenProject\\basketball\\src\\main\\resources\\static\\images" + oldname;
            // 转存图片
            img.transferTo(new File(filepath));
            openRotation.setRotationName(oldname);
            Date currentTime = new Date(System.currentTimeMillis());
            openRotation.setUpdateTime(currentTime.getTime());
            Integer update = openRotationService.updateOpenRotation(openRotation);
            success = JsonResult.success(update);
        }
        return success;
    }

}

