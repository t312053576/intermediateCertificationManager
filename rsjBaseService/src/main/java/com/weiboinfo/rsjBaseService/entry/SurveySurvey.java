package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class SurveySurvey implements Serializable {
    private String sId;

    private String templetId;

    private String sName;

    private String sDesc;

    private String sAuthor;

    private String sImg;

    private String sIprepeat;

    private String sCreatedate;

    private String sIplimittype;

    private String sIprange;

    private String sPassword;

    private String sIsopen;

    private String sExpiredate;

    private String sIsaudited;

    private String sHits;

    private String sUsehits;

    private static final long serialVersionUID = 1L;

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getTempletId() {
        return templetId;
    }

    public void setTempletId(String templetId) {
        this.templetId = templetId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsDesc() {
        return sDesc;
    }

    public void setsDesc(String sDesc) {
        this.sDesc = sDesc;
    }

    public String getsAuthor() {
        return sAuthor;
    }

    public void setsAuthor(String sAuthor) {
        this.sAuthor = sAuthor;
    }

    public String getsImg() {
        return sImg;
    }

    public void setsImg(String sImg) {
        this.sImg = sImg;
    }

    public String getsIprepeat() {
        return sIprepeat;
    }

    public void setsIprepeat(String sIprepeat) {
        this.sIprepeat = sIprepeat;
    }

    public String getsCreatedate() {
        return sCreatedate;
    }

    public void setsCreatedate(String sCreatedate) {
        this.sCreatedate = sCreatedate;
    }

    public String getsIplimittype() {
        return sIplimittype;
    }

    public void setsIplimittype(String sIplimittype) {
        this.sIplimittype = sIplimittype;
    }

    public String getsIprange() {
        return sIprange;
    }

    public void setsIprange(String sIprange) {
        this.sIprange = sIprange;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    public String getsIsopen() {
        return sIsopen;
    }

    public void setsIsopen(String sIsopen) {
        this.sIsopen = sIsopen;
    }

    public String getsExpiredate() {
        return sExpiredate;
    }

    public void setsExpiredate(String sExpiredate) {
        this.sExpiredate = sExpiredate;
    }

    public String getsIsaudited() {
        return sIsaudited;
    }

    public void setsIsaudited(String sIsaudited) {
        this.sIsaudited = sIsaudited;
    }

    public String getsHits() {
        return sHits;
    }

    public void setsHits(String sHits) {
        this.sHits = sHits;
    }

    public String getsUsehits() {
        return sUsehits;
    }

    public void setsUsehits(String sUsehits) {
        this.sUsehits = sUsehits;
    }
}