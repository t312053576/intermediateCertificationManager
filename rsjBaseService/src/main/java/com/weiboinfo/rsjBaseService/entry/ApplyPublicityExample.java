package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class ApplyPublicityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplyPublicityExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("AID is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("AID is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(String value) {
            addCriterion("AID =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(String value) {
            addCriterion("AID <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(String value) {
            addCriterion("AID >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(String value) {
            addCriterion("AID >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(String value) {
            addCriterion("AID <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(String value) {
            addCriterion("AID <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLike(String value) {
            addCriterion("AID like", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotLike(String value) {
            addCriterion("AID not like", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<String> values) {
            addCriterion("AID in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<String> values) {
            addCriterion("AID not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(String value1, String value2) {
            addCriterion("AID between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(String value1, String value2) {
            addCriterion("AID not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andIndexcodeIsNull() {
            addCriterion("INDEXCODE is null");
            return (Criteria) this;
        }

        public Criteria andIndexcodeIsNotNull() {
            addCriterion("INDEXCODE is not null");
            return (Criteria) this;
        }

        public Criteria andIndexcodeEqualTo(String value) {
            addCriterion("INDEXCODE =", value, "indexcode");
            return (Criteria) this;
        }

        public Criteria andIndexcodeNotEqualTo(String value) {
            addCriterion("INDEXCODE <>", value, "indexcode");
            return (Criteria) this;
        }

        public Criteria andIndexcodeGreaterThan(String value) {
            addCriterion("INDEXCODE >", value, "indexcode");
            return (Criteria) this;
        }

        public Criteria andIndexcodeGreaterThanOrEqualTo(String value) {
            addCriterion("INDEXCODE >=", value, "indexcode");
            return (Criteria) this;
        }

        public Criteria andIndexcodeLessThan(String value) {
            addCriterion("INDEXCODE <", value, "indexcode");
            return (Criteria) this;
        }

        public Criteria andIndexcodeLessThanOrEqualTo(String value) {
            addCriterion("INDEXCODE <=", value, "indexcode");
            return (Criteria) this;
        }

        public Criteria andIndexcodeLike(String value) {
            addCriterion("INDEXCODE like", value, "indexcode");
            return (Criteria) this;
        }

        public Criteria andIndexcodeNotLike(String value) {
            addCriterion("INDEXCODE not like", value, "indexcode");
            return (Criteria) this;
        }

        public Criteria andIndexcodeIn(List<String> values) {
            addCriterion("INDEXCODE in", values, "indexcode");
            return (Criteria) this;
        }

        public Criteria andIndexcodeNotIn(List<String> values) {
            addCriterion("INDEXCODE not in", values, "indexcode");
            return (Criteria) this;
        }

        public Criteria andIndexcodeBetween(String value1, String value2) {
            addCriterion("INDEXCODE between", value1, value2, "indexcode");
            return (Criteria) this;
        }

        public Criteria andIndexcodeNotBetween(String value1, String value2) {
            addCriterion("INDEXCODE not between", value1, value2, "indexcode");
            return (Criteria) this;
        }

        public Criteria andApplydescIsNull() {
            addCriterion("APPLYDESC is null");
            return (Criteria) this;
        }

        public Criteria andApplydescIsNotNull() {
            addCriterion("APPLYDESC is not null");
            return (Criteria) this;
        }

        public Criteria andApplydescEqualTo(String value) {
            addCriterion("APPLYDESC =", value, "applydesc");
            return (Criteria) this;
        }

        public Criteria andApplydescNotEqualTo(String value) {
            addCriterion("APPLYDESC <>", value, "applydesc");
            return (Criteria) this;
        }

        public Criteria andApplydescGreaterThan(String value) {
            addCriterion("APPLYDESC >", value, "applydesc");
            return (Criteria) this;
        }

        public Criteria andApplydescGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYDESC >=", value, "applydesc");
            return (Criteria) this;
        }

        public Criteria andApplydescLessThan(String value) {
            addCriterion("APPLYDESC <", value, "applydesc");
            return (Criteria) this;
        }

        public Criteria andApplydescLessThanOrEqualTo(String value) {
            addCriterion("APPLYDESC <=", value, "applydesc");
            return (Criteria) this;
        }

        public Criteria andApplydescLike(String value) {
            addCriterion("APPLYDESC like", value, "applydesc");
            return (Criteria) this;
        }

        public Criteria andApplydescNotLike(String value) {
            addCriterion("APPLYDESC not like", value, "applydesc");
            return (Criteria) this;
        }

        public Criteria andApplydescIn(List<String> values) {
            addCriterion("APPLYDESC in", values, "applydesc");
            return (Criteria) this;
        }

        public Criteria andApplydescNotIn(List<String> values) {
            addCriterion("APPLYDESC not in", values, "applydesc");
            return (Criteria) this;
        }

        public Criteria andApplydescBetween(String value1, String value2) {
            addCriterion("APPLYDESC between", value1, value2, "applydesc");
            return (Criteria) this;
        }

        public Criteria andApplydescNotBetween(String value1, String value2) {
            addCriterion("APPLYDESC not between", value1, value2, "applydesc");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNull() {
            addCriterion("PURPOSE is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("PURPOSE is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(String value) {
            addCriterion("PURPOSE =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(String value) {
            addCriterion("PURPOSE <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(String value) {
            addCriterion("PURPOSE >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("PURPOSE >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(String value) {
            addCriterion("PURPOSE <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(String value) {
            addCriterion("PURPOSE <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLike(String value) {
            addCriterion("PURPOSE like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotLike(String value) {
            addCriterion("PURPOSE not like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<String> values) {
            addCriterion("PURPOSE in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<String> values) {
            addCriterion("PURPOSE not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(String value1, String value2) {
            addCriterion("PURPOSE between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(String value1, String value2) {
            addCriterion("PURPOSE not between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andApplyertypeIsNull() {
            addCriterion("APPLYERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andApplyertypeIsNotNull() {
            addCriterion("APPLYERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyertypeEqualTo(String value) {
            addCriterion("APPLYERTYPE =", value, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyertypeNotEqualTo(String value) {
            addCriterion("APPLYERTYPE <>", value, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyertypeGreaterThan(String value) {
            addCriterion("APPLYERTYPE >", value, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyertypeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYERTYPE >=", value, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyertypeLessThan(String value) {
            addCriterion("APPLYERTYPE <", value, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyertypeLessThanOrEqualTo(String value) {
            addCriterion("APPLYERTYPE <=", value, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyertypeLike(String value) {
            addCriterion("APPLYERTYPE like", value, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyertypeNotLike(String value) {
            addCriterion("APPLYERTYPE not like", value, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyertypeIn(List<String> values) {
            addCriterion("APPLYERTYPE in", values, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyertypeNotIn(List<String> values) {
            addCriterion("APPLYERTYPE not in", values, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyertypeBetween(String value1, String value2) {
            addCriterion("APPLYERTYPE between", value1, value2, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyertypeNotBetween(String value1, String value2) {
            addCriterion("APPLYERTYPE not between", value1, value2, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyeridIsNull() {
            addCriterion("APPLYERID is null");
            return (Criteria) this;
        }

        public Criteria andApplyeridIsNotNull() {
            addCriterion("APPLYERID is not null");
            return (Criteria) this;
        }

        public Criteria andApplyeridEqualTo(String value) {
            addCriterion("APPLYERID =", value, "applyerid");
            return (Criteria) this;
        }

        public Criteria andApplyeridNotEqualTo(String value) {
            addCriterion("APPLYERID <>", value, "applyerid");
            return (Criteria) this;
        }

        public Criteria andApplyeridGreaterThan(String value) {
            addCriterion("APPLYERID >", value, "applyerid");
            return (Criteria) this;
        }

        public Criteria andApplyeridGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYERID >=", value, "applyerid");
            return (Criteria) this;
        }

        public Criteria andApplyeridLessThan(String value) {
            addCriterion("APPLYERID <", value, "applyerid");
            return (Criteria) this;
        }

        public Criteria andApplyeridLessThanOrEqualTo(String value) {
            addCriterion("APPLYERID <=", value, "applyerid");
            return (Criteria) this;
        }

        public Criteria andApplyeridLike(String value) {
            addCriterion("APPLYERID like", value, "applyerid");
            return (Criteria) this;
        }

        public Criteria andApplyeridNotLike(String value) {
            addCriterion("APPLYERID not like", value, "applyerid");
            return (Criteria) this;
        }

        public Criteria andApplyeridIn(List<String> values) {
            addCriterion("APPLYERID in", values, "applyerid");
            return (Criteria) this;
        }

        public Criteria andApplyeridNotIn(List<String> values) {
            addCriterion("APPLYERID not in", values, "applyerid");
            return (Criteria) this;
        }

        public Criteria andApplyeridBetween(String value1, String value2) {
            addCriterion("APPLYERID between", value1, value2, "applyerid");
            return (Criteria) this;
        }

        public Criteria andApplyeridNotBetween(String value1, String value2) {
            addCriterion("APPLYERID not between", value1, value2, "applyerid");
            return (Criteria) this;
        }

        public Criteria andSearchcodeIsNull() {
            addCriterion("SEARCHCODE is null");
            return (Criteria) this;
        }

        public Criteria andSearchcodeIsNotNull() {
            addCriterion("SEARCHCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSearchcodeEqualTo(String value) {
            addCriterion("SEARCHCODE =", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeNotEqualTo(String value) {
            addCriterion("SEARCHCODE <>", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeGreaterThan(String value) {
            addCriterion("SEARCHCODE >", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SEARCHCODE >=", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeLessThan(String value) {
            addCriterion("SEARCHCODE <", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeLessThanOrEqualTo(String value) {
            addCriterion("SEARCHCODE <=", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeLike(String value) {
            addCriterion("SEARCHCODE like", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeNotLike(String value) {
            addCriterion("SEARCHCODE not like", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeIn(List<String> values) {
            addCriterion("SEARCHCODE in", values, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeNotIn(List<String> values) {
            addCriterion("SEARCHCODE not in", values, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeBetween(String value1, String value2) {
            addCriterion("SEARCHCODE between", value1, value2, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeNotBetween(String value1, String value2) {
            addCriterion("SEARCHCODE not between", value1, value2, "searchcode");
            return (Criteria) this;
        }

        public Criteria andReplystatusIsNull() {
            addCriterion("REPLYSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andReplystatusIsNotNull() {
            addCriterion("REPLYSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andReplystatusEqualTo(String value) {
            addCriterion("REPLYSTATUS =", value, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplystatusNotEqualTo(String value) {
            addCriterion("REPLYSTATUS <>", value, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplystatusGreaterThan(String value) {
            addCriterion("REPLYSTATUS >", value, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplystatusGreaterThanOrEqualTo(String value) {
            addCriterion("REPLYSTATUS >=", value, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplystatusLessThan(String value) {
            addCriterion("REPLYSTATUS <", value, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplystatusLessThanOrEqualTo(String value) {
            addCriterion("REPLYSTATUS <=", value, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplystatusLike(String value) {
            addCriterion("REPLYSTATUS like", value, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplystatusNotLike(String value) {
            addCriterion("REPLYSTATUS not like", value, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplystatusIn(List<String> values) {
            addCriterion("REPLYSTATUS in", values, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplystatusNotIn(List<String> values) {
            addCriterion("REPLYSTATUS not in", values, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplystatusBetween(String value1, String value2) {
            addCriterion("REPLYSTATUS between", value1, value2, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplystatusNotBetween(String value1, String value2) {
            addCriterion("REPLYSTATUS not between", value1, value2, "replystatus");
            return (Criteria) this;
        }

        public Criteria andReplycontentIsNull() {
            addCriterion("REPLYCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andReplycontentIsNotNull() {
            addCriterion("REPLYCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andReplycontentEqualTo(String value) {
            addCriterion("REPLYCONTENT =", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotEqualTo(String value) {
            addCriterion("REPLYCONTENT <>", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentGreaterThan(String value) {
            addCriterion("REPLYCONTENT >", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentGreaterThanOrEqualTo(String value) {
            addCriterion("REPLYCONTENT >=", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentLessThan(String value) {
            addCriterion("REPLYCONTENT <", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentLessThanOrEqualTo(String value) {
            addCriterion("REPLYCONTENT <=", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentLike(String value) {
            addCriterion("REPLYCONTENT like", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotLike(String value) {
            addCriterion("REPLYCONTENT not like", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentIn(List<String> values) {
            addCriterion("REPLYCONTENT in", values, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotIn(List<String> values) {
            addCriterion("REPLYCONTENT not in", values, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentBetween(String value1, String value2) {
            addCriterion("REPLYCONTENT between", value1, value2, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotBetween(String value1, String value2) {
            addCriterion("REPLYCONTENT not between", value1, value2, "replycontent");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("CREATETIME like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("CREATETIME not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andReplytimeIsNull() {
            addCriterion("REPLYTIME is null");
            return (Criteria) this;
        }

        public Criteria andReplytimeIsNotNull() {
            addCriterion("REPLYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andReplytimeEqualTo(String value) {
            addCriterion("REPLYTIME =", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotEqualTo(String value) {
            addCriterion("REPLYTIME <>", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeGreaterThan(String value) {
            addCriterion("REPLYTIME >", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeGreaterThanOrEqualTo(String value) {
            addCriterion("REPLYTIME >=", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLessThan(String value) {
            addCriterion("REPLYTIME <", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLessThanOrEqualTo(String value) {
            addCriterion("REPLYTIME <=", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLike(String value) {
            addCriterion("REPLYTIME like", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotLike(String value) {
            addCriterion("REPLYTIME not like", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeIn(List<String> values) {
            addCriterion("REPLYTIME in", values, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotIn(List<String> values) {
            addCriterion("REPLYTIME not in", values, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeBetween(String value1, String value2) {
            addCriterion("REPLYTIME between", value1, value2, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotBetween(String value1, String value2) {
            addCriterion("REPLYTIME not between", value1, value2, "replytime");
            return (Criteria) this;
        }

        public Criteria andIsinoaIsNull() {
            addCriterion("ISINOA is null");
            return (Criteria) this;
        }

        public Criteria andIsinoaIsNotNull() {
            addCriterion("ISINOA is not null");
            return (Criteria) this;
        }

        public Criteria andIsinoaEqualTo(String value) {
            addCriterion("ISINOA =", value, "isinoa");
            return (Criteria) this;
        }

        public Criteria andIsinoaNotEqualTo(String value) {
            addCriterion("ISINOA <>", value, "isinoa");
            return (Criteria) this;
        }

        public Criteria andIsinoaGreaterThan(String value) {
            addCriterion("ISINOA >", value, "isinoa");
            return (Criteria) this;
        }

        public Criteria andIsinoaGreaterThanOrEqualTo(String value) {
            addCriterion("ISINOA >=", value, "isinoa");
            return (Criteria) this;
        }

        public Criteria andIsinoaLessThan(String value) {
            addCriterion("ISINOA <", value, "isinoa");
            return (Criteria) this;
        }

        public Criteria andIsinoaLessThanOrEqualTo(String value) {
            addCriterion("ISINOA <=", value, "isinoa");
            return (Criteria) this;
        }

        public Criteria andIsinoaLike(String value) {
            addCriterion("ISINOA like", value, "isinoa");
            return (Criteria) this;
        }

        public Criteria andIsinoaNotLike(String value) {
            addCriterion("ISINOA not like", value, "isinoa");
            return (Criteria) this;
        }

        public Criteria andIsinoaIn(List<String> values) {
            addCriterion("ISINOA in", values, "isinoa");
            return (Criteria) this;
        }

        public Criteria andIsinoaNotIn(List<String> values) {
            addCriterion("ISINOA not in", values, "isinoa");
            return (Criteria) this;
        }

        public Criteria andIsinoaBetween(String value1, String value2) {
            addCriterion("ISINOA between", value1, value2, "isinoa");
            return (Criteria) this;
        }

        public Criteria andIsinoaNotBetween(String value1, String value2) {
            addCriterion("ISINOA not between", value1, value2, "isinoa");
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