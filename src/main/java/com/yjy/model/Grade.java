package com.yjy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/30
 * @Description: TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Grade {
    private String gradeId;
    private String gradeName;
    private String teacherName;
    private String gradeTime;
    private String photo;
    private String gradeDescribe;
    private Boolean gradeState;
    private Boolean g;
}
