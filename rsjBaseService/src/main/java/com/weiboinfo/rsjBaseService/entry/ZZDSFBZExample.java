package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class ZZDSFBZExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZZDSFBZExample() {
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

        public Criteria andDmIsNull() {
            addCriterion("DM is null");
            return (Criteria) this;
        }

        public Criteria andDmIsNotNull() {
            addCriterion("DM is not null");
            return (Criteria) this;
        }

        public Criteria andDmEqualTo(String value) {
            addCriterion("DM =", value, "dm");
            return (Criteria) this;
        }

        public Criteria andDmNotEqualTo(String value) {
            addCriterion("DM <>", value, "dm");
            return (Criteria) this;
        }

        public Criteria andDmGreaterThan(String value) {
            addCriterion("DM >", value, "dm");
            return (Criteria) this;
        }

        public Criteria andDmGreaterThanOrEqualTo(String value) {
            addCriterion("DM >=", value, "dm");
            return (Criteria) this;
        }

        public Criteria andDmLessThan(String value) {
            addCriterion("DM <", value, "dm");
            return (Criteria) this;
        }

        public Criteria andDmLessThanOrEqualTo(String value) {
            addCriterion("DM <=", value, "dm");
            return (Criteria) this;
        }

        public Criteria andDmLike(String value) {
            addCriterion("DM like", value, "dm");
            return (Criteria) this;
        }

        public Criteria andDmNotLike(String value) {
            addCriterion("DM not like", value, "dm");
            return (Criteria) this;
        }

        public Criteria andDmIn(List<String> values) {
            addCriterion("DM in", values, "dm");
            return (Criteria) this;
        }

        public Criteria andDmNotIn(List<String> values) {
            addCriterion("DM not in", values, "dm");
            return (Criteria) this;
        }

        public Criteria andDmBetween(String value1, String value2) {
            addCriterion("DM between", value1, value2, "dm");
            return (Criteria) this;
        }

        public Criteria andDmNotBetween(String value1, String value2) {
            addCriterion("DM not between", value1, value2, "dm");
            return (Criteria) this;
        }

        public Criteria andDmmcIsNull() {
            addCriterion("DMMC is null");
            return (Criteria) this;
        }

        public Criteria andDmmcIsNotNull() {
            addCriterion("DMMC is not null");
            return (Criteria) this;
        }

        public Criteria andDmmcEqualTo(String value) {
            addCriterion("DMMC =", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcNotEqualTo(String value) {
            addCriterion("DMMC <>", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcGreaterThan(String value) {
            addCriterion("DMMC >", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcGreaterThanOrEqualTo(String value) {
            addCriterion("DMMC >=", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcLessThan(String value) {
            addCriterion("DMMC <", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcLessThanOrEqualTo(String value) {
            addCriterion("DMMC <=", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcLike(String value) {
            addCriterion("DMMC like", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcNotLike(String value) {
            addCriterion("DMMC not like", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcIn(List<String> values) {
            addCriterion("DMMC in", values, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcNotIn(List<String> values) {
            addCriterion("DMMC not in", values, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcBetween(String value1, String value2) {
            addCriterion("DMMC between", value1, value2, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcNotBetween(String value1, String value2) {
            addCriterion("DMMC not between", value1, value2, "dmmc");
            return (Criteria) this;
        }

        public Criteria andXhIsNull() {
            addCriterion("XH is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("XH is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(Integer value) {
            addCriterion("XH =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(Integer value) {
            addCriterion("XH <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(Integer value) {
            addCriterion("XH >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(Integer value) {
            addCriterion("XH >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(Integer value) {
            addCriterion("XH <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(Integer value) {
            addCriterion("XH <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<Integer> values) {
            addCriterion("XH in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<Integer> values) {
            addCriterion("XH not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(Integer value1, Integer value2) {
            addCriterion("XH between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(Integer value1, Integer value2) {
            addCriterion("XH not between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andDm1IsNull() {
            addCriterion("DM1 is null");
            return (Criteria) this;
        }

        public Criteria andDm1IsNotNull() {
            addCriterion("DM1 is not null");
            return (Criteria) this;
        }

        public Criteria andDm1EqualTo(String value) {
            addCriterion("DM1 =", value, "dm1");
            return (Criteria) this;
        }

        public Criteria andDm1NotEqualTo(String value) {
            addCriterion("DM1 <>", value, "dm1");
            return (Criteria) this;
        }

        public Criteria andDm1GreaterThan(String value) {
            addCriterion("DM1 >", value, "dm1");
            return (Criteria) this;
        }

        public Criteria andDm1GreaterThanOrEqualTo(String value) {
            addCriterion("DM1 >=", value, "dm1");
            return (Criteria) this;
        }

        public Criteria andDm1LessThan(String value) {
            addCriterion("DM1 <", value, "dm1");
            return (Criteria) this;
        }

        public Criteria andDm1LessThanOrEqualTo(String value) {
            addCriterion("DM1 <=", value, "dm1");
            return (Criteria) this;
        }

        public Criteria andDm1Like(String value) {
            addCriterion("DM1 like", value, "dm1");
            return (Criteria) this;
        }

        public Criteria andDm1NotLike(String value) {
            addCriterion("DM1 not like", value, "dm1");
            return (Criteria) this;
        }

        public Criteria andDm1In(List<String> values) {
            addCriterion("DM1 in", values, "dm1");
            return (Criteria) this;
        }

        public Criteria andDm1NotIn(List<String> values) {
            addCriterion("DM1 not in", values, "dm1");
            return (Criteria) this;
        }

        public Criteria andDm1Between(String value1, String value2) {
            addCriterion("DM1 between", value1, value2, "dm1");
            return (Criteria) this;
        }

        public Criteria andDm1NotBetween(String value1, String value2) {
            addCriterion("DM1 not between", value1, value2, "dm1");
            return (Criteria) this;
        }

        public Criteria andDmmc1IsNull() {
            addCriterion("DMMC1 is null");
            return (Criteria) this;
        }

        public Criteria andDmmc1IsNotNull() {
            addCriterion("DMMC1 is not null");
            return (Criteria) this;
        }

        public Criteria andDmmc1EqualTo(String value) {
            addCriterion("DMMC1 =", value, "dmmc1");
            return (Criteria) this;
        }

        public Criteria andDmmc1NotEqualTo(String value) {
            addCriterion("DMMC1 <>", value, "dmmc1");
            return (Criteria) this;
        }

        public Criteria andDmmc1GreaterThan(String value) {
            addCriterion("DMMC1 >", value, "dmmc1");
            return (Criteria) this;
        }

        public Criteria andDmmc1GreaterThanOrEqualTo(String value) {
            addCriterion("DMMC1 >=", value, "dmmc1");
            return (Criteria) this;
        }

        public Criteria andDmmc1LessThan(String value) {
            addCriterion("DMMC1 <", value, "dmmc1");
            return (Criteria) this;
        }

        public Criteria andDmmc1LessThanOrEqualTo(String value) {
            addCriterion("DMMC1 <=", value, "dmmc1");
            return (Criteria) this;
        }

        public Criteria andDmmc1Like(String value) {
            addCriterion("DMMC1 like", value, "dmmc1");
            return (Criteria) this;
        }

        public Criteria andDmmc1NotLike(String value) {
            addCriterion("DMMC1 not like", value, "dmmc1");
            return (Criteria) this;
        }

        public Criteria andDmmc1In(List<String> values) {
            addCriterion("DMMC1 in", values, "dmmc1");
            return (Criteria) this;
        }

        public Criteria andDmmc1NotIn(List<String> values) {
            addCriterion("DMMC1 not in", values, "dmmc1");
            return (Criteria) this;
        }

        public Criteria andDmmc1Between(String value1, String value2) {
            addCriterion("DMMC1 between", value1, value2, "dmmc1");
            return (Criteria) this;
        }

        public Criteria andDmmc1NotBetween(String value1, String value2) {
            addCriterion("DMMC1 not between", value1, value2, "dmmc1");
            return (Criteria) this;
        }

        public Criteria andWhIsNull() {
            addCriterion("WH is null");
            return (Criteria) this;
        }

        public Criteria andWhIsNotNull() {
            addCriterion("WH is not null");
            return (Criteria) this;
        }

        public Criteria andWhEqualTo(String value) {
            addCriterion("WH =", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotEqualTo(String value) {
            addCriterion("WH <>", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhGreaterThan(String value) {
            addCriterion("WH >", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhGreaterThanOrEqualTo(String value) {
            addCriterion("WH >=", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhLessThan(String value) {
            addCriterion("WH <", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhLessThanOrEqualTo(String value) {
            addCriterion("WH <=", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhLike(String value) {
            addCriterion("WH like", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotLike(String value) {
            addCriterion("WH not like", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhIn(List<String> values) {
            addCriterion("WH in", values, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotIn(List<String> values) {
            addCriterion("WH not in", values, "wh");
            return (Criteria) this;
        }

        public Criteria andWhBetween(String value1, String value2) {
            addCriterion("WH between", value1, value2, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotBetween(String value1, String value2) {
            addCriterion("WH not between", value1, value2, "wh");
            return (Criteria) this;
        }

        public Criteria andGbbzIsNull() {
            addCriterion("GBBZ is null");
            return (Criteria) this;
        }

        public Criteria andGbbzIsNotNull() {
            addCriterion("GBBZ is not null");
            return (Criteria) this;
        }

        public Criteria andGbbzEqualTo(String value) {
            addCriterion("GBBZ =", value, "gbbz");
            return (Criteria) this;
        }

        public Criteria andGbbzNotEqualTo(String value) {
            addCriterion("GBBZ <>", value, "gbbz");
            return (Criteria) this;
        }

        public Criteria andGbbzGreaterThan(String value) {
            addCriterion("GBBZ >", value, "gbbz");
            return (Criteria) this;
        }

        public Criteria andGbbzGreaterThanOrEqualTo(String value) {
            addCriterion("GBBZ >=", value, "gbbz");
            return (Criteria) this;
        }

        public Criteria andGbbzLessThan(String value) {
            addCriterion("GBBZ <", value, "gbbz");
            return (Criteria) this;
        }

        public Criteria andGbbzLessThanOrEqualTo(String value) {
            addCriterion("GBBZ <=", value, "gbbz");
            return (Criteria) this;
        }

        public Criteria andGbbzLike(String value) {
            addCriterion("GBBZ like", value, "gbbz");
            return (Criteria) this;
        }

        public Criteria andGbbzNotLike(String value) {
            addCriterion("GBBZ not like", value, "gbbz");
            return (Criteria) this;
        }

        public Criteria andGbbzIn(List<String> values) {
            addCriterion("GBBZ in", values, "gbbz");
            return (Criteria) this;
        }

        public Criteria andGbbzNotIn(List<String> values) {
            addCriterion("GBBZ not in", values, "gbbz");
            return (Criteria) this;
        }

        public Criteria andGbbzBetween(String value1, String value2) {
            addCriterion("GBBZ between", value1, value2, "gbbz");
            return (Criteria) this;
        }

        public Criteria andGbbzNotBetween(String value1, String value2) {
            addCriterion("GBBZ not between", value1, value2, "gbbz");
            return (Criteria) this;
        }

        public Criteria andFhIsNull() {
            addCriterion("FH is null");
            return (Criteria) this;
        }

        public Criteria andFhIsNotNull() {
            addCriterion("FH is not null");
            return (Criteria) this;
        }

        public Criteria andFhEqualTo(String value) {
            addCriterion("FH =", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhNotEqualTo(String value) {
            addCriterion("FH <>", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhGreaterThan(String value) {
            addCriterion("FH >", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhGreaterThanOrEqualTo(String value) {
            addCriterion("FH >=", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhLessThan(String value) {
            addCriterion("FH <", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhLessThanOrEqualTo(String value) {
            addCriterion("FH <=", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhLike(String value) {
            addCriterion("FH like", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhNotLike(String value) {
            addCriterion("FH not like", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhIn(List<String> values) {
            addCriterion("FH in", values, "fh");
            return (Criteria) this;
        }

        public Criteria andFhNotIn(List<String> values) {
            addCriterion("FH not in", values, "fh");
            return (Criteria) this;
        }

        public Criteria andFhBetween(String value1, String value2) {
            addCriterion("FH between", value1, value2, "fh");
            return (Criteria) this;
        }

        public Criteria andFhNotBetween(String value1, String value2) {
            addCriterion("FH not between", value1, value2, "fh");
            return (Criteria) this;
        }

        public Criteria andXgsjIsNull() {
            addCriterion("XGSJ is null");
            return (Criteria) this;
        }

        public Criteria andXgsjIsNotNull() {
            addCriterion("XGSJ is not null");
            return (Criteria) this;
        }

        public Criteria andXgsjEqualTo(String value) {
            addCriterion("XGSJ =", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjNotEqualTo(String value) {
            addCriterion("XGSJ <>", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjGreaterThan(String value) {
            addCriterion("XGSJ >", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjGreaterThanOrEqualTo(String value) {
            addCriterion("XGSJ >=", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjLessThan(String value) {
            addCriterion("XGSJ <", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjLessThanOrEqualTo(String value) {
            addCriterion("XGSJ <=", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjLike(String value) {
            addCriterion("XGSJ like", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjNotLike(String value) {
            addCriterion("XGSJ not like", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjIn(List<String> values) {
            addCriterion("XGSJ in", values, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjNotIn(List<String> values) {
            addCriterion("XGSJ not in", values, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjBetween(String value1, String value2) {
            addCriterion("XGSJ between", value1, value2, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjNotBetween(String value1, String value2) {
            addCriterion("XGSJ not between", value1, value2, "xgsj");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNull() {
            addCriterion("ISDEL is null");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNotNull() {
            addCriterion("ISDEL is not null");
            return (Criteria) this;
        }

        public Criteria andIsdelEqualTo(String value) {
            addCriterion("ISDEL =", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotEqualTo(String value) {
            addCriterion("ISDEL <>", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThan(String value) {
            addCriterion("ISDEL >", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThanOrEqualTo(String value) {
            addCriterion("ISDEL >=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThan(String value) {
            addCriterion("ISDEL <", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThanOrEqualTo(String value) {
            addCriterion("ISDEL <=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLike(String value) {
            addCriterion("ISDEL like", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotLike(String value) {
            addCriterion("ISDEL not like", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelIn(List<String> values) {
            addCriterion("ISDEL in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotIn(List<String> values) {
            addCriterion("ISDEL not in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelBetween(String value1, String value2) {
            addCriterion("ISDEL between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotBetween(String value1, String value2) {
            addCriterion("ISDEL not between", value1, value2, "isdel");
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