package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class TBlErrorPageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBlErrorPageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andTextIsNull() {
            addCriterion("TEXT is null");
            return (Criteria) this;
        }

        public Criteria andTextIsNotNull() {
            addCriterion("TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andTextEqualTo(String value) {
            addCriterion("TEXT =", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotEqualTo(String value) {
            addCriterion("TEXT <>", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThan(String value) {
            addCriterion("TEXT >", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThanOrEqualTo(String value) {
            addCriterion("TEXT >=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThan(String value) {
            addCriterion("TEXT <", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThanOrEqualTo(String value) {
            addCriterion("TEXT <=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLike(String value) {
            addCriterion("TEXT like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotLike(String value) {
            addCriterion("TEXT not like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextIn(List<String> values) {
            addCriterion("TEXT in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotIn(List<String> values) {
            addCriterion("TEXT not in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextBetween(String value1, String value2) {
            addCriterion("TEXT between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotBetween(String value1, String value2) {
            addCriterion("TEXT not between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andCwsmIsNull() {
            addCriterion("CWSM is null");
            return (Criteria) this;
        }

        public Criteria andCwsmIsNotNull() {
            addCriterion("CWSM is not null");
            return (Criteria) this;
        }

        public Criteria andCwsmEqualTo(String value) {
            addCriterion("CWSM =", value, "cwsm");
            return (Criteria) this;
        }

        public Criteria andCwsmNotEqualTo(String value) {
            addCriterion("CWSM <>", value, "cwsm");
            return (Criteria) this;
        }

        public Criteria andCwsmGreaterThan(String value) {
            addCriterion("CWSM >", value, "cwsm");
            return (Criteria) this;
        }

        public Criteria andCwsmGreaterThanOrEqualTo(String value) {
            addCriterion("CWSM >=", value, "cwsm");
            return (Criteria) this;
        }

        public Criteria andCwsmLessThan(String value) {
            addCriterion("CWSM <", value, "cwsm");
            return (Criteria) this;
        }

        public Criteria andCwsmLessThanOrEqualTo(String value) {
            addCriterion("CWSM <=", value, "cwsm");
            return (Criteria) this;
        }

        public Criteria andCwsmLike(String value) {
            addCriterion("CWSM like", value, "cwsm");
            return (Criteria) this;
        }

        public Criteria andCwsmNotLike(String value) {
            addCriterion("CWSM not like", value, "cwsm");
            return (Criteria) this;
        }

        public Criteria andCwsmIn(List<String> values) {
            addCriterion("CWSM in", values, "cwsm");
            return (Criteria) this;
        }

        public Criteria andCwsmNotIn(List<String> values) {
            addCriterion("CWSM not in", values, "cwsm");
            return (Criteria) this;
        }

        public Criteria andCwsmBetween(String value1, String value2) {
            addCriterion("CWSM between", value1, value2, "cwsm");
            return (Criteria) this;
        }

        public Criteria andCwsmNotBetween(String value1, String value2) {
            addCriterion("CWSM not between", value1, value2, "cwsm");
            return (Criteria) this;
        }

        public Criteria andCwlxIsNull() {
            addCriterion("CWLX is null");
            return (Criteria) this;
        }

        public Criteria andCwlxIsNotNull() {
            addCriterion("CWLX is not null");
            return (Criteria) this;
        }

        public Criteria andCwlxEqualTo(String value) {
            addCriterion("CWLX =", value, "cwlx");
            return (Criteria) this;
        }

        public Criteria andCwlxNotEqualTo(String value) {
            addCriterion("CWLX <>", value, "cwlx");
            return (Criteria) this;
        }

        public Criteria andCwlxGreaterThan(String value) {
            addCriterion("CWLX >", value, "cwlx");
            return (Criteria) this;
        }

        public Criteria andCwlxGreaterThanOrEqualTo(String value) {
            addCriterion("CWLX >=", value, "cwlx");
            return (Criteria) this;
        }

        public Criteria andCwlxLessThan(String value) {
            addCriterion("CWLX <", value, "cwlx");
            return (Criteria) this;
        }

        public Criteria andCwlxLessThanOrEqualTo(String value) {
            addCriterion("CWLX <=", value, "cwlx");
            return (Criteria) this;
        }

        public Criteria andCwlxLike(String value) {
            addCriterion("CWLX like", value, "cwlx");
            return (Criteria) this;
        }

        public Criteria andCwlxNotLike(String value) {
            addCriterion("CWLX not like", value, "cwlx");
            return (Criteria) this;
        }

        public Criteria andCwlxIn(List<String> values) {
            addCriterion("CWLX in", values, "cwlx");
            return (Criteria) this;
        }

        public Criteria andCwlxNotIn(List<String> values) {
            addCriterion("CWLX not in", values, "cwlx");
            return (Criteria) this;
        }

        public Criteria andCwlxBetween(String value1, String value2) {
            addCriterion("CWLX between", value1, value2, "cwlx");
            return (Criteria) this;
        }

        public Criteria andCwlxNotBetween(String value1, String value2) {
            addCriterion("CWLX not between", value1, value2, "cwlx");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andTjsjIsNull() {
            addCriterion("TJSJ is null");
            return (Criteria) this;
        }

        public Criteria andTjsjIsNotNull() {
            addCriterion("TJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andTjsjEqualTo(String value) {
            addCriterion("TJSJ =", value, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjNotEqualTo(String value) {
            addCriterion("TJSJ <>", value, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjGreaterThan(String value) {
            addCriterion("TJSJ >", value, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjGreaterThanOrEqualTo(String value) {
            addCriterion("TJSJ >=", value, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjLessThan(String value) {
            addCriterion("TJSJ <", value, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjLessThanOrEqualTo(String value) {
            addCriterion("TJSJ <=", value, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjLike(String value) {
            addCriterion("TJSJ like", value, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjNotLike(String value) {
            addCriterion("TJSJ not like", value, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjIn(List<String> values) {
            addCriterion("TJSJ in", values, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjNotIn(List<String> values) {
            addCriterion("TJSJ not in", values, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjBetween(String value1, String value2) {
            addCriterion("TJSJ between", value1, value2, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjNotBetween(String value1, String value2) {
            addCriterion("TJSJ not between", value1, value2, "tjsj");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIsFeedbackIsNull() {
            addCriterion("IS_FEEDBACK is null");
            return (Criteria) this;
        }

        public Criteria andIsFeedbackIsNotNull() {
            addCriterion("IS_FEEDBACK is not null");
            return (Criteria) this;
        }

        public Criteria andIsFeedbackEqualTo(String value) {
            addCriterion("IS_FEEDBACK =", value, "isFeedback");
            return (Criteria) this;
        }

        public Criteria andIsFeedbackNotEqualTo(String value) {
            addCriterion("IS_FEEDBACK <>", value, "isFeedback");
            return (Criteria) this;
        }

        public Criteria andIsFeedbackGreaterThan(String value) {
            addCriterion("IS_FEEDBACK >", value, "isFeedback");
            return (Criteria) this;
        }

        public Criteria andIsFeedbackGreaterThanOrEqualTo(String value) {
            addCriterion("IS_FEEDBACK >=", value, "isFeedback");
            return (Criteria) this;
        }

        public Criteria andIsFeedbackLessThan(String value) {
            addCriterion("IS_FEEDBACK <", value, "isFeedback");
            return (Criteria) this;
        }

        public Criteria andIsFeedbackLessThanOrEqualTo(String value) {
            addCriterion("IS_FEEDBACK <=", value, "isFeedback");
            return (Criteria) this;
        }

        public Criteria andIsFeedbackLike(String value) {
            addCriterion("IS_FEEDBACK like", value, "isFeedback");
            return (Criteria) this;
        }

        public Criteria andIsFeedbackNotLike(String value) {
            addCriterion("IS_FEEDBACK not like", value, "isFeedback");
            return (Criteria) this;
        }

        public Criteria andIsFeedbackIn(List<String> values) {
            addCriterion("IS_FEEDBACK in", values, "isFeedback");
            return (Criteria) this;
        }

        public Criteria andIsFeedbackNotIn(List<String> values) {
            addCriterion("IS_FEEDBACK not in", values, "isFeedback");
            return (Criteria) this;
        }

        public Criteria andIsFeedbackBetween(String value1, String value2) {
            addCriterion("IS_FEEDBACK between", value1, value2, "isFeedback");
            return (Criteria) this;
        }

        public Criteria andIsFeedbackNotBetween(String value1, String value2) {
            addCriterion("IS_FEEDBACK not between", value1, value2, "isFeedback");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}