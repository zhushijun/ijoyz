package com.ijoyz.latte.model;

/**
 * 查询结果对象
 * 
 * @author zhushijun@corp.netease.com
 */
public class QueryResult<T> {

	private int count;

	private Iterable<T> results;

	public int getCount() {
		return count;
	}

	public Iterable<T> getResults() {
		return results;
	}
}
