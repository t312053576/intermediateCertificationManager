package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;
import java.math.BigDecimal;

public class FrmOperLog implements Serializable {
    private String id;

    private String account;

    private String username;

    private String opertime;

    private String userip;

    private String opertype;

    private String opermemo;

    private BigDecimal pageid;

    private String sysid;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOpertime() {
        return opertime;
    }

    public void setOpertime(String opertime) {
        this.opertime = opertime;
    }

    public String getUserip() {
        return userip;
    }

    public void setUserip(String userip) {
        this.userip = userip;
    }

    public String getOpertype() {
        return opertype;
    }

    public void setOpertype(String opertype) {
        this.opertype = opertype;
    }

    public String getOpermemo() {
        return opermemo;
    }

    public void setOpermemo(String opermemo) {
        this.opermemo = opermemo;
    }

    public BigDecimal getPageid() {
        return pageid;
    }

    public void setPageid(BigDecimal pageid) {
        this.pageid = pageid;
    }

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid;
    }
}