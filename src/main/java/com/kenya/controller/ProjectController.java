package com.kenya.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
	@Autowired
	ProjectService projectService;
	
	@Autowired
	AdminService adminservice;
	
	@RequestMapping("/selectByFile")
	@ResponseBody
	public HashMap<String,Object> selectByFile(@RequestParam(value="pn",defaultValue="1")int pn,String projectName,String Price){
		//返回map集合
		HashMap<String,Object> map = new HashMap<String, Object>();
		//page插件 pn页码 7显示几条记录
		PageHelper.startPage(pn, 7);
		//第一个查询默认分页
		List<Project> list = projectService.Selectbyfile(projectName,Price);
		//PageInfo封装分页信息
		PageInfo<Project> page = new PageInfo<Project>(list);
		//map封装分页数据
		map.put("result", list);
		map.put("count", page.getTotal());;
		map.put("pages", page.getPages());
		if(page.isIsLastPage()) {
			map.put("code","040");
		}else {
			map.put("code","000");
		}
		return map;
	}
	@RequestMapping("/insertProject")
	@ResponseBody
	public  HashMap<String,Object> insertproject(@RequestParam("files")MultipartFile[] files,MultipartFile head,Project project,
            HttpServletRequest request,HttpServletResponse response,String minprice,String maxprice) throws Exception {
		project.setAdminid(Integer.valueOf(String.valueOf(request.getSession().getAttribute("adminid"))));
		System.out.print(project.getProjectprice());
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
        if(maxprice==null) {
        	project.setProjectprice(minprice);
        }else {
        	project.setProjectprice(minprice+"-"+maxprice);
        }
        project.setProjecthead("/upload/"+saveFile(request, head, list,response).get(0));
        //insert准备工作
        for (int i = 0; i < list.size(); i++) {
            if(i==0) {
            	project.setProjectimgs("/upload/"+list.get(i));
            }
            if(i==1) {
            	project.setProjectimg1("/upload/"+list.get(i));
            }
            if(i==2) {
            	project.setProjectimg2("/upload/"+list.get(i));
            }
            if(i==3) {
            	project.setProjectimg3("/upload/"+list.get(i));
            }
            if(i==4) {
            	project.setProjectimg4("/upload/"+list.get(i));
            }
        }
        //返回map
        HashMap<String,Object> map = new HashMap<String,Object>();
        //判断是否有空值
        if(projectService.IsNull(project)=="非法访问") {
        	map.put("code", "040");
        	map.put("message","Invalid Visit");
        	map.put("result",null);
        }else {
        	//数据库添加
        	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            Date date = sdf.parse(sdf.format(new Date()));
            
            project.setProjectdate(date);
        	
        	projectService.insertProject(project);
        	//添加外键
        	Admin user = adminservice.selectbyid(project.getAdminid());
        	//外键中密码为空
        	user.setAdminpassword("");
        	project.setAdmin(user);
        	map.put("code","000");
        	//返回插入的实体类
        	map.put("message", "Posting Successfully");
        	map.put("result",project);
        }
        return map;//跳转的页面
    }
	private List<String> saveFile(HttpServletRequest request,
            MultipartFile file, List<String> list,HttpServletResponse response) throws IOException {
        // 判断文件是否为空
        if (!file.isEmpty()) {
        	Random rand = new Random();//生成随机数    
            int random = rand.nextInt();
            String serverpath = request.getSession().getServletContext()
                    .getRealPath("/");
            String parentpath = new File(serverpath).getParent();
            String filePath = parentpath+"\\upload\\" + String.valueOf(random)+file.getOriginalFilename();
            list.add(random+file.getOriginalFilename());
            File saveDir = new File(filePath);
            if (!saveDir.getParentFile().exists())
                saveDir.getParentFile().mkdirs();
			file.transferTo(saveDir);
        }
        return list;
    }
    /**
     * 删除项目
     */
    @RequestMapping("/deleteProject")
    @ResponseBody
    public HashMap<String,Object> deleteProject(@RequestParam(value="projectid",defaultValue="0")int projectid,HttpServletRequest request){
    	HashMap<String,Object> map = new HashMap<String,Object>();
    	if(projectid==0) {
			map.put("Code", "040");
			map.put("message", "Invalid Visit");
		}else {
			if(projectService.selectbyid(projectid).getProjecthead()!=null) {
				deleteImg.deleteImg(projectService.selectbyid(projectid).getProjecthead(), request);
			}
			if(projectService.selectbyid(projectid).getProjectimgs()!=null) {
				deleteImg.deleteImg(projectService.selectbyid(projectid).getProjectimgs(), request);
			}
			if(projectService.selectbyid(projectid).getProjectimg1()!=null) {
				deleteImg.deleteImg(projectService.selectbyid(projectid).getProjectimg1(), request);
			}
			if(projectService.selectbyid(projectid).getProjectimg2()!=null) {
				deleteImg.deleteImg(projectService.selectbyid(projectid).getProjectimg2(), request);
			}
			if(projectService.selectbyid(projectid).getProjectimg3()!=null) {
				deleteImg.deleteImg(projectService.selectbyid(projectid).getProjectimg3(), request);
			}
			if(projectService.selectbyid(projectid).getProjectimg4()!=null) {
				deleteImg.deleteImg(projectService.selectbyid(projectid).getProjectimg4(), request);
			}
			if(projectService.deleteProject(projectid)==0) {
				map.put("code", "040");
				map.put("message", "Process Failed");
			}else {
				map.put("code", "000");
				map.put("message","Deleted");
			}
		}
    	return map;
    }
    @RequestMapping("/selectById")
    @ResponseBody
    public HashMap<String,Object> selectById(int projectid){
    	HashMap<String,Object> map = new HashMap<String,Object>();
    	Project project;
    	project = projectService.selectbyid(projectid);
    	if(project==null) {
    		map.put("result", project);
        	map.put("code", "000");
        	map.put("message", "查询失败");
    	}else {
	    	map.put("result", project);
	    	map.put("code", "000");
	    	map.put("message", "查询成功");
    	}
		return map;
    	
    }
}
