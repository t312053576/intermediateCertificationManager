package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class FrmPurviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrmPurviewExample() {
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

        public Criteria andPurviewidIsNull() {
            addCriterion("PURVIEWID is null");
            return (Criteria) this;
        }

        public Criteria andPurviewidIsNotNull() {
            addCriterion("PURVIEWID is not null");
            return (Criteria) this;
        }

        public Criteria andPurviewidEqualTo(String value) {
            addCriterion("PURVIEWID =", value, "purviewid");
            return (Criteria) this;
        }

        public Criteria andPurviewidNotEqualTo(String value) {
            addCriterion("PURVIEWID <>", value, "purviewid");
            return (Criteria) this;
        }

        public Criteria andPurviewidGreaterThan(String value) {
            addCriterion("PURVIEWID >", value, "purviewid");
            return (Criteria) this;
        }

        public Criteria andPurviewidGreaterThanOrEqualTo(String value) {
            addCriterion("PURVIEWID >=", value, "purviewid");
            return (Criteria) this;
        }

        public Criteria andPurviewidLessThan(String value) {
            addCriterion("PURVIEWID <", value, "purviewid");
            return (Criteria) this;
        }

        public Criteria andPurviewidLessThanOrEqualTo(String value) {
            addCriterion("PURVIEWID <=", value, "purviewid");
            return (Criteria) this;
        }

        public Criteria andPurviewidLike(String value) {
            addCriterion("PURVIEWID like", value, "purviewid");
            return (Criteria) this;
        }

        public Criteria andPurviewidNotLike(String value) {
            addCriterion("PURVIEWID not like", value, "purviewid");
            return (Criteria) this;
        }

        public Criteria andPurviewidIn(List<String> values) {
            addCriterion("PURVIEWID in", values, "purviewid");
            return (Criteria) this;
        }

        public Criteria andPurviewidNotIn(List<String> values) {
            addCriterion("PURVIEWID not in", values, "purviewid");
            return (Criteria) this;
        }

        public Criteria andPurviewidBetween(String value1, String value2) {
            addCriterion("PURVIEWID between", value1, value2, "purviewid");
            return (Criteria) this;
        }

        public Criteria andPurviewidNotBetween(String value1, String value2) {
            addCriterion("PURVIEWID not between", value1, value2, "purviewid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andTablepkIsNull() {
            addCriterion("TABLEPK is null");
            return (Criteria) this;
        }

        public Criteria andTablepkIsNotNull() {
            addCriterion("TABLEPK is not null");
            return (Criteria) this;
        }

        public Criteria andTablepkEqualTo(String value) {
            addCriterion("TABLEPK =", value, "tablepk");
            return (Criteria) this;
        }

        public Criteria andTablepkNotEqualTo(String value) {
            addCriterion("TABLEPK <>", value, "tablepk");
            return (Criteria) this;
        }

        public Criteria andTablepkGreaterThan(String value) {
            addCriterion("TABLEPK >", value, "tablepk");
            return (Criteria) this;
        }

        public Criteria andTablepkGreaterThanOrEqualTo(String value) {
            addCriterion("TABLEPK >=", value, "tablepk");
            return (Criteria) this;
        }

        public Criteria andTablepkLessThan(String value) {
            addCriterion("TABLEPK <", value, "tablepk");
            return (Criteria) this;
        }

        public Criteria andTablepkLessThanOrEqualTo(String value) {
            addCriterion("TABLEPK <=", value, "tablepk");
            return (Criteria) this;
        }

        public Criteria andTablepkLike(String value) {
            addCriterion("TABLEPK like", value, "tablepk");
            return (Criteria) this;
        }

        public Criteria andTablepkNotLike(String value) {
            addCriterion("TABLEPK not like", value, "tablepk");
            return (Criteria) this;
        }

        public Criteria andTablepkIn(List<String> values) {
            addCriterion("TABLEPK in", values, "tablepk");
            return (Criteria) this;
        }

        public Criteria andTablepkNotIn(List<String> values) {
            addCriterion("TABLEPK not in", values, "tablepk");
            return (Criteria) this;
        }

        public Criteria andTablepkBetween(String value1, String value2) {
            addCriterion("TABLEPK between", value1, value2, "tablepk");
            return (Criteria) this;
        }

        public Criteria andTablepkNotBetween(String value1, String value2) {
            addCriterion("TABLEPK not between", value1, value2, "tablepk");
            return (Criteria) this;
        }

        public Criteria andTablepkvalueIsNull() {
            addCriterion("TABLEPKVALUE is null");
            return (Criteria) this;
        }

        public Criteria andTablepkvalueIsNotNull() {
            addCriterion("TABLEPKVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTablepkvalueEqualTo(String value) {
            addCriterion("TABLEPKVALUE =", value, "tablepkvalue");
            return (Criteria) this;
        }

        public Criteria andTablepkvalueNotEqualTo(String value) {
            addCriterion("TABLEPKVALUE <>", value, "tablepkvalue");
            return (Criteria) this;
        }

        public Criteria andTablepkvalueGreaterThan(String value) {
            addCriterion("TABLEPKVALUE >", value, "tablepkvalue");
            return (Criteria) this;
        }

        public Criteria andTablepkvalueGreaterThanOrEqualTo(String value) {
            addCriterion("TABLEPKVALUE >=", value, "tablepkvalue");
            return (Criteria) this;
        }

        public Criteria andTablepkvalueLessThan(String value) {
            addCriterion("TABLEPKVALUE <", value, "tablepkvalue");
            return (Criteria) this;
        }

        public Criteria andTablepkvalueLessThanOrEqualTo(String value) {
            addCriterion("TABLEPKVALUE <=", value, "tablepkvalue");
            return (Criteria) this;
        }

        public Criteria andTablepkvalueLike(String value) {
            addCriterion("TABLEPKVALUE like", value, "tablepkvalue");
            return (Criteria) this;
        }

        public Criteria andTablepkvalueNotLike(String value) {
            addCriterion("TABLEPKVALUE not like", value, "tablepkvalue");
            return (Criteria) this;
        }

        public Criteria andTablepkvalueIn(List<String> values) {
            addCriterion("TABLEPKVALUE in", values, "tablepkvalue");
            return (Criteria) this;
        }

        public Criteria andTablepkvalueNotIn(List<String> values) {
            addCriterion("TABLEPKVALUE not in", values, "tablepkvalue");
            return (Criteria) this;
        }

        public Criteria andTablepkvalueBetween(String value1, String value2) {
            addCriterion("TABLEPKVALUE between", value1, value2, "tablepkvalue");
            return (Criteria) this;
        }

        public Criteria andTablepkvalueNotBetween(String value1, String value2) {
            addCriterion("TABLEPKVALUE not between", value1, value2, "tablepkvalue");
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