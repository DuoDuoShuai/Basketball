package com.app.controller;

import com.app.service.impl.WxFileServiceImpl;
import com.app.vo.WxJsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/15
 * @Description:
 */
@Controller
@RequestMapping("wx_file")
public class WxFileController {
    @Autowired
    private WxFileServiceImpl wxFileService;
    @RequestMapping("upload")
    @ResponseBody
    public WxJsonResult upload(MultipartFile file){
        String img = wxFileService.uploadFile(file);
        return WxJsonResult.success(img);
    }
}
