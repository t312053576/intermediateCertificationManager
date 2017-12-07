package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class SurveyAnswerSheet implements Serializable {
    private String asId;

    private String sId;

    private String asResult;

    private String asPostdate;

    private String asUserip;

    private static final long serialVersionUID = 1L;

    public String getAsId() {
        return asId;
    }

    public void setAsId(String asId) {
        this.asId = asId;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getAsResult() {
        return asResult;
    }

    public void setAsResult(String asResult) {
        this.asResult = asResult;
    }

    public String getAsPostdate() {
        return asPostdate;
    }

    public void setAsPostdate(String asPostdate) {
        this.asPostdate = asPostdate;
    }

    public String getAsUserip() {
        return asUserip;
    }

    public void setAsUserip(String asUserip) {
        this.asUserip = asUserip;
    }
}