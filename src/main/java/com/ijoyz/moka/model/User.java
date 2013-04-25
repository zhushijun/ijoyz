package com.ijoyz.moka.model;

import com.ijoyz.moka.model.meta.UserMeta;


public class User {
	private final UserMeta meta;
	private Users users;
	
	User(UserMeta meta , Users users){
		this.meta = meta;
		this.users = users;
	}
	
	public String getUserName(){
		return meta.getUserName();
	}
	
	public UserRole getRole(){
		switch (meta.getRole()) {
		case 1:
			return UserRole.GANG_ADMIN;
		case 9:
			return UserRole.SUPER_ADMIN;
		default:
			return UserRole.GANG_MEMBER;
		}
	}
}
