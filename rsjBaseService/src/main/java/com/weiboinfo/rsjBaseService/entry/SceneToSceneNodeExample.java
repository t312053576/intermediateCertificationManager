package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class SceneToSceneNodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SceneToSceneNodeExample() {
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

        public Criteria andNodeidIsNull() {
            addCriterion("NODEID is null");
            return (Criteria) this;
        }

        public Criteria andNodeidIsNotNull() {
            addCriterion("NODEID is not null");
            return (Criteria) this;
        }

        public Criteria andNodeidEqualTo(String value) {
            addCriterion("NODEID =", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotEqualTo(String value) {
            addCriterion("NODEID <>", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidGreaterThan(String value) {
            addCriterion("NODEID >", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidGreaterThanOrEqualTo(String value) {
            addCriterion("NODEID >=", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLessThan(String value) {
            addCriterion("NODEID <", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLessThanOrEqualTo(String value) {
            addCriterion("NODEID <=", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLike(String value) {
            addCriterion("NODEID like", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotLike(String value) {
            addCriterion("NODEID not like", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidIn(List<String> values) {
            addCriterion("NODEID in", values, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotIn(List<String> values) {
            addCriterion("NODEID not in", values, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidBetween(String value1, String value2) {
            addCriterion("NODEID between", value1, value2, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotBetween(String value1, String value2) {
            addCriterion("NODEID not between", value1, value2, "nodeid");
            return (Criteria) this;
        }

        public Criteria andSubnodeidIsNull() {
            addCriterion("SUBNODEID is null");
            return (Criteria) this;
        }

        public Criteria andSubnodeidIsNotNull() {
            addCriterion("SUBNODEID is not null");
            return (Criteria) this;
        }

        public Criteria andSubnodeidEqualTo(String value) {
            addCriterion("SUBNODEID =", value, "subnodeid");
            return (Criteria) this;
        }

        public Criteria andSubnodeidNotEqualTo(String value) {
            addCriterion("SUBNODEID <>", value, "subnodeid");
            return (Criteria) this;
        }

        public Criteria andSubnodeidGreaterThan(String value) {
            addCriterion("SUBNODEID >", value, "subnodeid");
            return (Criteria) this;
        }

        public Criteria andSubnodeidGreaterThanOrEqualTo(String value) {
            addCriterion("SUBNODEID >=", value, "subnodeid");
            return (Criteria) this;
        }

        public Criteria andSubnodeidLessThan(String value) {
            addCriterion("SUBNODEID <", value, "subnodeid");
            return (Criteria) this;
        }

        public Criteria andSubnodeidLessThanOrEqualTo(String value) {
            addCriterion("SUBNODEID <=", value, "subnodeid");
            return (Criteria) this;
        }

        public Criteria andSubnodeidLike(String value) {
            addCriterion("SUBNODEID like", value, "subnodeid");
            return (Criteria) this;
        }

        public Criteria andSubnodeidNotLike(String value) {
            addCriterion("SUBNODEID not like", value, "subnodeid");
            return (Criteria) this;
        }

        public Criteria andSubnodeidIn(List<String> values) {
            addCriterion("SUBNODEID in", values, "subnodeid");
            return (Criteria) this;
        }

        public Criteria andSubnodeidNotIn(List<String> values) {
            addCriterion("SUBNODEID not in", values, "subnodeid");
            return (Criteria) this;
        }

        public Criteria andSubnodeidBetween(String value1, String value2) {
            addCriterion("SUBNODEID between", value1, value2, "subnodeid");
            return (Criteria) this;
        }

        public Criteria andSubnodeidNotBetween(String value1, String value2) {
            addCriterion("SUBNODEID not between", value1, value2, "subnodeid");
            return (Criteria) this;
        }

        public Criteria andSceneidIsNull() {
            addCriterion("SCENEID is null");
            return (Criteria) this;
        }

        public Criteria andSceneidIsNotNull() {
            addCriterion("SCENEID is not null");
            return (Criteria) this;
        }

        public Criteria andSceneidEqualTo(String value) {
            addCriterion("SCENEID =", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidNotEqualTo(String value) {
            addCriterion("SCENEID <>", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidGreaterThan(String value) {
            addCriterion("SCENEID >", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidGreaterThanOrEqualTo(String value) {
            addCriterion("SCENEID >=", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidLessThan(String value) {
            addCriterion("SCENEID <", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidLessThanOrEqualTo(String value) {
            addCriterion("SCENEID <=", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidLike(String value) {
            addCriterion("SCENEID like", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidNotLike(String value) {
            addCriterion("SCENEID not like", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidIn(List<String> values) {
            addCriterion("SCENEID in", values, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidNotIn(List<String> values) {
            addCriterion("SCENEID not in", values, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidBetween(String value1, String value2) {
            addCriterion("SCENEID between", value1, value2, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidNotBetween(String value1, String value2) {
            addCriterion("SCENEID not between", value1, value2, "sceneid");
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