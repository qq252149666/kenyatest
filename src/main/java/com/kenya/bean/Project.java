package com.kenya.bean;

public class Project {
    private Integer projectid;

    private String projectname;

    private Float projectprice;

    private String projectdesc;

    private String projectphone;

    private String projectimgs;

    private String projectimg1;

    private String projectimg2;

    private String projectimg3;

    private String projectimg4;

    private Integer adminid;

    private String projectuser;

    private String projectaddress;
    
    private Admin admin;
    

    public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public Float getProjectprice() {
        return projectprice;
    }

    public void setProjectprice(Float projectprice) {
        this.projectprice = projectprice;
    }

    public String getProjectdesc() {
        return projectdesc;
    }

    public void setProjectdesc(String projectdesc) {
        this.projectdesc = projectdesc == null ? null : projectdesc.trim();
    }

    public String getProjectphone() {
        return projectphone;
    }

    public void setProjectphone(String projectphone) {
        this.projectphone = projectphone == null ? null : projectphone.trim();
    }

    public String getProjectimgs() {
        return projectimgs;
    }

    public void setProjectimgs(String projectimgs) {
        this.projectimgs = projectimgs == null ? null : projectimgs.trim();
    }

    public String getProjectimg1() {
        return projectimg1;
    }

    public void setProjectimg1(String projectimg1) {
        this.projectimg1 = projectimg1 == null ? null : projectimg1.trim();
    }

    public String getProjectimg2() {
        return projectimg2;
    }

    public void setProjectimg2(String projectimg2) {
        this.projectimg2 = projectimg2 == null ? null : projectimg2.trim();
    }

    public String getProjectimg3() {
        return projectimg3;
    }

    public void setProjectimg3(String projectimg3) {
        this.projectimg3 = projectimg3 == null ? null : projectimg3.trim();
    }

    public String getProjectimg4() {
        return projectimg4;
    }

    public void setProjectimg4(String projectimg4) {
        this.projectimg4 = projectimg4 == null ? null : projectimg4.trim();
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getProjectuser() {
        return projectuser;
    }

    public void setProjectuser(String projectuser) {
        this.projectuser = projectuser == null ? null : projectuser.trim();
    }

    public String getProjectaddress() {
        return projectaddress;
    }

    public void setProjectaddress(String projectaddress) {
        this.projectaddress = projectaddress == null ? null : projectaddress.trim();
    }
}