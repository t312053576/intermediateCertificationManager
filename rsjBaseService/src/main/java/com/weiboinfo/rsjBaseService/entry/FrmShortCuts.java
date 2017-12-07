package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class FrmShortCuts implements Serializable {
    private String frmshortcutsid;

    private String fucecode;

    private String userid;

    private String icourl;

    private Short orderindex;

    private static final long serialVersionUID = 1L;

    public String getFrmshortcutsid() {
        return frmshortcutsid;
    }

    public void setFrmshortcutsid(String frmshortcutsid) {
        this.frmshortcutsid = frmshortcutsid;
    }

    public String getFucecode() {
        return fucecode;
    }

    public void setFucecode(String fucecode) {
        this.fucecode = fucecode;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getIcourl() {
        return icourl;
    }

    public void setIcourl(String icourl) {
        this.icourl = icourl;
    }

    public Short getOrderindex() {
        return orderindex;
    }

    public void setOrderindex(Short orderindex) {
        this.orderindex = orderindex;
    }
}