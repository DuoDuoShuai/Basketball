package com.yjy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author 哆哆
 * @description TODO
 * @date 2022-08-29 13:34:46
 * 课程
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    /**
    *课程id
     */
    private String courseId;
    /**
     * 课程名字
     */
    private String name;
    /**
     * 课程图片
     */
    private String photo;
    /**
     * 课程课时
     */
    private int courseHour;
    /**
     * 是否活动课程(0-否，1-是)
     */
    private int isShaky;
    /**
     * 二维码
     */
    private String courseCode;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 课程状态（0-未开课，1-开课，2-已结束）
     */
    private int courseState;
    /**
     * 课程描述
     */
    private String courseDescribe;
    /**
     * 开课时间
     */
    private long startTime;
    /**
     * 结束时间
     */
    private long endTime;
    /**
     * 购买人数
     */
    private String payNumber;
    /**
     *校区id
     */
    private String schoolName;
    /**
     * 上架时间
     */
    private long shelfTime;
    /**
     * 下架时间
     */
    private long shelfLeftTime;
    /**
     * 是否上架(0-否，1-是)
     */
    private  boolean pure;
    /**
     * 是否删除
     */
    private  boolean isDelete;
    /**
     * 创建时间
     */
    private long createTime;
    /**
     * 更新时间
     */
    private long updateTime;
}
