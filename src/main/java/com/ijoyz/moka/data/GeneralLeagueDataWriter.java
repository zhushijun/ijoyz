package com.ijoyz.moka.data;

import com.ijoyz.moka.model.LeagueData;

class GeneralLeagueDataWriter extends AbstractLeagueDataWriter {

	@Override
	protected void writeData(String[] sourceArray, LeagueData leagueData) {
		leagueData.setHeads(Integer.valueOf(sourceArray[3]));
		leagueData.setAssist(Integer.valueOf(sourceArray[4]));
		leagueData.setRepair(Integer.valueOf(sourceArray[5]));
	}

	@Override
	protected boolean isTitle(String[] sourceArray) {
		return "玩家名称".equals(sourceArray[0]) && "等级".equals(sourceArray[1]);
	}

}
