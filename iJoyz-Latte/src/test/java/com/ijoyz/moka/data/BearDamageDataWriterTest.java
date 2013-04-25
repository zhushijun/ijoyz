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


public class BearDamageDataWriterTest extends TestCase {
	public void testWrite() throws Exception {
		Gang gang = new Gangs().getGang(1000);
		GangMember member = new GangMember(gang, 226520047, "天神下凡");
		gang.addMember(member);
		League league = gang.newLeague("巅峰王朝", false, new Date());
		String[] split1 = StringUtils.split("1   __莫、葬爱          射手  64555408(7.68%)", ' ');
		String[] split2 = StringUtils.split("    玩家名称            职业  承受攻击量", ' ');
		String[] split3 = StringUtils.split("3   天神下凡            方士  44339098(5.28%)", ' ');
		LeagueDataWriter writer = new BearDamageDataWriter();
		writer.writeTo(split1, league);
		writer.writeTo(split2, league);
		writer.writeTo(split3, league);
		List<LeagueData> data = league.getLeagueData();
		assertEquals(data.size(), 1);
		LeagueData leagueData = data.get(0);
		long damage = leagueData.getBearDamage();
		assertEquals(damage, 44339098L);
		int percent = leagueData.getBearDamagePercent();
		assertEquals(percent, 528);
	}
}
