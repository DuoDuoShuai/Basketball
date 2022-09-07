package com.yjy.conf;

import com.app.realm.TeacherShiroRealm;
import com.yjy.realm.MyShiroRealm;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.shiro.authc.pam.AtLeastOneSuccessfulStrategy;
import org.apache.shiro.authc.pam.AuthenticationStrategy;
import org.apache.shiro.authc.pam.ModularRealmAuthenticator;
import org.apache.shiro.authz.ModularRealmAuthorizer;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 徐晓瑞
 * @date 2022/9/7 15:50
 * @describe:
 */

public class UserModularRealmAuthenticator extends ModularRealmAuthorizer {
    /**
     *
     */
    private AuthenticationStrategy authenticationStrategy = new AtLeastOneSuccessfulStrategy();

    /**
     * 登陆认证
     * @param principals
     * @param permission
     * @return
     */
    @Override
    public boolean isPermitted(PrincipalCollection principals, String permission) {
        assertRealmsConfigured();
        // 所有Realm
        Collection<Realm> realms = getRealms();
        HashMap<String, Realm> realmHashMap = new HashMap<>(realms.size());
        for (Realm realm : realms) {
            if (realm.getName().contains("admin")) {
                realmHashMap.put("MyShiroRealm", realm);
            } else if (realm.getName().contains("teacher")) {
                realmHashMap.put("TeacherShiroRealm", realm);
            }
        }

        Set<String> realmNames = principals.getRealmNames();
        if (realmNames != null) {
            String realmName = null;
            Iterator it = realmNames.iterator();
            while (it.hasNext()) {
                realmName = ConvertUtils.convert(it.next());
                if (realmName.contains("admin")) {
                    return ((MyShiroRealm) realmHashMap.get("MyShiroRealm")).isPermitted(principals, permission);
                } else if (realmName.contains("teacher")) {
                    return ((TeacherShiroRealm) realmHashMap.get("TeacherShiroRealm")).isPermitted(principals, permission);
                }
                break;
            }
        }
        return false;
    }

    /**
     * set
     * @param authenticationStrategy
     */
    public void setAuthenticationStrategy(AuthenticationStrategy authenticationStrategy) {
        this.authenticationStrategy = authenticationStrategy;
    }

    /**
     * get
     * @return
     */
    public AuthenticationStrategy getAuthenticationStrategy() {
        return this.authenticationStrategy;
    }
}
