package com.ijoyz.moka.model;

/**
 * 联赛数据
 * 
 * @author zhushijun@corp.netease.com
 */
public class LeagueData {
	private final League league;

	private final Gang gang;

	private final GangMember member;

	// 人头数
	private int heads;

	// 助攻
	private int assist;

	// 维修
	private int repair;

	// 死亡次数
	private int dieCount;

	// 爆尸
	private int corpse;

	// 复活
	private int revive;

	// 伤害量
	private long damage;

	// 伤害百分比
	private int damagePercent;

	// 承受伤害量
	private long bearDamage;

	// 承受伤害百分比
	private int bearDamagePercent;

	// 治疗量
	private long cure;

	// 治疗量百分比
	private int curePercent;

	// 驾驶战车次数
	private int driveChariotCount;

	// 驾驶战车人头数
	private int chariotHeads;

	LeagueData(Gang gang, League league, GangMember member) {
		this.gang = gang;
		this.league = league;
		this.member = member;
		league.dataMap.put(member, this);
		member.dataMap.put(league, this);
	}

	public League getLeague() {
		return league;
	}

	public Gang getGang() {
		return gang;
	}

	public GangMember getMember() {
		return member;
	}

	public int getHeads() {
		return heads;
	}

	public void setHeads(int heads) {
		this.heads = heads;
	}

	public int getAssist() {
		return assist;
	}

	public void setAssist(int assist) {
		this.assist = assist;
	}

	public int getRepair() {
		return repair;
	}

	public void setRepair(int repair) {
		this.repair = repair;
	}

	public int getDieCount() {
		return dieCount;
	}

	public void setDieCount(int dieCount) {
		this.dieCount = dieCount;
	}

	public int getCorpse() {
		return corpse;
	}

	public void setCorpse(int corpse) {
		this.corpse = corpse;
	}

	public int getRevive() {
		return revive;
	}

	public void setRevive(int revive) {
		this.revive = revive;
	}

	public long getDamage() {
		return damage;
	}

	public void setDamage(long damage) {
		this.damage = damage;
	}

	public int getDamagePercent() {
		return damagePercent;
	}

	public void setDamagePercent(int damagePercent) {
		this.damagePercent = damagePercent;
	}

	public long getBearDamage() {
		return bearDamage;
	}

	public void setBearDamage(long bearDamage) {
		this.bearDamage = bearDamage;
	}

	public int getBearDamagePercent() {
		return bearDamagePercent;
	}

	public void setBearDamagePercent(int bearDamagePercent) {
		this.bearDamagePercent = bearDamagePercent;
	}

	public long getCure() {
		return cure;
	}

	public void setCure(long cure) {
		this.cure = cure;
	}

	public int getCurePercent() {
		return curePercent;
	}

	public void setCurePercent(int curePercent) {
		this.curePercent = curePercent;
	}

	public int getDriveChariotCount() {
		return driveChariotCount;
	}

	public void setDriveChariotCount(int driveChariotCount) {
		this.driveChariotCount = driveChariotCount;
	}

	public int getChariotHeads() {
		return chariotHeads;
	}

	public void setChariotHeads(int chariotHeads) {
		this.chariotHeads = chariotHeads;
	}

}
