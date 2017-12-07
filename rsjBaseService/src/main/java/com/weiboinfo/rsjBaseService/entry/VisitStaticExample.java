package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class VisitStaticExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VisitStaticExample() {
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

        public Criteria andVidIsNull() {
            addCriterion("VID is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("VID is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(String value) {
            addCriterion("VID =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(String value) {
            addCriterion("VID <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(String value) {
            addCriterion("VID >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(String value) {
            addCriterion("VID >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(String value) {
            addCriterion("VID <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(String value) {
            addCriterion("VID <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLike(String value) {
            addCriterion("VID like", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotLike(String value) {
            addCriterion("VID not like", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<String> values) {
            addCriterion("VID in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<String> values) {
            addCriterion("VID not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(String value1, String value2) {
            addCriterion("VID between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(String value1, String value2) {
            addCriterion("VID not between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andPageurlIsNull() {
            addCriterion("PAGEURL is null");
            return (Criteria) this;
        }

        public Criteria andPageurlIsNotNull() {
            addCriterion("PAGEURL is not null");
            return (Criteria) this;
        }

        public Criteria andPageurlEqualTo(String value) {
            addCriterion("PAGEURL =", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlNotEqualTo(String value) {
            addCriterion("PAGEURL <>", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlGreaterThan(String value) {
            addCriterion("PAGEURL >", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlGreaterThanOrEqualTo(String value) {
            addCriterion("PAGEURL >=", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlLessThan(String value) {
            addCriterion("PAGEURL <", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlLessThanOrEqualTo(String value) {
            addCriterion("PAGEURL <=", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlLike(String value) {
            addCriterion("PAGEURL like", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlNotLike(String value) {
            addCriterion("PAGEURL not like", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlIn(List<String> values) {
            addCriterion("PAGEURL in", values, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlNotIn(List<String> values) {
            addCriterion("PAGEURL not in", values, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlBetween(String value1, String value2) {
            addCriterion("PAGEURL between", value1, value2, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlNotBetween(String value1, String value2) {
            addCriterion("PAGEURL not between", value1, value2, "pageurl");
            return (Criteria) this;
        }

        public Criteria andVipIsNull() {
            addCriterion("VIP is null");
            return (Criteria) this;
        }

        public Criteria andVipIsNotNull() {
            addCriterion("VIP is not null");
            return (Criteria) this;
        }

        public Criteria andVipEqualTo(String value) {
            addCriterion("VIP =", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotEqualTo(String value) {
            addCriterion("VIP <>", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipGreaterThan(String value) {
            addCriterion("VIP >", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipGreaterThanOrEqualTo(String value) {
            addCriterion("VIP >=", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLessThan(String value) {
            addCriterion("VIP <", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLessThanOrEqualTo(String value) {
            addCriterion("VIP <=", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLike(String value) {
            addCriterion("VIP like", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotLike(String value) {
            addCriterion("VIP not like", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipIn(List<String> values) {
            addCriterion("VIP in", values, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotIn(List<String> values) {
            addCriterion("VIP not in", values, "vip");
            return (Criteria) this;
        }

        public Criteria andVipBetween(String value1, String value2) {
            addCriterion("VIP between", value1, value2, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotBetween(String value1, String value2) {
            addCriterion("VIP not between", value1, value2, "vip");
            return (Criteria) this;
        }

        public Criteria andVtimeIsNull() {
            addCriterion("VTIME is null");
            return (Criteria) this;
        }

        public Criteria andVtimeIsNotNull() {
            addCriterion("VTIME is not null");
            return (Criteria) this;
        }

        public Criteria andVtimeEqualTo(String value) {
            addCriterion("VTIME =", value, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeNotEqualTo(String value) {
            addCriterion("VTIME <>", value, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeGreaterThan(String value) {
            addCriterion("VTIME >", value, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeGreaterThanOrEqualTo(String value) {
            addCriterion("VTIME >=", value, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeLessThan(String value) {
            addCriterion("VTIME <", value, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeLessThanOrEqualTo(String value) {
            addCriterion("VTIME <=", value, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeLike(String value) {
            addCriterion("VTIME like", value, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeNotLike(String value) {
            addCriterion("VTIME not like", value, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeIn(List<String> values) {
            addCriterion("VTIME in", values, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeNotIn(List<String> values) {
            addCriterion("VTIME not in", values, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeBetween(String value1, String value2) {
            addCriterion("VTIME between", value1, value2, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeNotBetween(String value1, String value2) {
            addCriterion("VTIME not between", value1, value2, "vtime");
            return (Criteria) this;
        }

        public Criteria andVipdistinctIsNull() {
            addCriterion("VIPDISTINCT is null");
            return (Criteria) this;
        }

        public Criteria andVipdistinctIsNotNull() {
            addCriterion("VIPDISTINCT is not null");
            return (Criteria) this;
        }

        public Criteria andVipdistinctEqualTo(String value) {
            addCriterion("VIPDISTINCT =", value, "vipdistinct");
            return (Criteria) this;
        }

        public Criteria andVipdistinctNotEqualTo(String value) {
            addCriterion("VIPDISTINCT <>", value, "vipdistinct");
            return (Criteria) this;
        }

        public Criteria andVipdistinctGreaterThan(String value) {
            addCriterion("VIPDISTINCT >", value, "vipdistinct");
            return (Criteria) this;
        }

        public Criteria andVipdistinctGreaterThanOrEqualTo(String value) {
            addCriterion("VIPDISTINCT >=", value, "vipdistinct");
            return (Criteria) this;
        }

        public Criteria andVipdistinctLessThan(String value) {
            addCriterion("VIPDISTINCT <", value, "vipdistinct");
            return (Criteria) this;
        }

        public Criteria andVipdistinctLessThanOrEqualTo(String value) {
            addCriterion("VIPDISTINCT <=", value, "vipdistinct");
            return (Criteria) this;
        }

        public Criteria andVipdistinctLike(String value) {
            addCriterion("VIPDISTINCT like", value, "vipdistinct");
            return (Criteria) this;
        }

        public Criteria andVipdistinctNotLike(String value) {
            addCriterion("VIPDISTINCT not like", value, "vipdistinct");
            return (Criteria) this;
        }

        public Criteria andVipdistinctIn(List<String> values) {
            addCriterion("VIPDISTINCT in", values, "vipdistinct");
            return (Criteria) this;
        }

        public Criteria andVipdistinctNotIn(List<String> values) {
            addCriterion("VIPDISTINCT not in", values, "vipdistinct");
            return (Criteria) this;
        }

        public Criteria andVipdistinctBetween(String value1, String value2) {
            addCriterion("VIPDISTINCT between", value1, value2, "vipdistinct");
            return (Criteria) this;
        }

        public Criteria andVipdistinctNotBetween(String value1, String value2) {
            addCriterion("VIPDISTINCT not between", value1, value2, "vipdistinct");
            return (Criteria) this;
        }

        public Criteria andVipproviderIsNull() {
            addCriterion("VIPPROVIDER is null");
            return (Criteria) this;
        }

        public Criteria andVipproviderIsNotNull() {
            addCriterion("VIPPROVIDER is not null");
            return (Criteria) this;
        }

        public Criteria andVipproviderEqualTo(String value) {
            addCriterion("VIPPROVIDER =", value, "vipprovider");
            return (Criteria) this;
        }

        public Criteria andVipproviderNotEqualTo(String value) {
            addCriterion("VIPPROVIDER <>", value, "vipprovider");
            return (Criteria) this;
        }

        public Criteria andVipproviderGreaterThan(String value) {
            addCriterion("VIPPROVIDER >", value, "vipprovider");
            return (Criteria) this;
        }

        public Criteria andVipproviderGreaterThanOrEqualTo(String value) {
            addCriterion("VIPPROVIDER >=", value, "vipprovider");
            return (Criteria) this;
        }

        public Criteria andVipproviderLessThan(String value) {
            addCriterion("VIPPROVIDER <", value, "vipprovider");
            return (Criteria) this;
        }

        public Criteria andVipproviderLessThanOrEqualTo(String value) {
            addCriterion("VIPPROVIDER <=", value, "vipprovider");
            return (Criteria) this;
        }

        public Criteria andVipproviderLike(String value) {
            addCriterion("VIPPROVIDER like", value, "vipprovider");
            return (Criteria) this;
        }

        public Criteria andVipproviderNotLike(String value) {
            addCriterion("VIPPROVIDER not like", value, "vipprovider");
            return (Criteria) this;
        }

        public Criteria andVipproviderIn(List<String> values) {
            addCriterion("VIPPROVIDER in", values, "vipprovider");
            return (Criteria) this;
        }

        public Criteria andVipproviderNotIn(List<String> values) {
            addCriterion("VIPPROVIDER not in", values, "vipprovider");
            return (Criteria) this;
        }

        public Criteria andVipproviderBetween(String value1, String value2) {
            addCriterion("VIPPROVIDER between", value1, value2, "vipprovider");
            return (Criteria) this;
        }

        public Criteria andVipproviderNotBetween(String value1, String value2) {
            addCriterion("VIPPROVIDER not between", value1, value2, "vipprovider");
            return (Criteria) this;
        }

        public Criteria andVrefererIsNull() {
            addCriterion("VREFERER is null");
            return (Criteria) this;
        }

        public Criteria andVrefererIsNotNull() {
            addCriterion("VREFERER is not null");
            return (Criteria) this;
        }

        public Criteria andVrefererEqualTo(String value) {
            addCriterion("VREFERER =", value, "vreferer");
            return (Criteria) this;
        }

        public Criteria andVrefererNotEqualTo(String value) {
            addCriterion("VREFERER <>", value, "vreferer");
            return (Criteria) this;
        }

        public Criteria andVrefererGreaterThan(String value) {
            addCriterion("VREFERER >", value, "vreferer");
            return (Criteria) this;
        }

        public Criteria andVrefererGreaterThanOrEqualTo(String value) {
            addCriterion("VREFERER >=", value, "vreferer");
            return (Criteria) this;
        }

        public Criteria andVrefererLessThan(String value) {
            addCriterion("VREFERER <", value, "vreferer");
            return (Criteria) this;
        }

        public Criteria andVrefererLessThanOrEqualTo(String value) {
            addCriterion("VREFERER <=", value, "vreferer");
            return (Criteria) this;
        }

        public Criteria andVrefererLike(String value) {
            addCriterion("VREFERER like", value, "vreferer");
            return (Criteria) this;
        }

        public Criteria andVrefererNotLike(String value) {
            addCriterion("VREFERER not like", value, "vreferer");
            return (Criteria) this;
        }

        public Criteria andVrefererIn(List<String> values) {
            addCriterion("VREFERER in", values, "vreferer");
            return (Criteria) this;
        }

        public Criteria andVrefererNotIn(List<String> values) {
            addCriterion("VREFERER not in", values, "vreferer");
            return (Criteria) this;
        }

        public Criteria andVrefererBetween(String value1, String value2) {
            addCriterion("VREFERER between", value1, value2, "vreferer");
            return (Criteria) this;
        }

        public Criteria andVrefererNotBetween(String value1, String value2) {
            addCriterion("VREFERER not between", value1, value2, "vreferer");
            return (Criteria) this;
        }

        public Criteria andPagetitleIsNull() {
            addCriterion("PAGETITLE is null");
            return (Criteria) this;
        }

        public Criteria andPagetitleIsNotNull() {
            addCriterion("PAGETITLE is not null");
            return (Criteria) this;
        }

        public Criteria andPagetitleEqualTo(String value) {
            addCriterion("PAGETITLE =", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleNotEqualTo(String value) {
            addCriterion("PAGETITLE <>", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleGreaterThan(String value) {
            addCriterion("PAGETITLE >", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleGreaterThanOrEqualTo(String value) {
            addCriterion("PAGETITLE >=", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleLessThan(String value) {
            addCriterion("PAGETITLE <", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleLessThanOrEqualTo(String value) {
            addCriterion("PAGETITLE <=", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleLike(String value) {
            addCriterion("PAGETITLE like", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleNotLike(String value) {
            addCriterion("PAGETITLE not like", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleIn(List<String> values) {
            addCriterion("PAGETITLE in", values, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleNotIn(List<String> values) {
            addCriterion("PAGETITLE not in", values, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleBetween(String value1, String value2) {
            addCriterion("PAGETITLE between", value1, value2, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleNotBetween(String value1, String value2) {
            addCriterion("PAGETITLE not between", value1, value2, "pagetitle");
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