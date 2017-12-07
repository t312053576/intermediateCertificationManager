package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class FrmRoleGroup implements Serializable {
    private String rolegroupid;

    private String rolegroupname;

    private String sysid;

    private static final long serialVersionUID = 1L;

    public String getRolegroupid() {
        return rolegroupid;
    }

    public void setRolegroupid(String rolegroupid) {
        this.rolegroupid = rolegroupid;
    }

    public String getRolegroupname() {
        return rolegroupname;
    }

    public void setRolegroupname(String rolegroupname) {
        this.rolegroupname = rolegroupname;
    }

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid;
    }
}