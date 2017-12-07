package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class FrmRoleGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrmRoleGroupExample() {
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

        public Criteria andRolegroupidIsNull() {
            addCriterion("ROLEGROUPID is null");
            return (Criteria) this;
        }

        public Criteria andRolegroupidIsNotNull() {
            addCriterion("ROLEGROUPID is not null");
            return (Criteria) this;
        }

        public Criteria andRolegroupidEqualTo(String value) {
            addCriterion("ROLEGROUPID =", value, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupidNotEqualTo(String value) {
            addCriterion("ROLEGROUPID <>", value, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupidGreaterThan(String value) {
            addCriterion("ROLEGROUPID >", value, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupidGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEGROUPID >=", value, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupidLessThan(String value) {
            addCriterion("ROLEGROUPID <", value, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupidLessThanOrEqualTo(String value) {
            addCriterion("ROLEGROUPID <=", value, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupidLike(String value) {
            addCriterion("ROLEGROUPID like", value, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupidNotLike(String value) {
            addCriterion("ROLEGROUPID not like", value, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupidIn(List<String> values) {
            addCriterion("ROLEGROUPID in", values, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupidNotIn(List<String> values) {
            addCriterion("ROLEGROUPID not in", values, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupidBetween(String value1, String value2) {
            addCriterion("ROLEGROUPID between", value1, value2, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupidNotBetween(String value1, String value2) {
            addCriterion("ROLEGROUPID not between", value1, value2, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupnameIsNull() {
            addCriterion("ROLEGROUPNAME is null");
            return (Criteria) this;
        }

        public Criteria andRolegroupnameIsNotNull() {
            addCriterion("ROLEGROUPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRolegroupnameEqualTo(String value) {
            addCriterion("ROLEGROUPNAME =", value, "rolegroupname");
            return (Criteria) this;
        }

        public Criteria andRolegroupnameNotEqualTo(String value) {
            addCriterion("ROLEGROUPNAME <>", value, "rolegroupname");
            return (Criteria) this;
        }

        public Criteria andRolegroupnameGreaterThan(String value) {
            addCriterion("ROLEGROUPNAME >", value, "rolegroupname");
            return (Criteria) this;
        }

        public Criteria andRolegroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEGROUPNAME >=", value, "rolegroupname");
            return (Criteria) this;
        }

        public Criteria andRolegroupnameLessThan(String value) {
            addCriterion("ROLEGROUPNAME <", value, "rolegroupname");
            return (Criteria) this;
        }

        public Criteria andRolegroupnameLessThanOrEqualTo(String value) {
            addCriterion("ROLEGROUPNAME <=", value, "rolegroupname");
            return (Criteria) this;
        }

        public Criteria andRolegroupnameLike(String value) {
            addCriterion("ROLEGROUPNAME like", value, "rolegroupname");
            return (Criteria) this;
        }

        public Criteria andRolegroupnameNotLike(String value) {
            addCriterion("ROLEGROUPNAME not like", value, "rolegroupname");
            return (Criteria) this;
        }

        public Criteria andRolegroupnameIn(List<String> values) {
            addCriterion("ROLEGROUPNAME in", values, "rolegroupname");
            return (Criteria) this;
        }

        public Criteria andRolegroupnameNotIn(List<String> values) {
            addCriterion("ROLEGROUPNAME not in", values, "rolegroupname");
            return (Criteria) this;
        }

        public Criteria andRolegroupnameBetween(String value1, String value2) {
            addCriterion("ROLEGROUPNAME between", value1, value2, "rolegroupname");
            return (Criteria) this;
        }

        public Criteria andRolegroupnameNotBetween(String value1, String value2) {
            addCriterion("ROLEGROUPNAME not between", value1, value2, "rolegroupname");
            return (Criteria) this;
        }

        public Criteria andSysidIsNull() {
            addCriterion("SYSID is null");
            return (Criteria) this;
        }

        public Criteria andSysidIsNotNull() {
            addCriterion("SYSID is not null");
            return (Criteria) this;
        }

        public Criteria andSysidEqualTo(String value) {
            addCriterion("SYSID =", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotEqualTo(String value) {
            addCriterion("SYSID <>", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidGreaterThan(String value) {
            addCriterion("SYSID >", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidGreaterThanOrEqualTo(String value) {
            addCriterion("SYSID >=", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLessThan(String value) {
            addCriterion("SYSID <", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLessThanOrEqualTo(String value) {
            addCriterion("SYSID <=", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLike(String value) {
            addCriterion("SYSID like", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotLike(String value) {
            addCriterion("SYSID not like", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidIn(List<String> values) {
            addCriterion("SYSID in", values, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotIn(List<String> values) {
            addCriterion("SYSID not in", values, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidBetween(String value1, String value2) {
            addCriterion("SYSID between", value1, value2, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotBetween(String value1, String value2) {
            addCriterion("SYSID not between", value1, value2, "sysid");
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