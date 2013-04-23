package com.ijoyz.latte.model;

import java.util.Date;

/**
 * 账户
 * 
 * @author zhushijun@corp.netease.com
 */
public class Account {
	/**
	 * 获取账户类型
	 * 
	 * @return
	 */
	public AccountType getType() {
		return null;
	}

	/**
	 * 获取该账户的某账务类型下的账务明细
	 * 
	 * @param catagory
	 * @param begin
	 * @param end
	 * @return
	 */
	public QueryResult<AccountItem> listItems(AccountItemCatagory catagory, Date begin, Date end) {
		return null;
	}

	/**
	 * 获取某时间段内的该账户的账务列表
	 * 
	 * @param begin
	 * @param end
	 * @return
	 */
	public QueryResult<AccountItem> listItems(Date begin, Date end) {
		return null;
	}

	/**
	 * 批量添加账务明细
	 * 
	 * @param items
	 */
	public void addItems(Iterable<AccountItem> items) {

	}

	/**
	 * 添加账务明细
	 * 
	 * @param item
	 */
	public void addItem(AccountItem item) {

	}

	/**
	 * 删除账户
	 */
	public void delete() {

	}

	/**
	 * 清除所有账务明细
	 */
	public void clearItems() {

	}
}
