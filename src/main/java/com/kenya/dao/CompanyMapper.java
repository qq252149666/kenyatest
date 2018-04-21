package com.kenya.dao;

import com.kenya.bean.Company;
import com.kenya.bean.CompanyExample;
import com.kenya.bean.CompanyWithBLOBs;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CompanyMapper {
    long countByExample(CompanyExample example);

    int deleteByExample(CompanyExample example);

    int deleteByPrimaryKey(Integer companyid);

    int insert(CompanyWithBLOBs record);

    int insertSelective(CompanyWithBLOBs record);

    List<CompanyWithBLOBs> selectByExampleWithBLOBs(CompanyExample example);

    List<Company> selectByExample(CompanyExample example);

    CompanyWithBLOBs selectByPrimaryKey(Integer companyid);

    int updateByExampleSelective(@Param("record") CompanyWithBLOBs record, @Param("example") CompanyExample example);

    int updateByExampleWithBLOBs(@Param("record") CompanyWithBLOBs record, @Param("example") CompanyExample example);

    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

    int updateByPrimaryKeySelective(CompanyWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CompanyWithBLOBs record);

    int updateByPrimaryKey(Company record);
    
	List<CompanyWithBLOBs> pageQuery(Map<String, Object> paramMap);

	int queryCount(Map<String, Object> paramMap);
}
