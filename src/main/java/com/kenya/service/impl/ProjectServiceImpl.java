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
	public List<Project> Selectbyfile(String projectName,Float minPrice,Float maxPrice) {
		if(projectName!=null&&!projectName.equals("")) {
			ProjectExample example = new ProjectExample();
			Criteria criteria = example.createCriteria();
			criteria.andProjectnameLike("%"+projectName+"%");
			if(maxPrice!=0&&minPrice!=0) {
				criteria.andProjectpriceBetween(minPrice,maxPrice);
			}
			else if(minPrice!=0) {
				criteria.andProjectpriceBetween(minPrice,Float.MAX_VALUE);
			}
			else if(maxPrice!=0) {
				criteria.andProjectpriceBetween(Float.valueOf(0),maxPrice);
			}
			return projectDao.selectByExample(example);
		}else {
			ProjectExample example = new ProjectExample();
			Criteria criteria = example.createCriteria();
			if(maxPrice!=0&&minPrice!=0) {
				criteria.andProjectpriceBetween(minPrice,maxPrice);
			}
			else if(minPrice!=0) {
				criteria.andProjectpriceBetween(minPrice,Float.MAX_VALUE);
			}
			else if(maxPrice!=0) {
				criteria.andProjectpriceBetween(Float.valueOf(0),maxPrice);
			}
			return projectDao.selectByExample(example);
		}
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
