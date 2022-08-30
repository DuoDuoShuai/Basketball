package com.yjy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * @author 徐晓瑞
 * @date 2022/8/29 16:14
 * @describe: TODO-
 */

@Data //自动生成get和set方法
@AllArgsConstructor//有参构造
@NoArgsConstructor//无参构造
public class Admin {
    /**
     * 管理员id
     */
    private String adminId;
    /**
     * 管理员名称
     */
    private String adminName;
    /**
     * 管理员密码
     */
    private String adminPassword;
    /**
     * 管理员性别
     */
    private Integer adminGender;
    /**
     * 管理员电话
     */
    private String adminPhone;
    /**
     * 是否删除
     */
    private Boolean isDelete;
    /**
     * 创建时间
     */
    private BigInteger creatTime;
    /**
     * 修改时间
     */
    private BigInteger updateTime;
}
