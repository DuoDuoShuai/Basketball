package com.app.service.impl;

import com.app.mapper.WxParentMapper;
import com.app.service.WxParentService;
import com.yjy.model.Parent;
import com.yjy.model.Teacher;
import com.yjy.util.QiniuFile;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Date;

/**
 * @author 徐晓瑞
 * @date 2022/9/15 9:49
 * @describe:
 */

@Service
public class WxParentServiceImpl implements WxParentService {

    @Resource
    private WxParentMapper wxParentMapper;

    /**
     * 根据家长姓名查询家长基本信息
     * @param name
     * @return
     */
    @Override
    public Parent loadParent(String name) {
        return wxParentMapper.loadParent(name);
    }

    /**
     * 家长修改基本信息
     * @param parent
     * @return
     */
    @Override
    public Integer updateParentById(Parent parent, MultipartFile img) {
        try {
            Date currentTime=new Date(System.currentTimeMillis());
            parent.setUpdateTime(currentTime.getTime());
            if (img != null){
                parent.setParentPhoto(QiniuFile.uploadFile(img.getBytes()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wxParentMapper.updateParentById(parent);
    }
}
