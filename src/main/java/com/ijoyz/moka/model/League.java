package com.ijoyz.moka.model;

import java.util.Arrays;
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
	
	public long getId(){
		return 1213;
	}

	final Map<GangMember, LeagueData> dataMap = new LinkedHashMap<GangMember, LeagueData>();

	League(String rival, Date date, boolean win, Gang gang) {
		this.rival = rival;
		this.date = date;
		this.win = win;
		this.gang = gang;
		gang.leagues.add(this);
	}

	//TODO
	public LeagueData loadLeagueData(GangMember member) {
		LeagueData data = dataMap.get(member);
		if (data == null) {
			data = new LeagueData(gang, this, member);
		}
		return data;
	}
	//TODO
	public List<LeagueData> getLeagueData() {
		LeagueData leagueData = new LeagueData(null, null, null);
		leagueData.setAssist(10);
		leagueData.setChariotHeads(100);
		leagueData.setCorpse(5);
		leagueData.setCure(100000);
		leagueData.setDieCount(5);
		leagueData.setDriveChariotCount(10);
		leagueData.setHeads(102);
		leagueData.setLevel(144);
		leagueData.setRepair(6);
		leagueData.setRevive(17);
		leagueData.setName("天神下凡");
		leagueData.setProf("方士");
		return Arrays.asList(leagueData);
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
