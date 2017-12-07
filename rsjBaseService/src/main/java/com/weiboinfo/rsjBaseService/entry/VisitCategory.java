package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;
import java.math.BigDecimal;

public class VisitCategory implements Serializable {
    private String id;

    private String catename;

    private String parentid;

    private String catemark;

    private BigDecimal orderby;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCatename() {
        return catename;
    }

    public void setCatename(String catename) {
        this.catename = catename;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getCatemark() {
        return catemark;
    }

    public void setCatemark(String catemark) {
        this.catemark = catemark;
    }

    public BigDecimal getOrderby() {
        return orderby;
    }

    public void setOrderby(BigDecimal orderby) {
        this.orderby = orderby;
    }
}