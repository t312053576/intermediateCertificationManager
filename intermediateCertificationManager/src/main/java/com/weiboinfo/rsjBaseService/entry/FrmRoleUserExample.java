package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class FrmRoleUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrmRoleUserExample() {
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

        public Criteria andRoleuseridIsNull() {
            addCriterion("ROLEUSERID is null");
            return (Criteria) this;
        }

        public Criteria andRoleuseridIsNotNull() {
            addCriterion("ROLEUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleuseridEqualTo(String value) {
            addCriterion("ROLEUSERID =", value, "roleuserid");
            return (Criteria) this;
        }

        public Criteria andRoleuseridNotEqualTo(String value) {
            addCriterion("ROLEUSERID <>", value, "roleuserid");
            return (Criteria) this;
        }

        public Criteria andRoleuseridGreaterThan(String value) {
            addCriterion("ROLEUSERID >", value, "roleuserid");
            return (Criteria) this;
        }

        public Criteria andRoleuseridGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEUSERID >=", value, "roleuserid");
            return (Criteria) this;
        }

        public Criteria andRoleuseridLessThan(String value) {
            addCriterion("ROLEUSERID <", value, "roleuserid");
            return (Criteria) this;
        }

        public Criteria andRoleuseridLessThanOrEqualTo(String value) {
            addCriterion("ROLEUSERID <=", value, "roleuserid");
            return (Criteria) this;
        }

        public Criteria andRoleuseridLike(String value) {
            addCriterion("ROLEUSERID like", value, "roleuserid");
            return (Criteria) this;
        }

        public Criteria andRoleuseridNotLike(String value) {
            addCriterion("ROLEUSERID not like", value, "roleuserid");
            return (Criteria) this;
        }

        public Criteria andRoleuseridIn(List<String> values) {
            addCriterion("ROLEUSERID in", values, "roleuserid");
            return (Criteria) this;
        }

        public Criteria andRoleuseridNotIn(List<String> values) {
            addCriterion("ROLEUSERID not in", values, "roleuserid");
            return (Criteria) this;
        }

        public Criteria andRoleuseridBetween(String value1, String value2) {
            addCriterion("ROLEUSERID between", value1, value2, "roleuserid");
            return (Criteria) this;
        }

        public Criteria andRoleuseridNotBetween(String value1, String value2) {
            addCriterion("ROLEUSERID not between", value1, value2, "roleuserid");
            return (Criteria) this;
        }

        public Criteria andRoleuserauthtimeIsNull() {
            addCriterion("ROLEUSERAUTHTIME is null");
            return (Criteria) this;
        }

        public Criteria andRoleuserauthtimeIsNotNull() {
            addCriterion("ROLEUSERAUTHTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRoleuserauthtimeEqualTo(String value) {
            addCriterion("ROLEUSERAUTHTIME =", value, "roleuserauthtime");
            return (Criteria) this;
        }

        public Criteria andRoleuserauthtimeNotEqualTo(String value) {
            addCriterion("ROLEUSERAUTHTIME <>", value, "roleuserauthtime");
            return (Criteria) this;
        }

        public Criteria andRoleuserauthtimeGreaterThan(String value) {
            addCriterion("ROLEUSERAUTHTIME >", value, "roleuserauthtime");
            return (Criteria) this;
        }

        public Criteria andRoleuserauthtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEUSERAUTHTIME >=", value, "roleuserauthtime");
            return (Criteria) this;
        }

        public Criteria andRoleuserauthtimeLessThan(String value) {
            addCriterion("ROLEUSERAUTHTIME <", value, "roleuserauthtime");
            return (Criteria) this;
        }

        public Criteria andRoleuserauthtimeLessThanOrEqualTo(String value) {
            addCriterion("ROLEUSERAUTHTIME <=", value, "roleuserauthtime");
            return (Criteria) this;
        }

        public Criteria andRoleuserauthtimeLike(String value) {
            addCriterion("ROLEUSERAUTHTIME like", value, "roleuserauthtime");
            return (Criteria) this;
        }

        public Criteria andRoleuserauthtimeNotLike(String value) {
            addCriterion("ROLEUSERAUTHTIME not like", value, "roleuserauthtime");
            return (Criteria) this;
        }

        public Criteria andRoleuserauthtimeIn(List<String> values) {
            addCriterion("ROLEUSERAUTHTIME in", values, "roleuserauthtime");
            return (Criteria) this;
        }

        public Criteria andRoleuserauthtimeNotIn(List<String> values) {
            addCriterion("ROLEUSERAUTHTIME not in", values, "roleuserauthtime");
            return (Criteria) this;
        }

        public Criteria andRoleuserauthtimeBetween(String value1, String value2) {
            addCriterion("ROLEUSERAUTHTIME between", value1, value2, "roleuserauthtime");
            return (Criteria) this;
        }

        public Criteria andRoleuserauthtimeNotBetween(String value1, String value2) {
            addCriterion("ROLEUSERAUTHTIME not between", value1, value2, "roleuserauthtime");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatoridIsNull() {
            addCriterion("ROLEUSERCREATORID is null");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatoridIsNotNull() {
            addCriterion("ROLEUSERCREATORID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatoridEqualTo(String value) {
            addCriterion("ROLEUSERCREATORID =", value, "roleusercreatorid");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatoridNotEqualTo(String value) {
            addCriterion("ROLEUSERCREATORID <>", value, "roleusercreatorid");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatoridGreaterThan(String value) {
            addCriterion("ROLEUSERCREATORID >", value, "roleusercreatorid");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatoridGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEUSERCREATORID >=", value, "roleusercreatorid");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatoridLessThan(String value) {
            addCriterion("ROLEUSERCREATORID <", value, "roleusercreatorid");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatoridLessThanOrEqualTo(String value) {
            addCriterion("ROLEUSERCREATORID <=", value, "roleusercreatorid");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatoridLike(String value) {
            addCriterion("ROLEUSERCREATORID like", value, "roleusercreatorid");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatoridNotLike(String value) {
            addCriterion("ROLEUSERCREATORID not like", value, "roleusercreatorid");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatoridIn(List<String> values) {
            addCriterion("ROLEUSERCREATORID in", values, "roleusercreatorid");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatoridNotIn(List<String> values) {
            addCriterion("ROLEUSERCREATORID not in", values, "roleusercreatorid");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatoridBetween(String value1, String value2) {
            addCriterion("ROLEUSERCREATORID between", value1, value2, "roleusercreatorid");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatoridNotBetween(String value1, String value2) {
            addCriterion("ROLEUSERCREATORID not between", value1, value2, "roleusercreatorid");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatetimeIsNull() {
            addCriterion("ROLEUSERCREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatetimeIsNotNull() {
            addCriterion("ROLEUSERCREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatetimeEqualTo(String value) {
            addCriterion("ROLEUSERCREATETIME =", value, "roleusercreatetime");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatetimeNotEqualTo(String value) {
            addCriterion("ROLEUSERCREATETIME <>", value, "roleusercreatetime");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatetimeGreaterThan(String value) {
            addCriterion("ROLEUSERCREATETIME >", value, "roleusercreatetime");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEUSERCREATETIME >=", value, "roleusercreatetime");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatetimeLessThan(String value) {
            addCriterion("ROLEUSERCREATETIME <", value, "roleusercreatetime");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatetimeLessThanOrEqualTo(String value) {
            addCriterion("ROLEUSERCREATETIME <=", value, "roleusercreatetime");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatetimeLike(String value) {
            addCriterion("ROLEUSERCREATETIME like", value, "roleusercreatetime");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatetimeNotLike(String value) {
            addCriterion("ROLEUSERCREATETIME not like", value, "roleusercreatetime");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatetimeIn(List<String> values) {
            addCriterion("ROLEUSERCREATETIME in", values, "roleusercreatetime");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatetimeNotIn(List<String> values) {
            addCriterion("ROLEUSERCREATETIME not in", values, "roleusercreatetime");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatetimeBetween(String value1, String value2) {
            addCriterion("ROLEUSERCREATETIME between", value1, value2, "roleusercreatetime");
            return (Criteria) this;
        }

        public Criteria andRoleusercreatetimeNotBetween(String value1, String value2) {
            addCriterion("ROLEUSERCREATETIME not between", value1, value2, "roleusercreatetime");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifieridIsNull() {
            addCriterion("ROLEUSERMODIFIERID is null");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifieridIsNotNull() {
            addCriterion("ROLEUSERMODIFIERID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifieridEqualTo(String value) {
            addCriterion("ROLEUSERMODIFIERID =", value, "roleusermodifierid");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifieridNotEqualTo(String value) {
            addCriterion("ROLEUSERMODIFIERID <>", value, "roleusermodifierid");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifieridGreaterThan(String value) {
            addCriterion("ROLEUSERMODIFIERID >", value, "roleusermodifierid");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifieridGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEUSERMODIFIERID >=", value, "roleusermodifierid");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifieridLessThan(String value) {
            addCriterion("ROLEUSERMODIFIERID <", value, "roleusermodifierid");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifieridLessThanOrEqualTo(String value) {
            addCriterion("ROLEUSERMODIFIERID <=", value, "roleusermodifierid");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifieridLike(String value) {
            addCriterion("ROLEUSERMODIFIERID like", value, "roleusermodifierid");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifieridNotLike(String value) {
            addCriterion("ROLEUSERMODIFIERID not like", value, "roleusermodifierid");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifieridIn(List<String> values) {
            addCriterion("ROLEUSERMODIFIERID in", values, "roleusermodifierid");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifieridNotIn(List<String> values) {
            addCriterion("ROLEUSERMODIFIERID not in", values, "roleusermodifierid");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifieridBetween(String value1, String value2) {
            addCriterion("ROLEUSERMODIFIERID between", value1, value2, "roleusermodifierid");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifieridNotBetween(String value1, String value2) {
            addCriterion("ROLEUSERMODIFIERID not between", value1, value2, "roleusermodifierid");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifytimeIsNull() {
            addCriterion("ROLEUSERMODIFYTIME is null");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifytimeIsNotNull() {
            addCriterion("ROLEUSERMODIFYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifytimeEqualTo(String value) {
            addCriterion("ROLEUSERMODIFYTIME =", value, "roleusermodifytime");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifytimeNotEqualTo(String value) {
            addCriterion("ROLEUSERMODIFYTIME <>", value, "roleusermodifytime");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifytimeGreaterThan(String value) {
            addCriterion("ROLEUSERMODIFYTIME >", value, "roleusermodifytime");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEUSERMODIFYTIME >=", value, "roleusermodifytime");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifytimeLessThan(String value) {
            addCriterion("ROLEUSERMODIFYTIME <", value, "roleusermodifytime");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifytimeLessThanOrEqualTo(String value) {
            addCriterion("ROLEUSERMODIFYTIME <=", value, "roleusermodifytime");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifytimeLike(String value) {
            addCriterion("ROLEUSERMODIFYTIME like", value, "roleusermodifytime");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifytimeNotLike(String value) {
            addCriterion("ROLEUSERMODIFYTIME not like", value, "roleusermodifytime");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifytimeIn(List<String> values) {
            addCriterion("ROLEUSERMODIFYTIME in", values, "roleusermodifytime");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifytimeNotIn(List<String> values) {
            addCriterion("ROLEUSERMODIFYTIME not in", values, "roleusermodifytime");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifytimeBetween(String value1, String value2) {
            addCriterion("ROLEUSERMODIFYTIME between", value1, value2, "roleusermodifytime");
            return (Criteria) this;
        }

        public Criteria andRoleusermodifytimeNotBetween(String value1, String value2) {
            addCriterion("ROLEUSERMODIFYTIME not between", value1, value2, "roleusermodifytime");
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

        public Criteria andRoleidIsNull() {
            addCriterion("ROLEID is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("ROLEID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(String value) {
            addCriterion("ROLEID =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(String value) {
            addCriterion("ROLEID <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(String value) {
            addCriterion("ROLEID >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEID >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(String value) {
            addCriterion("ROLEID <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(String value) {
            addCriterion("ROLEID <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLike(String value) {
            addCriterion("ROLEID like", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotLike(String value) {
            addCriterion("ROLEID not like", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<String> values) {
            addCriterion("ROLEID in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<String> values) {
            addCriterion("ROLEID not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(String value1, String value2) {
            addCriterion("ROLEID between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(String value1, String value2) {
            addCriterion("ROLEID not between", value1, value2, "roleid");
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