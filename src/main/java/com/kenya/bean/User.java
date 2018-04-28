package com.kenya.bean;

import java.util.Date;

public class User {
    private Integer userId;

    private String userName;

    private String userPsw;

    private Integer userSex;

    private Integer userAge;

    private String userPhonenumber;
    
    private String userHaveCar;
    
    private String  userBirthday;

    private String  userPortrait;
    
    private String  userProhibit;
    
    
   

	public User(Integer userId, String userName, String userPsw, Integer userSex,
			String userPhonenumber, String userBirthday, String userPortrait, String  userProhibit) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPsw = userPsw;
		this.userSex = userSex;
	
		this.userPhonenumber = userPhonenumber;
		this.userBirthday = userBirthday;
		this.userPortrait = userPortrait;
		this.userProhibit = userProhibit;
	}

	public String getUserBirthday() {
		return userBirthday;
	}

	public void setUserBirthday(String userBirthday) {
		this.userBirthday = userBirthday;
	}

	public String getUserPortrait() {
		return userPortrait;
	}

	public void setUserPortrait(String userPortrait) {
		this.userPortrait = userPortrait;
	}

	public String  getUserProhibit() {
		return userProhibit;
	}

	public void setUserProhibit(String userProhibit) {
		this.userProhibit = userProhibit;
	}

	public User() {
		super();
	}

	public User(Integer userId, String userName, String userPsw, Integer userSex, Integer userAge,
			String userPhonenumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPsw = userPsw;
		this.userSex = userSex;
		this.userAge = userAge;
		this.userPhonenumber = userPhonenumber;
	}

	public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPsw() {
        return userPsw;
    }

    public void setUserPsw(String userPsw) {
        this.userPsw = userPsw == null ? null : userPsw.trim();
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserPhonenumber() {
        return userPhonenumber;
    }

    public void setUserPhonenumber(String userPhonenumber) {
        this.userPhonenumber = userPhonenumber == null ? null : userPhonenumber.trim();
    }
    @Override
   	public String toString() {
   		return "User [userId=" + userId + ", userName=" + userName + ", userPsw=" + userPsw + ", userSex=" + userSex
   				+ ", userAge=" + userAge + ", userPhonenumber=" + userPhonenumber + "]";
   	}
}