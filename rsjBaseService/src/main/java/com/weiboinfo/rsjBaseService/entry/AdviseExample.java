package com.weiboinfo.rsjBaseService.entry;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AdviseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdviseExample() {
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

        public Criteria andIdcardIsNull() {
            addCriterion("IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDCARD =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDCARD <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDCARD >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDCARD <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDCARD <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDCARD like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDCARD not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDCARD in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDCARD not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDCARD between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDCARD not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andTelnumberIsNull() {
            addCriterion("TELNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andTelnumberIsNotNull() {
            addCriterion("TELNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andTelnumberEqualTo(String value) {
            addCriterion("TELNUMBER =", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotEqualTo(String value) {
            addCriterion("TELNUMBER <>", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberGreaterThan(String value) {
            addCriterion("TELNUMBER >", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberGreaterThanOrEqualTo(String value) {
            addCriterion("TELNUMBER >=", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLessThan(String value) {
            addCriterion("TELNUMBER <", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLessThanOrEqualTo(String value) {
            addCriterion("TELNUMBER <=", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLike(String value) {
            addCriterion("TELNUMBER like", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotLike(String value) {
            addCriterion("TELNUMBER not like", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberIn(List<String> values) {
            addCriterion("TELNUMBER in", values, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotIn(List<String> values) {
            addCriterion("TELNUMBER not in", values, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberBetween(String value1, String value2) {
            addCriterion("TELNUMBER between", value1, value2, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotBetween(String value1, String value2) {
            addCriterion("TELNUMBER not between", value1, value2, "telnumber");
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

        public Criteria andAdvisecontentIsNull() {
            addCriterion("ADVISECONTENT is null");
            return (Criteria) this;
        }

        public Criteria andAdvisecontentIsNotNull() {
            addCriterion("ADVISECONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andAdvisecontentEqualTo(String value) {
            addCriterion("ADVISECONTENT =", value, "advisecontent");
            return (Criteria) this;
        }

        public Criteria andAdvisecontentNotEqualTo(String value) {
            addCriterion("ADVISECONTENT <>", value, "advisecontent");
            return (Criteria) this;
        }

        public Criteria andAdvisecontentGreaterThan(String value) {
            addCriterion("ADVISECONTENT >", value, "advisecontent");
            return (Criteria) this;
        }

        public Criteria andAdvisecontentGreaterThanOrEqualTo(String value) {
            addCriterion("ADVISECONTENT >=", value, "advisecontent");
            return (Criteria) this;
        }

        public Criteria andAdvisecontentLessThan(String value) {
            addCriterion("ADVISECONTENT <", value, "advisecontent");
            return (Criteria) this;
        }

        public Criteria andAdvisecontentLessThanOrEqualTo(String value) {
            addCriterion("ADVISECONTENT <=", value, "advisecontent");
            return (Criteria) this;
        }

        public Criteria andAdvisecontentLike(String value) {
            addCriterion("ADVISECONTENT like", value, "advisecontent");
            return (Criteria) this;
        }

        public Criteria andAdvisecontentNotLike(String value) {
            addCriterion("ADVISECONTENT not like", value, "advisecontent");
            return (Criteria) this;
        }

        public Criteria andAdvisecontentIn(List<String> values) {
            addCriterion("ADVISECONTENT in", values, "advisecontent");
            return (Criteria) this;
        }

        public Criteria andAdvisecontentNotIn(List<String> values) {
            addCriterion("ADVISECONTENT not in", values, "advisecontent");
            return (Criteria) this;
        }

        public Criteria andAdvisecontentBetween(String value1, String value2) {
            addCriterion("ADVISECONTENT between", value1, value2, "advisecontent");
            return (Criteria) this;
        }

        public Criteria andAdvisecontentNotBetween(String value1, String value2) {
            addCriterion("ADVISECONTENT not between", value1, value2, "advisecontent");
            return (Criteria) this;
        }

        public Criteria andSearchcodeIsNull() {
            addCriterion("SEARCHCODE is null");
            return (Criteria) this;
        }

        public Criteria andSearchcodeIsNotNull() {
            addCriterion("SEARCHCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSearchcodeEqualTo(String value) {
            addCriterion("SEARCHCODE =", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeNotEqualTo(String value) {
            addCriterion("SEARCHCODE <>", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeGreaterThan(String value) {
            addCriterion("SEARCHCODE >", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SEARCHCODE >=", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeLessThan(String value) {
            addCriterion("SEARCHCODE <", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeLessThanOrEqualTo(String value) {
            addCriterion("SEARCHCODE <=", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeLike(String value) {
            addCriterion("SEARCHCODE like", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeNotLike(String value) {
            addCriterion("SEARCHCODE not like", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeIn(List<String> values) {
            addCriterion("SEARCHCODE in", values, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeNotIn(List<String> values) {
            addCriterion("SEARCHCODE not in", values, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeBetween(String value1, String value2) {
            addCriterion("SEARCHCODE between", value1, value2, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeNotBetween(String value1, String value2) {
            addCriterion("SEARCHCODE not between", value1, value2, "searchcode");
            return (Criteria) this;
        }

        public Criteria andAdvisetypeIsNull() {
            addCriterion("ADVISETYPE is null");
            return (Criteria) this;
        }

        public Criteria andAdvisetypeIsNotNull() {
            addCriterion("ADVISETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAdvisetypeEqualTo(String value) {
            addCriterion("ADVISETYPE =", value, "advisetype");
            return (Criteria) this;
        }

        public Criteria andAdvisetypeNotEqualTo(String value) {
            addCriterion("ADVISETYPE <>", value, "advisetype");
            return (Criteria) this;
        }

        public Criteria andAdvisetypeGreaterThan(String value) {
            addCriterion("ADVISETYPE >", value, "advisetype");
            return (Criteria) this;
        }

        public Criteria andAdvisetypeGreaterThanOrEqualTo(String value) {
            addCriterion("ADVISETYPE >=", value, "advisetype");
            return (Criteria) this;
        }

        public Criteria andAdvisetypeLessThan(String value) {
            addCriterion("ADVISETYPE <", value, "advisetype");
            return (Criteria) this;
        }

        public Criteria andAdvisetypeLessThanOrEqualTo(String value) {
            addCriterion("ADVISETYPE <=", value, "advisetype");
            return (Criteria) this;
        }

        public Criteria andAdvisetypeLike(String value) {
            addCriterion("ADVISETYPE like", value, "advisetype");
            return (Criteria) this;
        }

        public Criteria andAdvisetypeNotLike(String value) {
            addCriterion("ADVISETYPE not like", value, "advisetype");
            return (Criteria) this;
        }

        public Criteria andAdvisetypeIn(List<String> values) {
            addCriterion("ADVISETYPE in", values, "advisetype");
            return (Criteria) this;
        }

        public Criteria andAdvisetypeNotIn(List<String> values) {
            addCriterion("ADVISETYPE not in", values, "advisetype");
            return (Criteria) this;
        }

        public Criteria andAdvisetypeBetween(String value1, String value2) {
            addCriterion("ADVISETYPE between", value1, value2, "advisetype");
            return (Criteria) this;
        }

        public Criteria andAdvisetypeNotBetween(String value1, String value2) {
            addCriterion("ADVISETYPE not between", value1, value2, "advisetype");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("CREATETIME like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("CREATETIME not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andReplytimeIsNull() {
            addCriterion("REPLYTIME is null");
            return (Criteria) this;
        }

        public Criteria andReplytimeIsNotNull() {
            addCriterion("REPLYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andReplytimeEqualTo(String value) {
            addCriterion("REPLYTIME =", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotEqualTo(String value) {
            addCriterion("REPLYTIME <>", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeGreaterThan(String value) {
            addCriterion("REPLYTIME >", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeGreaterThanOrEqualTo(String value) {
            addCriterion("REPLYTIME >=", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLessThan(String value) {
            addCriterion("REPLYTIME <", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLessThanOrEqualTo(String value) {
            addCriterion("REPLYTIME <=", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLike(String value) {
            addCriterion("REPLYTIME like", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotLike(String value) {
            addCriterion("REPLYTIME not like", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeIn(List<String> values) {
            addCriterion("REPLYTIME in", values, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotIn(List<String> values) {
            addCriterion("REPLYTIME not in", values, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeBetween(String value1, String value2) {
            addCriterion("REPLYTIME between", value1, value2, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotBetween(String value1, String value2) {
            addCriterion("REPLYTIME not between", value1, value2, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplystatusIsNull() {
            addCriterion("REPLYSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andReplystatusIsNotNull() {
            addCriterion("REPLYSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andReplystatusEqualTo(String value) {
            addCriterion("REPLYSTATUS =", value, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplystatusNotEqualTo(String value) {
            addCriterion("REPLYSTATUS <>", value, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplystatusGreaterThan(String value) {
            addCriterion("REPLYSTATUS >", value, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplystatusGreaterThanOrEqualTo(String value) {
            addCriterion("REPLYSTATUS >=", value, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplystatusLessThan(String value) {
            addCriterion("REPLYSTATUS <", value, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplystatusLessThanOrEqualTo(String value) {
            addCriterion("REPLYSTATUS <=", value, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplystatusLike(String value) {
            addCriterion("REPLYSTATUS like", value, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplystatusNotLike(String value) {
            addCriterion("REPLYSTATUS not like", value, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplystatusIn(List<String> values) {
            addCriterion("REPLYSTATUS in", values, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplystatusNotIn(List<String> values) {
            addCriterion("REPLYSTATUS not in", values, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplystatusBetween(String value1, String value2) {
            addCriterion("REPLYSTATUS between", value1, value2, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplystatusNotBetween(String value1, String value2) {
            addCriterion("REPLYSTATUS not between", value1, value2, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplycontentIsNull() {
            addCriterion("REPLYCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andReplycontentIsNotNull() {
            addCriterion("REPLYCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andReplycontentEqualTo(String value) {
            addCriterion("REPLYCONTENT =", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotEqualTo(String value) {
            addCriterion("REPLYCONTENT <>", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentGreaterThan(String value) {
            addCriterion("REPLYCONTENT >", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentGreaterThanOrEqualTo(String value) {
            addCriterion("REPLYCONTENT >=", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentLessThan(String value) {
            addCriterion("REPLYCONTENT <", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentLessThanOrEqualTo(String value) {
            addCriterion("REPLYCONTENT <=", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentLike(String value) {
            addCriterion("REPLYCONTENT like", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotLike(String value) {
            addCriterion("REPLYCONTENT not like", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentIn(List<String> values) {
            addCriterion("REPLYCONTENT in", values, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotIn(List<String> values) {
            addCriterion("REPLYCONTENT not in", values, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentBetween(String value1, String value2) {
            addCriterion("REPLYCONTENT between", value1, value2, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotBetween(String value1, String value2) {
            addCriterion("REPLYCONTENT not between", value1, value2, "replycontent");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
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

        public Criteria andHitsIsNull() {
            addCriterion("HITS is null");
            return (Criteria) this;
        }

        public Criteria andHitsIsNotNull() {
            addCriterion("HITS is not null");
            return (Criteria) this;
        }

        public Criteria andHitsEqualTo(BigDecimal value) {
            addCriterion("HITS =", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotEqualTo(BigDecimal value) {
            addCriterion("HITS <>", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThan(BigDecimal value) {
            addCriterion("HITS >", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HITS >=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThan(BigDecimal value) {
            addCriterion("HITS <", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HITS <=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsIn(List<BigDecimal> values) {
            addCriterion("HITS in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotIn(List<BigDecimal> values) {
            addCriterion("HITS not in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HITS between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HITS not between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andAdvisedlIsNull() {
            addCriterion("ADVISEDL is null");
            return (Criteria) this;
        }

        public Criteria andAdvisedlIsNotNull() {
            addCriterion("ADVISEDL is not null");
            return (Criteria) this;
        }

        public Criteria andAdvisedlEqualTo(String value) {
            addCriterion("ADVISEDL =", value, "advisedl");
            return (Criteria) this;
        }

        public Criteria andAdvisedlNotEqualTo(String value) {
            addCriterion("ADVISEDL <>", value, "advisedl");
            return (Criteria) this;
        }

        public Criteria andAdvisedlGreaterThan(String value) {
            addCriterion("ADVISEDL >", value, "advisedl");
            return (Criteria) this;
        }

        public Criteria andAdvisedlGreaterThanOrEqualTo(String value) {
            addCriterion("ADVISEDL >=", value, "advisedl");
            return (Criteria) this;
        }

        public Criteria andAdvisedlLessThan(String value) {
            addCriterion("ADVISEDL <", value, "advisedl");
            return (Criteria) this;
        }

        public Criteria andAdvisedlLessThanOrEqualTo(String value) {
            addCriterion("ADVISEDL <=", value, "advisedl");
            return (Criteria) this;
        }

        public Criteria andAdvisedlLike(String value) {
            addCriterion("ADVISEDL like", value, "advisedl");
            return (Criteria) this;
        }

        public Criteria andAdvisedlNotLike(String value) {
            addCriterion("ADVISEDL not like", value, "advisedl");
            return (Criteria) this;
        }

        public Criteria andAdvisedlIn(List<String> values) {
            addCriterion("ADVISEDL in", values, "advisedl");
            return (Criteria) this;
        }

        public Criteria andAdvisedlNotIn(List<String> values) {
            addCriterion("ADVISEDL not in", values, "advisedl");
            return (Criteria) this;
        }

        public Criteria andAdvisedlBetween(String value1, String value2) {
            addCriterion("ADVISEDL between", value1, value2, "advisedl");
            return (Criteria) this;
        }

        public Criteria andAdvisedlNotBetween(String value1, String value2) {
            addCriterion("ADVISEDL not between", value1, value2, "advisedl");
            return (Criteria) this;
        }

        public Criteria andIsinoaIsNull() {
            addCriterion("ISINOA is null");
            return (Criteria) this;
        }

        public Criteria andIsinoaIsNotNull() {
            addCriterion("ISINOA is not null");
            return (Criteria) this;
        }

        public Criteria andIsinoaEqualTo(String value) {
            addCriterion("ISINOA =", value, "isinoa");
            return (Criteria) this;
        }

        public Criteria andIsinoaNotEqualTo(String value) {
            addCriterion("ISINOA <>", value, "isinoa");
            return (Criteria) this;
        }

        public Criteria andIsinoaGreaterThan(String value) {
            addCriterion("ISINOA >", value, "isinoa");
            return (Criteria) this;
        }

        public Criteria andIsinoaGreaterThanOrEqualTo(String value) {
            addCriterion("ISINOA >=", value, "isinoa");
            return (Criteria) this;
        }

        public Criteria andIsinoaLessThan(String value) {
            addCriterion("ISINOA <", value, "isinoa");
            return (Criteria) this;
        }

        public Criteria andIsinoaLessThanOrEqualTo(String value) {
            addCriterion("ISINOA <=", value, "isinoa");
            return (Criteria) this;
        }

        public Criteria andIsinoaLike(String value) {
            addCriterion("ISINOA like", value, "isinoa");
            return (Criteria) this;
        }

        public Criteria andIsinoaNotLike(String value) {
            addCriterion("ISINOA not like", value, "isinoa");
            return (Criteria) this;
        }

        public Criteria andIsinoaIn(List<String> values) {
            addCriterion("ISINOA in", values, "isinoa");
            return (Criteria) this;
        }

        public Criteria andIsinoaNotIn(List<String> values) {
            addCriterion("ISINOA not in", values, "isinoa");
            return (Criteria) this;
        }

        public Criteria andIsinoaBetween(String value1, String value2) {
            addCriterion("ISINOA between", value1, value2, "isinoa");
            return (Criteria) this;
        }

        public Criteria andIsinoaNotBetween(String value1, String value2) {
            addCriterion("ISINOA not between", value1, value2, "isinoa");
            return (Criteria) this;
        }

        public Criteria andMydpjIsNull() {
            addCriterion("MYDPJ is null");
            return (Criteria) this;
        }

        public Criteria andMydpjIsNotNull() {
            addCriterion("MYDPJ is not null");
            return (Criteria) this;
        }

        public Criteria andMydpjEqualTo(String value) {
            addCriterion("MYDPJ =", value, "mydpj");
            return (Criteria) this;
        }

        public Criteria andMydpjNotEqualTo(String value) {
            addCriterion("MYDPJ <>", value, "mydpj");
            return (Criteria) this;
        }

        public Criteria andMydpjGreaterThan(String value) {
            addCriterion("MYDPJ >", value, "mydpj");
            return (Criteria) this;
        }

        public Criteria andMydpjGreaterThanOrEqualTo(String value) {
            addCriterion("MYDPJ >=", value, "mydpj");
            return (Criteria) this;
        }

        public Criteria andMydpjLessThan(String value) {
            addCriterion("MYDPJ <", value, "mydpj");
            return (Criteria) this;
        }

        public Criteria andMydpjLessThanOrEqualTo(String value) {
            addCriterion("MYDPJ <=", value, "mydpj");
            return (Criteria) this;
        }

        public Criteria andMydpjLike(String value) {
            addCriterion("MYDPJ like", value, "mydpj");
            return (Criteria) this;
        }

        public Criteria andMydpjNotLike(String value) {
            addCriterion("MYDPJ not like", value, "mydpj");
            return (Criteria) this;
        }

        public Criteria andMydpjIn(List<String> values) {
            addCriterion("MYDPJ in", values, "mydpj");
            return (Criteria) this;
        }

        public Criteria andMydpjNotIn(List<String> values) {
            addCriterion("MYDPJ not in", values, "mydpj");
            return (Criteria) this;
        }

        public Criteria andMydpjBetween(String value1, String value2) {
            addCriterion("MYDPJ between", value1, value2, "mydpj");
            return (Criteria) this;
        }

        public Criteria andMydpjNotBetween(String value1, String value2) {
            addCriterion("MYDPJ not between", value1, value2, "mydpj");
            return (Criteria) this;
        }

        public Criteria andMydfkyjIsNull() {
            addCriterion("MYDFKYJ is null");
            return (Criteria) this;
        }

        public Criteria andMydfkyjIsNotNull() {
            addCriterion("MYDFKYJ is not null");
            return (Criteria) this;
        }

        public Criteria andMydfkyjEqualTo(String value) {
            addCriterion("MYDFKYJ =", value, "mydfkyj");
            return (Criteria) this;
        }

        public Criteria andMydfkyjNotEqualTo(String value) {
            addCriterion("MYDFKYJ <>", value, "mydfkyj");
            return (Criteria) this;
        }

        public Criteria andMydfkyjGreaterThan(String value) {
            addCriterion("MYDFKYJ >", value, "mydfkyj");
            return (Criteria) this;
        }

        public Criteria andMydfkyjGreaterThanOrEqualTo(String value) {
            addCriterion("MYDFKYJ >=", value, "mydfkyj");
            return (Criteria) this;
        }

        public Criteria andMydfkyjLessThan(String value) {
            addCriterion("MYDFKYJ <", value, "mydfkyj");
            return (Criteria) this;
        }

        public Criteria andMydfkyjLessThanOrEqualTo(String value) {
            addCriterion("MYDFKYJ <=", value, "mydfkyj");
            return (Criteria) this;
        }

        public Criteria andMydfkyjLike(String value) {
            addCriterion("MYDFKYJ like", value, "mydfkyj");
            return (Criteria) this;
        }

        public Criteria andMydfkyjNotLike(String value) {
            addCriterion("MYDFKYJ not like", value, "mydfkyj");
            return (Criteria) this;
        }

        public Criteria andMydfkyjIn(List<String> values) {
            addCriterion("MYDFKYJ in", values, "mydfkyj");
            return (Criteria) this;
        }

        public Criteria andMydfkyjNotIn(List<String> values) {
            addCriterion("MYDFKYJ not in", values, "mydfkyj");
            return (Criteria) this;
        }

        public Criteria andMydfkyjBetween(String value1, String value2) {
            addCriterion("MYDFKYJ between", value1, value2, "mydfkyj");
            return (Criteria) this;
        }

        public Criteria andMydfkyjNotBetween(String value1, String value2) {
            addCriterion("MYDFKYJ not between", value1, value2, "mydfkyj");
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