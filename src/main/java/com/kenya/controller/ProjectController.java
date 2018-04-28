package com.kenya.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kenya.bean.Admin;
import com.kenya.bean.Project;
import com.kenya.dao.DeleteImg;
import com.kenya.service.AdminService;
import com.kenya.service.ProjectService;

@Controller
@RequestMapping("Project")
public class ProjectController {
	DeleteImg deleteImg = new DeleteImg();
	int i;
	HashMap<String,Object> map = new HashMap<String,Object>();
	@Autowired
	ProjectService projectService;
	
	@Autowired
	AdminService adminservice;
	
	@RequestMapping("/selectByFile")
	@ResponseBody
	public HashMap<String,Object> selectByFile(@RequestParam(value="pn",defaultValue="1")int pn,String projectName,String Price){
		PageHelper.startPage(pn, 7);
		//第一个查询默认分页
		List<Project> list = projectService.Selectbyfile(projectName,Price);
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
	@RequestMapping("/insertProject")
	@ResponseBody
	public  HashMap<String,Object> insertproject(@RequestParam("files")MultipartFile[] files,Project project,
            HttpServletRequest request,HttpServletResponse response) throws Exception {
		project.setAdminid(Integer.valueOf(String.valueOf(request.getSession().getAttribute("adminid"))));
		List<String> list = new ArrayList<String>();
		//遍历获得的MultiparFile数组
        if (files != null && files.length > 0) {
            for (int i = 0; i < files.length; i++) {
                MultipartFile file = files[i];
                // 保存文件
                try {
					list = saveFile(request, file, list,response);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        }
        //insert准备工作
        for (int i = 0; i < list.size(); i++) {
            if(i==0) {
            	project.setProjectimgs("/kenya/upload/"+list.get(i));
            }
            if(i==1) {
            	project.setProjectimg1("/kenya/upload/"+list.get(i));
            }
            if(i==2) {
            	project.setProjectimg2("/kenya/upload/"+list.get(i));
            }
            if(i==3) {
            	project.setProjectimg3("/kenya/upload/"+list.get(i));
            }
            if(i==4) {
            	project.setProjectimg4("/kenya/upload/"+list.get(i));
            }
        }
        //返回map
        HashMap<String,Object> map = new HashMap<String,Object>();
        //判断是否有空值
        if(projectService.IsNull(project)=="非法访问") {
        	map.put("code", "040");
        	map.put("result","非法访问");
        }else {
        	//数据库添加
        	projectService.insertProject(project);
        	//添加外键
        	Admin user = adminservice.selectbyid(project.getAdminid());
        	//外键中密码为空
        	user.setAdminpassword("");
        	project.setAdmin(user);
        	map.put("code","000");
        	//返回插入的实体类
        	map.put("result",project);
        }
        return map;//跳转的页面
    }
    private List<String> saveFile(HttpServletRequest request,
            MultipartFile file, List<String> list,HttpServletResponse response) throws IOException {
    	if (!file.isEmpty()) {
        	Random rand = new Random();//生成随机数    
            int random = rand.nextInt();
            String filePath = request.getSession().getServletContext()
                    .getRealPath("/")
                    + "upload/" + String.valueOf(random)+file.getOriginalFilename();
            list.add(random+file.getOriginalFilename());
            File saveDir = new File(filePath);
            if (!saveDir.getParentFile().exists())
                saveDir.getParentFile().mkdirs();
			file.transferTo(saveDir);
        }
    return list;
    }
}
