package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class SurveyConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SurveyConfigExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCSitenameIsNull() {
            addCriterion("C_SITENAME is null");
            return (Criteria) this;
        }

        public Criteria andCSitenameIsNotNull() {
            addCriterion("C_SITENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCSitenameEqualTo(String value) {
            addCriterion("C_SITENAME =", value, "cSitename");
            return (Criteria) this;
        }

        public Criteria andCSitenameNotEqualTo(String value) {
            addCriterion("C_SITENAME <>", value, "cSitename");
            return (Criteria) this;
        }

        public Criteria andCSitenameGreaterThan(String value) {
            addCriterion("C_SITENAME >", value, "cSitename");
            return (Criteria) this;
        }

        public Criteria andCSitenameGreaterThanOrEqualTo(String value) {
            addCriterion("C_SITENAME >=", value, "cSitename");
            return (Criteria) this;
        }

        public Criteria andCSitenameLessThan(String value) {
            addCriterion("C_SITENAME <", value, "cSitename");
            return (Criteria) this;
        }

        public Criteria andCSitenameLessThanOrEqualTo(String value) {
            addCriterion("C_SITENAME <=", value, "cSitename");
            return (Criteria) this;
        }

        public Criteria andCSitenameLike(String value) {
            addCriterion("C_SITENAME like", value, "cSitename");
            return (Criteria) this;
        }

        public Criteria andCSitenameNotLike(String value) {
            addCriterion("C_SITENAME not like", value, "cSitename");
            return (Criteria) this;
        }

        public Criteria andCSitenameIn(List<String> values) {
            addCriterion("C_SITENAME in", values, "cSitename");
            return (Criteria) this;
        }

        public Criteria andCSitenameNotIn(List<String> values) {
            addCriterion("C_SITENAME not in", values, "cSitename");
            return (Criteria) this;
        }

        public Criteria andCSitenameBetween(String value1, String value2) {
            addCriterion("C_SITENAME between", value1, value2, "cSitename");
            return (Criteria) this;
        }

        public Criteria andCSitenameNotBetween(String value1, String value2) {
            addCriterion("C_SITENAME not between", value1, value2, "cSitename");
            return (Criteria) this;
        }

        public Criteria andCSiteurlIsNull() {
            addCriterion("C_SITEURL is null");
            return (Criteria) this;
        }

        public Criteria andCSiteurlIsNotNull() {
            addCriterion("C_SITEURL is not null");
            return (Criteria) this;
        }

        public Criteria andCSiteurlEqualTo(String value) {
            addCriterion("C_SITEURL =", value, "cSiteurl");
            return (Criteria) this;
        }

        public Criteria andCSiteurlNotEqualTo(String value) {
            addCriterion("C_SITEURL <>", value, "cSiteurl");
            return (Criteria) this;
        }

        public Criteria andCSiteurlGreaterThan(String value) {
            addCriterion("C_SITEURL >", value, "cSiteurl");
            return (Criteria) this;
        }

        public Criteria andCSiteurlGreaterThanOrEqualTo(String value) {
            addCriterion("C_SITEURL >=", value, "cSiteurl");
            return (Criteria) this;
        }

        public Criteria andCSiteurlLessThan(String value) {
            addCriterion("C_SITEURL <", value, "cSiteurl");
            return (Criteria) this;
        }

        public Criteria andCSiteurlLessThanOrEqualTo(String value) {
            addCriterion("C_SITEURL <=", value, "cSiteurl");
            return (Criteria) this;
        }

        public Criteria andCSiteurlLike(String value) {
            addCriterion("C_SITEURL like", value, "cSiteurl");
            return (Criteria) this;
        }

        public Criteria andCSiteurlNotLike(String value) {
            addCriterion("C_SITEURL not like", value, "cSiteurl");
            return (Criteria) this;
        }

        public Criteria andCSiteurlIn(List<String> values) {
            addCriterion("C_SITEURL in", values, "cSiteurl");
            return (Criteria) this;
        }

        public Criteria andCSiteurlNotIn(List<String> values) {
            addCriterion("C_SITEURL not in", values, "cSiteurl");
            return (Criteria) this;
        }

        public Criteria andCSiteurlBetween(String value1, String value2) {
            addCriterion("C_SITEURL between", value1, value2, "cSiteurl");
            return (Criteria) this;
        }

        public Criteria andCSiteurlNotBetween(String value1, String value2) {
            addCriterion("C_SITEURL not between", value1, value2, "cSiteurl");
            return (Criteria) this;
        }

        public Criteria andCIsopenIsNull() {
            addCriterion("C_ISOPEN is null");
            return (Criteria) this;
        }

        public Criteria andCIsopenIsNotNull() {
            addCriterion("C_ISOPEN is not null");
            return (Criteria) this;
        }

        public Criteria andCIsopenEqualTo(String value) {
            addCriterion("C_ISOPEN =", value, "cIsopen");
            return (Criteria) this;
        }

        public Criteria andCIsopenNotEqualTo(String value) {
            addCriterion("C_ISOPEN <>", value, "cIsopen");
            return (Criteria) this;
        }

        public Criteria andCIsopenGreaterThan(String value) {
            addCriterion("C_ISOPEN >", value, "cIsopen");
            return (Criteria) this;
        }

        public Criteria andCIsopenGreaterThanOrEqualTo(String value) {
            addCriterion("C_ISOPEN >=", value, "cIsopen");
            return (Criteria) this;
        }

        public Criteria andCIsopenLessThan(String value) {
            addCriterion("C_ISOPEN <", value, "cIsopen");
            return (Criteria) this;
        }

        public Criteria andCIsopenLessThanOrEqualTo(String value) {
            addCriterion("C_ISOPEN <=", value, "cIsopen");
            return (Criteria) this;
        }

        public Criteria andCIsopenLike(String value) {
            addCriterion("C_ISOPEN like", value, "cIsopen");
            return (Criteria) this;
        }

        public Criteria andCIsopenNotLike(String value) {
            addCriterion("C_ISOPEN not like", value, "cIsopen");
            return (Criteria) this;
        }

        public Criteria andCIsopenIn(List<String> values) {
            addCriterion("C_ISOPEN in", values, "cIsopen");
            return (Criteria) this;
        }

        public Criteria andCIsopenNotIn(List<String> values) {
            addCriterion("C_ISOPEN not in", values, "cIsopen");
            return (Criteria) this;
        }

        public Criteria andCIsopenBetween(String value1, String value2) {
            addCriterion("C_ISOPEN between", value1, value2, "cIsopen");
            return (Criteria) this;
        }

        public Criteria andCIsopenNotBetween(String value1, String value2) {
            addCriterion("C_ISOPEN not between", value1, value2, "cIsopen");
            return (Criteria) this;
        }

        public Criteria andCClosewordIsNull() {
            addCriterion("C_CLOSEWORD is null");
            return (Criteria) this;
        }

        public Criteria andCClosewordIsNotNull() {
            addCriterion("C_CLOSEWORD is not null");
            return (Criteria) this;
        }

        public Criteria andCClosewordEqualTo(String value) {
            addCriterion("C_CLOSEWORD =", value, "cCloseword");
            return (Criteria) this;
        }

        public Criteria andCClosewordNotEqualTo(String value) {
            addCriterion("C_CLOSEWORD <>", value, "cCloseword");
            return (Criteria) this;
        }

        public Criteria andCClosewordGreaterThan(String value) {
            addCriterion("C_CLOSEWORD >", value, "cCloseword");
            return (Criteria) this;
        }

        public Criteria andCClosewordGreaterThanOrEqualTo(String value) {
            addCriterion("C_CLOSEWORD >=", value, "cCloseword");
            return (Criteria) this;
        }

        public Criteria andCClosewordLessThan(String value) {
            addCriterion("C_CLOSEWORD <", value, "cCloseword");
            return (Criteria) this;
        }

        public Criteria andCClosewordLessThanOrEqualTo(String value) {
            addCriterion("C_CLOSEWORD <=", value, "cCloseword");
            return (Criteria) this;
        }

        public Criteria andCClosewordLike(String value) {
            addCriterion("C_CLOSEWORD like", value, "cCloseword");
            return (Criteria) this;
        }

        public Criteria andCClosewordNotLike(String value) {
            addCriterion("C_CLOSEWORD not like", value, "cCloseword");
            return (Criteria) this;
        }

        public Criteria andCClosewordIn(List<String> values) {
            addCriterion("C_CLOSEWORD in", values, "cCloseword");
            return (Criteria) this;
        }

        public Criteria andCClosewordNotIn(List<String> values) {
            addCriterion("C_CLOSEWORD not in", values, "cCloseword");
            return (Criteria) this;
        }

        public Criteria andCClosewordBetween(String value1, String value2) {
            addCriterion("C_CLOSEWORD between", value1, value2, "cCloseword");
            return (Criteria) this;
        }

        public Criteria andCClosewordNotBetween(String value1, String value2) {
            addCriterion("C_CLOSEWORD not between", value1, value2, "cCloseword");
            return (Criteria) this;
        }

        public Criteria andCopyrightIsNull() {
            addCriterion("COPYRIGHT is null");
            return (Criteria) this;
        }

        public Criteria andCopyrightIsNotNull() {
            addCriterion("COPYRIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andCopyrightEqualTo(String value) {
            addCriterion("COPYRIGHT =", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotEqualTo(String value) {
            addCriterion("COPYRIGHT <>", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThan(String value) {
            addCriterion("COPYRIGHT >", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThanOrEqualTo(String value) {
            addCriterion("COPYRIGHT >=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThan(String value) {
            addCriterion("COPYRIGHT <", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThanOrEqualTo(String value) {
            addCriterion("COPYRIGHT <=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLike(String value) {
            addCriterion("COPYRIGHT like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotLike(String value) {
            addCriterion("COPYRIGHT not like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightIn(List<String> values) {
            addCriterion("COPYRIGHT in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotIn(List<String> values) {
            addCriterion("COPYRIGHT not in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightBetween(String value1, String value2) {
            addCriterion("COPYRIGHT between", value1, value2, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotBetween(String value1, String value2) {
            addCriterion("COPYRIGHT not between", value1, value2, "copyright");
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