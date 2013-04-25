package com.ijoyz.moka.security;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.ijoyz.moka.model.User;
import com.ijoyz.moka.model.UserRole;
import com.ijoyz.moka.model.Users;

public class MocaRealm extends AuthorizingRealm {
	@Resource
	private Users users;
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection collection) {
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		User user = (User) collection.asList().get(0);
		UserRole role = user.getRole();
		info.addRole(role.toString());
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		User principal = (User) token.getPrincipal();
		Object credentials = token.getCredentials();
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal,credentials,getName());
		return info;
	}

}
