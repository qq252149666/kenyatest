package com.kenya.controller;

import java.util.Date;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*import org.activiti.engine.identity.User;
import org.apache.poi.hssf.record.UseSelFSRecord;
import org.aspectj.apache.bcel.generic.ReturnaddressType;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.kenya.ajaxResult.JsonResult;
import com.kenya.bean.User;
import com.kenya.service.UserService;
import com.kenya.until.MD5Util;

/*import com.kenYa.ajaxResult.JsonResult;
import com.kenYa.pojo.KenyaUser;
import com.kenYa.service.kenYaUserService;
import com.kenYa.until.GlobalNames;
import com.kenYa.until.JsonUtils;
import com.kenYa.until.MD5Util;*/

@Controller
@RequestMapping("/user")

public class kenYaUserController {

	// http://:8080/kenYa-test/user/register
	@Autowired
	private UserService kenYaUserServic;
	//private KenyaUser login;
	
	//http://localhost:8080/kenya/user/updatePassWord?userPhoneNumber=52000&userPsw=111
	@ResponseBody
	@RequestMapping(value = "/updatePassWord", produces = "text/json;charset=UTF-8")
	public String updatePassWord(String userPhoneNumber, String userPsw) {
		if (userPhoneNumber!=null&&userPsw!=null&&!userPsw.equals("")){
			Boolean flag = kenYaUserServic.updatePassWord(userPhoneNumber, userPsw);
			if (flag!=null) {
				if(flag) {
					String json = JSON.toJSONString(JsonResult.updatePSOk());
					return json;
				}else {
					return JSON.toJSONString(JsonResult.updatePSFail());
				}
				
			}else {
				String json = JSON.toJSONString(JsonResult.UserNoExist());
				return json;
			}
			
		}else{
			JSON.toJSONString(JsonResult.parameterNotHealth());			
			return JSON.toJSONString(JsonResult.parameterNotHealth());
		}
		
		//return userPsw;
		
	}

	@ResponseBody
	@RequestMapping(value = "/login")
	public HashMap<String,Object> login(String userDeviceId,String userPhoneNumber, String userPsw,HttpSession session,HttpServletRequest request) {
		HashMap<String,Object> map = new HashMap<String,Object>();
		User kenyaUser = kenYaUserServic.login(userPhoneNumber, userPsw);
		if (kenyaUser != null) {
			if (MD5Util.getMD5(userPsw.getBytes()).equals(kenyaUser.getUserPsw())) {
				if(kenyaUser.getUserProhibit().equals("1")) {
					map.put("code","040");
					map.put("result", null);
					map.put("message", "This Account is Forbidden");
				}else {
					kenyaUser.setUserDeviceid(userDeviceId);
					kenyaUser.setUserLoginlasttime(new Date());
					kenYaUserServic.update(kenyaUser);
					kenyaUser.setUserPsw(null);
					map.put("code", "000");
					map.put("result",kenyaUser);
					map.put("message", "Login Successfully");
				}
			} else {
				map.put("code", "040");
				map.put("result",null);
				map.put("message","Password Error");
			}
		} else {
			map.put("code", "040");
			map.put("result",null);
			map.put("message","Sorry! No User!");
		}
		return map;

	}

	
	@RequestMapping(value="/register")
	@ResponseBody
	public HashMap<String,Object>  register(User user,HttpServletRequest request,HttpServletResponse response) throws Exception {
		HashMap<String,Object> map = new HashMap<String,Object>();
		//添加默认值
		user.setUserProhibit("0");
		if (kenYaUserServic.getPhoneNumberCount(user.getUserPhonenumber()) > 0) {
			//KenyaUser kenyaUser = new KenyaUser();
			map.put("result",null);
			map.put("code","040");
			map.put("message","Mobile Number Registered");
		} else {
	        user.setUserDate(new Date());
	        user.setUserHavecar(0);
	        user.setUserProhibit("0");
			if(kenYaUserServic.createUser(user)>0) {
				map.put("result",user);
				map.put("code","000");
				map.put("message","Posting Successfully");
			}else {
				map.put("result",null);
				map.put("code", "040");
				map.put("message","Posting Failed");
			}
		}
		return map;
	}
	

}
