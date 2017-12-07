package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class FrmPurview implements Serializable {
    private String purviewid;

    private String userid;

    private String tablepk;

    private String tablepkvalue;

    private static final long serialVersionUID = 1L;

    public String getPurviewid() {
        return purviewid;
    }

    public void setPurviewid(String purviewid) {
        this.purviewid = purviewid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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