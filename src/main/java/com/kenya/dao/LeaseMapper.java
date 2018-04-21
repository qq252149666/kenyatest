package com.kenya.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kenya.bean.Lease;
import com.kenya.bean.LeaseExample;

public interface LeaseMapper {
    long countByExample(LeaseExample example);

    int deleteByExample(LeaseExample example);

    int deleteByPrimaryKey(Integer leaseid);

    int insert(Lease record);

    int insertSelective(Lease record);

    List<Lease> selectByExampleWithBLOBs(LeaseExample example);

    List<Lease> selectByExample(LeaseExample example);

    Lease selectByPrimaryKey(Integer leaseid);

    int updateByExampleSelective(@Param("record") Lease record, @Param("example") LeaseExample example);

    int updateByExampleWithBLOBs(@Param("record") Lease record, @Param("example") LeaseExample example);

    int updateByExample(@Param("record") Lease record, @Param("example") LeaseExample example);

    int updateByPrimaryKeySelective(Lease record);

    int updateByPrimaryKeyWithBLOBs(Lease record);

    int updateByPrimaryKey(Lease record);

}