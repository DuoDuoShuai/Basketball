package com.yjy.dto;

import com.yjy.vo.JsonResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/30
 * @Description:
 */
@Data
@NoArgsConstructor
public class FileDto {
    private static final long serialVersionUID = 5172649115384573373L;
    /**
     * 页面接收的新增对象
     */
    private Object data;
    /**
     * 文件上传img
     */
    private MultipartFile img;
    public FileDto(Object data,MultipartFile img){
        try {
            if(img!=null){
                //设置图片路径
                String filename=img.getOriginalFilename();
                String filepath="D:\\upload\\"+filename;
                //转存文件
                img.transferTo(new File(filepath));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
