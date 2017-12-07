package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class FrmTipsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrmTipsExample() {
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

        public Criteria andTipinfoIsNull() {
            addCriterion("TIPINFO is null");
            return (Criteria) this;
        }

        public Criteria andTipinfoIsNotNull() {
            addCriterion("TIPINFO is not null");
            return (Criteria) this;
        }

        public Criteria andTipinfoEqualTo(String value) {
            addCriterion("TIPINFO =", value, "tipinfo");
            return (Criteria) this;
        }

        public Criteria andTipinfoNotEqualTo(String value) {
            addCriterion("TIPINFO <>", value, "tipinfo");
            return (Criteria) this;
        }

        public Criteria andTipinfoGreaterThan(String value) {
            addCriterion("TIPINFO >", value, "tipinfo");
            return (Criteria) this;
        }

        public Criteria andTipinfoGreaterThanOrEqualTo(String value) {
            addCriterion("TIPINFO >=", value, "tipinfo");
            return (Criteria) this;
        }

        public Criteria andTipinfoLessThan(String value) {
            addCriterion("TIPINFO <", value, "tipinfo");
            return (Criteria) this;
        }

        public Criteria andTipinfoLessThanOrEqualTo(String value) {
            addCriterion("TIPINFO <=", value, "tipinfo");
            return (Criteria) this;
        }

        public Criteria andTipinfoLike(String value) {
            addCriterion("TIPINFO like", value, "tipinfo");
            return (Criteria) this;
        }

        public Criteria andTipinfoNotLike(String value) {
            addCriterion("TIPINFO not like", value, "tipinfo");
            return (Criteria) this;
        }

        public Criteria andTipinfoIn(List<String> values) {
            addCriterion("TIPINFO in", values, "tipinfo");
            return (Criteria) this;
        }

        public Criteria andTipinfoNotIn(List<String> values) {
            addCriterion("TIPINFO not in", values, "tipinfo");
            return (Criteria) this;
        }

        public Criteria andTipinfoBetween(String value1, String value2) {
            addCriterion("TIPINFO between", value1, value2, "tipinfo");
            return (Criteria) this;
        }

        public Criteria andTipinfoNotBetween(String value1, String value2) {
            addCriterion("TIPINFO not between", value1, value2, "tipinfo");
            return (Criteria) this;
        }

        public Criteria andTipurlIsNull() {
            addCriterion("TIPURL is null");
            return (Criteria) this;
        }

        public Criteria andTipurlIsNotNull() {
            addCriterion("TIPURL is not null");
            return (Criteria) this;
        }

        public Criteria andTipurlEqualTo(String value) {
            addCriterion("TIPURL =", value, "tipurl");
            return (Criteria) this;
        }

        public Criteria andTipurlNotEqualTo(String value) {
            addCriterion("TIPURL <>", value, "tipurl");
            return (Criteria) this;
        }

        public Criteria andTipurlGreaterThan(String value) {
            addCriterion("TIPURL >", value, "tipurl");
            return (Criteria) this;
        }

        public Criteria andTipurlGreaterThanOrEqualTo(String value) {
            addCriterion("TIPURL >=", value, "tipurl");
            return (Criteria) this;
        }

        public Criteria andTipurlLessThan(String value) {
            addCriterion("TIPURL <", value, "tipurl");
            return (Criteria) this;
        }

        public Criteria andTipurlLessThanOrEqualTo(String value) {
            addCriterion("TIPURL <=", value, "tipurl");
            return (Criteria) this;
        }

        public Criteria andTipurlLike(String value) {
            addCriterion("TIPURL like", value, "tipurl");
            return (Criteria) this;
        }

        public Criteria andTipurlNotLike(String value) {
            addCriterion("TIPURL not like", value, "tipurl");
            return (Criteria) this;
        }

        public Criteria andTipurlIn(List<String> values) {
            addCriterion("TIPURL in", values, "tipurl");
            return (Criteria) this;
        }

        public Criteria andTipurlNotIn(List<String> values) {
            addCriterion("TIPURL not in", values, "tipurl");
            return (Criteria) this;
        }

        public Criteria andTipurlBetween(String value1, String value2) {
            addCriterion("TIPURL between", value1, value2, "tipurl");
            return (Criteria) this;
        }

        public Criteria andTipurlNotBetween(String value1, String value2) {
            addCriterion("TIPURL not between", value1, value2, "tipurl");
            return (Criteria) this;
        }

        public Criteria andIsenforceIsNull() {
            addCriterion("ISENFORCE is null");
            return (Criteria) this;
        }

        public Criteria andIsenforceIsNotNull() {
            addCriterion("ISENFORCE is not null");
            return (Criteria) this;
        }

        public Criteria andIsenforceEqualTo(Short value) {
            addCriterion("ISENFORCE =", value, "isenforce");
            return (Criteria) this;
        }

        public Criteria andIsenforceNotEqualTo(Short value) {
            addCriterion("ISENFORCE <>", value, "isenforce");
            return (Criteria) this;
        }

        public Criteria andIsenforceGreaterThan(Short value) {
            addCriterion("ISENFORCE >", value, "isenforce");
            return (Criteria) this;
        }

        public Criteria andIsenforceGreaterThanOrEqualTo(Short value) {
            addCriterion("ISENFORCE >=", value, "isenforce");
            return (Criteria) this;
        }

        public Criteria andIsenforceLessThan(Short value) {
            addCriterion("ISENFORCE <", value, "isenforce");
            return (Criteria) this;
        }

        public Criteria andIsenforceLessThanOrEqualTo(Short value) {
            addCriterion("ISENFORCE <=", value, "isenforce");
            return (Criteria) this;
        }

        public Criteria andIsenforceIn(List<Short> values) {
            addCriterion("ISENFORCE in", values, "isenforce");
            return (Criteria) this;
        }

        public Criteria andIsenforceNotIn(List<Short> values) {
            addCriterion("ISENFORCE not in", values, "isenforce");
            return (Criteria) this;
        }

        public Criteria andIsenforceBetween(Short value1, Short value2) {
            addCriterion("ISENFORCE between", value1, value2, "isenforce");
            return (Criteria) this;
        }

        public Criteria andIsenforceNotBetween(Short value1, Short value2) {
            addCriterion("ISENFORCE not between", value1, value2, "isenforce");
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

        public Criteria andIsshowedIsNull() {
            addCriterion("ISSHOWED is null");
            return (Criteria) this;
        }

        public Criteria andIsshowedIsNotNull() {
            addCriterion("ISSHOWED is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowedEqualTo(String value) {
            addCriterion("ISSHOWED =", value, "isshowed");
            return (Criteria) this;
        }

        public Criteria andIsshowedNotEqualTo(String value) {
            addCriterion("ISSHOWED <>", value, "isshowed");
            return (Criteria) this;
        }

        public Criteria andIsshowedGreaterThan(String value) {
            addCriterion("ISSHOWED >", value, "isshowed");
            return (Criteria) this;
        }

        public Criteria andIsshowedGreaterThanOrEqualTo(String value) {
            addCriterion("ISSHOWED >=", value, "isshowed");
            return (Criteria) this;
        }

        public Criteria andIsshowedLessThan(String value) {
            addCriterion("ISSHOWED <", value, "isshowed");
            return (Criteria) this;
        }

        public Criteria andIsshowedLessThanOrEqualTo(String value) {
            addCriterion("ISSHOWED <=", value, "isshowed");
            return (Criteria) this;
        }

        public Criteria andIsshowedLike(String value) {
            addCriterion("ISSHOWED like", value, "isshowed");
            return (Criteria) this;
        }

        public Criteria andIsshowedNotLike(String value) {
            addCriterion("ISSHOWED not like", value, "isshowed");
            return (Criteria) this;
        }

        public Criteria andIsshowedIn(List<String> values) {
            addCriterion("ISSHOWED in", values, "isshowed");
            return (Criteria) this;
        }

        public Criteria andIsshowedNotIn(List<String> values) {
            addCriterion("ISSHOWED not in", values, "isshowed");
            return (Criteria) this;
        }

        public Criteria andIsshowedBetween(String value1, String value2) {
            addCriterion("ISSHOWED between", value1, value2, "isshowed");
            return (Criteria) this;
        }

        public Criteria andIsshowedNotBetween(String value1, String value2) {
            addCriterion("ISSHOWED not between", value1, value2, "isshowed");
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