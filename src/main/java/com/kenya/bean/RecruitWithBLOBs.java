package com.kenya.bean;

public class RecruitWithBLOBs extends Recruit {
    private String companystationdetailed;

    private String companyaddress;

    private String companydetailed;

    public String getCompanystationdetailed() {
        return companystationdetailed;
    }

    public void setCompanystationdetailed(String companystationdetailed) {
        this.companystationdetailed = companystationdetailed == null ? null : companystationdetailed.trim();
    }

    public String getCompanyaddress() {
        return companyaddress;
    }

    public void setCompanyaddress(String companyaddress) {
        this.companyaddress = companyaddress == null ? null : companyaddress.trim();
    }

    public String getCompanydetailed() {
        return companydetailed;
    }

    public void setCompanydetailed(String companydetailed) {
        this.companydetailed = companydetailed == null ? null : companydetailed.trim();
    }
}