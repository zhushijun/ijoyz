package com.ijoyz.moka.data;

import com.ijoyz.moka.model.LeagueData;

class BearDamageDataWriter extends AbstractLeagueDataWriter {

	@Override
	protected void writeData(String[] sourceArray, LeagueData leagueData) {
		String data = sourceArray[3];
		int idx = data.indexOf('(');
		String substring = data.substring(0, idx);
		leagueData.setBearDamage(Long.valueOf(substring));
		Double integer = Double.valueOf(data.substring(idx + 1, data.length() - 2));
		leagueData.setBearDamagePercent((int) (integer * 100));

	}

	@Override
	protected boolean isTitle(String[] sourceArray) {
		return "玩家名称".equals(sourceArray[0]) && "职业".equals(sourceArray[1]);
	}

	@Override
	protected String getMemberName(String[] sourceArray) {
		return sourceArray[1];
	}
}
