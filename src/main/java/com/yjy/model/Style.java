package com.yjy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 任凭
 * @create 2022/9/7 03:01
 * @describe TODO
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Style {
    /**
     * 风采表id
     */
    private String styleId;
    /**
     * 学员id
     */
    private String studentId;
    /**
     * 学员姓名
     */
    private String studentName;
    /**
     * 班级名称
     */
    private String gradeName;
    /**
     * 校区名称
     */
    private String schoolName;
    /**
     * 学员风采图片
     */
    private String picture;
    /**
     * 学员风采视频
     */
    private String video;
    /**
     * 是否展示（0-否，1-是）
     */
    private boolean pure;
    /**
     * 是否删除（0-否，1-是）
     */
    private boolean isDelete;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 修改时间
     */
    private Long updateTime;
}
