package com.ijoyz.latte.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ijoyz.latte.model.User;
import com.ijoyz.latte.model.Users;

@Controller
@RequestMapping("/")
public class IndexController {
	@Resource
	private Users users;

	@RequestMapping("/welcome")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("userName") String userName, @RequestParam("pass") String password,
			HttpSession session) {
		User user = users.getUser(userName, password);
		if (user != null) {
			String validateCode = users.validate(user);
			session.setAttribute("validateCode", validateCode);
			return "user_admin";
		}
		return "index";
	}

}
