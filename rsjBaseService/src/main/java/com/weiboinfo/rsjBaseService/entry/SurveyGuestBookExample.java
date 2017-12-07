package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class SurveyGuestBookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SurveyGuestBookExample() {
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

        public Criteria andGbIdIsNull() {
            addCriterion("GB_ID is null");
            return (Criteria) this;
        }

        public Criteria andGbIdIsNotNull() {
            addCriterion("GB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGbIdEqualTo(String value) {
            addCriterion("GB_ID =", value, "gbId");
            return (Criteria) this;
        }

        public Criteria andGbIdNotEqualTo(String value) {
            addCriterion("GB_ID <>", value, "gbId");
            return (Criteria) this;
        }

        public Criteria andGbIdGreaterThan(String value) {
            addCriterion("GB_ID >", value, "gbId");
            return (Criteria) this;
        }

        public Criteria andGbIdGreaterThanOrEqualTo(String value) {
            addCriterion("GB_ID >=", value, "gbId");
            return (Criteria) this;
        }

        public Criteria andGbIdLessThan(String value) {
            addCriterion("GB_ID <", value, "gbId");
            return (Criteria) this;
        }

        public Criteria andGbIdLessThanOrEqualTo(String value) {
            addCriterion("GB_ID <=", value, "gbId");
            return (Criteria) this;
        }

        public Criteria andGbIdLike(String value) {
            addCriterion("GB_ID like", value, "gbId");
            return (Criteria) this;
        }

        public Criteria andGbIdNotLike(String value) {
            addCriterion("GB_ID not like", value, "gbId");
            return (Criteria) this;
        }

        public Criteria andGbIdIn(List<String> values) {
            addCriterion("GB_ID in", values, "gbId");
            return (Criteria) this;
        }

        public Criteria andGbIdNotIn(List<String> values) {
            addCriterion("GB_ID not in", values, "gbId");
            return (Criteria) this;
        }

        public Criteria andGbIdBetween(String value1, String value2) {
            addCriterion("GB_ID between", value1, value2, "gbId");
            return (Criteria) this;
        }

        public Criteria andGbIdNotBetween(String value1, String value2) {
            addCriterion("GB_ID not between", value1, value2, "gbId");
            return (Criteria) this;
        }

        public Criteria andGbUserIsNull() {
            addCriterion("GB_USER is null");
            return (Criteria) this;
        }

        public Criteria andGbUserIsNotNull() {
            addCriterion("GB_USER is not null");
            return (Criteria) this;
        }

        public Criteria andGbUserEqualTo(String value) {
            addCriterion("GB_USER =", value, "gbUser");
            return (Criteria) this;
        }

        public Criteria andGbUserNotEqualTo(String value) {
            addCriterion("GB_USER <>", value, "gbUser");
            return (Criteria) this;
        }

        public Criteria andGbUserGreaterThan(String value) {
            addCriterion("GB_USER >", value, "gbUser");
            return (Criteria) this;
        }

        public Criteria andGbUserGreaterThanOrEqualTo(String value) {
            addCriterion("GB_USER >=", value, "gbUser");
            return (Criteria) this;
        }

        public Criteria andGbUserLessThan(String value) {
            addCriterion("GB_USER <", value, "gbUser");
            return (Criteria) this;
        }

        public Criteria andGbUserLessThanOrEqualTo(String value) {
            addCriterion("GB_USER <=", value, "gbUser");
            return (Criteria) this;
        }

        public Criteria andGbUserLike(String value) {
            addCriterion("GB_USER like", value, "gbUser");
            return (Criteria) this;
        }

        public Criteria andGbUserNotLike(String value) {
            addCriterion("GB_USER not like", value, "gbUser");
            return (Criteria) this;
        }

        public Criteria andGbUserIn(List<String> values) {
            addCriterion("GB_USER in", values, "gbUser");
            return (Criteria) this;
        }

        public Criteria andGbUserNotIn(List<String> values) {
            addCriterion("GB_USER not in", values, "gbUser");
            return (Criteria) this;
        }

        public Criteria andGbUserBetween(String value1, String value2) {
            addCriterion("GB_USER between", value1, value2, "gbUser");
            return (Criteria) this;
        }

        public Criteria andGbUserNotBetween(String value1, String value2) {
            addCriterion("GB_USER not between", value1, value2, "gbUser");
            return (Criteria) this;
        }

        public Criteria andGbPostdateIsNull() {
            addCriterion("GB_POSTDATE is null");
            return (Criteria) this;
        }

        public Criteria andGbPostdateIsNotNull() {
            addCriterion("GB_POSTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andGbPostdateEqualTo(String value) {
            addCriterion("GB_POSTDATE =", value, "gbPostdate");
            return (Criteria) this;
        }

        public Criteria andGbPostdateNotEqualTo(String value) {
            addCriterion("GB_POSTDATE <>", value, "gbPostdate");
            return (Criteria) this;
        }

        public Criteria andGbPostdateGreaterThan(String value) {
            addCriterion("GB_POSTDATE >", value, "gbPostdate");
            return (Criteria) this;
        }

        public Criteria andGbPostdateGreaterThanOrEqualTo(String value) {
            addCriterion("GB_POSTDATE >=", value, "gbPostdate");
            return (Criteria) this;
        }

        public Criteria andGbPostdateLessThan(String value) {
            addCriterion("GB_POSTDATE <", value, "gbPostdate");
            return (Criteria) this;
        }

        public Criteria andGbPostdateLessThanOrEqualTo(String value) {
            addCriterion("GB_POSTDATE <=", value, "gbPostdate");
            return (Criteria) this;
        }

        public Criteria andGbPostdateLike(String value) {
            addCriterion("GB_POSTDATE like", value, "gbPostdate");
            return (Criteria) this;
        }

        public Criteria andGbPostdateNotLike(String value) {
            addCriterion("GB_POSTDATE not like", value, "gbPostdate");
            return (Criteria) this;
        }

        public Criteria andGbPostdateIn(List<String> values) {
            addCriterion("GB_POSTDATE in", values, "gbPostdate");
            return (Criteria) this;
        }

        public Criteria andGbPostdateNotIn(List<String> values) {
            addCriterion("GB_POSTDATE not in", values, "gbPostdate");
            return (Criteria) this;
        }

        public Criteria andGbPostdateBetween(String value1, String value2) {
            addCriterion("GB_POSTDATE between", value1, value2, "gbPostdate");
            return (Criteria) this;
        }

        public Criteria andGbPostdateNotBetween(String value1, String value2) {
            addCriterion("GB_POSTDATE not between", value1, value2, "gbPostdate");
            return (Criteria) this;
        }

        public Criteria andGbContentIsNull() {
            addCriterion("GB_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andGbContentIsNotNull() {
            addCriterion("GB_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andGbContentEqualTo(String value) {
            addCriterion("GB_CONTENT =", value, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbContentNotEqualTo(String value) {
            addCriterion("GB_CONTENT <>", value, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbContentGreaterThan(String value) {
            addCriterion("GB_CONTENT >", value, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbContentGreaterThanOrEqualTo(String value) {
            addCriterion("GB_CONTENT >=", value, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbContentLessThan(String value) {
            addCriterion("GB_CONTENT <", value, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbContentLessThanOrEqualTo(String value) {
            addCriterion("GB_CONTENT <=", value, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbContentLike(String value) {
            addCriterion("GB_CONTENT like", value, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbContentNotLike(String value) {
            addCriterion("GB_CONTENT not like", value, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbContentIn(List<String> values) {
            addCriterion("GB_CONTENT in", values, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbContentNotIn(List<String> values) {
            addCriterion("GB_CONTENT not in", values, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbContentBetween(String value1, String value2) {
            addCriterion("GB_CONTENT between", value1, value2, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbContentNotBetween(String value1, String value2) {
            addCriterion("GB_CONTENT not between", value1, value2, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbPhoneIsNull() {
            addCriterion("GB_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andGbPhoneIsNotNull() {
            addCriterion("GB_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andGbPhoneEqualTo(String value) {
            addCriterion("GB_PHONE =", value, "gbPhone");
            return (Criteria) this;
        }

        public Criteria andGbPhoneNotEqualTo(String value) {
            addCriterion("GB_PHONE <>", value, "gbPhone");
            return (Criteria) this;
        }

        public Criteria andGbPhoneGreaterThan(String value) {
            addCriterion("GB_PHONE >", value, "gbPhone");
            return (Criteria) this;
        }

        public Criteria andGbPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("GB_PHONE >=", value, "gbPhone");
            return (Criteria) this;
        }

        public Criteria andGbPhoneLessThan(String value) {
            addCriterion("GB_PHONE <", value, "gbPhone");
            return (Criteria) this;
        }

        public Criteria andGbPhoneLessThanOrEqualTo(String value) {
            addCriterion("GB_PHONE <=", value, "gbPhone");
            return (Criteria) this;
        }

        public Criteria andGbPhoneLike(String value) {
            addCriterion("GB_PHONE like", value, "gbPhone");
            return (Criteria) this;
        }

        public Criteria andGbPhoneNotLike(String value) {
            addCriterion("GB_PHONE not like", value, "gbPhone");
            return (Criteria) this;
        }

        public Criteria andGbPhoneIn(List<String> values) {
            addCriterion("GB_PHONE in", values, "gbPhone");
            return (Criteria) this;
        }

        public Criteria andGbPhoneNotIn(List<String> values) {
            addCriterion("GB_PHONE not in", values, "gbPhone");
            return (Criteria) this;
        }

        public Criteria andGbPhoneBetween(String value1, String value2) {
            addCriterion("GB_PHONE between", value1, value2, "gbPhone");
            return (Criteria) this;
        }

        public Criteria andGbPhoneNotBetween(String value1, String value2) {
            addCriterion("GB_PHONE not between", value1, value2, "gbPhone");
            return (Criteria) this;
        }

        public Criteria andGbQqIsNull() {
            addCriterion("GB_QQ is null");
            return (Criteria) this;
        }

        public Criteria andGbQqIsNotNull() {
            addCriterion("GB_QQ is not null");
            return (Criteria) this;
        }

        public Criteria andGbQqEqualTo(String value) {
            addCriterion("GB_QQ =", value, "gbQq");
            return (Criteria) this;
        }

        public Criteria andGbQqNotEqualTo(String value) {
            addCriterion("GB_QQ <>", value, "gbQq");
            return (Criteria) this;
        }

        public Criteria andGbQqGreaterThan(String value) {
            addCriterion("GB_QQ >", value, "gbQq");
            return (Criteria) this;
        }

        public Criteria andGbQqGreaterThanOrEqualTo(String value) {
            addCriterion("GB_QQ >=", value, "gbQq");
            return (Criteria) this;
        }

        public Criteria andGbQqLessThan(String value) {
            addCriterion("GB_QQ <", value, "gbQq");
            return (Criteria) this;
        }

        public Criteria andGbQqLessThanOrEqualTo(String value) {
            addCriterion("GB_QQ <=", value, "gbQq");
            return (Criteria) this;
        }

        public Criteria andGbQqLike(String value) {
            addCriterion("GB_QQ like", value, "gbQq");
            return (Criteria) this;
        }

        public Criteria andGbQqNotLike(String value) {
            addCriterion("GB_QQ not like", value, "gbQq");
            return (Criteria) this;
        }

        public Criteria andGbQqIn(List<String> values) {
            addCriterion("GB_QQ in", values, "gbQq");
            return (Criteria) this;
        }

        public Criteria andGbQqNotIn(List<String> values) {
            addCriterion("GB_QQ not in", values, "gbQq");
            return (Criteria) this;
        }

        public Criteria andGbQqBetween(String value1, String value2) {
            addCriterion("GB_QQ between", value1, value2, "gbQq");
            return (Criteria) this;
        }

        public Criteria andGbQqNotBetween(String value1, String value2) {
            addCriterion("GB_QQ not between", value1, value2, "gbQq");
            return (Criteria) this;
        }

        public Criteria andGbEmailIsNull() {
            addCriterion("GB_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andGbEmailIsNotNull() {
            addCriterion("GB_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andGbEmailEqualTo(String value) {
            addCriterion("GB_EMAIL =", value, "gbEmail");
            return (Criteria) this;
        }

        public Criteria andGbEmailNotEqualTo(String value) {
            addCriterion("GB_EMAIL <>", value, "gbEmail");
            return (Criteria) this;
        }

        public Criteria andGbEmailGreaterThan(String value) {
            addCriterion("GB_EMAIL >", value, "gbEmail");
            return (Criteria) this;
        }

        public Criteria andGbEmailGreaterThanOrEqualTo(String value) {
            addCriterion("GB_EMAIL >=", value, "gbEmail");
            return (Criteria) this;
        }

        public Criteria andGbEmailLessThan(String value) {
            addCriterion("GB_EMAIL <", value, "gbEmail");
            return (Criteria) this;
        }

        public Criteria andGbEmailLessThanOrEqualTo(String value) {
            addCriterion("GB_EMAIL <=", value, "gbEmail");
            return (Criteria) this;
        }

        public Criteria andGbEmailLike(String value) {
            addCriterion("GB_EMAIL like", value, "gbEmail");
            return (Criteria) this;
        }

        public Criteria andGbEmailNotLike(String value) {
            addCriterion("GB_EMAIL not like", value, "gbEmail");
            return (Criteria) this;
        }

        public Criteria andGbEmailIn(List<String> values) {
            addCriterion("GB_EMAIL in", values, "gbEmail");
            return (Criteria) this;
        }

        public Criteria andGbEmailNotIn(List<String> values) {
            addCriterion("GB_EMAIL not in", values, "gbEmail");
            return (Criteria) this;
        }

        public Criteria andGbEmailBetween(String value1, String value2) {
            addCriterion("GB_EMAIL between", value1, value2, "gbEmail");
            return (Criteria) this;
        }

        public Criteria andGbEmailNotBetween(String value1, String value2) {
            addCriterion("GB_EMAIL not between", value1, value2, "gbEmail");
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