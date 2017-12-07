package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class FrmFunctionCellExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrmFunctionCellExample() {
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

        public Criteria andFuceidIsNull() {
            addCriterion("FUCEID is null");
            return (Criteria) this;
        }

        public Criteria andFuceidIsNotNull() {
            addCriterion("FUCEID is not null");
            return (Criteria) this;
        }

        public Criteria andFuceidEqualTo(String value) {
            addCriterion("FUCEID =", value, "fuceid");
            return (Criteria) this;
        }

        public Criteria andFuceidNotEqualTo(String value) {
            addCriterion("FUCEID <>", value, "fuceid");
            return (Criteria) this;
        }

        public Criteria andFuceidGreaterThan(String value) {
            addCriterion("FUCEID >", value, "fuceid");
            return (Criteria) this;
        }

        public Criteria andFuceidGreaterThanOrEqualTo(String value) {
            addCriterion("FUCEID >=", value, "fuceid");
            return (Criteria) this;
        }

        public Criteria andFuceidLessThan(String value) {
            addCriterion("FUCEID <", value, "fuceid");
            return (Criteria) this;
        }

        public Criteria andFuceidLessThanOrEqualTo(String value) {
            addCriterion("FUCEID <=", value, "fuceid");
            return (Criteria) this;
        }

        public Criteria andFuceidLike(String value) {
            addCriterion("FUCEID like", value, "fuceid");
            return (Criteria) this;
        }

        public Criteria andFuceidNotLike(String value) {
            addCriterion("FUCEID not like", value, "fuceid");
            return (Criteria) this;
        }

        public Criteria andFuceidIn(List<String> values) {
            addCriterion("FUCEID in", values, "fuceid");
            return (Criteria) this;
        }

        public Criteria andFuceidNotIn(List<String> values) {
            addCriterion("FUCEID not in", values, "fuceid");
            return (Criteria) this;
        }

        public Criteria andFuceidBetween(String value1, String value2) {
            addCriterion("FUCEID between", value1, value2, "fuceid");
            return (Criteria) this;
        }

        public Criteria andFuceidNotBetween(String value1, String value2) {
            addCriterion("FUCEID not between", value1, value2, "fuceid");
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

        public Criteria andFucenameIsNull() {
            addCriterion("FUCENAME is null");
            return (Criteria) this;
        }

        public Criteria andFucenameIsNotNull() {
            addCriterion("FUCENAME is not null");
            return (Criteria) this;
        }

        public Criteria andFucenameEqualTo(String value) {
            addCriterion("FUCENAME =", value, "fucename");
            return (Criteria) this;
        }

        public Criteria andFucenameNotEqualTo(String value) {
            addCriterion("FUCENAME <>", value, "fucename");
            return (Criteria) this;
        }

        public Criteria andFucenameGreaterThan(String value) {
            addCriterion("FUCENAME >", value, "fucename");
            return (Criteria) this;
        }

        public Criteria andFucenameGreaterThanOrEqualTo(String value) {
            addCriterion("FUCENAME >=", value, "fucename");
            return (Criteria) this;
        }

        public Criteria andFucenameLessThan(String value) {
            addCriterion("FUCENAME <", value, "fucename");
            return (Criteria) this;
        }

        public Criteria andFucenameLessThanOrEqualTo(String value) {
            addCriterion("FUCENAME <=", value, "fucename");
            return (Criteria) this;
        }

        public Criteria andFucenameLike(String value) {
            addCriterion("FUCENAME like", value, "fucename");
            return (Criteria) this;
        }

        public Criteria andFucenameNotLike(String value) {
            addCriterion("FUCENAME not like", value, "fucename");
            return (Criteria) this;
        }

        public Criteria andFucenameIn(List<String> values) {
            addCriterion("FUCENAME in", values, "fucename");
            return (Criteria) this;
        }

        public Criteria andFucenameNotIn(List<String> values) {
            addCriterion("FUCENAME not in", values, "fucename");
            return (Criteria) this;
        }

        public Criteria andFucenameBetween(String value1, String value2) {
            addCriterion("FUCENAME between", value1, value2, "fucename");
            return (Criteria) this;
        }

        public Criteria andFucenameNotBetween(String value1, String value2) {
            addCriterion("FUCENAME not between", value1, value2, "fucename");
            return (Criteria) this;
        }

        public Criteria andFucelevelIsNull() {
            addCriterion("FUCELEVEL is null");
            return (Criteria) this;
        }

        public Criteria andFucelevelIsNotNull() {
            addCriterion("FUCELEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andFucelevelEqualTo(String value) {
            addCriterion("FUCELEVEL =", value, "fucelevel");
            return (Criteria) this;
        }

        public Criteria andFucelevelNotEqualTo(String value) {
            addCriterion("FUCELEVEL <>", value, "fucelevel");
            return (Criteria) this;
        }

        public Criteria andFucelevelGreaterThan(String value) {
            addCriterion("FUCELEVEL >", value, "fucelevel");
            return (Criteria) this;
        }

        public Criteria andFucelevelGreaterThanOrEqualTo(String value) {
            addCriterion("FUCELEVEL >=", value, "fucelevel");
            return (Criteria) this;
        }

        public Criteria andFucelevelLessThan(String value) {
            addCriterion("FUCELEVEL <", value, "fucelevel");
            return (Criteria) this;
        }

        public Criteria andFucelevelLessThanOrEqualTo(String value) {
            addCriterion("FUCELEVEL <=", value, "fucelevel");
            return (Criteria) this;
        }

        public Criteria andFucelevelLike(String value) {
            addCriterion("FUCELEVEL like", value, "fucelevel");
            return (Criteria) this;
        }

        public Criteria andFucelevelNotLike(String value) {
            addCriterion("FUCELEVEL not like", value, "fucelevel");
            return (Criteria) this;
        }

        public Criteria andFucelevelIn(List<String> values) {
            addCriterion("FUCELEVEL in", values, "fucelevel");
            return (Criteria) this;
        }

        public Criteria andFucelevelNotIn(List<String> values) {
            addCriterion("FUCELEVEL not in", values, "fucelevel");
            return (Criteria) this;
        }

        public Criteria andFucelevelBetween(String value1, String value2) {
            addCriterion("FUCELEVEL between", value1, value2, "fucelevel");
            return (Criteria) this;
        }

        public Criteria andFucelevelNotBetween(String value1, String value2) {
            addCriterion("FUCELEVEL not between", value1, value2, "fucelevel");
            return (Criteria) this;
        }

        public Criteria andFucedescIsNull() {
            addCriterion("FUCEDESC is null");
            return (Criteria) this;
        }

        public Criteria andFucedescIsNotNull() {
            addCriterion("FUCEDESC is not null");
            return (Criteria) this;
        }

        public Criteria andFucedescEqualTo(String value) {
            addCriterion("FUCEDESC =", value, "fucedesc");
            return (Criteria) this;
        }

        public Criteria andFucedescNotEqualTo(String value) {
            addCriterion("FUCEDESC <>", value, "fucedesc");
            return (Criteria) this;
        }

        public Criteria andFucedescGreaterThan(String value) {
            addCriterion("FUCEDESC >", value, "fucedesc");
            return (Criteria) this;
        }

        public Criteria andFucedescGreaterThanOrEqualTo(String value) {
            addCriterion("FUCEDESC >=", value, "fucedesc");
            return (Criteria) this;
        }

        public Criteria andFucedescLessThan(String value) {
            addCriterion("FUCEDESC <", value, "fucedesc");
            return (Criteria) this;
        }

        public Criteria andFucedescLessThanOrEqualTo(String value) {
            addCriterion("FUCEDESC <=", value, "fucedesc");
            return (Criteria) this;
        }

        public Criteria andFucedescLike(String value) {
            addCriterion("FUCEDESC like", value, "fucedesc");
            return (Criteria) this;
        }

        public Criteria andFucedescNotLike(String value) {
            addCriterion("FUCEDESC not like", value, "fucedesc");
            return (Criteria) this;
        }

        public Criteria andFucedescIn(List<String> values) {
            addCriterion("FUCEDESC in", values, "fucedesc");
            return (Criteria) this;
        }

        public Criteria andFucedescNotIn(List<String> values) {
            addCriterion("FUCEDESC not in", values, "fucedesc");
            return (Criteria) this;
        }

        public Criteria andFucedescBetween(String value1, String value2) {
            addCriterion("FUCEDESC between", value1, value2, "fucedesc");
            return (Criteria) this;
        }

        public Criteria andFucedescNotBetween(String value1, String value2) {
            addCriterion("FUCEDESC not between", value1, value2, "fucedesc");
            return (Criteria) this;
        }

        public Criteria andFuceresourceIsNull() {
            addCriterion("FUCERESOURCE is null");
            return (Criteria) this;
        }

        public Criteria andFuceresourceIsNotNull() {
            addCriterion("FUCERESOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andFuceresourceEqualTo(String value) {
            addCriterion("FUCERESOURCE =", value, "fuceresource");
            return (Criteria) this;
        }

        public Criteria andFuceresourceNotEqualTo(String value) {
            addCriterion("FUCERESOURCE <>", value, "fuceresource");
            return (Criteria) this;
        }

        public Criteria andFuceresourceGreaterThan(String value) {
            addCriterion("FUCERESOURCE >", value, "fuceresource");
            return (Criteria) this;
        }

        public Criteria andFuceresourceGreaterThanOrEqualTo(String value) {
            addCriterion("FUCERESOURCE >=", value, "fuceresource");
            return (Criteria) this;
        }

        public Criteria andFuceresourceLessThan(String value) {
            addCriterion("FUCERESOURCE <", value, "fuceresource");
            return (Criteria) this;
        }

        public Criteria andFuceresourceLessThanOrEqualTo(String value) {
            addCriterion("FUCERESOURCE <=", value, "fuceresource");
            return (Criteria) this;
        }

        public Criteria andFuceresourceLike(String value) {
            addCriterion("FUCERESOURCE like", value, "fuceresource");
            return (Criteria) this;
        }

        public Criteria andFuceresourceNotLike(String value) {
            addCriterion("FUCERESOURCE not like", value, "fuceresource");
            return (Criteria) this;
        }

        public Criteria andFuceresourceIn(List<String> values) {
            addCriterion("FUCERESOURCE in", values, "fuceresource");
            return (Criteria) this;
        }

        public Criteria andFuceresourceNotIn(List<String> values) {
            addCriterion("FUCERESOURCE not in", values, "fuceresource");
            return (Criteria) this;
        }

        public Criteria andFuceresourceBetween(String value1, String value2) {
            addCriterion("FUCERESOURCE between", value1, value2, "fuceresource");
            return (Criteria) this;
        }

        public Criteria andFuceresourceNotBetween(String value1, String value2) {
            addCriterion("FUCERESOURCE not between", value1, value2, "fuceresource");
            return (Criteria) this;
        }

        public Criteria andFuceiconurlIsNull() {
            addCriterion("FUCEICONURL is null");
            return (Criteria) this;
        }

        public Criteria andFuceiconurlIsNotNull() {
            addCriterion("FUCEICONURL is not null");
            return (Criteria) this;
        }

        public Criteria andFuceiconurlEqualTo(String value) {
            addCriterion("FUCEICONURL =", value, "fuceiconurl");
            return (Criteria) this;
        }

        public Criteria andFuceiconurlNotEqualTo(String value) {
            addCriterion("FUCEICONURL <>", value, "fuceiconurl");
            return (Criteria) this;
        }

        public Criteria andFuceiconurlGreaterThan(String value) {
            addCriterion("FUCEICONURL >", value, "fuceiconurl");
            return (Criteria) this;
        }

        public Criteria andFuceiconurlGreaterThanOrEqualTo(String value) {
            addCriterion("FUCEICONURL >=", value, "fuceiconurl");
            return (Criteria) this;
        }

        public Criteria andFuceiconurlLessThan(String value) {
            addCriterion("FUCEICONURL <", value, "fuceiconurl");
            return (Criteria) this;
        }

        public Criteria andFuceiconurlLessThanOrEqualTo(String value) {
            addCriterion("FUCEICONURL <=", value, "fuceiconurl");
            return (Criteria) this;
        }

        public Criteria andFuceiconurlLike(String value) {
            addCriterion("FUCEICONURL like", value, "fuceiconurl");
            return (Criteria) this;
        }

        public Criteria andFuceiconurlNotLike(String value) {
            addCriterion("FUCEICONURL not like", value, "fuceiconurl");
            return (Criteria) this;
        }

        public Criteria andFuceiconurlIn(List<String> values) {
            addCriterion("FUCEICONURL in", values, "fuceiconurl");
            return (Criteria) this;
        }

        public Criteria andFuceiconurlNotIn(List<String> values) {
            addCriterion("FUCEICONURL not in", values, "fuceiconurl");
            return (Criteria) this;
        }

        public Criteria andFuceiconurlBetween(String value1, String value2) {
            addCriterion("FUCEICONURL between", value1, value2, "fuceiconurl");
            return (Criteria) this;
        }

        public Criteria andFuceiconurlNotBetween(String value1, String value2) {
            addCriterion("FUCEICONURL not between", value1, value2, "fuceiconurl");
            return (Criteria) this;
        }

        public Criteria andFucedefaultpageIsNull() {
            addCriterion("FUCEDEFAULTPAGE is null");
            return (Criteria) this;
        }

        public Criteria andFucedefaultpageIsNotNull() {
            addCriterion("FUCEDEFAULTPAGE is not null");
            return (Criteria) this;
        }

        public Criteria andFucedefaultpageEqualTo(String value) {
            addCriterion("FUCEDEFAULTPAGE =", value, "fucedefaultpage");
            return (Criteria) this;
        }

        public Criteria andFucedefaultpageNotEqualTo(String value) {
            addCriterion("FUCEDEFAULTPAGE <>", value, "fucedefaultpage");
            return (Criteria) this;
        }

        public Criteria andFucedefaultpageGreaterThan(String value) {
            addCriterion("FUCEDEFAULTPAGE >", value, "fucedefaultpage");
            return (Criteria) this;
        }

        public Criteria andFucedefaultpageGreaterThanOrEqualTo(String value) {
            addCriterion("FUCEDEFAULTPAGE >=", value, "fucedefaultpage");
            return (Criteria) this;
        }

        public Criteria andFucedefaultpageLessThan(String value) {
            addCriterion("FUCEDEFAULTPAGE <", value, "fucedefaultpage");
            return (Criteria) this;
        }

        public Criteria andFucedefaultpageLessThanOrEqualTo(String value) {
            addCriterion("FUCEDEFAULTPAGE <=", value, "fucedefaultpage");
            return (Criteria) this;
        }

        public Criteria andFucedefaultpageLike(String value) {
            addCriterion("FUCEDEFAULTPAGE like", value, "fucedefaultpage");
            return (Criteria) this;
        }

        public Criteria andFucedefaultpageNotLike(String value) {
            addCriterion("FUCEDEFAULTPAGE not like", value, "fucedefaultpage");
            return (Criteria) this;
        }

        public Criteria andFucedefaultpageIn(List<String> values) {
            addCriterion("FUCEDEFAULTPAGE in", values, "fucedefaultpage");
            return (Criteria) this;
        }

        public Criteria andFucedefaultpageNotIn(List<String> values) {
            addCriterion("FUCEDEFAULTPAGE not in", values, "fucedefaultpage");
            return (Criteria) this;
        }

        public Criteria andFucedefaultpageBetween(String value1, String value2) {
            addCriterion("FUCEDEFAULTPAGE between", value1, value2, "fucedefaultpage");
            return (Criteria) this;
        }

        public Criteria andFucedefaultpageNotBetween(String value1, String value2) {
            addCriterion("FUCEDEFAULTPAGE not between", value1, value2, "fucedefaultpage");
            return (Criteria) this;
        }

        public Criteria andFuceindexIsNull() {
            addCriterion("FUCEINDEX is null");
            return (Criteria) this;
        }

        public Criteria andFuceindexIsNotNull() {
            addCriterion("FUCEINDEX is not null");
            return (Criteria) this;
        }

        public Criteria andFuceindexEqualTo(String value) {
            addCriterion("FUCEINDEX =", value, "fuceindex");
            return (Criteria) this;
        }

        public Criteria andFuceindexNotEqualTo(String value) {
            addCriterion("FUCEINDEX <>", value, "fuceindex");
            return (Criteria) this;
        }

        public Criteria andFuceindexGreaterThan(String value) {
            addCriterion("FUCEINDEX >", value, "fuceindex");
            return (Criteria) this;
        }

        public Criteria andFuceindexGreaterThanOrEqualTo(String value) {
            addCriterion("FUCEINDEX >=", value, "fuceindex");
            return (Criteria) this;
        }

        public Criteria andFuceindexLessThan(String value) {
            addCriterion("FUCEINDEX <", value, "fuceindex");
            return (Criteria) this;
        }

        public Criteria andFuceindexLessThanOrEqualTo(String value) {
            addCriterion("FUCEINDEX <=", value, "fuceindex");
            return (Criteria) this;
        }

        public Criteria andFuceindexLike(String value) {
            addCriterion("FUCEINDEX like", value, "fuceindex");
            return (Criteria) this;
        }

        public Criteria andFuceindexNotLike(String value) {
            addCriterion("FUCEINDEX not like", value, "fuceindex");
            return (Criteria) this;
        }

        public Criteria andFuceindexIn(List<String> values) {
            addCriterion("FUCEINDEX in", values, "fuceindex");
            return (Criteria) this;
        }

        public Criteria andFuceindexNotIn(List<String> values) {
            addCriterion("FUCEINDEX not in", values, "fuceindex");
            return (Criteria) this;
        }

        public Criteria andFuceindexBetween(String value1, String value2) {
            addCriterion("FUCEINDEX between", value1, value2, "fuceindex");
            return (Criteria) this;
        }

        public Criteria andFuceindexNotBetween(String value1, String value2) {
            addCriterion("FUCEINDEX not between", value1, value2, "fuceindex");
            return (Criteria) this;
        }

        public Criteria andFucemodifieridIsNull() {
            addCriterion("FUCEMODIFIERID is null");
            return (Criteria) this;
        }

        public Criteria andFucemodifieridIsNotNull() {
            addCriterion("FUCEMODIFIERID is not null");
            return (Criteria) this;
        }

        public Criteria andFucemodifieridEqualTo(String value) {
            addCriterion("FUCEMODIFIERID =", value, "fucemodifierid");
            return (Criteria) this;
        }

        public Criteria andFucemodifieridNotEqualTo(String value) {
            addCriterion("FUCEMODIFIERID <>", value, "fucemodifierid");
            return (Criteria) this;
        }

        public Criteria andFucemodifieridGreaterThan(String value) {
            addCriterion("FUCEMODIFIERID >", value, "fucemodifierid");
            return (Criteria) this;
        }

        public Criteria andFucemodifieridGreaterThanOrEqualTo(String value) {
            addCriterion("FUCEMODIFIERID >=", value, "fucemodifierid");
            return (Criteria) this;
        }

        public Criteria andFucemodifieridLessThan(String value) {
            addCriterion("FUCEMODIFIERID <", value, "fucemodifierid");
            return (Criteria) this;
        }

        public Criteria andFucemodifieridLessThanOrEqualTo(String value) {
            addCriterion("FUCEMODIFIERID <=", value, "fucemodifierid");
            return (Criteria) this;
        }

        public Criteria andFucemodifieridLike(String value) {
            addCriterion("FUCEMODIFIERID like", value, "fucemodifierid");
            return (Criteria) this;
        }

        public Criteria andFucemodifieridNotLike(String value) {
            addCriterion("FUCEMODIFIERID not like", value, "fucemodifierid");
            return (Criteria) this;
        }

        public Criteria andFucemodifieridIn(List<String> values) {
            addCriterion("FUCEMODIFIERID in", values, "fucemodifierid");
            return (Criteria) this;
        }

        public Criteria andFucemodifieridNotIn(List<String> values) {
            addCriterion("FUCEMODIFIERID not in", values, "fucemodifierid");
            return (Criteria) this;
        }

        public Criteria andFucemodifieridBetween(String value1, String value2) {
            addCriterion("FUCEMODIFIERID between", value1, value2, "fucemodifierid");
            return (Criteria) this;
        }

        public Criteria andFucemodifieridNotBetween(String value1, String value2) {
            addCriterion("FUCEMODIFIERID not between", value1, value2, "fucemodifierid");
            return (Criteria) this;
        }

        public Criteria andFucemodifytimeIsNull() {
            addCriterion("FUCEMODIFYTIME is null");
            return (Criteria) this;
        }

        public Criteria andFucemodifytimeIsNotNull() {
            addCriterion("FUCEMODIFYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFucemodifytimeEqualTo(String value) {
            addCriterion("FUCEMODIFYTIME =", value, "fucemodifytime");
            return (Criteria) this;
        }

        public Criteria andFucemodifytimeNotEqualTo(String value) {
            addCriterion("FUCEMODIFYTIME <>", value, "fucemodifytime");
            return (Criteria) this;
        }

        public Criteria andFucemodifytimeGreaterThan(String value) {
            addCriterion("FUCEMODIFYTIME >", value, "fucemodifytime");
            return (Criteria) this;
        }

        public Criteria andFucemodifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("FUCEMODIFYTIME >=", value, "fucemodifytime");
            return (Criteria) this;
        }

        public Criteria andFucemodifytimeLessThan(String value) {
            addCriterion("FUCEMODIFYTIME <", value, "fucemodifytime");
            return (Criteria) this;
        }

        public Criteria andFucemodifytimeLessThanOrEqualTo(String value) {
            addCriterion("FUCEMODIFYTIME <=", value, "fucemodifytime");
            return (Criteria) this;
        }

        public Criteria andFucemodifytimeLike(String value) {
            addCriterion("FUCEMODIFYTIME like", value, "fucemodifytime");
            return (Criteria) this;
        }

        public Criteria andFucemodifytimeNotLike(String value) {
            addCriterion("FUCEMODIFYTIME not like", value, "fucemodifytime");
            return (Criteria) this;
        }

        public Criteria andFucemodifytimeIn(List<String> values) {
            addCriterion("FUCEMODIFYTIME in", values, "fucemodifytime");
            return (Criteria) this;
        }

        public Criteria andFucemodifytimeNotIn(List<String> values) {
            addCriterion("FUCEMODIFYTIME not in", values, "fucemodifytime");
            return (Criteria) this;
        }

        public Criteria andFucemodifytimeBetween(String value1, String value2) {
            addCriterion("FUCEMODIFYTIME between", value1, value2, "fucemodifytime");
            return (Criteria) this;
        }

        public Criteria andFucemodifytimeNotBetween(String value1, String value2) {
            addCriterion("FUCEMODIFYTIME not between", value1, value2, "fucemodifytime");
            return (Criteria) this;
        }

        public Criteria andFucecreatoridIsNull() {
            addCriterion("FUCECREATORID is null");
            return (Criteria) this;
        }

        public Criteria andFucecreatoridIsNotNull() {
            addCriterion("FUCECREATORID is not null");
            return (Criteria) this;
        }

        public Criteria andFucecreatoridEqualTo(String value) {
            addCriterion("FUCECREATORID =", value, "fucecreatorid");
            return (Criteria) this;
        }

        public Criteria andFucecreatoridNotEqualTo(String value) {
            addCriterion("FUCECREATORID <>", value, "fucecreatorid");
            return (Criteria) this;
        }

        public Criteria andFucecreatoridGreaterThan(String value) {
            addCriterion("FUCECREATORID >", value, "fucecreatorid");
            return (Criteria) this;
        }

        public Criteria andFucecreatoridGreaterThanOrEqualTo(String value) {
            addCriterion("FUCECREATORID >=", value, "fucecreatorid");
            return (Criteria) this;
        }

        public Criteria andFucecreatoridLessThan(String value) {
            addCriterion("FUCECREATORID <", value, "fucecreatorid");
            return (Criteria) this;
        }

        public Criteria andFucecreatoridLessThanOrEqualTo(String value) {
            addCriterion("FUCECREATORID <=", value, "fucecreatorid");
            return (Criteria) this;
        }

        public Criteria andFucecreatoridLike(String value) {
            addCriterion("FUCECREATORID like", value, "fucecreatorid");
            return (Criteria) this;
        }

        public Criteria andFucecreatoridNotLike(String value) {
            addCriterion("FUCECREATORID not like", value, "fucecreatorid");
            return (Criteria) this;
        }

        public Criteria andFucecreatoridIn(List<String> values) {
            addCriterion("FUCECREATORID in", values, "fucecreatorid");
            return (Criteria) this;
        }

        public Criteria andFucecreatoridNotIn(List<String> values) {
            addCriterion("FUCECREATORID not in", values, "fucecreatorid");
            return (Criteria) this;
        }

        public Criteria andFucecreatoridBetween(String value1, String value2) {
            addCriterion("FUCECREATORID between", value1, value2, "fucecreatorid");
            return (Criteria) this;
        }

        public Criteria andFucecreatoridNotBetween(String value1, String value2) {
            addCriterion("FUCECREATORID not between", value1, value2, "fucecreatorid");
            return (Criteria) this;
        }

        public Criteria andFucecreatetimeIsNull() {
            addCriterion("FUCECREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andFucecreatetimeIsNotNull() {
            addCriterion("FUCECREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andFucecreatetimeEqualTo(String value) {
            addCriterion("FUCECREATETIME =", value, "fucecreatetime");
            return (Criteria) this;
        }

        public Criteria andFucecreatetimeNotEqualTo(String value) {
            addCriterion("FUCECREATETIME <>", value, "fucecreatetime");
            return (Criteria) this;
        }

        public Criteria andFucecreatetimeGreaterThan(String value) {
            addCriterion("FUCECREATETIME >", value, "fucecreatetime");
            return (Criteria) this;
        }

        public Criteria andFucecreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("FUCECREATETIME >=", value, "fucecreatetime");
            return (Criteria) this;
        }

        public Criteria andFucecreatetimeLessThan(String value) {
            addCriterion("FUCECREATETIME <", value, "fucecreatetime");
            return (Criteria) this;
        }

        public Criteria andFucecreatetimeLessThanOrEqualTo(String value) {
            addCriterion("FUCECREATETIME <=", value, "fucecreatetime");
            return (Criteria) this;
        }

        public Criteria andFucecreatetimeLike(String value) {
            addCriterion("FUCECREATETIME like", value, "fucecreatetime");
            return (Criteria) this;
        }

        public Criteria andFucecreatetimeNotLike(String value) {
            addCriterion("FUCECREATETIME not like", value, "fucecreatetime");
            return (Criteria) this;
        }

        public Criteria andFucecreatetimeIn(List<String> values) {
            addCriterion("FUCECREATETIME in", values, "fucecreatetime");
            return (Criteria) this;
        }

        public Criteria andFucecreatetimeNotIn(List<String> values) {
            addCriterion("FUCECREATETIME not in", values, "fucecreatetime");
            return (Criteria) this;
        }

        public Criteria andFucecreatetimeBetween(String value1, String value2) {
            addCriterion("FUCECREATETIME between", value1, value2, "fucecreatetime");
            return (Criteria) this;
        }

        public Criteria andFucecreatetimeNotBetween(String value1, String value2) {
            addCriterion("FUCECREATETIME not between", value1, value2, "fucecreatetime");
            return (Criteria) this;
        }

        public Criteria andFuceparentcodeIsNull() {
            addCriterion("FUCEPARENTCODE is null");
            return (Criteria) this;
        }

        public Criteria andFuceparentcodeIsNotNull() {
            addCriterion("FUCEPARENTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFuceparentcodeEqualTo(String value) {
            addCriterion("FUCEPARENTCODE =", value, "fuceparentcode");
            return (Criteria) this;
        }

        public Criteria andFuceparentcodeNotEqualTo(String value) {
            addCriterion("FUCEPARENTCODE <>", value, "fuceparentcode");
            return (Criteria) this;
        }

        public Criteria andFuceparentcodeGreaterThan(String value) {
            addCriterion("FUCEPARENTCODE >", value, "fuceparentcode");
            return (Criteria) this;
        }

        public Criteria andFuceparentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FUCEPARENTCODE >=", value, "fuceparentcode");
            return (Criteria) this;
        }

        public Criteria andFuceparentcodeLessThan(String value) {
            addCriterion("FUCEPARENTCODE <", value, "fuceparentcode");
            return (Criteria) this;
        }

        public Criteria andFuceparentcodeLessThanOrEqualTo(String value) {
            addCriterion("FUCEPARENTCODE <=", value, "fuceparentcode");
            return (Criteria) this;
        }

        public Criteria andFuceparentcodeLike(String value) {
            addCriterion("FUCEPARENTCODE like", value, "fuceparentcode");
            return (Criteria) this;
        }

        public Criteria andFuceparentcodeNotLike(String value) {
            addCriterion("FUCEPARENTCODE not like", value, "fuceparentcode");
            return (Criteria) this;
        }

        public Criteria andFuceparentcodeIn(List<String> values) {
            addCriterion("FUCEPARENTCODE in", values, "fuceparentcode");
            return (Criteria) this;
        }

        public Criteria andFuceparentcodeNotIn(List<String> values) {
            addCriterion("FUCEPARENTCODE not in", values, "fuceparentcode");
            return (Criteria) this;
        }

        public Criteria andFuceparentcodeBetween(String value1, String value2) {
            addCriterion("FUCEPARENTCODE between", value1, value2, "fuceparentcode");
            return (Criteria) this;
        }

        public Criteria andFuceparentcodeNotBetween(String value1, String value2) {
            addCriterion("FUCEPARENTCODE not between", value1, value2, "fuceparentcode");
            return (Criteria) this;
        }

        public Criteria andFuceismenuIsNull() {
            addCriterion("FUCEISMENU is null");
            return (Criteria) this;
        }

        public Criteria andFuceismenuIsNotNull() {
            addCriterion("FUCEISMENU is not null");
            return (Criteria) this;
        }

        public Criteria andFuceismenuEqualTo(String value) {
            addCriterion("FUCEISMENU =", value, "fuceismenu");
            return (Criteria) this;
        }

        public Criteria andFuceismenuNotEqualTo(String value) {
            addCriterion("FUCEISMENU <>", value, "fuceismenu");
            return (Criteria) this;
        }

        public Criteria andFuceismenuGreaterThan(String value) {
            addCriterion("FUCEISMENU >", value, "fuceismenu");
            return (Criteria) this;
        }

        public Criteria andFuceismenuGreaterThanOrEqualTo(String value) {
            addCriterion("FUCEISMENU >=", value, "fuceismenu");
            return (Criteria) this;
        }

        public Criteria andFuceismenuLessThan(String value) {
            addCriterion("FUCEISMENU <", value, "fuceismenu");
            return (Criteria) this;
        }

        public Criteria andFuceismenuLessThanOrEqualTo(String value) {
            addCriterion("FUCEISMENU <=", value, "fuceismenu");
            return (Criteria) this;
        }

        public Criteria andFuceismenuLike(String value) {
            addCriterion("FUCEISMENU like", value, "fuceismenu");
            return (Criteria) this;
        }

        public Criteria andFuceismenuNotLike(String value) {
            addCriterion("FUCEISMENU not like", value, "fuceismenu");
            return (Criteria) this;
        }

        public Criteria andFuceismenuIn(List<String> values) {
            addCriterion("FUCEISMENU in", values, "fuceismenu");
            return (Criteria) this;
        }

        public Criteria andFuceismenuNotIn(List<String> values) {
            addCriterion("FUCEISMENU not in", values, "fuceismenu");
            return (Criteria) this;
        }

        public Criteria andFuceismenuBetween(String value1, String value2) {
            addCriterion("FUCEISMENU between", value1, value2, "fuceismenu");
            return (Criteria) this;
        }

        public Criteria andFuceismenuNotBetween(String value1, String value2) {
            addCriterion("FUCEISMENU not between", value1, value2, "fuceismenu");
            return (Criteria) this;
        }

        public Criteria andFuceneedlogIsNull() {
            addCriterion("FUCENEEDLOG is null");
            return (Criteria) this;
        }

        public Criteria andFuceneedlogIsNotNull() {
            addCriterion("FUCENEEDLOG is not null");
            return (Criteria) this;
        }

        public Criteria andFuceneedlogEqualTo(String value) {
            addCriterion("FUCENEEDLOG =", value, "fuceneedlog");
            return (Criteria) this;
        }

        public Criteria andFuceneedlogNotEqualTo(String value) {
            addCriterion("FUCENEEDLOG <>", value, "fuceneedlog");
            return (Criteria) this;
        }

        public Criteria andFuceneedlogGreaterThan(String value) {
            addCriterion("FUCENEEDLOG >", value, "fuceneedlog");
            return (Criteria) this;
        }

        public Criteria andFuceneedlogGreaterThanOrEqualTo(String value) {
            addCriterion("FUCENEEDLOG >=", value, "fuceneedlog");
            return (Criteria) this;
        }

        public Criteria andFuceneedlogLessThan(String value) {
            addCriterion("FUCENEEDLOG <", value, "fuceneedlog");
            return (Criteria) this;
        }

        public Criteria andFuceneedlogLessThanOrEqualTo(String value) {
            addCriterion("FUCENEEDLOG <=", value, "fuceneedlog");
            return (Criteria) this;
        }

        public Criteria andFuceneedlogLike(String value) {
            addCriterion("FUCENEEDLOG like", value, "fuceneedlog");
            return (Criteria) this;
        }

        public Criteria andFuceneedlogNotLike(String value) {
            addCriterion("FUCENEEDLOG not like", value, "fuceneedlog");
            return (Criteria) this;
        }

        public Criteria andFuceneedlogIn(List<String> values) {
            addCriterion("FUCENEEDLOG in", values, "fuceneedlog");
            return (Criteria) this;
        }

        public Criteria andFuceneedlogNotIn(List<String> values) {
            addCriterion("FUCENEEDLOG not in", values, "fuceneedlog");
            return (Criteria) this;
        }

        public Criteria andFuceneedlogBetween(String value1, String value2) {
            addCriterion("FUCENEEDLOG between", value1, value2, "fuceneedlog");
            return (Criteria) this;
        }

        public Criteria andFuceneedlogNotBetween(String value1, String value2) {
            addCriterion("FUCENEEDLOG not between", value1, value2, "fuceneedlog");
            return (Criteria) this;
        }

        public Criteria andFucessxtIsNull() {
            addCriterion("FUCESSXT is null");
            return (Criteria) this;
        }

        public Criteria andFucessxtIsNotNull() {
            addCriterion("FUCESSXT is not null");
            return (Criteria) this;
        }

        public Criteria andFucessxtEqualTo(String value) {
            addCriterion("FUCESSXT =", value, "fucessxt");
            return (Criteria) this;
        }

        public Criteria andFucessxtNotEqualTo(String value) {
            addCriterion("FUCESSXT <>", value, "fucessxt");
            return (Criteria) this;
        }

        public Criteria andFucessxtGreaterThan(String value) {
            addCriterion("FUCESSXT >", value, "fucessxt");
            return (Criteria) this;
        }

        public Criteria andFucessxtGreaterThanOrEqualTo(String value) {
            addCriterion("FUCESSXT >=", value, "fucessxt");
            return (Criteria) this;
        }

        public Criteria andFucessxtLessThan(String value) {
            addCriterion("FUCESSXT <", value, "fucessxt");
            return (Criteria) this;
        }

        public Criteria andFucessxtLessThanOrEqualTo(String value) {
            addCriterion("FUCESSXT <=", value, "fucessxt");
            return (Criteria) this;
        }

        public Criteria andFucessxtLike(String value) {
            addCriterion("FUCESSXT like", value, "fucessxt");
            return (Criteria) this;
        }

        public Criteria andFucessxtNotLike(String value) {
            addCriterion("FUCESSXT not like", value, "fucessxt");
            return (Criteria) this;
        }

        public Criteria andFucessxtIn(List<String> values) {
            addCriterion("FUCESSXT in", values, "fucessxt");
            return (Criteria) this;
        }

        public Criteria andFucessxtNotIn(List<String> values) {
            addCriterion("FUCESSXT not in", values, "fucessxt");
            return (Criteria) this;
        }

        public Criteria andFucessxtBetween(String value1, String value2) {
            addCriterion("FUCESSXT between", value1, value2, "fucessxt");
            return (Criteria) this;
        }

        public Criteria andFucessxtNotBetween(String value1, String value2) {
            addCriterion("FUCESSXT not between", value1, value2, "fucessxt");
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