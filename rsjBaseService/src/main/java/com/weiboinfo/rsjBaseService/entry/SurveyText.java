package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class SurveyText implements Serializable {
    private String tId;

    private String qId;

    private String tContent;

    private static final long serialVersionUID = 1L;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String getqId() {
        return qId;
    }

    public void setqId(String qId) {
        this.qId = qId;
    }

    public String gettContent() {
        return tContent;
    }

    public void settContent(String tContent) {
        this.tContent = tContent;
    }
}