package com.kenya.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kenya.bean.Funds;
import com.kenya.bean.FundsExample;

public interface FundsMapper {
    long countByExample(FundsExample example);

    int deleteByExample(FundsExample example);

    int deleteByPrimaryKey(Integer fundsid);

    int insert(Funds record);

    int insertSelective(Funds record);

    List<Funds> selectByExample(FundsExample example);

    Funds selectByPrimaryKey(Integer fundsid);

    int updateByExampleSelective(@Param("record") Funds record, @Param("example") FundsExample example);

    int updateByExample(@Param("record") Funds record, @Param("example") FundsExample example);

    int updateByPrimaryKeySelective(Funds record);

    int updateByPrimaryKey(Funds record);
}