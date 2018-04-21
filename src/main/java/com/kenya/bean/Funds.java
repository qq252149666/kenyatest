package com.kenya.bean;

public class Funds {
    private Integer fundsid;

    private String fundsname;

    private Float fundsprice;

    private String fundsdesc;

    private String fundsphone;

    private String fundsimgs;

    private String fundsimg1;

    private String fundsimg2;

    private String fundsimg3;

    private String fundsimg4;

    private String fundsuser;

    private Integer adminid;

    private Admin admin;
    
	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Integer getFundsid() {
        return fundsid;
    }

    public void setFundsid(Integer fundsid) {
        this.fundsid = fundsid;
    }

    public String getFundsname() {
        return fundsname;
    }

    public void setFundsname(String fundsname) {
        this.fundsname = fundsname == null ? null : fundsname.trim();
    }

    public Float getFundsprice() {
        return fundsprice;
    }

    public void setFundsprice(Float fundsprice) {
        this.fundsprice = fundsprice;
    }

    public String getFundsdesc() {
        return fundsdesc;
    }

    public void setFundsdesc(String fundsdesc) {
        this.fundsdesc = fundsdesc == null ? null : fundsdesc.trim();
    }

    public String getFundsphone() {
        return fundsphone;
    }

    public void setFundsphone(String fundsphone) {
        this.fundsphone = fundsphone == null ? null : fundsphone.trim();
    }

    public String getFundsimgs() {
        return fundsimgs;
    }

    public void setFundsimgs(String fundsimgs) {
        this.fundsimgs = fundsimgs == null ? null : fundsimgs.trim();
    }

    public String getFundsimg1() {
        return fundsimg1;
    }

    public void setFundsimg1(String fundsimg1) {
        this.fundsimg1 = fundsimg1 == null ? null : fundsimg1.trim();
    }

    public String getFundsimg2() {
        return fundsimg2;
    }

    public void setFundsimg2(String fundsimg2) {
        this.fundsimg2 = fundsimg2 == null ? null : fundsimg2.trim();
    }

    public String getFundsimg3() {
        return fundsimg3;
    }

    public void setFundsimg3(String fundsimg3) {
        this.fundsimg3 = fundsimg3 == null ? null : fundsimg3.trim();
    }

    public String getFundsimg4() {
        return fundsimg4;
    }

    public void setFundsimg4(String fundsimg4) {
        this.fundsimg4 = fundsimg4 == null ? null : fundsimg4.trim();
    }

    public String getFundsuser() {
        return fundsuser;
    }

    public void setFundsuser(String fundsuser) {
        this.fundsuser = fundsuser == null ? null : fundsuser.trim();
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }
}