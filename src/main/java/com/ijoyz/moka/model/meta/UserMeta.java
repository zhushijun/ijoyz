package com.ijoyz.moka.model.meta;

public class UserMeta {
	private long id ;
	
	private String userName;
	
	private String pass;
	
	private long gameUserId;
	
	private int role;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public long getGameUserId() {
		return gameUserId;
	}

	public void setGameUserId(long gameUserId) {
		this.gameUserId = gameUserId;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}
}
