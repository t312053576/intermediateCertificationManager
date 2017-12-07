package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class FrmDeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrmDeptExample() {
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

        public Criteria andXx0301idIsNull() {
            addCriterion("XX0301ID is null");
            return (Criteria) this;
        }

        public Criteria andXx0301idIsNotNull() {
            addCriterion("XX0301ID is not null");
            return (Criteria) this;
        }

        public Criteria andXx0301idEqualTo(String value) {
            addCriterion("XX0301ID =", value, "xx0301id");
            return (Criteria) this;
        }

        public Criteria andXx0301idNotEqualTo(String value) {
            addCriterion("XX0301ID <>", value, "xx0301id");
            return (Criteria) this;
        }

        public Criteria andXx0301idGreaterThan(String value) {
            addCriterion("XX0301ID >", value, "xx0301id");
            return (Criteria) this;
        }

        public Criteria andXx0301idGreaterThanOrEqualTo(String value) {
            addCriterion("XX0301ID >=", value, "xx0301id");
            return (Criteria) this;
        }

        public Criteria andXx0301idLessThan(String value) {
            addCriterion("XX0301ID <", value, "xx0301id");
            return (Criteria) this;
        }

        public Criteria andXx0301idLessThanOrEqualTo(String value) {
            addCriterion("XX0301ID <=", value, "xx0301id");
            return (Criteria) this;
        }

        public Criteria andXx0301idLike(String value) {
            addCriterion("XX0301ID like", value, "xx0301id");
            return (Criteria) this;
        }

        public Criteria andXx0301idNotLike(String value) {
            addCriterion("XX0301ID not like", value, "xx0301id");
            return (Criteria) this;
        }

        public Criteria andXx0301idIn(List<String> values) {
            addCriterion("XX0301ID in", values, "xx0301id");
            return (Criteria) this;
        }

        public Criteria andXx0301idNotIn(List<String> values) {
            addCriterion("XX0301ID not in", values, "xx0301id");
            return (Criteria) this;
        }

        public Criteria andXx0301idBetween(String value1, String value2) {
            addCriterion("XX0301ID between", value1, value2, "xx0301id");
            return (Criteria) this;
        }

        public Criteria andXx0301idNotBetween(String value1, String value2) {
            addCriterion("XX0301ID not between", value1, value2, "xx0301id");
            return (Criteria) this;
        }

        public Criteria andDwhIsNull() {
            addCriterion("DWH is null");
            return (Criteria) this;
        }

        public Criteria andDwhIsNotNull() {
            addCriterion("DWH is not null");
            return (Criteria) this;
        }

        public Criteria andDwhEqualTo(String value) {
            addCriterion("DWH =", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhNotEqualTo(String value) {
            addCriterion("DWH <>", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhGreaterThan(String value) {
            addCriterion("DWH >", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhGreaterThanOrEqualTo(String value) {
            addCriterion("DWH >=", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhLessThan(String value) {
            addCriterion("DWH <", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhLessThanOrEqualTo(String value) {
            addCriterion("DWH <=", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhLike(String value) {
            addCriterion("DWH like", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhNotLike(String value) {
            addCriterion("DWH not like", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhIn(List<String> values) {
            addCriterion("DWH in", values, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhNotIn(List<String> values) {
            addCriterion("DWH not in", values, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhBetween(String value1, String value2) {
            addCriterion("DWH between", value1, value2, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhNotBetween(String value1, String value2) {
            addCriterion("DWH not between", value1, value2, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwmcIsNull() {
            addCriterion("DWMC is null");
            return (Criteria) this;
        }

        public Criteria andDwmcIsNotNull() {
            addCriterion("DWMC is not null");
            return (Criteria) this;
        }

        public Criteria andDwmcEqualTo(String value) {
            addCriterion("DWMC =", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcNotEqualTo(String value) {
            addCriterion("DWMC <>", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcGreaterThan(String value) {
            addCriterion("DWMC >", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcGreaterThanOrEqualTo(String value) {
            addCriterion("DWMC >=", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcLessThan(String value) {
            addCriterion("DWMC <", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcLessThanOrEqualTo(String value) {
            addCriterion("DWMC <=", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcLike(String value) {
            addCriterion("DWMC like", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcNotLike(String value) {
            addCriterion("DWMC not like", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcIn(List<String> values) {
            addCriterion("DWMC in", values, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcNotIn(List<String> values) {
            addCriterion("DWMC not in", values, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcBetween(String value1, String value2) {
            addCriterion("DWMC between", value1, value2, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcNotBetween(String value1, String value2) {
            addCriterion("DWMC not between", value1, value2, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwjcIsNull() {
            addCriterion("DWJC is null");
            return (Criteria) this;
        }

        public Criteria andDwjcIsNotNull() {
            addCriterion("DWJC is not null");
            return (Criteria) this;
        }

        public Criteria andDwjcEqualTo(String value) {
            addCriterion("DWJC =", value, "dwjc");
            return (Criteria) this;
        }

        public Criteria andDwjcNotEqualTo(String value) {
            addCriterion("DWJC <>", value, "dwjc");
            return (Criteria) this;
        }

        public Criteria andDwjcGreaterThan(String value) {
            addCriterion("DWJC >", value, "dwjc");
            return (Criteria) this;
        }

        public Criteria andDwjcGreaterThanOrEqualTo(String value) {
            addCriterion("DWJC >=", value, "dwjc");
            return (Criteria) this;
        }

        public Criteria andDwjcLessThan(String value) {
            addCriterion("DWJC <", value, "dwjc");
            return (Criteria) this;
        }

        public Criteria andDwjcLessThanOrEqualTo(String value) {
            addCriterion("DWJC <=", value, "dwjc");
            return (Criteria) this;
        }

        public Criteria andDwjcLike(String value) {
            addCriterion("DWJC like", value, "dwjc");
            return (Criteria) this;
        }

        public Criteria andDwjcNotLike(String value) {
            addCriterion("DWJC not like", value, "dwjc");
            return (Criteria) this;
        }

        public Criteria andDwjcIn(List<String> values) {
            addCriterion("DWJC in", values, "dwjc");
            return (Criteria) this;
        }

        public Criteria andDwjcNotIn(List<String> values) {
            addCriterion("DWJC not in", values, "dwjc");
            return (Criteria) this;
        }

        public Criteria andDwjcBetween(String value1, String value2) {
            addCriterion("DWJC between", value1, value2, "dwjc");
            return (Criteria) this;
        }

        public Criteria andDwjcNotBetween(String value1, String value2) {
            addCriterion("DWJC not between", value1, value2, "dwjc");
            return (Criteria) this;
        }

        public Criteria andDwdzIsNull() {
            addCriterion("DWDZ is null");
            return (Criteria) this;
        }

        public Criteria andDwdzIsNotNull() {
            addCriterion("DWDZ is not null");
            return (Criteria) this;
        }

        public Criteria andDwdzEqualTo(String value) {
            addCriterion("DWDZ =", value, "dwdz");
            return (Criteria) this;
        }

        public Criteria andDwdzNotEqualTo(String value) {
            addCriterion("DWDZ <>", value, "dwdz");
            return (Criteria) this;
        }

        public Criteria andDwdzGreaterThan(String value) {
            addCriterion("DWDZ >", value, "dwdz");
            return (Criteria) this;
        }

        public Criteria andDwdzGreaterThanOrEqualTo(String value) {
            addCriterion("DWDZ >=", value, "dwdz");
            return (Criteria) this;
        }

        public Criteria andDwdzLessThan(String value) {
            addCriterion("DWDZ <", value, "dwdz");
            return (Criteria) this;
        }

        public Criteria andDwdzLessThanOrEqualTo(String value) {
            addCriterion("DWDZ <=", value, "dwdz");
            return (Criteria) this;
        }

        public Criteria andDwdzLike(String value) {
            addCriterion("DWDZ like", value, "dwdz");
            return (Criteria) this;
        }

        public Criteria andDwdzNotLike(String value) {
            addCriterion("DWDZ not like", value, "dwdz");
            return (Criteria) this;
        }

        public Criteria andDwdzIn(List<String> values) {
            addCriterion("DWDZ in", values, "dwdz");
            return (Criteria) this;
        }

        public Criteria andDwdzNotIn(List<String> values) {
            addCriterion("DWDZ not in", values, "dwdz");
            return (Criteria) this;
        }

        public Criteria andDwdzBetween(String value1, String value2) {
            addCriterion("DWDZ between", value1, value2, "dwdz");
            return (Criteria) this;
        }

        public Criteria andDwdzNotBetween(String value1, String value2) {
            addCriterion("DWDZ not between", value1, value2, "dwdz");
            return (Criteria) this;
        }

        public Criteria andLsdwhIsNull() {
            addCriterion("LSDWH is null");
            return (Criteria) this;
        }

        public Criteria andLsdwhIsNotNull() {
            addCriterion("LSDWH is not null");
            return (Criteria) this;
        }

        public Criteria andLsdwhEqualTo(String value) {
            addCriterion("LSDWH =", value, "lsdwh");
            return (Criteria) this;
        }

        public Criteria andLsdwhNotEqualTo(String value) {
            addCriterion("LSDWH <>", value, "lsdwh");
            return (Criteria) this;
        }

        public Criteria andLsdwhGreaterThan(String value) {
            addCriterion("LSDWH >", value, "lsdwh");
            return (Criteria) this;
        }

        public Criteria andLsdwhGreaterThanOrEqualTo(String value) {
            addCriterion("LSDWH >=", value, "lsdwh");
            return (Criteria) this;
        }

        public Criteria andLsdwhLessThan(String value) {
            addCriterion("LSDWH <", value, "lsdwh");
            return (Criteria) this;
        }

        public Criteria andLsdwhLessThanOrEqualTo(String value) {
            addCriterion("LSDWH <=", value, "lsdwh");
            return (Criteria) this;
        }

        public Criteria andLsdwhLike(String value) {
            addCriterion("LSDWH like", value, "lsdwh");
            return (Criteria) this;
        }

        public Criteria andLsdwhNotLike(String value) {
            addCriterion("LSDWH not like", value, "lsdwh");
            return (Criteria) this;
        }

        public Criteria andLsdwhIn(List<String> values) {
            addCriterion("LSDWH in", values, "lsdwh");
            return (Criteria) this;
        }

        public Criteria andLsdwhNotIn(List<String> values) {
            addCriterion("LSDWH not in", values, "lsdwh");
            return (Criteria) this;
        }

        public Criteria andLsdwhBetween(String value1, String value2) {
            addCriterion("LSDWH between", value1, value2, "lsdwh");
            return (Criteria) this;
        }

        public Criteria andLsdwhNotBetween(String value1, String value2) {
            addCriterion("LSDWH not between", value1, value2, "lsdwh");
            return (Criteria) this;
        }

        public Criteria andJlnyIsNull() {
            addCriterion("JLNY is null");
            return (Criteria) this;
        }

        public Criteria andJlnyIsNotNull() {
            addCriterion("JLNY is not null");
            return (Criteria) this;
        }

        public Criteria andJlnyEqualTo(String value) {
            addCriterion("JLNY =", value, "jlny");
            return (Criteria) this;
        }

        public Criteria andJlnyNotEqualTo(String value) {
            addCriterion("JLNY <>", value, "jlny");
            return (Criteria) this;
        }

        public Criteria andJlnyGreaterThan(String value) {
            addCriterion("JLNY >", value, "jlny");
            return (Criteria) this;
        }

        public Criteria andJlnyGreaterThanOrEqualTo(String value) {
            addCriterion("JLNY >=", value, "jlny");
            return (Criteria) this;
        }

        public Criteria andJlnyLessThan(String value) {
            addCriterion("JLNY <", value, "jlny");
            return (Criteria) this;
        }

        public Criteria andJlnyLessThanOrEqualTo(String value) {
            addCriterion("JLNY <=", value, "jlny");
            return (Criteria) this;
        }

        public Criteria andJlnyLike(String value) {
            addCriterion("JLNY like", value, "jlny");
            return (Criteria) this;
        }

        public Criteria andJlnyNotLike(String value) {
            addCriterion("JLNY not like", value, "jlny");
            return (Criteria) this;
        }

        public Criteria andJlnyIn(List<String> values) {
            addCriterion("JLNY in", values, "jlny");
            return (Criteria) this;
        }

        public Criteria andJlnyNotIn(List<String> values) {
            addCriterion("JLNY not in", values, "jlny");
            return (Criteria) this;
        }

        public Criteria andJlnyBetween(String value1, String value2) {
            addCriterion("JLNY between", value1, value2, "jlny");
            return (Criteria) this;
        }

        public Criteria andJlnyNotBetween(String value1, String value2) {
            addCriterion("JLNY not between", value1, value2, "jlny");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andCjrIsNull() {
            addCriterion("CJR is null");
            return (Criteria) this;
        }

        public Criteria andCjrIsNotNull() {
            addCriterion("CJR is not null");
            return (Criteria) this;
        }

        public Criteria andCjrEqualTo(String value) {
            addCriterion("CJR =", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrNotEqualTo(String value) {
            addCriterion("CJR <>", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrGreaterThan(String value) {
            addCriterion("CJR >", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrGreaterThanOrEqualTo(String value) {
            addCriterion("CJR >=", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrLessThan(String value) {
            addCriterion("CJR <", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrLessThanOrEqualTo(String value) {
            addCriterion("CJR <=", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrLike(String value) {
            addCriterion("CJR like", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrNotLike(String value) {
            addCriterion("CJR not like", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrIn(List<String> values) {
            addCriterion("CJR in", values, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrNotIn(List<String> values) {
            addCriterion("CJR not in", values, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrBetween(String value1, String value2) {
            addCriterion("CJR between", value1, value2, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrNotBetween(String value1, String value2) {
            addCriterion("CJR not between", value1, value2, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNull() {
            addCriterion("CJSJ is null");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNotNull() {
            addCriterion("CJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andCjsjEqualTo(String value) {
            addCriterion("CJSJ =", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotEqualTo(String value) {
            addCriterion("CJSJ <>", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThan(String value) {
            addCriterion("CJSJ >", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThanOrEqualTo(String value) {
            addCriterion("CJSJ >=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThan(String value) {
            addCriterion("CJSJ <", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThanOrEqualTo(String value) {
            addCriterion("CJSJ <=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLike(String value) {
            addCriterion("CJSJ like", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotLike(String value) {
            addCriterion("CJSJ not like", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjIn(List<String> values) {
            addCriterion("CJSJ in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotIn(List<String> values) {
            addCriterion("CJSJ not in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjBetween(String value1, String value2) {
            addCriterion("CJSJ between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotBetween(String value1, String value2) {
            addCriterion("CJSJ not between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andXgrIsNull() {
            addCriterion("XGR is null");
            return (Criteria) this;
        }

        public Criteria andXgrIsNotNull() {
            addCriterion("XGR is not null");
            return (Criteria) this;
        }

        public Criteria andXgrEqualTo(String value) {
            addCriterion("XGR =", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotEqualTo(String value) {
            addCriterion("XGR <>", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrGreaterThan(String value) {
            addCriterion("XGR >", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrGreaterThanOrEqualTo(String value) {
            addCriterion("XGR >=", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrLessThan(String value) {
            addCriterion("XGR <", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrLessThanOrEqualTo(String value) {
            addCriterion("XGR <=", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrLike(String value) {
            addCriterion("XGR like", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotLike(String value) {
            addCriterion("XGR not like", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrIn(List<String> values) {
            addCriterion("XGR in", values, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotIn(List<String> values) {
            addCriterion("XGR not in", values, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrBetween(String value1, String value2) {
            addCriterion("XGR between", value1, value2, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotBetween(String value1, String value2) {
            addCriterion("XGR not between", value1, value2, "xgr");
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

        public Criteria andYlzdIsNull() {
            addCriterion("YLZD is null");
            return (Criteria) this;
        }

        public Criteria andYlzdIsNotNull() {
            addCriterion("YLZD is not null");
            return (Criteria) this;
        }

        public Criteria andYlzdEqualTo(String value) {
            addCriterion("YLZD =", value, "ylzd");
            return (Criteria) this;
        }

        public Criteria andYlzdNotEqualTo(String value) {
            addCriterion("YLZD <>", value, "ylzd");
            return (Criteria) this;
        }

        public Criteria andYlzdGreaterThan(String value) {
            addCriterion("YLZD >", value, "ylzd");
            return (Criteria) this;
        }

        public Criteria andYlzdGreaterThanOrEqualTo(String value) {
            addCriterion("YLZD >=", value, "ylzd");
            return (Criteria) this;
        }

        public Criteria andYlzdLessThan(String value) {
            addCriterion("YLZD <", value, "ylzd");
            return (Criteria) this;
        }

        public Criteria andYlzdLessThanOrEqualTo(String value) {
            addCriterion("YLZD <=", value, "ylzd");
            return (Criteria) this;
        }

        public Criteria andYlzdLike(String value) {
            addCriterion("YLZD like", value, "ylzd");
            return (Criteria) this;
        }

        public Criteria andYlzdNotLike(String value) {
            addCriterion("YLZD not like", value, "ylzd");
            return (Criteria) this;
        }

        public Criteria andYlzdIn(List<String> values) {
            addCriterion("YLZD in", values, "ylzd");
            return (Criteria) this;
        }

        public Criteria andYlzdNotIn(List<String> values) {
            addCriterion("YLZD not in", values, "ylzd");
            return (Criteria) this;
        }

        public Criteria andYlzdBetween(String value1, String value2) {
            addCriterion("YLZD between", value1, value2, "ylzd");
            return (Criteria) this;
        }

        public Criteria andYlzdNotBetween(String value1, String value2) {
            addCriterion("YLZD not between", value1, value2, "ylzd");
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