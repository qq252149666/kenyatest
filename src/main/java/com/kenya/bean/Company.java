package com.kenya.bean;

public class Company {
    private Integer companyid;

    private String companyname;

    private String companystation;

    private Double companystationsalary;

    private String companyphone;

    private Integer userid;

    private String companyimg0;

    private String companyimg1;

    private String companyimg2;

    private String companyimg3;

    private String companyimg4;

    private String companyimg5;

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getCompanystation() {
        return companystation;
    }

    public void setCompanystation(String companystation) {
        this.companystation = companystation == null ? null : companystation.trim();
    }

    public Double getCompanystationsalary() {
        return companystationsalary;
    }

    public void setCompanystationsalary(Double companystationsalary) {
        this.companystationsalary = companystationsalary;
    }

    public String getCompanyphone() {
        return companyphone;
    }

    public void setCompanyphone(String companyphone) {
        this.companyphone = companyphone == null ? null : companyphone.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getCompanyimg0() {
        return companyimg0;
    }

    public void setCompanyimg0(String companyimg0) {
        this.companyimg0 = companyimg0 == null ? null : companyimg0.trim();
    }

    public String getCompanyimg1() {
        return companyimg1;
    }

    public void setCompanyimg1(String companyimg1) {
        this.companyimg1 = companyimg1 == null ? null : companyimg1.trim();
    }

    public String getCompanyimg2() {
        return companyimg2;
    }

    public void setCompanyimg2(String companyimg2) {
        this.companyimg2 = companyimg2 == null ? null : companyimg2.trim();
    }

    public String getCompanyimg3() {
        return companyimg3;
    }

    public void setCompanyimg3(String companyimg3) {
        this.companyimg3 = companyimg3 == null ? null : companyimg3.trim();
    }

    public String getCompanyimg4() {
        return companyimg4;
    }

    public void setCompanyimg4(String companyimg4) {
        this.companyimg4 = companyimg4 == null ? null : companyimg4.trim();
    }

    public String getCompanyimg5() {
        return companyimg5;
    }

    public void setCompanyimg5(String companyimg5) {
        this.companyimg5 = companyimg5 == null ? null : companyimg5.trim();
    }
}