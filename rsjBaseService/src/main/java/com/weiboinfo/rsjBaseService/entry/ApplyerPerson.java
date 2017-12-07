package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class ApplyerPerson implements Serializable {
    private String apid;

    private String applyername;

    private String department;

    private String certificatename;

    private String certificatecode;

    private String telephone;

    private String postcode;

    private String address;

    private String fax;

    private String email;

    private static final long serialVersionUID = 1L;

    public String getApid() {
        return apid;
    }

    public void setApid(String apid) {
        this.apid = apid;
    }

    public String getApplyername() {
        return applyername;
    }

    public void setApplyername(String applyername) {
        this.applyername = applyername;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCertificatename() {
        return certificatename;
    }

    public void setCertificatename(String certificatename) {
        this.certificatename = certificatename;
    }

    public String getCertificatecode() {
        return certificatecode;
    }

    public void setCertificatecode(String certificatecode) {
        this.certificatecode = certificatecode;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}