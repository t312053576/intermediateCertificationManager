package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class Ipdatd implements Serializable {
    private String beginid;

    private String endid;

    private String valuek;

    private String attachment;

    private static final long serialVersionUID = 1L;

    public String getBeginid() {
        return beginid;
    }

    public void setBeginid(String beginid) {
        this.beginid = beginid;
    }

    public String getEndid() {
        return endid;
    }

    public void setEndid(String endid) {
        this.endid = endid;
    }

    public String getValuek() {
        return valuek;
    }

    public void setValuek(String valuek) {
        this.valuek = valuek;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }
}