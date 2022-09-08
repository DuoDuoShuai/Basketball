package com.yjy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/29
 * @Description: TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LayUiDto {
    private static final long serialVersionUID = 5172649115384573373L;
    /**
     * 0
     */
    private static final Integer ZERO = 0;
    /**
     * 每页显示条数
     */
    private Integer page;
    /**
     * 页码
     */
    private Integer limit;
    /**
     * sql分页起始位置
     */
    private Integer dataNum = ZERO;
    /**
     * 排序 desc降序 asc升序
     */
    private String sort;
    /**
     * 状态
     */
    private Integer state;
    /**
     * id
     */
    private String id;
    /**
     * 名称
     */
    private String name;
    /**
     * 电话
     */
    private String phone;
    /**
     * 性别
     */
    private Boolean gender;
    /**
     * 班级名称
     */
    private String gradeName;
    /**
     * 年龄
     */
    private String age;
    /**
     * 校区名称
     */
    private String schoolName;
    /**
     * 编号
     */
    private String number;
    /**
     * 是否显示
     */
    private String pure;
    /**
     * 教练名称
     */
    private String teacherName;
    /**
     * 上课时间
     */
    private String gradeTime;
    /**
     * 积分渠道
     */
    private String integralWay;
    /**
     * 学生名称
     */
    private String studentName;
    /**
     * @param page 页码
     * @param limit 每页显示数
     */
    public LayUiDto(Integer page, Integer limit) {
        if (page != null && page > ZERO) {
            this.page = page;
        }
        if (limit != null && limit > ZERO) {
            this.limit = limit;
        }
        this.dataNum = (this.page - 1) * this.limit;
    }
}
