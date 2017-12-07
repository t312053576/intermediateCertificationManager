package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class FrmSecondPurviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrmSecondPurviewExample() {
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

        public Criteria andSecondpurviewidIsNull() {
            addCriterion("SECONDPURVIEWID is null");
            return (Criteria) this;
        }

        public Criteria andSecondpurviewidIsNotNull() {
            addCriterion("SECONDPURVIEWID is not null");
            return (Criteria) this;
        }

        public Criteria andSecondpurviewidEqualTo(String value) {
            addCriterion("SECONDPURVIEWID =", value, "secondpurviewid");
            return (Criteria) this;
        }

        public Criteria andSecondpurviewidNotEqualTo(String value) {
            addCriterion("SECONDPURVIEWID <>", value, "secondpurviewid");
            return (Criteria) this;
        }

        public Criteria andSecondpurviewidGreaterThan(String value) {
            addCriterion("SECONDPURVIEWID >", value, "secondpurviewid");
            return (Criteria) this;
        }

        public Criteria andSecondpurviewidGreaterThanOrEqualTo(String value) {
            addCriterion("SECONDPURVIEWID >=", value, "secondpurviewid");
            return (Criteria) this;
        }

        public Criteria andSecondpurviewidLessThan(String value) {
            addCriterion("SECONDPURVIEWID <", value, "secondpurviewid");
            return (Criteria) this;
        }

        public Criteria andSecondpurviewidLessThanOrEqualTo(String value) {
            addCriterion("SECONDPURVIEWID <=", value, "secondpurviewid");
            return (Criteria) this;
        }

        public Criteria andSecondpurviewidLike(String value) {
            addCriterion("SECONDPURVIEWID like", value, "secondpurviewid");
            return (Criteria) this;
        }

        public Criteria andSecondpurviewidNotLike(String value) {
            addCriterion("SECONDPURVIEWID not like", value, "secondpurviewid");
            return (Criteria) this;
        }

        public Criteria andSecondpurviewidIn(List<String> values) {
            addCriterion("SECONDPURVIEWID in", values, "secondpurviewid");
            return (Criteria) this;
        }

        public Criteria andSecondpurviewidNotIn(List<String> values) {
            addCriterion("SECONDPURVIEWID not in", values, "secondpurviewid");
            return (Criteria) this;
        }

        public Criteria andSecondpurviewidBetween(String value1, String value2) {
            addCriterion("SECONDPURVIEWID between", value1, value2, "secondpurviewid");
            return (Criteria) this;
        }

        public Criteria andSecondpurviewidNotBetween(String value1, String value2) {
            addCriterion("SECONDPURVIEWID not between", value1, value2, "secondpurviewid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridIsNull() {
            addCriterion("SOURCEUSERID is null");
            return (Criteria) this;
        }

        public Criteria andSourceuseridIsNotNull() {
            addCriterion("SOURCEUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andSourceuseridEqualTo(String value) {
            addCriterion("SOURCEUSERID =", value, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridNotEqualTo(String value) {
            addCriterion("SOURCEUSERID <>", value, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridGreaterThan(String value) {
            addCriterion("SOURCEUSERID >", value, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCEUSERID >=", value, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridLessThan(String value) {
            addCriterion("SOURCEUSERID <", value, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridLessThanOrEqualTo(String value) {
            addCriterion("SOURCEUSERID <=", value, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridLike(String value) {
            addCriterion("SOURCEUSERID like", value, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridNotLike(String value) {
            addCriterion("SOURCEUSERID not like", value, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridIn(List<String> values) {
            addCriterion("SOURCEUSERID in", values, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridNotIn(List<String> values) {
            addCriterion("SOURCEUSERID not in", values, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridBetween(String value1, String value2) {
            addCriterion("SOURCEUSERID between", value1, value2, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridNotBetween(String value1, String value2) {
            addCriterion("SOURCEUSERID not between", value1, value2, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridIsNull() {
            addCriterion("TARGETUSERID is null");
            return (Criteria) this;
        }

        public Criteria andTargetuseridIsNotNull() {
            addCriterion("TARGETUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andTargetuseridEqualTo(String value) {
            addCriterion("TARGETUSERID =", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridNotEqualTo(String value) {
            addCriterion("TARGETUSERID <>", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridGreaterThan(String value) {
            addCriterion("TARGETUSERID >", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridGreaterThanOrEqualTo(String value) {
            addCriterion("TARGETUSERID >=", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridLessThan(String value) {
            addCriterion("TARGETUSERID <", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridLessThanOrEqualTo(String value) {
            addCriterion("TARGETUSERID <=", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridLike(String value) {
            addCriterion("TARGETUSERID like", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridNotLike(String value) {
            addCriterion("TARGETUSERID not like", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridIn(List<String> values) {
            addCriterion("TARGETUSERID in", values, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridNotIn(List<String> values) {
            addCriterion("TARGETUSERID not in", values, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridBetween(String value1, String value2) {
            addCriterion("TARGETUSERID between", value1, value2, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridNotBetween(String value1, String value2) {
            addCriterion("TARGETUSERID not between", value1, value2, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeIsNull() {
            addCriterion("AUTHSTARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeIsNotNull() {
            addCriterion("AUTHSTARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeEqualTo(String value) {
            addCriterion("AUTHSTARTTIME =", value, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeNotEqualTo(String value) {
            addCriterion("AUTHSTARTTIME <>", value, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeGreaterThan(String value) {
            addCriterion("AUTHSTARTTIME >", value, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHSTARTTIME >=", value, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeLessThan(String value) {
            addCriterion("AUTHSTARTTIME <", value, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeLessThanOrEqualTo(String value) {
            addCriterion("AUTHSTARTTIME <=", value, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeLike(String value) {
            addCriterion("AUTHSTARTTIME like", value, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeNotLike(String value) {
            addCriterion("AUTHSTARTTIME not like", value, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeIn(List<String> values) {
            addCriterion("AUTHSTARTTIME in", values, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeNotIn(List<String> values) {
            addCriterion("AUTHSTARTTIME not in", values, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeBetween(String value1, String value2) {
            addCriterion("AUTHSTARTTIME between", value1, value2, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeNotBetween(String value1, String value2) {
            addCriterion("AUTHSTARTTIME not between", value1, value2, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeIsNull() {
            addCriterion("AUTHENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeIsNotNull() {
            addCriterion("AUTHENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeEqualTo(String value) {
            addCriterion("AUTHENDTIME =", value, "authendtime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeNotEqualTo(String value) {
            addCriterion("AUTHENDTIME <>", value, "authendtime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeGreaterThan(String value) {
            addCriterion("AUTHENDTIME >", value, "authendtime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHENDTIME >=", value, "authendtime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeLessThan(String value) {
            addCriterion("AUTHENDTIME <", value, "authendtime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeLessThanOrEqualTo(String value) {
            addCriterion("AUTHENDTIME <=", value, "authendtime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeLike(String value) {
            addCriterion("AUTHENDTIME like", value, "authendtime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeNotLike(String value) {
            addCriterion("AUTHENDTIME not like", value, "authendtime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeIn(List<String> values) {
            addCriterion("AUTHENDTIME in", values, "authendtime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeNotIn(List<String> values) {
            addCriterion("AUTHENDTIME not in", values, "authendtime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeBetween(String value1, String value2) {
            addCriterion("AUTHENDTIME between", value1, value2, "authendtime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeNotBetween(String value1, String value2) {
            addCriterion("AUTHENDTIME not between", value1, value2, "authendtime");
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