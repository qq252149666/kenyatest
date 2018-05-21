package com.kenya.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenya.bean.Job;
import com.kenya.bean.JobExample;
import com.kenya.bean.JobExample.Criteria;
import com.kenya.dao.JobMapper;
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

	public int queryCount(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return jobSeekerMapper.queryCount(paramMap);
	}

	public Job selectById(int id) {
		return jobSeekerMapper.selectByPrimaryKey(id);
	}

	public int deleteById(int id) {
		return jobSeekerMapper.deleteByPrimaryKey(id);
	}

	public List<Job> selectByUserid(int Userid) {
		JobExample example = new JobExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(Userid);
		return jobSeekerMapper.selectByExample(example);
	}
	
	

}
