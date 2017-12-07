package com.weiboinfo.rsjBaseService.entry;

import java.util.ArrayList;
import java.util.List;

public class TemplatesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TemplatesExample() {
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

        public Criteria andTidIsNull() {
            addCriterion("TID is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("TID is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(String value) {
            addCriterion("TID =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(String value) {
            addCriterion("TID <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(String value) {
            addCriterion("TID >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(String value) {
            addCriterion("TID >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(String value) {
            addCriterion("TID <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(String value) {
            addCriterion("TID <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLike(String value) {
            addCriterion("TID like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotLike(String value) {
            addCriterion("TID not like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<String> values) {
            addCriterion("TID in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<String> values) {
            addCriterion("TID not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(String value1, String value2) {
            addCriterion("TID between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(String value1, String value2) {
            addCriterion("TID not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTnicknameIsNull() {
            addCriterion("TNICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andTnicknameIsNotNull() {
            addCriterion("TNICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTnicknameEqualTo(String value) {
            addCriterion("TNICKNAME =", value, "tnickname");
            return (Criteria) this;
        }

        public Criteria andTnicknameNotEqualTo(String value) {
            addCriterion("TNICKNAME <>", value, "tnickname");
            return (Criteria) this;
        }

        public Criteria andTnicknameGreaterThan(String value) {
            addCriterion("TNICKNAME >", value, "tnickname");
            return (Criteria) this;
        }

        public Criteria andTnicknameGreaterThanOrEqualTo(String value) {
            addCriterion("TNICKNAME >=", value, "tnickname");
            return (Criteria) this;
        }

        public Criteria andTnicknameLessThan(String value) {
            addCriterion("TNICKNAME <", value, "tnickname");
            return (Criteria) this;
        }

        public Criteria andTnicknameLessThanOrEqualTo(String value) {
            addCriterion("TNICKNAME <=", value, "tnickname");
            return (Criteria) this;
        }

        public Criteria andTnicknameLike(String value) {
            addCriterion("TNICKNAME like", value, "tnickname");
            return (Criteria) this;
        }

        public Criteria andTnicknameNotLike(String value) {
            addCriterion("TNICKNAME not like", value, "tnickname");
            return (Criteria) this;
        }

        public Criteria andTnicknameIn(List<String> values) {
            addCriterion("TNICKNAME in", values, "tnickname");
            return (Criteria) this;
        }

        public Criteria andTnicknameNotIn(List<String> values) {
            addCriterion("TNICKNAME not in", values, "tnickname");
            return (Criteria) this;
        }

        public Criteria andTnicknameBetween(String value1, String value2) {
            addCriterion("TNICKNAME between", value1, value2, "tnickname");
            return (Criteria) this;
        }

        public Criteria andTnicknameNotBetween(String value1, String value2) {
            addCriterion("TNICKNAME not between", value1, value2, "tnickname");
            return (Criteria) this;
        }

        public Criteria andTfilenameIsNull() {
            addCriterion("TFILENAME is null");
            return (Criteria) this;
        }

        public Criteria andTfilenameIsNotNull() {
            addCriterion("TFILENAME is not null");
            return (Criteria) this;
        }

        public Criteria andTfilenameEqualTo(String value) {
            addCriterion("TFILENAME =", value, "tfilename");
            return (Criteria) this;
        }

        public Criteria andTfilenameNotEqualTo(String value) {
            addCriterion("TFILENAME <>", value, "tfilename");
            return (Criteria) this;
        }

        public Criteria andTfilenameGreaterThan(String value) {
            addCriterion("TFILENAME >", value, "tfilename");
            return (Criteria) this;
        }

        public Criteria andTfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("TFILENAME >=", value, "tfilename");
            return (Criteria) this;
        }

        public Criteria andTfilenameLessThan(String value) {
            addCriterion("TFILENAME <", value, "tfilename");
            return (Criteria) this;
        }

        public Criteria andTfilenameLessThanOrEqualTo(String value) {
            addCriterion("TFILENAME <=", value, "tfilename");
            return (Criteria) this;
        }

        public Criteria andTfilenameLike(String value) {
            addCriterion("TFILENAME like", value, "tfilename");
            return (Criteria) this;
        }

        public Criteria andTfilenameNotLike(String value) {
            addCriterion("TFILENAME not like", value, "tfilename");
            return (Criteria) this;
        }

        public Criteria andTfilenameIn(List<String> values) {
            addCriterion("TFILENAME in", values, "tfilename");
            return (Criteria) this;
        }

        public Criteria andTfilenameNotIn(List<String> values) {
            addCriterion("TFILENAME not in", values, "tfilename");
            return (Criteria) this;
        }

        public Criteria andTfilenameBetween(String value1, String value2) {
            addCriterion("TFILENAME between", value1, value2, "tfilename");
            return (Criteria) this;
        }

        public Criteria andTfilenameNotBetween(String value1, String value2) {
            addCriterion("TFILENAME not between", value1, value2, "tfilename");
            return (Criteria) this;
        }

        public Criteria andTtypeIsNull() {
            addCriterion("TTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTtypeIsNotNull() {
            addCriterion("TTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTtypeEqualTo(String value) {
            addCriterion("TTYPE =", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotEqualTo(String value) {
            addCriterion("TTYPE <>", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeGreaterThan(String value) {
            addCriterion("TTYPE >", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeGreaterThanOrEqualTo(String value) {
            addCriterion("TTYPE >=", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeLessThan(String value) {
            addCriterion("TTYPE <", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeLessThanOrEqualTo(String value) {
            addCriterion("TTYPE <=", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeLike(String value) {
            addCriterion("TTYPE like", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotLike(String value) {
            addCriterion("TTYPE not like", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeIn(List<String> values) {
            addCriterion("TTYPE in", values, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotIn(List<String> values) {
            addCriterion("TTYPE not in", values, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeBetween(String value1, String value2) {
            addCriterion("TTYPE between", value1, value2, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotBetween(String value1, String value2) {
            addCriterion("TTYPE not between", value1, value2, "ttype");
            return (Criteria) this;
        }

        public Criteria andJspfilenameIsNull() {
            addCriterion("JSPFILENAME is null");
            return (Criteria) this;
        }

        public Criteria andJspfilenameIsNotNull() {
            addCriterion("JSPFILENAME is not null");
            return (Criteria) this;
        }

        public Criteria andJspfilenameEqualTo(String value) {
            addCriterion("JSPFILENAME =", value, "jspfilename");
            return (Criteria) this;
        }

        public Criteria andJspfilenameNotEqualTo(String value) {
            addCriterion("JSPFILENAME <>", value, "jspfilename");
            return (Criteria) this;
        }

        public Criteria andJspfilenameGreaterThan(String value) {
            addCriterion("JSPFILENAME >", value, "jspfilename");
            return (Criteria) this;
        }

        public Criteria andJspfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("JSPFILENAME >=", value, "jspfilename");
            return (Criteria) this;
        }

        public Criteria andJspfilenameLessThan(String value) {
            addCriterion("JSPFILENAME <", value, "jspfilename");
            return (Criteria) this;
        }

        public Criteria andJspfilenameLessThanOrEqualTo(String value) {
            addCriterion("JSPFILENAME <=", value, "jspfilename");
            return (Criteria) this;
        }

        public Criteria andJspfilenameLike(String value) {
            addCriterion("JSPFILENAME like", value, "jspfilename");
            return (Criteria) this;
        }

        public Criteria andJspfilenameNotLike(String value) {
            addCriterion("JSPFILENAME not like", value, "jspfilename");
            return (Criteria) this;
        }

        public Criteria andJspfilenameIn(List<String> values) {
            addCriterion("JSPFILENAME in", values, "jspfilename");
            return (Criteria) this;
        }

        public Criteria andJspfilenameNotIn(List<String> values) {
            addCriterion("JSPFILENAME not in", values, "jspfilename");
            return (Criteria) this;
        }

        public Criteria andJspfilenameBetween(String value1, String value2) {
            addCriterion("JSPFILENAME between", value1, value2, "jspfilename");
            return (Criteria) this;
        }

        public Criteria andJspfilenameNotBetween(String value1, String value2) {
            addCriterion("JSPFILENAME not between", value1, value2, "jspfilename");
            return (Criteria) this;
        }

        public Criteria andFileurlIsNull() {
            addCriterion("FILEURL is null");
            return (Criteria) this;
        }

        public Criteria andFileurlIsNotNull() {
            addCriterion("FILEURL is not null");
            return (Criteria) this;
        }

        public Criteria andFileurlEqualTo(String value) {
            addCriterion("FILEURL =", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlNotEqualTo(String value) {
            addCriterion("FILEURL <>", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlGreaterThan(String value) {
            addCriterion("FILEURL >", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlGreaterThanOrEqualTo(String value) {
            addCriterion("FILEURL >=", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlLessThan(String value) {
            addCriterion("FILEURL <", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlLessThanOrEqualTo(String value) {
            addCriterion("FILEURL <=", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlLike(String value) {
            addCriterion("FILEURL like", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlNotLike(String value) {
            addCriterion("FILEURL not like", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlIn(List<String> values) {
            addCriterion("FILEURL in", values, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlNotIn(List<String> values) {
            addCriterion("FILEURL not in", values, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlBetween(String value1, String value2) {
            addCriterion("FILEURL between", value1, value2, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlNotBetween(String value1, String value2) {
            addCriterion("FILEURL not between", value1, value2, "fileurl");
            return (Criteria) this;
        }

        public Criteria andIshomepageIsNull() {
            addCriterion("ISHOMEPAGE is null");
            return (Criteria) this;
        }

        public Criteria andIshomepageIsNotNull() {
            addCriterion("ISHOMEPAGE is not null");
            return (Criteria) this;
        }

        public Criteria andIshomepageEqualTo(String value) {
            addCriterion("ISHOMEPAGE =", value, "ishomepage");
            return (Criteria) this;
        }

        public Criteria andIshomepageNotEqualTo(String value) {
            addCriterion("ISHOMEPAGE <>", value, "ishomepage");
            return (Criteria) this;
        }

        public Criteria andIshomepageGreaterThan(String value) {
            addCriterion("ISHOMEPAGE >", value, "ishomepage");
            return (Criteria) this;
        }

        public Criteria andIshomepageGreaterThanOrEqualTo(String value) {
            addCriterion("ISHOMEPAGE >=", value, "ishomepage");
            return (Criteria) this;
        }

        public Criteria andIshomepageLessThan(String value) {
            addCriterion("ISHOMEPAGE <", value, "ishomepage");
            return (Criteria) this;
        }

        public Criteria andIshomepageLessThanOrEqualTo(String value) {
            addCriterion("ISHOMEPAGE <=", value, "ishomepage");
            return (Criteria) this;
        }

        public Criteria andIshomepageLike(String value) {
            addCriterion("ISHOMEPAGE like", value, "ishomepage");
            return (Criteria) this;
        }

        public Criteria andIshomepageNotLike(String value) {
            addCriterion("ISHOMEPAGE not like", value, "ishomepage");
            return (Criteria) this;
        }

        public Criteria andIshomepageIn(List<String> values) {
            addCriterion("ISHOMEPAGE in", values, "ishomepage");
            return (Criteria) this;
        }

        public Criteria andIshomepageNotIn(List<String> values) {
            addCriterion("ISHOMEPAGE not in", values, "ishomepage");
            return (Criteria) this;
        }

        public Criteria andIshomepageBetween(String value1, String value2) {
            addCriterion("ISHOMEPAGE between", value1, value2, "ishomepage");
            return (Criteria) this;
        }

        public Criteria andIshomepageNotBetween(String value1, String value2) {
            addCriterion("ISHOMEPAGE not between", value1, value2, "ishomepage");
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