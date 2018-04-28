package com.kenya.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenya.bean.Project;
import com.kenya.bean.ProjectExample;
import com.kenya.bean.ProjectExample.Criteria;
import com.kenya.dao.ProjectMapper;
import com.kenya.service.ProjectService;
@Service
public class ProjectServiceImpl implements ProjectService{
	@Autowired
	ProjectMapper projectDao;

	/**
	 * 项目找资金
	 */
	public List<Project> Selectbyfile(String projectName,String Price) {
			ProjectExample example = new ProjectExample();
			Criteria criteria = example.createCriteria();
			if(projectName!=null) {
				criteria.andProjectnameLike("%"+projectName+"%");
			}
			if(Price!=null) {
				criteria.andProjectpriceLike("%"+Price+"%");
			}
			return projectDao.selectByExample(example);
	}

	public int insertProject(Project project) {
		return projectDao.insert(project);
	}

	public String IsNull(Project project) {
		if(project.getProjectname()==null) {
			return "非法访问";
		}
		if(project.getProjectdesc()==null) {
			return "非法访问";
		}
		if(project.getProjectphone()==null) {
			return "非法访问";
		}
		if(project.getProjectuser()==null) {
			return "非法访问";
		}
		if(project.getProjectphone()==null) {
			return "非法访问";
		}
		if(project.getProjectimgs()==null) {
			return "非法访问";
		}
		return "";
	}

	@Override
	public Project selectbyid(int id) {
		return projectDao.selectByPrimaryKey(id);
	}



	
	
}
