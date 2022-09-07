package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.OpenWeMapper;
import com.yjy.model.OpenWe;
import com.yjy.service.OpenWeService;
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
public class OpenWeServiceImpl implements OpenWeService {

    @Autowired
    private OpenWeMapper openWeMapper;

    /**
     * 列表
     *
     * @param dto
     * @return 返回mapvo页面表格数据
     */
    @Override
    public JsonPageResult listOpenWe(LayUiDto dto) {
        Integer count = openWeMapper.count(dto);
        if (count == 0) {
            return JsonPageResult.successPage();
        }
        List<OpenWe> list = openWeMapper.listOpenWe(dto);
        JsonPageResult mapVo = JsonPageResult.successPage(list, count);
        return mapVo;
    }

    /**
     * 详情
     *
     * @param weId
     * @return 返回一个OpenRotation对象
     */
    @Override
    public OpenWe loadOpenWe(String weId) {
        OpenWe openWe = openWeMapper.loadOpenWe(weId);
        return openWe;
    }

    /**
     * 增加
     *
     * @param openWe
     * @return 整数num=1
     */
    @Override
    public Integer insertOpenWe(OpenWe openWe, MultipartFile img) {
        try {
            openWe.setWeId(UUID.randomUUID().toString());
            Date currentTime = new Date(System.currentTimeMillis());
            openWe.setCreateTime(currentTime.getTime());
            openWe.setUpdateTime(currentTime.getTime());
            openWe.setPhoto(QiniuFile.uploadFile(img.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return openWeMapper.insertOpenWe(openWe);
    }

    /**
     * 删除
     *
     * @param weId
     * @return 整数delete=1
     */
    @Override
    public Integer deleteOpenWe(String weId) {
        OpenWe openWe = new OpenWe();
        openWe.setWeId(weId);
        Date currentTime = new Date(System.currentTimeMillis());
        openWe.setUpdateTime(currentTime.getTime());
        openWeMapper.updateTime(openWe);
        return openWeMapper.deleteOpenWe(openWe);
    }

    /**
     * 批量删除
     *
     * @param openWeIds
     * @return 返回多个对象delete参数
     */
    @Override
    public Integer deleteMore(String openWeIds) {
        String[] split = openWeIds.split(",");
        Integer integer = 0;
        for (String s : split) {
            OpenWe openWe = new OpenWe();
            openWe.setWeId(s);
            Date currentTime = new Date(System.currentTimeMillis());
            openWe.setUpdateTime(currentTime.getTime());
            openWeMapper.updateTime(openWe);
            integer = openWeMapper.deleteOpenWe(openWe);
        }
        return integer;
    }

    /**
     * 修改
     *
     * @param openWe
     * @return 整数update=1
     */
    @Override
    public Integer updateOpenWe(OpenWe openWe, MultipartFile img) {
        try {
            Date currentTime = new Date(System.currentTimeMillis());
            openWe.setUpdateTime(currentTime.getTime());
            if (img != null) {
                openWe.setPhoto(QiniuFile.uploadFile(img.getBytes()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return openWeMapper.updateOpenWe(openWe);
    }
}
