package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class ZZDTemplateType implements Serializable {
    private String dm;

    private String dmmc;

    private String xh;

    private static final long serialVersionUID = 1L;

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    public String getDmmc() {
        return dmmc;
    }

    public void setDmmc(String dmmc) {
        this.dmmc = dmmc;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }
}