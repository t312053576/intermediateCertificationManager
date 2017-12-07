package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class TemplateBak implements Serializable {
    private String id;

    private String name;

    private String folderurl;

    private String tid;

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

    public String getFolderurl() {
        return folderurl;
    }

    public void setFolderurl(String folderurl) {
        this.folderurl = folderurl;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }
}