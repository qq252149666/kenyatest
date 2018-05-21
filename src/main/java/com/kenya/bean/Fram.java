package com.kenya.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Fram {
    private Integer framid;

    private String framname;

    private String framimgs;

    private String framimg1;

    private String framimg2;

    private String framimg3;

    private String framimg4;

    private String framtype;

    private String framuser;

    private String framphone;

    private Integer userid;

    private String framdesc;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date framdate;

    private User user;
    
    public Date getFramdate() {
		return framdate;
	}


	public void setFramdate(Date framdate) {
		this.framdate = framdate;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Integer getFramid() {
        return framid;
    }
    

    public void setFramid(Integer framid) {
        this.framid = framid;
    }

    public String getFramname() {
        return framname;
    }

    public void setFramname(String framname) {
        this.framname = framname == null ? null : framname.trim();
    }

    public String getFramimgs() {
        return framimgs;
    }

    public void setFramimgs(String framimgs) {
        this.framimgs = framimgs == null ? null : framimgs.trim();
    }

    public String getFramimg1() {
        return framimg1;
    }

    public void setFramimg1(String framimg1) {
        this.framimg1 = framimg1 == null ? null : framimg1.trim();
    }

    public String getFramimg2() {
        return framimg2;
    }

    public void setFramimg2(String framimg2) {
        this.framimg2 = framimg2 == null ? null : framimg2.trim();
    }

    public String getFramimg3() {
        return framimg3;
    }

    public void setFramimg3(String framimg3) {
        this.framimg3 = framimg3 == null ? null : framimg3.trim();
    }

    public String getFramimg4() {
        return framimg4;
    }

    public void setFramimg4(String framimg4) {
        this.framimg4 = framimg4 == null ? null : framimg4.trim();
    }

    public String getFramtype() {
        return framtype;
    }

    public void setFramtype(String framtype) {
        this.framtype = framtype == null ? null : framtype.trim();
    }

    public String getFramuser() {
        return framuser;
    }

    public void setFramuser(String framuser) {
        this.framuser = framuser == null ? null : framuser.trim();
    }

    public String getFramphone() {
        return framphone;
    }

    public void setFramphone(String framphone) {
        this.framphone = framphone == null ? null : framphone.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getFramdesc() {
        return framdesc;
    }

    public void setFramdesc(String framdesc) {
        this.framdesc = framdesc == null ? null : framdesc.trim();
    }
}