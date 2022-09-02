package com.yjy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * @author 哆哆
 * @description TODO
 * @date 2022-08-29 13:58:19
 * 销课
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hour {
    /**
     * 销课id
     */
    private String hourId;
    /**
     * 学员姓名
     */
    private String studentName;
    /**
     * 课程名称
     */
    private String courseName;
    /**
     * 教练名称
     */
    private String teacherName;
    /**
     * 课程最初课时
     */
    private int courseHour;
    /**
     * 剩余课时
     */
    private int remainHour;
    /**
     * 销课原因（0-正常销课，1-误销加课)
     */
    private int reason;
    /**
     * 所属校区
     */
    private String schoolName;
    /**
     * 销课内容（0-课时减一，1课时加一）
     */
    private int record;
    /**
     * 是否展示（0-否，1-是）
     */
    private int pure;
    /**
     * 创建时间
     */
    private long createTime;
    /**
     * 更新时间
     */
    private long updateTime;
}
