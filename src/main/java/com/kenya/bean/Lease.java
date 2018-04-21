package com.kenya.bean;

import java.io.Serializable;

public class Lease implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer leaseid;

    private String leaseimgs;

    private String leasename;

    private Float leaseprice;

    private String leasephone;

    private String leasesquare;

    private String leaseaddress;

    private String leasehome;

    private String leaseimg1;

    private String leaseimg2;

    private String leaseimg3;

    private String leaseimg4;

    private Integer userid;

    private String leasedesc;
    
    private User user;
    

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getLeaseid() {
        return leaseid;
    }

    public void setLeaseid(Integer leaseid) {
        this.leaseid = leaseid;
    }

    public String getLeaseimgs() {
        return leaseimgs;
    }

    public void setLeaseimgs(String leaseimgs) {
        this.leaseimgs = leaseimgs == null ? null : leaseimgs.trim();
    }

    public String getLeasename() {
        return leasename;
    }

    public void setLeasename(String leasename) {
        this.leasename = leasename == null ? null : leasename.trim();
    }

    public Float getLeaseprice() {
        return leaseprice;
    }

    public void setLeaseprice(Float leaseprice) {
        this.leaseprice = leaseprice;
    }

    public String getLeasephone() {
        return leasephone;
    }

    public void setLeasephone(String leasephone) {
        this.leasephone = leasephone == null ? null : leasephone.trim();
    }

    public String getLeasesquare() {
        return leasesquare;
    }

    public void setLeasesquare(String leasesquare) {
        this.leasesquare = leasesquare == null ? null : leasesquare.trim();
    }

    public String getLeaseaddress() {
        return leaseaddress;
    }

    public void setLeaseaddress(String leaseaddress) {
        this.leaseaddress = leaseaddress == null ? null : leaseaddress.trim();
    }

    public String getLeasehome() {
        return leasehome;
    }

    public void setLeasehome(String leasehome) {
        this.leasehome = leasehome == null ? null : leasehome.trim();
    }

    public String getLeaseimg1() {
        return leaseimg1;
    }

    public void setLeaseimg1(String leaseimg1) {
        this.leaseimg1 = leaseimg1 == null ? null : leaseimg1.trim();
    }

    public String getLeaseimg2() {
        return leaseimg2;
    }

    public void setLeaseimg2(String leaseimg2) {
        this.leaseimg2 = leaseimg2 == null ? null : leaseimg2.trim();
    }

    public String getLeaseimg3() {
        return leaseimg3;
    }

    public void setLeaseimg3(String leaseimg3) {
        this.leaseimg3 = leaseimg3 == null ? null : leaseimg3.trim();
    }

    public String getLeaseimg4() {
        return leaseimg4;
    }

    public void setLeaseimg4(String leaseimg4) {
        this.leaseimg4 = leaseimg4 == null ? null : leaseimg4.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getLeasedesc() {
        return leasedesc;
    }

    public void setLeasedesc(String leasedesc) {
        this.leasedesc = leasedesc == null ? null : leasedesc.trim();
    }
}