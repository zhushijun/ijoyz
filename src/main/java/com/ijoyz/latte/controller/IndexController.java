package com.ijoyz.latte.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ijoyz.moka.model.User;
import com.ijoyz.moka.model.Users;

@Controller
@RequestMapping("/")
public class IndexController {
	@Resource
	private Users users;

	@RequestMapping("/welcome")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/login")
	public String login(@RequestParam("userName") String userName, @RequestParam("pass") String password,
			HttpSession session) {
		final User user = users.getUser(userName, password);
		if (user != null) {
			SecurityUtils.getSubject().login(new AuthenticationToken() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 5578659136414434152L;
				@Override
				public Object getPrincipal() {
					return user;
				}
				
				@Override
				public Object getCredentials() {
					return user.getUserName();
				}
			});
			
			return "user_admin";
		}
		return "index";
	}

}
