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

public class SupplyLeagueDataWriterTest extends TestCase {

	public void testWrite() {
		Gang gang = new Gangs().getGang(1000);
		GangMember member = new GangMember(gang, 226520047, "天神下凡");
		gang.addMember(member);
		League league = gang.newLeague("巅峰王朝", false, new Date());
		String[] split1 = StringUtils.split("__莫、葬爱          145   射手  19      0       0", ' ');
		String[] split2 = StringUtils.split("玩家名称            等级  职业  被杀数  爆尸数  复活数", ' ');
		String[] split3 = StringUtils.split("天神下凡            144   方士  7       2       1", ' ');
		LeagueDataWriter writer = new SupplyLeagueDataWriter();
		writer.writeTo(split1, league);
		writer.writeTo(split2, league);
		writer.writeTo(split3, league);
		List<LeagueData> data = league.getLeagueData();
		assertEquals(data.size(), 1);
		LeagueData leagueData = data.get(0);
		int dieCount = leagueData.getDieCount();
		int corpse = leagueData.getCorpse();
		int revive = leagueData.getRevive();
		assertEquals(dieCount, 7);
		assertEquals(corpse, 2);
		assertEquals(revive, 1);
	}

}
