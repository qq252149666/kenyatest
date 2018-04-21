package com.kenya.dao;

import com.kenya.bean.JobSeeker;
import com.kenya.bean.JobSeekerExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface JobSeekerMapper {
    long countByExample(JobSeekerExample example);

    int deleteByExample(JobSeekerExample example);

    int insert(JobSeeker record);

    int insertSelective(JobSeeker record);

    List<JobSeeker> selectByExampleWithBLOBs(JobSeekerExample example);

    List<JobSeeker> selectByExample(JobSeekerExample example);

    int updateByExampleSelective(@Param("record") JobSeeker record, @Param("example") JobSeekerExample example);

    int updateByExampleWithBLOBs(@Param("record") JobSeeker record, @Param("example") JobSeekerExample example);

    int updateByExample(@Param("record") JobSeeker record, @Param("example") JobSeekerExample example);

	List<JobSeeker> pageQuery(Map<String, Object> paramMap);

	int queryCount(Map<String, Object> paramMap);

}