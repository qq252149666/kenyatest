package com.kenya.service;

import java.util.List;
import java.util.Map;

import com.kenya.bean.Job;

public interface JobSeekerService {
	int insert(Job jobSeeker);

	public List<Job> pageQuery(Map<String, Object> paramMap);

	public int queryCount(Map<String, Object> paramMap);

	public Job selectById(int id);
	
	public int deleteById(int id);
	
	public List<Job> selectByUserid(int Userid);
}
