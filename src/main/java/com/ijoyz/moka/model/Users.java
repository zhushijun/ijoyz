package com.ijoyz.moka.model;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ijoyz.moka.mapper.UserMapper;
import com.ijoyz.moka.model.meta.UserMeta;

@Service
public class Users {
	@Resource
	UserMapper mapper;
	
	public User getUser(String userName , String pass){
		UserMeta meta = mapper.getUserMeta(userName , pass);
		return new User(meta , this);
	}
}
