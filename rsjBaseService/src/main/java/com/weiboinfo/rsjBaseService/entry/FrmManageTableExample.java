package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class FrmManageTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrmManageTableExample() {
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

        public Criteria andTableidIsNull() {
            addCriterion("TABLEID is null");
            return (Criteria) this;
        }

        public Criteria andTableidIsNotNull() {
            addCriterion("TABLEID is not null");
            return (Criteria) this;
        }

        public Criteria andTableidEqualTo(String value) {
            addCriterion("TABLEID =", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotEqualTo(String value) {
            addCriterion("TABLEID <>", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidGreaterThan(String value) {
            addCriterion("TABLEID >", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidGreaterThanOrEqualTo(String value) {
            addCriterion("TABLEID >=", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidLessThan(String value) {
            addCriterion("TABLEID <", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidLessThanOrEqualTo(String value) {
            addCriterion("TABLEID <=", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidLike(String value) {
            addCriterion("TABLEID like", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotLike(String value) {
            addCriterion("TABLEID not like", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidIn(List<String> values) {
            addCriterion("TABLEID in", values, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotIn(List<String> values) {
            addCriterion("TABLEID not in", values, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidBetween(String value1, String value2) {
            addCriterion("TABLEID between", value1, value2, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotBetween(String value1, String value2) {
            addCriterion("TABLEID not between", value1, value2, "tableid");
            return (Criteria) this;
        }

        public Criteria andTablexsztIsNull() {
            addCriterion("TABLEXSZT is null");
            return (Criteria) this;
        }

        public Criteria andTablexsztIsNotNull() {
            addCriterion("TABLEXSZT is not null");
            return (Criteria) this;
        }

        public Criteria andTablexsztEqualTo(String value) {
            addCriterion("TABLEXSZT =", value, "tablexszt");
            return (Criteria) this;
        }

        public Criteria andTablexsztNotEqualTo(String value) {
            addCriterion("TABLEXSZT <>", value, "tablexszt");
            return (Criteria) this;
        }

        public Criteria andTablexsztGreaterThan(String value) {
            addCriterion("TABLEXSZT >", value, "tablexszt");
            return (Criteria) this;
        }

        public Criteria andTablexsztGreaterThanOrEqualTo(String value) {
            addCriterion("TABLEXSZT >=", value, "tablexszt");
            return (Criteria) this;
        }

        public Criteria andTablexsztLessThan(String value) {
            addCriterion("TABLEXSZT <", value, "tablexszt");
            return (Criteria) this;
        }

        public Criteria andTablexsztLessThanOrEqualTo(String value) {
            addCriterion("TABLEXSZT <=", value, "tablexszt");
            return (Criteria) this;
        }

        public Criteria andTablexsztLike(String value) {
            addCriterion("TABLEXSZT like", value, "tablexszt");
            return (Criteria) this;
        }

        public Criteria andTablexsztNotLike(String value) {
            addCriterion("TABLEXSZT not like", value, "tablexszt");
            return (Criteria) this;
        }

        public Criteria andTablexsztIn(List<String> values) {
            addCriterion("TABLEXSZT in", values, "tablexszt");
            return (Criteria) this;
        }

        public Criteria andTablexsztNotIn(List<String> values) {
            addCriterion("TABLEXSZT not in", values, "tablexszt");
            return (Criteria) this;
        }

        public Criteria andTablexsztBetween(String value1, String value2) {
            addCriterion("TABLEXSZT between", value1, value2, "tablexszt");
            return (Criteria) this;
        }

        public Criteria andTablexsztNotBetween(String value1, String value2) {
            addCriterion("TABLEXSZT not between", value1, value2, "tablexszt");
            return (Criteria) this;
        }

        public Criteria andTablefieldIsNull() {
            addCriterion("TABLEFIELD is null");
            return (Criteria) this;
        }

        public Criteria andTablefieldIsNotNull() {
            addCriterion("TABLEFIELD is not null");
            return (Criteria) this;
        }

        public Criteria andTablefieldEqualTo(String value) {
            addCriterion("TABLEFIELD =", value, "tablefield");
            return (Criteria) this;
        }

        public Criteria andTablefieldNotEqualTo(String value) {
            addCriterion("TABLEFIELD <>", value, "tablefield");
            return (Criteria) this;
        }

        public Criteria andTablefieldGreaterThan(String value) {
            addCriterion("TABLEFIELD >", value, "tablefield");
            return (Criteria) this;
        }

        public Criteria andTablefieldGreaterThanOrEqualTo(String value) {
            addCriterion("TABLEFIELD >=", value, "tablefield");
            return (Criteria) this;
        }

        public Criteria andTablefieldLessThan(String value) {
            addCriterion("TABLEFIELD <", value, "tablefield");
            return (Criteria) this;
        }

        public Criteria andTablefieldLessThanOrEqualTo(String value) {
            addCriterion("TABLEFIELD <=", value, "tablefield");
            return (Criteria) this;
        }

        public Criteria andTablefieldLike(String value) {
            addCriterion("TABLEFIELD like", value, "tablefield");
            return (Criteria) this;
        }

        public Criteria andTablefieldNotLike(String value) {
            addCriterion("TABLEFIELD not like", value, "tablefield");
            return (Criteria) this;
        }

        public Criteria andTablefieldIn(List<String> values) {
            addCriterion("TABLEFIELD in", values, "tablefield");
            return (Criteria) this;
        }

        public Criteria andTablefieldNotIn(List<String> values) {
            addCriterion("TABLEFIELD not in", values, "tablefield");
            return (Criteria) this;
        }

        public Criteria andTablefieldBetween(String value1, String value2) {
            addCriterion("TABLEFIELD between", value1, value2, "tablefield");
            return (Criteria) this;
        }

        public Criteria andTablefieldNotBetween(String value1, String value2) {
            addCriterion("TABLEFIELD not between", value1, value2, "tablefield");
            return (Criteria) this;
        }

        public Criteria andTablenameIsNull() {
            addCriterion("TABLENAME is null");
            return (Criteria) this;
        }

        public Criteria andTablenameIsNotNull() {
            addCriterion("TABLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andTablenameEqualTo(String value) {
            addCriterion("TABLENAME =", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotEqualTo(String value) {
            addCriterion("TABLENAME <>", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameGreaterThan(String value) {
            addCriterion("TABLENAME >", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameGreaterThanOrEqualTo(String value) {
            addCriterion("TABLENAME >=", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLessThan(String value) {
            addCriterion("TABLENAME <", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLessThanOrEqualTo(String value) {
            addCriterion("TABLENAME <=", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLike(String value) {
            addCriterion("TABLENAME like", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotLike(String value) {
            addCriterion("TABLENAME not like", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameIn(List<String> values) {
            addCriterion("TABLENAME in", values, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotIn(List<String> values) {
            addCriterion("TABLENAME not in", values, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameBetween(String value1, String value2) {
            addCriterion("TABLENAME between", value1, value2, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotBetween(String value1, String value2) {
            addCriterion("TABLENAME not between", value1, value2, "tablename");
            return (Criteria) this;
        }

        public Criteria andTableindexIsNull() {
            addCriterion("TABLEINDEX is null");
            return (Criteria) this;
        }

        public Criteria andTableindexIsNotNull() {
            addCriterion("TABLEINDEX is not null");
            return (Criteria) this;
        }

        public Criteria andTableindexEqualTo(Long value) {
            addCriterion("TABLEINDEX =", value, "tableindex");
            return (Criteria) this;
        }

        public Criteria andTableindexNotEqualTo(Long value) {
            addCriterion("TABLEINDEX <>", value, "tableindex");
            return (Criteria) this;
        }

        public Criteria andTableindexGreaterThan(Long value) {
            addCriterion("TABLEINDEX >", value, "tableindex");
            return (Criteria) this;
        }

        public Criteria andTableindexGreaterThanOrEqualTo(Long value) {
            addCriterion("TABLEINDEX >=", value, "tableindex");
            return (Criteria) this;
        }

        public Criteria andTableindexLessThan(Long value) {
            addCriterion("TABLEINDEX <", value, "tableindex");
            return (Criteria) this;
        }

        public Criteria andTableindexLessThanOrEqualTo(Long value) {
            addCriterion("TABLEINDEX <=", value, "tableindex");
            return (Criteria) this;
        }

        public Criteria andTableindexIn(List<Long> values) {
            addCriterion("TABLEINDEX in", values, "tableindex");
            return (Criteria) this;
        }

        public Criteria andTableindexNotIn(List<Long> values) {
            addCriterion("TABLEINDEX not in", values, "tableindex");
            return (Criteria) this;
        }

        public Criteria andTableindexBetween(Long value1, Long value2) {
            addCriterion("TABLEINDEX between", value1, value2, "tableindex");
            return (Criteria) this;
        }

        public Criteria andTableindexNotBetween(Long value1, Long value2) {
            addCriterion("TABLEINDEX not between", value1, value2, "tableindex");
            return (Criteria) this;
        }

        public Criteria andTableurlIsNull() {
            addCriterion("TABLEURL is null");
            return (Criteria) this;
        }

        public Criteria andTableurlIsNotNull() {
            addCriterion("TABLEURL is not null");
            return (Criteria) this;
        }

        public Criteria andTableurlEqualTo(String value) {
            addCriterion("TABLEURL =", value, "tableurl");
            return (Criteria) this;
        }

        public Criteria andTableurlNotEqualTo(String value) {
            addCriterion("TABLEURL <>", value, "tableurl");
            return (Criteria) this;
        }

        public Criteria andTableurlGreaterThan(String value) {
            addCriterion("TABLEURL >", value, "tableurl");
            return (Criteria) this;
        }

        public Criteria andTableurlGreaterThanOrEqualTo(String value) {
            addCriterion("TABLEURL >=", value, "tableurl");
            return (Criteria) this;
        }

        public Criteria andTableurlLessThan(String value) {
            addCriterion("TABLEURL <", value, "tableurl");
            return (Criteria) this;
        }

        public Criteria andTableurlLessThanOrEqualTo(String value) {
            addCriterion("TABLEURL <=", value, "tableurl");
            return (Criteria) this;
        }

        public Criteria andTableurlLike(String value) {
            addCriterion("TABLEURL like", value, "tableurl");
            return (Criteria) this;
        }

        public Criteria andTableurlNotLike(String value) {
            addCriterion("TABLEURL not like", value, "tableurl");
            return (Criteria) this;
        }

        public Criteria andTableurlIn(List<String> values) {
            addCriterion("TABLEURL in", values, "tableurl");
            return (Criteria) this;
        }

        public Criteria andTableurlNotIn(List<String> values) {
            addCriterion("TABLEURL not in", values, "tableurl");
            return (Criteria) this;
        }

        public Criteria andTableurlBetween(String value1, String value2) {
            addCriterion("TABLEURL between", value1, value2, "tableurl");
            return (Criteria) this;
        }

        public Criteria andTableurlNotBetween(String value1, String value2) {
            addCriterion("TABLEURL not between", value1, value2, "tableurl");
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