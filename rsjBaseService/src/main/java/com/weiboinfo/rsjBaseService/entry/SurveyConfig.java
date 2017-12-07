package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class SurveyConfig implements Serializable {
    private String id;

    private String cSitename;

    private String cSiteurl;

    private String cIsopen;

    private String cCloseword;

    private String copyright;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcSitename() {
        return cSitename;
    }

    public void setcSitename(String cSitename) {
        this.cSitename = cSitename;
    }

    public String getcSiteurl() {
        return cSiteurl;
    }

    public void setcSiteurl(String cSiteurl) {
        this.cSiteurl = cSiteurl;
    }

    public String getcIsopen() {
        return cIsopen;
    }

    public void setcIsopen(String cIsopen) {
        this.cIsopen = cIsopen;
    }

    public String getcCloseword() {
        return cCloseword;
    }

    public void setcCloseword(String cCloseword) {
        this.cCloseword = cCloseword;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }
}