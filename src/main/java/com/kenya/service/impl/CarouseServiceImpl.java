package com.kenya.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenya.bean.CarouselProject;
import com.kenya.bean.CarouselUrl;
import com.kenya.bean.Content;
import com.kenya.dao.ContentMapper;
import com.kenya.service.CarouselService;
import com.kenya.until.KYResult;

@Service
public class CarouseServiceImpl implements CarouselService{
	@Autowired
	 private ContentMapper contentMapper;

	@Override
	public KYResult sava(Content content) {
		// TODO Auto-generated method stub
	 int i = contentMapper.insertSelective(content);
	 return KYResult.ok();	 
	}



	
	@Override
	public List<Content> pageQuery(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return contentMapper.pageQuery(paramMap);
	}

	@Override
	public List<CarouselProject> pageQueryCarouselProject(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return contentMapper.pageQueryCarouselProject(paramMap);
		}
	@Override
	public List<CarouselUrl> pageQueryCarouselUrl(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return contentMapper.pageQueryCarouselUrl(paramMap);
	}

	@Override
	public int queryCountUrl(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return contentMapper.queryCountUrl(paramMap);
	}
	@Override
	public int queryCountProject(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return contentMapper.queryCountProject(paramMap);
	}
	@Override
	public int queryCount(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return contentMapper.queryCount(paramMap);
	}

	@Override
	public KYResult delete(Long id) {
		// TODO Auto-generated method stub
		 int i = contentMapper.deleteByPrimaryKey(id);
		 return KYResult.ok();
	}
	
	
	

}
