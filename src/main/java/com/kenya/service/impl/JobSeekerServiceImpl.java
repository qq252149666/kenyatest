package com.kenya.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenya.bean.Job;
import com.kenya.bean.JobSeeker;
import com.kenya.dao.JobMapper;
import com.kenya.dao.JobSeekerMapper;
import com.kenya.service.JobSeekerService;

@Service
public class JobSeekerServiceImpl implements JobSeekerService {
	@Autowired
	private JobMapper jobSeekerMapper ;

	@Override
	public int insert(Job jobSeeker) {
		// TODO Auto-generated method stub
		return jobSeekerMapper.insert(jobSeeker);
	}

	@Override
	public List<Job> pageQuery(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
			
	
		return jobSeekerMapper.pageQuery(paramMap);
	}

	@Override
	public int queryCount(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return jobSeekerMapper.queryCount(paramMap);
	}
	
	

}
