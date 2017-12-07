package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class RobotKeywordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RobotKeywordExample() {
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

        public Criteria andInfoidIsNull() {
            addCriterion("INFOID is null");
            return (Criteria) this;
        }

        public Criteria andInfoidIsNotNull() {
            addCriterion("INFOID is not null");
            return (Criteria) this;
        }

        public Criteria andInfoidEqualTo(String value) {
            addCriterion("INFOID =", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotEqualTo(String value) {
            addCriterion("INFOID <>", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidGreaterThan(String value) {
            addCriterion("INFOID >", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidGreaterThanOrEqualTo(String value) {
            addCriterion("INFOID >=", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLessThan(String value) {
            addCriterion("INFOID <", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLessThanOrEqualTo(String value) {
            addCriterion("INFOID <=", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLike(String value) {
            addCriterion("INFOID like", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotLike(String value) {
            addCriterion("INFOID not like", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidIn(List<String> values) {
            addCriterion("INFOID in", values, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotIn(List<String> values) {
            addCriterion("INFOID not in", values, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidBetween(String value1, String value2) {
            addCriterion("INFOID between", value1, value2, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotBetween(String value1, String value2) {
            addCriterion("INFOID not between", value1, value2, "infoid");
            return (Criteria) this;
        }

        public Criteria andKeywordinfoIsNull() {
            addCriterion("KEYWORDINFO is null");
            return (Criteria) this;
        }

        public Criteria andKeywordinfoIsNotNull() {
            addCriterion("KEYWORDINFO is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordinfoEqualTo(String value) {
            addCriterion("KEYWORDINFO =", value, "keywordinfo");
            return (Criteria) this;
        }

        public Criteria andKeywordinfoNotEqualTo(String value) {
            addCriterion("KEYWORDINFO <>", value, "keywordinfo");
            return (Criteria) this;
        }

        public Criteria andKeywordinfoGreaterThan(String value) {
            addCriterion("KEYWORDINFO >", value, "keywordinfo");
            return (Criteria) this;
        }

        public Criteria andKeywordinfoGreaterThanOrEqualTo(String value) {
            addCriterion("KEYWORDINFO >=", value, "keywordinfo");
            return (Criteria) this;
        }

        public Criteria andKeywordinfoLessThan(String value) {
            addCriterion("KEYWORDINFO <", value, "keywordinfo");
            return (Criteria) this;
        }

        public Criteria andKeywordinfoLessThanOrEqualTo(String value) {
            addCriterion("KEYWORDINFO <=", value, "keywordinfo");
            return (Criteria) this;
        }

        public Criteria andKeywordinfoLike(String value) {
            addCriterion("KEYWORDINFO like", value, "keywordinfo");
            return (Criteria) this;
        }

        public Criteria andKeywordinfoNotLike(String value) {
            addCriterion("KEYWORDINFO not like", value, "keywordinfo");
            return (Criteria) this;
        }

        public Criteria andKeywordinfoIn(List<String> values) {
            addCriterion("KEYWORDINFO in", values, "keywordinfo");
            return (Criteria) this;
        }

        public Criteria andKeywordinfoNotIn(List<String> values) {
            addCriterion("KEYWORDINFO not in", values, "keywordinfo");
            return (Criteria) this;
        }

        public Criteria andKeywordinfoBetween(String value1, String value2) {
            addCriterion("KEYWORDINFO between", value1, value2, "keywordinfo");
            return (Criteria) this;
        }

        public Criteria andKeywordinfoNotBetween(String value1, String value2) {
            addCriterion("KEYWORDINFO not between", value1, value2, "keywordinfo");
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