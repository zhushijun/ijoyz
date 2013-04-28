package com.ijoyz.latte.controller;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ijoyz.moka.model.User;
import com.ijoyz.moka.model.Users;
import com.ijoyz.moka.security.MocaAuthenticationToken;

@Controller
@RequestMapping("/")
public class IndexController {
	@Resource
	private Users users;

	@RequestMapping("/login")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/check", method = RequestMethod.POST)
	public String check(@RequestParam("userName") String userName,
			@RequestParam("pass") String password) {
		final User user = users.getUser(userName, password);
		if (user != null) {
			SecurityUtils.getSubject().login(new MocaAuthenticationToken(user));
			return "redirect:/u/"+user.getUserName()+".do";
		}
		return "redirect:/index.do";
	}

}
