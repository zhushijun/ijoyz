package com.ijoyz.latte.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ijoyz.moka.model.League;
import com.ijoyz.moka.model.LeagueData;
import com.ijoyz.moka.model.User;
import com.ijoyz.moka.model.Users;

@Controller
@RequestMapping("/u")
public class UserController {

	@RequestMapping("/")
	public String userMain(ModelMap modelMap) {
		User currentUser = Users.getCurrentUser();
		modelMap.put("user", currentUser);
		modelMap.put("leagues", currentUser.getLeagues());

		return "user_admin";
	}

	@RequestMapping("/detail")
	public String leagueDetail(@RequestParam("id") long leagueId,
			ModelMap modelMap) {
		User currentUser = Users.getCurrentUser();
		League league = currentUser.getLeague(leagueId);
		List<LeagueData> datas = Collections.emptyList();
		if (league != null) {
			datas = league.getLeagueData();
		}
		modelMap.put("datas", datas);
		return "data";
	}

}
