package com.kenya.service;

import java.util.List;
import java.util.Map;

import com.kenya.bean.Company;
import com.kenya.bean.CompanyWithBLOBs;

public interface CompanyService {
	
	public int insert(CompanyWithBLOBs ass);
	
	public List<CompanyWithBLOBs> pageQuery(Map<String, Object> paramMap);

	public int queryCount(Map<String, Object> paramMap);
	//public  int deleteByPrimaryKey(Integer companyid);

	int deleteByPrimaryKey(Integer companyid);
	
	public List<Company> selectByUserId(int id);
	
	public Company selectById(int id);
	
}
