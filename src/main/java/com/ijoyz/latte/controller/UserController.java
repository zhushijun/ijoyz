package com.ijoyz.latte.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ijoyz.latte.model.Account;
import com.ijoyz.latte.model.AccountItem;
import com.ijoyz.latte.model.QueryResult;
import com.ijoyz.latte.model.User;
import com.ijoyz.latte.model.Users;

@Controller
@RequestMapping("/u")
public class UserController {
	@Resource
	private Users users;

	/**
	 * 获取账户列表
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "/accounts", method = RequestMethod.POST)
	public void listAccounts(HttpServletRequest request, HttpServletResponse response) {
		User user = users.loadCurrentUser();
		List<Account> accounts = user.listAccounts();
		writeResponse(accounts, response);
	}

	/**
	 * 列出最近的账务明细
	 * 
	 * @param response
	 */
	@RequestMapping(value = "/recentItems", method = RequestMethod.POST)
	public void listRecentItems(HttpServletResponse response) {
		User user = users.loadCurrentUser();
		QueryResult<AccountItem> queryResult = user.listAccountItems(null, null);
		Iterable<AccountItem> results = queryResult.getResults();
		ArrayList<AccountItem> list = new ArrayList<AccountItem>(40);
		if (queryResult.getCount() > 0) {
			int t = 0;
			for (AccountItem accountItem : results) {
				if (t++ > 40) {
					break;
				}
				list.add(accountItem);
			}
		}
		writeResponse(list, response);
	}

	private void writeResponse(List<?> accounts, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

}
