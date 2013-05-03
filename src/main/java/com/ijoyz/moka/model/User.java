package com.ijoyz.moka.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ijoyz.moka.mapper.GangMapper;
import com.ijoyz.moka.model.meta.UserMeta;

public class User {
	private final UserMeta meta;
	private Users users;

	User(UserMeta meta, Users users) {
		this.meta = meta;
		this.users = users;
	}

	public String getUserName() {
		return meta.getUserName();
	}

	public List<League> getLeagues() {
		List<Gang> gangs = getManageGangs();
		ArrayList<League> leagues = new ArrayList<League>();
		for (Gang gang : gangs) {
			leagues.addAll(users.leagueMapper.getLeaguesByGangId(gang.getId()));
		}
		return leagues;
	}

	public List<Gang> getManageGangs() {
		GangMapper gangMapper = users.gangMapper;
		return gangMapper.getGangsByUserId(meta.getId());
	}

	public UserRole getRole() {
		switch (meta.getRole()) {
		case 1:
			return UserRole.GANG_ADMIN;
		case 9:
			return UserRole.SUPER_ADMIN;
		default:
			return UserRole.GANG_MEMBER;
		}
	}

	// TODO
	public League getLeague(long leagueId) {
		Gang gang = new Gang(12345, "开心就好");
		League league = new League("敌人帮会0", new Date(), true, gang);
		return league;
	}
}
