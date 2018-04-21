package com.kenya.dao;

import com.kenya.bean.User;
import com.kenya.bean.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    /*  int updateByUserPN (KenyaUser record);*/
    
    /*  //查询一个用户名的数量
      public Integer getUserNameCount(String username);*/
      //   //根据用用户手机号查询
      public User ByUserPhoneNumber(String userPhoneNumber);
      	//ByUserPhoneNumber s 
      //修改用户信息//updatePassWord  updatePassWord  
      public Integer updatePassWord (@Param("userId") Integer userId,@Param("userName") String userName,@Param("userPS") String userPS,
      		@Param("userSex") Integer userSex,@Param("userAge") Integer userAge,@Param("userPN") String userPN);
      //Public User selectUser(@param(“userName”) String name,@param(“userpassword”) String password);
      
      
      //根据用户名查询数量
  	User getUserDetailsByPN(String  PhoneNumber);
  	
  	User getUserDetailsById(Integer id);//根据id用户详情
  	
  	public Integer getPhoneNumberCount (String userPhoneNumber);////根据用户手机号查询数量多少
  	//updatePassWord
      
    
}