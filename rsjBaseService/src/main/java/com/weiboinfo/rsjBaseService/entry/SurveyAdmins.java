package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class SurveyAdmins implements Serializable {
    private String aId;

    private String aUser;

    private String aPass;

    private String aName;

    private String aIslock;

    private String aLastlogtime;

    private String aLogtimes;

    private String aLoginip;

    private String aAddtime;

    private String aEmail;

    private String aInfo;

    private static final long serialVersionUID = 1L;

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId;
    }

    public String getaUser() {
        return aUser;
    }

    public void setaUser(String aUser) {
        this.aUser = aUser;
    }

    public String getaPass() {
        return aPass;
    }

    public void setaPass(String aPass) {
        this.aPass = aPass;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaIslock() {
        return aIslock;
    }

    public void setaIslock(String aIslock) {
        this.aIslock = aIslock;
    }

    public String getaLastlogtime() {
        return aLastlogtime;
    }

    public void setaLastlogtime(String aLastlogtime) {
        this.aLastlogtime = aLastlogtime;
    }

    public String getaLogtimes() {
        return aLogtimes;
    }

    public void setaLogtimes(String aLogtimes) {
        this.aLogtimes = aLogtimes;
    }

    public String getaLoginip() {
        return aLoginip;
    }

    public void setaLoginip(String aLoginip) {
        this.aLoginip = aLoginip;
    }

    public String getaAddtime() {
        return aAddtime;
    }

    public void setaAddtime(String aAddtime) {
        this.aAddtime = aAddtime;
    }

    public String getaEmail() {
        return aEmail;
    }

    public void setaEmail(String aEmail) {
        this.aEmail = aEmail;
    }

    public String getaInfo() {
        return aInfo;
    }

    public void setaInfo(String aInfo) {
        this.aInfo = aInfo;
    }
}