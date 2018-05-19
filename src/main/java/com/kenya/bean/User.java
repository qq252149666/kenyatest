package com.kenya.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class User {
    private Integer userId;

    private String userName;

    private String userPsw;

    private Integer userSex;

    private String userPhonenumber;

    private Integer userHavecar;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date userBirthday;

    private String userPortrait;

    private String userProhibit;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date userDate;

    private String userDeviceid;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date userLoginlasttime;

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

    public String getUserPhonenumber() {
        return userPhonenumber;
    }

    public void setUserPhonenumber(String userPhonenumber) {
        this.userPhonenumber = userPhonenumber == null ? null : userPhonenumber.trim();
    }

    public Integer getUserHavecar() {
        return userHavecar;
    }

    public void setUserHavecar(Integer userHavecar) {
        this.userHavecar = userHavecar;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserPortrait() {
        return userPortrait;
    }

    public void setUserPortrait(String userPortrait) {
        this.userPortrait = userPortrait == null ? null : userPortrait.trim();
    }

    public String getUserProhibit() {
        return userProhibit;
    }

    public void setUserProhibit(String userProhibit) {
        this.userProhibit = userProhibit == null ? null : userProhibit.trim();
    }

    public Date getUserDate() {
        return userDate;
    }

    public void setUserDate(Date userDate) {
        this.userDate = userDate;
    }

    public String getUserDeviceid() {
        return userDeviceid;
    }

    public void setUserDeviceid(String userDeviceid) {
        this.userDeviceid = userDeviceid == null ? null : userDeviceid.trim();
    }

    public Date getUserLoginlasttime() {
        return userLoginlasttime;
    }

    public void setUserLoginlasttime(Date userLoginlasttime) {
        this.userLoginlasttime = userLoginlasttime;
    }
}