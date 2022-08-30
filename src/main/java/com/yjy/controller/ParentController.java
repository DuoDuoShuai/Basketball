package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Parent;
import com.yjy.service.ParentService;
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
 * @describe: TODO
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
     * 新增
     * @param parent
     * @param img
     * @return
     * @throws IOException
     */
    @RequestMapping("insertParent")
    public JsonResult insertParent(Parent parent, MultipartFile img) throws IOException {
        JsonResult success = null;
        if (img != null) {
            // 设置图片路径
            String oldname = img.getOriginalFilename();
            String filepath = "D:\\学习笔记\\9.16笔记\\basketball\\src\\main\\resources\\static\\images\\"+oldname;
            // 转存图片
            img.transferTo(new File(filepath));
            parent.setParentPhoto(oldname);
            parent.setParentId(UUID.randomUUID().toString());
            Date currentTime=new Date(System.currentTimeMillis());
            parent.setParentRegtime(currentTime.getTime());
            Integer insert = parentService.insertParent(parent);
            success = JsonResult.success(insert);
        }
        return success;
    }
}
