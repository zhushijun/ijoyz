package com.ijoyz.moka.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 帮会
 * 
 * @author zhushijun@corp.netease.com
 */
public class Gang {
	private final String name;

	private final long id;

	final List<League> leagues = new ArrayList<League>();

	private Map<Long,GangMember> members = new LinkedHashMap<Long,GangMember>(150);

	Gang(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void addMember(GangMember member) {
		if (member != null) {
			members.put(member.getId(), member);
		}
	}

	public List<GangMember> getMembers() {
		return new ArrayList<GangMember>(members.values());
	}

	public League newLeague(String rival, boolean win, Date date) {
		return new League(rival, date, win, this);
	}

	public String getName() {
		return name;
	}

	public List<League> getLeagues() {
		return leagues;
	}

	public long getId() {
		return id;
	}

	public GangMember getMember(String string) {
		Collection<GangMember> values = members.values();
		for (GangMember gangMember : values) {
			if (gangMember.getName().equals(string)) {
				return gangMember;
			}
		}
		return null;
	}

}
