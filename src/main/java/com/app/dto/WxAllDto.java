package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/6
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WxAllDto {
    private static final long serialVersionUID = 5172649115384573373L;
    /**
     * 0
     */
    private static final Integer ZERO = 0;
    /**
     * 校区名称
     */
    private String schoolName;
    /**
     * 班级编号
     */
    private String gradeId;
    /**
     * 搜索
     */
    private String search;
    /**
     * 支付方式
     */
    private String payType;
    /**
     * 报名渠道
     */
    private Boolean model;
    /**
     * 排序
     */
    private String sort;
    /**
     * 剩余时间
     */
    private String remainHour;
    /**
     * 年龄
     */
    private String age;
    /**
     * 生日
     */
    private Long birthday;
}
