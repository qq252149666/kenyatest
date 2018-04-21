package com.kenya.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenya.bean.User;
import com.kenya.dao.UserMapper;
import com.kenya.service.UserService;
import com.kenya.until.MD5Util;

/*import com.alibaba.druid.sql.ast.statement.SQLIfStatement.Else;
import com.alibaba.fastjson.JSON;
import com.kenYa.ajaxResult.JsonResult;
import com.kenYa.ajaxResult.ParameterException;
import com.kenYa.ajaxResult.JsonCodeEnum;
//import com.kenYa.controller.ExceptionController;
import com.kenYa.exception.MyException;
import com.kenYa.exception.MyExceptionHandler;
import com.kenYa.mapper.KenyaUserMapper;
import com.kenYa.output.UserDetails;
import com.kenYa.pojo.KenyaUser;
import com.kenYa.pojo.KenyaUserExample;
import com.kenYa.pojo.KenyaUserExample.Criteria;
import com.kenYa.service.kenYaUserService;
import com.kenYa.until.MD5Util;

import test.HandleException;
*/
/*import static com.google.common.base.Preconditions.checkNotNull;*/

@Service

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper kenyaUserMapper;
	@Autowired
	private UserMapper userdao;
	
	
	
	public List<User> selectAll() {
		
		return userdao.selectByExample(null);
	}

	public void insertUser(User KenyaUser) {
		// TODO Auto-generated method stub

	}
	// ExceptionController1 exceptionController = new ExceptionController1();

	// 鑾峰彇鐢ㄦ埛璇︾粏淇℃伅锛堥�氳繃id锛�
	public User getUserDetails(Integer userId) {
		
		User e = kenyaUserMapper.getUserDetailsById(userId);
		if (e == null) {
			// throw new MyException("璇ョ敤鎴蜂俊鎭笉瀛樺湪");
			// myExceptionHandler.resolveException(request, response, handler, ex)
			return null;
		}
		/*
		 * List<Role> roles = roleMapper.getRoleListByUserId(userId);
		 * userDetails.setRoles(roles); return userDetails;
		 */
		return e;
	}
	
	public User login(String userPhoneNumber, String password) {

		User kenyaUser = kenyaUserMapper.ByUserPhoneNumber(userPhoneNumber);

		if (kenyaUser != null) {
			//System.out.println(kenyaUser.getUserName());
			return kenyaUser;

		} else {
			return null;
		}
	}


	public void createUser(String userName, String psw, Integer userSex, int userAge, String userPhonenumber) {
		

		User kenyaUser = new User();
		kenyaUser.setUserName(userName);
		kenyaUser.setUserPsw(MD5Util.getMD5(psw.getBytes()));
		kenyaUser.setUserSex(userSex);
		kenyaUser.setUserAge(userAge);
		kenyaUser.setUserPhonenumber(userPhonenumber);
		kenyaUserMapper.insert(kenyaUser);	

	}

	
	// 鏍规嵁鎵嬫満鏌ヨ鏁伴噺
	public Integer getPhoneNumberCount(String PhoneNumber) {
		Integer count = kenyaUserMapper.getPhoneNumberCount(PhoneNumber);
		return count;
	}

	public Boolean updatePassWord(String userPhoneNumber, String userPsw) {
		if(kenyaUserMapper.getPhoneNumberCount(userPhoneNumber)>0) {
			//鏇存柊瀵嗙爜,涓嶈兘鍜屼笂娆″瘑鐮佺浉鍚�
			User kenyaUser = kenyaUserMapper.ByUserPhoneNumber(userPhoneNumber);
			if (kenyaUser.getUserPsw().equals(MD5Util.getMD5(userPsw.getBytes()))) {
				return false;
				
			} else {
				String updatePW = MD5Util.getMD5(userPsw.getBytes());
				//kenyaUserMapper.updatePassWord(null, null, userPsw, null, null,userPhoneNumber);
				kenyaUserMapper.updatePassWord(null, null, updatePW, null, null, userPhoneNumber);
				return true;
			}
			
		}else {
			return null;
		}
	}
	
	/**
	 * 根据ID查询记录
	 */
	public User selectbyId(int id) {
		return userdao.selectByPrimaryKey(id);
	}



}
