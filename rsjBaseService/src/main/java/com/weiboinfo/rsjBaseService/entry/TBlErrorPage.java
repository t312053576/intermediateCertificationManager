package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class TBlErrorPage implements Serializable {
    private String id;

    private String title;

    private String url;

    private String text;

    private String cwsm;

    private String cwlx;

    private String name;

    private String email;

    private String phone;

    private String tjsj;

    private String ip;

    private String isFeedback;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCwsm() {
        return cwsm;
    }

    public void setCwsm(String cwsm) {
        this.cwsm = cwsm;
    }

    public String getCwlx() {
        return cwlx;
    }

    public void setCwlx(String cwlx) {
        this.cwlx = cwlx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTjsj() {
        return tjsj;
    }

    public void setTjsj(String tjsj) {
        this.tjsj = tjsj;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIsFeedback() {
        return isFeedback;
    }

    public void setIsFeedback(String isFeedback) {
        this.isFeedback = isFeedback;
    }
}