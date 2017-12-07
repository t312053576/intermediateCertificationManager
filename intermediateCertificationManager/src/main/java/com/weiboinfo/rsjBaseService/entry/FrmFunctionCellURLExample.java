package com.weiboinfo.rsjBaseService.entry;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FrmFunctionCellURLExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrmFunctionCellURLExample() {
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

        public Criteria andFuceurlidIsNull() {
            addCriterion("FUCEURLID is null");
            return (Criteria) this;
        }

        public Criteria andFuceurlidIsNotNull() {
            addCriterion("FUCEURLID is not null");
            return (Criteria) this;
        }

        public Criteria andFuceurlidEqualTo(String value) {
            addCriterion("FUCEURLID =", value, "fuceurlid");
            return (Criteria) this;
        }

        public Criteria andFuceurlidNotEqualTo(String value) {
            addCriterion("FUCEURLID <>", value, "fuceurlid");
            return (Criteria) this;
        }

        public Criteria andFuceurlidGreaterThan(String value) {
            addCriterion("FUCEURLID >", value, "fuceurlid");
            return (Criteria) this;
        }

        public Criteria andFuceurlidGreaterThanOrEqualTo(String value) {
            addCriterion("FUCEURLID >=", value, "fuceurlid");
            return (Criteria) this;
        }

        public Criteria andFuceurlidLessThan(String value) {
            addCriterion("FUCEURLID <", value, "fuceurlid");
            return (Criteria) this;
        }

        public Criteria andFuceurlidLessThanOrEqualTo(String value) {
            addCriterion("FUCEURLID <=", value, "fuceurlid");
            return (Criteria) this;
        }

        public Criteria andFuceurlidLike(String value) {
            addCriterion("FUCEURLID like", value, "fuceurlid");
            return (Criteria) this;
        }

        public Criteria andFuceurlidNotLike(String value) {
            addCriterion("FUCEURLID not like", value, "fuceurlid");
            return (Criteria) this;
        }

        public Criteria andFuceurlidIn(List<String> values) {
            addCriterion("FUCEURLID in", values, "fuceurlid");
            return (Criteria) this;
        }

        public Criteria andFuceurlidNotIn(List<String> values) {
            addCriterion("FUCEURLID not in", values, "fuceurlid");
            return (Criteria) this;
        }

        public Criteria andFuceurlidBetween(String value1, String value2) {
            addCriterion("FUCEURLID between", value1, value2, "fuceurlid");
            return (Criteria) this;
        }

        public Criteria andFuceurlidNotBetween(String value1, String value2) {
            addCriterion("FUCEURLID not between", value1, value2, "fuceurlid");
            return (Criteria) this;
        }

        public Criteria andFucecodeIsNull() {
            addCriterion("FUCECODE is null");
            return (Criteria) this;
        }

        public Criteria andFucecodeIsNotNull() {
            addCriterion("FUCECODE is not null");
            return (Criteria) this;
        }

        public Criteria andFucecodeEqualTo(String value) {
            addCriterion("FUCECODE =", value, "fucecode");
            return (Criteria) this;
        }

        public Criteria andFucecodeNotEqualTo(String value) {
            addCriterion("FUCECODE <>", value, "fucecode");
            return (Criteria) this;
        }

        public Criteria andFucecodeGreaterThan(String value) {
            addCriterion("FUCECODE >", value, "fucecode");
            return (Criteria) this;
        }

        public Criteria andFucecodeGreaterThanOrEqualTo(String value) {
            addCriterion("FUCECODE >=", value, "fucecode");
            return (Criteria) this;
        }

        public Criteria andFucecodeLessThan(String value) {
            addCriterion("FUCECODE <", value, "fucecode");
            return (Criteria) this;
        }

        public Criteria andFucecodeLessThanOrEqualTo(String value) {
            addCriterion("FUCECODE <=", value, "fucecode");
            return (Criteria) this;
        }

        public Criteria andFucecodeLike(String value) {
            addCriterion("FUCECODE like", value, "fucecode");
            return (Criteria) this;
        }

        public Criteria andFucecodeNotLike(String value) {
            addCriterion("FUCECODE not like", value, "fucecode");
            return (Criteria) this;
        }

        public Criteria andFucecodeIn(List<String> values) {
            addCriterion("FUCECODE in", values, "fucecode");
            return (Criteria) this;
        }

        public Criteria andFucecodeNotIn(List<String> values) {
            addCriterion("FUCECODE not in", values, "fucecode");
            return (Criteria) this;
        }

        public Criteria andFucecodeBetween(String value1, String value2) {
            addCriterion("FUCECODE between", value1, value2, "fucecode");
            return (Criteria) this;
        }

        public Criteria andFucecodeNotBetween(String value1, String value2) {
            addCriterion("FUCECODE not between", value1, value2, "fucecode");
            return (Criteria) this;
        }

        public Criteria andFuceurlnameIsNull() {
            addCriterion("FUCEURLNAME is null");
            return (Criteria) this;
        }

        public Criteria andFuceurlnameIsNotNull() {
            addCriterion("FUCEURLNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFuceurlnameEqualTo(String value) {
            addCriterion("FUCEURLNAME =", value, "fuceurlname");
            return (Criteria) this;
        }

        public Criteria andFuceurlnameNotEqualTo(String value) {
            addCriterion("FUCEURLNAME <>", value, "fuceurlname");
            return (Criteria) this;
        }

        public Criteria andFuceurlnameGreaterThan(String value) {
            addCriterion("FUCEURLNAME >", value, "fuceurlname");
            return (Criteria) this;
        }

        public Criteria andFuceurlnameGreaterThanOrEqualTo(String value) {
            addCriterion("FUCEURLNAME >=", value, "fuceurlname");
            return (Criteria) this;
        }

        public Criteria andFuceurlnameLessThan(String value) {
            addCriterion("FUCEURLNAME <", value, "fuceurlname");
            return (Criteria) this;
        }

        public Criteria andFuceurlnameLessThanOrEqualTo(String value) {
            addCriterion("FUCEURLNAME <=", value, "fuceurlname");
            return (Criteria) this;
        }

        public Criteria andFuceurlnameLike(String value) {
            addCriterion("FUCEURLNAME like", value, "fuceurlname");
            return (Criteria) this;
        }

        public Criteria andFuceurlnameNotLike(String value) {
            addCriterion("FUCEURLNAME not like", value, "fuceurlname");
            return (Criteria) this;
        }

        public Criteria andFuceurlnameIn(List<String> values) {
            addCriterion("FUCEURLNAME in", values, "fuceurlname");
            return (Criteria) this;
        }

        public Criteria andFuceurlnameNotIn(List<String> values) {
            addCriterion("FUCEURLNAME not in", values, "fuceurlname");
            return (Criteria) this;
        }

        public Criteria andFuceurlnameBetween(String value1, String value2) {
            addCriterion("FUCEURLNAME between", value1, value2, "fuceurlname");
            return (Criteria) this;
        }

        public Criteria andFuceurlnameNotBetween(String value1, String value2) {
            addCriterion("FUCEURLNAME not between", value1, value2, "fuceurlname");
            return (Criteria) this;
        }

        public Criteria andFuceurldescIsNull() {
            addCriterion("FUCEURLDESC is null");
            return (Criteria) this;
        }

        public Criteria andFuceurldescIsNotNull() {
            addCriterion("FUCEURLDESC is not null");
            return (Criteria) this;
        }

        public Criteria andFuceurldescEqualTo(String value) {
            addCriterion("FUCEURLDESC =", value, "fuceurldesc");
            return (Criteria) this;
        }

        public Criteria andFuceurldescNotEqualTo(String value) {
            addCriterion("FUCEURLDESC <>", value, "fuceurldesc");
            return (Criteria) this;
        }

        public Criteria andFuceurldescGreaterThan(String value) {
            addCriterion("FUCEURLDESC >", value, "fuceurldesc");
            return (Criteria) this;
        }

        public Criteria andFuceurldescGreaterThanOrEqualTo(String value) {
            addCriterion("FUCEURLDESC >=", value, "fuceurldesc");
            return (Criteria) this;
        }

        public Criteria andFuceurldescLessThan(String value) {
            addCriterion("FUCEURLDESC <", value, "fuceurldesc");
            return (Criteria) this;
        }

        public Criteria andFuceurldescLessThanOrEqualTo(String value) {
            addCriterion("FUCEURLDESC <=", value, "fuceurldesc");
            return (Criteria) this;
        }

        public Criteria andFuceurldescLike(String value) {
            addCriterion("FUCEURLDESC like", value, "fuceurldesc");
            return (Criteria) this;
        }

        public Criteria andFuceurldescNotLike(String value) {
            addCriterion("FUCEURLDESC not like", value, "fuceurldesc");
            return (Criteria) this;
        }

        public Criteria andFuceurldescIn(List<String> values) {
            addCriterion("FUCEURLDESC in", values, "fuceurldesc");
            return (Criteria) this;
        }

        public Criteria andFuceurldescNotIn(List<String> values) {
            addCriterion("FUCEURLDESC not in", values, "fuceurldesc");
            return (Criteria) this;
        }

        public Criteria andFuceurldescBetween(String value1, String value2) {
            addCriterion("FUCEURLDESC between", value1, value2, "fuceurldesc");
            return (Criteria) this;
        }

        public Criteria andFuceurldescNotBetween(String value1, String value2) {
            addCriterion("FUCEURLDESC not between", value1, value2, "fuceurldesc");
            return (Criteria) this;
        }

        public Criteria andFuceurlresourceIsNull() {
            addCriterion("FUCEURLRESOURCE is null");
            return (Criteria) this;
        }

        public Criteria andFuceurlresourceIsNotNull() {
            addCriterion("FUCEURLRESOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andFuceurlresourceEqualTo(String value) {
            addCriterion("FUCEURLRESOURCE =", value, "fuceurlresource");
            return (Criteria) this;
        }

        public Criteria andFuceurlresourceNotEqualTo(String value) {
            addCriterion("FUCEURLRESOURCE <>", value, "fuceurlresource");
            return (Criteria) this;
        }

        public Criteria andFuceurlresourceGreaterThan(String value) {
            addCriterion("FUCEURLRESOURCE >", value, "fuceurlresource");
            return (Criteria) this;
        }

        public Criteria andFuceurlresourceGreaterThanOrEqualTo(String value) {
            addCriterion("FUCEURLRESOURCE >=", value, "fuceurlresource");
            return (Criteria) this;
        }

        public Criteria andFuceurlresourceLessThan(String value) {
            addCriterion("FUCEURLRESOURCE <", value, "fuceurlresource");
            return (Criteria) this;
        }

        public Criteria andFuceurlresourceLessThanOrEqualTo(String value) {
            addCriterion("FUCEURLRESOURCE <=", value, "fuceurlresource");
            return (Criteria) this;
        }

        public Criteria andFuceurlresourceLike(String value) {
            addCriterion("FUCEURLRESOURCE like", value, "fuceurlresource");
            return (Criteria) this;
        }

        public Criteria andFuceurlresourceNotLike(String value) {
            addCriterion("FUCEURLRESOURCE not like", value, "fuceurlresource");
            return (Criteria) this;
        }

        public Criteria andFuceurlresourceIn(List<String> values) {
            addCriterion("FUCEURLRESOURCE in", values, "fuceurlresource");
            return (Criteria) this;
        }

        public Criteria andFuceurlresourceNotIn(List<String> values) {
            addCriterion("FUCEURLRESOURCE not in", values, "fuceurlresource");
            return (Criteria) this;
        }

        public Criteria andFuceurlresourceBetween(String value1, String value2) {
            addCriterion("FUCEURLRESOURCE between", value1, value2, "fuceurlresource");
            return (Criteria) this;
        }

        public Criteria andFuceurlresourceNotBetween(String value1, String value2) {
            addCriterion("FUCEURLRESOURCE not between", value1, value2, "fuceurlresource");
            return (Criteria) this;
        }

        public Criteria andPageidIsNull() {
            addCriterion("PAGEID is null");
            return (Criteria) this;
        }

        public Criteria andPageidIsNotNull() {
            addCriterion("PAGEID is not null");
            return (Criteria) this;
        }

        public Criteria andPageidEqualTo(BigDecimal value) {
            addCriterion("PAGEID =", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotEqualTo(BigDecimal value) {
            addCriterion("PAGEID <>", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidGreaterThan(BigDecimal value) {
            addCriterion("PAGEID >", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAGEID >=", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidLessThan(BigDecimal value) {
            addCriterion("PAGEID <", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAGEID <=", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidIn(List<BigDecimal> values) {
            addCriterion("PAGEID in", values, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotIn(List<BigDecimal> values) {
            addCriterion("PAGEID not in", values, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAGEID between", value1, value2, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAGEID not between", value1, value2, "pageid");
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