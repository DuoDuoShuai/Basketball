package com.yjy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * @author 徐晓瑞
 * @date 2022/8/29 16:37
 * @describe:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parent {
    /**
     * 家长id
     */
    private String parentId;
    /**
     * 家长姓名
     */
    private String parentName;
    /**
     * 家长电话
     */
    private String parentPhone;
    /**
     * 家长头像
     */
    private String parentPhoto;
    /**
     * 家长性别
     */
    private Boolean parentSex;
    /**
     * 是否删除
     */
    private Boolean isDelete;
    /**
     * 注册时间
     */
    private Long parentRegtime;
    /**
     * 修改时间
     */
    private Long updateTime;
}
