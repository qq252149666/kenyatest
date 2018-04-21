package com.kenya.service;

import java.util.List;

import com.kenya.bean.Live;

public interface LiveService {
	
	/**
	 * 按类别查询
	 */
	public List<Live> selectByType(String liveName,String liveType);

	/**
	 * 插入记录
	 */
	int inserLive(Live live);
	/**
	 * 非法访问 空
	 */
	public String IsNull(Live live);
	/**
	 * 删除生活服务
	 */
	public int deleteLive(int liveid);
	/**
	 * 根据id查询生活服务
	 */
	public Live selectById(int liveid);
	/**
	 * 查询用户发布的生活服务
	 */
	public List<Live> selectByUserId(int UserId);
	
}
