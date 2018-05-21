package com.kenya.service;

import java.util.List;
import java.util.Map;

import com.kenya.bean.News;
import com.kenya.until.KYResult;

public interface NewsService {
    
  public List<News> pageQuery(Map<String, Object> paramMap);

	public int queryCount(Map<String, Object> paramMap);
	public  int  insertSelective (News news);
	public  KYResult deleteId (Integer news);
	
}
