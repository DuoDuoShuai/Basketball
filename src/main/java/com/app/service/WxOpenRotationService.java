package com.app.service;

import com.app.dto.WxAllDto;
import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenRotation;
import com.yjy.vo.JsonPageResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 任凭
 * @create 2022/8/31 13:04
 * @describe TODO
 */
public interface WxOpenRotationService {

    /**
     * 轮播图数据全查询
     *
     * @param wxAllDto
     * @return
     */
    JsonPageResult listOpenRotation(WxAllDto wxAllDto);

    /**
     * 获取单个OpenRotation对象，根据Id查询
     *
     * @param rotationId
     * @return 一个轮播图对象
     */
    OpenRotation loadOpenRotation(String rotationId);

}
