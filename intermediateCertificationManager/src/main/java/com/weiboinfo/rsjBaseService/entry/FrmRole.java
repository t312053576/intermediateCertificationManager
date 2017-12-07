package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;
import java.math.BigDecimal;

public class FrmRole implements Serializable {
    private String roleid;

    private String rolename;

    private String roledesc;

    private String roledepartment;

    private String rolecreatorid;

    private String rolecreatetime;

    private String rolemodifierid;

    private String rolemodifytime;

    private String roleindex;

    private String rolegroupid;

    private BigDecimal pageid;

    private String sysid;

    private static final long serialVersionUID = 1L;

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }

    public String getRoledepartment() {
        return roledepartment;
    }

    public void setRoledepartment(String roledepartment) {
        this.roledepartment = roledepartment;
    }

    public String getRolecreatorid() {
        return rolecreatorid;
    }

    public void setRolecreatorid(String rolecreatorid) {
        this.rolecreatorid = rolecreatorid;
    }

    public String getRolecreatetime() {
        return rolecreatetime;
    }

    public void setRolecreatetime(String rolecreatetime) {
        this.rolecreatetime = rolecreatetime;
    }

    public String getRolemodifierid() {
        return rolemodifierid;
    }

    public void setRolemodifierid(String rolemodifierid) {
        this.rolemodifierid = rolemodifierid;
    }

    public String getRolemodifytime() {
        return rolemodifytime;
    }

    public void setRolemodifytime(String rolemodifytime) {
        this.rolemodifytime = rolemodifytime;
    }

    public String getRoleindex() {
        return roleindex;
    }

    public void setRoleindex(String roleindex) {
        this.roleindex = roleindex;
    }

    public String getRolegroupid() {
        return rolegroupid;
    }

    public void setRolegroupid(String rolegroupid) {
        this.rolegroupid = rolegroupid;
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