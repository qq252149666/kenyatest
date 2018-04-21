package com.kenya.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kenya.bean.Live;
import com.kenya.bean.LiveExample;

public interface LiveMapper {
    long countByExample(LiveExample example);

    int deleteByExample(LiveExample example);

    int deleteByPrimaryKey(Integer liveid);

    int insert(Live record);

    int insertSelective(Live record);

    List<Live> selectByExampleWithBLOBs(LiveExample example);

    List<Live> selectByExample(LiveExample example);

    Live selectByPrimaryKey(Integer liveid);

    int updateByExampleSelective(@Param("record") Live record, @Param("example") LiveExample example);

    int updateByExampleWithBLOBs(@Param("record") Live record, @Param("example") LiveExample example);

    int updateByExample(@Param("record") Live record, @Param("example") LiveExample example);

    int updateByPrimaryKeySelective(Live record);

    int updateByPrimaryKeyWithBLOBs(Live record);

    int updateByPrimaryKey(Live record);
    
    
    
}