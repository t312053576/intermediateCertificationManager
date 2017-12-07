package com.weiboinfo.rsjBaseService.entry;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VisitCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VisitCategoryExample() {
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

        public Criteria andCatenameIsNull() {
            addCriterion("CATENAME is null");
            return (Criteria) this;
        }

        public Criteria andCatenameIsNotNull() {
            addCriterion("CATENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCatenameEqualTo(String value) {
            addCriterion("CATENAME =", value, "catename");
            return (Criteria) this;
        }

        public Criteria andCatenameNotEqualTo(String value) {
            addCriterion("CATENAME <>", value, "catename");
            return (Criteria) this;
        }

        public Criteria andCatenameGreaterThan(String value) {
            addCriterion("CATENAME >", value, "catename");
            return (Criteria) this;
        }

        public Criteria andCatenameGreaterThanOrEqualTo(String value) {
            addCriterion("CATENAME >=", value, "catename");
            return (Criteria) this;
        }

        public Criteria andCatenameLessThan(String value) {
            addCriterion("CATENAME <", value, "catename");
            return (Criteria) this;
        }

        public Criteria andCatenameLessThanOrEqualTo(String value) {
            addCriterion("CATENAME <=", value, "catename");
            return (Criteria) this;
        }

        public Criteria andCatenameLike(String value) {
            addCriterion("CATENAME like", value, "catename");
            return (Criteria) this;
        }

        public Criteria andCatenameNotLike(String value) {
            addCriterion("CATENAME not like", value, "catename");
            return (Criteria) this;
        }

        public Criteria andCatenameIn(List<String> values) {
            addCriterion("CATENAME in", values, "catename");
            return (Criteria) this;
        }

        public Criteria andCatenameNotIn(List<String> values) {
            addCriterion("CATENAME not in", values, "catename");
            return (Criteria) this;
        }

        public Criteria andCatenameBetween(String value1, String value2) {
            addCriterion("CATENAME between", value1, value2, "catename");
            return (Criteria) this;
        }

        public Criteria andCatenameNotBetween(String value1, String value2) {
            addCriterion("CATENAME not between", value1, value2, "catename");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("PARENTID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("PARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("PARENTID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("PARENTID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("PARENTID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("PARENTID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("PARENTID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("PARENTID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("PARENTID like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("PARENTID not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("PARENTID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("PARENTID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("PARENTID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("PARENTID not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andCatemarkIsNull() {
            addCriterion("CATEMARK is null");
            return (Criteria) this;
        }

        public Criteria andCatemarkIsNotNull() {
            addCriterion("CATEMARK is not null");
            return (Criteria) this;
        }

        public Criteria andCatemarkEqualTo(String value) {
            addCriterion("CATEMARK =", value, "catemark");
            return (Criteria) this;
        }

        public Criteria andCatemarkNotEqualTo(String value) {
            addCriterion("CATEMARK <>", value, "catemark");
            return (Criteria) this;
        }

        public Criteria andCatemarkGreaterThan(String value) {
            addCriterion("CATEMARK >", value, "catemark");
            return (Criteria) this;
        }

        public Criteria andCatemarkGreaterThanOrEqualTo(String value) {
            addCriterion("CATEMARK >=", value, "catemark");
            return (Criteria) this;
        }

        public Criteria andCatemarkLessThan(String value) {
            addCriterion("CATEMARK <", value, "catemark");
            return (Criteria) this;
        }

        public Criteria andCatemarkLessThanOrEqualTo(String value) {
            addCriterion("CATEMARK <=", value, "catemark");
            return (Criteria) this;
        }

        public Criteria andCatemarkLike(String value) {
            addCriterion("CATEMARK like", value, "catemark");
            return (Criteria) this;
        }

        public Criteria andCatemarkNotLike(String value) {
            addCriterion("CATEMARK not like", value, "catemark");
            return (Criteria) this;
        }

        public Criteria andCatemarkIn(List<String> values) {
            addCriterion("CATEMARK in", values, "catemark");
            return (Criteria) this;
        }

        public Criteria andCatemarkNotIn(List<String> values) {
            addCriterion("CATEMARK not in", values, "catemark");
            return (Criteria) this;
        }

        public Criteria andCatemarkBetween(String value1, String value2) {
            addCriterion("CATEMARK between", value1, value2, "catemark");
            return (Criteria) this;
        }

        public Criteria andCatemarkNotBetween(String value1, String value2) {
            addCriterion("CATEMARK not between", value1, value2, "catemark");
            return (Criteria) this;
        }

        public Criteria andOrderbyIsNull() {
            addCriterion("ORDERBY is null");
            return (Criteria) this;
        }

        public Criteria andOrderbyIsNotNull() {
            addCriterion("ORDERBY is not null");
            return (Criteria) this;
        }

        public Criteria andOrderbyEqualTo(BigDecimal value) {
            addCriterion("ORDERBY =", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotEqualTo(BigDecimal value) {
            addCriterion("ORDERBY <>", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyGreaterThan(BigDecimal value) {
            addCriterion("ORDERBY >", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDERBY >=", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyLessThan(BigDecimal value) {
            addCriterion("ORDERBY <", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDERBY <=", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyIn(List<BigDecimal> values) {
            addCriterion("ORDERBY in", values, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotIn(List<BigDecimal> values) {
            addCriterion("ORDERBY not in", values, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDERBY between", value1, value2, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDERBY not between", value1, value2, "orderby");
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