package com.kenya.service.impl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenya.bean.Goods;
import com.kenya.bean.GoodsExample;
import com.kenya.bean.GoodsExample.Criteria;
import com.kenya.dao.GoodsMapper;
import com.kenya.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	 private GoodsMapper goodsdao;
	
	public List<Goods> selectByfild(String goodsName) {
        if(goodsName!=null&&!goodsName.equals("")) {
        	GoodsExample example = new GoodsExample();
        	Criteria criteria = example.createCriteria();
        	criteria.andGoodsnameLike("%"+goodsName+"%");
        	return goodsdao.selectByExample(example);
        }else {
        	return goodsdao.selectByExample(null);
        }
	}
	public int selectByFildCount(Map<String, Object> map) {
		return goodsdao.selectByFildCount(map);
	}
	public int creatPublishGoods(Goods usedGoods) {
		// TODO Auto-generated method stub
		return goodsdao.insert(usedGoods);
	}
	public List<Goods> selectbyUserid(int id) {
		GoodsExample example = new GoodsExample();
    	Criteria criteria = example.createCriteria();
    	criteria.andUseridEqualTo(id);
		return goodsdao.selectByExample(example);
	}
	public int updateGoods(Goods goods) {
		return goodsdao.updateByPrimaryKey(goods);
	}
	public int deleteGoods(int goodsid) {
		return goodsdao.deleteByPrimaryKey(goodsid);
	}
	public Goods selectById(int goodsid) {
		GoodsExample example = new GoodsExample();
		Criteria criteria = example.createCriteria();
		criteria.andGoodsidEqualTo(goodsid);
		return goodsdao.selectByExample(example).get(0);
	}

}
