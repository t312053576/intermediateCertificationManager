package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class FrmSecurityConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrmSecurityConfigExample() {
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

        public Criteria andFrmsecurityconfigidIsNull() {
            addCriterion("FRMSECURITYCONFIGID is null");
            return (Criteria) this;
        }

        public Criteria andFrmsecurityconfigidIsNotNull() {
            addCriterion("FRMSECURITYCONFIGID is not null");
            return (Criteria) this;
        }

        public Criteria andFrmsecurityconfigidEqualTo(String value) {
            addCriterion("FRMSECURITYCONFIGID =", value, "frmsecurityconfigid");
            return (Criteria) this;
        }

        public Criteria andFrmsecurityconfigidNotEqualTo(String value) {
            addCriterion("FRMSECURITYCONFIGID <>", value, "frmsecurityconfigid");
            return (Criteria) this;
        }

        public Criteria andFrmsecurityconfigidGreaterThan(String value) {
            addCriterion("FRMSECURITYCONFIGID >", value, "frmsecurityconfigid");
            return (Criteria) this;
        }

        public Criteria andFrmsecurityconfigidGreaterThanOrEqualTo(String value) {
            addCriterion("FRMSECURITYCONFIGID >=", value, "frmsecurityconfigid");
            return (Criteria) this;
        }

        public Criteria andFrmsecurityconfigidLessThan(String value) {
            addCriterion("FRMSECURITYCONFIGID <", value, "frmsecurityconfigid");
            return (Criteria) this;
        }

        public Criteria andFrmsecurityconfigidLessThanOrEqualTo(String value) {
            addCriterion("FRMSECURITYCONFIGID <=", value, "frmsecurityconfigid");
            return (Criteria) this;
        }

        public Criteria andFrmsecurityconfigidLike(String value) {
            addCriterion("FRMSECURITYCONFIGID like", value, "frmsecurityconfigid");
            return (Criteria) this;
        }

        public Criteria andFrmsecurityconfigidNotLike(String value) {
            addCriterion("FRMSECURITYCONFIGID not like", value, "frmsecurityconfigid");
            return (Criteria) this;
        }

        public Criteria andFrmsecurityconfigidIn(List<String> values) {
            addCriterion("FRMSECURITYCONFIGID in", values, "frmsecurityconfigid");
            return (Criteria) this;
        }

        public Criteria andFrmsecurityconfigidNotIn(List<String> values) {
            addCriterion("FRMSECURITYCONFIGID not in", values, "frmsecurityconfigid");
            return (Criteria) this;
        }

        public Criteria andFrmsecurityconfigidBetween(String value1, String value2) {
            addCriterion("FRMSECURITYCONFIGID between", value1, value2, "frmsecurityconfigid");
            return (Criteria) this;
        }

        public Criteria andFrmsecurityconfigidNotBetween(String value1, String value2) {
            addCriterion("FRMSECURITYCONFIGID not between", value1, value2, "frmsecurityconfigid");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigenableIsNull() {
            addCriterion("SECURITYCONFIGENABLE is null");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigenableIsNotNull() {
            addCriterion("SECURITYCONFIGENABLE is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigenableEqualTo(String value) {
            addCriterion("SECURITYCONFIGENABLE =", value, "securityconfigenable");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigenableNotEqualTo(String value) {
            addCriterion("SECURITYCONFIGENABLE <>", value, "securityconfigenable");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigenableGreaterThan(String value) {
            addCriterion("SECURITYCONFIGENABLE >", value, "securityconfigenable");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigenableGreaterThanOrEqualTo(String value) {
            addCriterion("SECURITYCONFIGENABLE >=", value, "securityconfigenable");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigenableLessThan(String value) {
            addCriterion("SECURITYCONFIGENABLE <", value, "securityconfigenable");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigenableLessThanOrEqualTo(String value) {
            addCriterion("SECURITYCONFIGENABLE <=", value, "securityconfigenable");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigenableLike(String value) {
            addCriterion("SECURITYCONFIGENABLE like", value, "securityconfigenable");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigenableNotLike(String value) {
            addCriterion("SECURITYCONFIGENABLE not like", value, "securityconfigenable");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigenableIn(List<String> values) {
            addCriterion("SECURITYCONFIGENABLE in", values, "securityconfigenable");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigenableNotIn(List<String> values) {
            addCriterion("SECURITYCONFIGENABLE not in", values, "securityconfigenable");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigenableBetween(String value1, String value2) {
            addCriterion("SECURITYCONFIGENABLE between", value1, value2, "securityconfigenable");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigenableNotBetween(String value1, String value2) {
            addCriterion("SECURITYCONFIGENABLE not between", value1, value2, "securityconfigenable");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigcanoperIsNull() {
            addCriterion("SECURITYCONFIGCANOPER is null");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigcanoperIsNotNull() {
            addCriterion("SECURITYCONFIGCANOPER is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigcanoperEqualTo(String value) {
            addCriterion("SECURITYCONFIGCANOPER =", value, "securityconfigcanoper");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigcanoperNotEqualTo(String value) {
            addCriterion("SECURITYCONFIGCANOPER <>", value, "securityconfigcanoper");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigcanoperGreaterThan(String value) {
            addCriterion("SECURITYCONFIGCANOPER >", value, "securityconfigcanoper");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigcanoperGreaterThanOrEqualTo(String value) {
            addCriterion("SECURITYCONFIGCANOPER >=", value, "securityconfigcanoper");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigcanoperLessThan(String value) {
            addCriterion("SECURITYCONFIGCANOPER <", value, "securityconfigcanoper");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigcanoperLessThanOrEqualTo(String value) {
            addCriterion("SECURITYCONFIGCANOPER <=", value, "securityconfigcanoper");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigcanoperLike(String value) {
            addCriterion("SECURITYCONFIGCANOPER like", value, "securityconfigcanoper");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigcanoperNotLike(String value) {
            addCriterion("SECURITYCONFIGCANOPER not like", value, "securityconfigcanoper");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigcanoperIn(List<String> values) {
            addCriterion("SECURITYCONFIGCANOPER in", values, "securityconfigcanoper");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigcanoperNotIn(List<String> values) {
            addCriterion("SECURITYCONFIGCANOPER not in", values, "securityconfigcanoper");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigcanoperBetween(String value1, String value2) {
            addCriterion("SECURITYCONFIGCANOPER between", value1, value2, "securityconfigcanoper");
            return (Criteria) this;
        }

        public Criteria andSecurityconfigcanoperNotBetween(String value1, String value2) {
            addCriterion("SECURITYCONFIGCANOPER not between", value1, value2, "securityconfigcanoper");
            return (Criteria) this;
        }

        public Criteria andYhjsglenableIsNull() {
            addCriterion("YHJSGLENABLE is null");
            return (Criteria) this;
        }

        public Criteria andYhjsglenableIsNotNull() {
            addCriterion("YHJSGLENABLE is not null");
            return (Criteria) this;
        }

        public Criteria andYhjsglenableEqualTo(String value) {
            addCriterion("YHJSGLENABLE =", value, "yhjsglenable");
            return (Criteria) this;
        }

        public Criteria andYhjsglenableNotEqualTo(String value) {
            addCriterion("YHJSGLENABLE <>", value, "yhjsglenable");
            return (Criteria) this;
        }

        public Criteria andYhjsglenableGreaterThan(String value) {
            addCriterion("YHJSGLENABLE >", value, "yhjsglenable");
            return (Criteria) this;
        }

        public Criteria andYhjsglenableGreaterThanOrEqualTo(String value) {
            addCriterion("YHJSGLENABLE >=", value, "yhjsglenable");
            return (Criteria) this;
        }

        public Criteria andYhjsglenableLessThan(String value) {
            addCriterion("YHJSGLENABLE <", value, "yhjsglenable");
            return (Criteria) this;
        }

        public Criteria andYhjsglenableLessThanOrEqualTo(String value) {
            addCriterion("YHJSGLENABLE <=", value, "yhjsglenable");
            return (Criteria) this;
        }

        public Criteria andYhjsglenableLike(String value) {
            addCriterion("YHJSGLENABLE like", value, "yhjsglenable");
            return (Criteria) this;
        }

        public Criteria andYhjsglenableNotLike(String value) {
            addCriterion("YHJSGLENABLE not like", value, "yhjsglenable");
            return (Criteria) this;
        }

        public Criteria andYhjsglenableIn(List<String> values) {
            addCriterion("YHJSGLENABLE in", values, "yhjsglenable");
            return (Criteria) this;
        }

        public Criteria andYhjsglenableNotIn(List<String> values) {
            addCriterion("YHJSGLENABLE not in", values, "yhjsglenable");
            return (Criteria) this;
        }

        public Criteria andYhjsglenableBetween(String value1, String value2) {
            addCriterion("YHJSGLENABLE between", value1, value2, "yhjsglenable");
            return (Criteria) this;
        }

        public Criteria andYhjsglenableNotBetween(String value1, String value2) {
            addCriterion("YHJSGLENABLE not between", value1, value2, "yhjsglenable");
            return (Criteria) this;
        }

        public Criteria andYhjsglcanoperIsNull() {
            addCriterion("YHJSGLCANOPER is null");
            return (Criteria) this;
        }

        public Criteria andYhjsglcanoperIsNotNull() {
            addCriterion("YHJSGLCANOPER is not null");
            return (Criteria) this;
        }

        public Criteria andYhjsglcanoperEqualTo(String value) {
            addCriterion("YHJSGLCANOPER =", value, "yhjsglcanoper");
            return (Criteria) this;
        }

        public Criteria andYhjsglcanoperNotEqualTo(String value) {
            addCriterion("YHJSGLCANOPER <>", value, "yhjsglcanoper");
            return (Criteria) this;
        }

        public Criteria andYhjsglcanoperGreaterThan(String value) {
            addCriterion("YHJSGLCANOPER >", value, "yhjsglcanoper");
            return (Criteria) this;
        }

        public Criteria andYhjsglcanoperGreaterThanOrEqualTo(String value) {
            addCriterion("YHJSGLCANOPER >=", value, "yhjsglcanoper");
            return (Criteria) this;
        }

        public Criteria andYhjsglcanoperLessThan(String value) {
            addCriterion("YHJSGLCANOPER <", value, "yhjsglcanoper");
            return (Criteria) this;
        }

        public Criteria andYhjsglcanoperLessThanOrEqualTo(String value) {
            addCriterion("YHJSGLCANOPER <=", value, "yhjsglcanoper");
            return (Criteria) this;
        }

        public Criteria andYhjsglcanoperLike(String value) {
            addCriterion("YHJSGLCANOPER like", value, "yhjsglcanoper");
            return (Criteria) this;
        }

        public Criteria andYhjsglcanoperNotLike(String value) {
            addCriterion("YHJSGLCANOPER not like", value, "yhjsglcanoper");
            return (Criteria) this;
        }

        public Criteria andYhjsglcanoperIn(List<String> values) {
            addCriterion("YHJSGLCANOPER in", values, "yhjsglcanoper");
            return (Criteria) this;
        }

        public Criteria andYhjsglcanoperNotIn(List<String> values) {
            addCriterion("YHJSGLCANOPER not in", values, "yhjsglcanoper");
            return (Criteria) this;
        }

        public Criteria andYhjsglcanoperBetween(String value1, String value2) {
            addCriterion("YHJSGLCANOPER between", value1, value2, "yhjsglcanoper");
            return (Criteria) this;
        }

        public Criteria andYhjsglcanoperNotBetween(String value1, String value2) {
            addCriterion("YHJSGLCANOPER not between", value1, value2, "yhjsglcanoper");
            return (Criteria) this;
        }

        public Criteria andCjenableIsNull() {
            addCriterion("CJENABLE is null");
            return (Criteria) this;
        }

        public Criteria andCjenableIsNotNull() {
            addCriterion("CJENABLE is not null");
            return (Criteria) this;
        }

        public Criteria andCjenableEqualTo(String value) {
            addCriterion("CJENABLE =", value, "cjenable");
            return (Criteria) this;
        }

        public Criteria andCjenableNotEqualTo(String value) {
            addCriterion("CJENABLE <>", value, "cjenable");
            return (Criteria) this;
        }

        public Criteria andCjenableGreaterThan(String value) {
            addCriterion("CJENABLE >", value, "cjenable");
            return (Criteria) this;
        }

        public Criteria andCjenableGreaterThanOrEqualTo(String value) {
            addCriterion("CJENABLE >=", value, "cjenable");
            return (Criteria) this;
        }

        public Criteria andCjenableLessThan(String value) {
            addCriterion("CJENABLE <", value, "cjenable");
            return (Criteria) this;
        }

        public Criteria andCjenableLessThanOrEqualTo(String value) {
            addCriterion("CJENABLE <=", value, "cjenable");
            return (Criteria) this;
        }

        public Criteria andCjenableLike(String value) {
            addCriterion("CJENABLE like", value, "cjenable");
            return (Criteria) this;
        }

        public Criteria andCjenableNotLike(String value) {
            addCriterion("CJENABLE not like", value, "cjenable");
            return (Criteria) this;
        }

        public Criteria andCjenableIn(List<String> values) {
            addCriterion("CJENABLE in", values, "cjenable");
            return (Criteria) this;
        }

        public Criteria andCjenableNotIn(List<String> values) {
            addCriterion("CJENABLE not in", values, "cjenable");
            return (Criteria) this;
        }

        public Criteria andCjenableBetween(String value1, String value2) {
            addCriterion("CJENABLE between", value1, value2, "cjenable");
            return (Criteria) this;
        }

        public Criteria andCjenableNotBetween(String value1, String value2) {
            addCriterion("CJENABLE not between", value1, value2, "cjenable");
            return (Criteria) this;
        }

        public Criteria andCjcanoperIsNull() {
            addCriterion("CJCANOPER is null");
            return (Criteria) this;
        }

        public Criteria andCjcanoperIsNotNull() {
            addCriterion("CJCANOPER is not null");
            return (Criteria) this;
        }

        public Criteria andCjcanoperEqualTo(String value) {
            addCriterion("CJCANOPER =", value, "cjcanoper");
            return (Criteria) this;
        }

        public Criteria andCjcanoperNotEqualTo(String value) {
            addCriterion("CJCANOPER <>", value, "cjcanoper");
            return (Criteria) this;
        }

        public Criteria andCjcanoperGreaterThan(String value) {
            addCriterion("CJCANOPER >", value, "cjcanoper");
            return (Criteria) this;
        }

        public Criteria andCjcanoperGreaterThanOrEqualTo(String value) {
            addCriterion("CJCANOPER >=", value, "cjcanoper");
            return (Criteria) this;
        }

        public Criteria andCjcanoperLessThan(String value) {
            addCriterion("CJCANOPER <", value, "cjcanoper");
            return (Criteria) this;
        }

        public Criteria andCjcanoperLessThanOrEqualTo(String value) {
            addCriterion("CJCANOPER <=", value, "cjcanoper");
            return (Criteria) this;
        }

        public Criteria andCjcanoperLike(String value) {
            addCriterion("CJCANOPER like", value, "cjcanoper");
            return (Criteria) this;
        }

        public Criteria andCjcanoperNotLike(String value) {
            addCriterion("CJCANOPER not like", value, "cjcanoper");
            return (Criteria) this;
        }

        public Criteria andCjcanoperIn(List<String> values) {
            addCriterion("CJCANOPER in", values, "cjcanoper");
            return (Criteria) this;
        }

        public Criteria andCjcanoperNotIn(List<String> values) {
            addCriterion("CJCANOPER not in", values, "cjcanoper");
            return (Criteria) this;
        }

        public Criteria andCjcanoperBetween(String value1, String value2) {
            addCriterion("CJCANOPER between", value1, value2, "cjcanoper");
            return (Criteria) this;
        }

        public Criteria andCjcanoperNotBetween(String value1, String value2) {
            addCriterion("CJCANOPER not between", value1, value2, "cjcanoper");
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