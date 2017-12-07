package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class Scene implements Serializable {
    private String id;

    private String scenename;

    private String fid;

    private String stype;

    private String xmlurl;

    private String templateurl;

    private String viewurl;

    private String listtemplate;

    private String detailtemplate;

    private String xmlcontent;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getScenename() {
        return scenename;
    }

    public void setScenename(String scenename) {
        this.scenename = scenename;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype;
    }

    public String getXmlurl() {
        return xmlurl;
    }

    public void setXmlurl(String xmlurl) {
        this.xmlurl = xmlurl;
    }

    public String getTemplateurl() {
        return templateurl;
    }

    public void setTemplateurl(String templateurl) {
        this.templateurl = templateurl;
    }

    public String getViewurl() {
        return viewurl;
    }

    public void setViewurl(String viewurl) {
        this.viewurl = viewurl;
    }

    public String getListtemplate() {
        return listtemplate;
    }

    public void setListtemplate(String listtemplate) {
        this.listtemplate = listtemplate;
    }

    public String getDetailtemplate() {
        return detailtemplate;
    }

    public void setDetailtemplate(String detailtemplate) {
        this.detailtemplate = detailtemplate;
    }

    public String getXmlcontent() {
        return xmlcontent;
    }

    public void setXmlcontent(String xmlcontent) {
        this.xmlcontent = xmlcontent;
    }
}