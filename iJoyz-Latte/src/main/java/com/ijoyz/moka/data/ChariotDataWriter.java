package com.ijoyz.moka.data;

import com.ijoyz.moka.model.LeagueData;

class ChariotDataWriter extends AbstractLeagueDataWriter {

	@Override
	protected void writeData(String[] sourceArray, LeagueData leagueData) {
		leagueData.setChariotHeads(Integer.valueOf(sourceArray[4]));
		leagueData.setDriveChariotCount(Integer.valueOf(sourceArray[3]));
	}

	@Override
	protected boolean isTitle(String[] sourceArray) {
		return "玩家名称".equals(sourceArray[0]) && "等级".equals(sourceArray[1]);
	}

}
