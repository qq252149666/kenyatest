package com.kenya.bean;

public class Recruit {
    private Integer recruitid;

    private String companyname;

    private String companyoperating;

    private Double companystationsalary;

    private String companycallnumber;

    public Integer getRecruitid() {
        return recruitid;
    }

    public void setRecruitid(Integer recruitid) {
        this.recruitid = recruitid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getCompanyoperating() {
        return companyoperating;
    }

    public void setCompanyoperating(String companyoperating) {
        this.companyoperating = companyoperating == null ? null : companyoperating.trim();
    }

    public Double getCompanystationsalary() {
        return companystationsalary;
    }

    public void setCompanystationsalary(Double companystationsalary) {
        this.companystationsalary = companystationsalary;
    }

    public String getCompanycallnumber() {
        return companycallnumber;
    }

    public void setCompanycallnumber(String companycallnumber) {
        this.companycallnumber = companycallnumber == null ? null : companycallnumber.trim();
    }
}