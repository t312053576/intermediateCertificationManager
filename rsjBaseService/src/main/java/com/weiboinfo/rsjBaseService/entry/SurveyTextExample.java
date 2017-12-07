package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class SurveyTextExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SurveyTextExample() {
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

        public Criteria andTIdIsNull() {
            addCriterion("T_ID is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("T_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(String value) {
            addCriterion("T_ID =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(String value) {
            addCriterion("T_ID <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(String value) {
            addCriterion("T_ID >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(String value) {
            addCriterion("T_ID >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(String value) {
            addCriterion("T_ID <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(String value) {
            addCriterion("T_ID <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLike(String value) {
            addCriterion("T_ID like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotLike(String value) {
            addCriterion("T_ID not like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<String> values) {
            addCriterion("T_ID in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<String> values) {
            addCriterion("T_ID not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(String value1, String value2) {
            addCriterion("T_ID between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(String value1, String value2) {
            addCriterion("T_ID not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andQIdIsNull() {
            addCriterion("Q_ID is null");
            return (Criteria) this;
        }

        public Criteria andQIdIsNotNull() {
            addCriterion("Q_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQIdEqualTo(String value) {
            addCriterion("Q_ID =", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotEqualTo(String value) {
            addCriterion("Q_ID <>", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdGreaterThan(String value) {
            addCriterion("Q_ID >", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdGreaterThanOrEqualTo(String value) {
            addCriterion("Q_ID >=", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLessThan(String value) {
            addCriterion("Q_ID <", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLessThanOrEqualTo(String value) {
            addCriterion("Q_ID <=", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLike(String value) {
            addCriterion("Q_ID like", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotLike(String value) {
            addCriterion("Q_ID not like", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdIn(List<String> values) {
            addCriterion("Q_ID in", values, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotIn(List<String> values) {
            addCriterion("Q_ID not in", values, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdBetween(String value1, String value2) {
            addCriterion("Q_ID between", value1, value2, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotBetween(String value1, String value2) {
            addCriterion("Q_ID not between", value1, value2, "qId");
            return (Criteria) this;
        }

        public Criteria andTContentIsNull() {
            addCriterion("T_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andTContentIsNotNull() {
            addCriterion("T_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andTContentEqualTo(String value) {
            addCriterion("T_CONTENT =", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentNotEqualTo(String value) {
            addCriterion("T_CONTENT <>", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentGreaterThan(String value) {
            addCriterion("T_CONTENT >", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentGreaterThanOrEqualTo(String value) {
            addCriterion("T_CONTENT >=", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentLessThan(String value) {
            addCriterion("T_CONTENT <", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentLessThanOrEqualTo(String value) {
            addCriterion("T_CONTENT <=", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentLike(String value) {
            addCriterion("T_CONTENT like", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentNotLike(String value) {
            addCriterion("T_CONTENT not like", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentIn(List<String> values) {
            addCriterion("T_CONTENT in", values, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentNotIn(List<String> values) {
            addCriterion("T_CONTENT not in", values, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentBetween(String value1, String value2) {
            addCriterion("T_CONTENT between", value1, value2, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentNotBetween(String value1, String value2) {
            addCriterion("T_CONTENT not between", value1, value2, "tContent");
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