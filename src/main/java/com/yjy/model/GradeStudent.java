package com.yjy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/3
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GradeStudent {
    /**
     * 班级学员关系表id
     */
    private String id;
    /**
     * 班级id
     */
    private String gradeId;
    /**
     * 学员id
     */
    private String studentId;
    /**
     * 学员状态（0-在，1-不在）
     */
    private Boolean studentState;
    /**
     * 入班时间
     */
    private Long joinTime;
    /**
     * 离班时间
     */
    private Long leftTime;
    /**
     * 班级里面的学员
     */
    private List<Student> student=new ArrayList<>();
    public GradeStudent(String id, String gradeId, String studentId, Boolean studentState, Long joinTime) {
        this.id = id;
        this.gradeId = gradeId;
        this.studentId = studentId;
        this.studentState = studentState;
        this.joinTime = joinTime;
    }
}
