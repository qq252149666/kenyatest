package com.kenya.service;

import java.util.List;
import java.util.Map;

import com.kenya.bean.CompanyWithBLOBs;
import com.kenya.bean.Job;
import com.kenya.bean.RecruitWithBLOBs;

public interface CompanyService {
	
	public int insert(CompanyWithBLOBs ass);
	
	public List<CompanyWithBLOBs> pageQuery(Map<String, Object> paramMap);

	public int queryCount(Map<String, Object> paramMap);
	//public  int deleteByPrimaryKey(Integer companyid);

	int deleteByPrimaryKey(Integer companyid);
}
