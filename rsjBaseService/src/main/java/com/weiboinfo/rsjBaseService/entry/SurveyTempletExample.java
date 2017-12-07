package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class SurveyTempletExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SurveyTempletExample() {
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

        public Criteria andTempletIdIsNull() {
            addCriterion("TEMPLET_ID is null");
            return (Criteria) this;
        }

        public Criteria andTempletIdIsNotNull() {
            addCriterion("TEMPLET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTempletIdEqualTo(String value) {
            addCriterion("TEMPLET_ID =", value, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletIdNotEqualTo(String value) {
            addCriterion("TEMPLET_ID <>", value, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletIdGreaterThan(String value) {
            addCriterion("TEMPLET_ID >", value, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletIdGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLET_ID >=", value, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletIdLessThan(String value) {
            addCriterion("TEMPLET_ID <", value, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletIdLessThanOrEqualTo(String value) {
            addCriterion("TEMPLET_ID <=", value, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletIdLike(String value) {
            addCriterion("TEMPLET_ID like", value, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletIdNotLike(String value) {
            addCriterion("TEMPLET_ID not like", value, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletIdIn(List<String> values) {
            addCriterion("TEMPLET_ID in", values, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletIdNotIn(List<String> values) {
            addCriterion("TEMPLET_ID not in", values, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletIdBetween(String value1, String value2) {
            addCriterion("TEMPLET_ID between", value1, value2, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletIdNotBetween(String value1, String value2) {
            addCriterion("TEMPLET_ID not between", value1, value2, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletNameIsNull() {
            addCriterion("TEMPLET_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTempletNameIsNotNull() {
            addCriterion("TEMPLET_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTempletNameEqualTo(String value) {
            addCriterion("TEMPLET_NAME =", value, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletNameNotEqualTo(String value) {
            addCriterion("TEMPLET_NAME <>", value, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletNameGreaterThan(String value) {
            addCriterion("TEMPLET_NAME >", value, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletNameGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLET_NAME >=", value, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletNameLessThan(String value) {
            addCriterion("TEMPLET_NAME <", value, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletNameLessThanOrEqualTo(String value) {
            addCriterion("TEMPLET_NAME <=", value, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletNameLike(String value) {
            addCriterion("TEMPLET_NAME like", value, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletNameNotLike(String value) {
            addCriterion("TEMPLET_NAME not like", value, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletNameIn(List<String> values) {
            addCriterion("TEMPLET_NAME in", values, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletNameNotIn(List<String> values) {
            addCriterion("TEMPLET_NAME not in", values, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletNameBetween(String value1, String value2) {
            addCriterion("TEMPLET_NAME between", value1, value2, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletNameNotBetween(String value1, String value2) {
            addCriterion("TEMPLET_NAME not between", value1, value2, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletDefaultIsNull() {
            addCriterion("TEMPLET_DEFAULT is null");
            return (Criteria) this;
        }

        public Criteria andTempletDefaultIsNotNull() {
            addCriterion("TEMPLET_DEFAULT is not null");
            return (Criteria) this;
        }

        public Criteria andTempletDefaultEqualTo(String value) {
            addCriterion("TEMPLET_DEFAULT =", value, "templetDefault");
            return (Criteria) this;
        }

        public Criteria andTempletDefaultNotEqualTo(String value) {
            addCriterion("TEMPLET_DEFAULT <>", value, "templetDefault");
            return (Criteria) this;
        }

        public Criteria andTempletDefaultGreaterThan(String value) {
            addCriterion("TEMPLET_DEFAULT >", value, "templetDefault");
            return (Criteria) this;
        }

        public Criteria andTempletDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLET_DEFAULT >=", value, "templetDefault");
            return (Criteria) this;
        }

        public Criteria andTempletDefaultLessThan(String value) {
            addCriterion("TEMPLET_DEFAULT <", value, "templetDefault");
            return (Criteria) this;
        }

        public Criteria andTempletDefaultLessThanOrEqualTo(String value) {
            addCriterion("TEMPLET_DEFAULT <=", value, "templetDefault");
            return (Criteria) this;
        }

        public Criteria andTempletDefaultLike(String value) {
            addCriterion("TEMPLET_DEFAULT like", value, "templetDefault");
            return (Criteria) this;
        }

        public Criteria andTempletDefaultNotLike(String value) {
            addCriterion("TEMPLET_DEFAULT not like", value, "templetDefault");
            return (Criteria) this;
        }

        public Criteria andTempletDefaultIn(List<String> values) {
            addCriterion("TEMPLET_DEFAULT in", values, "templetDefault");
            return (Criteria) this;
        }

        public Criteria andTempletDefaultNotIn(List<String> values) {
            addCriterion("TEMPLET_DEFAULT not in", values, "templetDefault");
            return (Criteria) this;
        }

        public Criteria andTempletDefaultBetween(String value1, String value2) {
            addCriterion("TEMPLET_DEFAULT between", value1, value2, "templetDefault");
            return (Criteria) this;
        }

        public Criteria andTempletDefaultNotBetween(String value1, String value2) {
            addCriterion("TEMPLET_DEFAULT not between", value1, value2, "templetDefault");
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