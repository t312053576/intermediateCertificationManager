package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class SurveyLinkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SurveyLinkExample() {
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

        public Criteria andLIdIsNull() {
            addCriterion("L_ID is null");
            return (Criteria) this;
        }

        public Criteria andLIdIsNotNull() {
            addCriterion("L_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLIdEqualTo(String value) {
            addCriterion("L_ID =", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotEqualTo(String value) {
            addCriterion("L_ID <>", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThan(String value) {
            addCriterion("L_ID >", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThanOrEqualTo(String value) {
            addCriterion("L_ID >=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThan(String value) {
            addCriterion("L_ID <", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThanOrEqualTo(String value) {
            addCriterion("L_ID <=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLike(String value) {
            addCriterion("L_ID like", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotLike(String value) {
            addCriterion("L_ID not like", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdIn(List<String> values) {
            addCriterion("L_ID in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotIn(List<String> values) {
            addCriterion("L_ID not in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdBetween(String value1, String value2) {
            addCriterion("L_ID between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotBetween(String value1, String value2) {
            addCriterion("L_ID not between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLUrlIsNull() {
            addCriterion("L_URL is null");
            return (Criteria) this;
        }

        public Criteria andLUrlIsNotNull() {
            addCriterion("L_URL is not null");
            return (Criteria) this;
        }

        public Criteria andLUrlEqualTo(String value) {
            addCriterion("L_URL =", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlNotEqualTo(String value) {
            addCriterion("L_URL <>", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlGreaterThan(String value) {
            addCriterion("L_URL >", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlGreaterThanOrEqualTo(String value) {
            addCriterion("L_URL >=", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlLessThan(String value) {
            addCriterion("L_URL <", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlLessThanOrEqualTo(String value) {
            addCriterion("L_URL <=", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlLike(String value) {
            addCriterion("L_URL like", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlNotLike(String value) {
            addCriterion("L_URL not like", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlIn(List<String> values) {
            addCriterion("L_URL in", values, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlNotIn(List<String> values) {
            addCriterion("L_URL not in", values, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlBetween(String value1, String value2) {
            addCriterion("L_URL between", value1, value2, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlNotBetween(String value1, String value2) {
            addCriterion("L_URL not between", value1, value2, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLNameIsNull() {
            addCriterion("L_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLNameIsNotNull() {
            addCriterion("L_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLNameEqualTo(String value) {
            addCriterion("L_NAME =", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotEqualTo(String value) {
            addCriterion("L_NAME <>", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameGreaterThan(String value) {
            addCriterion("L_NAME >", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameGreaterThanOrEqualTo(String value) {
            addCriterion("L_NAME >=", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLessThan(String value) {
            addCriterion("L_NAME <", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLessThanOrEqualTo(String value) {
            addCriterion("L_NAME <=", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLike(String value) {
            addCriterion("L_NAME like", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotLike(String value) {
            addCriterion("L_NAME not like", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameIn(List<String> values) {
            addCriterion("L_NAME in", values, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotIn(List<String> values) {
            addCriterion("L_NAME not in", values, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameBetween(String value1, String value2) {
            addCriterion("L_NAME between", value1, value2, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotBetween(String value1, String value2) {
            addCriterion("L_NAME not between", value1, value2, "lName");
            return (Criteria) this;
        }

        public Criteria andLImgIsNull() {
            addCriterion("L_IMG is null");
            return (Criteria) this;
        }

        public Criteria andLImgIsNotNull() {
            addCriterion("L_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andLImgEqualTo(String value) {
            addCriterion("L_IMG =", value, "lImg");
            return (Criteria) this;
        }

        public Criteria andLImgNotEqualTo(String value) {
            addCriterion("L_IMG <>", value, "lImg");
            return (Criteria) this;
        }

        public Criteria andLImgGreaterThan(String value) {
            addCriterion("L_IMG >", value, "lImg");
            return (Criteria) this;
        }

        public Criteria andLImgGreaterThanOrEqualTo(String value) {
            addCriterion("L_IMG >=", value, "lImg");
            return (Criteria) this;
        }

        public Criteria andLImgLessThan(String value) {
            addCriterion("L_IMG <", value, "lImg");
            return (Criteria) this;
        }

        public Criteria andLImgLessThanOrEqualTo(String value) {
            addCriterion("L_IMG <=", value, "lImg");
            return (Criteria) this;
        }

        public Criteria andLImgLike(String value) {
            addCriterion("L_IMG like", value, "lImg");
            return (Criteria) this;
        }

        public Criteria andLImgNotLike(String value) {
            addCriterion("L_IMG not like", value, "lImg");
            return (Criteria) this;
        }

        public Criteria andLImgIn(List<String> values) {
            addCriterion("L_IMG in", values, "lImg");
            return (Criteria) this;
        }

        public Criteria andLImgNotIn(List<String> values) {
            addCriterion("L_IMG not in", values, "lImg");
            return (Criteria) this;
        }

        public Criteria andLImgBetween(String value1, String value2) {
            addCriterion("L_IMG between", value1, value2, "lImg");
            return (Criteria) this;
        }

        public Criteria andLImgNotBetween(String value1, String value2) {
            addCriterion("L_IMG not between", value1, value2, "lImg");
            return (Criteria) this;
        }

        public Criteria andLInfoIsNull() {
            addCriterion("L_INFO is null");
            return (Criteria) this;
        }

        public Criteria andLInfoIsNotNull() {
            addCriterion("L_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andLInfoEqualTo(String value) {
            addCriterion("L_INFO =", value, "lInfo");
            return (Criteria) this;
        }

        public Criteria andLInfoNotEqualTo(String value) {
            addCriterion("L_INFO <>", value, "lInfo");
            return (Criteria) this;
        }

        public Criteria andLInfoGreaterThan(String value) {
            addCriterion("L_INFO >", value, "lInfo");
            return (Criteria) this;
        }

        public Criteria andLInfoGreaterThanOrEqualTo(String value) {
            addCriterion("L_INFO >=", value, "lInfo");
            return (Criteria) this;
        }

        public Criteria andLInfoLessThan(String value) {
            addCriterion("L_INFO <", value, "lInfo");
            return (Criteria) this;
        }

        public Criteria andLInfoLessThanOrEqualTo(String value) {
            addCriterion("L_INFO <=", value, "lInfo");
            return (Criteria) this;
        }

        public Criteria andLInfoLike(String value) {
            addCriterion("L_INFO like", value, "lInfo");
            return (Criteria) this;
        }

        public Criteria andLInfoNotLike(String value) {
            addCriterion("L_INFO not like", value, "lInfo");
            return (Criteria) this;
        }

        public Criteria andLInfoIn(List<String> values) {
            addCriterion("L_INFO in", values, "lInfo");
            return (Criteria) this;
        }

        public Criteria andLInfoNotIn(List<String> values) {
            addCriterion("L_INFO not in", values, "lInfo");
            return (Criteria) this;
        }

        public Criteria andLInfoBetween(String value1, String value2) {
            addCriterion("L_INFO between", value1, value2, "lInfo");
            return (Criteria) this;
        }

        public Criteria andLInfoNotBetween(String value1, String value2) {
            addCriterion("L_INFO not between", value1, value2, "lInfo");
            return (Criteria) this;
        }

        public Criteria andLIslockIsNull() {
            addCriterion("L_ISLOCK is null");
            return (Criteria) this;
        }

        public Criteria andLIslockIsNotNull() {
            addCriterion("L_ISLOCK is not null");
            return (Criteria) this;
        }

        public Criteria andLIslockEqualTo(String value) {
            addCriterion("L_ISLOCK =", value, "lIslock");
            return (Criteria) this;
        }

        public Criteria andLIslockNotEqualTo(String value) {
            addCriterion("L_ISLOCK <>", value, "lIslock");
            return (Criteria) this;
        }

        public Criteria andLIslockGreaterThan(String value) {
            addCriterion("L_ISLOCK >", value, "lIslock");
            return (Criteria) this;
        }

        public Criteria andLIslockGreaterThanOrEqualTo(String value) {
            addCriterion("L_ISLOCK >=", value, "lIslock");
            return (Criteria) this;
        }

        public Criteria andLIslockLessThan(String value) {
            addCriterion("L_ISLOCK <", value, "lIslock");
            return (Criteria) this;
        }

        public Criteria andLIslockLessThanOrEqualTo(String value) {
            addCriterion("L_ISLOCK <=", value, "lIslock");
            return (Criteria) this;
        }

        public Criteria andLIslockLike(String value) {
            addCriterion("L_ISLOCK like", value, "lIslock");
            return (Criteria) this;
        }

        public Criteria andLIslockNotLike(String value) {
            addCriterion("L_ISLOCK not like", value, "lIslock");
            return (Criteria) this;
        }

        public Criteria andLIslockIn(List<String> values) {
            addCriterion("L_ISLOCK in", values, "lIslock");
            return (Criteria) this;
        }

        public Criteria andLIslockNotIn(List<String> values) {
            addCriterion("L_ISLOCK not in", values, "lIslock");
            return (Criteria) this;
        }

        public Criteria andLIslockBetween(String value1, String value2) {
            addCriterion("L_ISLOCK between", value1, value2, "lIslock");
            return (Criteria) this;
        }

        public Criteria andLIslockNotBetween(String value1, String value2) {
            addCriterion("L_ISLOCK not between", value1, value2, "lIslock");
            return (Criteria) this;
        }

        public Criteria andLAddtimeIsNull() {
            addCriterion("L_ADDTIME is null");
            return (Criteria) this;
        }

        public Criteria andLAddtimeIsNotNull() {
            addCriterion("L_ADDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLAddtimeEqualTo(String value) {
            addCriterion("L_ADDTIME =", value, "lAddtime");
            return (Criteria) this;
        }

        public Criteria andLAddtimeNotEqualTo(String value) {
            addCriterion("L_ADDTIME <>", value, "lAddtime");
            return (Criteria) this;
        }

        public Criteria andLAddtimeGreaterThan(String value) {
            addCriterion("L_ADDTIME >", value, "lAddtime");
            return (Criteria) this;
        }

        public Criteria andLAddtimeGreaterThanOrEqualTo(String value) {
            addCriterion("L_ADDTIME >=", value, "lAddtime");
            return (Criteria) this;
        }

        public Criteria andLAddtimeLessThan(String value) {
            addCriterion("L_ADDTIME <", value, "lAddtime");
            return (Criteria) this;
        }

        public Criteria andLAddtimeLessThanOrEqualTo(String value) {
            addCriterion("L_ADDTIME <=", value, "lAddtime");
            return (Criteria) this;
        }

        public Criteria andLAddtimeLike(String value) {
            addCriterion("L_ADDTIME like", value, "lAddtime");
            return (Criteria) this;
        }

        public Criteria andLAddtimeNotLike(String value) {
            addCriterion("L_ADDTIME not like", value, "lAddtime");
            return (Criteria) this;
        }

        public Criteria andLAddtimeIn(List<String> values) {
            addCriterion("L_ADDTIME in", values, "lAddtime");
            return (Criteria) this;
        }

        public Criteria andLAddtimeNotIn(List<String> values) {
            addCriterion("L_ADDTIME not in", values, "lAddtime");
            return (Criteria) this;
        }

        public Criteria andLAddtimeBetween(String value1, String value2) {
            addCriterion("L_ADDTIME between", value1, value2, "lAddtime");
            return (Criteria) this;
        }

        public Criteria andLAddtimeNotBetween(String value1, String value2) {
            addCriterion("L_ADDTIME not between", value1, value2, "lAddtime");
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