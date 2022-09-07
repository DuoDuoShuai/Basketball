package com.app.realm;


import com.app.mapper.AppTeacherMapper;
import com.app.model.AppTeacher;
import com.yjy.mapper.AdminMapper;
import com.yjy.model.Admin;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;

/**
 * @author 徐晓瑞
 * @date 2022/8/31 22:48
 * @describe:
 */
public class TeacherShiroRealm extends AuthorizingRealm {

    @Resource
    private AppTeacherMapper appTeacherMapper;

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = authenticationToken.getPrincipal().toString();
        AppTeacher teacher = appTeacherMapper.loadByTeacherName(username);
        System.out.println(username);
        if (teacher == null){
            throw new UnknownAccountException("账号不存在");
        }
        String password = teacher.getTeacherPassword();
        System.out.println(password);
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(username,password,getName());
        return simpleAuthenticationInfo;
    }
}

