package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class FrmSecondFunctionUser implements Serializable {
    private String secondfunctionuserid;

    private String secondfunctionuserauthtime;

    private String sourceuserid;

    private String authstarttime;

    private String authendtime;

    private String targetuserid;

    private String fucecode;

    private String cjr;

    private String cjsj;

    private String xgr;

    private String xgsj;

    private static final long serialVersionUID = 1L;

    public String getSecondfunctionuserid() {
        return secondfunctionuserid;
    }

    public void setSecondfunctionuserid(String secondfunctionuserid) {
        this.secondfunctionuserid = secondfunctionuserid;
    }

    public String getSecondfunctionuserauthtime() {
        return secondfunctionuserauthtime;
    }

    public void setSecondfunctionuserauthtime(String secondfunctionuserauthtime) {
        this.secondfunctionuserauthtime = secondfunctionuserauthtime;
    }

    public String getSourceuserid() {
        return sourceuserid;
    }

    public void setSourceuserid(String sourceuserid) {
        this.sourceuserid = sourceuserid;
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

    public String getTargetuserid() {
        return targetuserid;
    }

    public void setTargetuserid(String targetuserid) {
        this.targetuserid = targetuserid;
    }

    public String getFucecode() {
        return fucecode;
    }

    public void setFucecode(String fucecode) {
        this.fucecode = fucecode;
    }

    public String getCjr() {
        return cjr;
    }

    public void setCjr(String cjr) {
        this.cjr = cjr;
    }

    public String getCjsj() {
        return cjsj;
    }

    public void setCjsj(String cjsj) {
        this.cjsj = cjsj;
    }

    public String getXgr() {
        return xgr;
    }

    public void setXgr(String xgr) {
        this.xgr = xgr;
    }

    public String getXgsj() {
        return xgsj;
    }

    public void setXgsj(String xgsj) {
        this.xgsj = xgsj;
    }
}