package com.app.service.impl;

import com.app.dto.WxAllDto;
import com.app.mapper.WxOpenRotationMapper;
import com.app.service.WxOpenRotationService;
import com.yjy.dto.LayUiDto;
import com.yjy.mapper.OpenRotationMapper;
import com.yjy.model.OpenRotation;
import com.yjy.service.OpenRotationService;
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
public class WxOpenRotationServiceImpl implements WxOpenRotationService {

    @Autowired
    private WxOpenRotationMapper wxOpenRotationMappe;

    /**
     * 列表
     *
     * @param wxAllDto
     * @return 返回mapvo页面表格数据
     */
    @Override
    public JsonPageResult listOpenRotation(WxAllDto wxAllDto) {
        Integer count = wxOpenRotationMappe.count(wxAllDto);
        if (count == 0) {
            return JsonPageResult.successPage();
        }
        List<OpenRotation> list = wxOpenRotationMappe.listOpenRotation(wxAllDto);
        JsonPageResult mapVo = JsonPageResult.successPage(list, count);
        return mapVo;
    }

    /**
     * 详情
     *
     * @param rotationId
     * @return 返回一个OpenRotation对象
     */
    @Override
    public OpenRotation loadOpenRotation(String rotationId) {
        OpenRotation openRotation = wxOpenRotationMappe.loadOpenRotation(rotationId);
        return openRotation;
    }

}
