package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ExchangeLDBZ implements Serializable {
    private Long id;

    private String name;

    private Short sex;

    private String telephone;

    private String eMail;

    private BigDecimal post;

    private String address;

    private String title;

    private Date time;

    private Short isnet;

    private Short leibei;

    private Long part;

    private Short shenhe;

    private String name1;

    private Short bj;

    private String content;

    private String restore;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public BigDecimal getPost() {
        return post;
    }

    public void setPost(BigDecimal post) {
        this.post = post;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Short getIsnet() {
        return isnet;
    }

    public void setIsnet(Short isnet) {
        this.isnet = isnet;
    }

    public Short getLeibei() {
        return leibei;
    }

    public void setLeibei(Short leibei) {
        this.leibei = leibei;
    }

    public Long getPart() {
        return part;
    }

    public void setPart(Long part) {
        this.part = part;
    }

    public Short getShenhe() {
        return shenhe;
    }

    public void setShenhe(Short shenhe) {
        this.shenhe = shenhe;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public Short getBj() {
        return bj;
    }

    public void setBj(Short bj) {
        this.bj = bj;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRestore() {
        return restore;
    }

    public void setRestore(String restore) {
        this.restore = restore;
    }
}