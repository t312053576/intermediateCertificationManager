package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class SurveyQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SurveyQuestionExample() {
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

        public Criteria andQIdIsNull() {
            addCriterion("Q_ID is null");
            return (Criteria) this;
        }

        public Criteria andQIdIsNotNull() {
            addCriterion("Q_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQIdEqualTo(String value) {
            addCriterion("Q_ID =", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotEqualTo(String value) {
            addCriterion("Q_ID <>", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdGreaterThan(String value) {
            addCriterion("Q_ID >", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdGreaterThanOrEqualTo(String value) {
            addCriterion("Q_ID >=", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLessThan(String value) {
            addCriterion("Q_ID <", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLessThanOrEqualTo(String value) {
            addCriterion("Q_ID <=", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLike(String value) {
            addCriterion("Q_ID like", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotLike(String value) {
            addCriterion("Q_ID not like", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdIn(List<String> values) {
            addCriterion("Q_ID in", values, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotIn(List<String> values) {
            addCriterion("Q_ID not in", values, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdBetween(String value1, String value2) {
            addCriterion("Q_ID between", value1, value2, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotBetween(String value1, String value2) {
            addCriterion("Q_ID not between", value1, value2, "qId");
            return (Criteria) this;
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

        public Criteria andQTypeIsNull() {
            addCriterion("Q_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andQTypeIsNotNull() {
            addCriterion("Q_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andQTypeEqualTo(String value) {
            addCriterion("Q_TYPE =", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeNotEqualTo(String value) {
            addCriterion("Q_TYPE <>", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeGreaterThan(String value) {
            addCriterion("Q_TYPE >", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Q_TYPE >=", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeLessThan(String value) {
            addCriterion("Q_TYPE <", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeLessThanOrEqualTo(String value) {
            addCriterion("Q_TYPE <=", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeLike(String value) {
            addCriterion("Q_TYPE like", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeNotLike(String value) {
            addCriterion("Q_TYPE not like", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeIn(List<String> values) {
            addCriterion("Q_TYPE in", values, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeNotIn(List<String> values) {
            addCriterion("Q_TYPE not in", values, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeBetween(String value1, String value2) {
            addCriterion("Q_TYPE between", value1, value2, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeNotBetween(String value1, String value2) {
            addCriterion("Q_TYPE not between", value1, value2, "qType");
            return (Criteria) this;
        }

        public Criteria andQHeadIsNull() {
            addCriterion("Q_HEAD is null");
            return (Criteria) this;
        }

        public Criteria andQHeadIsNotNull() {
            addCriterion("Q_HEAD is not null");
            return (Criteria) this;
        }

        public Criteria andQHeadEqualTo(String value) {
            addCriterion("Q_HEAD =", value, "qHead");
            return (Criteria) this;
        }

        public Criteria andQHeadNotEqualTo(String value) {
            addCriterion("Q_HEAD <>", value, "qHead");
            return (Criteria) this;
        }

        public Criteria andQHeadGreaterThan(String value) {
            addCriterion("Q_HEAD >", value, "qHead");
            return (Criteria) this;
        }

        public Criteria andQHeadGreaterThanOrEqualTo(String value) {
            addCriterion("Q_HEAD >=", value, "qHead");
            return (Criteria) this;
        }

        public Criteria andQHeadLessThan(String value) {
            addCriterion("Q_HEAD <", value, "qHead");
            return (Criteria) this;
        }

        public Criteria andQHeadLessThanOrEqualTo(String value) {
            addCriterion("Q_HEAD <=", value, "qHead");
            return (Criteria) this;
        }

        public Criteria andQHeadLike(String value) {
            addCriterion("Q_HEAD like", value, "qHead");
            return (Criteria) this;
        }

        public Criteria andQHeadNotLike(String value) {
            addCriterion("Q_HEAD not like", value, "qHead");
            return (Criteria) this;
        }

        public Criteria andQHeadIn(List<String> values) {
            addCriterion("Q_HEAD in", values, "qHead");
            return (Criteria) this;
        }

        public Criteria andQHeadNotIn(List<String> values) {
            addCriterion("Q_HEAD not in", values, "qHead");
            return (Criteria) this;
        }

        public Criteria andQHeadBetween(String value1, String value2) {
            addCriterion("Q_HEAD between", value1, value2, "qHead");
            return (Criteria) this;
        }

        public Criteria andQHeadNotBetween(String value1, String value2) {
            addCriterion("Q_HEAD not between", value1, value2, "qHead");
            return (Criteria) this;
        }

        public Criteria andQBodyIsNull() {
            addCriterion("Q_BODY is null");
            return (Criteria) this;
        }

        public Criteria andQBodyIsNotNull() {
            addCriterion("Q_BODY is not null");
            return (Criteria) this;
        }

        public Criteria andQBodyEqualTo(String value) {
            addCriterion("Q_BODY =", value, "qBody");
            return (Criteria) this;
        }

        public Criteria andQBodyNotEqualTo(String value) {
            addCriterion("Q_BODY <>", value, "qBody");
            return (Criteria) this;
        }

        public Criteria andQBodyGreaterThan(String value) {
            addCriterion("Q_BODY >", value, "qBody");
            return (Criteria) this;
        }

        public Criteria andQBodyGreaterThanOrEqualTo(String value) {
            addCriterion("Q_BODY >=", value, "qBody");
            return (Criteria) this;
        }

        public Criteria andQBodyLessThan(String value) {
            addCriterion("Q_BODY <", value, "qBody");
            return (Criteria) this;
        }

        public Criteria andQBodyLessThanOrEqualTo(String value) {
            addCriterion("Q_BODY <=", value, "qBody");
            return (Criteria) this;
        }

        public Criteria andQBodyLike(String value) {
            addCriterion("Q_BODY like", value, "qBody");
            return (Criteria) this;
        }

        public Criteria andQBodyNotLike(String value) {
            addCriterion("Q_BODY not like", value, "qBody");
            return (Criteria) this;
        }

        public Criteria andQBodyIn(List<String> values) {
            addCriterion("Q_BODY in", values, "qBody");
            return (Criteria) this;
        }

        public Criteria andQBodyNotIn(List<String> values) {
            addCriterion("Q_BODY not in", values, "qBody");
            return (Criteria) this;
        }

        public Criteria andQBodyBetween(String value1, String value2) {
            addCriterion("Q_BODY between", value1, value2, "qBody");
            return (Criteria) this;
        }

        public Criteria andQBodyNotBetween(String value1, String value2) {
            addCriterion("Q_BODY not between", value1, value2, "qBody");
            return (Criteria) this;
        }

        public Criteria andQResultIsNull() {
            addCriterion("Q_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andQResultIsNotNull() {
            addCriterion("Q_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andQResultEqualTo(String value) {
            addCriterion("Q_RESULT =", value, "qResult");
            return (Criteria) this;
        }

        public Criteria andQResultNotEqualTo(String value) {
            addCriterion("Q_RESULT <>", value, "qResult");
            return (Criteria) this;
        }

        public Criteria andQResultGreaterThan(String value) {
            addCriterion("Q_RESULT >", value, "qResult");
            return (Criteria) this;
        }

        public Criteria andQResultGreaterThanOrEqualTo(String value) {
            addCriterion("Q_RESULT >=", value, "qResult");
            return (Criteria) this;
        }

        public Criteria andQResultLessThan(String value) {
            addCriterion("Q_RESULT <", value, "qResult");
            return (Criteria) this;
        }

        public Criteria andQResultLessThanOrEqualTo(String value) {
            addCriterion("Q_RESULT <=", value, "qResult");
            return (Criteria) this;
        }

        public Criteria andQResultLike(String value) {
            addCriterion("Q_RESULT like", value, "qResult");
            return (Criteria) this;
        }

        public Criteria andQResultNotLike(String value) {
            addCriterion("Q_RESULT not like", value, "qResult");
            return (Criteria) this;
        }

        public Criteria andQResultIn(List<String> values) {
            addCriterion("Q_RESULT in", values, "qResult");
            return (Criteria) this;
        }

        public Criteria andQResultNotIn(List<String> values) {
            addCriterion("Q_RESULT not in", values, "qResult");
            return (Criteria) this;
        }

        public Criteria andQResultBetween(String value1, String value2) {
            addCriterion("Q_RESULT between", value1, value2, "qResult");
            return (Criteria) this;
        }

        public Criteria andQResultNotBetween(String value1, String value2) {
            addCriterion("Q_RESULT not between", value1, value2, "qResult");
            return (Criteria) this;
        }

        public Criteria andQImgIsNull() {
            addCriterion("Q_IMG is null");
            return (Criteria) this;
        }

        public Criteria andQImgIsNotNull() {
            addCriterion("Q_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andQImgEqualTo(String value) {
            addCriterion("Q_IMG =", value, "qImg");
            return (Criteria) this;
        }

        public Criteria andQImgNotEqualTo(String value) {
            addCriterion("Q_IMG <>", value, "qImg");
            return (Criteria) this;
        }

        public Criteria andQImgGreaterThan(String value) {
            addCriterion("Q_IMG >", value, "qImg");
            return (Criteria) this;
        }

        public Criteria andQImgGreaterThanOrEqualTo(String value) {
            addCriterion("Q_IMG >=", value, "qImg");
            return (Criteria) this;
        }

        public Criteria andQImgLessThan(String value) {
            addCriterion("Q_IMG <", value, "qImg");
            return (Criteria) this;
        }

        public Criteria andQImgLessThanOrEqualTo(String value) {
            addCriterion("Q_IMG <=", value, "qImg");
            return (Criteria) this;
        }

        public Criteria andQImgLike(String value) {
            addCriterion("Q_IMG like", value, "qImg");
            return (Criteria) this;
        }

        public Criteria andQImgNotLike(String value) {
            addCriterion("Q_IMG not like", value, "qImg");
            return (Criteria) this;
        }

        public Criteria andQImgIn(List<String> values) {
            addCriterion("Q_IMG in", values, "qImg");
            return (Criteria) this;
        }

        public Criteria andQImgNotIn(List<String> values) {
            addCriterion("Q_IMG not in", values, "qImg");
            return (Criteria) this;
        }

        public Criteria andQImgBetween(String value1, String value2) {
            addCriterion("Q_IMG between", value1, value2, "qImg");
            return (Criteria) this;
        }

        public Criteria andQImgNotBetween(String value1, String value2) {
            addCriterion("Q_IMG not between", value1, value2, "qImg");
            return (Criteria) this;
        }

        public Criteria andQJdtzIsNull() {
            addCriterion("Q_JDTZ is null");
            return (Criteria) this;
        }

        public Criteria andQJdtzIsNotNull() {
            addCriterion("Q_JDTZ is not null");
            return (Criteria) this;
        }

        public Criteria andQJdtzEqualTo(String value) {
            addCriterion("Q_JDTZ =", value, "qJdtz");
            return (Criteria) this;
        }

        public Criteria andQJdtzNotEqualTo(String value) {
            addCriterion("Q_JDTZ <>", value, "qJdtz");
            return (Criteria) this;
        }

        public Criteria andQJdtzGreaterThan(String value) {
            addCriterion("Q_JDTZ >", value, "qJdtz");
            return (Criteria) this;
        }

        public Criteria andQJdtzGreaterThanOrEqualTo(String value) {
            addCriterion("Q_JDTZ >=", value, "qJdtz");
            return (Criteria) this;
        }

        public Criteria andQJdtzLessThan(String value) {
            addCriterion("Q_JDTZ <", value, "qJdtz");
            return (Criteria) this;
        }

        public Criteria andQJdtzLessThanOrEqualTo(String value) {
            addCriterion("Q_JDTZ <=", value, "qJdtz");
            return (Criteria) this;
        }

        public Criteria andQJdtzLike(String value) {
            addCriterion("Q_JDTZ like", value, "qJdtz");
            return (Criteria) this;
        }

        public Criteria andQJdtzNotLike(String value) {
            addCriterion("Q_JDTZ not like", value, "qJdtz");
            return (Criteria) this;
        }

        public Criteria andQJdtzIn(List<String> values) {
            addCriterion("Q_JDTZ in", values, "qJdtz");
            return (Criteria) this;
        }

        public Criteria andQJdtzNotIn(List<String> values) {
            addCriterion("Q_JDTZ not in", values, "qJdtz");
            return (Criteria) this;
        }

        public Criteria andQJdtzBetween(String value1, String value2) {
            addCriterion("Q_JDTZ between", value1, value2, "qJdtz");
            return (Criteria) this;
        }

        public Criteria andQJdtzNotBetween(String value1, String value2) {
            addCriterion("Q_JDTZ not between", value1, value2, "qJdtz");
            return (Criteria) this;
        }

        public Criteria andQOrderIsNull() {
            addCriterion("Q_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andQOrderIsNotNull() {
            addCriterion("Q_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andQOrderEqualTo(String value) {
            addCriterion("Q_ORDER =", value, "qOrder");
            return (Criteria) this;
        }

        public Criteria andQOrderNotEqualTo(String value) {
            addCriterion("Q_ORDER <>", value, "qOrder");
            return (Criteria) this;
        }

        public Criteria andQOrderGreaterThan(String value) {
            addCriterion("Q_ORDER >", value, "qOrder");
            return (Criteria) this;
        }

        public Criteria andQOrderGreaterThanOrEqualTo(String value) {
            addCriterion("Q_ORDER >=", value, "qOrder");
            return (Criteria) this;
        }

        public Criteria andQOrderLessThan(String value) {
            addCriterion("Q_ORDER <", value, "qOrder");
            return (Criteria) this;
        }

        public Criteria andQOrderLessThanOrEqualTo(String value) {
            addCriterion("Q_ORDER <=", value, "qOrder");
            return (Criteria) this;
        }

        public Criteria andQOrderLike(String value) {
            addCriterion("Q_ORDER like", value, "qOrder");
            return (Criteria) this;
        }

        public Criteria andQOrderNotLike(String value) {
            addCriterion("Q_ORDER not like", value, "qOrder");
            return (Criteria) this;
        }

        public Criteria andQOrderIn(List<String> values) {
            addCriterion("Q_ORDER in", values, "qOrder");
            return (Criteria) this;
        }

        public Criteria andQOrderNotIn(List<String> values) {
            addCriterion("Q_ORDER not in", values, "qOrder");
            return (Criteria) this;
        }

        public Criteria andQOrderBetween(String value1, String value2) {
            addCriterion("Q_ORDER between", value1, value2, "qOrder");
            return (Criteria) this;
        }

        public Criteria andQOrderNotBetween(String value1, String value2) {
            addCriterion("Q_ORDER not between", value1, value2, "qOrder");
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