package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class ApplyerPersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplyerPersonExample() {
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

        public Criteria andApidIsNull() {
            addCriterion("APID is null");
            return (Criteria) this;
        }

        public Criteria andApidIsNotNull() {
            addCriterion("APID is not null");
            return (Criteria) this;
        }

        public Criteria andApidEqualTo(String value) {
            addCriterion("APID =", value, "apid");
            return (Criteria) this;
        }

        public Criteria andApidNotEqualTo(String value) {
            addCriterion("APID <>", value, "apid");
            return (Criteria) this;
        }

        public Criteria andApidGreaterThan(String value) {
            addCriterion("APID >", value, "apid");
            return (Criteria) this;
        }

        public Criteria andApidGreaterThanOrEqualTo(String value) {
            addCriterion("APID >=", value, "apid");
            return (Criteria) this;
        }

        public Criteria andApidLessThan(String value) {
            addCriterion("APID <", value, "apid");
            return (Criteria) this;
        }

        public Criteria andApidLessThanOrEqualTo(String value) {
            addCriterion("APID <=", value, "apid");
            return (Criteria) this;
        }

        public Criteria andApidLike(String value) {
            addCriterion("APID like", value, "apid");
            return (Criteria) this;
        }

        public Criteria andApidNotLike(String value) {
            addCriterion("APID not like", value, "apid");
            return (Criteria) this;
        }

        public Criteria andApidIn(List<String> values) {
            addCriterion("APID in", values, "apid");
            return (Criteria) this;
        }

        public Criteria andApidNotIn(List<String> values) {
            addCriterion("APID not in", values, "apid");
            return (Criteria) this;
        }

        public Criteria andApidBetween(String value1, String value2) {
            addCriterion("APID between", value1, value2, "apid");
            return (Criteria) this;
        }

        public Criteria andApidNotBetween(String value1, String value2) {
            addCriterion("APID not between", value1, value2, "apid");
            return (Criteria) this;
        }

        public Criteria andApplyernameIsNull() {
            addCriterion("APPLYERNAME is null");
            return (Criteria) this;
        }

        public Criteria andApplyernameIsNotNull() {
            addCriterion("APPLYERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andApplyernameEqualTo(String value) {
            addCriterion("APPLYERNAME =", value, "applyername");
            return (Criteria) this;
        }

        public Criteria andApplyernameNotEqualTo(String value) {
            addCriterion("APPLYERNAME <>", value, "applyername");
            return (Criteria) this;
        }

        public Criteria andApplyernameGreaterThan(String value) {
            addCriterion("APPLYERNAME >", value, "applyername");
            return (Criteria) this;
        }

        public Criteria andApplyernameGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYERNAME >=", value, "applyername");
            return (Criteria) this;
        }

        public Criteria andApplyernameLessThan(String value) {
            addCriterion("APPLYERNAME <", value, "applyername");
            return (Criteria) this;
        }

        public Criteria andApplyernameLessThanOrEqualTo(String value) {
            addCriterion("APPLYERNAME <=", value, "applyername");
            return (Criteria) this;
        }

        public Criteria andApplyernameLike(String value) {
            addCriterion("APPLYERNAME like", value, "applyername");
            return (Criteria) this;
        }

        public Criteria andApplyernameNotLike(String value) {
            addCriterion("APPLYERNAME not like", value, "applyername");
            return (Criteria) this;
        }

        public Criteria andApplyernameIn(List<String> values) {
            addCriterion("APPLYERNAME in", values, "applyername");
            return (Criteria) this;
        }

        public Criteria andApplyernameNotIn(List<String> values) {
            addCriterion("APPLYERNAME not in", values, "applyername");
            return (Criteria) this;
        }

        public Criteria andApplyernameBetween(String value1, String value2) {
            addCriterion("APPLYERNAME between", value1, value2, "applyername");
            return (Criteria) this;
        }

        public Criteria andApplyernameNotBetween(String value1, String value2) {
            addCriterion("APPLYERNAME not between", value1, value2, "applyername");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("DEPARTMENT =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("DEPARTMENT <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("DEPARTMENT >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("DEPARTMENT <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("DEPARTMENT like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("DEPARTMENT not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("DEPARTMENT in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("DEPARTMENT not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("DEPARTMENT between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andCertificatenameIsNull() {
            addCriterion("CERTIFICATENAME is null");
            return (Criteria) this;
        }

        public Criteria andCertificatenameIsNotNull() {
            addCriterion("CERTIFICATENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatenameEqualTo(String value) {
            addCriterion("CERTIFICATENAME =", value, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatenameNotEqualTo(String value) {
            addCriterion("CERTIFICATENAME <>", value, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatenameGreaterThan(String value) {
            addCriterion("CERTIFICATENAME >", value, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatenameGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATENAME >=", value, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatenameLessThan(String value) {
            addCriterion("CERTIFICATENAME <", value, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatenameLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATENAME <=", value, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatenameLike(String value) {
            addCriterion("CERTIFICATENAME like", value, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatenameNotLike(String value) {
            addCriterion("CERTIFICATENAME not like", value, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatenameIn(List<String> values) {
            addCriterion("CERTIFICATENAME in", values, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatenameNotIn(List<String> values) {
            addCriterion("CERTIFICATENAME not in", values, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatenameBetween(String value1, String value2) {
            addCriterion("CERTIFICATENAME between", value1, value2, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatenameNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATENAME not between", value1, value2, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatecodeIsNull() {
            addCriterion("CERTIFICATECODE is null");
            return (Criteria) this;
        }

        public Criteria andCertificatecodeIsNotNull() {
            addCriterion("CERTIFICATECODE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatecodeEqualTo(String value) {
            addCriterion("CERTIFICATECODE =", value, "certificatecode");
            return (Criteria) this;
        }

        public Criteria andCertificatecodeNotEqualTo(String value) {
            addCriterion("CERTIFICATECODE <>", value, "certificatecode");
            return (Criteria) this;
        }

        public Criteria andCertificatecodeGreaterThan(String value) {
            addCriterion("CERTIFICATECODE >", value, "certificatecode");
            return (Criteria) this;
        }

        public Criteria andCertificatecodeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATECODE >=", value, "certificatecode");
            return (Criteria) this;
        }

        public Criteria andCertificatecodeLessThan(String value) {
            addCriterion("CERTIFICATECODE <", value, "certificatecode");
            return (Criteria) this;
        }

        public Criteria andCertificatecodeLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATECODE <=", value, "certificatecode");
            return (Criteria) this;
        }

        public Criteria andCertificatecodeLike(String value) {
            addCriterion("CERTIFICATECODE like", value, "certificatecode");
            return (Criteria) this;
        }

        public Criteria andCertificatecodeNotLike(String value) {
            addCriterion("CERTIFICATECODE not like", value, "certificatecode");
            return (Criteria) this;
        }

        public Criteria andCertificatecodeIn(List<String> values) {
            addCriterion("CERTIFICATECODE in", values, "certificatecode");
            return (Criteria) this;
        }

        public Criteria andCertificatecodeNotIn(List<String> values) {
            addCriterion("CERTIFICATECODE not in", values, "certificatecode");
            return (Criteria) this;
        }

        public Criteria andCertificatecodeBetween(String value1, String value2) {
            addCriterion("CERTIFICATECODE between", value1, value2, "certificatecode");
            return (Criteria) this;
        }

        public Criteria andCertificatecodeNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATECODE not between", value1, value2, "certificatecode");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("TELEPHONE =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("TELEPHONE <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("TELEPHONE >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("TELEPHONE >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("TELEPHONE <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("TELEPHONE <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("TELEPHONE like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("TELEPHONE not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("TELEPHONE in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("TELEPHONE not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("TELEPHONE between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("TELEPHONE not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("POSTCODE =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("POSTCODE <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("POSTCODE >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("POSTCODE >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("POSTCODE <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("POSTCODE <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("POSTCODE like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("POSTCODE not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("POSTCODE in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("POSTCODE not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("POSTCODE between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("POSTCODE not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
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