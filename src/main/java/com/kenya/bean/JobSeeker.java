package com.kenya.bean;

import java.util.Date;

public class JobSeeker {
    private Integer jobseekerid;

    private Integer userid;

    private String sname;

    private String sheadportrait;

    private Integer ssex;

    private String sjobwant;

    private String scallnum;

    private Date sbirthday;

    private Date jobtime;

    private String personalntroduction;

    public Integer getJobseekerid() {
        return jobseekerid;
    }

    public void setJobseekerid(Integer jobseekerid) {
        this.jobseekerid = jobseekerid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSheadportrait() {
        return sheadportrait;
    }

    public void setSheadportrait(String sheadportrait) {
        this.sheadportrait = sheadportrait == null ? null : sheadportrait.trim();
    }

    public Integer getSsex() {
        return ssex;
    }

    public void setSsex(Integer ssex) {
        this.ssex = ssex;
    }

    public String getSjobwant() {
        return sjobwant;
    }

    public void setSjobwant(String sjobwant) {
        this.sjobwant = sjobwant == null ? null : sjobwant.trim();
    }

    public String getScallnum() {
        return scallnum;
    }

    public void setScallnum(String scallnum) {
        this.scallnum = scallnum == null ? null : scallnum.trim();
    }

    public Date getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(Date sbirthday) {
        this.sbirthday = sbirthday;
    }

    public Date getJobtime() {
        return jobtime;
    }

    public void setJobtime(Date jobtime) {
        this.jobtime = jobtime;
    }

    public String getPersonalntroduction() {
        return personalntroduction;
    }

    public void setPersonalntroduction(String personalntroduction) {
        this.personalntroduction = personalntroduction == null ? null : personalntroduction.trim();
    }
}