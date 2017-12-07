package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class ApplyPublicity implements Serializable {
    private String aid;

    private String indexcode;

    private String applydesc;

    private String purpose;

    private String applyertype;

    private String applyerid;

    private String searchcode;

    private String replystatus;

    private String replycontent;

    private String createtime;

    private String replytime;

    private String isinoa;

    private static final long serialVersionUID = 1L;

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getIndexcode() {
        return indexcode;
    }

    public void setIndexcode(String indexcode) {
        this.indexcode = indexcode;
    }

    public String getApplydesc() {
        return applydesc;
    }

    public void setApplydesc(String applydesc) {
        this.applydesc = applydesc;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getApplyertype() {
        return applyertype;
    }

    public void setApplyertype(String applyertype) {
        this.applyertype = applyertype;
    }

    public String getApplyerid() {
        return applyerid;
    }

    public void setApplyerid(String applyerid) {
        this.applyerid = applyerid;
    }

    public String getSearchcode() {
        return searchcode;
    }

    public void setSearchcode(String searchcode) {
        this.searchcode = searchcode;
    }

    public String getReplystatus() {
        return replystatus;
    }

    public void setReplystatus(String replystatus) {
        this.replystatus = replystatus;
    }

    public String getReplycontent() {
        return replycontent;
    }

    public void setReplycontent(String replycontent) {
        this.replycontent = replycontent;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getReplytime() {
        return replytime;
    }

    public void setReplytime(String replytime) {
        this.replytime = replytime;
    }

    public String getIsinoa() {
        return isinoa;
    }

    public void setIsinoa(String isinoa) {
        this.isinoa = isinoa;
    }
}