package com.kenya.service;

import java.util.List;
import java.util.Map;

import com.kenya.bean.Goods;

public interface GoodsService {
	/**
	 * fild条件查询
	 * @return
	 */
	public List<Goods> selectByfild(String goodsName);
	/**
	 * 查询符合条件的记录个数
	 */
	public int selectByFildCount(Map<String,Object> map);
	
	int creatPublishGoods(Goods usedGoods);
	/**
	 * 查询用户发布的信息
	 */
	public List<Goods> selectbyUserid(int id);
	/**
	 * 修改发布信息
	 */
	public int updateGoods(Goods goods);
	/**
	 * 删除发布信息
	 */
	public int deleteGoods(int goodsid);
	/**
	 * 根据id查询信息
	 */
	public Goods selectById(int goodsid);
}
