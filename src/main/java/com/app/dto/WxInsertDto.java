package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/13
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WxInsertDto {
    private static final long serialVersionUID = 5172649115384573373L;
    /**
     * 姓名
     */
    private String studentName;
    /**
     * 出生日期
     */
    private Long birthday;
    /**
     * 付款方式
     */
    private String payType;
    /**
     * 付款金额
     */
    private String price;
    /**
     * 课时
     */
    private String remainHour;
    /**
     * 学员id
     */
    private String studentId;
    /**
     * 校区名称
     */
    private String schoolName;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 更新时间
     */
    private Long updateTime;
}
