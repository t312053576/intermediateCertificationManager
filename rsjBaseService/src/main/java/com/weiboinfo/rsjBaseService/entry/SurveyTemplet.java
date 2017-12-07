package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class SurveyTemplet implements Serializable {
    private String templetId;

    private String templetName;

    private String templetDefault;

    private String templetTop;

    private String templetBody;

    private String templetBottom;

    private static final long serialVersionUID = 1L;

    public String getTempletId() {
        return templetId;
    }

    public void setTempletId(String templetId) {
        this.templetId = templetId;
    }

    public String getTempletName() {
        return templetName;
    }

    public void setTempletName(String templetName) {
        this.templetName = templetName;
    }

    public String getTempletDefault() {
        return templetDefault;
    }

    public void setTempletDefault(String templetDefault) {
        this.templetDefault = templetDefault;
    }

    public String getTempletTop() {
        return templetTop;
    }

    public void setTempletTop(String templetTop) {
        this.templetTop = templetTop;
    }

    public String getTempletBody() {
        return templetBody;
    }

    public void setTempletBody(String templetBody) {
        this.templetBody = templetBody;
    }

    public String getTempletBottom() {
        return templetBottom;
    }

    public void setTempletBottom(String templetBottom) {
        this.templetBottom = templetBottom;
    }
}