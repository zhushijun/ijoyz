package com.ijoyz.latte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ijoyz.moka.model.User;
import com.ijoyz.moka.model.Users;

@Controller
@RequestMapping("/u")
public class UserController {
	
	@RequestMapping("/{userName}")
	public String userMain(){
		User currentUser = Users.getCurrentUser();
		System.out.println(currentUser.getUserName());
		return "user_admin";
	}
	
}
