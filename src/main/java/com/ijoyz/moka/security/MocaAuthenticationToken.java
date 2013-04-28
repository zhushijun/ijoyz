package com.ijoyz.moka.security;

import org.apache.shiro.authc.AuthenticationToken;

import com.ijoyz.moka.model.User;
/**
 * 本系统默认的校验TOKEN对象
 * @author user
 *
 */
public class MocaAuthenticationToken implements AuthenticationToken {

	private final User user;
	
	public MocaAuthenticationToken(User user){
		this.user = user;
	}
	
	@Override
	public Object getPrincipal() {
		return user;
	}

	@Override
	public Object getCredentials() {
		return user.getRole();
	}

	private static final long serialVersionUID = 8316561687982045483L;

}
