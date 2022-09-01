package com.yjy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/30
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {
    /**
     * 校区id
     */
    private String schoolId;
    /**
     *校区名称
     */
    private String schoolName;
    /**
     * 描述
     */
    private String schoolDescribe;
    /**
     * 电话
     */
    private String phone;
    /**
     * 地址
     */
    private String address;
    /**
     * 是否删除（0-否，1-是）
     */
    private Boolean idDelete;
    /**
     *
     * 创建时间
     */
    private Long createTime;
    /**
     * 修改时间
     */
    private Long updateTime;
}
