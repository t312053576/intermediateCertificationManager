package com.weiboinfo.rsjBaseService.entry;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExchangeLDBZExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExchangeLDBZExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Short value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Short value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Short value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Short value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Short value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Short value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Short> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Short> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Short value1, Short value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Short value1, Short value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("TELEPHONE =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("TELEPHONE <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("TELEPHONE >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("TELEPHONE >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("TELEPHONE <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("TELEPHONE <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("TELEPHONE like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("TELEPHONE not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("TELEPHONE in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("TELEPHONE not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("TELEPHONE between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("TELEPHONE not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andEMailIsNull() {
            addCriterion("E_MAIL is null");
            return (Criteria) this;
        }

        public Criteria andEMailIsNotNull() {
            addCriterion("E_MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEMailEqualTo(String value) {
            addCriterion("E_MAIL =", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotEqualTo(String value) {
            addCriterion("E_MAIL <>", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThan(String value) {
            addCriterion("E_MAIL >", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThanOrEqualTo(String value) {
            addCriterion("E_MAIL >=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThan(String value) {
            addCriterion("E_MAIL <", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThanOrEqualTo(String value) {
            addCriterion("E_MAIL <=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLike(String value) {
            addCriterion("E_MAIL like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotLike(String value) {
            addCriterion("E_MAIL not like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailIn(List<String> values) {
            addCriterion("E_MAIL in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotIn(List<String> values) {
            addCriterion("E_MAIL not in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailBetween(String value1, String value2) {
            addCriterion("E_MAIL between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotBetween(String value1, String value2) {
            addCriterion("E_MAIL not between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("POST is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("POST is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(BigDecimal value) {
            addCriterion("POST =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(BigDecimal value) {
            addCriterion("POST <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(BigDecimal value) {
            addCriterion("POST >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POST >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(BigDecimal value) {
            addCriterion("POST <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POST <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<BigDecimal> values) {
            addCriterion("POST in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<BigDecimal> values) {
            addCriterion("POST not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POST between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POST not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
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

        public Criteria andTimeIsNull() {
            addCriterion("TIME is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("TIME =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("TIME <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("TIME >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TIME >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("TIME <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("TIME <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("TIME in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("TIME not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("TIME between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("TIME not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andIsnetIsNull() {
            addCriterion("ISNET is null");
            return (Criteria) this;
        }

        public Criteria andIsnetIsNotNull() {
            addCriterion("ISNET is not null");
            return (Criteria) this;
        }

        public Criteria andIsnetEqualTo(Short value) {
            addCriterion("ISNET =", value, "isnet");
            return (Criteria) this;
        }

        public Criteria andIsnetNotEqualTo(Short value) {
            addCriterion("ISNET <>", value, "isnet");
            return (Criteria) this;
        }

        public Criteria andIsnetGreaterThan(Short value) {
            addCriterion("ISNET >", value, "isnet");
            return (Criteria) this;
        }

        public Criteria andIsnetGreaterThanOrEqualTo(Short value) {
            addCriterion("ISNET >=", value, "isnet");
            return (Criteria) this;
        }

        public Criteria andIsnetLessThan(Short value) {
            addCriterion("ISNET <", value, "isnet");
            return (Criteria) this;
        }

        public Criteria andIsnetLessThanOrEqualTo(Short value) {
            addCriterion("ISNET <=", value, "isnet");
            return (Criteria) this;
        }

        public Criteria andIsnetIn(List<Short> values) {
            addCriterion("ISNET in", values, "isnet");
            return (Criteria) this;
        }

        public Criteria andIsnetNotIn(List<Short> values) {
            addCriterion("ISNET not in", values, "isnet");
            return (Criteria) this;
        }

        public Criteria andIsnetBetween(Short value1, Short value2) {
            addCriterion("ISNET between", value1, value2, "isnet");
            return (Criteria) this;
        }

        public Criteria andIsnetNotBetween(Short value1, Short value2) {
            addCriterion("ISNET not between", value1, value2, "isnet");
            return (Criteria) this;
        }

        public Criteria andLeibeiIsNull() {
            addCriterion("LEIBEI is null");
            return (Criteria) this;
        }

        public Criteria andLeibeiIsNotNull() {
            addCriterion("LEIBEI is not null");
            return (Criteria) this;
        }

        public Criteria andLeibeiEqualTo(Short value) {
            addCriterion("LEIBEI =", value, "leibei");
            return (Criteria) this;
        }

        public Criteria andLeibeiNotEqualTo(Short value) {
            addCriterion("LEIBEI <>", value, "leibei");
            return (Criteria) this;
        }

        public Criteria andLeibeiGreaterThan(Short value) {
            addCriterion("LEIBEI >", value, "leibei");
            return (Criteria) this;
        }

        public Criteria andLeibeiGreaterThanOrEqualTo(Short value) {
            addCriterion("LEIBEI >=", value, "leibei");
            return (Criteria) this;
        }

        public Criteria andLeibeiLessThan(Short value) {
            addCriterion("LEIBEI <", value, "leibei");
            return (Criteria) this;
        }

        public Criteria andLeibeiLessThanOrEqualTo(Short value) {
            addCriterion("LEIBEI <=", value, "leibei");
            return (Criteria) this;
        }

        public Criteria andLeibeiIn(List<Short> values) {
            addCriterion("LEIBEI in", values, "leibei");
            return (Criteria) this;
        }

        public Criteria andLeibeiNotIn(List<Short> values) {
            addCriterion("LEIBEI not in", values, "leibei");
            return (Criteria) this;
        }

        public Criteria andLeibeiBetween(Short value1, Short value2) {
            addCriterion("LEIBEI between", value1, value2, "leibei");
            return (Criteria) this;
        }

        public Criteria andLeibeiNotBetween(Short value1, Short value2) {
            addCriterion("LEIBEI not between", value1, value2, "leibei");
            return (Criteria) this;
        }

        public Criteria andPartIsNull() {
            addCriterion("PART is null");
            return (Criteria) this;
        }

        public Criteria andPartIsNotNull() {
            addCriterion("PART is not null");
            return (Criteria) this;
        }

        public Criteria andPartEqualTo(Long value) {
            addCriterion("PART =", value, "part");
            return (Criteria) this;
        }

        public Criteria andPartNotEqualTo(Long value) {
            addCriterion("PART <>", value, "part");
            return (Criteria) this;
        }

        public Criteria andPartGreaterThan(Long value) {
            addCriterion("PART >", value, "part");
            return (Criteria) this;
        }

        public Criteria andPartGreaterThanOrEqualTo(Long value) {
            addCriterion("PART >=", value, "part");
            return (Criteria) this;
        }

        public Criteria andPartLessThan(Long value) {
            addCriterion("PART <", value, "part");
            return (Criteria) this;
        }

        public Criteria andPartLessThanOrEqualTo(Long value) {
            addCriterion("PART <=", value, "part");
            return (Criteria) this;
        }

        public Criteria andPartIn(List<Long> values) {
            addCriterion("PART in", values, "part");
            return (Criteria) this;
        }

        public Criteria andPartNotIn(List<Long> values) {
            addCriterion("PART not in", values, "part");
            return (Criteria) this;
        }

        public Criteria andPartBetween(Long value1, Long value2) {
            addCriterion("PART between", value1, value2, "part");
            return (Criteria) this;
        }

        public Criteria andPartNotBetween(Long value1, Long value2) {
            addCriterion("PART not between", value1, value2, "part");
            return (Criteria) this;
        }

        public Criteria andShenheIsNull() {
            addCriterion("SHENHE is null");
            return (Criteria) this;
        }

        public Criteria andShenheIsNotNull() {
            addCriterion("SHENHE is not null");
            return (Criteria) this;
        }

        public Criteria andShenheEqualTo(Short value) {
            addCriterion("SHENHE =", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheNotEqualTo(Short value) {
            addCriterion("SHENHE <>", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheGreaterThan(Short value) {
            addCriterion("SHENHE >", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheGreaterThanOrEqualTo(Short value) {
            addCriterion("SHENHE >=", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheLessThan(Short value) {
            addCriterion("SHENHE <", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheLessThanOrEqualTo(Short value) {
            addCriterion("SHENHE <=", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheIn(List<Short> values) {
            addCriterion("SHENHE in", values, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheNotIn(List<Short> values) {
            addCriterion("SHENHE not in", values, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheBetween(Short value1, Short value2) {
            addCriterion("SHENHE between", value1, value2, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheNotBetween(Short value1, Short value2) {
            addCriterion("SHENHE not between", value1, value2, "shenhe");
            return (Criteria) this;
        }

        public Criteria andName1IsNull() {
            addCriterion("NAME1 is null");
            return (Criteria) this;
        }

        public Criteria andName1IsNotNull() {
            addCriterion("NAME1 is not null");
            return (Criteria) this;
        }

        public Criteria andName1EqualTo(String value) {
            addCriterion("NAME1 =", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotEqualTo(String value) {
            addCriterion("NAME1 <>", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1GreaterThan(String value) {
            addCriterion("NAME1 >", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1GreaterThanOrEqualTo(String value) {
            addCriterion("NAME1 >=", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1LessThan(String value) {
            addCriterion("NAME1 <", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1LessThanOrEqualTo(String value) {
            addCriterion("NAME1 <=", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1Like(String value) {
            addCriterion("NAME1 like", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotLike(String value) {
            addCriterion("NAME1 not like", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1In(List<String> values) {
            addCriterion("NAME1 in", values, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotIn(List<String> values) {
            addCriterion("NAME1 not in", values, "name1");
            return (Criteria) this;
        }

        public Criteria andName1Between(String value1, String value2) {
            addCriterion("NAME1 between", value1, value2, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotBetween(String value1, String value2) {
            addCriterion("NAME1 not between", value1, value2, "name1");
            return (Criteria) this;
        }

        public Criteria andBjIsNull() {
            addCriterion("BJ is null");
            return (Criteria) this;
        }

        public Criteria andBjIsNotNull() {
            addCriterion("BJ is not null");
            return (Criteria) this;
        }

        public Criteria andBjEqualTo(Short value) {
            addCriterion("BJ =", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotEqualTo(Short value) {
            addCriterion("BJ <>", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjGreaterThan(Short value) {
            addCriterion("BJ >", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjGreaterThanOrEqualTo(Short value) {
            addCriterion("BJ >=", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLessThan(Short value) {
            addCriterion("BJ <", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLessThanOrEqualTo(Short value) {
            addCriterion("BJ <=", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjIn(List<Short> values) {
            addCriterion("BJ in", values, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotIn(List<Short> values) {
            addCriterion("BJ not in", values, "bj");
            return (Criteria) this;
        }

        public Criteria andBjBetween(Short value1, Short value2) {
            addCriterion("BJ between", value1, value2, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotBetween(Short value1, Short value2) {
            addCriterion("BJ not between", value1, value2, "bj");
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