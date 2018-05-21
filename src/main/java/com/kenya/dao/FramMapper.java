package com.kenya.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kenya.bean.Fram;
import com.kenya.bean.FramExample;

public interface FramMapper {
    long countByExample(FramExample example);

    int deleteByExample(FramExample example);

    int deleteByPrimaryKey(Integer framid);

    int insert(Fram record);

    int insertSelective(Fram record);

    List<Fram> selectByExampleWithBLOBs(FramExample example);

    List<Fram> selectByExample(FramExample example);

    Fram selectByPrimaryKey(Integer framid);

    int updateByExampleSelective(@Param("record") Fram record, @Param("example") FramExample example);

    int updateByExampleWithBLOBs(@Param("record") Fram record, @Param("example") FramExample example);

    int updateByExample(@Param("record") Fram record, @Param("example") FramExample example);

    int updateByPrimaryKeySelective(Fram record);

    int updateByPrimaryKeyWithBLOBs(Fram record);

    int updateByPrimaryKey(Fram record);
}