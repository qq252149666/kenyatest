package com.kenya.service;

import java.util.List;
import java.util.Map;

import com.kenya.bean.CarouselProject;
import com.kenya.bean.CarouselUrl;
import com.kenya.bean.Content;
import com.kenya.until.KYResult;

public interface CarouselService {
	
	KYResult sava (Content content);
	
	public int queryCount(Map<String, Object> paramMap);
	public int queryCountUrl(Map<String, Object> paramMap);
	public int queryCountProject(Map<String, Object> paramMap);
	

//List<Content> pageQuery(Map<String, Object> paramMap);
	public List<Content> pageQuery(Map<String, Object> paramMap);

	public List<CarouselProject> pageQueryCarouselProject(Map<String, Object> paramMap);

	public List<CarouselUrl>pageQueryCarouselUrl(Map<String, Object> paramMap);
	
	public  KYResult delete (Long ids);
	
	 
	

}
