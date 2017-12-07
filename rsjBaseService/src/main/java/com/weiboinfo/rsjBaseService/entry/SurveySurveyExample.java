package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class SurveySurveyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SurveySurveyExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("S_ID is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("S_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(String value) {
            addCriterion("S_ID =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(String value) {
            addCriterion("S_ID <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(String value) {
            addCriterion("S_ID >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(String value) {
            addCriterion("S_ID >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(String value) {
            addCriterion("S_ID <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(String value) {
            addCriterion("S_ID <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLike(String value) {
            addCriterion("S_ID like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotLike(String value) {
            addCriterion("S_ID not like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<String> values) {
            addCriterion("S_ID in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<String> values) {
            addCriterion("S_ID not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(String value1, String value2) {
            addCriterion("S_ID between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(String value1, String value2) {
            addCriterion("S_ID not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andTempletIdIsNull() {
            addCriterion("TEMPLET_ID is null");
            return (Criteria) this;
        }

        public Criteria andTempletIdIsNotNull() {
            addCriterion("TEMPLET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTempletIdEqualTo(String value) {
            addCriterion("TEMPLET_ID =", value, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletIdNotEqualTo(String value) {
            addCriterion("TEMPLET_ID <>", value, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletIdGreaterThan(String value) {
            addCriterion("TEMPLET_ID >", value, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletIdGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLET_ID >=", value, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletIdLessThan(String value) {
            addCriterion("TEMPLET_ID <", value, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletIdLessThanOrEqualTo(String value) {
            addCriterion("TEMPLET_ID <=", value, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletIdLike(String value) {
            addCriterion("TEMPLET_ID like", value, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletIdNotLike(String value) {
            addCriterion("TEMPLET_ID not like", value, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletIdIn(List<String> values) {
            addCriterion("TEMPLET_ID in", values, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletIdNotIn(List<String> values) {
            addCriterion("TEMPLET_ID not in", values, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletIdBetween(String value1, String value2) {
            addCriterion("TEMPLET_ID between", value1, value2, "templetId");
            return (Criteria) this;
        }

        public Criteria andTempletIdNotBetween(String value1, String value2) {
            addCriterion("TEMPLET_ID not between", value1, value2, "templetId");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("S_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("S_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("S_NAME =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("S_NAME <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("S_NAME >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("S_NAME >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("S_NAME <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("S_NAME <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("S_NAME like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("S_NAME not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("S_NAME in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("S_NAME not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("S_NAME between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("S_NAME not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSDescIsNull() {
            addCriterion("S_DESC is null");
            return (Criteria) this;
        }

        public Criteria andSDescIsNotNull() {
            addCriterion("S_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andSDescEqualTo(String value) {
            addCriterion("S_DESC =", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescNotEqualTo(String value) {
            addCriterion("S_DESC <>", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescGreaterThan(String value) {
            addCriterion("S_DESC >", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescGreaterThanOrEqualTo(String value) {
            addCriterion("S_DESC >=", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescLessThan(String value) {
            addCriterion("S_DESC <", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescLessThanOrEqualTo(String value) {
            addCriterion("S_DESC <=", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescLike(String value) {
            addCriterion("S_DESC like", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescNotLike(String value) {
            addCriterion("S_DESC not like", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescIn(List<String> values) {
            addCriterion("S_DESC in", values, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescNotIn(List<String> values) {
            addCriterion("S_DESC not in", values, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescBetween(String value1, String value2) {
            addCriterion("S_DESC between", value1, value2, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescNotBetween(String value1, String value2) {
            addCriterion("S_DESC not between", value1, value2, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSAuthorIsNull() {
            addCriterion("S_AUTHOR is null");
            return (Criteria) this;
        }

        public Criteria andSAuthorIsNotNull() {
            addCriterion("S_AUTHOR is not null");
            return (Criteria) this;
        }

        public Criteria andSAuthorEqualTo(String value) {
            addCriterion("S_AUTHOR =", value, "sAuthor");
            return (Criteria) this;
        }

        public Criteria andSAuthorNotEqualTo(String value) {
            addCriterion("S_AUTHOR <>", value, "sAuthor");
            return (Criteria) this;
        }

        public Criteria andSAuthorGreaterThan(String value) {
            addCriterion("S_AUTHOR >", value, "sAuthor");
            return (Criteria) this;
        }

        public Criteria andSAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("S_AUTHOR >=", value, "sAuthor");
            return (Criteria) this;
        }

        public Criteria andSAuthorLessThan(String value) {
            addCriterion("S_AUTHOR <", value, "sAuthor");
            return (Criteria) this;
        }

        public Criteria andSAuthorLessThanOrEqualTo(String value) {
            addCriterion("S_AUTHOR <=", value, "sAuthor");
            return (Criteria) this;
        }

        public Criteria andSAuthorLike(String value) {
            addCriterion("S_AUTHOR like", value, "sAuthor");
            return (Criteria) this;
        }

        public Criteria andSAuthorNotLike(String value) {
            addCriterion("S_AUTHOR not like", value, "sAuthor");
            return (Criteria) this;
        }

        public Criteria andSAuthorIn(List<String> values) {
            addCriterion("S_AUTHOR in", values, "sAuthor");
            return (Criteria) this;
        }

        public Criteria andSAuthorNotIn(List<String> values) {
            addCriterion("S_AUTHOR not in", values, "sAuthor");
            return (Criteria) this;
        }

        public Criteria andSAuthorBetween(String value1, String value2) {
            addCriterion("S_AUTHOR between", value1, value2, "sAuthor");
            return (Criteria) this;
        }

        public Criteria andSAuthorNotBetween(String value1, String value2) {
            addCriterion("S_AUTHOR not between", value1, value2, "sAuthor");
            return (Criteria) this;
        }

        public Criteria andSImgIsNull() {
            addCriterion("S_IMG is null");
            return (Criteria) this;
        }

        public Criteria andSImgIsNotNull() {
            addCriterion("S_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andSImgEqualTo(String value) {
            addCriterion("S_IMG =", value, "sImg");
            return (Criteria) this;
        }

        public Criteria andSImgNotEqualTo(String value) {
            addCriterion("S_IMG <>", value, "sImg");
            return (Criteria) this;
        }

        public Criteria andSImgGreaterThan(String value) {
            addCriterion("S_IMG >", value, "sImg");
            return (Criteria) this;
        }

        public Criteria andSImgGreaterThanOrEqualTo(String value) {
            addCriterion("S_IMG >=", value, "sImg");
            return (Criteria) this;
        }

        public Criteria andSImgLessThan(String value) {
            addCriterion("S_IMG <", value, "sImg");
            return (Criteria) this;
        }

        public Criteria andSImgLessThanOrEqualTo(String value) {
            addCriterion("S_IMG <=", value, "sImg");
            return (Criteria) this;
        }

        public Criteria andSImgLike(String value) {
            addCriterion("S_IMG like", value, "sImg");
            return (Criteria) this;
        }

        public Criteria andSImgNotLike(String value) {
            addCriterion("S_IMG not like", value, "sImg");
            return (Criteria) this;
        }

        public Criteria andSImgIn(List<String> values) {
            addCriterion("S_IMG in", values, "sImg");
            return (Criteria) this;
        }

        public Criteria andSImgNotIn(List<String> values) {
            addCriterion("S_IMG not in", values, "sImg");
            return (Criteria) this;
        }

        public Criteria andSImgBetween(String value1, String value2) {
            addCriterion("S_IMG between", value1, value2, "sImg");
            return (Criteria) this;
        }

        public Criteria andSImgNotBetween(String value1, String value2) {
            addCriterion("S_IMG not between", value1, value2, "sImg");
            return (Criteria) this;
        }

        public Criteria andSIprepeatIsNull() {
            addCriterion("S_IPREPEAT is null");
            return (Criteria) this;
        }

        public Criteria andSIprepeatIsNotNull() {
            addCriterion("S_IPREPEAT is not null");
            return (Criteria) this;
        }

        public Criteria andSIprepeatEqualTo(String value) {
            addCriterion("S_IPREPEAT =", value, "sIprepeat");
            return (Criteria) this;
        }

        public Criteria andSIprepeatNotEqualTo(String value) {
            addCriterion("S_IPREPEAT <>", value, "sIprepeat");
            return (Criteria) this;
        }

        public Criteria andSIprepeatGreaterThan(String value) {
            addCriterion("S_IPREPEAT >", value, "sIprepeat");
            return (Criteria) this;
        }

        public Criteria andSIprepeatGreaterThanOrEqualTo(String value) {
            addCriterion("S_IPREPEAT >=", value, "sIprepeat");
            return (Criteria) this;
        }

        public Criteria andSIprepeatLessThan(String value) {
            addCriterion("S_IPREPEAT <", value, "sIprepeat");
            return (Criteria) this;
        }

        public Criteria andSIprepeatLessThanOrEqualTo(String value) {
            addCriterion("S_IPREPEAT <=", value, "sIprepeat");
            return (Criteria) this;
        }

        public Criteria andSIprepeatLike(String value) {
            addCriterion("S_IPREPEAT like", value, "sIprepeat");
            return (Criteria) this;
        }

        public Criteria andSIprepeatNotLike(String value) {
            addCriterion("S_IPREPEAT not like", value, "sIprepeat");
            return (Criteria) this;
        }

        public Criteria andSIprepeatIn(List<String> values) {
            addCriterion("S_IPREPEAT in", values, "sIprepeat");
            return (Criteria) this;
        }

        public Criteria andSIprepeatNotIn(List<String> values) {
            addCriterion("S_IPREPEAT not in", values, "sIprepeat");
            return (Criteria) this;
        }

        public Criteria andSIprepeatBetween(String value1, String value2) {
            addCriterion("S_IPREPEAT between", value1, value2, "sIprepeat");
            return (Criteria) this;
        }

        public Criteria andSIprepeatNotBetween(String value1, String value2) {
            addCriterion("S_IPREPEAT not between", value1, value2, "sIprepeat");
            return (Criteria) this;
        }

        public Criteria andSCreatedateIsNull() {
            addCriterion("S_CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andSCreatedateIsNotNull() {
            addCriterion("S_CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSCreatedateEqualTo(String value) {
            addCriterion("S_CREATEDATE =", value, "sCreatedate");
            return (Criteria) this;
        }

        public Criteria andSCreatedateNotEqualTo(String value) {
            addCriterion("S_CREATEDATE <>", value, "sCreatedate");
            return (Criteria) this;
        }

        public Criteria andSCreatedateGreaterThan(String value) {
            addCriterion("S_CREATEDATE >", value, "sCreatedate");
            return (Criteria) this;
        }

        public Criteria andSCreatedateGreaterThanOrEqualTo(String value) {
            addCriterion("S_CREATEDATE >=", value, "sCreatedate");
            return (Criteria) this;
        }

        public Criteria andSCreatedateLessThan(String value) {
            addCriterion("S_CREATEDATE <", value, "sCreatedate");
            return (Criteria) this;
        }

        public Criteria andSCreatedateLessThanOrEqualTo(String value) {
            addCriterion("S_CREATEDATE <=", value, "sCreatedate");
            return (Criteria) this;
        }

        public Criteria andSCreatedateLike(String value) {
            addCriterion("S_CREATEDATE like", value, "sCreatedate");
            return (Criteria) this;
        }

        public Criteria andSCreatedateNotLike(String value) {
            addCriterion("S_CREATEDATE not like", value, "sCreatedate");
            return (Criteria) this;
        }

        public Criteria andSCreatedateIn(List<String> values) {
            addCriterion("S_CREATEDATE in", values, "sCreatedate");
            return (Criteria) this;
        }

        public Criteria andSCreatedateNotIn(List<String> values) {
            addCriterion("S_CREATEDATE not in", values, "sCreatedate");
            return (Criteria) this;
        }

        public Criteria andSCreatedateBetween(String value1, String value2) {
            addCriterion("S_CREATEDATE between", value1, value2, "sCreatedate");
            return (Criteria) this;
        }

        public Criteria andSCreatedateNotBetween(String value1, String value2) {
            addCriterion("S_CREATEDATE not between", value1, value2, "sCreatedate");
            return (Criteria) this;
        }

        public Criteria andSIplimittypeIsNull() {
            addCriterion("S_IPLIMITTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSIplimittypeIsNotNull() {
            addCriterion("S_IPLIMITTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSIplimittypeEqualTo(String value) {
            addCriterion("S_IPLIMITTYPE =", value, "sIplimittype");
            return (Criteria) this;
        }

        public Criteria andSIplimittypeNotEqualTo(String value) {
            addCriterion("S_IPLIMITTYPE <>", value, "sIplimittype");
            return (Criteria) this;
        }

        public Criteria andSIplimittypeGreaterThan(String value) {
            addCriterion("S_IPLIMITTYPE >", value, "sIplimittype");
            return (Criteria) this;
        }

        public Criteria andSIplimittypeGreaterThanOrEqualTo(String value) {
            addCriterion("S_IPLIMITTYPE >=", value, "sIplimittype");
            return (Criteria) this;
        }

        public Criteria andSIplimittypeLessThan(String value) {
            addCriterion("S_IPLIMITTYPE <", value, "sIplimittype");
            return (Criteria) this;
        }

        public Criteria andSIplimittypeLessThanOrEqualTo(String value) {
            addCriterion("S_IPLIMITTYPE <=", value, "sIplimittype");
            return (Criteria) this;
        }

        public Criteria andSIplimittypeLike(String value) {
            addCriterion("S_IPLIMITTYPE like", value, "sIplimittype");
            return (Criteria) this;
        }

        public Criteria andSIplimittypeNotLike(String value) {
            addCriterion("S_IPLIMITTYPE not like", value, "sIplimittype");
            return (Criteria) this;
        }

        public Criteria andSIplimittypeIn(List<String> values) {
            addCriterion("S_IPLIMITTYPE in", values, "sIplimittype");
            return (Criteria) this;
        }

        public Criteria andSIplimittypeNotIn(List<String> values) {
            addCriterion("S_IPLIMITTYPE not in", values, "sIplimittype");
            return (Criteria) this;
        }

        public Criteria andSIplimittypeBetween(String value1, String value2) {
            addCriterion("S_IPLIMITTYPE between", value1, value2, "sIplimittype");
            return (Criteria) this;
        }

        public Criteria andSIplimittypeNotBetween(String value1, String value2) {
            addCriterion("S_IPLIMITTYPE not between", value1, value2, "sIplimittype");
            return (Criteria) this;
        }

        public Criteria andSIprangeIsNull() {
            addCriterion("S_IPRANGE is null");
            return (Criteria) this;
        }

        public Criteria andSIprangeIsNotNull() {
            addCriterion("S_IPRANGE is not null");
            return (Criteria) this;
        }

        public Criteria andSIprangeEqualTo(String value) {
            addCriterion("S_IPRANGE =", value, "sIprange");
            return (Criteria) this;
        }

        public Criteria andSIprangeNotEqualTo(String value) {
            addCriterion("S_IPRANGE <>", value, "sIprange");
            return (Criteria) this;
        }

        public Criteria andSIprangeGreaterThan(String value) {
            addCriterion("S_IPRANGE >", value, "sIprange");
            return (Criteria) this;
        }

        public Criteria andSIprangeGreaterThanOrEqualTo(String value) {
            addCriterion("S_IPRANGE >=", value, "sIprange");
            return (Criteria) this;
        }

        public Criteria andSIprangeLessThan(String value) {
            addCriterion("S_IPRANGE <", value, "sIprange");
            return (Criteria) this;
        }

        public Criteria andSIprangeLessThanOrEqualTo(String value) {
            addCriterion("S_IPRANGE <=", value, "sIprange");
            return (Criteria) this;
        }

        public Criteria andSIprangeLike(String value) {
            addCriterion("S_IPRANGE like", value, "sIprange");
            return (Criteria) this;
        }

        public Criteria andSIprangeNotLike(String value) {
            addCriterion("S_IPRANGE not like", value, "sIprange");
            return (Criteria) this;
        }

        public Criteria andSIprangeIn(List<String> values) {
            addCriterion("S_IPRANGE in", values, "sIprange");
            return (Criteria) this;
        }

        public Criteria andSIprangeNotIn(List<String> values) {
            addCriterion("S_IPRANGE not in", values, "sIprange");
            return (Criteria) this;
        }

        public Criteria andSIprangeBetween(String value1, String value2) {
            addCriterion("S_IPRANGE between", value1, value2, "sIprange");
            return (Criteria) this;
        }

        public Criteria andSIprangeNotBetween(String value1, String value2) {
            addCriterion("S_IPRANGE not between", value1, value2, "sIprange");
            return (Criteria) this;
        }

        public Criteria andSPasswordIsNull() {
            addCriterion("S_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andSPasswordIsNotNull() {
            addCriterion("S_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andSPasswordEqualTo(String value) {
            addCriterion("S_PASSWORD =", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotEqualTo(String value) {
            addCriterion("S_PASSWORD <>", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordGreaterThan(String value) {
            addCriterion("S_PASSWORD >", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("S_PASSWORD >=", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordLessThan(String value) {
            addCriterion("S_PASSWORD <", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordLessThanOrEqualTo(String value) {
            addCriterion("S_PASSWORD <=", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordLike(String value) {
            addCriterion("S_PASSWORD like", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotLike(String value) {
            addCriterion("S_PASSWORD not like", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordIn(List<String> values) {
            addCriterion("S_PASSWORD in", values, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotIn(List<String> values) {
            addCriterion("S_PASSWORD not in", values, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordBetween(String value1, String value2) {
            addCriterion("S_PASSWORD between", value1, value2, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotBetween(String value1, String value2) {
            addCriterion("S_PASSWORD not between", value1, value2, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSIsopenIsNull() {
            addCriterion("S_ISOPEN is null");
            return (Criteria) this;
        }

        public Criteria andSIsopenIsNotNull() {
            addCriterion("S_ISOPEN is not null");
            return (Criteria) this;
        }

        public Criteria andSIsopenEqualTo(String value) {
            addCriterion("S_ISOPEN =", value, "sIsopen");
            return (Criteria) this;
        }

        public Criteria andSIsopenNotEqualTo(String value) {
            addCriterion("S_ISOPEN <>", value, "sIsopen");
            return (Criteria) this;
        }

        public Criteria andSIsopenGreaterThan(String value) {
            addCriterion("S_ISOPEN >", value, "sIsopen");
            return (Criteria) this;
        }

        public Criteria andSIsopenGreaterThanOrEqualTo(String value) {
            addCriterion("S_ISOPEN >=", value, "sIsopen");
            return (Criteria) this;
        }

        public Criteria andSIsopenLessThan(String value) {
            addCriterion("S_ISOPEN <", value, "sIsopen");
            return (Criteria) this;
        }

        public Criteria andSIsopenLessThanOrEqualTo(String value) {
            addCriterion("S_ISOPEN <=", value, "sIsopen");
            return (Criteria) this;
        }

        public Criteria andSIsopenLike(String value) {
            addCriterion("S_ISOPEN like", value, "sIsopen");
            return (Criteria) this;
        }

        public Criteria andSIsopenNotLike(String value) {
            addCriterion("S_ISOPEN not like", value, "sIsopen");
            return (Criteria) this;
        }

        public Criteria andSIsopenIn(List<String> values) {
            addCriterion("S_ISOPEN in", values, "sIsopen");
            return (Criteria) this;
        }

        public Criteria andSIsopenNotIn(List<String> values) {
            addCriterion("S_ISOPEN not in", values, "sIsopen");
            return (Criteria) this;
        }

        public Criteria andSIsopenBetween(String value1, String value2) {
            addCriterion("S_ISOPEN between", value1, value2, "sIsopen");
            return (Criteria) this;
        }

        public Criteria andSIsopenNotBetween(String value1, String value2) {
            addCriterion("S_ISOPEN not between", value1, value2, "sIsopen");
            return (Criteria) this;
        }

        public Criteria andSExpiredateIsNull() {
            addCriterion("S_EXPIREDATE is null");
            return (Criteria) this;
        }

        public Criteria andSExpiredateIsNotNull() {
            addCriterion("S_EXPIREDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSExpiredateEqualTo(String value) {
            addCriterion("S_EXPIREDATE =", value, "sExpiredate");
            return (Criteria) this;
        }

        public Criteria andSExpiredateNotEqualTo(String value) {
            addCriterion("S_EXPIREDATE <>", value, "sExpiredate");
            return (Criteria) this;
        }

        public Criteria andSExpiredateGreaterThan(String value) {
            addCriterion("S_EXPIREDATE >", value, "sExpiredate");
            return (Criteria) this;
        }

        public Criteria andSExpiredateGreaterThanOrEqualTo(String value) {
            addCriterion("S_EXPIREDATE >=", value, "sExpiredate");
            return (Criteria) this;
        }

        public Criteria andSExpiredateLessThan(String value) {
            addCriterion("S_EXPIREDATE <", value, "sExpiredate");
            return (Criteria) this;
        }

        public Criteria andSExpiredateLessThanOrEqualTo(String value) {
            addCriterion("S_EXPIREDATE <=", value, "sExpiredate");
            return (Criteria) this;
        }

        public Criteria andSExpiredateLike(String value) {
            addCriterion("S_EXPIREDATE like", value, "sExpiredate");
            return (Criteria) this;
        }

        public Criteria andSExpiredateNotLike(String value) {
            addCriterion("S_EXPIREDATE not like", value, "sExpiredate");
            return (Criteria) this;
        }

        public Criteria andSExpiredateIn(List<String> values) {
            addCriterion("S_EXPIREDATE in", values, "sExpiredate");
            return (Criteria) this;
        }

        public Criteria andSExpiredateNotIn(List<String> values) {
            addCriterion("S_EXPIREDATE not in", values, "sExpiredate");
            return (Criteria) this;
        }

        public Criteria andSExpiredateBetween(String value1, String value2) {
            addCriterion("S_EXPIREDATE between", value1, value2, "sExpiredate");
            return (Criteria) this;
        }

        public Criteria andSExpiredateNotBetween(String value1, String value2) {
            addCriterion("S_EXPIREDATE not between", value1, value2, "sExpiredate");
            return (Criteria) this;
        }

        public Criteria andSIsauditedIsNull() {
            addCriterion("S_ISAUDITED is null");
            return (Criteria) this;
        }

        public Criteria andSIsauditedIsNotNull() {
            addCriterion("S_ISAUDITED is not null");
            return (Criteria) this;
        }

        public Criteria andSIsauditedEqualTo(String value) {
            addCriterion("S_ISAUDITED =", value, "sIsaudited");
            return (Criteria) this;
        }

        public Criteria andSIsauditedNotEqualTo(String value) {
            addCriterion("S_ISAUDITED <>", value, "sIsaudited");
            return (Criteria) this;
        }

        public Criteria andSIsauditedGreaterThan(String value) {
            addCriterion("S_ISAUDITED >", value, "sIsaudited");
            return (Criteria) this;
        }

        public Criteria andSIsauditedGreaterThanOrEqualTo(String value) {
            addCriterion("S_ISAUDITED >=", value, "sIsaudited");
            return (Criteria) this;
        }

        public Criteria andSIsauditedLessThan(String value) {
            addCriterion("S_ISAUDITED <", value, "sIsaudited");
            return (Criteria) this;
        }

        public Criteria andSIsauditedLessThanOrEqualTo(String value) {
            addCriterion("S_ISAUDITED <=", value, "sIsaudited");
            return (Criteria) this;
        }

        public Criteria andSIsauditedLike(String value) {
            addCriterion("S_ISAUDITED like", value, "sIsaudited");
            return (Criteria) this;
        }

        public Criteria andSIsauditedNotLike(String value) {
            addCriterion("S_ISAUDITED not like", value, "sIsaudited");
            return (Criteria) this;
        }

        public Criteria andSIsauditedIn(List<String> values) {
            addCriterion("S_ISAUDITED in", values, "sIsaudited");
            return (Criteria) this;
        }

        public Criteria andSIsauditedNotIn(List<String> values) {
            addCriterion("S_ISAUDITED not in", values, "sIsaudited");
            return (Criteria) this;
        }

        public Criteria andSIsauditedBetween(String value1, String value2) {
            addCriterion("S_ISAUDITED between", value1, value2, "sIsaudited");
            return (Criteria) this;
        }

        public Criteria andSIsauditedNotBetween(String value1, String value2) {
            addCriterion("S_ISAUDITED not between", value1, value2, "sIsaudited");
            return (Criteria) this;
        }

        public Criteria andSHitsIsNull() {
            addCriterion("S_HITS is null");
            return (Criteria) this;
        }

        public Criteria andSHitsIsNotNull() {
            addCriterion("S_HITS is not null");
            return (Criteria) this;
        }

        public Criteria andSHitsEqualTo(String value) {
            addCriterion("S_HITS =", value, "sHits");
            return (Criteria) this;
        }

        public Criteria andSHitsNotEqualTo(String value) {
            addCriterion("S_HITS <>", value, "sHits");
            return (Criteria) this;
        }

        public Criteria andSHitsGreaterThan(String value) {
            addCriterion("S_HITS >", value, "sHits");
            return (Criteria) this;
        }

        public Criteria andSHitsGreaterThanOrEqualTo(String value) {
            addCriterion("S_HITS >=", value, "sHits");
            return (Criteria) this;
        }

        public Criteria andSHitsLessThan(String value) {
            addCriterion("S_HITS <", value, "sHits");
            return (Criteria) this;
        }

        public Criteria andSHitsLessThanOrEqualTo(String value) {
            addCriterion("S_HITS <=", value, "sHits");
            return (Criteria) this;
        }

        public Criteria andSHitsLike(String value) {
            addCriterion("S_HITS like", value, "sHits");
            return (Criteria) this;
        }

        public Criteria andSHitsNotLike(String value) {
            addCriterion("S_HITS not like", value, "sHits");
            return (Criteria) this;
        }

        public Criteria andSHitsIn(List<String> values) {
            addCriterion("S_HITS in", values, "sHits");
            return (Criteria) this;
        }

        public Criteria andSHitsNotIn(List<String> values) {
            addCriterion("S_HITS not in", values, "sHits");
            return (Criteria) this;
        }

        public Criteria andSHitsBetween(String value1, String value2) {
            addCriterion("S_HITS between", value1, value2, "sHits");
            return (Criteria) this;
        }

        public Criteria andSHitsNotBetween(String value1, String value2) {
            addCriterion("S_HITS not between", value1, value2, "sHits");
            return (Criteria) this;
        }

        public Criteria andSUsehitsIsNull() {
            addCriterion("S_USEHITS is null");
            return (Criteria) this;
        }

        public Criteria andSUsehitsIsNotNull() {
            addCriterion("S_USEHITS is not null");
            return (Criteria) this;
        }

        public Criteria andSUsehitsEqualTo(String value) {
            addCriterion("S_USEHITS =", value, "sUsehits");
            return (Criteria) this;
        }

        public Criteria andSUsehitsNotEqualTo(String value) {
            addCriterion("S_USEHITS <>", value, "sUsehits");
            return (Criteria) this;
        }

        public Criteria andSUsehitsGreaterThan(String value) {
            addCriterion("S_USEHITS >", value, "sUsehits");
            return (Criteria) this;
        }

        public Criteria andSUsehitsGreaterThanOrEqualTo(String value) {
            addCriterion("S_USEHITS >=", value, "sUsehits");
            return (Criteria) this;
        }

        public Criteria andSUsehitsLessThan(String value) {
            addCriterion("S_USEHITS <", value, "sUsehits");
            return (Criteria) this;
        }

        public Criteria andSUsehitsLessThanOrEqualTo(String value) {
            addCriterion("S_USEHITS <=", value, "sUsehits");
            return (Criteria) this;
        }

        public Criteria andSUsehitsLike(String value) {
            addCriterion("S_USEHITS like", value, "sUsehits");
            return (Criteria) this;
        }

        public Criteria andSUsehitsNotLike(String value) {
            addCriterion("S_USEHITS not like", value, "sUsehits");
            return (Criteria) this;
        }

        public Criteria andSUsehitsIn(List<String> values) {
            addCriterion("S_USEHITS in", values, "sUsehits");
            return (Criteria) this;
        }

        public Criteria andSUsehitsNotIn(List<String> values) {
            addCriterion("S_USEHITS not in", values, "sUsehits");
            return (Criteria) this;
        }

        public Criteria andSUsehitsBetween(String value1, String value2) {
            addCriterion("S_USEHITS between", value1, value2, "sUsehits");
            return (Criteria) this;
        }

        public Criteria andSUsehitsNotBetween(String value1, String value2) {
            addCriterion("S_USEHITS not between", value1, value2, "sUsehits");
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