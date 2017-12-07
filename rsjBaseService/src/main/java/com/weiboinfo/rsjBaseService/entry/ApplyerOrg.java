package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class ApplyerOrg implements Serializable {
    private String aoid;

    private String applyername;

    private String organizecode;

    private String legalperson;

    private String associationperson;

    private String telephone;

    private String fax;

    private String address;

    private String email;

    private static final long serialVersionUID = 1L;

    public String getAoid() {
        return aoid;
    }

    public void setAoid(String aoid) {
        this.aoid = aoid;
    }

    public String getApplyername() {
        return applyername;
    }

    public void setApplyername(String applyername) {
        this.applyername = applyername;
    }

    public String getOrganizecode() {
        return organizecode;
    }

    public void setOrganizecode(String organizecode) {
        this.organizecode = organizecode;
    }

    public String getLegalperson() {
        return legalperson;
    }

    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson;
    }

    public String getAssociationperson() {
        return associationperson;
    }

    public void setAssociationperson(String associationperson) {
        this.associationperson = associationperson;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}