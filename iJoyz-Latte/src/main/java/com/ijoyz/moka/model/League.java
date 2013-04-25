package com.ijoyz.moka.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 联赛
 * 
 * @author zhushijun@corp.netease.com
 */
public class League extends GangActivity {
	// 帮会
	private final Gang gang;

	// 对手
	private final String rival;

	// 日期
	private final Date date;

	// 是否胜利
	private final boolean win;

	final Map<GangMember, LeagueData> dataMap = new LinkedHashMap<GangMember, LeagueData>();

	League(String rival, Date date, boolean win, Gang gang) {
		this.rival = rival;
		this.date = date;
		this.win = win;
		this.gang = gang;
		gang.leagues.add(this);
	}


	public LeagueData loadLeagueData(GangMember member) {
		LeagueData data = dataMap.get(member);
		if (data == null) {
			data = new LeagueData(gang, this, member);
		}
		return data;
	}

	public List<LeagueData> getLeagueData() {
		return new ArrayList<LeagueData>(dataMap.values());
	}

	public Gang getGang() {
		return gang;
	}

	public String getRival() {
		return rival;
	}

	public Date getDate() {
		return date;
	}

	public boolean isWin() {
		return win;
	}
}
