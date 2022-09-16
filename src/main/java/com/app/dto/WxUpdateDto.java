package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/15
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WxUpdateDto {
    private static final long serialVersionUID = 5172649115384573373L;
    /**
     * 0
     */
    private static final Integer ZERO = 0;
    /**
     * 学员id
     */
    private String studentId;
    /**
     * 学员姓名
     */
    private String studentName;
    /**
     * 学员头像
     */
    private String photo;
    /**
     * 校区名称
     */
    private String birthday;
    /**
     * 更新时间
     */
    private Long updateTime;
    /**
     * 风采是展示
     */
    private Boolean pure;
}
