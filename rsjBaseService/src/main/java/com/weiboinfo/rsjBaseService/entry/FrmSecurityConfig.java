package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class FrmSecurityConfig implements Serializable {
    private String frmsecurityconfigid;

    private String securityconfigenable;

    private String securityconfigcanoper;

    private String yhjsglenable;

    private String yhjsglcanoper;

    private String cjenable;

    private String cjcanoper;

    private static final long serialVersionUID = 1L;

    public String getFrmsecurityconfigid() {
        return frmsecurityconfigid;
    }

    public void setFrmsecurityconfigid(String frmsecurityconfigid) {
        this.frmsecurityconfigid = frmsecurityconfigid;
    }

    public String getSecurityconfigenable() {
        return securityconfigenable;
    }

    public void setSecurityconfigenable(String securityconfigenable) {
        this.securityconfigenable = securityconfigenable;
    }

    public String getSecurityconfigcanoper() {
        return securityconfigcanoper;
    }

    public void setSecurityconfigcanoper(String securityconfigcanoper) {
        this.securityconfigcanoper = securityconfigcanoper;
    }

    public String getYhjsglenable() {
        return yhjsglenable;
    }

    public void setYhjsglenable(String yhjsglenable) {
        this.yhjsglenable = yhjsglenable;
    }

    public String getYhjsglcanoper() {
        return yhjsglcanoper;
    }

    public void setYhjsglcanoper(String yhjsglcanoper) {
        this.yhjsglcanoper = yhjsglcanoper;
    }

    public String getCjenable() {
        return cjenable;
    }

    public void setCjenable(String cjenable) {
        this.cjenable = cjenable;
    }

    public String getCjcanoper() {
        return cjcanoper;
    }

    public void setCjcanoper(String cjcanoper) {
        this.cjcanoper = cjcanoper;
    }
}