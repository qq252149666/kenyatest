package com.kenya.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kenya.bean.User;
import com.kenya.service.UserService;
  
  
@Controller  
@RequestMapping("/user") 
public class UserController {  
	private static Logger log=LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	
	@Autowired
	private LeaseController leaseController;
	@Autowired
	private GoodsController goodsController;
	@Autowired
	private LiveController liveController;
	@Autowired
	private FramController framController;
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
		}
		return map;
	}
	
	
}  
 