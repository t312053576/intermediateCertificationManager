package com.weiboinfo.intermediateCertificationManager.entry;

import java.io.Serializable;

public class CertificateInfo implements Serializable {
    private String cerId;

    private String icard;

    private String holderName;

    private String workUnit;

    private String cerNo;

    private String catena;

    private String cerName;

    private String cerProfession;

    private String startTime;

    private String addTime;

    private static final long serialVersionUID = 1L;

    public String getCerId() {
        return cerId;
    }

    public void setCerId(String cerId) {
        this.cerId = cerId;
    }

    public String getIcard() {
        return icard;
    }

    public void setIcard(String icard) {
        this.icard = icard;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }

    public String getCerNo() {
        return cerNo;
    }

    public void setCerNo(String cerNo) {
        this.cerNo = cerNo;
    }

    public String getCatena() {
        return catena;
    }

    public void setCatena(String catena) {
        this.catena = catena;
    }

    public String getCerName() {
        return cerName;
    }

    public void setCerName(String cerName) {
        this.cerName = cerName;
    }

    public String getCerProfession() {
        return cerProfession;
    }

    public void setCerProfession(String cerProfession) {
        this.cerProfession = cerProfession;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }
}