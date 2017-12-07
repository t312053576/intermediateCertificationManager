package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class FrmRoleFunctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrmRoleFunctionExample() {
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

        public Criteria andRolefunidIsNull() {
            addCriterion("ROLEFUNID is null");
            return (Criteria) this;
        }

        public Criteria andRolefunidIsNotNull() {
            addCriterion("ROLEFUNID is not null");
            return (Criteria) this;
        }

        public Criteria andRolefunidEqualTo(String value) {
            addCriterion("ROLEFUNID =", value, "rolefunid");
            return (Criteria) this;
        }

        public Criteria andRolefunidNotEqualTo(String value) {
            addCriterion("ROLEFUNID <>", value, "rolefunid");
            return (Criteria) this;
        }

        public Criteria andRolefunidGreaterThan(String value) {
            addCriterion("ROLEFUNID >", value, "rolefunid");
            return (Criteria) this;
        }

        public Criteria andRolefunidGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEFUNID >=", value, "rolefunid");
            return (Criteria) this;
        }

        public Criteria andRolefunidLessThan(String value) {
            addCriterion("ROLEFUNID <", value, "rolefunid");
            return (Criteria) this;
        }

        public Criteria andRolefunidLessThanOrEqualTo(String value) {
            addCriterion("ROLEFUNID <=", value, "rolefunid");
            return (Criteria) this;
        }

        public Criteria andRolefunidLike(String value) {
            addCriterion("ROLEFUNID like", value, "rolefunid");
            return (Criteria) this;
        }

        public Criteria andRolefunidNotLike(String value) {
            addCriterion("ROLEFUNID not like", value, "rolefunid");
            return (Criteria) this;
        }

        public Criteria andRolefunidIn(List<String> values) {
            addCriterion("ROLEFUNID in", values, "rolefunid");
            return (Criteria) this;
        }

        public Criteria andRolefunidNotIn(List<String> values) {
            addCriterion("ROLEFUNID not in", values, "rolefunid");
            return (Criteria) this;
        }

        public Criteria andRolefunidBetween(String value1, String value2) {
            addCriterion("ROLEFUNID between", value1, value2, "rolefunid");
            return (Criteria) this;
        }

        public Criteria andRolefunidNotBetween(String value1, String value2) {
            addCriterion("ROLEFUNID not between", value1, value2, "rolefunid");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatoridIsNull() {
            addCriterion("ROLEFUNCREATORID is null");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatoridIsNotNull() {
            addCriterion("ROLEFUNCREATORID is not null");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatoridEqualTo(String value) {
            addCriterion("ROLEFUNCREATORID =", value, "rolefuncreatorid");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatoridNotEqualTo(String value) {
            addCriterion("ROLEFUNCREATORID <>", value, "rolefuncreatorid");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatoridGreaterThan(String value) {
            addCriterion("ROLEFUNCREATORID >", value, "rolefuncreatorid");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatoridGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEFUNCREATORID >=", value, "rolefuncreatorid");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatoridLessThan(String value) {
            addCriterion("ROLEFUNCREATORID <", value, "rolefuncreatorid");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatoridLessThanOrEqualTo(String value) {
            addCriterion("ROLEFUNCREATORID <=", value, "rolefuncreatorid");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatoridLike(String value) {
            addCriterion("ROLEFUNCREATORID like", value, "rolefuncreatorid");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatoridNotLike(String value) {
            addCriterion("ROLEFUNCREATORID not like", value, "rolefuncreatorid");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatoridIn(List<String> values) {
            addCriterion("ROLEFUNCREATORID in", values, "rolefuncreatorid");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatoridNotIn(List<String> values) {
            addCriterion("ROLEFUNCREATORID not in", values, "rolefuncreatorid");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatoridBetween(String value1, String value2) {
            addCriterion("ROLEFUNCREATORID between", value1, value2, "rolefuncreatorid");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatoridNotBetween(String value1, String value2) {
            addCriterion("ROLEFUNCREATORID not between", value1, value2, "rolefuncreatorid");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatetimeIsNull() {
            addCriterion("ROLEFUNCREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatetimeIsNotNull() {
            addCriterion("ROLEFUNCREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatetimeEqualTo(String value) {
            addCriterion("ROLEFUNCREATETIME =", value, "rolefuncreatetime");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatetimeNotEqualTo(String value) {
            addCriterion("ROLEFUNCREATETIME <>", value, "rolefuncreatetime");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatetimeGreaterThan(String value) {
            addCriterion("ROLEFUNCREATETIME >", value, "rolefuncreatetime");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEFUNCREATETIME >=", value, "rolefuncreatetime");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatetimeLessThan(String value) {
            addCriterion("ROLEFUNCREATETIME <", value, "rolefuncreatetime");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatetimeLessThanOrEqualTo(String value) {
            addCriterion("ROLEFUNCREATETIME <=", value, "rolefuncreatetime");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatetimeLike(String value) {
            addCriterion("ROLEFUNCREATETIME like", value, "rolefuncreatetime");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatetimeNotLike(String value) {
            addCriterion("ROLEFUNCREATETIME not like", value, "rolefuncreatetime");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatetimeIn(List<String> values) {
            addCriterion("ROLEFUNCREATETIME in", values, "rolefuncreatetime");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatetimeNotIn(List<String> values) {
            addCriterion("ROLEFUNCREATETIME not in", values, "rolefuncreatetime");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatetimeBetween(String value1, String value2) {
            addCriterion("ROLEFUNCREATETIME between", value1, value2, "rolefuncreatetime");
            return (Criteria) this;
        }

        public Criteria andRolefuncreatetimeNotBetween(String value1, String value2) {
            addCriterion("ROLEFUNCREATETIME not between", value1, value2, "rolefuncreatetime");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifieridIsNull() {
            addCriterion("ROLEFUNMODIFIERID is null");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifieridIsNotNull() {
            addCriterion("ROLEFUNMODIFIERID is not null");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifieridEqualTo(String value) {
            addCriterion("ROLEFUNMODIFIERID =", value, "rolefunmodifierid");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifieridNotEqualTo(String value) {
            addCriterion("ROLEFUNMODIFIERID <>", value, "rolefunmodifierid");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifieridGreaterThan(String value) {
            addCriterion("ROLEFUNMODIFIERID >", value, "rolefunmodifierid");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifieridGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEFUNMODIFIERID >=", value, "rolefunmodifierid");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifieridLessThan(String value) {
            addCriterion("ROLEFUNMODIFIERID <", value, "rolefunmodifierid");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifieridLessThanOrEqualTo(String value) {
            addCriterion("ROLEFUNMODIFIERID <=", value, "rolefunmodifierid");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifieridLike(String value) {
            addCriterion("ROLEFUNMODIFIERID like", value, "rolefunmodifierid");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifieridNotLike(String value) {
            addCriterion("ROLEFUNMODIFIERID not like", value, "rolefunmodifierid");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifieridIn(List<String> values) {
            addCriterion("ROLEFUNMODIFIERID in", values, "rolefunmodifierid");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifieridNotIn(List<String> values) {
            addCriterion("ROLEFUNMODIFIERID not in", values, "rolefunmodifierid");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifieridBetween(String value1, String value2) {
            addCriterion("ROLEFUNMODIFIERID between", value1, value2, "rolefunmodifierid");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifieridNotBetween(String value1, String value2) {
            addCriterion("ROLEFUNMODIFIERID not between", value1, value2, "rolefunmodifierid");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifytimeIsNull() {
            addCriterion("ROLEFUNMODIFYTIME is null");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifytimeIsNotNull() {
            addCriterion("ROLEFUNMODIFYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifytimeEqualTo(String value) {
            addCriterion("ROLEFUNMODIFYTIME =", value, "rolefunmodifytime");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifytimeNotEqualTo(String value) {
            addCriterion("ROLEFUNMODIFYTIME <>", value, "rolefunmodifytime");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifytimeGreaterThan(String value) {
            addCriterion("ROLEFUNMODIFYTIME >", value, "rolefunmodifytime");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEFUNMODIFYTIME >=", value, "rolefunmodifytime");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifytimeLessThan(String value) {
            addCriterion("ROLEFUNMODIFYTIME <", value, "rolefunmodifytime");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifytimeLessThanOrEqualTo(String value) {
            addCriterion("ROLEFUNMODIFYTIME <=", value, "rolefunmodifytime");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifytimeLike(String value) {
            addCriterion("ROLEFUNMODIFYTIME like", value, "rolefunmodifytime");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifytimeNotLike(String value) {
            addCriterion("ROLEFUNMODIFYTIME not like", value, "rolefunmodifytime");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifytimeIn(List<String> values) {
            addCriterion("ROLEFUNMODIFYTIME in", values, "rolefunmodifytime");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifytimeNotIn(List<String> values) {
            addCriterion("ROLEFUNMODIFYTIME not in", values, "rolefunmodifytime");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifytimeBetween(String value1, String value2) {
            addCriterion("ROLEFUNMODIFYTIME between", value1, value2, "rolefunmodifytime");
            return (Criteria) this;
        }

        public Criteria andRolefunmodifytimeNotBetween(String value1, String value2) {
            addCriterion("ROLEFUNMODIFYTIME not between", value1, value2, "rolefunmodifytime");
            return (Criteria) this;
        }

        public Criteria andRoleroleidIsNull() {
            addCriterion("ROLEROLEID is null");
            return (Criteria) this;
        }

        public Criteria andRoleroleidIsNotNull() {
            addCriterion("ROLEROLEID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleroleidEqualTo(String value) {
            addCriterion("ROLEROLEID =", value, "roleroleid");
            return (Criteria) this;
        }

        public Criteria andRoleroleidNotEqualTo(String value) {
            addCriterion("ROLEROLEID <>", value, "roleroleid");
            return (Criteria) this;
        }

        public Criteria andRoleroleidGreaterThan(String value) {
            addCriterion("ROLEROLEID >", value, "roleroleid");
            return (Criteria) this;
        }

        public Criteria andRoleroleidGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEROLEID >=", value, "roleroleid");
            return (Criteria) this;
        }

        public Criteria andRoleroleidLessThan(String value) {
            addCriterion("ROLEROLEID <", value, "roleroleid");
            return (Criteria) this;
        }

        public Criteria andRoleroleidLessThanOrEqualTo(String value) {
            addCriterion("ROLEROLEID <=", value, "roleroleid");
            return (Criteria) this;
        }

        public Criteria andRoleroleidLike(String value) {
            addCriterion("ROLEROLEID like", value, "roleroleid");
            return (Criteria) this;
        }

        public Criteria andRoleroleidNotLike(String value) {
            addCriterion("ROLEROLEID not like", value, "roleroleid");
            return (Criteria) this;
        }

        public Criteria andRoleroleidIn(List<String> values) {
            addCriterion("ROLEROLEID in", values, "roleroleid");
            return (Criteria) this;
        }

        public Criteria andRoleroleidNotIn(List<String> values) {
            addCriterion("ROLEROLEID not in", values, "roleroleid");
            return (Criteria) this;
        }

        public Criteria andRoleroleidBetween(String value1, String value2) {
            addCriterion("ROLEROLEID between", value1, value2, "roleroleid");
            return (Criteria) this;
        }

        public Criteria andRoleroleidNotBetween(String value1, String value2) {
            addCriterion("ROLEROLEID not between", value1, value2, "roleroleid");
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