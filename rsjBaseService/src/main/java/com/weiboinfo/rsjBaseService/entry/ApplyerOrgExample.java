package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class ApplyerOrgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplyerOrgExample() {
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

        public Criteria andAoidIsNull() {
            addCriterion("AOID is null");
            return (Criteria) this;
        }

        public Criteria andAoidIsNotNull() {
            addCriterion("AOID is not null");
            return (Criteria) this;
        }

        public Criteria andAoidEqualTo(String value) {
            addCriterion("AOID =", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidNotEqualTo(String value) {
            addCriterion("AOID <>", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidGreaterThan(String value) {
            addCriterion("AOID >", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidGreaterThanOrEqualTo(String value) {
            addCriterion("AOID >=", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidLessThan(String value) {
            addCriterion("AOID <", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidLessThanOrEqualTo(String value) {
            addCriterion("AOID <=", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidLike(String value) {
            addCriterion("AOID like", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidNotLike(String value) {
            addCriterion("AOID not like", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidIn(List<String> values) {
            addCriterion("AOID in", values, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidNotIn(List<String> values) {
            addCriterion("AOID not in", values, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidBetween(String value1, String value2) {
            addCriterion("AOID between", value1, value2, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidNotBetween(String value1, String value2) {
            addCriterion("AOID not between", value1, value2, "aoid");
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

        public Criteria andOrganizecodeIsNull() {
            addCriterion("ORGANIZECODE is null");
            return (Criteria) this;
        }

        public Criteria andOrganizecodeIsNotNull() {
            addCriterion("ORGANIZECODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizecodeEqualTo(String value) {
            addCriterion("ORGANIZECODE =", value, "organizecode");
            return (Criteria) this;
        }

        public Criteria andOrganizecodeNotEqualTo(String value) {
            addCriterion("ORGANIZECODE <>", value, "organizecode");
            return (Criteria) this;
        }

        public Criteria andOrganizecodeGreaterThan(String value) {
            addCriterion("ORGANIZECODE >", value, "organizecode");
            return (Criteria) this;
        }

        public Criteria andOrganizecodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZECODE >=", value, "organizecode");
            return (Criteria) this;
        }

        public Criteria andOrganizecodeLessThan(String value) {
            addCriterion("ORGANIZECODE <", value, "organizecode");
            return (Criteria) this;
        }

        public Criteria andOrganizecodeLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZECODE <=", value, "organizecode");
            return (Criteria) this;
        }

        public Criteria andOrganizecodeLike(String value) {
            addCriterion("ORGANIZECODE like", value, "organizecode");
            return (Criteria) this;
        }

        public Criteria andOrganizecodeNotLike(String value) {
            addCriterion("ORGANIZECODE not like", value, "organizecode");
            return (Criteria) this;
        }

        public Criteria andOrganizecodeIn(List<String> values) {
            addCriterion("ORGANIZECODE in", values, "organizecode");
            return (Criteria) this;
        }

        public Criteria andOrganizecodeNotIn(List<String> values) {
            addCriterion("ORGANIZECODE not in", values, "organizecode");
            return (Criteria) this;
        }

        public Criteria andOrganizecodeBetween(String value1, String value2) {
            addCriterion("ORGANIZECODE between", value1, value2, "organizecode");
            return (Criteria) this;
        }

        public Criteria andOrganizecodeNotBetween(String value1, String value2) {
            addCriterion("ORGANIZECODE not between", value1, value2, "organizecode");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIsNull() {
            addCriterion("LEGALPERSON is null");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIsNotNull() {
            addCriterion("LEGALPERSON is not null");
            return (Criteria) this;
        }

        public Criteria andLegalpersonEqualTo(String value) {
            addCriterion("LEGALPERSON =", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNotEqualTo(String value) {
            addCriterion("LEGALPERSON <>", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonGreaterThan(String value) {
            addCriterion("LEGALPERSON >", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonGreaterThanOrEqualTo(String value) {
            addCriterion("LEGALPERSON >=", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonLessThan(String value) {
            addCriterion("LEGALPERSON <", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonLessThanOrEqualTo(String value) {
            addCriterion("LEGALPERSON <=", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonLike(String value) {
            addCriterion("LEGALPERSON like", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNotLike(String value) {
            addCriterion("LEGALPERSON not like", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIn(List<String> values) {
            addCriterion("LEGALPERSON in", values, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNotIn(List<String> values) {
            addCriterion("LEGALPERSON not in", values, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonBetween(String value1, String value2) {
            addCriterion("LEGALPERSON between", value1, value2, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNotBetween(String value1, String value2) {
            addCriterion("LEGALPERSON not between", value1, value2, "legalperson");
            return (Criteria) this;
        }

        public Criteria andAssociationpersonIsNull() {
            addCriterion("ASSOCIATIONPERSON is null");
            return (Criteria) this;
        }

        public Criteria andAssociationpersonIsNotNull() {
            addCriterion("ASSOCIATIONPERSON is not null");
            return (Criteria) this;
        }

        public Criteria andAssociationpersonEqualTo(String value) {
            addCriterion("ASSOCIATIONPERSON =", value, "associationperson");
            return (Criteria) this;
        }

        public Criteria andAssociationpersonNotEqualTo(String value) {
            addCriterion("ASSOCIATIONPERSON <>", value, "associationperson");
            return (Criteria) this;
        }

        public Criteria andAssociationpersonGreaterThan(String value) {
            addCriterion("ASSOCIATIONPERSON >", value, "associationperson");
            return (Criteria) this;
        }

        public Criteria andAssociationpersonGreaterThanOrEqualTo(String value) {
            addCriterion("ASSOCIATIONPERSON >=", value, "associationperson");
            return (Criteria) this;
        }

        public Criteria andAssociationpersonLessThan(String value) {
            addCriterion("ASSOCIATIONPERSON <", value, "associationperson");
            return (Criteria) this;
        }

        public Criteria andAssociationpersonLessThanOrEqualTo(String value) {
            addCriterion("ASSOCIATIONPERSON <=", value, "associationperson");
            return (Criteria) this;
        }

        public Criteria andAssociationpersonLike(String value) {
            addCriterion("ASSOCIATIONPERSON like", value, "associationperson");
            return (Criteria) this;
        }

        public Criteria andAssociationpersonNotLike(String value) {
            addCriterion("ASSOCIATIONPERSON not like", value, "associationperson");
            return (Criteria) this;
        }

        public Criteria andAssociationpersonIn(List<String> values) {
            addCriterion("ASSOCIATIONPERSON in", values, "associationperson");
            return (Criteria) this;
        }

        public Criteria andAssociationpersonNotIn(List<String> values) {
            addCriterion("ASSOCIATIONPERSON not in", values, "associationperson");
            return (Criteria) this;
        }

        public Criteria andAssociationpersonBetween(String value1, String value2) {
            addCriterion("ASSOCIATIONPERSON between", value1, value2, "associationperson");
            return (Criteria) this;
        }

        public Criteria andAssociationpersonNotBetween(String value1, String value2) {
            addCriterion("ASSOCIATIONPERSON not between", value1, value2, "associationperson");
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