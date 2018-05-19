package com.kenya.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.kenya.bean.User;
import com.kenya.dao.DeleteImg;
import com.kenya.service.UserService;
  
  
@Controller  
@RequestMapping("/user") 
public class UserController {  
	private static Logger log=LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	DeleteImg deleteImg=new DeleteImg();
	
	@Autowired
	private LeaseController leaseController;
	@Autowired
	private GoodsController goodsController;
	@Autowired
	private LiveController liveController;
	@Autowired
	private FramController framController;
	@Autowired
	private JobSeekerController jobseekerController;
	@Autowired
	private CompanyController companyController;
	@RequestMapping("/selectAll")
	public @ResponseBody List<User> SelectAll(Map<String, Object> model) {

        List<User> users = userService.selectAll(); 
        log.info(users.toString());
        return users; 
	}
	/**
	 * 用户发布的信息
	 */
	@RequestMapping("selectByUserId")
	@ResponseBody
	public HashMap<String,Object> selectByUser(int userid,String Type,@RequestParam(value="pn",defaultValue="1") int pn) {
		HashMap<String,Object> map = new HashMap<String,Object>();
		switch(Type) {
			case "租房":
				map=leaseController.selectByUserId(userid, pn);
				break;
			case "二手":
				map=goodsController.selectByUserId(userid, pn);
				break;
			case "生活服务":
				map=liveController.selectByUserId(userid, pn);
				break;
			case "农林牧":
				map=framController.selectByUserId(userid, pn);
				break;
			case "求职":
				map=jobseekerController.selectByUserId(userid, pn);
				break;
			case "招聘":
				map=companyController.selectByUserId(userid, pn);
				break;
		}
		return map;
	}
	@RequestMapping("deleteByUserId")
	@ResponseBody
	public HashMap<String,Object> deleteByUserId(int id,String Type,HttpServletRequest request) {
		HashMap<String,Object> map = new HashMap<String,Object>();
		switch(Type) {
			case "租房":
				map=leaseController.deleteLease(id, request);
				break;
			case "二手":
				map=goodsController.deleteGoods(id, request);
				break;
			case "生活服务":
				map=liveController.deletelive(id, request);
				break;
			case "农林牧":
				map=framController.deleteFram(id, request);
				break;
			case "求职":
				map=jobseekerController.deletejob(id, request);
				break;
			case "招聘":
				map=companyController.deleteCompany(id, request);
				break;
		}
		return map;
	}
	@RequestMapping("/updatePortrait")
	@ResponseBody
	public HashMap<String,Object> updatePortrait(MultipartFile file,int id,String Type,HttpServletRequest request) {
		HashMap<String,Object> map =new HashMap<String,Object>();
		User user = userService.selectbyId(id);
		if(file!=null) {
			if (!file.isEmpty()) {
				if(user.getUserPortrait()!=null) {
					deleteImg.deleteImg(user.getUserPortrait(), request);
				}
	        	Random rand = new Random();//生成随机数    
	            int random = rand.nextInt();
	            String serverpath = request.getSession().getServletContext()
	                    .getRealPath("/");
	            String parentpath = new File(serverpath).getParent();
	            String filePath = parentpath+"\\upload\\" + String.valueOf(random)+file.getOriginalFilename();
	            File saveDir = new File(filePath);
	            if (!saveDir.getParentFile().exists())
	                saveDir.getParentFile().mkdirs();
	            try {
					file.transferTo(saveDir);
				} catch (IllegalStateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
	            user.setUserPortrait("/upload/"+random+file.getOriginalFilename());
	    	}
		}
		if(userService.update(user)==1) {
			map.put("message", "Modify Successfully");
			map.put("code", "000");
			map.put("result", user);
		}else {
			map.put("message","Process Failed");
			map.put("code","040");
			map.put("result", user);
		}
		return map;
	}
	@RequestMapping("/updateuserName")
	@ResponseBody
	public HashMap<String,Object> updateuserName(String userName,int id,String Type,HttpServletRequest request) {
		HashMap<String,Object> map =new HashMap<String,Object>();
		User user = userService.selectbyId(id);
		if(userName!=null) {
			user.setUserName(userName);
		}
		if(userService.update(user)==1) {
			map.put("message", "Modify Successfully");
			map.put("code", "000");
		}else {
			map.put("message","Process Failed");
			map.put("code","040");
		}
		return map;
	}
	
	@RequestMapping("/updateUser")
	@ResponseBody
	public HashMap<String,Object> updateUser(String birthday,User user,HttpServletRequest request) throws Exception{
		HashMap<String,Object> map =new HashMap<String,Object>();
		User users = userService.selectbyId(user.getUserId());
		if(birthday!=null&&!birthday.equals("")) {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date date=sdf.parse(birthday);
			users.setUserBirthday(date);
		}
		if(user.getUserSex()!=null) {
			users.setUserSex(user.getUserSex());
		}
		if(user.getUserName()!=null) {
			users.setUserName(user.getUserName());
		}
	
		if(userService.update(users)==1) {
			map.put("message", "Modify Successfully");
			map.put("code", "000");
			map.put("result", users);
		}else {
			map.put("message","Process Failed");
			map.put("code","040");
			map.put("result", null);
		}
		return map;
	}
	/**
	 * 发送验证码
	 */
	@RequestMapping("/getCode")
	@ResponseBody
	public HashMap<String,Object> Code(String phone){
		HashMap<String, Object> map = new HashMap<String,Object>();
		SendMsgUtil sendMsgUtil = new SendMsgUtil();
    	map = sendMsgUtil.sendMsg(phone, "[Bright Light] your verification code "+SendMsgUtil.createRandomVcode());
        if(map.get("code").equals(100)) {
        	map.put("code", "000");
        	map.put("message", "Post Successfully");
        	map.put("verificationCode", SendMsgUtil.createRandomVcode());
        }else {
        	map.put("code", "040");
        	map.put("message", "Post Failed");
        	map.put("verificationCode", null);
        }
		return map;
	}
	/**
	 * 自动登陆
	 */
	@RequestMapping("/loged")
	@ResponseBody
	public HashMap<String,Object> loged(String deviceId,int userId){
		HashMap<String,Object> map = new HashMap<String,Object>();
		if(userId==0) {
			map.put("code", "040");
			map.put("result", null);
			map.put("message", "Process Failed");
		}else {
			User user = userService.selectbyId(userId);
			if(user.getUserDeviceid()!=null&&user.getUserDeviceid().equals(deviceId)) {
				//获取当前时间
				Date date = new Date();
				long nd = 1000 * 24 * 60 * 60;
				long diff = date.getTime()-user.getUserLoginlasttime().getTime();
				long day = diff / nd;
				if(day>7) {
					map.put("code", "040");
					map.put("result", null);
					map.put("message", "Logon Failure");
				}else {
					user.setUserLoginlasttime(new Date());
					userService.update(user);
					map.put("code", "000");
					map.put("result", user);
					map.put("message", "Login Successfully");
				}
			}else {
				map.put("code", "040");
				map.put("result", null);
				map.put("message", "Logon Failure");
			}
		}
		return map;
	}
}  
 