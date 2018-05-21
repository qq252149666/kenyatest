package com.kenya.controller;


import java.io.File;
import java.io.IOException;
import java.text.ParseException;
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
import com.kenya.bean.Lease;
import com.kenya.bean.User;
import com.kenya.dao.DeleteImg;
import com.kenya.service.LeaseService;
import com.kenya.service.UserService;
/**
 * 同城信息
 * @author Administrator
 *
 */

@Controller  
@RequestMapping("/Lease")
public class LeaseController {
	@Autowired
	LeaseService leaseService;
	HashMap<String,Object> map = new HashMap<String,Object>();
	int i;
	@Autowired
	UserService userService;
	DeleteImg deleteImg = new DeleteImg();
	/**
	 * 查询
	 * @param leaseName
	 * @param pn
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/selectByFile")
	@ResponseBody
	public  HashMap<String, Object> SelectByFile(@RequestParam(value="leaseName",defaultValue="") String leaseName,@RequestParam(value="pn",defaultValue="1")Integer pn) throws Exception  {
		//返回map集合
		HashMap<String,Object> map = new HashMap<String, Object>();
		//page插件 pn页码 7显示几条记录
		PageHelper.startPage(pn, 7);
		//第一个查询默认分页
		List<Lease> list = leaseService.selectByFild(leaseName);
		//PageInfo封装分页信息
		PageInfo<Lease> page = new PageInfo<Lease>(list);
		//map封装分页数据
		map.put("result", list);
		if(page.isIsLastPage()) {
			map.put("code","040");
		}else {
			map.put("code","000");
		}
		return map; 
	}
	/**
	 * 上传图片
	 * @throws IOException 
	 * @throws ParseException 
	 */
	@RequestMapping("/inserLease")
	@ResponseBody
    public HashMap<String, Object> filesUpload(@RequestParam("files") MultipartFile[] files,Lease lease,
            HttpServletRequest request,HttpServletResponse response) throws IOException, ParseException {
		List<String> list = new ArrayList<String>();
        if (files != null && files.length > 0) {
            for (i = 0; i < files.length; i++) {
                MultipartFile file = files[i];
				list = saveFile(request, file, list,response);
            }
        }
        //insert准备工作
        for (int i = 0; i < list.size(); i++) {
            if(i==0) {
            	lease.setLeaseimgs("/upload/"+list.get(i));
            }
            if(i==1) {
            	lease.setLeaseimg1("/upload/"+list.get(i));
            }
            if(i==2) {
            	lease.setLeaseimg2("/upload/"+list.get(i));
            }
            if(i==3) {
            	lease.setLeaseimg3("/upload/"+list.get(i));
            }
            if(i==4) {
            	lease.setLeaseimg4("/upload/"+list.get(i));
            }
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date = sdf.parse(sdf.format(new Date()));
        
        lease.setLeasedate(date);
        if(leaseService.IsNull(lease)=="非法访问") {
        	map.put("code", "040");
        	map.put("result",null);
        	map.put("message", "Invalid Visit");
        }else {
        	User user = userService.selectbyId(lease.getUserid());
        	user.setUserPsw("");
        	lease.setUser(user);
        	leaseService.insert(lease);
        	map.put("code","000");
        	map.put("result",lease);
        	map.put("message", "Posting Successfully");
        }
        
        return map;//跳转的页面
    }

    private List<String> saveFile(HttpServletRequest request,
            MultipartFile file, List<String> list,HttpServletResponse response) throws IOException {
        // 判断文件是否为空
        if (!file.isEmpty()) {
        	Random rand = new Random();//生成随机数    
            int random = rand.nextInt();
            String serverpath = "C:/usr/local/tomcat/upload";
            String parentpath = new File(serverpath).getParent();
            String filePath = parentpath+"/upload/" + String.valueOf(random)+file.getOriginalFilename();
            System.out.println(filePath);
            list.add(random+file.getOriginalFilename());
            File saveDir = new File(filePath);
            if (!saveDir.getParentFile().exists())
                saveDir.getParentFile().mkdirs();
			file.transferTo(saveDir);
        }
        return list;
    }
    /**
     * 删除图片
     */
    @RequestMapping("/deleteLease")
	@ResponseBody
	public  HashMap<String, Object> deleteLease(@RequestParam(value="leaseid",defaultValue="0")int leaseid,HttpServletRequest request){
    	HashMap<String,Object> map = new HashMap<String,Object>();
		if(leaseid==0) {
			map.put("Code", "040");
			map.put("message", "Invalid Visit");
		}else {
			if(leaseService.selectById(leaseid).getLeaseimgs()!=null) {
				deleteImg.deleteImg(leaseService.selectById(leaseid).getLeaseimgs(), request);
			}
			if(leaseService.selectById(leaseid).getLeaseimg1()!=null) {
				deleteImg.deleteImg(leaseService.selectById(leaseid).getLeaseimg1(), request);
			}
			if(leaseService.selectById(leaseid).getLeaseimg2()!=null) {
				deleteImg.deleteImg(leaseService.selectById(leaseid).getLeaseimg2(), request);
			}
			if(leaseService.selectById(leaseid).getLeaseimg3()!=null) {
				deleteImg.deleteImg(leaseService.selectById(leaseid).getLeaseimg3(), request);
			}
			if(leaseService.selectById(leaseid).getLeaseimg4()!=null) {
				deleteImg.deleteImg(leaseService.selectById(leaseid).getLeaseimg4(), request);
			}
			if(leaseService.delete(leaseid)==0) {
				map.put("code", "040");
				map.put("message", "Process Failed");
			}else {
				map.put("code", "000");
				map.put("message","Deleted");
			}
		}
		return map;
	}
    /**
     * 查询用户发布的信息
     */
    @RequestMapping("/selectByUserId")
    @ResponseBody
    public HashMap<String,Object> selectByUserId(@RequestParam(value="userid",defaultValue="0")int userid,@RequestParam(value="pn",defaultValue="1")int pn){
		HashMap<String,Object> map = new HashMap<String,Object>();
		//page插件 pn页码 7显示几条记录
		PageHelper.startPage(pn, 7);
		List<Lease> list=leaseService.selectByUserId(userid);
		PageInfo<Lease> page = new PageInfo<Lease>(list);
		if(page.isIsLastPage()) {
			map.put("code","040");
		}else {
			map.put("code","000");
		}
		map.put("result", list);
		return map;
    }
}
    

