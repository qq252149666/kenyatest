package com.kenya.service;

import com.kenya.bean.Admin;

public interface AdminService {
	/**
	 * 查询用户名和密码是否正确
	 */
	public Admin login(String adminUser,String adminPassword);
	/**
	 * 根据id查询管理员
	 */
	public Admin selectbyid(int id);
}
