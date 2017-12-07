package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class IpdatdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IpdatdExample() {
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

        public Criteria andBeginidIsNull() {
            addCriterion("BEGINID is null");
            return (Criteria) this;
        }

        public Criteria andBeginidIsNotNull() {
            addCriterion("BEGINID is not null");
            return (Criteria) this;
        }

        public Criteria andBeginidEqualTo(String value) {
            addCriterion("BEGINID =", value, "beginid");
            return (Criteria) this;
        }

        public Criteria andBeginidNotEqualTo(String value) {
            addCriterion("BEGINID <>", value, "beginid");
            return (Criteria) this;
        }

        public Criteria andBeginidGreaterThan(String value) {
            addCriterion("BEGINID >", value, "beginid");
            return (Criteria) this;
        }

        public Criteria andBeginidGreaterThanOrEqualTo(String value) {
            addCriterion("BEGINID >=", value, "beginid");
            return (Criteria) this;
        }

        public Criteria andBeginidLessThan(String value) {
            addCriterion("BEGINID <", value, "beginid");
            return (Criteria) this;
        }

        public Criteria andBeginidLessThanOrEqualTo(String value) {
            addCriterion("BEGINID <=", value, "beginid");
            return (Criteria) this;
        }

        public Criteria andBeginidLike(String value) {
            addCriterion("BEGINID like", value, "beginid");
            return (Criteria) this;
        }

        public Criteria andBeginidNotLike(String value) {
            addCriterion("BEGINID not like", value, "beginid");
            return (Criteria) this;
        }

        public Criteria andBeginidIn(List<String> values) {
            addCriterion("BEGINID in", values, "beginid");
            return (Criteria) this;
        }

        public Criteria andBeginidNotIn(List<String> values) {
            addCriterion("BEGINID not in", values, "beginid");
            return (Criteria) this;
        }

        public Criteria andBeginidBetween(String value1, String value2) {
            addCriterion("BEGINID between", value1, value2, "beginid");
            return (Criteria) this;
        }

        public Criteria andBeginidNotBetween(String value1, String value2) {
            addCriterion("BEGINID not between", value1, value2, "beginid");
            return (Criteria) this;
        }

        public Criteria andEndidIsNull() {
            addCriterion("ENDID is null");
            return (Criteria) this;
        }

        public Criteria andEndidIsNotNull() {
            addCriterion("ENDID is not null");
            return (Criteria) this;
        }

        public Criteria andEndidEqualTo(String value) {
            addCriterion("ENDID =", value, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidNotEqualTo(String value) {
            addCriterion("ENDID <>", value, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidGreaterThan(String value) {
            addCriterion("ENDID >", value, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidGreaterThanOrEqualTo(String value) {
            addCriterion("ENDID >=", value, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidLessThan(String value) {
            addCriterion("ENDID <", value, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidLessThanOrEqualTo(String value) {
            addCriterion("ENDID <=", value, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidLike(String value) {
            addCriterion("ENDID like", value, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidNotLike(String value) {
            addCriterion("ENDID not like", value, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidIn(List<String> values) {
            addCriterion("ENDID in", values, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidNotIn(List<String> values) {
            addCriterion("ENDID not in", values, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidBetween(String value1, String value2) {
            addCriterion("ENDID between", value1, value2, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidNotBetween(String value1, String value2) {
            addCriterion("ENDID not between", value1, value2, "endid");
            return (Criteria) this;
        }

        public Criteria andValuekIsNull() {
            addCriterion("VALUEK is null");
            return (Criteria) this;
        }

        public Criteria andValuekIsNotNull() {
            addCriterion("VALUEK is not null");
            return (Criteria) this;
        }

        public Criteria andValuekEqualTo(String value) {
            addCriterion("VALUEK =", value, "valuek");
            return (Criteria) this;
        }

        public Criteria andValuekNotEqualTo(String value) {
            addCriterion("VALUEK <>", value, "valuek");
            return (Criteria) this;
        }

        public Criteria andValuekGreaterThan(String value) {
            addCriterion("VALUEK >", value, "valuek");
            return (Criteria) this;
        }

        public Criteria andValuekGreaterThanOrEqualTo(String value) {
            addCriterion("VALUEK >=", value, "valuek");
            return (Criteria) this;
        }

        public Criteria andValuekLessThan(String value) {
            addCriterion("VALUEK <", value, "valuek");
            return (Criteria) this;
        }

        public Criteria andValuekLessThanOrEqualTo(String value) {
            addCriterion("VALUEK <=", value, "valuek");
            return (Criteria) this;
        }

        public Criteria andValuekLike(String value) {
            addCriterion("VALUEK like", value, "valuek");
            return (Criteria) this;
        }

        public Criteria andValuekNotLike(String value) {
            addCriterion("VALUEK not like", value, "valuek");
            return (Criteria) this;
        }

        public Criteria andValuekIn(List<String> values) {
            addCriterion("VALUEK in", values, "valuek");
            return (Criteria) this;
        }

        public Criteria andValuekNotIn(List<String> values) {
            addCriterion("VALUEK not in", values, "valuek");
            return (Criteria) this;
        }

        public Criteria andValuekBetween(String value1, String value2) {
            addCriterion("VALUEK between", value1, value2, "valuek");
            return (Criteria) this;
        }

        public Criteria andValuekNotBetween(String value1, String value2) {
            addCriterion("VALUEK not between", value1, value2, "valuek");
            return (Criteria) this;
        }

        public Criteria andAttachmentIsNull() {
            addCriterion("ATTACHMENT is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIsNotNull() {
            addCriterion("ATTACHMENT is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentEqualTo(String value) {
            addCriterion("ATTACHMENT =", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotEqualTo(String value) {
            addCriterion("ATTACHMENT <>", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentGreaterThan(String value) {
            addCriterion("ATTACHMENT >", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACHMENT >=", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLessThan(String value) {
            addCriterion("ATTACHMENT <", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLessThanOrEqualTo(String value) {
            addCriterion("ATTACHMENT <=", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLike(String value) {
            addCriterion("ATTACHMENT like", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotLike(String value) {
            addCriterion("ATTACHMENT not like", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentIn(List<String> values) {
            addCriterion("ATTACHMENT in", values, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotIn(List<String> values) {
            addCriterion("ATTACHMENT not in", values, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentBetween(String value1, String value2) {
            addCriterion("ATTACHMENT between", value1, value2, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotBetween(String value1, String value2) {
            addCriterion("ATTACHMENT not between", value1, value2, "attachment");
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