package com.kenya.service;

import java.util.List;

import com.kenya.bean.Project;

public interface ProjectService {
	/**
	 * 璧勯噾鎵鹃」鐩� map浼犻�掓潯浠�
	 * @param map
	 * @return
	 */
	public List<Project> Selectbyfile(String projectName,String Price);
	/**
	 * 娣诲姞椤圭洰
	 */
	public int insertProject(Project project);
	/**
	 * 鍒ゆ柇闈炵┖
	 */
	public String IsNull(Project project);
	/**
	 * 鏍规嵁id鏌ユ壘project
	 */
	public Project selectbyid(int id);
	/**
	 * 删除project
	 */
	public int deleteProject(int id);
}
