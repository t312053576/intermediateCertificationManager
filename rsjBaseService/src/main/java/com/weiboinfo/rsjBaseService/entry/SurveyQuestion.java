package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class SurveyQuestion implements Serializable {
    private String qId;

    private String sId;

    private String qType;

    private String qHead;

    private String qBody;

    private String qResult;

    private String qImg;

    private String qJdtz;

    private String qOrder;

    private static final long serialVersionUID = 1L;

    public String getqId() {
        return qId;
    }

    public void setqId(String qId) {
        this.qId = qId;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getqType() {
        return qType;
    }

    public void setqType(String qType) {
        this.qType = qType;
    }

    public String getqHead() {
        return qHead;
    }

    public void setqHead(String qHead) {
        this.qHead = qHead;
    }

    public String getqBody() {
        return qBody;
    }

    public void setqBody(String qBody) {
        this.qBody = qBody;
    }

    public String getqResult() {
        return qResult;
    }

    public void setqResult(String qResult) {
        this.qResult = qResult;
    }

    public String getqImg() {
        return qImg;
    }

    public void setqImg(String qImg) {
        this.qImg = qImg;
    }

    public String getqJdtz() {
        return qJdtz;
    }

    public void setqJdtz(String qJdtz) {
        this.qJdtz = qJdtz;
    }

    public String getqOrder() {
        return qOrder;
    }

    public void setqOrder(String qOrder) {
        this.qOrder = qOrder;
    }
}