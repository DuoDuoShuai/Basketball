package com.app.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/15
 * @Description:
 */
public interface WxFileService {
    /**
     * 文件上传
     * @param file
     * @return
     */
    String uploadFile(MultipartFile file);
}
