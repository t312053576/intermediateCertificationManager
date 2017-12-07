package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class FrmTips implements Serializable {
    private String tipinfo;

    private String tipurl;

    private Short isenforce;

    private String userid;

    private String isshowed;

    private String createtime;

    private static final long serialVersionUID = 1L;

    public String getTipinfo() {
        return tipinfo;
    }

    public void setTipinfo(String tipinfo) {
        this.tipinfo = tipinfo;
    }

    public String getTipurl() {
        return tipurl;
    }

    public void setTipurl(String tipurl) {
        this.tipurl = tipurl;
    }

    public Short getIsenforce() {
        return isenforce;
    }

    public void setIsenforce(Short isenforce) {
        this.isenforce = isenforce;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getIsshowed() {
        return isshowed;
    }

    public void setIsshowed(String isshowed) {
        this.isshowed = isshowed;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
}