package com.mybatis.realm;

import com.mybatis.entity.User;
import com.mybatis.utils.MD5Util;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author APPO
 */
public class MyShiroRealm  extends AuthorizingRealm{
    /***
     * 授权用户权限
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        获取用户
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        获取用户角色
        Set<String> roleSet = new HashSet<>();
        roleSet.add("10002");
        info.setRoles(roleSet);

//        获取用户权限
        Set<String> permissionSet = new HashSet<>();
        permissionSet.add("权限增加");
        permissionSet.add("权限删除");

        info .setStringPermissions(permissionSet);

        return info;
    }

    /***
     * 验证用户身份
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        String password = String.valueOf(token.getPassword());


        Map<String,Object> map = new HashMap<>();

        map.put("nickname",username);

//        密码进行加密处理，明文为password+username
        String pwd = password+username;
        String pwdDES = MD5Util.getMD5String(pwd);

        User user = new User();
        user.setUsername(username);
        user.setPassword(pwdDES);

        return  new SimpleAuthenticationInfo(user, password, getName());
    }
}
