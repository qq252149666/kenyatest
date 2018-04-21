package com.kenya.bean;


import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Job {
	/*Gson gson =   new GsonBuilder() */
    private Integer jobid;

    private Integer userid;

    private String name;

    private String headimg;

    private String sex;

    private String jobwant;

    private String phone;



	private String birthday;
	
    private String jointime;

    private Double hopesalary;

    private String persondesc;
    
    private int age ;

    public Integer getJobid() { 
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg == null ? null : headimg.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getJobwant() {
        return jobwant;
    }

    public void setJobwant(String jobwant) {
        this.jobwant = jobwant == null ? null : jobwant.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getJointime() {
        return jointime;
    }

    public void setJointime(String jointime) {
    	
        this.jointime = jointime;
    }

    public Double getHopesalary() {
        return hopesalary;
    }

    public void setHopesalary(Double hopesalary) {
        this.hopesalary = hopesalary;
    }

    public String getPersondesc() {
        return persondesc;
    }

    public void setPersondesc(String persondesc) {
        this.persondesc = persondesc == null ? null : persondesc.trim();
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    private  String transferLongToDate(String dateFormat,Long millSec){

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);

        Date date= new Date(millSec);

               return sdf.format(date);

       }
    
 
}