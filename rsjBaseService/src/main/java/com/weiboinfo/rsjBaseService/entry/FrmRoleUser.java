package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class FrmRoleUser implements Serializable {
    private String roleuserid;

    private String roleuserauthtime;

    private String roleusercreatorid;

    private String roleusercreatetime;

    private String roleusermodifierid;

    private String roleusermodifytime;

    private String userid;

    private String roleid;

    private static final long serialVersionUID = 1L;

    public String getRoleuserid() {
        return roleuserid;
    }

    public void setRoleuserid(String roleuserid) {
        this.roleuserid = roleuserid;
    }

    public String getRoleuserauthtime() {
        return roleuserauthtime;
    }

    public void setRoleuserauthtime(String roleuserauthtime) {
        this.roleuserauthtime = roleuserauthtime;
    }

    public String getRoleusercreatorid() {
        return roleusercreatorid;
    }

    public void setRoleusercreatorid(String roleusercreatorid) {
        this.roleusercreatorid = roleusercreatorid;
    }

    public String getRoleusercreatetime() {
        return roleusercreatetime;
    }

    public void setRoleusercreatetime(String roleusercreatetime) {
        this.roleusercreatetime = roleusercreatetime;
    }

    public String getRoleusermodifierid() {
        return roleusermodifierid;
    }

    public void setRoleusermodifierid(String roleusermodifierid) {
        this.roleusermodifierid = roleusermodifierid;
    }

    public String getRoleusermodifytime() {
        return roleusermodifytime;
    }

    public void setRoleusermodifytime(String roleusermodifytime) {
        this.roleusermodifytime = roleusermodifytime;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }
}