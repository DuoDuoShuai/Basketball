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
@Data //自动生成get和set方法
@AllArgsConstructor//有参构造
@NoArgsConstructor//无参构造
public class Course {
    private String courseId;//课程id
    private String courseName;//课程名字
    private String photo;//课程图片
    private int courseHour;//课程课时
    private int isShaky;//是否活动课程(0-否，1-是)
    private String courseCode;//二维码
    private BigDecimal price;//价格
    private int courseState;//课程状态（0-未开课，1-开课，2-已结束）
    private String course_describe;//课程描述
    private BigInteger startTime;//开课时间
    private BigInteger endTime;//结束时间
    private String payNumber;//购买人数
    private String schoolId;//校区id
    private BigInteger shelfTime;//上架上架
    private BigInteger shelfLeftTime;//下架上架
    private  int isShow;//是否上架(0-否，1-是)
    private  int isDelete;//是否删除
    private BigInteger create_time;//创建时间
    private BigInteger update_time;//更新时间
}
