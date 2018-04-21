package com.kenya.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kenya.bean.Admin;
import com.kenya.service.AdminService;

@Controller
@RequestMapping("Admin")
public class AdminController {
	@Autowired
	AdminService adminservice;
	
	@RequestMapping("/login")
	@ResponseBody
	public Admin login(String adminUser,String adminPassword,HttpServletRequest request,HttpServletResponse response) {
		Admin admin = null;
		admin = adminservice.login(adminUser, adminPassword);
		if(admin!=null) {
			request.getSession().setAttribute("UserName", admin.getAdminuser());
			request.getSession().setAttribute("adminPassword",admin.getAdminpassword());
			request.getSession().setAttribute("adminid",admin.getAdminid());
			return admin;
		}else {
			return null;
		}
	}
}
