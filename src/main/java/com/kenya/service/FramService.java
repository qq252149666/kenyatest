package com.kenya.service;

import java.util.List;

import com.kenya.bean.Fram;

public interface FramService {
	/**
	 * 根据类别查询农林牧
	 */
	public List<Fram> selectbyfile(String framType);
	/**
	 * 添加农林牧业
	 */
	public int inserFram(Fram fram);

	public String IsNull(Fram fram);
	/**
	 * 删除农林牧
	 */
	public int deleteFram(int framid);
	/**
	 * 根据主键查询农林牧
	 */
	public Fram selectById(int framid);
	/**
	 * 查询用户发表的信息
	 */
	public List<Fram> selectByUserId(int userid);
}
