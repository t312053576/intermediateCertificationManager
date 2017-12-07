package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;
import java.math.BigDecimal;

public class Advise implements Serializable {
    private String id;

    private String name;

    private String idcard;

    private String telnumber;

    private String address;

    private String advisecontent;

    private String searchcode;

    private String advisetype;

    private String createtime;

    private String replytime;

    private String replystatus;

    private String replycontent;

    private String type;

    private String title;

    private BigDecimal hits;

    private String advisedl;

    private String isinoa;

    private String mydpj;

    private String mydfkyj;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdvisecontent() {
        return advisecontent;
    }

    public void setAdvisecontent(String advisecontent) {
        this.advisecontent = advisecontent;
    }

    public String getSearchcode() {
        return searchcode;
    }

    public void setSearchcode(String searchcode) {
        this.searchcode = searchcode;
    }

    public String getAdvisetype() {
        return advisetype;
    }

    public void setAdvisetype(String advisetype) {
        this.advisetype = advisetype;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getHits() {
        return hits;
    }

    public void setHits(BigDecimal hits) {
        this.hits = hits;
    }

    public String getAdvisedl() {
        return advisedl;
    }

    public void setAdvisedl(String advisedl) {
        this.advisedl = advisedl;
    }

    public String getIsinoa() {
        return isinoa;
    }

    public void setIsinoa(String isinoa) {
        this.isinoa = isinoa;
    }

    public String getMydpj() {
        return mydpj;
    }

    public void setMydpj(String mydpj) {
        this.mydpj = mydpj;
    }

    public String getMydfkyj() {
        return mydfkyj;
    }

    public void setMydfkyj(String mydfkyj) {
        this.mydfkyj = mydfkyj;
    }
}