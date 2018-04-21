package com.kenya.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.text.Element;

/*import org.activiti.engine.identity.User;
import org.apache.poi.hssf.record.UseSelFSRecord;
import org.aspectj.apache.bcel.generic.ReturnaddressType;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kenya.ajaxResult.JsonResult;
import com.kenya.bean.User;
import com.kenya.service.UserService;

import com.kenya.until.GlobalNames;
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
	@RequestMapping(value = "/updatePassWord", method = RequestMethod.GET, produces = "text/json;charset=UTF-8")
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
	@RequestMapping(value = "/login", method = RequestMethod.GET, produces = "text/json;charset=UTF-8")
	public String login(String userPhoneNumber, String userPsw,HttpSession session) {

		// kenYaUserServic.login(userName, userPsw);
		User kenyaUser = kenYaUserServic.login(userPhoneNumber, userPsw);

		// http://localhost:8080/kenYa-test/user/login?userPhoneNumber=52000&userPsw=111

		if (kenyaUser != null) {

			if (kenyaUser.getUserPsw().equals(MD5Util.getMD5(userPsw.getBytes()))) {
				// return kenyaUser;
				// KenyaUser kenyaUser = new KenyaUser();
				//	kenyaUser.setUserName(userName);LOGIN_USER
				session.setAttribute(GlobalNames.LOGIN_USER, kenyaUser);
				kenyaUser.setUserPsw(null);
			
				JsonResult result = JsonResult.getLoginOK(kenyaUser);
				String mapJson = JSON.toJSONString(result);
				
				return mapJson;
			} else {
				String json = JSON.toJSONString(JsonResult.LoginPswError());
				return json;
			}

		} else {
			// KenyaUser kenyaUser = new KenyaUser();
			String json = JSON.toJSONString(JsonResult.UserNoExist());
			return json;

		}

	}

	@ResponseBody
	@RequestMapping(value = "/register", method = RequestMethod.GET, produces = "text/json;charset=UTF-8")
	public String  register(String userName, String userPsw, Integer userSex, Integer userAge, String userPhoneNumber,
			HttpServletRequest request, HttpServletResponse response) {

		// 这里要封装、


		// System.out.println("222");
		// String aString = request.getParameter(userPhonenumber);
		// http://正确localhost:8080/kenya/user/register?userName=w2w&userPsw=11&userSex=1&userAge=2&userPhoneNumber=111111111

	
		if (kenYaUserServic.getPhoneNumberCount(userPhoneNumber) > 0) {
			//KenyaUser kenyaUser = new KenyaUser();
			String json = JSON.toJSONString(JsonResult.UserNameExist());
			return json;
		} else {
			kenYaUserServic.createUser(userName, userPsw, userSex, userAge, userPhoneNumber);
			User user = new User(null, userName, null, userSex, userAge, userPhoneNumber);
			JsonResult result = JsonResult.getOK(user);

			String mapJson = JSON.toJSONString(result);

			return mapJson;
		}

	

	}

}
