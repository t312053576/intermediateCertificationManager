package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Comments implements Serializable {
    private String id;

    private String creatorid;

    private String creatorname;

    private Date creattime;

    private String comments;

    private String verifyerid;

    private String verifyname;

    private Date verifytime;

    private String reply;

    private BigDecimal wcmchanelid;

    private BigDecimal wcmsiteid;

    private String replypub;

    private BigDecimal wcmdocid;

    private String verifystatus;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid;
    }

    public String getCreatorname() {
        return creatorname;
    }

    public void setCreatorname(String creatorname) {
        this.creatorname = creatorname;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getVerifyerid() {
        return verifyerid;
    }

    public void setVerifyerid(String verifyerid) {
        this.verifyerid = verifyerid;
    }

    public String getVerifyname() {
        return verifyname;
    }

    public void setVerifyname(String verifyname) {
        this.verifyname = verifyname;
    }

    public Date getVerifytime() {
        return verifytime;
    }

    public void setVerifytime(Date verifytime) {
        this.verifytime = verifytime;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public BigDecimal getWcmchanelid() {
        return wcmchanelid;
    }

    public void setWcmchanelid(BigDecimal wcmchanelid) {
        this.wcmchanelid = wcmchanelid;
    }

    public BigDecimal getWcmsiteid() {
        return wcmsiteid;
    }

    public void setWcmsiteid(BigDecimal wcmsiteid) {
        this.wcmsiteid = wcmsiteid;
    }

    public String getReplypub() {
        return replypub;
    }

    public void setReplypub(String replypub) {
        this.replypub = replypub;
    }

    public BigDecimal getWcmdocid() {
        return wcmdocid;
    }

    public void setWcmdocid(BigDecimal wcmdocid) {
        this.wcmdocid = wcmdocid;
    }

    public String getVerifystatus() {
        return verifystatus;
    }

    public void setVerifystatus(String verifystatus) {
        this.verifystatus = verifystatus;
    }
}