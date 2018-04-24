package com.kenya.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenya.bean.News;
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
		//鏌ヨ鍟嗗搧鍒楄〃
		NewsExample example = new NewsExample();
		//鍒嗛〉澶勭悊
		PageHelper.startPage(page, rows);
		List<TbItem> list = itemMapper.selectByExample(example);
		//鍒涘缓涓�涓繑鍥炲�煎璞�
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//鍙栬褰曟�绘潯鏁�
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;


}*/
