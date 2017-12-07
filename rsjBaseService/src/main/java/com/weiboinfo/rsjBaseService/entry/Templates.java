package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class Templates implements Serializable {
    private String tid;

    private String tnickname;

    private String tfilename;

    private String ttype;

    private String jspfilename;

    private String fileurl;

    private String ishomepage;

    private String viewurl;

    private static final long serialVersionUID = 1L;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTnickname() {
        return tnickname;
    }

    public void setTnickname(String tnickname) {
        this.tnickname = tnickname;
    }

    public String getTfilename() {
        return tfilename;
    }

    public void setTfilename(String tfilename) {
        this.tfilename = tfilename;
    }

    public String getTtype() {
        return ttype;
    }

    public void setTtype(String ttype) {
        this.ttype = ttype;
    }

    public String getJspfilename() {
        return jspfilename;
    }

    public void setJspfilename(String jspfilename) {
        this.jspfilename = jspfilename;
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl;
    }

    public String getIshomepage() {
        return ishomepage;
    }

    public void setIshomepage(String ishomepage) {
        this.ishomepage = ishomepage;
    }

    public String getViewurl() {
        return viewurl;
    }

    public void setViewurl(String viewurl) {
        this.viewurl = viewurl;
    }
}