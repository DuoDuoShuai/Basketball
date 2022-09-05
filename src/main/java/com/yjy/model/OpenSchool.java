package com.yjy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/4
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OpenSchool {
    /**
     * 公共校区id
     */
    private String openSchoolId;
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
     * 信息类型(1-跳转，2-排序)
     */
    private Integer schoolType;
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
