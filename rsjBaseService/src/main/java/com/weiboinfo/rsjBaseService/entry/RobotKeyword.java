package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class RobotKeyword implements Serializable {
    private String infoid;

    private String keywordinfo;

    private static final long serialVersionUID = 1L;

    public String getInfoid() {
        return infoid;
    }

    public void setInfoid(String infoid) {
        this.infoid = infoid;
    }

    public String getKeywordinfo() {
        return keywordinfo;
    }

    public void setKeywordinfo(String keywordinfo) {
        this.keywordinfo = keywordinfo;
    }
}