package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class GeneralTemplate implements Serializable {
    private String indextemplate;

    private String listtemplate;

    private String detailtemplate;

    private static final long serialVersionUID = 1L;

    public String getIndextemplate() {
        return indextemplate;
    }

    public void setIndextemplate(String indextemplate) {
        this.indextemplate = indextemplate;
    }

    public String getListtemplate() {
        return listtemplate;
    }

    public void setListtemplate(String listtemplate) {
        this.listtemplate = listtemplate;
    }

    public String getDetailtemplate() {
        return detailtemplate;
    }

    public void setDetailtemplate(String detailtemplate) {
        this.detailtemplate = detailtemplate;
    }
}