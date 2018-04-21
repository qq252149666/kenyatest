package com.kenya.service;

import java.util.List;
import java.util.Map;

import com.kenya.bean.Job;
import com.kenya.bean.JobSeeker;

public interface JobSeekerService {
	int insert(Job jobSeeker);

	public List<Job> pageQuery(Map<String, Object> paramMap);

	public int queryCount(Map<String, Object> paramMap);

}
