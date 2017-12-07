package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class FrmSecondFunctionUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrmSecondFunctionUserExample() {
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

        public Criteria andSecondfunctionuseridIsNull() {
            addCriterion("SECONDFUNCTIONUSERID is null");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuseridIsNotNull() {
            addCriterion("SECONDFUNCTIONUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuseridEqualTo(String value) {
            addCriterion("SECONDFUNCTIONUSERID =", value, "secondfunctionuserid");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuseridNotEqualTo(String value) {
            addCriterion("SECONDFUNCTIONUSERID <>", value, "secondfunctionuserid");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuseridGreaterThan(String value) {
            addCriterion("SECONDFUNCTIONUSERID >", value, "secondfunctionuserid");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuseridGreaterThanOrEqualTo(String value) {
            addCriterion("SECONDFUNCTIONUSERID >=", value, "secondfunctionuserid");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuseridLessThan(String value) {
            addCriterion("SECONDFUNCTIONUSERID <", value, "secondfunctionuserid");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuseridLessThanOrEqualTo(String value) {
            addCriterion("SECONDFUNCTIONUSERID <=", value, "secondfunctionuserid");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuseridLike(String value) {
            addCriterion("SECONDFUNCTIONUSERID like", value, "secondfunctionuserid");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuseridNotLike(String value) {
            addCriterion("SECONDFUNCTIONUSERID not like", value, "secondfunctionuserid");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuseridIn(List<String> values) {
            addCriterion("SECONDFUNCTIONUSERID in", values, "secondfunctionuserid");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuseridNotIn(List<String> values) {
            addCriterion("SECONDFUNCTIONUSERID not in", values, "secondfunctionuserid");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuseridBetween(String value1, String value2) {
            addCriterion("SECONDFUNCTIONUSERID between", value1, value2, "secondfunctionuserid");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuseridNotBetween(String value1, String value2) {
            addCriterion("SECONDFUNCTIONUSERID not between", value1, value2, "secondfunctionuserid");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuserauthtimeIsNull() {
            addCriterion("SECONDFUNCTIONUSERAUTHTIME is null");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuserauthtimeIsNotNull() {
            addCriterion("SECONDFUNCTIONUSERAUTHTIME is not null");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuserauthtimeEqualTo(String value) {
            addCriterion("SECONDFUNCTIONUSERAUTHTIME =", value, "secondfunctionuserauthtime");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuserauthtimeNotEqualTo(String value) {
            addCriterion("SECONDFUNCTIONUSERAUTHTIME <>", value, "secondfunctionuserauthtime");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuserauthtimeGreaterThan(String value) {
            addCriterion("SECONDFUNCTIONUSERAUTHTIME >", value, "secondfunctionuserauthtime");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuserauthtimeGreaterThanOrEqualTo(String value) {
            addCriterion("SECONDFUNCTIONUSERAUTHTIME >=", value, "secondfunctionuserauthtime");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuserauthtimeLessThan(String value) {
            addCriterion("SECONDFUNCTIONUSERAUTHTIME <", value, "secondfunctionuserauthtime");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuserauthtimeLessThanOrEqualTo(String value) {
            addCriterion("SECONDFUNCTIONUSERAUTHTIME <=", value, "secondfunctionuserauthtime");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuserauthtimeLike(String value) {
            addCriterion("SECONDFUNCTIONUSERAUTHTIME like", value, "secondfunctionuserauthtime");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuserauthtimeNotLike(String value) {
            addCriterion("SECONDFUNCTIONUSERAUTHTIME not like", value, "secondfunctionuserauthtime");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuserauthtimeIn(List<String> values) {
            addCriterion("SECONDFUNCTIONUSERAUTHTIME in", values, "secondfunctionuserauthtime");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuserauthtimeNotIn(List<String> values) {
            addCriterion("SECONDFUNCTIONUSERAUTHTIME not in", values, "secondfunctionuserauthtime");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuserauthtimeBetween(String value1, String value2) {
            addCriterion("SECONDFUNCTIONUSERAUTHTIME between", value1, value2, "secondfunctionuserauthtime");
            return (Criteria) this;
        }

        public Criteria andSecondfunctionuserauthtimeNotBetween(String value1, String value2) {
            addCriterion("SECONDFUNCTIONUSERAUTHTIME not between", value1, value2, "secondfunctionuserauthtime");
            return (Criteria) this;
        }

        public Criteria andSourceuseridIsNull() {
            addCriterion("SOURCEUSERID is null");
            return (Criteria) this;
        }

        public Criteria andSourceuseridIsNotNull() {
            addCriterion("SOURCEUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andSourceuseridEqualTo(String value) {
            addCriterion("SOURCEUSERID =", value, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridNotEqualTo(String value) {
            addCriterion("SOURCEUSERID <>", value, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridGreaterThan(String value) {
            addCriterion("SOURCEUSERID >", value, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCEUSERID >=", value, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridLessThan(String value) {
            addCriterion("SOURCEUSERID <", value, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridLessThanOrEqualTo(String value) {
            addCriterion("SOURCEUSERID <=", value, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridLike(String value) {
            addCriterion("SOURCEUSERID like", value, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridNotLike(String value) {
            addCriterion("SOURCEUSERID not like", value, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridIn(List<String> values) {
            addCriterion("SOURCEUSERID in", values, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridNotIn(List<String> values) {
            addCriterion("SOURCEUSERID not in", values, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridBetween(String value1, String value2) {
            addCriterion("SOURCEUSERID between", value1, value2, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridNotBetween(String value1, String value2) {
            addCriterion("SOURCEUSERID not between", value1, value2, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeIsNull() {
            addCriterion("AUTHSTARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeIsNotNull() {
            addCriterion("AUTHSTARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeEqualTo(String value) {
            addCriterion("AUTHSTARTTIME =", value, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeNotEqualTo(String value) {
            addCriterion("AUTHSTARTTIME <>", value, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeGreaterThan(String value) {
            addCriterion("AUTHSTARTTIME >", value, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHSTARTTIME >=", value, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeLessThan(String value) {
            addCriterion("AUTHSTARTTIME <", value, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeLessThanOrEqualTo(String value) {
            addCriterion("AUTHSTARTTIME <=", value, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeLike(String value) {
            addCriterion("AUTHSTARTTIME like", value, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeNotLike(String value) {
            addCriterion("AUTHSTARTTIME not like", value, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeIn(List<String> values) {
            addCriterion("AUTHSTARTTIME in", values, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeNotIn(List<String> values) {
            addCriterion("AUTHSTARTTIME not in", values, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeBetween(String value1, String value2) {
            addCriterion("AUTHSTARTTIME between", value1, value2, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthstarttimeNotBetween(String value1, String value2) {
            addCriterion("AUTHSTARTTIME not between", value1, value2, "authstarttime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeIsNull() {
            addCriterion("AUTHENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeIsNotNull() {
            addCriterion("AUTHENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeEqualTo(String value) {
            addCriterion("AUTHENDTIME =", value, "authendtime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeNotEqualTo(String value) {
            addCriterion("AUTHENDTIME <>", value, "authendtime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeGreaterThan(String value) {
            addCriterion("AUTHENDTIME >", value, "authendtime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHENDTIME >=", value, "authendtime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeLessThan(String value) {
            addCriterion("AUTHENDTIME <", value, "authendtime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeLessThanOrEqualTo(String value) {
            addCriterion("AUTHENDTIME <=", value, "authendtime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeLike(String value) {
            addCriterion("AUTHENDTIME like", value, "authendtime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeNotLike(String value) {
            addCriterion("AUTHENDTIME not like", value, "authendtime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeIn(List<String> values) {
            addCriterion("AUTHENDTIME in", values, "authendtime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeNotIn(List<String> values) {
            addCriterion("AUTHENDTIME not in", values, "authendtime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeBetween(String value1, String value2) {
            addCriterion("AUTHENDTIME between", value1, value2, "authendtime");
            return (Criteria) this;
        }

        public Criteria andAuthendtimeNotBetween(String value1, String value2) {
            addCriterion("AUTHENDTIME not between", value1, value2, "authendtime");
            return (Criteria) this;
        }

        public Criteria andTargetuseridIsNull() {
            addCriterion("TARGETUSERID is null");
            return (Criteria) this;
        }

        public Criteria andTargetuseridIsNotNull() {
            addCriterion("TARGETUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andTargetuseridEqualTo(String value) {
            addCriterion("TARGETUSERID =", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridNotEqualTo(String value) {
            addCriterion("TARGETUSERID <>", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridGreaterThan(String value) {
            addCriterion("TARGETUSERID >", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridGreaterThanOrEqualTo(String value) {
            addCriterion("TARGETUSERID >=", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridLessThan(String value) {
            addCriterion("TARGETUSERID <", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridLessThanOrEqualTo(String value) {
            addCriterion("TARGETUSERID <=", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridLike(String value) {
            addCriterion("TARGETUSERID like", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridNotLike(String value) {
            addCriterion("TARGETUSERID not like", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridIn(List<String> values) {
            addCriterion("TARGETUSERID in", values, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridNotIn(List<String> values) {
            addCriterion("TARGETUSERID not in", values, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridBetween(String value1, String value2) {
            addCriterion("TARGETUSERID between", value1, value2, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridNotBetween(String value1, String value2) {
            addCriterion("TARGETUSERID not between", value1, value2, "targetuserid");
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