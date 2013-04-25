package com.ijoyz.moka.data;

import com.ijoyz.moka.model.Gang;
import com.ijoyz.moka.model.GangMember;
import com.ijoyz.moka.model.League;
import com.ijoyz.moka.model.LeagueData;

abstract class AbstractLeagueDataWriter implements LeagueDataWriter {

	@Override
	public boolean writeTo(String[] sourceArray, League league) {
		if (isTitle(sourceArray)) {
			return false;
		}
		Gang gang = league.getGang();
		GangMember member = gang.getMember(getMemberName(sourceArray));
		if (member != null) {
			LeagueData leagueData = league.loadLeagueData(member);
			writeData(sourceArray, leagueData);
			return true;
		}
		return false;
	}

	protected String getMemberName(String[] sourceArray) {
		return sourceArray[0];
	}

	protected abstract void writeData(String[] sourceArray, LeagueData leagueData);

	protected abstract boolean isTitle(String[] sourceArray);

}
