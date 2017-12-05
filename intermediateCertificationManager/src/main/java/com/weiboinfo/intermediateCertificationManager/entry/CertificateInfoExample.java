package com.weiboinfo.intermediateCertificationManager.entry;

import java.util.ArrayList;
import java.util.List;

public class CertificateInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CertificateInfoExample() {
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

        public Criteria andCerIdIsNull() {
            addCriterion("CER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCerIdIsNotNull() {
            addCriterion("CER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCerIdEqualTo(String value) {
            addCriterion("CER_ID =", value, "cerId");
            return (Criteria) this;
        }

        public Criteria andCerIdNotEqualTo(String value) {
            addCriterion("CER_ID <>", value, "cerId");
            return (Criteria) this;
        }

        public Criteria andCerIdGreaterThan(String value) {
            addCriterion("CER_ID >", value, "cerId");
            return (Criteria) this;
        }

        public Criteria andCerIdGreaterThanOrEqualTo(String value) {
            addCriterion("CER_ID >=", value, "cerId");
            return (Criteria) this;
        }

        public Criteria andCerIdLessThan(String value) {
            addCriterion("CER_ID <", value, "cerId");
            return (Criteria) this;
        }

        public Criteria andCerIdLessThanOrEqualTo(String value) {
            addCriterion("CER_ID <=", value, "cerId");
            return (Criteria) this;
        }

        public Criteria andCerIdLike(String value) {
            addCriterion("CER_ID like", value, "cerId");
            return (Criteria) this;
        }

        public Criteria andCerIdNotLike(String value) {
            addCriterion("CER_ID not like", value, "cerId");
            return (Criteria) this;
        }

        public Criteria andCerIdIn(List<String> values) {
            addCriterion("CER_ID in", values, "cerId");
            return (Criteria) this;
        }

        public Criteria andCerIdNotIn(List<String> values) {
            addCriterion("CER_ID not in", values, "cerId");
            return (Criteria) this;
        }

        public Criteria andCerIdBetween(String value1, String value2) {
            addCriterion("CER_ID between", value1, value2, "cerId");
            return (Criteria) this;
        }

        public Criteria andCerIdNotBetween(String value1, String value2) {
            addCriterion("CER_ID not between", value1, value2, "cerId");
            return (Criteria) this;
        }

        public Criteria andIcardIsNull() {
            addCriterion("ICARD is null");
            return (Criteria) this;
        }

        public Criteria andIcardIsNotNull() {
            addCriterion("ICARD is not null");
            return (Criteria) this;
        }

        public Criteria andIcardEqualTo(String value) {
            addCriterion("ICARD =", value, "icard");
            return (Criteria) this;
        }

        public Criteria andIcardNotEqualTo(String value) {
            addCriterion("ICARD <>", value, "icard");
            return (Criteria) this;
        }

        public Criteria andIcardGreaterThan(String value) {
            addCriterion("ICARD >", value, "icard");
            return (Criteria) this;
        }

        public Criteria andIcardGreaterThanOrEqualTo(String value) {
            addCriterion("ICARD >=", value, "icard");
            return (Criteria) this;
        }

        public Criteria andIcardLessThan(String value) {
            addCriterion("ICARD <", value, "icard");
            return (Criteria) this;
        }

        public Criteria andIcardLessThanOrEqualTo(String value) {
            addCriterion("ICARD <=", value, "icard");
            return (Criteria) this;
        }

        public Criteria andIcardLike(String value) {
            addCriterion("ICARD like", value, "icard");
            return (Criteria) this;
        }

        public Criteria andIcardNotLike(String value) {
            addCriterion("ICARD not like", value, "icard");
            return (Criteria) this;
        }

        public Criteria andIcardIn(List<String> values) {
            addCriterion("ICARD in", values, "icard");
            return (Criteria) this;
        }

        public Criteria andIcardNotIn(List<String> values) {
            addCriterion("ICARD not in", values, "icard");
            return (Criteria) this;
        }

        public Criteria andIcardBetween(String value1, String value2) {
            addCriterion("ICARD between", value1, value2, "icard");
            return (Criteria) this;
        }

        public Criteria andIcardNotBetween(String value1, String value2) {
            addCriterion("ICARD not between", value1, value2, "icard");
            return (Criteria) this;
        }

        public Criteria andHolderNameIsNull() {
            addCriterion("HOLDER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andHolderNameIsNotNull() {
            addCriterion("HOLDER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andHolderNameEqualTo(String value) {
            addCriterion("HOLDER_NAME =", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameNotEqualTo(String value) {
            addCriterion("HOLDER_NAME <>", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameGreaterThan(String value) {
            addCriterion("HOLDER_NAME >", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameGreaterThanOrEqualTo(String value) {
            addCriterion("HOLDER_NAME >=", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameLessThan(String value) {
            addCriterion("HOLDER_NAME <", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameLessThanOrEqualTo(String value) {
            addCriterion("HOLDER_NAME <=", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameLike(String value) {
            addCriterion("HOLDER_NAME like", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameNotLike(String value) {
            addCriterion("HOLDER_NAME not like", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameIn(List<String> values) {
            addCriterion("HOLDER_NAME in", values, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameNotIn(List<String> values) {
            addCriterion("HOLDER_NAME not in", values, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameBetween(String value1, String value2) {
            addCriterion("HOLDER_NAME between", value1, value2, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameNotBetween(String value1, String value2) {
            addCriterion("HOLDER_NAME not between", value1, value2, "holderName");
            return (Criteria) this;
        }

        public Criteria andWorkUnitIsNull() {
            addCriterion("WORK_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andWorkUnitIsNotNull() {
            addCriterion("WORK_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andWorkUnitEqualTo(String value) {
            addCriterion("WORK_UNIT =", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitNotEqualTo(String value) {
            addCriterion("WORK_UNIT <>", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitGreaterThan(String value) {
            addCriterion("WORK_UNIT >", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_UNIT >=", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitLessThan(String value) {
            addCriterion("WORK_UNIT <", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitLessThanOrEqualTo(String value) {
            addCriterion("WORK_UNIT <=", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitLike(String value) {
            addCriterion("WORK_UNIT like", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitNotLike(String value) {
            addCriterion("WORK_UNIT not like", value, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitIn(List<String> values) {
            addCriterion("WORK_UNIT in", values, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitNotIn(List<String> values) {
            addCriterion("WORK_UNIT not in", values, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitBetween(String value1, String value2) {
            addCriterion("WORK_UNIT between", value1, value2, "workUnit");
            return (Criteria) this;
        }

        public Criteria andWorkUnitNotBetween(String value1, String value2) {
            addCriterion("WORK_UNIT not between", value1, value2, "workUnit");
            return (Criteria) this;
        }

        public Criteria andCerNoIsNull() {
            addCriterion("CER_NO is null");
            return (Criteria) this;
        }

        public Criteria andCerNoIsNotNull() {
            addCriterion("CER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCerNoEqualTo(String value) {
            addCriterion("CER_NO =", value, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCerNoNotEqualTo(String value) {
            addCriterion("CER_NO <>", value, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCerNoGreaterThan(String value) {
            addCriterion("CER_NO >", value, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCerNoGreaterThanOrEqualTo(String value) {
            addCriterion("CER_NO >=", value, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCerNoLessThan(String value) {
            addCriterion("CER_NO <", value, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCerNoLessThanOrEqualTo(String value) {
            addCriterion("CER_NO <=", value, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCerNoLike(String value) {
            addCriterion("CER_NO like", value, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCerNoNotLike(String value) {
            addCriterion("CER_NO not like", value, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCerNoIn(List<String> values) {
            addCriterion("CER_NO in", values, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCerNoNotIn(List<String> values) {
            addCriterion("CER_NO not in", values, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCerNoBetween(String value1, String value2) {
            addCriterion("CER_NO between", value1, value2, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCerNoNotBetween(String value1, String value2) {
            addCriterion("CER_NO not between", value1, value2, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCatenaIsNull() {
            addCriterion("CATENA is null");
            return (Criteria) this;
        }

        public Criteria andCatenaIsNotNull() {
            addCriterion("CATENA is not null");
            return (Criteria) this;
        }

        public Criteria andCatenaEqualTo(String value) {
            addCriterion("CATENA =", value, "catena");
            return (Criteria) this;
        }

        public Criteria andCatenaNotEqualTo(String value) {
            addCriterion("CATENA <>", value, "catena");
            return (Criteria) this;
        }

        public Criteria andCatenaGreaterThan(String value) {
            addCriterion("CATENA >", value, "catena");
            return (Criteria) this;
        }

        public Criteria andCatenaGreaterThanOrEqualTo(String value) {
            addCriterion("CATENA >=", value, "catena");
            return (Criteria) this;
        }

        public Criteria andCatenaLessThan(String value) {
            addCriterion("CATENA <", value, "catena");
            return (Criteria) this;
        }

        public Criteria andCatenaLessThanOrEqualTo(String value) {
            addCriterion("CATENA <=", value, "catena");
            return (Criteria) this;
        }

        public Criteria andCatenaLike(String value) {
            addCriterion("CATENA like", value, "catena");
            return (Criteria) this;
        }

        public Criteria andCatenaNotLike(String value) {
            addCriterion("CATENA not like", value, "catena");
            return (Criteria) this;
        }

        public Criteria andCatenaIn(List<String> values) {
            addCriterion("CATENA in", values, "catena");
            return (Criteria) this;
        }

        public Criteria andCatenaNotIn(List<String> values) {
            addCriterion("CATENA not in", values, "catena");
            return (Criteria) this;
        }

        public Criteria andCatenaBetween(String value1, String value2) {
            addCriterion("CATENA between", value1, value2, "catena");
            return (Criteria) this;
        }

        public Criteria andCatenaNotBetween(String value1, String value2) {
            addCriterion("CATENA not between", value1, value2, "catena");
            return (Criteria) this;
        }

        public Criteria andCerNameIsNull() {
            addCriterion("CER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCerNameIsNotNull() {
            addCriterion("CER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCerNameEqualTo(String value) {
            addCriterion("CER_NAME =", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameNotEqualTo(String value) {
            addCriterion("CER_NAME <>", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameGreaterThan(String value) {
            addCriterion("CER_NAME >", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CER_NAME >=", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameLessThan(String value) {
            addCriterion("CER_NAME <", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameLessThanOrEqualTo(String value) {
            addCriterion("CER_NAME <=", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameLike(String value) {
            addCriterion("CER_NAME like", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameNotLike(String value) {
            addCriterion("CER_NAME not like", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameIn(List<String> values) {
            addCriterion("CER_NAME in", values, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameNotIn(List<String> values) {
            addCriterion("CER_NAME not in", values, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameBetween(String value1, String value2) {
            addCriterion("CER_NAME between", value1, value2, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameNotBetween(String value1, String value2) {
            addCriterion("CER_NAME not between", value1, value2, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerProfessionIsNull() {
            addCriterion("CER_PROFESSION is null");
            return (Criteria) this;
        }

        public Criteria andCerProfessionIsNotNull() {
            addCriterion("CER_PROFESSION is not null");
            return (Criteria) this;
        }

        public Criteria andCerProfessionEqualTo(String value) {
            addCriterion("CER_PROFESSION =", value, "cerProfession");
            return (Criteria) this;
        }

        public Criteria andCerProfessionNotEqualTo(String value) {
            addCriterion("CER_PROFESSION <>", value, "cerProfession");
            return (Criteria) this;
        }

        public Criteria andCerProfessionGreaterThan(String value) {
            addCriterion("CER_PROFESSION >", value, "cerProfession");
            return (Criteria) this;
        }

        public Criteria andCerProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("CER_PROFESSION >=", value, "cerProfession");
            return (Criteria) this;
        }

        public Criteria andCerProfessionLessThan(String value) {
            addCriterion("CER_PROFESSION <", value, "cerProfession");
            return (Criteria) this;
        }

        public Criteria andCerProfessionLessThanOrEqualTo(String value) {
            addCriterion("CER_PROFESSION <=", value, "cerProfession");
            return (Criteria) this;
        }

        public Criteria andCerProfessionLike(String value) {
            addCriterion("CER_PROFESSION like", value, "cerProfession");
            return (Criteria) this;
        }

        public Criteria andCerProfessionNotLike(String value) {
            addCriterion("CER_PROFESSION not like", value, "cerProfession");
            return (Criteria) this;
        }

        public Criteria andCerProfessionIn(List<String> values) {
            addCriterion("CER_PROFESSION in", values, "cerProfession");
            return (Criteria) this;
        }

        public Criteria andCerProfessionNotIn(List<String> values) {
            addCriterion("CER_PROFESSION not in", values, "cerProfession");
            return (Criteria) this;
        }

        public Criteria andCerProfessionBetween(String value1, String value2) {
            addCriterion("CER_PROFESSION between", value1, value2, "cerProfession");
            return (Criteria) this;
        }

        public Criteria andCerProfessionNotBetween(String value1, String value2) {
            addCriterion("CER_PROFESSION not between", value1, value2, "cerProfession");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("START_TIME like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("START_TIME not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("ADD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("ADD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(String value) {
            addCriterion("ADD_TIME =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(String value) {
            addCriterion("ADD_TIME <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(String value) {
            addCriterion("ADD_TIME >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ADD_TIME >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(String value) {
            addCriterion("ADD_TIME <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(String value) {
            addCriterion("ADD_TIME <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLike(String value) {
            addCriterion("ADD_TIME like", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotLike(String value) {
            addCriterion("ADD_TIME not like", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<String> values) {
            addCriterion("ADD_TIME in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<String> values) {
            addCriterion("ADD_TIME not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(String value1, String value2) {
            addCriterion("ADD_TIME between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(String value1, String value2) {
            addCriterion("ADD_TIME not between", value1, value2, "addTime");
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