package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class SceneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SceneExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andScenenameIsNull() {
            addCriterion("SCENENAME is null");
            return (Criteria) this;
        }

        public Criteria andScenenameIsNotNull() {
            addCriterion("SCENENAME is not null");
            return (Criteria) this;
        }

        public Criteria andScenenameEqualTo(String value) {
            addCriterion("SCENENAME =", value, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenenameNotEqualTo(String value) {
            addCriterion("SCENENAME <>", value, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenenameGreaterThan(String value) {
            addCriterion("SCENENAME >", value, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenenameGreaterThanOrEqualTo(String value) {
            addCriterion("SCENENAME >=", value, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenenameLessThan(String value) {
            addCriterion("SCENENAME <", value, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenenameLessThanOrEqualTo(String value) {
            addCriterion("SCENENAME <=", value, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenenameLike(String value) {
            addCriterion("SCENENAME like", value, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenenameNotLike(String value) {
            addCriterion("SCENENAME not like", value, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenenameIn(List<String> values) {
            addCriterion("SCENENAME in", values, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenenameNotIn(List<String> values) {
            addCriterion("SCENENAME not in", values, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenenameBetween(String value1, String value2) {
            addCriterion("SCENENAME between", value1, value2, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenenameNotBetween(String value1, String value2) {
            addCriterion("SCENENAME not between", value1, value2, "scenename");
            return (Criteria) this;
        }

        public Criteria andFidIsNull() {
            addCriterion("FID is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("FID is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(String value) {
            addCriterion("FID =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(String value) {
            addCriterion("FID <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(String value) {
            addCriterion("FID >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(String value) {
            addCriterion("FID >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(String value) {
            addCriterion("FID <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(String value) {
            addCriterion("FID <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLike(String value) {
            addCriterion("FID like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotLike(String value) {
            addCriterion("FID not like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<String> values) {
            addCriterion("FID in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<String> values) {
            addCriterion("FID not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(String value1, String value2) {
            addCriterion("FID between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(String value1, String value2) {
            addCriterion("FID not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andStypeIsNull() {
            addCriterion("STYPE is null");
            return (Criteria) this;
        }

        public Criteria andStypeIsNotNull() {
            addCriterion("STYPE is not null");
            return (Criteria) this;
        }

        public Criteria andStypeEqualTo(String value) {
            addCriterion("STYPE =", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotEqualTo(String value) {
            addCriterion("STYPE <>", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeGreaterThan(String value) {
            addCriterion("STYPE >", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeGreaterThanOrEqualTo(String value) {
            addCriterion("STYPE >=", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLessThan(String value) {
            addCriterion("STYPE <", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLessThanOrEqualTo(String value) {
            addCriterion("STYPE <=", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLike(String value) {
            addCriterion("STYPE like", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotLike(String value) {
            addCriterion("STYPE not like", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeIn(List<String> values) {
            addCriterion("STYPE in", values, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotIn(List<String> values) {
            addCriterion("STYPE not in", values, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeBetween(String value1, String value2) {
            addCriterion("STYPE between", value1, value2, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotBetween(String value1, String value2) {
            addCriterion("STYPE not between", value1, value2, "stype");
            return (Criteria) this;
        }

        public Criteria andXmlurlIsNull() {
            addCriterion("XMLURL is null");
            return (Criteria) this;
        }

        public Criteria andXmlurlIsNotNull() {
            addCriterion("XMLURL is not null");
            return (Criteria) this;
        }

        public Criteria andXmlurlEqualTo(String value) {
            addCriterion("XMLURL =", value, "xmlurl");
            return (Criteria) this;
        }

        public Criteria andXmlurlNotEqualTo(String value) {
            addCriterion("XMLURL <>", value, "xmlurl");
            return (Criteria) this;
        }

        public Criteria andXmlurlGreaterThan(String value) {
            addCriterion("XMLURL >", value, "xmlurl");
            return (Criteria) this;
        }

        public Criteria andXmlurlGreaterThanOrEqualTo(String value) {
            addCriterion("XMLURL >=", value, "xmlurl");
            return (Criteria) this;
        }

        public Criteria andXmlurlLessThan(String value) {
            addCriterion("XMLURL <", value, "xmlurl");
            return (Criteria) this;
        }

        public Criteria andXmlurlLessThanOrEqualTo(String value) {
            addCriterion("XMLURL <=", value, "xmlurl");
            return (Criteria) this;
        }

        public Criteria andXmlurlLike(String value) {
            addCriterion("XMLURL like", value, "xmlurl");
            return (Criteria) this;
        }

        public Criteria andXmlurlNotLike(String value) {
            addCriterion("XMLURL not like", value, "xmlurl");
            return (Criteria) this;
        }

        public Criteria andXmlurlIn(List<String> values) {
            addCriterion("XMLURL in", values, "xmlurl");
            return (Criteria) this;
        }

        public Criteria andXmlurlNotIn(List<String> values) {
            addCriterion("XMLURL not in", values, "xmlurl");
            return (Criteria) this;
        }

        public Criteria andXmlurlBetween(String value1, String value2) {
            addCriterion("XMLURL between", value1, value2, "xmlurl");
            return (Criteria) this;
        }

        public Criteria andXmlurlNotBetween(String value1, String value2) {
            addCriterion("XMLURL not between", value1, value2, "xmlurl");
            return (Criteria) this;
        }

        public Criteria andTemplateurlIsNull() {
            addCriterion("TEMPLATEURL is null");
            return (Criteria) this;
        }

        public Criteria andTemplateurlIsNotNull() {
            addCriterion("TEMPLATEURL is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateurlEqualTo(String value) {
            addCriterion("TEMPLATEURL =", value, "templateurl");
            return (Criteria) this;
        }

        public Criteria andTemplateurlNotEqualTo(String value) {
            addCriterion("TEMPLATEURL <>", value, "templateurl");
            return (Criteria) this;
        }

        public Criteria andTemplateurlGreaterThan(String value) {
            addCriterion("TEMPLATEURL >", value, "templateurl");
            return (Criteria) this;
        }

        public Criteria andTemplateurlGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATEURL >=", value, "templateurl");
            return (Criteria) this;
        }

        public Criteria andTemplateurlLessThan(String value) {
            addCriterion("TEMPLATEURL <", value, "templateurl");
            return (Criteria) this;
        }

        public Criteria andTemplateurlLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATEURL <=", value, "templateurl");
            return (Criteria) this;
        }

        public Criteria andTemplateurlLike(String value) {
            addCriterion("TEMPLATEURL like", value, "templateurl");
            return (Criteria) this;
        }

        public Criteria andTemplateurlNotLike(String value) {
            addCriterion("TEMPLATEURL not like", value, "templateurl");
            return (Criteria) this;
        }

        public Criteria andTemplateurlIn(List<String> values) {
            addCriterion("TEMPLATEURL in", values, "templateurl");
            return (Criteria) this;
        }

        public Criteria andTemplateurlNotIn(List<String> values) {
            addCriterion("TEMPLATEURL not in", values, "templateurl");
            return (Criteria) this;
        }

        public Criteria andTemplateurlBetween(String value1, String value2) {
            addCriterion("TEMPLATEURL between", value1, value2, "templateurl");
            return (Criteria) this;
        }

        public Criteria andTemplateurlNotBetween(String value1, String value2) {
            addCriterion("TEMPLATEURL not between", value1, value2, "templateurl");
            return (Criteria) this;
        }

        public Criteria andViewurlIsNull() {
            addCriterion("VIEWURL is null");
            return (Criteria) this;
        }

        public Criteria andViewurlIsNotNull() {
            addCriterion("VIEWURL is not null");
            return (Criteria) this;
        }

        public Criteria andViewurlEqualTo(String value) {
            addCriterion("VIEWURL =", value, "viewurl");
            return (Criteria) this;
        }

        public Criteria andViewurlNotEqualTo(String value) {
            addCriterion("VIEWURL <>", value, "viewurl");
            return (Criteria) this;
        }

        public Criteria andViewurlGreaterThan(String value) {
            addCriterion("VIEWURL >", value, "viewurl");
            return (Criteria) this;
        }

        public Criteria andViewurlGreaterThanOrEqualTo(String value) {
            addCriterion("VIEWURL >=", value, "viewurl");
            return (Criteria) this;
        }

        public Criteria andViewurlLessThan(String value) {
            addCriterion("VIEWURL <", value, "viewurl");
            return (Criteria) this;
        }

        public Criteria andViewurlLessThanOrEqualTo(String value) {
            addCriterion("VIEWURL <=", value, "viewurl");
            return (Criteria) this;
        }

        public Criteria andViewurlLike(String value) {
            addCriterion("VIEWURL like", value, "viewurl");
            return (Criteria) this;
        }

        public Criteria andViewurlNotLike(String value) {
            addCriterion("VIEWURL not like", value, "viewurl");
            return (Criteria) this;
        }

        public Criteria andViewurlIn(List<String> values) {
            addCriterion("VIEWURL in", values, "viewurl");
            return (Criteria) this;
        }

        public Criteria andViewurlNotIn(List<String> values) {
            addCriterion("VIEWURL not in", values, "viewurl");
            return (Criteria) this;
        }

        public Criteria andViewurlBetween(String value1, String value2) {
            addCriterion("VIEWURL between", value1, value2, "viewurl");
            return (Criteria) this;
        }

        public Criteria andViewurlNotBetween(String value1, String value2) {
            addCriterion("VIEWURL not between", value1, value2, "viewurl");
            return (Criteria) this;
        }

        public Criteria andListtemplateIsNull() {
            addCriterion("LISTTEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andListtemplateIsNotNull() {
            addCriterion("LISTTEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andListtemplateEqualTo(String value) {
            addCriterion("LISTTEMPLATE =", value, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateNotEqualTo(String value) {
            addCriterion("LISTTEMPLATE <>", value, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateGreaterThan(String value) {
            addCriterion("LISTTEMPLATE >", value, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateGreaterThanOrEqualTo(String value) {
            addCriterion("LISTTEMPLATE >=", value, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateLessThan(String value) {
            addCriterion("LISTTEMPLATE <", value, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateLessThanOrEqualTo(String value) {
            addCriterion("LISTTEMPLATE <=", value, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateLike(String value) {
            addCriterion("LISTTEMPLATE like", value, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateNotLike(String value) {
            addCriterion("LISTTEMPLATE not like", value, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateIn(List<String> values) {
            addCriterion("LISTTEMPLATE in", values, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateNotIn(List<String> values) {
            addCriterion("LISTTEMPLATE not in", values, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateBetween(String value1, String value2) {
            addCriterion("LISTTEMPLATE between", value1, value2, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andListtemplateNotBetween(String value1, String value2) {
            addCriterion("LISTTEMPLATE not between", value1, value2, "listtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateIsNull() {
            addCriterion("DETAILTEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateIsNotNull() {
            addCriterion("DETAILTEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateEqualTo(String value) {
            addCriterion("DETAILTEMPLATE =", value, "detailtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateNotEqualTo(String value) {
            addCriterion("DETAILTEMPLATE <>", value, "detailtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateGreaterThan(String value) {
            addCriterion("DETAILTEMPLATE >", value, "detailtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateGreaterThanOrEqualTo(String value) {
            addCriterion("DETAILTEMPLATE >=", value, "detailtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateLessThan(String value) {
            addCriterion("DETAILTEMPLATE <", value, "detailtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateLessThanOrEqualTo(String value) {
            addCriterion("DETAILTEMPLATE <=", value, "detailtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateLike(String value) {
            addCriterion("DETAILTEMPLATE like", value, "detailtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateNotLike(String value) {
            addCriterion("DETAILTEMPLATE not like", value, "detailtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateIn(List<String> values) {
            addCriterion("DETAILTEMPLATE in", values, "detailtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateNotIn(List<String> values) {
            addCriterion("DETAILTEMPLATE not in", values, "detailtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateBetween(String value1, String value2) {
            addCriterion("DETAILTEMPLATE between", value1, value2, "detailtemplate");
            return (Criteria) this;
        }

        public Criteria andDetailtemplateNotBetween(String value1, String value2) {
            addCriterion("DETAILTEMPLATE not between", value1, value2, "detailtemplate");
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