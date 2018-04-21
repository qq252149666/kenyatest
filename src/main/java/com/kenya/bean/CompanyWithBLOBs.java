package com.kenya.bean;

public class CompanyWithBLOBs extends Company {
    private String companystationdesc;

    private String companyaddress;

    private String companydesc;

    public String getCompanystationdesc() {
        return companystationdesc;
    }

    public void setCompanystationdesc(String companystationdesc) {
        this.companystationdesc = companystationdesc == null ? null : companystationdesc.trim();
    }

    public String getCompanyaddress() {
        return companyaddress;
    }

    public void setCompanyaddress(String companyaddress) {
        this.companyaddress = companyaddress == null ? null : companyaddress.trim();
    }

    public String getCompanydesc() {
        return companydesc;
    }

    public void setCompanydesc(String companydesc) {
        this.companydesc = companydesc == null ? null : companydesc.trim();
    }
}