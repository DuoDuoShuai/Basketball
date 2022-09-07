package com.yjy.controller;

import com.yjy.service.impl.FileServiceImpl;
import com.yjy.vo.JsonPageResult;
import com.yjy.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.lang.management.MemoryUsage;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/5
 * @Description:
 */
@Controller
@RequestMapping("file")
public class FileController {
    @Autowired
    private FileServiceImpl fileService;
    @RequestMapping("upload")
    @ResponseBody
    public JsonResult upload(MultipartFile file){
        String img = fileService.uploadFile(file);
        return JsonResult.success(img);
    }
}
