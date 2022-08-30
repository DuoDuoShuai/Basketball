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
@Data //自动生成get和set的方法
@AllArgsConstructor //有参构造
@NoArgsConstructor //无惨构造
public class Hour {
    private String hourId;//销课id
    private String studentName;//学员姓名
    private String courseName;//课程名称
    private String teacherName;//教练名称
    private int courseHour;//课程最初课时
    private int remainHour;//剩余课时
    private int reason;//销课原因（0-正常销课，1-误销加课)
    private String school_id;//所属校区
    private int record;//销课内容（0-课时减一，1课时加一）
    private int isShow;//是否展示（0-否，1-是）
    private BigInteger create_time;//创建时间
    private BigInteger update_time;//更新时间
}
