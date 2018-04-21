package com.kenya.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.kenya.bean.News;
import com.kenya.bean.NewsExample;
import com.kenya.bean.PageBean1;
import com.kenya.dao.NewsMapper;
import com.kenya.service.NewsService;
@Service

public class NewSeviceImpl implements NewsService{
@Autowired 
private NewsMapper newsMapper ;
	@Override
	public List<News> pageQuery(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return newsMapper.pageQuery(paramMap);
	}

	@Override
	public int queryCount(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return newsMapper.queryCount(paramMap);
	}

	@Override
	public int insertSelective(News news) {
		
		return newsMapper.insertSelective(news);
	}
}
/*	public PageBean1 getItemList(int page, int rows) {
		//查询商品列表
		NewsExample example = new NewsExample();
		//分页处理
		PageHelper.startPage(page, rows);
		List<TbItem> list = itemMapper.selectByExample(example);
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;


}*/
