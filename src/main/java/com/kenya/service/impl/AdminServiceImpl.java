package com.kenya.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenya.bean.Admin;
import com.kenya.bean.AdminExample;
import com.kenya.bean.AdminExample.Criteria;
import com.kenya.dao.AdminMapper;
import com.kenya.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminMapper adminDao;
	
	public Admin login(String adminUser, String adminPassword) {
		AdminExample example = new AdminExample();
		Criteria criteria = example.createCriteria();
		criteria.andAdminuserEqualTo(adminUser);
		criteria.andAdminpasswordEqualTo(adminPassword);
		if(adminDao.selectByExample(example)!=null&&adminDao.selectByExample(example).size()!=0) {
		return adminDao.selectByExample(example).get(0);
		}else {
			return null;
		}
	}
	
	public Admin selectbyid(int id) {
		return adminDao.selectByPrimaryKey(id);
	}
	
}
