package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class SurveyLink implements Serializable {
    private String lId;

    private String lUrl;

    private String lName;

    private String lImg;

    private String lInfo;

    private String lIslock;

    private String lAddtime;

    private static final long serialVersionUID = 1L;

    public String getlId() {
        return lId;
    }

    public void setlId(String lId) {
        this.lId = lId;
    }

    public String getlUrl() {
        return lUrl;
    }

    public void setlUrl(String lUrl) {
        this.lUrl = lUrl;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getlImg() {
        return lImg;
    }

    public void setlImg(String lImg) {
        this.lImg = lImg;
    }

    public String getlInfo() {
        return lInfo;
    }

    public void setlInfo(String lInfo) {
        this.lInfo = lInfo;
    }

    public String getlIslock() {
        return lIslock;
    }

    public void setlIslock(String lIslock) {
        this.lIslock = lIslock;
    }

    public String getlAddtime() {
        return lAddtime;
    }

    public void setlAddtime(String lAddtime) {
        this.lAddtime = lAddtime;
    }
}