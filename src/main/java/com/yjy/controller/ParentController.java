package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Parent;
import com.yjy.service.ParentService;
import com.yjy.util.QiniuFile;
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
 * @author 徐晓瑞
 * @date 2022/8/29 23:24
 * @describe:
 */

@RestController
@RequestMapping("parent")
public class ParentController {

    @Autowired
    private ParentService parentService;

    /**
     * 家长信息展示
     * @param dto
     * @return
     */
    @RequestMapping("list")
    public JsonPageResult list(LayUiDto dto){
        JsonPageResult map = parentService.list(dto);
        return map;
    }

    /**
     * 添加家长信息
     * @param parent,img
     * @return
     */
    @RequestMapping("insertParent")
    public JsonResult insertParent(Parent parent, MultipartFile img) throws IOException {
        Integer integer = parentService.insertParent(parent, img);
        return JsonResult.success(integer);
    }

    /**
     * 批量删除家长信息
     * @param str
     * @return
     */
    @RequestMapping("deleteParentMore")
    public JsonResult deleteParentMore(String str){
        Integer integer = parentService.deleteParentMore(str);
        return JsonResult.success(integer);
    }

    /**
     * 删除单条家长信息
     * @param parentId
     * @return
     */
    @RequestMapping("deleteParent")
    public JsonResult deleteParent(String parentId){
        Integer integer = parentService.deleteParent(parentId);
        return JsonResult.success(integer);
    }

    /**
     * 修改家长信息
     * @param parent
     * @return
     */
    @RequestMapping("updateParent")
    public JsonResult deleteParent(Parent parent,MultipartFile img) throws IOException {
        Integer integer = parentService.updateParent(parent, img);
        return JsonResult.success(integer);
    }
}
