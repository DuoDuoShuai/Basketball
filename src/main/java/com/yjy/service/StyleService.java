package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Style;
import com.yjy.vo.JsonPageResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 任凭
 * @create 2022/8/31 13:04
 * @describe TODO
 */
public interface StyleService {

    /**
     * 风采数据全查询
     *
     * @param dto
     * @return
     */
    JsonPageResult listStyle(LayUiDto dto);

    /**
     * 获取单个OpenRotation对象，根据Id查询
     *
     * @param styleId
     * @return 一个轮播图对象
     */
    Style loadStyle(String styleId);

    /**
     * 增加
     *
     * @param style
     * @param img
     * @return
     */
    Integer insertStyle(Style style, MultipartFile img,MultipartFile video);

    /**
     * 删除
     *
     * @param styleId
     * @return 整数i=1
     */
    Integer deleteStyle(String styleId);

    /**
     * 批量删除
     *
     * @param styleIds
     * @return
     */
    Integer deleteMore(String styleIds);

}
