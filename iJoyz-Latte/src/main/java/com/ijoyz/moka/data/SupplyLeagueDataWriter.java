package com.ijoyz.moka.data;

import com.ijoyz.moka.model.LeagueData;

class SupplyLeagueDataWriter extends AbstractLeagueDataWriter {

	@Override
	protected void writeData(String[] sourceArray, LeagueData leagueData) {
		leagueData.setDieCount(Integer.valueOf(sourceArray[3]));
		leagueData.setCorpse(Integer.valueOf(sourceArray[4]));
		leagueData.setRevive(Integer.valueOf(sourceArray[5]));
	}

	@Override
	protected boolean isTitle(String[] sourceArray) {
		return "玩家名称".equals(sourceArray[0]) && "等级".equals(sourceArray[1]);
	}

}
