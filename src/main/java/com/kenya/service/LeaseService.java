package com.kenya.service;

import java.util.List;

import com.kenya.bean.Lease;
public interface LeaseService {
	/**
	 * 查询符合条件的记录
	 * by:pc
	 */
	public List<Lease> selectByFild(String leaseName);
	/**
	 * 插入记录
	 */
	public int insert(Lease lease);
	/**
	 * 非空验证
	 */
	public String IsNull(Lease lease);
	/**
	 * 删除Lease
	 */
	public int delete(int leaseid);
	/**
	 * 查询用户发送的信息
	 */
	public List<Lease> selectByUserId(int userid);
	/**
	 * 根据id查询Lease
	 */
	public Lease selectById(int id);
}
