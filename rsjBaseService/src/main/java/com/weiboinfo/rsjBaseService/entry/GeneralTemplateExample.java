package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class GeneralTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GeneralTemplateExample() {
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

        public Criteria andIndextemplateIsNull() {
            addCriterion("INDEXTEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andIndextemplateIsNotNull() {
            addCriterion("INDEXTEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andIndextemplateEqualTo(String value) {
            addCriterion("INDEXTEMPLATE =", value, "indextemplate");
            return (Criteria) this;
        }

        public Criteria andIndextemplateNotEqualTo(String value) {
            addCriterion("INDEXTEMPLATE <>", value, "indextemplate");
            return (Criteria) this;
        }

        public Criteria andIndextemplateGreaterThan(String value) {
            addCriterion("INDEXTEMPLATE >", value, "indextemplate");
            return (Criteria) this;
        }

        public Criteria andIndextemplateGreaterThanOrEqualTo(String value) {
            addCriterion("INDEXTEMPLATE >=", value, "indextemplate");
            return (Criteria) this;
        }

        public Criteria andIndextemplateLessThan(String value) {
            addCriterion("INDEXTEMPLATE <", value, "indextemplate");
            return (Criteria) this;
        }

        public Criteria andIndextemplateLessThanOrEqualTo(String value) {
            addCriterion("INDEXTEMPLATE <=", value, "indextemplate");
            return (Criteria) this;
        }

        public Criteria andIndextemplateLike(String value) {
            addCriterion("INDEXTEMPLATE like", value, "indextemplate");
            return (Criteria) this;
        }

        public Criteria andIndextemplateNotLike(String value) {
            addCriterion("INDEXTEMPLATE not like", value, "indextemplate");
            return (Criteria) this;
        }

        public Criteria andIndextemplateIn(List<String> values) {
            addCriterion("INDEXTEMPLATE in", values, "indextemplate");
            return (Criteria) this;
        }

        public Criteria andIndextemplateNotIn(List<String> values) {
            addCriterion("INDEXTEMPLATE not in", values, "indextemplate");
            return (Criteria) this;
        }

        public Criteria andIndextemplateBetween(String value1, String value2) {
            addCriterion("INDEXTEMPLATE between", value1, value2, "indextemplate");
            return (Criteria) this;
        }

        public Criteria andIndextemplateNotBetween(String value1, String value2) {
            addCriterion("INDEXTEMPLATE not between", value1, value2, "indextemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateIsNull() {
            addCriterion("LISTTEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andListtemplateIsNotNull() {
            addCriterion("LISTTEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andListtemplateEqualTo(String value) {
            addCriterion("LISTTEMPLATE =", value, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateNotEqualTo(String value) {
            addCriterion("LISTTEMPLATE <>", value, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateGreaterThan(String value) {
            addCriterion("LISTTEMPLATE >", value, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateGreaterThanOrEqualTo(String value) {
            addCriterion("LISTTEMPLATE >=", value, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateLessThan(String value) {
            addCriterion("LISTTEMPLATE <", value, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateLessThanOrEqualTo(String value) {
            addCriterion("LISTTEMPLATE <=", value, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateLike(String value) {
            addCriterion("LISTTEMPLATE like", value, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateNotLike(String value) {
            addCriterion("LISTTEMPLATE not like", value, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateIn(List<String> values) {
            addCriterion("LISTTEMPLATE in", values, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateNotIn(List<String> values) {
            addCriterion("LISTTEMPLATE not in", values, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateBetween(String value1, String value2) {
            addCriterion("LISTTEMPLATE between", value1, value2, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateNotBetween(String value1, String value2) {
            addCriterion("LISTTEMPLATE not between", value1, value2, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateIsNull() {
            addCriterion("DETAILTEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateIsNotNull() {
            addCriterion("DETAILTEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateEqualTo(String value) {
            addCriterion("DETAILTEMPLATE =", value, "detailtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateNotEqualTo(String value) {
            addCriterion("DETAILTEMPLATE <>", value, "detailtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateGreaterThan(String value) {
            addCriterion("DETAILTEMPLATE >", value, "detailtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateGreaterThanOrEqualTo(String value) {
            addCriterion("DETAILTEMPLATE >=", value, "detailtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateLessThan(String value) {
            addCriterion("DETAILTEMPLATE <", value, "detailtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateLessThanOrEqualTo(String value) {
            addCriterion("DETAILTEMPLATE <=", value, "detailtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateLike(String value) {
            addCriterion("DETAILTEMPLATE like", value, "detailtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateNotLike(String value) {
            addCriterion("DETAILTEMPLATE not like", value, "detailtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateIn(List<String> values) {
            addCriterion("DETAILTEMPLATE in", values, "detailtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateNotIn(List<String> values) {
            addCriterion("DETAILTEMPLATE not in", values, "detailtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateBetween(String value1, String value2) {
            addCriterion("DETAILTEMPLATE between", value1, value2, "detailtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateNotBetween(String value1, String value2) {
            addCriterion("DETAILTEMPLATE not between", value1, value2, "detailtemplate");
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