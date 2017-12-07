package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;
import java.math.BigDecimal;

public class FrmFunctionCellURL implements Serializable {
    private String fuceurlid;

    private String fucecode;

    private String fuceurlname;

    private String fuceurldesc;

    private String fuceurlresource;

    private BigDecimal pageid;

    private String sysid;

    private static final long serialVersionUID = 1L;

    public String getFuceurlid() {
        return fuceurlid;
    }

    public void setFuceurlid(String fuceurlid) {
        this.fuceurlid = fuceurlid;
    }

    public String getFucecode() {
        return fucecode;
    }

    public void setFucecode(String fucecode) {
        this.fucecode = fucecode;
    }

    public String getFuceurlname() {
        return fuceurlname;
    }

    public void setFuceurlname(String fuceurlname) {
        this.fuceurlname = fuceurlname;
    }

    public String getFuceurldesc() {
        return fuceurldesc;
    }

    public void setFuceurldesc(String fuceurldesc) {
        this.fuceurldesc = fuceurldesc;
    }

    public String getFuceurlresource() {
        return fuceurlresource;
    }

    public void setFuceurlresource(String fuceurlresource) {
        this.fuceurlresource = fuceurlresource;
    }

    public BigDecimal getPageid() {
        return pageid;
    }

    public void setPageid(BigDecimal pageid) {
        this.pageid = pageid;
    }

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid;
    }
}