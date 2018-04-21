package com.kenya.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenya.bean.Recruit;
import com.kenya.bean.RecruitWithBLOBs;
import com.kenya.dao.RecruitMapper;
import com.kenya.service.RecruitService;
@Service
public class RecruitServiceImpl implements RecruitService {
@Autowired
private RecruitMapper recruitMapper;
	@Override
	public int insert(RecruitWithBLOBs recruit) {
		
		
		
		
		return recruitMapper.insert(recruit);
	}
	
	

}
