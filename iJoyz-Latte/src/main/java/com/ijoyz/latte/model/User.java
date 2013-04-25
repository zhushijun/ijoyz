package com.ijoyz.latte.model;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * 用户
 * 
 * @author zhushijun@corp.netease.com
 */
public class User {
	/**
	 * 读取账户列表
	 * 
	 * @return
	 */
	public List<Account> listAccounts() {
		return Collections.emptyList();
	}

	/**
	 * 添加账户
	 * 
	 * @param account
	 */
	public void addAccount(Account account) {

	}

	/**
	 * 获取某时间段内的账务列表
	 * 
	 * @param begin
	 * @param end
	 * @return
	 */
	public QueryResult<AccountItem> listAccountItems(Date begin, Date end) {
		return null;
	}

	/**
	 * 获取该用户某账务类型下的账务明细
	 * 
	 * @param type
	 * @param begin
	 * @param end
	 * @return
	 */
	public QueryResult<AccountItem> listAccountItems(AccountItemCatagory type, Date begin, Date end) {
		return null;
	}
}
