package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class FrmRoleFunction implements Serializable {
    private String rolefunid;

    private String rolefuncreatorid;

    private String rolefuncreatetime;

    private String rolefunmodifierid;

    private String rolefunmodifytime;

    private String roleroleid;

    private String fucecode;

    private static final long serialVersionUID = 1L;

    public String getRolefunid() {
        return rolefunid;
    }

    public void setRolefunid(String rolefunid) {
        this.rolefunid = rolefunid;
    }

    public String getRolefuncreatorid() {
        return rolefuncreatorid;
    }

    public void setRolefuncreatorid(String rolefuncreatorid) {
        this.rolefuncreatorid = rolefuncreatorid;
    }

    public String getRolefuncreatetime() {
        return rolefuncreatetime;
    }

    public void setRolefuncreatetime(String rolefuncreatetime) {
        this.rolefuncreatetime = rolefuncreatetime;
    }

    public String getRolefunmodifierid() {
        return rolefunmodifierid;
    }

    public void setRolefunmodifierid(String rolefunmodifierid) {
        this.rolefunmodifierid = rolefunmodifierid;
    }

    public String getRolefunmodifytime() {
        return rolefunmodifytime;
    }

    public void setRolefunmodifytime(String rolefunmodifytime) {
        this.rolefunmodifytime = rolefunmodifytime;
    }

    public String getRoleroleid() {
        return roleroleid;
    }

    public void setRoleroleid(String roleroleid) {
        this.roleroleid = roleroleid;
    }

    public String getFucecode() {
        return fucecode;
    }

    public void setFucecode(String fucecode) {
        this.fucecode = fucecode;
    }
}