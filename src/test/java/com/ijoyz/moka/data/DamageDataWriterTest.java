package com.ijoyz.moka.data;

import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import org.apache.commons.lang.StringUtils;

import com.ijoyz.moka.model.Gang;
import com.ijoyz.moka.model.GangMember;
import com.ijoyz.moka.model.Gangs;
import com.ijoyz.moka.model.League;
import com.ijoyz.moka.model.LeagueData;

public class DamageDataWriterTest extends TestCase {
	public void testWrite() throws Exception {
		Gang gang = new Gangs().getGang(1000);
		GangMember member = new GangMember(gang, 226520047, "天神下凡");
		gang.addMember(member);
		League league = gang.newLeague("巅峰王朝", false, new Date());
		String[] split1 = StringUtils.split("1   似魔的男人丶        异人  34852358(13.17%)", ' ');
		String[] split2 = StringUtils.split("玩家名称            等级  职业  被杀数  爆尸数  复活数", ' ');
		String[] split3 = StringUtils.split("3   天神下凡            方士  24416113(9.23%)", ' ');
		LeagueDataWriter writer = new DamageDataWriter();
		writer.writeTo(split1, league);
		writer.writeTo(split2, league);
		writer.writeTo(split3, league);
		List<LeagueData> data = league.getLeagueData();
		assertEquals(data.size(), 1);
		LeagueData leagueData = data.get(0);
		long damage = leagueData.getDamage();
		assertEquals(damage, 24416113L);
		int percent = leagueData.getDamagePercent();
		assertEquals(percent, 923);
	}
}
