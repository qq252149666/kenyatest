package com.kenya.dao;

import com.kenya.bean.ContentCategory;
import com.kenya.bean.ContentCategoryExample;
import com.kenya.bean.News;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ContentCategoryMapper {
    long countByExample(ContentCategoryExample example);

    int deleteByExample(ContentCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ContentCategory record);

    int insertSelective(ContentCategory record);

    List<ContentCategory> selectByExample(ContentCategoryExample example);

    ContentCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ContentCategory record, @Param("example") ContentCategoryExample example);

    int updateByExample(@Param("record") ContentCategory record, @Param("example") ContentCategoryExample example);

    int updateByPrimaryKeySelective(ContentCategory record);

    int updateByPrimaryKey(ContentCategory record);
   // List<News> pageQuery(Map<String, Object> paramMap);

	int queryCount(long parentId );
	

}