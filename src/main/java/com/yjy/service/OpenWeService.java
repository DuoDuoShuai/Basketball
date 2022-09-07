package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenWe;
import com.yjy.vo.JsonPageResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 任凭
 * @create 2022/9/7 00:43
 * @describe TODO
 */

public interface OpenWeService {

    /**
     * 关于我们数据全查询
     *
     * @param dto
     * @return
     */
    JsonPageResult listOpenWe(LayUiDto dto);

    /**
     * 获取单个OpenWe对象，根据Id查询
     *
     * @param weId
     * @return 一个轮播图对象
     */
    OpenWe loadOpenWe(String weId);

    /**
     * 增加
     *
     * @param openWe
     * @param img
     * @return
     */
    Integer insertOpenWe(OpenWe openWe, MultipartFile img);

    /**
     * 删除
     *
     * @param weId
     * @return 整数i=1
     */
    Integer deleteOpenWe(String weId);

    /**
     * 批量删除
     *
     * @param openWeIds
     * @return
     */
    Integer deleteMore(String openWeIds);

    /**
     * 修改
     *
     * @param openWe
     * @param img
     * @return
     */
    Integer updateOpenWe(OpenWe openWe, MultipartFile img);
}
