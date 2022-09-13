package com.yjy.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/29
 * @Description: TODO-
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    /**
     * 学员id
     */
    private String studentId;
    /**
     * 学员姓名
     */
    private String studentName;
    /**
     * 出生年月
     */
    private Long birthday;
    /**
     * 学员年龄
     */
    private String age;
    /**
     * 性别：0-男生，1-女生
     */
    private Boolean gender;
    /**
     * 学员编号
     */
    private String studentNumber;
    /**
     * 学员二维码
     */
    private String studentCode;
    /**
     * 学员头像
     */
    private String photo;
    /**
     * 校区名称
     */
    private String schoolName;
    /**
     * 是否删除（0-否，1-是）
     */
    private Boolean isDelete;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 更新时间
     */
    private Long updateTime;
    /**
     * 报名信息
     */
    private List<Enroll> enrollList = new ArrayList<>();
    /**
     * 销课记录
     */
    private List<Hour> hourList = new ArrayList<>();
    /**
     * 班级
     */
    private List<Grade> gradeList = new ArrayList<>();
}
