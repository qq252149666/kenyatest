package com.kenya.service;

import java.util.List;

import com.kenya.bean.Funds;

public interface FundsService {

	
	/**
	 * 综合查询
	 */
	List<Funds> Selectbyfile(String fundsName);
	/**
	 * 添加资金
	 */
	public int insertfunds(Funds funds);
	/**
	 * 判断非空
	 */
	public String IsNull(Funds funds);
	
}