package com.yjy.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/5
 * @Description:
 */
public interface FileService {
    /**
     * 文件上传
     * @param file
     * @return
     */
    String uploadFile(MultipartFile file);
}
