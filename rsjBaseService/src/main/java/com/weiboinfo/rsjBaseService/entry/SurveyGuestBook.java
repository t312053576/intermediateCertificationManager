package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class SurveyGuestBook implements Serializable {
    private String gbId;

    private String gbUser;

    private String gbPostdate;

    private String gbContent;

    private String gbPhone;

    private String gbQq;

    private String gbEmail;

    private static final long serialVersionUID = 1L;

    public String getGbId() {
        return gbId;
    }

    public void setGbId(String gbId) {
        this.gbId = gbId;
    }

    public String getGbUser() {
        return gbUser;
    }

    public void setGbUser(String gbUser) {
        this.gbUser = gbUser;
    }

    public String getGbPostdate() {
        return gbPostdate;
    }

    public void setGbPostdate(String gbPostdate) {
        this.gbPostdate = gbPostdate;
    }

    public String getGbContent() {
        return gbContent;
    }

    public void setGbContent(String gbContent) {
        this.gbContent = gbContent;
    }

    public String getGbPhone() {
        return gbPhone;
    }

    public void setGbPhone(String gbPhone) {
        this.gbPhone = gbPhone;
    }

    public String getGbQq() {
        return gbQq;
    }

    public void setGbQq(String gbQq) {
        this.gbQq = gbQq;
    }

    public String getGbEmail() {
        return gbEmail;
    }

    public void setGbEmail(String gbEmail) {
        this.gbEmail = gbEmail;
    }
}