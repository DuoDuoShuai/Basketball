package com.yjy.model;

import io.micrometer.core.instrument.step.StepCounter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * @author 徐晓瑞
 * @date 2022/8/29 16:42
 * @describe:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    /**
     * 教练id
     */
    private String teacherId;
    /**
     * 教练姓名
     */
    private String teacherName;
    /**
     * 教练密码
     */
    private String teacherPassword;
    /**
     * 手机号
     */
    private String teacherPhone;
    /**
     * 头像
     */
    private String teacherPhoto;
    /**
     * 性别
     */
    private Boolean teacherSex;
    /**
     * 是否删除
     */
    private Boolean isDelete;
    /**
     * 创建时间
     */
    private Long teacherRegtime;
    /**
     * 修改时间
     */
    private Long updateTime;
}
