package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class IntelLigentRobotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntelLigentRobotExample() {
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

        public Criteria andInfoidIsNull() {
            addCriterion("INFOID is null");
            return (Criteria) this;
        }

        public Criteria andInfoidIsNotNull() {
            addCriterion("INFOID is not null");
            return (Criteria) this;
        }

        public Criteria andInfoidEqualTo(String value) {
            addCriterion("INFOID =", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotEqualTo(String value) {
            addCriterion("INFOID <>", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidGreaterThan(String value) {
            addCriterion("INFOID >", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidGreaterThanOrEqualTo(String value) {
            addCriterion("INFOID >=", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLessThan(String value) {
            addCriterion("INFOID <", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLessThanOrEqualTo(String value) {
            addCriterion("INFOID <=", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLike(String value) {
            addCriterion("INFOID like", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotLike(String value) {
            addCriterion("INFOID not like", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidIn(List<String> values) {
            addCriterion("INFOID in", values, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotIn(List<String> values) {
            addCriterion("INFOID not in", values, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidBetween(String value1, String value2) {
            addCriterion("INFOID between", value1, value2, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotBetween(String value1, String value2) {
            addCriterion("INFOID not between", value1, value2, "infoid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("PARENTID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("PARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("PARENTID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("PARENTID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("PARENTID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("PARENTID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("PARENTID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("PARENTID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("PARENTID like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("PARENTID not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("PARENTID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("PARENTID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("PARENTID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("PARENTID not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andLinkIsNull() {
            addCriterion("LINK is null");
            return (Criteria) this;
        }

        public Criteria andLinkIsNotNull() {
            addCriterion("LINK is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEqualTo(String value) {
            addCriterion("LINK =", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotEqualTo(String value) {
            addCriterion("LINK <>", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThan(String value) {
            addCriterion("LINK >", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThanOrEqualTo(String value) {
            addCriterion("LINK >=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThan(String value) {
            addCriterion("LINK <", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThanOrEqualTo(String value) {
            addCriterion("LINK <=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLike(String value) {
            addCriterion("LINK like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotLike(String value) {
            addCriterion("LINK not like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkIn(List<String> values) {
            addCriterion("LINK in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotIn(List<String> values) {
            addCriterion("LINK not in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkBetween(String value1, String value2) {
            addCriterion("LINK between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotBetween(String value1, String value2) {
            addCriterion("LINK not between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andWzcjdateIsNull() {
            addCriterion("WZCJDATE is null");
            return (Criteria) this;
        }

        public Criteria andWzcjdateIsNotNull() {
            addCriterion("WZCJDATE is not null");
            return (Criteria) this;
        }

        public Criteria andWzcjdateEqualTo(String value) {
            addCriterion("WZCJDATE =", value, "wzcjdate");
            return (Criteria) this;
        }

        public Criteria andWzcjdateNotEqualTo(String value) {
            addCriterion("WZCJDATE <>", value, "wzcjdate");
            return (Criteria) this;
        }

        public Criteria andWzcjdateGreaterThan(String value) {
            addCriterion("WZCJDATE >", value, "wzcjdate");
            return (Criteria) this;
        }

        public Criteria andWzcjdateGreaterThanOrEqualTo(String value) {
            addCriterion("WZCJDATE >=", value, "wzcjdate");
            return (Criteria) this;
        }

        public Criteria andWzcjdateLessThan(String value) {
            addCriterion("WZCJDATE <", value, "wzcjdate");
            return (Criteria) this;
        }

        public Criteria andWzcjdateLessThanOrEqualTo(String value) {
            addCriterion("WZCJDATE <=", value, "wzcjdate");
            return (Criteria) this;
        }

        public Criteria andWzcjdateLike(String value) {
            addCriterion("WZCJDATE like", value, "wzcjdate");
            return (Criteria) this;
        }

        public Criteria andWzcjdateNotLike(String value) {
            addCriterion("WZCJDATE not like", value, "wzcjdate");
            return (Criteria) this;
        }

        public Criteria andWzcjdateIn(List<String> values) {
            addCriterion("WZCJDATE in", values, "wzcjdate");
            return (Criteria) this;
        }

        public Criteria andWzcjdateNotIn(List<String> values) {
            addCriterion("WZCJDATE not in", values, "wzcjdate");
            return (Criteria) this;
        }

        public Criteria andWzcjdateBetween(String value1, String value2) {
            addCriterion("WZCJDATE between", value1, value2, "wzcjdate");
            return (Criteria) this;
        }

        public Criteria andWzcjdateNotBetween(String value1, String value2) {
            addCriterion("WZCJDATE not between", value1, value2, "wzcjdate");
            return (Criteria) this;
        }

        public Criteria andEnteringdateIsNull() {
            addCriterion("ENTERINGDATE is null");
            return (Criteria) this;
        }

        public Criteria andEnteringdateIsNotNull() {
            addCriterion("ENTERINGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnteringdateEqualTo(String value) {
            addCriterion("ENTERINGDATE =", value, "enteringdate");
            return (Criteria) this;
        }

        public Criteria andEnteringdateNotEqualTo(String value) {
            addCriterion("ENTERINGDATE <>", value, "enteringdate");
            return (Criteria) this;
        }

        public Criteria andEnteringdateGreaterThan(String value) {
            addCriterion("ENTERINGDATE >", value, "enteringdate");
            return (Criteria) this;
        }

        public Criteria andEnteringdateGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERINGDATE >=", value, "enteringdate");
            return (Criteria) this;
        }

        public Criteria andEnteringdateLessThan(String value) {
            addCriterion("ENTERINGDATE <", value, "enteringdate");
            return (Criteria) this;
        }

        public Criteria andEnteringdateLessThanOrEqualTo(String value) {
            addCriterion("ENTERINGDATE <=", value, "enteringdate");
            return (Criteria) this;
        }

        public Criteria andEnteringdateLike(String value) {
            addCriterion("ENTERINGDATE like", value, "enteringdate");
            return (Criteria) this;
        }

        public Criteria andEnteringdateNotLike(String value) {
            addCriterion("ENTERINGDATE not like", value, "enteringdate");
            return (Criteria) this;
        }

        public Criteria andEnteringdateIn(List<String> values) {
            addCriterion("ENTERINGDATE in", values, "enteringdate");
            return (Criteria) this;
        }

        public Criteria andEnteringdateNotIn(List<String> values) {
            addCriterion("ENTERINGDATE not in", values, "enteringdate");
            return (Criteria) this;
        }

        public Criteria andEnteringdateBetween(String value1, String value2) {
            addCriterion("ENTERINGDATE between", value1, value2, "enteringdate");
            return (Criteria) this;
        }

        public Criteria andEnteringdateNotBetween(String value1, String value2) {
            addCriterion("ENTERINGDATE not between", value1, value2, "enteringdate");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("MODIFYDATE is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("MODIFYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(String value) {
            addCriterion("MODIFYDATE =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(String value) {
            addCriterion("MODIFYDATE <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(String value) {
            addCriterion("MODIFYDATE >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFYDATE >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(String value) {
            addCriterion("MODIFYDATE <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(String value) {
            addCriterion("MODIFYDATE <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLike(String value) {
            addCriterion("MODIFYDATE like", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotLike(String value) {
            addCriterion("MODIFYDATE not like", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<String> values) {
            addCriterion("MODIFYDATE in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<String> values) {
            addCriterion("MODIFYDATE not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(String value1, String value2) {
            addCriterion("MODIFYDATE between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(String value1, String value2) {
            addCriterion("MODIFYDATE not between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andInfo1IsNull() {
            addCriterion("INFO1 is null");
            return (Criteria) this;
        }

        public Criteria andInfo1IsNotNull() {
            addCriterion("INFO1 is not null");
            return (Criteria) this;
        }

        public Criteria andInfo1EqualTo(String value) {
            addCriterion("INFO1 =", value, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo1NotEqualTo(String value) {
            addCriterion("INFO1 <>", value, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo1GreaterThan(String value) {
            addCriterion("INFO1 >", value, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo1GreaterThanOrEqualTo(String value) {
            addCriterion("INFO1 >=", value, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo1LessThan(String value) {
            addCriterion("INFO1 <", value, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo1LessThanOrEqualTo(String value) {
            addCriterion("INFO1 <=", value, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo1Like(String value) {
            addCriterion("INFO1 like", value, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo1NotLike(String value) {
            addCriterion("INFO1 not like", value, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo1In(List<String> values) {
            addCriterion("INFO1 in", values, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo1NotIn(List<String> values) {
            addCriterion("INFO1 not in", values, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo1Between(String value1, String value2) {
            addCriterion("INFO1 between", value1, value2, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo1NotBetween(String value1, String value2) {
            addCriterion("INFO1 not between", value1, value2, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo2IsNull() {
            addCriterion("INFO2 is null");
            return (Criteria) this;
        }

        public Criteria andInfo2IsNotNull() {
            addCriterion("INFO2 is not null");
            return (Criteria) this;
        }

        public Criteria andInfo2EqualTo(String value) {
            addCriterion("INFO2 =", value, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo2NotEqualTo(String value) {
            addCriterion("INFO2 <>", value, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo2GreaterThan(String value) {
            addCriterion("INFO2 >", value, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo2GreaterThanOrEqualTo(String value) {
            addCriterion("INFO2 >=", value, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo2LessThan(String value) {
            addCriterion("INFO2 <", value, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo2LessThanOrEqualTo(String value) {
            addCriterion("INFO2 <=", value, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo2Like(String value) {
            addCriterion("INFO2 like", value, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo2NotLike(String value) {
            addCriterion("INFO2 not like", value, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo2In(List<String> values) {
            addCriterion("INFO2 in", values, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo2NotIn(List<String> values) {
            addCriterion("INFO2 not in", values, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo2Between(String value1, String value2) {
            addCriterion("INFO2 between", value1, value2, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo2NotBetween(String value1, String value2) {
            addCriterion("INFO2 not between", value1, value2, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo3IsNull() {
            addCriterion("INFO3 is null");
            return (Criteria) this;
        }

        public Criteria andInfo3IsNotNull() {
            addCriterion("INFO3 is not null");
            return (Criteria) this;
        }

        public Criteria andInfo3EqualTo(String value) {
            addCriterion("INFO3 =", value, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo3NotEqualTo(String value) {
            addCriterion("INFO3 <>", value, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo3GreaterThan(String value) {
            addCriterion("INFO3 >", value, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo3GreaterThanOrEqualTo(String value) {
            addCriterion("INFO3 >=", value, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo3LessThan(String value) {
            addCriterion("INFO3 <", value, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo3LessThanOrEqualTo(String value) {
            addCriterion("INFO3 <=", value, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo3Like(String value) {
            addCriterion("INFO3 like", value, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo3NotLike(String value) {
            addCriterion("INFO3 not like", value, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo3In(List<String> values) {
            addCriterion("INFO3 in", values, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo3NotIn(List<String> values) {
            addCriterion("INFO3 not in", values, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo3Between(String value1, String value2) {
            addCriterion("INFO3 between", value1, value2, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo3NotBetween(String value1, String value2) {
            addCriterion("INFO3 not between", value1, value2, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo4IsNull() {
            addCriterion("INFO4 is null");
            return (Criteria) this;
        }

        public Criteria andInfo4IsNotNull() {
            addCriterion("INFO4 is not null");
            return (Criteria) this;
        }

        public Criteria andInfo4EqualTo(String value) {
            addCriterion("INFO4 =", value, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo4NotEqualTo(String value) {
            addCriterion("INFO4 <>", value, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo4GreaterThan(String value) {
            addCriterion("INFO4 >", value, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo4GreaterThanOrEqualTo(String value) {
            addCriterion("INFO4 >=", value, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo4LessThan(String value) {
            addCriterion("INFO4 <", value, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo4LessThanOrEqualTo(String value) {
            addCriterion("INFO4 <=", value, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo4Like(String value) {
            addCriterion("INFO4 like", value, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo4NotLike(String value) {
            addCriterion("INFO4 not like", value, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo4In(List<String> values) {
            addCriterion("INFO4 in", values, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo4NotIn(List<String> values) {
            addCriterion("INFO4 not in", values, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo4Between(String value1, String value2) {
            addCriterion("INFO4 between", value1, value2, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo4NotBetween(String value1, String value2) {
            addCriterion("INFO4 not between", value1, value2, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo5IsNull() {
            addCriterion("INFO5 is null");
            return (Criteria) this;
        }

        public Criteria andInfo5IsNotNull() {
            addCriterion("INFO5 is not null");
            return (Criteria) this;
        }

        public Criteria andInfo5EqualTo(String value) {
            addCriterion("INFO5 =", value, "info5");
            return (Criteria) this;
        }

        public Criteria andInfo5NotEqualTo(String value) {
            addCriterion("INFO5 <>", value, "info5");
            return (Criteria) this;
        }

        public Criteria andInfo5GreaterThan(String value) {
            addCriterion("INFO5 >", value, "info5");
            return (Criteria) this;
        }

        public Criteria andInfo5GreaterThanOrEqualTo(String value) {
            addCriterion("INFO5 >=", value, "info5");
            return (Criteria) this;
        }

        public Criteria andInfo5LessThan(String value) {
            addCriterion("INFO5 <", value, "info5");
            return (Criteria) this;
        }

        public Criteria andInfo5LessThanOrEqualTo(String value) {
            addCriterion("INFO5 <=", value, "info5");
            return (Criteria) this;
        }

        public Criteria andInfo5Like(String value) {
            addCriterion("INFO5 like", value, "info5");
            return (Criteria) this;
        }

        public Criteria andInfo5NotLike(String value) {
            addCriterion("INFO5 not like", value, "info5");
            return (Criteria) this;
        }

        public Criteria andInfo5In(List<String> values) {
            addCriterion("INFO5 in", values, "info5");
            return (Criteria) this;
        }

        public Criteria andInfo5NotIn(List<String> values) {
            addCriterion("INFO5 not in", values, "info5");
            return (Criteria) this;
        }

        public Criteria andInfo5Between(String value1, String value2) {
            addCriterion("INFO5 between", value1, value2, "info5");
            return (Criteria) this;
        }

        public Criteria andInfo5NotBetween(String value1, String value2) {
            addCriterion("INFO5 not between", value1, value2, "info5");
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