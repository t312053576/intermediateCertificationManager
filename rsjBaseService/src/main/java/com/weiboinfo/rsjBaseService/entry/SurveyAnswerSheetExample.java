package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class SurveyAnswerSheetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SurveyAnswerSheetExample() {
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

        public Criteria andAsIdIsNull() {
            addCriterion("AS_ID is null");
            return (Criteria) this;
        }

        public Criteria andAsIdIsNotNull() {
            addCriterion("AS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAsIdEqualTo(String value) {
            addCriterion("AS_ID =", value, "asId");
            return (Criteria) this;
        }

        public Criteria andAsIdNotEqualTo(String value) {
            addCriterion("AS_ID <>", value, "asId");
            return (Criteria) this;
        }

        public Criteria andAsIdGreaterThan(String value) {
            addCriterion("AS_ID >", value, "asId");
            return (Criteria) this;
        }

        public Criteria andAsIdGreaterThanOrEqualTo(String value) {
            addCriterion("AS_ID >=", value, "asId");
            return (Criteria) this;
        }

        public Criteria andAsIdLessThan(String value) {
            addCriterion("AS_ID <", value, "asId");
            return (Criteria) this;
        }

        public Criteria andAsIdLessThanOrEqualTo(String value) {
            addCriterion("AS_ID <=", value, "asId");
            return (Criteria) this;
        }

        public Criteria andAsIdLike(String value) {
            addCriterion("AS_ID like", value, "asId");
            return (Criteria) this;
        }

        public Criteria andAsIdNotLike(String value) {
            addCriterion("AS_ID not like", value, "asId");
            return (Criteria) this;
        }

        public Criteria andAsIdIn(List<String> values) {
            addCriterion("AS_ID in", values, "asId");
            return (Criteria) this;
        }

        public Criteria andAsIdNotIn(List<String> values) {
            addCriterion("AS_ID not in", values, "asId");
            return (Criteria) this;
        }

        public Criteria andAsIdBetween(String value1, String value2) {
            addCriterion("AS_ID between", value1, value2, "asId");
            return (Criteria) this;
        }

        public Criteria andAsIdNotBetween(String value1, String value2) {
            addCriterion("AS_ID not between", value1, value2, "asId");
            return (Criteria) this;
        }

        public Criteria andSIdIsNull() {
            addCriterion("S_ID is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("S_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(String value) {
            addCriterion("S_ID =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(String value) {
            addCriterion("S_ID <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(String value) {
            addCriterion("S_ID >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(String value) {
            addCriterion("S_ID >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(String value) {
            addCriterion("S_ID <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(String value) {
            addCriterion("S_ID <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLike(String value) {
            addCriterion("S_ID like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotLike(String value) {
            addCriterion("S_ID not like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<String> values) {
            addCriterion("S_ID in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<String> values) {
            addCriterion("S_ID not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(String value1, String value2) {
            addCriterion("S_ID between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(String value1, String value2) {
            addCriterion("S_ID not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andAsResultIsNull() {
            addCriterion("AS_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andAsResultIsNotNull() {
            addCriterion("AS_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andAsResultEqualTo(String value) {
            addCriterion("AS_RESULT =", value, "asResult");
            return (Criteria) this;
        }

        public Criteria andAsResultNotEqualTo(String value) {
            addCriterion("AS_RESULT <>", value, "asResult");
            return (Criteria) this;
        }

        public Criteria andAsResultGreaterThan(String value) {
            addCriterion("AS_RESULT >", value, "asResult");
            return (Criteria) this;
        }

        public Criteria andAsResultGreaterThanOrEqualTo(String value) {
            addCriterion("AS_RESULT >=", value, "asResult");
            return (Criteria) this;
        }

        public Criteria andAsResultLessThan(String value) {
            addCriterion("AS_RESULT <", value, "asResult");
            return (Criteria) this;
        }

        public Criteria andAsResultLessThanOrEqualTo(String value) {
            addCriterion("AS_RESULT <=", value, "asResult");
            return (Criteria) this;
        }

        public Criteria andAsResultLike(String value) {
            addCriterion("AS_RESULT like", value, "asResult");
            return (Criteria) this;
        }

        public Criteria andAsResultNotLike(String value) {
            addCriterion("AS_RESULT not like", value, "asResult");
            return (Criteria) this;
        }

        public Criteria andAsResultIn(List<String> values) {
            addCriterion("AS_RESULT in", values, "asResult");
            return (Criteria) this;
        }

        public Criteria andAsResultNotIn(List<String> values) {
            addCriterion("AS_RESULT not in", values, "asResult");
            return (Criteria) this;
        }

        public Criteria andAsResultBetween(String value1, String value2) {
            addCriterion("AS_RESULT between", value1, value2, "asResult");
            return (Criteria) this;
        }

        public Criteria andAsResultNotBetween(String value1, String value2) {
            addCriterion("AS_RESULT not between", value1, value2, "asResult");
            return (Criteria) this;
        }

        public Criteria andAsPostdateIsNull() {
            addCriterion("AS_POSTDATE is null");
            return (Criteria) this;
        }

        public Criteria andAsPostdateIsNotNull() {
            addCriterion("AS_POSTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAsPostdateEqualTo(String value) {
            addCriterion("AS_POSTDATE =", value, "asPostdate");
            return (Criteria) this;
        }

        public Criteria andAsPostdateNotEqualTo(String value) {
            addCriterion("AS_POSTDATE <>", value, "asPostdate");
            return (Criteria) this;
        }

        public Criteria andAsPostdateGreaterThan(String value) {
            addCriterion("AS_POSTDATE >", value, "asPostdate");
            return (Criteria) this;
        }

        public Criteria andAsPostdateGreaterThanOrEqualTo(String value) {
            addCriterion("AS_POSTDATE >=", value, "asPostdate");
            return (Criteria) this;
        }

        public Criteria andAsPostdateLessThan(String value) {
            addCriterion("AS_POSTDATE <", value, "asPostdate");
            return (Criteria) this;
        }

        public Criteria andAsPostdateLessThanOrEqualTo(String value) {
            addCriterion("AS_POSTDATE <=", value, "asPostdate");
            return (Criteria) this;
        }

        public Criteria andAsPostdateLike(String value) {
            addCriterion("AS_POSTDATE like", value, "asPostdate");
            return (Criteria) this;
        }

        public Criteria andAsPostdateNotLike(String value) {
            addCriterion("AS_POSTDATE not like", value, "asPostdate");
            return (Criteria) this;
        }

        public Criteria andAsPostdateIn(List<String> values) {
            addCriterion("AS_POSTDATE in", values, "asPostdate");
            return (Criteria) this;
        }

        public Criteria andAsPostdateNotIn(List<String> values) {
            addCriterion("AS_POSTDATE not in", values, "asPostdate");
            return (Criteria) this;
        }

        public Criteria andAsPostdateBetween(String value1, String value2) {
            addCriterion("AS_POSTDATE between", value1, value2, "asPostdate");
            return (Criteria) this;
        }

        public Criteria andAsPostdateNotBetween(String value1, String value2) {
            addCriterion("AS_POSTDATE not between", value1, value2, "asPostdate");
            return (Criteria) this;
        }

        public Criteria andAsUseripIsNull() {
            addCriterion("AS_USERIP is null");
            return (Criteria) this;
        }

        public Criteria andAsUseripIsNotNull() {
            addCriterion("AS_USERIP is not null");
            return (Criteria) this;
        }

        public Criteria andAsUseripEqualTo(String value) {
            addCriterion("AS_USERIP =", value, "asUserip");
            return (Criteria) this;
        }

        public Criteria andAsUseripNotEqualTo(String value) {
            addCriterion("AS_USERIP <>", value, "asUserip");
            return (Criteria) this;
        }

        public Criteria andAsUseripGreaterThan(String value) {
            addCriterion("AS_USERIP >", value, "asUserip");
            return (Criteria) this;
        }

        public Criteria andAsUseripGreaterThanOrEqualTo(String value) {
            addCriterion("AS_USERIP >=", value, "asUserip");
            return (Criteria) this;
        }

        public Criteria andAsUseripLessThan(String value) {
            addCriterion("AS_USERIP <", value, "asUserip");
            return (Criteria) this;
        }

        public Criteria andAsUseripLessThanOrEqualTo(String value) {
            addCriterion("AS_USERIP <=", value, "asUserip");
            return (Criteria) this;
        }

        public Criteria andAsUseripLike(String value) {
            addCriterion("AS_USERIP like", value, "asUserip");
            return (Criteria) this;
        }

        public Criteria andAsUseripNotLike(String value) {
            addCriterion("AS_USERIP not like", value, "asUserip");
            return (Criteria) this;
        }

        public Criteria andAsUseripIn(List<String> values) {
            addCriterion("AS_USERIP in", values, "asUserip");
            return (Criteria) this;
        }

        public Criteria andAsUseripNotIn(List<String> values) {
            addCriterion("AS_USERIP not in", values, "asUserip");
            return (Criteria) this;
        }

        public Criteria andAsUseripBetween(String value1, String value2) {
            addCriterion("AS_USERIP between", value1, value2, "asUserip");
            return (Criteria) this;
        }

        public Criteria andAsUseripNotBetween(String value1, String value2) {
            addCriterion("AS_USERIP not between", value1, value2, "asUserip");
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