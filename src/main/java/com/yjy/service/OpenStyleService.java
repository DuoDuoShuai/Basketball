package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenRotation;
import com.yjy.model.OpenStyle;
import com.yjy.model.Style;
import com.yjy.vo.JsonPageResult;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 任凭
 * @create 2022/8/30 14:30
 * @describe TODO
 */
@Repository
public interface OpenStyleService {
    /**
     * 列表
     * @param dto
     * @return 页面表格数据
     */
    JsonPageResult listOpenStyle(LayUiDto dto);
    /**
     * 获取单个OpenStyle对象，根据Id查询
     *
     * @param styleId
     * @return 一个公共风采
     */
    OpenStyle loadOpenStyle(String styleId);

    /**
     * 增加
     * @param openStyle
     * @param img
     * @param video
     * @return
     */
    Integer insertOpenStyle(OpenStyle openStyle, MultipartFile img, MultipartFile video);

    /**
     * 删除
     *
     * @param styleId
     * @return 整数i=1
     */
    Integer deleteOpenStyle(String styleId);

    /**
     * 批量删除
     *
     * @param openStyleIds
     * @return
     */
    Integer deleteMore(String openStyleIds);

    /**
     * 修改
     * @param openStyle
     * @param img
     * @param video
     * @return
     */
    Integer updateOpenStyle(OpenStyle openStyle, MultipartFile img,MultipartFile video);
}
