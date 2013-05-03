package com.ijoyz.moka.model;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

import com.ijoyz.moka.mapper.GangMapper;
import com.ijoyz.moka.mapper.LeagueMapper;
import com.ijoyz.moka.mapper.UserMapper;
import com.ijoyz.moka.model.meta.UserMeta;

@Service
public class Users {
	@Resource
	UserMapper userMapper;
	@Resource
	LeagueMapper leagueMapper;
	@Resource
	GangMapper gangMapper;
	
	public User getUser(String userName, String pass) {
		UserMeta meta = userMapper.getUserMeta(userName, pass);
		return new User(meta, this);
	}

	public static User getCurrentUser() {

		try {
			Subject subject = SecurityUtils.getSubject();
			return (User) subject.getPrincipal();
		} catch (Exception e) {
			return null;
		}
	}

}
