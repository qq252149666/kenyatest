package com.kenya.service;

import java.util.List;

import com.kenya.bean.Project;

public interface ProjectService {
	/**
	 * 资金找项目 map传递条件
	 * @param map
	 * @return
	 */
	public List<Project> Selectbyfile(String projectName,Float minPrice,Float maxPrice);
	/**
	 * 添加项目
	 */
	public int insertProject(Project project);
	/**
	 * 判断非空
	 */
	public String IsNull(Project project);
	/**
	 * 根据id查找project
	 */
	public Project selectbyid(int id);
}
