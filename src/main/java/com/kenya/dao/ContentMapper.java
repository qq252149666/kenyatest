package com.kenya.dao;

import com.kenya.bean.CarouselProject;
import com.kenya.bean.CarouselUrl;
import com.kenya.bean.Content;
import com.kenya.bean.ContentCategory;
import com.kenya.bean.ContentExample;
import com.kenya.bean.News;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ContentMapper {
	long countByExample(ContentExample example);

	int deleteByExample(ContentExample example);

	int deleteByPrimaryKey(Long id);

	int insert(Content record);

	int insertSelective(Content record);

	List<Content> selectByExampleWithBLOBs(ContentExample example);

	List<Content> selectByExample(ContentExample example);

	Content selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") Content record, @Param("example") ContentExample example);

	int updateByExampleWithBLOBs(@Param("record") Content record, @Param("example") ContentExample example);

	int updateByExample(@Param("record") Content record, @Param("example") ContentExample example);

	int updateByPrimaryKeySelective(Content record);

	int updateByPrimaryKeyWithBLOBs(Content record);

	int updateByPrimaryKey(Content record);

	List<Content> pageQuery(Map<String, Object> paramMap);

	List<CarouselUrl> pageQueryCarouselUrl(Map<String, Object> paramMap);

	List<CarouselProject> pageQueryCarouselProject(Map<String, Object> paramMap);

	int queryCount(Map<String, Object> paramMap);
	int queryCountUrl(Map<String, Object> paramMap);
	int queryCountProject(Map<String, Object> paramMap);
	
	

}