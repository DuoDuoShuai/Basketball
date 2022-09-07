package com.yjy.util;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * @author 徐晓瑞
 * @date 2022/9/7 15:18
 * @describe:
 */

public class ShiroUsernamePasswordToken extends UsernamePasswordToken {

    /*
    * 当前登录用户类型
    */
    private String userType;

    /**
     *
     * @return
     */
    public String getUserType() {
        return userType;
    }

    /**
     *
     * @param userType
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     *
     * @param username
     * @param password
     * @param userType
     */
    public ShiroUsernamePasswordToken(String username, String password, String userType) {
        super(username, password);
        this.userType = userType;
    }
}
