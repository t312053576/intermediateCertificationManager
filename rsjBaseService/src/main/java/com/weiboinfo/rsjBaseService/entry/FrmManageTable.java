package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class FrmManageTable implements Serializable {
    private String tableid;

    private String tablexszt;

    private String tablefield;

    private String tablename;

    private Long tableindex;

    private String tableurl;

    private static final long serialVersionUID = 1L;

    public String getTableid() {
        return tableid;
    }

    public void setTableid(String tableid) {
        this.tableid = tableid;
    }

    public String getTablexszt() {
        return tablexszt;
    }

    public void setTablexszt(String tablexszt) {
        this.tablexszt = tablexszt;
    }

    public String getTablefield() {
        return tablefield;
    }

    public void setTablefield(String tablefield) {
        this.tablefield = tablefield;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public Long getTableindex() {
        return tableindex;
    }

    public void setTableindex(Long tableindex) {
        this.tableindex = tableindex;
    }

    public String getTableurl() {
        return tableurl;
    }

    public void setTableurl(String tableurl) {
        this.tableurl = tableurl;
    }
}