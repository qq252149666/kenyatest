package com.kenya.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Live {
    private Integer liveid;

    private String livephone;

    private String livename;

    private String livetype;

    private String liveimgs;

    private String liveimg1;

    private String liveimg2;

    private String liveimg3;

    private String liveimg4;

    private Integer userid;

    private String liveuser;
    
    private String livedesc;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date livedate;
    
    private User user;

    
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getLiveid() {
        return liveid;
    }
	

    public String getLiveuser() {
		return liveuser;
	}

	public void setLiveuser(String liveuser) {
		this.liveuser = liveuser;
	}

	public void setLiveid(Integer liveid) {
        this.liveid = liveid;
    }

    public String getLivephone() {
        return livephone;
    }

    public void setLivephone(String livephone) {
        this.livephone = livephone == null ? null : livephone.trim();
    }

    public String getLivename() {
        return livename;
    }

    public void setLivename(String livename) {
        this.livename = livename == null ? null : livename.trim();
    }

    public String getLivetype() {
        return livetype;
    }

    public void setLivetype(String livetype) {
        this.livetype = livetype == null ? null : livetype.trim();
    }

    public String getLiveimgs() {
        return liveimgs;
    }

    public void setLiveimgs(String liveimgs) {
        this.liveimgs = liveimgs == null ? null : liveimgs.trim();
    }

    public String getLiveimg1() {
        return liveimg1;
    }

    public void setLiveimg1(String liveimg1) {
        this.liveimg1 = liveimg1 == null ? null : liveimg1.trim();
    }

    public String getLiveimg2() {
        return liveimg2;
    }

    public void setLiveimg2(String liveimg2) {
        this.liveimg2 = liveimg2 == null ? null : liveimg2.trim();
    }

    public String getLiveimg3() {
        return liveimg3;
    }

    public void setLiveimg3(String liveimg3) {
        this.liveimg3 = liveimg3 == null ? null : liveimg3.trim();
    }

    public String getLiveimg4() {
        return liveimg4;
    }

    public void setLiveimg4(String liveimg4) {
        this.liveimg4 = liveimg4 == null ? null : liveimg4.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getLivedesc() {
        return livedesc;
    }

    public void setLivedesc(String livedesc) {
        this.livedesc = livedesc == null ? null : livedesc.trim();
    }

	public Date getLivedate() {
		return livedate;
	}

	public void setLivedate(Date livedate) {
		this.livedate = livedate;
	}
    
}