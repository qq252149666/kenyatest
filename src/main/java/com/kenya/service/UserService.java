package com.kenya.service;

import java.util.List;


import com.kenya.bean.User;

public interface UserService {
	public List<User> selectAll();
	
	public void insertUser(User KenyaUser);
	
	//public int insertUserRoles(Integer userid, Datas ds);

	public User login(String userPhoneNumber ,String password);//登录用户
	
	public void createUser(String userName,String psw,Integer userSex,int userAge,String userPhoneNumber);//创建用户
	
	public User getUserDetails(Integer userId);// 获取用户详情
	
	public Integer getPhoneNumberCount (String userPhoneNumber);//根据手机号得到数量
	
	public Boolean updatePassWord (String userPhoneNumber,String userPsw);//修改密码
	public User selectbyId(int id);//根据id 查询

}
