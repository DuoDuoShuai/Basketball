package com.yjy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author 哆哆
 * @description
 * @date 2022-09-05 15:55:33
 * @describe: TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OpenCourse {
    /**
     * 信息课程表id
     */
    private String openId;
    /**
     * 课程名称
     */
    private String name;
    /**
     * 课程头像
     */
    private String photo;
    /**
     * 共计课时
     */
    private  Integer opencoursehour;
    /**
     * 价格
     */
    private BigDecimal openprice;
    /**
     * 课程状态（0-未开课，1-开课，2-已结束）
     */
    private int opencoursestate;
    /**
     * 课程描述
     */
    private  String opendescribe;
    /**
     * 开始时间
     */
    private  long openstartTime;
    /**
     * 结束时间
     */
    private long openendTime;
    /**
     * 购买人数
     */
    private String openpayNumber;
    /**
     * 校区
     */
    private String schoolName;
    /**
     * 上架时间
     */
    private long openshelfTime;
    /**
     * 下架上架
     */
    private long openShelfleftTime;
    /**
     * 信息类型(0-跳转，1-排序)
     */
    private  Boolean type;
    /**
     *排序（0-asc，1-desc)
     */
    private int sort;
    /**
     * 切换路径
     */
    private String  opencuturl;
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
    private long createTime;
    /**
     * 修改时间
     */
    private long updateTime;
}
