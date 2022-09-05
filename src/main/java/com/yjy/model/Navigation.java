package com.yjy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/5
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Navigation {
    /**
     * 导航栏id
     */
    private String openNavigationId;
    /**
     * 导航栏名称
     */
    private String navigationName;
    /**
     * 信息类型(0-跳转，1-排序)
     */
    private Boolean navigationType;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 切换路径
     */
    private String cutUrl;
    /**
     * 是否展示（0-否，1-是）
     */
    private Boolean pure;
    /**
     * 是否删除（0-否，1-是）
     */
    private Boolean isDelete;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 修改时间
     */
    private Long updateTime;
}
