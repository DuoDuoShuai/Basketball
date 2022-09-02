package com.yjy.config;

import com.yjy.realm.MyShiroRealm;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 徐晓瑞
 * @date 2022/8/29 17:14
 * @describe:
 */
@Configuration
public class ShiroConfig {

    /**
     *
     * @return
     */
    @Bean
    @ConditionalOnMissingBean
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator defaultAap = new DefaultAdvisorAutoProxyCreator();
        defaultAap.setProxyTargetClass(true);
        return defaultAap;
    }

    /**
     * 将自己的验证方式加入容器
     * @return
     */
    @Bean
    public MyShiroRealm myShiroRealm() {
        MyShiroRealm customRealm = new MyShiroRealm();
        return customRealm;
    }

    /**
     * 权限管理，配置主要是Realm的管理认证
     * @return
     */
    @Bean
    public DefaultWebSecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(myShiroRealm());
        return securityManager;
    }

    /**
     * Filter工厂，设置对应的过滤条件和跳转条件
     * @param securityManager
     * @return
     */
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(DefaultWebSecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        Map<String, String> filterChainDefinitionMap  = new HashMap<>(16);
        //登出
        filterChainDefinitionMap .put("/logout", "logout");
        //对所有用户认证
        filterChainDefinitionMap.put("/api/**", "anon");
        filterChainDefinitionMap.put("/css/**", "anon");
        filterChainDefinitionMap.put("/images/**", "anon");
        filterChainDefinitionMap.put("/js/**", "anon");
        filterChainDefinitionMap.put("/lib/**", "anon");
        filterChainDefinitionMap.put("/manager/login", "anon");
        filterChainDefinitionMap.put("/manager/login1", "anon");
        filterChainDefinitionMap.put("/**", "authc");
        //登录
        shiroFilterFactoryBean.setLoginUrl("/manager/login1");
        //首页
        shiroFilterFactoryBean.setSuccessUrl("/manager/index");
        //错误页面，认证不通过跳转
        shiroFilterFactoryBean.setUnauthorizedUrl("/page/login-2.jsp");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap );
        return shiroFilterFactoryBean;
    }

    /**
     *
     * @param securityManager
     * @return
     */
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(DefaultWebSecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }
}
