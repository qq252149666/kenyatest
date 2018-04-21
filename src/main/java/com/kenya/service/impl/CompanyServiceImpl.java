package com.kenya.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenya.bean.Company;
import com.kenya.bean.CompanyExample;
import com.kenya.bean.CompanyExample.Criteria;
import com.kenya.bean.CompanyWithBLOBs;
import com.kenya.dao.CompanyMapper;
import com.kenya.service.CompanyService;
@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	private CompanyMapper companyMapper;
	@Override
	public int insert(CompanyWithBLOBs ass) {
		// TODO Auto-generated method stub
		return companyMapper.insert(ass) ;
	}
	@Override
	public List<CompanyWithBLOBs> pageQuery(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return companyMapper.pageQuery(paramMap);
	}
	@Override
	public int queryCount(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return companyMapper.queryCount(paramMap);
	}
	@Override
	public int deleteByPrimaryKey(Integer companyid) {
		// TODO Auto-generated method stub
		return companyMapper.deleteByPrimaryKey(companyid);
	}
	public List<Company> selectByUserId(int id) {
		CompanyExample example = new CompanyExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(id);
		return companyMapper.selectByExample(example);
	}
	
	public Company selectById(int id) {
		return companyMapper.selectByPrimaryKey(id);
	}

}
