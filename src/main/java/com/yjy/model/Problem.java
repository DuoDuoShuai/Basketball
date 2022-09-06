package com.yjy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 徐晓瑞
 * @date 2022/9/5 15:13
 * @describe:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Problem {
    /**
     * 问题id
     */
    private String openProblemId;
    /**
     * 问题
     */
    private String problem;
    /**
     * 信息类型(0-跳转，1-排序)
     */
    private Boolean problemType;
    /**
     * 排序（1...)
     */
    private int sort;
    /**
     * 切换类型（0-翻页，1-旋转）
     */
    private Boolean cutType;
    /**
     * 切换路径
     */
    private String cutUrl;
    /**
     * 是否展示（0-否，1-是）
     */
    private Boolean isShow;
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
