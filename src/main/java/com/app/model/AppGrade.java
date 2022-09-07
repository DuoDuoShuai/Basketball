package com.app.model;

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
public class AppGrade {
    /**
     * 班级id
     */
    private String gradeId;
    /**
     * 班级姓名
     */
    private String gradeName;
    /**
     * 教练名称
     */
    private String teacherName;
    /**
     * 上课时间
     */
    private String gradeTime;
    /**
     * 班级头像
     */
    private String photo;
    /**
     * 班级介绍
     */
    private String gradeDescribe;
    /**
     * 班级状态（1-已开班，2-已结束,3-未开班）
     */
    private Integer gradeState;
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
     * 修改时间
     */
    private Long updateTime;
    /**
     * 班级总人数
     */
    private Integer count;
}
