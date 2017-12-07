package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class FrmSecondPurview implements Serializable {
    private String secondpurviewid;

    private String sourceuserid;

    private String targetuserid;

    private String authstarttime;

    private String authendtime;

    private String tablepk;

    private String tablepkvalue;

    private static final long serialVersionUID = 1L;

    public String getSecondpurviewid() {
        return secondpurviewid;
    }

    public void setSecondpurviewid(String secondpurviewid) {
        this.secondpurviewid = secondpurviewid;
    }

    public String getSourceuserid() {
        return sourceuserid;
    }

    public void setSourceuserid(String sourceuserid) {
        this.sourceuserid = sourceuserid;
    }

    public String getTargetuserid() {
        return targetuserid;
    }

    public void setTargetuserid(String targetuserid) {
        this.targetuserid = targetuserid;
    }

    public String getAuthstarttime() {
        return authstarttime;
    }

    public void setAuthstarttime(String authstarttime) {
        this.authstarttime = authstarttime;
    }

    public String getAuthendtime() {
        return authendtime;
    }

    public void setAuthendtime(String authendtime) {
        this.authendtime = authendtime;
    }

    public String getTablepk() {
        return tablepk;
    }

    public void setTablepk(String tablepk) {
        this.tablepk = tablepk;
    }

    public String getTablepkvalue() {
        return tablepkvalue;
    }

    public void setTablepkvalue(String tablepkvalue) {
        this.tablepkvalue = tablepkvalue;
    }
}