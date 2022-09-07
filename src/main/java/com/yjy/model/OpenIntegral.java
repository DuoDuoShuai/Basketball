package com.yjy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 任凭
 * @create 2022/9/5 23:09
 * @describe TODO
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OpenIntegral {

    /**
     * 积分id
     */
    private String integralId;
    /**
     * 积分获取渠道
     */
    private String integralWay;
    /**
     * 信息类型(0-跳转，1-排序)
     */
    private boolean integralType;
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
    private boolean pure;
    /**
     * 是否删除（0-否，1-是）
     */
    private boolean isDelete;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 修改时间
     */
    private Long updateTime;

}
