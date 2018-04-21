package com.kenya.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kenya.bean.Project;
import com.kenya.service.ProjectService;

@Controller
@RequestMapping("Project")
public class ProjectController {
	@Autowired
	ProjectService projectService;
	
	@RequestMapping("/selectByFile")
	@ResponseBody
	public HashMap<String,Object> selectByFile(@RequestParam(value="pn",defaultValue="1")int pn,String projectName,@RequestParam(value="minPrice",defaultValue="0")Float minPrice,@RequestParam(value="maxPrice",defaultValue="0")Float maxPrice){
		PageHelper.startPage(pn, 7);
		//第一个查询默认分页
		List<Project> list = projectService.Selectbyfile(projectName,minPrice,maxPrice);
		//PageInfo封装分页信息
		PageInfo<Project> page = new PageInfo<Project>(list);
		//map封装分页数据
		HashMap<String,Object> Projects = new HashMap<String,Object>();
		
		Projects.put("result", list);
		if(page.isIsLastPage()) {
			Projects.put("code","040");
		}else {
			Projects.put("code","000");
		}
		return Projects;
	}
}
