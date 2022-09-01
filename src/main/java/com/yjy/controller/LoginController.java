package com.yjy.controller;/**
 * @author 徐晓瑞
 * @create 2022/8/31 23:27
 * @describe
 */

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 徐晓瑞
 * @date 2022/8/31 23:27
 * @describe:
 */

@Controller
@RequestMapping("manager")
public class LoginController {

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping("login1")
    public String login1(){
        return "login-2";
    }

    /**
     * 登录认证
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("login")
    public String login(String username, String password){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        try {
            subject.login(token);
            return "index";
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return "login-2";
        }
    }
}
