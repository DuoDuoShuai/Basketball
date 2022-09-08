package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.OpenStyleMapper;
import com.yjy.model.OpenRotation;
import com.yjy.model.OpenStyle;
import com.yjy.service.OpenStyleService;
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
 * @create 2022/8/30 15:39
 * @describe TODO
 */
@Service
public class OpenStyleServiceImpl implements OpenStyleService {

    @Autowired
    private OpenStyleMapper openStyleMapper;

    /**
     * 列表
     *
     * @param dto
     * @return 返回mapvo页面表格数据
     */
    @Override
    public JsonPageResult listOpenStyle(LayUiDto dto) {
        Integer count = openStyleMapper.count(dto);
        if (count == 0) {
            return JsonPageResult.successPage();
        }
        List<OpenStyle> list = openStyleMapper.listOpenStyle(dto);
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
    public OpenStyle loadOpenStyle(String styleId) {
        OpenStyle openStyle = openStyleMapper.loadOpenStyle(styleId);
        return openStyle;
    }

    /**
     * 增加
     *
     * @param openStyle
     * @param img
     * @param movie
     * @return
     */
    @Override
    public Integer insertOpenStyle(OpenStyle openStyle, MultipartFile img, MultipartFile movie) {
        try {
            openStyle.setStyleId(UUID.randomUUID().toString());
            Date currentTime = new Date(System.currentTimeMillis());
            openStyle.setCreateTime(currentTime.getTime());
            openStyle.setUpdateTime(currentTime.getTime());
            openStyle.setPicture(QiniuFile.uploadFile(img.getBytes()));
            openStyle.setVideo(QiniuFile.uploadFile(movie.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return openStyleMapper.insertOpenStyle(openStyle);
    }

    /**
     * 删除
     *
     * @param styleId
     * @return 整数delete=1
     */
    @Override
    public Integer deleteOpenStyle(String styleId) {
        OpenStyle openStyle = new OpenStyle();
        openStyle.setStyleId(styleId);
        Date currentTime = new Date(System.currentTimeMillis());
        openStyle.setUpdateTime(currentTime.getTime());
        openStyleMapper.updateTime(openStyle);
        return openStyleMapper.deleteOpenStyle(openStyle);
    }

    /**
     * 批量删除
     *
     * @param openStyleIds
     * @return 返回多个对象delete参数
     */
    @Override
    public Integer deleteMore(String openStyleIds) {
        String[] split = openStyleIds.split(",");
        Integer integer = 0;
        for (String s : split) {
            OpenStyle openStyle = new OpenStyle();
            openStyle.setStyleId(s);
            Date currentTime = new Date(System.currentTimeMillis());
            openStyle.setUpdateTime(currentTime.getTime());
            openStyleMapper.updateTime(openStyle);
            integer = openStyleMapper.deleteOpenStyle(openStyle);
        }
        return integer;
    }

    /**
     * 修改
     *
     * @param openStyle
     * @param img
     * @param movie
     * @return
     */
    @Override
    public Integer updateOpenStyle(OpenStyle openStyle, MultipartFile img, MultipartFile movie) {
        try {
            Date currentTime = new Date(System.currentTimeMillis());
            openStyle.setUpdateTime(currentTime.getTime());
            if (img != null) {
                openStyle.setPicture(QiniuFile.uploadFile(img.getBytes()));
            }
            if (movie != null) {
                openStyle.setVideo(QiniuFile.uploadFile(movie.getBytes()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return openStyleMapper.updateOpenStyle(openStyle);
    }
}
