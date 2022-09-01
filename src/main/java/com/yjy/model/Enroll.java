package com.yjy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 徐晓瑞
 * @date 2022/9/1 10:01
 * @describe:
 */

@Data //自动生成get和set方法
@AllArgsConstructor//有参构造
@NoArgsConstructor//无参构造
public class Enroll {

    /**
     *  报名id
     */
    private String enrollId;

    /**
     *  校区名称
     */
    private String schoolNme;

    /**
     *  学生姓名
     */
    private String studentName;

    /**
     *  支付方式
     */
    private String payType;

    /**
     *  支付渠道（线上或线下）
     */
    private Boolean model;

    /**
     *  课程名称
     */
    private String courseName;

    /**
     *  是否展示
     */
    private Boolean isShow;

    /**
     *  创建时间
     */
    private Long creatTime;
}
