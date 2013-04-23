package com.ijoyz.moka.model;

public class Gangs {
	/**
	 * 获取帮会
	 * 
	 * @param id
	 * @return
	 */
	public Gang getGang(long id) {
		return new Gang(id, "开心就好");
	}


}
