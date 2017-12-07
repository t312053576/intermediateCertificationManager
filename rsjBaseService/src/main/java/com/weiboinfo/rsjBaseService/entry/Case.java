package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;
import java.math.BigDecimal;

public class Case implements Serializable {
    private String id;

    private String title;

    private String question;

    private String answer;

    private String createtime;

    private String type;

    private String adverseid;

    private BigDecimal hits;

    private String adversedl;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAdverseid() {
        return adverseid;
    }

    public void setAdverseid(String adverseid) {
        this.adverseid = adverseid;
    }

    public BigDecimal getHits() {
        return hits;
    }

    public void setHits(BigDecimal hits) {
        this.hits = hits;
    }

    public String getAdversedl() {
        return adversedl;
    }

    public void setAdversedl(String adversedl) {
        this.adversedl = adversedl;
    }
}