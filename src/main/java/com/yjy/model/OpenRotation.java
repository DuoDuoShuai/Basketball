package com.yjy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 任凭
 * @create 2022/8/31 11:03
 * @describe TODO
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OpenRotation {
    /**
     * 轮播图id
     */
    private String rotationId;
    /**
     * 校区名称
     */
    private String schoolName;
    /**
     * 轮播图
     */
    private String rotationName;
    /**
     * 信息类型(0-跳转，1-排序)
     */
    private boolean rotationType;
    /**
     * 排序（1...）
     */
    private int sort;
    /**
     * 切换路径
     */
    private String cutUrl;
    /**
     * 是否展示（0-否，1-是）
     */
    private boolean isShow;
    /**
     * 是否删除（0-否，1-是）
     */
    private boolean isDelete;
    /**
     * 创建时间
     */
    private Long creatTime;
    /**
     * 修改时间
     */
    private Long updateTime;
}
