package com.weiboinfo.rsjBaseService.entry;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FrmRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrmRoleExample() {
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

        public Criteria andRolenameIsNull() {
            addCriterion("ROLENAME is null");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNotNull() {
            addCriterion("ROLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andRolenameEqualTo(String value) {
            addCriterion("ROLENAME =", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotEqualTo(String value) {
            addCriterion("ROLENAME <>", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThan(String value) {
            addCriterion("ROLENAME >", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThanOrEqualTo(String value) {
            addCriterion("ROLENAME >=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThan(String value) {
            addCriterion("ROLENAME <", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThanOrEqualTo(String value) {
            addCriterion("ROLENAME <=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLike(String value) {
            addCriterion("ROLENAME like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotLike(String value) {
            addCriterion("ROLENAME not like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameIn(List<String> values) {
            addCriterion("ROLENAME in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotIn(List<String> values) {
            addCriterion("ROLENAME not in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameBetween(String value1, String value2) {
            addCriterion("ROLENAME between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotBetween(String value1, String value2) {
            addCriterion("ROLENAME not between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andRoledescIsNull() {
            addCriterion("ROLEDESC is null");
            return (Criteria) this;
        }

        public Criteria andRoledescIsNotNull() {
            addCriterion("ROLEDESC is not null");
            return (Criteria) this;
        }

        public Criteria andRoledescEqualTo(String value) {
            addCriterion("ROLEDESC =", value, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescNotEqualTo(String value) {
            addCriterion("ROLEDESC <>", value, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescGreaterThan(String value) {
            addCriterion("ROLEDESC >", value, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEDESC >=", value, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescLessThan(String value) {
            addCriterion("ROLEDESC <", value, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescLessThanOrEqualTo(String value) {
            addCriterion("ROLEDESC <=", value, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescLike(String value) {
            addCriterion("ROLEDESC like", value, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescNotLike(String value) {
            addCriterion("ROLEDESC not like", value, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescIn(List<String> values) {
            addCriterion("ROLEDESC in", values, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescNotIn(List<String> values) {
            addCriterion("ROLEDESC not in", values, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescBetween(String value1, String value2) {
            addCriterion("ROLEDESC between", value1, value2, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescNotBetween(String value1, String value2) {
            addCriterion("ROLEDESC not between", value1, value2, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledepartmentIsNull() {
            addCriterion("ROLEDEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andRoledepartmentIsNotNull() {
            addCriterion("ROLEDEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andRoledepartmentEqualTo(String value) {
            addCriterion("ROLEDEPARTMENT =", value, "roledepartment");
            return (Criteria) this;
        }

        public Criteria andRoledepartmentNotEqualTo(String value) {
            addCriterion("ROLEDEPARTMENT <>", value, "roledepartment");
            return (Criteria) this;
        }

        public Criteria andRoledepartmentGreaterThan(String value) {
            addCriterion("ROLEDEPARTMENT >", value, "roledepartment");
            return (Criteria) this;
        }

        public Criteria andRoledepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEDEPARTMENT >=", value, "roledepartment");
            return (Criteria) this;
        }

        public Criteria andRoledepartmentLessThan(String value) {
            addCriterion("ROLEDEPARTMENT <", value, "roledepartment");
            return (Criteria) this;
        }

        public Criteria andRoledepartmentLessThanOrEqualTo(String value) {
            addCriterion("ROLEDEPARTMENT <=", value, "roledepartment");
            return (Criteria) this;
        }

        public Criteria andRoledepartmentLike(String value) {
            addCriterion("ROLEDEPARTMENT like", value, "roledepartment");
            return (Criteria) this;
        }

        public Criteria andRoledepartmentNotLike(String value) {
            addCriterion("ROLEDEPARTMENT not like", value, "roledepartment");
            return (Criteria) this;
        }

        public Criteria andRoledepartmentIn(List<String> values) {
            addCriterion("ROLEDEPARTMENT in", values, "roledepartment");
            return (Criteria) this;
        }

        public Criteria andRoledepartmentNotIn(List<String> values) {
            addCriterion("ROLEDEPARTMENT not in", values, "roledepartment");
            return (Criteria) this;
        }

        public Criteria andRoledepartmentBetween(String value1, String value2) {
            addCriterion("ROLEDEPARTMENT between", value1, value2, "roledepartment");
            return (Criteria) this;
        }

        public Criteria andRoledepartmentNotBetween(String value1, String value2) {
            addCriterion("ROLEDEPARTMENT not between", value1, value2, "roledepartment");
            return (Criteria) this;
        }

        public Criteria andRolecreatoridIsNull() {
            addCriterion("ROLECREATORID is null");
            return (Criteria) this;
        }

        public Criteria andRolecreatoridIsNotNull() {
            addCriterion("ROLECREATORID is not null");
            return (Criteria) this;
        }

        public Criteria andRolecreatoridEqualTo(String value) {
            addCriterion("ROLECREATORID =", value, "rolecreatorid");
            return (Criteria) this;
        }

        public Criteria andRolecreatoridNotEqualTo(String value) {
            addCriterion("ROLECREATORID <>", value, "rolecreatorid");
            return (Criteria) this;
        }

        public Criteria andRolecreatoridGreaterThan(String value) {
            addCriterion("ROLECREATORID >", value, "rolecreatorid");
            return (Criteria) this;
        }

        public Criteria andRolecreatoridGreaterThanOrEqualTo(String value) {
            addCriterion("ROLECREATORID >=", value, "rolecreatorid");
            return (Criteria) this;
        }

        public Criteria andRolecreatoridLessThan(String value) {
            addCriterion("ROLECREATORID <", value, "rolecreatorid");
            return (Criteria) this;
        }

        public Criteria andRolecreatoridLessThanOrEqualTo(String value) {
            addCriterion("ROLECREATORID <=", value, "rolecreatorid");
            return (Criteria) this;
        }

        public Criteria andRolecreatoridLike(String value) {
            addCriterion("ROLECREATORID like", value, "rolecreatorid");
            return (Criteria) this;
        }

        public Criteria andRolecreatoridNotLike(String value) {
            addCriterion("ROLECREATORID not like", value, "rolecreatorid");
            return (Criteria) this;
        }

        public Criteria andRolecreatoridIn(List<String> values) {
            addCriterion("ROLECREATORID in", values, "rolecreatorid");
            return (Criteria) this;
        }

        public Criteria andRolecreatoridNotIn(List<String> values) {
            addCriterion("ROLECREATORID not in", values, "rolecreatorid");
            return (Criteria) this;
        }

        public Criteria andRolecreatoridBetween(String value1, String value2) {
            addCriterion("ROLECREATORID between", value1, value2, "rolecreatorid");
            return (Criteria) this;
        }

        public Criteria andRolecreatoridNotBetween(String value1, String value2) {
            addCriterion("ROLECREATORID not between", value1, value2, "rolecreatorid");
            return (Criteria) this;
        }

        public Criteria andRolecreatetimeIsNull() {
            addCriterion("ROLECREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andRolecreatetimeIsNotNull() {
            addCriterion("ROLECREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andRolecreatetimeEqualTo(String value) {
            addCriterion("ROLECREATETIME =", value, "rolecreatetime");
            return (Criteria) this;
        }

        public Criteria andRolecreatetimeNotEqualTo(String value) {
            addCriterion("ROLECREATETIME <>", value, "rolecreatetime");
            return (Criteria) this;
        }

        public Criteria andRolecreatetimeGreaterThan(String value) {
            addCriterion("ROLECREATETIME >", value, "rolecreatetime");
            return (Criteria) this;
        }

        public Criteria andRolecreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("ROLECREATETIME >=", value, "rolecreatetime");
            return (Criteria) this;
        }

        public Criteria andRolecreatetimeLessThan(String value) {
            addCriterion("ROLECREATETIME <", value, "rolecreatetime");
            return (Criteria) this;
        }

        public Criteria andRolecreatetimeLessThanOrEqualTo(String value) {
            addCriterion("ROLECREATETIME <=", value, "rolecreatetime");
            return (Criteria) this;
        }

        public Criteria andRolecreatetimeLike(String value) {
            addCriterion("ROLECREATETIME like", value, "rolecreatetime");
            return (Criteria) this;
        }

        public Criteria andRolecreatetimeNotLike(String value) {
            addCriterion("ROLECREATETIME not like", value, "rolecreatetime");
            return (Criteria) this;
        }

        public Criteria andRolecreatetimeIn(List<String> values) {
            addCriterion("ROLECREATETIME in", values, "rolecreatetime");
            return (Criteria) this;
        }

        public Criteria andRolecreatetimeNotIn(List<String> values) {
            addCriterion("ROLECREATETIME not in", values, "rolecreatetime");
            return (Criteria) this;
        }

        public Criteria andRolecreatetimeBetween(String value1, String value2) {
            addCriterion("ROLECREATETIME between", value1, value2, "rolecreatetime");
            return (Criteria) this;
        }

        public Criteria andRolecreatetimeNotBetween(String value1, String value2) {
            addCriterion("ROLECREATETIME not between", value1, value2, "rolecreatetime");
            return (Criteria) this;
        }

        public Criteria andRolemodifieridIsNull() {
            addCriterion("ROLEMODIFIERID is null");
            return (Criteria) this;
        }

        public Criteria andRolemodifieridIsNotNull() {
            addCriterion("ROLEMODIFIERID is not null");
            return (Criteria) this;
        }

        public Criteria andRolemodifieridEqualTo(String value) {
            addCriterion("ROLEMODIFIERID =", value, "rolemodifierid");
            return (Criteria) this;
        }

        public Criteria andRolemodifieridNotEqualTo(String value) {
            addCriterion("ROLEMODIFIERID <>", value, "rolemodifierid");
            return (Criteria) this;
        }

        public Criteria andRolemodifieridGreaterThan(String value) {
            addCriterion("ROLEMODIFIERID >", value, "rolemodifierid");
            return (Criteria) this;
        }

        public Criteria andRolemodifieridGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEMODIFIERID >=", value, "rolemodifierid");
            return (Criteria) this;
        }

        public Criteria andRolemodifieridLessThan(String value) {
            addCriterion("ROLEMODIFIERID <", value, "rolemodifierid");
            return (Criteria) this;
        }

        public Criteria andRolemodifieridLessThanOrEqualTo(String value) {
            addCriterion("ROLEMODIFIERID <=", value, "rolemodifierid");
            return (Criteria) this;
        }

        public Criteria andRolemodifieridLike(String value) {
            addCriterion("ROLEMODIFIERID like", value, "rolemodifierid");
            return (Criteria) this;
        }

        public Criteria andRolemodifieridNotLike(String value) {
            addCriterion("ROLEMODIFIERID not like", value, "rolemodifierid");
            return (Criteria) this;
        }

        public Criteria andRolemodifieridIn(List<String> values) {
            addCriterion("ROLEMODIFIERID in", values, "rolemodifierid");
            return (Criteria) this;
        }

        public Criteria andRolemodifieridNotIn(List<String> values) {
            addCriterion("ROLEMODIFIERID not in", values, "rolemodifierid");
            return (Criteria) this;
        }

        public Criteria andRolemodifieridBetween(String value1, String value2) {
            addCriterion("ROLEMODIFIERID between", value1, value2, "rolemodifierid");
            return (Criteria) this;
        }

        public Criteria andRolemodifieridNotBetween(String value1, String value2) {
            addCriterion("ROLEMODIFIERID not between", value1, value2, "rolemodifierid");
            return (Criteria) this;
        }

        public Criteria andRolemodifytimeIsNull() {
            addCriterion("ROLEMODIFYTIME is null");
            return (Criteria) this;
        }

        public Criteria andRolemodifytimeIsNotNull() {
            addCriterion("ROLEMODIFYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRolemodifytimeEqualTo(String value) {
            addCriterion("ROLEMODIFYTIME =", value, "rolemodifytime");
            return (Criteria) this;
        }

        public Criteria andRolemodifytimeNotEqualTo(String value) {
            addCriterion("ROLEMODIFYTIME <>", value, "rolemodifytime");
            return (Criteria) this;
        }

        public Criteria andRolemodifytimeGreaterThan(String value) {
            addCriterion("ROLEMODIFYTIME >", value, "rolemodifytime");
            return (Criteria) this;
        }

        public Criteria andRolemodifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEMODIFYTIME >=", value, "rolemodifytime");
            return (Criteria) this;
        }

        public Criteria andRolemodifytimeLessThan(String value) {
            addCriterion("ROLEMODIFYTIME <", value, "rolemodifytime");
            return (Criteria) this;
        }

        public Criteria andRolemodifytimeLessThanOrEqualTo(String value) {
            addCriterion("ROLEMODIFYTIME <=", value, "rolemodifytime");
            return (Criteria) this;
        }

        public Criteria andRolemodifytimeLike(String value) {
            addCriterion("ROLEMODIFYTIME like", value, "rolemodifytime");
            return (Criteria) this;
        }

        public Criteria andRolemodifytimeNotLike(String value) {
            addCriterion("ROLEMODIFYTIME not like", value, "rolemodifytime");
            return (Criteria) this;
        }

        public Criteria andRolemodifytimeIn(List<String> values) {
            addCriterion("ROLEMODIFYTIME in", values, "rolemodifytime");
            return (Criteria) this;
        }

        public Criteria andRolemodifytimeNotIn(List<String> values) {
            addCriterion("ROLEMODIFYTIME not in", values, "rolemodifytime");
            return (Criteria) this;
        }

        public Criteria andRolemodifytimeBetween(String value1, String value2) {
            addCriterion("ROLEMODIFYTIME between", value1, value2, "rolemodifytime");
            return (Criteria) this;
        }

        public Criteria andRolemodifytimeNotBetween(String value1, String value2) {
            addCriterion("ROLEMODIFYTIME not between", value1, value2, "rolemodifytime");
            return (Criteria) this;
        }

        public Criteria andRoleindexIsNull() {
            addCriterion("ROLEINDEX is null");
            return (Criteria) this;
        }

        public Criteria andRoleindexIsNotNull() {
            addCriterion("ROLEINDEX is not null");
            return (Criteria) this;
        }

        public Criteria andRoleindexEqualTo(String value) {
            addCriterion("ROLEINDEX =", value, "roleindex");
            return (Criteria) this;
        }

        public Criteria andRoleindexNotEqualTo(String value) {
            addCriterion("ROLEINDEX <>", value, "roleindex");
            return (Criteria) this;
        }

        public Criteria andRoleindexGreaterThan(String value) {
            addCriterion("ROLEINDEX >", value, "roleindex");
            return (Criteria) this;
        }

        public Criteria andRoleindexGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEINDEX >=", value, "roleindex");
            return (Criteria) this;
        }

        public Criteria andRoleindexLessThan(String value) {
            addCriterion("ROLEINDEX <", value, "roleindex");
            return (Criteria) this;
        }

        public Criteria andRoleindexLessThanOrEqualTo(String value) {
            addCriterion("ROLEINDEX <=", value, "roleindex");
            return (Criteria) this;
        }

        public Criteria andRoleindexLike(String value) {
            addCriterion("ROLEINDEX like", value, "roleindex");
            return (Criteria) this;
        }

        public Criteria andRoleindexNotLike(String value) {
            addCriterion("ROLEINDEX not like", value, "roleindex");
            return (Criteria) this;
        }

        public Criteria andRoleindexIn(List<String> values) {
            addCriterion("ROLEINDEX in", values, "roleindex");
            return (Criteria) this;
        }

        public Criteria andRoleindexNotIn(List<String> values) {
            addCriterion("ROLEINDEX not in", values, "roleindex");
            return (Criteria) this;
        }

        public Criteria andRoleindexBetween(String value1, String value2) {
            addCriterion("ROLEINDEX between", value1, value2, "roleindex");
            return (Criteria) this;
        }

        public Criteria andRoleindexNotBetween(String value1, String value2) {
            addCriterion("ROLEINDEX not between", value1, value2, "roleindex");
            return (Criteria) this;
        }

        public Criteria andRolegroupidIsNull() {
            addCriterion("ROLEGROUPID is null");
            return (Criteria) this;
        }

        public Criteria andRolegroupidIsNotNull() {
            addCriterion("ROLEGROUPID is not null");
            return (Criteria) this;
        }

        public Criteria andRolegroupidEqualTo(String value) {
            addCriterion("ROLEGROUPID =", value, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupidNotEqualTo(String value) {
            addCriterion("ROLEGROUPID <>", value, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupidGreaterThan(String value) {
            addCriterion("ROLEGROUPID >", value, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupidGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEGROUPID >=", value, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupidLessThan(String value) {
            addCriterion("ROLEGROUPID <", value, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupidLessThanOrEqualTo(String value) {
            addCriterion("ROLEGROUPID <=", value, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupidLike(String value) {
            addCriterion("ROLEGROUPID like", value, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupidNotLike(String value) {
            addCriterion("ROLEGROUPID not like", value, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupidIn(List<String> values) {
            addCriterion("ROLEGROUPID in", values, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupidNotIn(List<String> values) {
            addCriterion("ROLEGROUPID not in", values, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupidBetween(String value1, String value2) {
            addCriterion("ROLEGROUPID between", value1, value2, "rolegroupid");
            return (Criteria) this;
        }

        public Criteria andRolegroupidNotBetween(String value1, String value2) {
            addCriterion("ROLEGROUPID not between", value1, value2, "rolegroupid");
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