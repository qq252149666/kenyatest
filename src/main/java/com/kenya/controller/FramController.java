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
import com.kenya.bean.Fram;
import com.kenya.bean.User;
import com.kenya.dao.DeleteImg;
import com.kenya.service.FramService;
import com.kenya.service.UserService;

@Controller
@RequestMapping("Fram")
public class FramController {

	@Autowired
	FramService framService;
	
	DeleteImg deleteImg = new DeleteImg();
	@Autowired
	UserService userService;
	@RequestMapping("/selectbytype")
	@ResponseBody
	public HashMap<String,Object> selectbytype(@RequestParam(value="pn",defaultValue="1")int pn,@RequestParam(value="framType",defaultValue="不限")String framType){
		HashMap<String,Object> map = new HashMap<String,Object>();
		PageHelper.startPage(pn, 7);
		//第一个查询默认分页
		List<Fram> list = framService.selectbyfile(framType);
		//PageInfo封装分页信息
		PageInfo<Fram> page = new PageInfo<Fram>(list);
		map.put("result", list);
		if(page.isIsLastPage()) {
			map.put("code","040");
		}else {
			map.put("code","000");
		}
		return map; 
	}

	@RequestMapping("/insertfram")
	@ResponseBody
	public HashMap<String, Object> filesUpload(@RequestParam("files") MultipartFile[] files,Fram fram,
            HttpServletRequest request,HttpServletResponse response) throws Exception {
        List<String> list = new ArrayList<String>();
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
            	fram.setFramimgs("/upload/"+list.get(i));
            }
            if(i==1) {
            	fram.setFramimg1("/upload/"+list.get(i));
            }
            if(i==2) {
            	fram.setFramimg2("/upload/"+list.get(i));
            }
            if(i==3) {
            	fram.setFramimg3("/upload/"+list.get(i));
            }
            if(i==4) {
            	fram.setFramimg4("/upload/"+list.get(i));
            }
        }
        HashMap<String,Object> map = new HashMap<String,Object>();
        if(framService.IsNull(fram)=="非法访问") {
        	map.put("code", "040");
        	map.put("message","非法访问");
        	map.put("result",null);
        }else {
        	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(sdf.format(new Date()));
            fram.setFramdate(date);
        	if(framService.inserFram(fram)==1) {
	        	User user = userService.selectbyId(fram.getUserid());
	        	user.setUserPsw("");
	        	fram.setUser(user);
	        	map.put("code","000");
	        	map.put("message","Posting Successfully");
	        	map.put("result",fram);
        	}else {
        		map.put("code","040");
	        	map.put("message","Posting Failed");
	        	map.put("result",null);
        	}
        }
        return map;
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
     * 查询用户发的农林牧信息
     */
    @RequestMapping("/selectByUserId")
    @ResponseBody
    public HashMap<String,Object> selectByUserId(@RequestParam(value="userid",defaultValue="0")int userid,@RequestParam(value="pn",defaultValue="1")int pn){
		HashMap<String,Object> map = new HashMap<String,Object>();
		//page插件 pn页码 7显示几条记录
		PageHelper.startPage(pn, 7);
		List<Fram> list=framService.selectByUserId(userid);
		PageInfo<Fram> page = new PageInfo<Fram>(list);
		if(page.isIsLastPage()) {
			map.put("code","040");
		}else {
			map.put("code","000");
		}
		map.put("result", list);
		return map;
    }
    /**
     * 删除图片
     */
    @RequestMapping("/deleteFram")
	@ResponseBody
	public  HashMap<String, Object> deleteFram(@RequestParam(value="framid",defaultValue="0")int framid,HttpServletRequest request){
    	HashMap<String,Object> map = new HashMap<String,Object>();
		if(framid==0) {
			map.put("code", "040");
			map.put("result", "非法访问");
		}else {
			if(framService.selectById(framid).getFramimgs()!=null) {
				deleteImg.deleteImg(framService.selectById(framid).getFramimgs(), request);
			}
			if(framService.selectById(framid).getFramimg1()!=null) {
				deleteImg.deleteImg(framService.selectById(framid).getFramimg1(), request);
			}
			if(framService.selectById(framid).getFramimg2()!=null) {
				deleteImg.deleteImg(framService.selectById(framid).getFramimg2(), request);
			}
			if(framService.selectById(framid).getFramimg3()!=null) {
				deleteImg.deleteImg(framService.selectById(framid).getFramimg3(), request);
			}
			if(framService.selectById(framid).getFramimg4()!=null) {
				deleteImg.deleteImg(framService.selectById(framid).getFramimg4(), request);
			}
			if(framService.deleteFram(framid)==0) {
				map.put("code", "040");
				map.put("result", "Deleted");
			}else {
				map.put("code", "000");
				map.put("result","Process Failed");
			}
		}
		return map;
	}
}
