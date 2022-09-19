package com.app.service;

import com.app.dto.WxAllDto;
import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenWe;
import com.yjy.vo.JsonPageResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 任凭
 * @create 2022/9/7 00:43
 * @describe TODO
 */

public interface WxOpenWeService {

    /**
     * 关于我们数据全查询
     *
     * @param wxAllDto
     * @return
     */
    JsonPageResult listOpenWe(WxAllDto wxAllDto);

    /**
     * 获取单个OpenWe对象，根据Id查询
     *
     * @param weId
     * @return 一个轮播图对象
     */
    OpenWe loadOpenWe(String weId);

}
