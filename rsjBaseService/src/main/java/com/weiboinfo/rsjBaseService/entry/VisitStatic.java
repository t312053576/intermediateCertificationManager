package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class VisitStatic implements Serializable {
    private String vid;

    private String pageurl;

    private String vip;

    private String vtime;

    private String vipdistinct;

    private String vipprovider;

    private String vreferer;

    private String pagetitle;

    private static final long serialVersionUID = 1L;

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getPageurl() {
        return pageurl;
    }

    public void setPageurl(String pageurl) {
        this.pageurl = pageurl;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getVtime() {
        return vtime;
    }

    public void setVtime(String vtime) {
        this.vtime = vtime;
    }

    public String getVipdistinct() {
        return vipdistinct;
    }

    public void setVipdistinct(String vipdistinct) {
        this.vipdistinct = vipdistinct;
    }

    public String getVipprovider() {
        return vipprovider;
    }

    public void setVipprovider(String vipprovider) {
        this.vipprovider = vipprovider;
    }

    public String getVreferer() {
        return vreferer;
    }

    public void setVreferer(String vreferer) {
        this.vreferer = vreferer;
    }

    public String getPagetitle() {
        return pagetitle;
    }

    public void setPagetitle(String pagetitle) {
        this.pagetitle = pagetitle;
    }
}