package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.OpenRotationMapper;
import com.yjy.mapper.StyleMapper;
import com.yjy.model.OpenRotation;
import com.yjy.model.Style;
import com.yjy.service.OpenRotationService;
import com.yjy.service.StyleService;
import com.yjy.util.QiniuFile;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author 任凭
 * @create 2022/8/31 13:06
 * @describe TODO
 */
@Service
public class StyleServiceImpl implements StyleService {

    @Autowired
    private StyleMapper styleMapper;

    /**
     * 列表
     *
     * @param dto
     * @return 返回mapvo页面表格数据
     */
    @Override
    public JsonPageResult listStyle(LayUiDto dto) {
        Integer count = styleMapper.count(dto);
        if (count == 0) {
            return JsonPageResult.successPage();
        }
        List<Style> list = styleMapper.listStyle(dto);
        JsonPageResult mapVo = JsonPageResult.successPage(list, count);
        return mapVo;
    }

    /**
     * 详情
     *
     * @param styleId
     * @return 返回一个OpenRotation对象
     */
    @Override
    public Style loadStyle(String styleId) {
        Style style = styleMapper.loadStyle(styleId);
        return style;
    }

    /**
     * 增加
     *
     * @param style
     * @param img
     * @param video
     * @return
     */
    @Override
    public Integer insertStyle(Style style, MultipartFile img, MultipartFile video) {
        try {
            style.setStyleId(UUID.randomUUID().toString());
            Date currentTime = new Date(System.currentTimeMillis());
            style.setCreateTime(currentTime.getTime());
            style.setUpdateTime(currentTime.getTime());
            style.setPicture(QiniuFile.uploadFile(img.getBytes()));
            style.setVideo(QiniuFile.uploadFile(video.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return styleMapper.insertStyle(style);
    }

    /**
     * 删除
     *
     * @param styleId
     * @return 整数delete=1
     */
    @Override
    public Integer deleteStyle(String styleId) {
        Style style = new Style();
        style.setStyleId(styleId);
        Date currentTime = new Date(System.currentTimeMillis());
        style.setUpdateTime(currentTime.getTime());
        styleMapper.updateTime(style);
        return styleMapper.deleteStyle(style);
    }

    /**
     * 批量删除
     *
     * @param styleIds
     * @return 返回多个对象delete参数
     */
    @Override
    public Integer deleteMore(String styleIds) {
        String[] split = styleIds.split(",");
        Integer integer = 0;
        for (String s : split) {
            Style style = new Style();
            style.setStyleId(s);
            Date currentTime = new Date(System.currentTimeMillis());
            style.setUpdateTime(currentTime.getTime());
            styleMapper.updateTime(style);
            integer = styleMapper.deleteStyle(style);
        }
        return integer;
    }

}
