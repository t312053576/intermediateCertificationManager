package com.weiboinfo.rsjBaseService.entry;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentsExample() {
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

        public Criteria andWmcdocuidIsNull() {
            addCriterion("WMCDOCUID is null");
            return (Criteria) this;
        }

        public Criteria andWmcdocuidIsNotNull() {
            addCriterion("WMCDOCUID is not null");
            return (Criteria) this;
        }

        public Criteria andWmcdocuidEqualTo(BigDecimal value) {
            addCriterion("WMCDOCUID =", value, "wmcdocuid");
            return (Criteria) this;
        }

        public Criteria andWmcdocuidNotEqualTo(BigDecimal value) {
            addCriterion("WMCDOCUID <>", value, "wmcdocuid");
            return (Criteria) this;
        }

        public Criteria andWmcdocuidGreaterThan(BigDecimal value) {
            addCriterion("WMCDOCUID >", value, "wmcdocuid");
            return (Criteria) this;
        }

        public Criteria andWmcdocuidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WMCDOCUID >=", value, "wmcdocuid");
            return (Criteria) this;
        }

        public Criteria andWmcdocuidLessThan(BigDecimal value) {
            addCriterion("WMCDOCUID <", value, "wmcdocuid");
            return (Criteria) this;
        }

        public Criteria andWmcdocuidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WMCDOCUID <=", value, "wmcdocuid");
            return (Criteria) this;
        }

        public Criteria andWmcdocuidIn(List<BigDecimal> values) {
            addCriterion("WMCDOCUID in", values, "wmcdocuid");
            return (Criteria) this;
        }

        public Criteria andWmcdocuidNotIn(List<BigDecimal> values) {
            addCriterion("WMCDOCUID not in", values, "wmcdocuid");
            return (Criteria) this;
        }

        public Criteria andWmcdocuidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WMCDOCUID between", value1, value2, "wmcdocuid");
            return (Criteria) this;
        }

        public Criteria andWmcdocuidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WMCDOCUID not between", value1, value2, "wmcdocuid");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNull() {
            addCriterion("CREATORID is null");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNotNull() {
            addCriterion("CREATORID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatoridEqualTo(String value) {
            addCriterion("CREATORID =", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotEqualTo(String value) {
            addCriterion("CREATORID <>", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThan(String value) {
            addCriterion("CREATORID >", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThanOrEqualTo(String value) {
            addCriterion("CREATORID >=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThan(String value) {
            addCriterion("CREATORID <", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThanOrEqualTo(String value) {
            addCriterion("CREATORID <=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLike(String value) {
            addCriterion("CREATORID like", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotLike(String value) {
            addCriterion("CREATORID not like", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridIn(List<String> values) {
            addCriterion("CREATORID in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotIn(List<String> values) {
            addCriterion("CREATORID not in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridBetween(String value1, String value2) {
            addCriterion("CREATORID between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotBetween(String value1, String value2) {
            addCriterion("CREATORID not between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatornameIsNull() {
            addCriterion("CREATORNAME is null");
            return (Criteria) this;
        }

        public Criteria andCreatornameIsNotNull() {
            addCriterion("CREATORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatornameEqualTo(String value) {
            addCriterion("CREATORNAME =", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameNotEqualTo(String value) {
            addCriterion("CREATORNAME <>", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameGreaterThan(String value) {
            addCriterion("CREATORNAME >", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATORNAME >=", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameLessThan(String value) {
            addCriterion("CREATORNAME <", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameLessThanOrEqualTo(String value) {
            addCriterion("CREATORNAME <=", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameLike(String value) {
            addCriterion("CREATORNAME like", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameNotLike(String value) {
            addCriterion("CREATORNAME not like", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameIn(List<String> values) {
            addCriterion("CREATORNAME in", values, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameNotIn(List<String> values) {
            addCriterion("CREATORNAME not in", values, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameBetween(String value1, String value2) {
            addCriterion("CREATORNAME between", value1, value2, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameNotBetween(String value1, String value2) {
            addCriterion("CREATORNAME not between", value1, value2, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNull() {
            addCriterion("CREATTIME is null");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNotNull() {
            addCriterion("CREATTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreattimeEqualTo(Date value) {
            addCriterion("CREATTIME =", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotEqualTo(Date value) {
            addCriterion("CREATTIME <>", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThan(Date value) {
            addCriterion("CREATTIME >", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATTIME >=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThan(Date value) {
            addCriterion("CREATTIME <", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATTIME <=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeIn(List<Date> values) {
            addCriterion("CREATTIME in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotIn(List<Date> values) {
            addCriterion("CREATTIME not in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeBetween(Date value1, Date value2) {
            addCriterion("CREATTIME between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATTIME not between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("COMMENTS =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("COMMENTS <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("COMMENTS like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("COMMENTS not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("COMMENTS in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andVerifyeridIsNull() {
            addCriterion("VERIFYERID is null");
            return (Criteria) this;
        }

        public Criteria andVerifyeridIsNotNull() {
            addCriterion("VERIFYERID is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyeridEqualTo(String value) {
            addCriterion("VERIFYERID =", value, "verifyerid");
            return (Criteria) this;
        }

        public Criteria andVerifyeridNotEqualTo(String value) {
            addCriterion("VERIFYERID <>", value, "verifyerid");
            return (Criteria) this;
        }

        public Criteria andVerifyeridGreaterThan(String value) {
            addCriterion("VERIFYERID >", value, "verifyerid");
            return (Criteria) this;
        }

        public Criteria andVerifyeridGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFYERID >=", value, "verifyerid");
            return (Criteria) this;
        }

        public Criteria andVerifyeridLessThan(String value) {
            addCriterion("VERIFYERID <", value, "verifyerid");
            return (Criteria) this;
        }

        public Criteria andVerifyeridLessThanOrEqualTo(String value) {
            addCriterion("VERIFYERID <=", value, "verifyerid");
            return (Criteria) this;
        }

        public Criteria andVerifyeridLike(String value) {
            addCriterion("VERIFYERID like", value, "verifyerid");
            return (Criteria) this;
        }

        public Criteria andVerifyeridNotLike(String value) {
            addCriterion("VERIFYERID not like", value, "verifyerid");
            return (Criteria) this;
        }

        public Criteria andVerifyeridIn(List<String> values) {
            addCriterion("VERIFYERID in", values, "verifyerid");
            return (Criteria) this;
        }

        public Criteria andVerifyeridNotIn(List<String> values) {
            addCriterion("VERIFYERID not in", values, "verifyerid");
            return (Criteria) this;
        }

        public Criteria andVerifyeridBetween(String value1, String value2) {
            addCriterion("VERIFYERID between", value1, value2, "verifyerid");
            return (Criteria) this;
        }

        public Criteria andVerifyeridNotBetween(String value1, String value2) {
            addCriterion("VERIFYERID not between", value1, value2, "verifyerid");
            return (Criteria) this;
        }

        public Criteria andVerifynameIsNull() {
            addCriterion("VERIFYNAME is null");
            return (Criteria) this;
        }

        public Criteria andVerifynameIsNotNull() {
            addCriterion("VERIFYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andVerifynameEqualTo(String value) {
            addCriterion("VERIFYNAME =", value, "verifyname");
            return (Criteria) this;
        }

        public Criteria andVerifynameNotEqualTo(String value) {
            addCriterion("VERIFYNAME <>", value, "verifyname");
            return (Criteria) this;
        }

        public Criteria andVerifynameGreaterThan(String value) {
            addCriterion("VERIFYNAME >", value, "verifyname");
            return (Criteria) this;
        }

        public Criteria andVerifynameGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFYNAME >=", value, "verifyname");
            return (Criteria) this;
        }

        public Criteria andVerifynameLessThan(String value) {
            addCriterion("VERIFYNAME <", value, "verifyname");
            return (Criteria) this;
        }

        public Criteria andVerifynameLessThanOrEqualTo(String value) {
            addCriterion("VERIFYNAME <=", value, "verifyname");
            return (Criteria) this;
        }

        public Criteria andVerifynameLike(String value) {
            addCriterion("VERIFYNAME like", value, "verifyname");
            return (Criteria) this;
        }

        public Criteria andVerifynameNotLike(String value) {
            addCriterion("VERIFYNAME not like", value, "verifyname");
            return (Criteria) this;
        }

        public Criteria andVerifynameIn(List<String> values) {
            addCriterion("VERIFYNAME in", values, "verifyname");
            return (Criteria) this;
        }

        public Criteria andVerifynameNotIn(List<String> values) {
            addCriterion("VERIFYNAME not in", values, "verifyname");
            return (Criteria) this;
        }

        public Criteria andVerifynameBetween(String value1, String value2) {
            addCriterion("VERIFYNAME between", value1, value2, "verifyname");
            return (Criteria) this;
        }

        public Criteria andVerifynameNotBetween(String value1, String value2) {
            addCriterion("VERIFYNAME not between", value1, value2, "verifyname");
            return (Criteria) this;
        }

        public Criteria andVerifytimeIsNull() {
            addCriterion("VERIFYTIME is null");
            return (Criteria) this;
        }

        public Criteria andVerifytimeIsNotNull() {
            addCriterion("VERIFYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andVerifytimeEqualTo(Date value) {
            addCriterion("VERIFYTIME =", value, "verifytime");
            return (Criteria) this;
        }

        public Criteria andVerifytimeNotEqualTo(Date value) {
            addCriterion("VERIFYTIME <>", value, "verifytime");
            return (Criteria) this;
        }

        public Criteria andVerifytimeGreaterThan(Date value) {
            addCriterion("VERIFYTIME >", value, "verifytime");
            return (Criteria) this;
        }

        public Criteria andVerifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("VERIFYTIME >=", value, "verifytime");
            return (Criteria) this;
        }

        public Criteria andVerifytimeLessThan(Date value) {
            addCriterion("VERIFYTIME <", value, "verifytime");
            return (Criteria) this;
        }

        public Criteria andVerifytimeLessThanOrEqualTo(Date value) {
            addCriterion("VERIFYTIME <=", value, "verifytime");
            return (Criteria) this;
        }

        public Criteria andVerifytimeIn(List<Date> values) {
            addCriterion("VERIFYTIME in", values, "verifytime");
            return (Criteria) this;
        }

        public Criteria andVerifytimeNotIn(List<Date> values) {
            addCriterion("VERIFYTIME not in", values, "verifytime");
            return (Criteria) this;
        }

        public Criteria andVerifytimeBetween(Date value1, Date value2) {
            addCriterion("VERIFYTIME between", value1, value2, "verifytime");
            return (Criteria) this;
        }

        public Criteria andVerifytimeNotBetween(Date value1, Date value2) {
            addCriterion("VERIFYTIME not between", value1, value2, "verifytime");
            return (Criteria) this;
        }

        public Criteria andReplyIsNull() {
            addCriterion("REPLY is null");
            return (Criteria) this;
        }

        public Criteria andReplyIsNotNull() {
            addCriterion("REPLY is not null");
            return (Criteria) this;
        }

        public Criteria andReplyEqualTo(String value) {
            addCriterion("REPLY =", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotEqualTo(String value) {
            addCriterion("REPLY <>", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyGreaterThan(String value) {
            addCriterion("REPLY >", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyGreaterThanOrEqualTo(String value) {
            addCriterion("REPLY >=", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLessThan(String value) {
            addCriterion("REPLY <", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLessThanOrEqualTo(String value) {
            addCriterion("REPLY <=", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLike(String value) {
            addCriterion("REPLY like", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotLike(String value) {
            addCriterion("REPLY not like", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyIn(List<String> values) {
            addCriterion("REPLY in", values, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotIn(List<String> values) {
            addCriterion("REPLY not in", values, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyBetween(String value1, String value2) {
            addCriterion("REPLY between", value1, value2, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotBetween(String value1, String value2) {
            addCriterion("REPLY not between", value1, value2, "reply");
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