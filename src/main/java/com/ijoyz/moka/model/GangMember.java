package com.ijoyz.moka.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 帮会成员
 * 
 * @author zhushijun@corp.netease.com
 */
public class GangMember {
	private final Gang gang;

	private final String name;

	private final long id;

	private Set<String> usedNames = new LinkedHashSet<String>();

	final Map<League, LeagueData> dataMap = new LinkedHashMap<League, LeagueData>();

	public GangMember(Gang gang, long id, String name) {
		this.gang = gang;
		this.id = id;
		this.name = name;
	}

	public Gang getGang() {
		return gang;
	}

	public String getName() {
		return name;
	}


	public long getId() {
		return id;
	}

	public void addUsedName(String usedName) {
		usedNames.add(usedName);
	}

	public Collection<String> getUsedNames() {
		return usedNames;
	}

	public List<LeagueData> getLeagueDatas() {
		return new ArrayList<LeagueData>(dataMap.values());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GangMember other = (GangMember) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
