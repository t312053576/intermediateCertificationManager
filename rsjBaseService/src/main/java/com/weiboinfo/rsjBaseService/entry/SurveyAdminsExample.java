package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class SurveyAdminsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SurveyAdminsExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("A_ID is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("A_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(String value) {
            addCriterion("A_ID =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(String value) {
            addCriterion("A_ID <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(String value) {
            addCriterion("A_ID >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(String value) {
            addCriterion("A_ID >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(String value) {
            addCriterion("A_ID <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(String value) {
            addCriterion("A_ID <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLike(String value) {
            addCriterion("A_ID like", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotLike(String value) {
            addCriterion("A_ID not like", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<String> values) {
            addCriterion("A_ID in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<String> values) {
            addCriterion("A_ID not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(String value1, String value2) {
            addCriterion("A_ID between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(String value1, String value2) {
            addCriterion("A_ID not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAUserIsNull() {
            addCriterion("A_USER is null");
            return (Criteria) this;
        }

        public Criteria andAUserIsNotNull() {
            addCriterion("A_USER is not null");
            return (Criteria) this;
        }

        public Criteria andAUserEqualTo(String value) {
            addCriterion("A_USER =", value, "aUser");
            return (Criteria) this;
        }

        public Criteria andAUserNotEqualTo(String value) {
            addCriterion("A_USER <>", value, "aUser");
            return (Criteria) this;
        }

        public Criteria andAUserGreaterThan(String value) {
            addCriterion("A_USER >", value, "aUser");
            return (Criteria) this;
        }

        public Criteria andAUserGreaterThanOrEqualTo(String value) {
            addCriterion("A_USER >=", value, "aUser");
            return (Criteria) this;
        }

        public Criteria andAUserLessThan(String value) {
            addCriterion("A_USER <", value, "aUser");
            return (Criteria) this;
        }

        public Criteria andAUserLessThanOrEqualTo(String value) {
            addCriterion("A_USER <=", value, "aUser");
            return (Criteria) this;
        }

        public Criteria andAUserLike(String value) {
            addCriterion("A_USER like", value, "aUser");
            return (Criteria) this;
        }

        public Criteria andAUserNotLike(String value) {
            addCriterion("A_USER not like", value, "aUser");
            return (Criteria) this;
        }

        public Criteria andAUserIn(List<String> values) {
            addCriterion("A_USER in", values, "aUser");
            return (Criteria) this;
        }

        public Criteria andAUserNotIn(List<String> values) {
            addCriterion("A_USER not in", values, "aUser");
            return (Criteria) this;
        }

        public Criteria andAUserBetween(String value1, String value2) {
            addCriterion("A_USER between", value1, value2, "aUser");
            return (Criteria) this;
        }

        public Criteria andAUserNotBetween(String value1, String value2) {
            addCriterion("A_USER not between", value1, value2, "aUser");
            return (Criteria) this;
        }

        public Criteria andAPassIsNull() {
            addCriterion("A_PASS is null");
            return (Criteria) this;
        }

        public Criteria andAPassIsNotNull() {
            addCriterion("A_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andAPassEqualTo(String value) {
            addCriterion("A_PASS =", value, "aPass");
            return (Criteria) this;
        }

        public Criteria andAPassNotEqualTo(String value) {
            addCriterion("A_PASS <>", value, "aPass");
            return (Criteria) this;
        }

        public Criteria andAPassGreaterThan(String value) {
            addCriterion("A_PASS >", value, "aPass");
            return (Criteria) this;
        }

        public Criteria andAPassGreaterThanOrEqualTo(String value) {
            addCriterion("A_PASS >=", value, "aPass");
            return (Criteria) this;
        }

        public Criteria andAPassLessThan(String value) {
            addCriterion("A_PASS <", value, "aPass");
            return (Criteria) this;
        }

        public Criteria andAPassLessThanOrEqualTo(String value) {
            addCriterion("A_PASS <=", value, "aPass");
            return (Criteria) this;
        }

        public Criteria andAPassLike(String value) {
            addCriterion("A_PASS like", value, "aPass");
            return (Criteria) this;
        }

        public Criteria andAPassNotLike(String value) {
            addCriterion("A_PASS not like", value, "aPass");
            return (Criteria) this;
        }

        public Criteria andAPassIn(List<String> values) {
            addCriterion("A_PASS in", values, "aPass");
            return (Criteria) this;
        }

        public Criteria andAPassNotIn(List<String> values) {
            addCriterion("A_PASS not in", values, "aPass");
            return (Criteria) this;
        }

        public Criteria andAPassBetween(String value1, String value2) {
            addCriterion("A_PASS between", value1, value2, "aPass");
            return (Criteria) this;
        }

        public Criteria andAPassNotBetween(String value1, String value2) {
            addCriterion("A_PASS not between", value1, value2, "aPass");
            return (Criteria) this;
        }

        public Criteria andANameIsNull() {
            addCriterion("A_NAME is null");
            return (Criteria) this;
        }

        public Criteria andANameIsNotNull() {
            addCriterion("A_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andANameEqualTo(String value) {
            addCriterion("A_NAME =", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotEqualTo(String value) {
            addCriterion("A_NAME <>", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThan(String value) {
            addCriterion("A_NAME >", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThanOrEqualTo(String value) {
            addCriterion("A_NAME >=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThan(String value) {
            addCriterion("A_NAME <", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThanOrEqualTo(String value) {
            addCriterion("A_NAME <=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLike(String value) {
            addCriterion("A_NAME like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotLike(String value) {
            addCriterion("A_NAME not like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameIn(List<String> values) {
            addCriterion("A_NAME in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotIn(List<String> values) {
            addCriterion("A_NAME not in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameBetween(String value1, String value2) {
            addCriterion("A_NAME between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotBetween(String value1, String value2) {
            addCriterion("A_NAME not between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andAIslockIsNull() {
            addCriterion("A_ISLOCK is null");
            return (Criteria) this;
        }

        public Criteria andAIslockIsNotNull() {
            addCriterion("A_ISLOCK is not null");
            return (Criteria) this;
        }

        public Criteria andAIslockEqualTo(String value) {
            addCriterion("A_ISLOCK =", value, "aIslock");
            return (Criteria) this;
        }

        public Criteria andAIslockNotEqualTo(String value) {
            addCriterion("A_ISLOCK <>", value, "aIslock");
            return (Criteria) this;
        }

        public Criteria andAIslockGreaterThan(String value) {
            addCriterion("A_ISLOCK >", value, "aIslock");
            return (Criteria) this;
        }

        public Criteria andAIslockGreaterThanOrEqualTo(String value) {
            addCriterion("A_ISLOCK >=", value, "aIslock");
            return (Criteria) this;
        }

        public Criteria andAIslockLessThan(String value) {
            addCriterion("A_ISLOCK <", value, "aIslock");
            return (Criteria) this;
        }

        public Criteria andAIslockLessThanOrEqualTo(String value) {
            addCriterion("A_ISLOCK <=", value, "aIslock");
            return (Criteria) this;
        }

        public Criteria andAIslockLike(String value) {
            addCriterion("A_ISLOCK like", value, "aIslock");
            return (Criteria) this;
        }

        public Criteria andAIslockNotLike(String value) {
            addCriterion("A_ISLOCK not like", value, "aIslock");
            return (Criteria) this;
        }

        public Criteria andAIslockIn(List<String> values) {
            addCriterion("A_ISLOCK in", values, "aIslock");
            return (Criteria) this;
        }

        public Criteria andAIslockNotIn(List<String> values) {
            addCriterion("A_ISLOCK not in", values, "aIslock");
            return (Criteria) this;
        }

        public Criteria andAIslockBetween(String value1, String value2) {
            addCriterion("A_ISLOCK between", value1, value2, "aIslock");
            return (Criteria) this;
        }

        public Criteria andAIslockNotBetween(String value1, String value2) {
            addCriterion("A_ISLOCK not between", value1, value2, "aIslock");
            return (Criteria) this;
        }

        public Criteria andALastlogtimeIsNull() {
            addCriterion("A_LASTLOGTIME is null");
            return (Criteria) this;
        }

        public Criteria andALastlogtimeIsNotNull() {
            addCriterion("A_LASTLOGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andALastlogtimeEqualTo(String value) {
            addCriterion("A_LASTLOGTIME =", value, "aLastlogtime");
            return (Criteria) this;
        }

        public Criteria andALastlogtimeNotEqualTo(String value) {
            addCriterion("A_LASTLOGTIME <>", value, "aLastlogtime");
            return (Criteria) this;
        }

        public Criteria andALastlogtimeGreaterThan(String value) {
            addCriterion("A_LASTLOGTIME >", value, "aLastlogtime");
            return (Criteria) this;
        }

        public Criteria andALastlogtimeGreaterThanOrEqualTo(String value) {
            addCriterion("A_LASTLOGTIME >=", value, "aLastlogtime");
            return (Criteria) this;
        }

        public Criteria andALastlogtimeLessThan(String value) {
            addCriterion("A_LASTLOGTIME <", value, "aLastlogtime");
            return (Criteria) this;
        }

        public Criteria andALastlogtimeLessThanOrEqualTo(String value) {
            addCriterion("A_LASTLOGTIME <=", value, "aLastlogtime");
            return (Criteria) this;
        }

        public Criteria andALastlogtimeLike(String value) {
            addCriterion("A_LASTLOGTIME like", value, "aLastlogtime");
            return (Criteria) this;
        }

        public Criteria andALastlogtimeNotLike(String value) {
            addCriterion("A_LASTLOGTIME not like", value, "aLastlogtime");
            return (Criteria) this;
        }

        public Criteria andALastlogtimeIn(List<String> values) {
            addCriterion("A_LASTLOGTIME in", values, "aLastlogtime");
            return (Criteria) this;
        }

        public Criteria andALastlogtimeNotIn(List<String> values) {
            addCriterion("A_LASTLOGTIME not in", values, "aLastlogtime");
            return (Criteria) this;
        }

        public Criteria andALastlogtimeBetween(String value1, String value2) {
            addCriterion("A_LASTLOGTIME between", value1, value2, "aLastlogtime");
            return (Criteria) this;
        }

        public Criteria andALastlogtimeNotBetween(String value1, String value2) {
            addCriterion("A_LASTLOGTIME not between", value1, value2, "aLastlogtime");
            return (Criteria) this;
        }

        public Criteria andALogtimesIsNull() {
            addCriterion("A_LOGTIMES is null");
            return (Criteria) this;
        }

        public Criteria andALogtimesIsNotNull() {
            addCriterion("A_LOGTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andALogtimesEqualTo(String value) {
            addCriterion("A_LOGTIMES =", value, "aLogtimes");
            return (Criteria) this;
        }

        public Criteria andALogtimesNotEqualTo(String value) {
            addCriterion("A_LOGTIMES <>", value, "aLogtimes");
            return (Criteria) this;
        }

        public Criteria andALogtimesGreaterThan(String value) {
            addCriterion("A_LOGTIMES >", value, "aLogtimes");
            return (Criteria) this;
        }

        public Criteria andALogtimesGreaterThanOrEqualTo(String value) {
            addCriterion("A_LOGTIMES >=", value, "aLogtimes");
            return (Criteria) this;
        }

        public Criteria andALogtimesLessThan(String value) {
            addCriterion("A_LOGTIMES <", value, "aLogtimes");
            return (Criteria) this;
        }

        public Criteria andALogtimesLessThanOrEqualTo(String value) {
            addCriterion("A_LOGTIMES <=", value, "aLogtimes");
            return (Criteria) this;
        }

        public Criteria andALogtimesLike(String value) {
            addCriterion("A_LOGTIMES like", value, "aLogtimes");
            return (Criteria) this;
        }

        public Criteria andALogtimesNotLike(String value) {
            addCriterion("A_LOGTIMES not like", value, "aLogtimes");
            return (Criteria) this;
        }

        public Criteria andALogtimesIn(List<String> values) {
            addCriterion("A_LOGTIMES in", values, "aLogtimes");
            return (Criteria) this;
        }

        public Criteria andALogtimesNotIn(List<String> values) {
            addCriterion("A_LOGTIMES not in", values, "aLogtimes");
            return (Criteria) this;
        }

        public Criteria andALogtimesBetween(String value1, String value2) {
            addCriterion("A_LOGTIMES between", value1, value2, "aLogtimes");
            return (Criteria) this;
        }

        public Criteria andALogtimesNotBetween(String value1, String value2) {
            addCriterion("A_LOGTIMES not between", value1, value2, "aLogtimes");
            return (Criteria) this;
        }

        public Criteria andALoginipIsNull() {
            addCriterion("A_LOGINIP is null");
            return (Criteria) this;
        }

        public Criteria andALoginipIsNotNull() {
            addCriterion("A_LOGINIP is not null");
            return (Criteria) this;
        }

        public Criteria andALoginipEqualTo(String value) {
            addCriterion("A_LOGINIP =", value, "aLoginip");
            return (Criteria) this;
        }

        public Criteria andALoginipNotEqualTo(String value) {
            addCriterion("A_LOGINIP <>", value, "aLoginip");
            return (Criteria) this;
        }

        public Criteria andALoginipGreaterThan(String value) {
            addCriterion("A_LOGINIP >", value, "aLoginip");
            return (Criteria) this;
        }

        public Criteria andALoginipGreaterThanOrEqualTo(String value) {
            addCriterion("A_LOGINIP >=", value, "aLoginip");
            return (Criteria) this;
        }

        public Criteria andALoginipLessThan(String value) {
            addCriterion("A_LOGINIP <", value, "aLoginip");
            return (Criteria) this;
        }

        public Criteria andALoginipLessThanOrEqualTo(String value) {
            addCriterion("A_LOGINIP <=", value, "aLoginip");
            return (Criteria) this;
        }

        public Criteria andALoginipLike(String value) {
            addCriterion("A_LOGINIP like", value, "aLoginip");
            return (Criteria) this;
        }

        public Criteria andALoginipNotLike(String value) {
            addCriterion("A_LOGINIP not like", value, "aLoginip");
            return (Criteria) this;
        }

        public Criteria andALoginipIn(List<String> values) {
            addCriterion("A_LOGINIP in", values, "aLoginip");
            return (Criteria) this;
        }

        public Criteria andALoginipNotIn(List<String> values) {
            addCriterion("A_LOGINIP not in", values, "aLoginip");
            return (Criteria) this;
        }

        public Criteria andALoginipBetween(String value1, String value2) {
            addCriterion("A_LOGINIP between", value1, value2, "aLoginip");
            return (Criteria) this;
        }

        public Criteria andALoginipNotBetween(String value1, String value2) {
            addCriterion("A_LOGINIP not between", value1, value2, "aLoginip");
            return (Criteria) this;
        }

        public Criteria andAAddtimeIsNull() {
            addCriterion("A_ADDTIME is null");
            return (Criteria) this;
        }

        public Criteria andAAddtimeIsNotNull() {
            addCriterion("A_ADDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAAddtimeEqualTo(String value) {
            addCriterion("A_ADDTIME =", value, "aAddtime");
            return (Criteria) this;
        }

        public Criteria andAAddtimeNotEqualTo(String value) {
            addCriterion("A_ADDTIME <>", value, "aAddtime");
            return (Criteria) this;
        }

        public Criteria andAAddtimeGreaterThan(String value) {
            addCriterion("A_ADDTIME >", value, "aAddtime");
            return (Criteria) this;
        }

        public Criteria andAAddtimeGreaterThanOrEqualTo(String value) {
            addCriterion("A_ADDTIME >=", value, "aAddtime");
            return (Criteria) this;
        }

        public Criteria andAAddtimeLessThan(String value) {
            addCriterion("A_ADDTIME <", value, "aAddtime");
            return (Criteria) this;
        }

        public Criteria andAAddtimeLessThanOrEqualTo(String value) {
            addCriterion("A_ADDTIME <=", value, "aAddtime");
            return (Criteria) this;
        }

        public Criteria andAAddtimeLike(String value) {
            addCriterion("A_ADDTIME like", value, "aAddtime");
            return (Criteria) this;
        }

        public Criteria andAAddtimeNotLike(String value) {
            addCriterion("A_ADDTIME not like", value, "aAddtime");
            return (Criteria) this;
        }

        public Criteria andAAddtimeIn(List<String> values) {
            addCriterion("A_ADDTIME in", values, "aAddtime");
            return (Criteria) this;
        }

        public Criteria andAAddtimeNotIn(List<String> values) {
            addCriterion("A_ADDTIME not in", values, "aAddtime");
            return (Criteria) this;
        }

        public Criteria andAAddtimeBetween(String value1, String value2) {
            addCriterion("A_ADDTIME between", value1, value2, "aAddtime");
            return (Criteria) this;
        }

        public Criteria andAAddtimeNotBetween(String value1, String value2) {
            addCriterion("A_ADDTIME not between", value1, value2, "aAddtime");
            return (Criteria) this;
        }

        public Criteria andAEmailIsNull() {
            addCriterion("A_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andAEmailIsNotNull() {
            addCriterion("A_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andAEmailEqualTo(String value) {
            addCriterion("A_EMAIL =", value, "aEmail");
            return (Criteria) this;
        }

        public Criteria andAEmailNotEqualTo(String value) {
            addCriterion("A_EMAIL <>", value, "aEmail");
            return (Criteria) this;
        }

        public Criteria andAEmailGreaterThan(String value) {
            addCriterion("A_EMAIL >", value, "aEmail");
            return (Criteria) this;
        }

        public Criteria andAEmailGreaterThanOrEqualTo(String value) {
            addCriterion("A_EMAIL >=", value, "aEmail");
            return (Criteria) this;
        }

        public Criteria andAEmailLessThan(String value) {
            addCriterion("A_EMAIL <", value, "aEmail");
            return (Criteria) this;
        }

        public Criteria andAEmailLessThanOrEqualTo(String value) {
            addCriterion("A_EMAIL <=", value, "aEmail");
            return (Criteria) this;
        }

        public Criteria andAEmailLike(String value) {
            addCriterion("A_EMAIL like", value, "aEmail");
            return (Criteria) this;
        }

        public Criteria andAEmailNotLike(String value) {
            addCriterion("A_EMAIL not like", value, "aEmail");
            return (Criteria) this;
        }

        public Criteria andAEmailIn(List<String> values) {
            addCriterion("A_EMAIL in", values, "aEmail");
            return (Criteria) this;
        }

        public Criteria andAEmailNotIn(List<String> values) {
            addCriterion("A_EMAIL not in", values, "aEmail");
            return (Criteria) this;
        }

        public Criteria andAEmailBetween(String value1, String value2) {
            addCriterion("A_EMAIL between", value1, value2, "aEmail");
            return (Criteria) this;
        }

        public Criteria andAEmailNotBetween(String value1, String value2) {
            addCriterion("A_EMAIL not between", value1, value2, "aEmail");
            return (Criteria) this;
        }

        public Criteria andAInfoIsNull() {
            addCriterion("A_INFO is null");
            return (Criteria) this;
        }

        public Criteria andAInfoIsNotNull() {
            addCriterion("A_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andAInfoEqualTo(String value) {
            addCriterion("A_INFO =", value, "aInfo");
            return (Criteria) this;
        }

        public Criteria andAInfoNotEqualTo(String value) {
            addCriterion("A_INFO <>", value, "aInfo");
            return (Criteria) this;
        }

        public Criteria andAInfoGreaterThan(String value) {
            addCriterion("A_INFO >", value, "aInfo");
            return (Criteria) this;
        }

        public Criteria andAInfoGreaterThanOrEqualTo(String value) {
            addCriterion("A_INFO >=", value, "aInfo");
            return (Criteria) this;
        }

        public Criteria andAInfoLessThan(String value) {
            addCriterion("A_INFO <", value, "aInfo");
            return (Criteria) this;
        }

        public Criteria andAInfoLessThanOrEqualTo(String value) {
            addCriterion("A_INFO <=", value, "aInfo");
            return (Criteria) this;
        }

        public Criteria andAInfoLike(String value) {
            addCriterion("A_INFO like", value, "aInfo");
            return (Criteria) this;
        }

        public Criteria andAInfoNotLike(String value) {
            addCriterion("A_INFO not like", value, "aInfo");
            return (Criteria) this;
        }

        public Criteria andAInfoIn(List<String> values) {
            addCriterion("A_INFO in", values, "aInfo");
            return (Criteria) this;
        }

        public Criteria andAInfoNotIn(List<String> values) {
            addCriterion("A_INFO not in", values, "aInfo");
            return (Criteria) this;
        }

        public Criteria andAInfoBetween(String value1, String value2) {
            addCriterion("A_INFO between", value1, value2, "aInfo");
            return (Criteria) this;
        }

        public Criteria andAInfoNotBetween(String value1, String value2) {
            addCriterion("A_INFO not between", value1, value2, "aInfo");
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