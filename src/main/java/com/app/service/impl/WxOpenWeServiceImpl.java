package com.app.service.impl;

import com.app.dto.WxAllDto;
import com.app.mapper.WxOpenWeMapper;
import com.app.service.WxOpenWeService;
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
public class WxOpenWeServiceImpl implements WxOpenWeService {

    @Autowired
    private WxOpenWeMapper wxOpenWeMapper;

    /**
     * 列表
     *
     * @param wxAllDto
     * @return 返回mapvo页面表格数据
     */
    @Override
    public JsonPageResult listOpenWe(WxAllDto wxAllDto) {
        Integer count = wxOpenWeMapper.count(wxAllDto);
        if (count == 0) {
            return JsonPageResult.successPage();
        }
        List<OpenWe> list = wxOpenWeMapper.listOpenWe(wxAllDto);
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
        OpenWe openWe = wxOpenWeMapper.loadOpenWe(weId);
        return openWe;
    }
}
