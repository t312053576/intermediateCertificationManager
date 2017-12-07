package com.weiboinfo.rsjBaseService.entry;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FrmUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrmUserExample() {
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

        public Criteria andUserpasswdIsNull() {
            addCriterion("USERPASSWD is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswdIsNotNull() {
            addCriterion("USERPASSWD is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswdEqualTo(String value) {
            addCriterion("USERPASSWD =", value, "userpasswd");
            return (Criteria) this;
        }

        public Criteria andUserpasswdNotEqualTo(String value) {
            addCriterion("USERPASSWD <>", value, "userpasswd");
            return (Criteria) this;
        }

        public Criteria andUserpasswdGreaterThan(String value) {
            addCriterion("USERPASSWD >", value, "userpasswd");
            return (Criteria) this;
        }

        public Criteria andUserpasswdGreaterThanOrEqualTo(String value) {
            addCriterion("USERPASSWD >=", value, "userpasswd");
            return (Criteria) this;
        }

        public Criteria andUserpasswdLessThan(String value) {
            addCriterion("USERPASSWD <", value, "userpasswd");
            return (Criteria) this;
        }

        public Criteria andUserpasswdLessThanOrEqualTo(String value) {
            addCriterion("USERPASSWD <=", value, "userpasswd");
            return (Criteria) this;
        }

        public Criteria andUserpasswdLike(String value) {
            addCriterion("USERPASSWD like", value, "userpasswd");
            return (Criteria) this;
        }

        public Criteria andUserpasswdNotLike(String value) {
            addCriterion("USERPASSWD not like", value, "userpasswd");
            return (Criteria) this;
        }

        public Criteria andUserpasswdIn(List<String> values) {
            addCriterion("USERPASSWD in", values, "userpasswd");
            return (Criteria) this;
        }

        public Criteria andUserpasswdNotIn(List<String> values) {
            addCriterion("USERPASSWD not in", values, "userpasswd");
            return (Criteria) this;
        }

        public Criteria andUserpasswdBetween(String value1, String value2) {
            addCriterion("USERPASSWD between", value1, value2, "userpasswd");
            return (Criteria) this;
        }

        public Criteria andUserpasswdNotBetween(String value1, String value2) {
            addCriterion("USERPASSWD not between", value1, value2, "userpasswd");
            return (Criteria) this;
        }

        public Criteria andUseraccountIsNull() {
            addCriterion("USERACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andUseraccountIsNotNull() {
            addCriterion("USERACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUseraccountEqualTo(String value) {
            addCriterion("USERACCOUNT =", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountNotEqualTo(String value) {
            addCriterion("USERACCOUNT <>", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountGreaterThan(String value) {
            addCriterion("USERACCOUNT >", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountGreaterThanOrEqualTo(String value) {
            addCriterion("USERACCOUNT >=", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountLessThan(String value) {
            addCriterion("USERACCOUNT <", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountLessThanOrEqualTo(String value) {
            addCriterion("USERACCOUNT <=", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountLike(String value) {
            addCriterion("USERACCOUNT like", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountNotLike(String value) {
            addCriterion("USERACCOUNT not like", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountIn(List<String> values) {
            addCriterion("USERACCOUNT in", values, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountNotIn(List<String> values) {
            addCriterion("USERACCOUNT not in", values, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountBetween(String value1, String value2) {
            addCriterion("USERACCOUNT between", value1, value2, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountNotBetween(String value1, String value2) {
            addCriterion("USERACCOUNT not between", value1, value2, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUserrealnameIsNull() {
            addCriterion("USERREALNAME is null");
            return (Criteria) this;
        }

        public Criteria andUserrealnameIsNotNull() {
            addCriterion("USERREALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserrealnameEqualTo(String value) {
            addCriterion("USERREALNAME =", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotEqualTo(String value) {
            addCriterion("USERREALNAME <>", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameGreaterThan(String value) {
            addCriterion("USERREALNAME >", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameGreaterThanOrEqualTo(String value) {
            addCriterion("USERREALNAME >=", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameLessThan(String value) {
            addCriterion("USERREALNAME <", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameLessThanOrEqualTo(String value) {
            addCriterion("USERREALNAME <=", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameLike(String value) {
            addCriterion("USERREALNAME like", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotLike(String value) {
            addCriterion("USERREALNAME not like", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameIn(List<String> values) {
            addCriterion("USERREALNAME in", values, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotIn(List<String> values) {
            addCriterion("USERREALNAME not in", values, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameBetween(String value1, String value2) {
            addCriterion("USERREALNAME between", value1, value2, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotBetween(String value1, String value2) {
            addCriterion("USERREALNAME not between", value1, value2, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUseraccounttypeIsNull() {
            addCriterion("USERACCOUNTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andUseraccounttypeIsNotNull() {
            addCriterion("USERACCOUNTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUseraccounttypeEqualTo(String value) {
            addCriterion("USERACCOUNTTYPE =", value, "useraccounttype");
            return (Criteria) this;
        }

        public Criteria andUseraccounttypeNotEqualTo(String value) {
            addCriterion("USERACCOUNTTYPE <>", value, "useraccounttype");
            return (Criteria) this;
        }

        public Criteria andUseraccounttypeGreaterThan(String value) {
            addCriterion("USERACCOUNTTYPE >", value, "useraccounttype");
            return (Criteria) this;
        }

        public Criteria andUseraccounttypeGreaterThanOrEqualTo(String value) {
            addCriterion("USERACCOUNTTYPE >=", value, "useraccounttype");
            return (Criteria) this;
        }

        public Criteria andUseraccounttypeLessThan(String value) {
            addCriterion("USERACCOUNTTYPE <", value, "useraccounttype");
            return (Criteria) this;
        }

        public Criteria andUseraccounttypeLessThanOrEqualTo(String value) {
            addCriterion("USERACCOUNTTYPE <=", value, "useraccounttype");
            return (Criteria) this;
        }

        public Criteria andUseraccounttypeLike(String value) {
            addCriterion("USERACCOUNTTYPE like", value, "useraccounttype");
            return (Criteria) this;
        }

        public Criteria andUseraccounttypeNotLike(String value) {
            addCriterion("USERACCOUNTTYPE not like", value, "useraccounttype");
            return (Criteria) this;
        }

        public Criteria andUseraccounttypeIn(List<String> values) {
            addCriterion("USERACCOUNTTYPE in", values, "useraccounttype");
            return (Criteria) this;
        }

        public Criteria andUseraccounttypeNotIn(List<String> values) {
            addCriterion("USERACCOUNTTYPE not in", values, "useraccounttype");
            return (Criteria) this;
        }

        public Criteria andUseraccounttypeBetween(String value1, String value2) {
            addCriterion("USERACCOUNTTYPE between", value1, value2, "useraccounttype");
            return (Criteria) this;
        }

        public Criteria andUseraccounttypeNotBetween(String value1, String value2) {
            addCriterion("USERACCOUNTTYPE not between", value1, value2, "useraccounttype");
            return (Criteria) this;
        }

        public Criteria andUserlastlogindateIsNull() {
            addCriterion("USERLASTLOGINDATE is null");
            return (Criteria) this;
        }

        public Criteria andUserlastlogindateIsNotNull() {
            addCriterion("USERLASTLOGINDATE is not null");
            return (Criteria) this;
        }

        public Criteria andUserlastlogindateEqualTo(String value) {
            addCriterion("USERLASTLOGINDATE =", value, "userlastlogindate");
            return (Criteria) this;
        }

        public Criteria andUserlastlogindateNotEqualTo(String value) {
            addCriterion("USERLASTLOGINDATE <>", value, "userlastlogindate");
            return (Criteria) this;
        }

        public Criteria andUserlastlogindateGreaterThan(String value) {
            addCriterion("USERLASTLOGINDATE >", value, "userlastlogindate");
            return (Criteria) this;
        }

        public Criteria andUserlastlogindateGreaterThanOrEqualTo(String value) {
            addCriterion("USERLASTLOGINDATE >=", value, "userlastlogindate");
            return (Criteria) this;
        }

        public Criteria andUserlastlogindateLessThan(String value) {
            addCriterion("USERLASTLOGINDATE <", value, "userlastlogindate");
            return (Criteria) this;
        }

        public Criteria andUserlastlogindateLessThanOrEqualTo(String value) {
            addCriterion("USERLASTLOGINDATE <=", value, "userlastlogindate");
            return (Criteria) this;
        }

        public Criteria andUserlastlogindateLike(String value) {
            addCriterion("USERLASTLOGINDATE like", value, "userlastlogindate");
            return (Criteria) this;
        }

        public Criteria andUserlastlogindateNotLike(String value) {
            addCriterion("USERLASTLOGINDATE not like", value, "userlastlogindate");
            return (Criteria) this;
        }

        public Criteria andUserlastlogindateIn(List<String> values) {
            addCriterion("USERLASTLOGINDATE in", values, "userlastlogindate");
            return (Criteria) this;
        }

        public Criteria andUserlastlogindateNotIn(List<String> values) {
            addCriterion("USERLASTLOGINDATE not in", values, "userlastlogindate");
            return (Criteria) this;
        }

        public Criteria andUserlastlogindateBetween(String value1, String value2) {
            addCriterion("USERLASTLOGINDATE between", value1, value2, "userlastlogindate");
            return (Criteria) this;
        }

        public Criteria andUserlastlogindateNotBetween(String value1, String value2) {
            addCriterion("USERLASTLOGINDATE not between", value1, value2, "userlastlogindate");
            return (Criteria) this;
        }

        public Criteria andUserlastlogintimeIsNull() {
            addCriterion("USERLASTLOGINTIME is null");
            return (Criteria) this;
        }

        public Criteria andUserlastlogintimeIsNotNull() {
            addCriterion("USERLASTLOGINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUserlastlogintimeEqualTo(String value) {
            addCriterion("USERLASTLOGINTIME =", value, "userlastlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlastlogintimeNotEqualTo(String value) {
            addCriterion("USERLASTLOGINTIME <>", value, "userlastlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlastlogintimeGreaterThan(String value) {
            addCriterion("USERLASTLOGINTIME >", value, "userlastlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlastlogintimeGreaterThanOrEqualTo(String value) {
            addCriterion("USERLASTLOGINTIME >=", value, "userlastlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlastlogintimeLessThan(String value) {
            addCriterion("USERLASTLOGINTIME <", value, "userlastlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlastlogintimeLessThanOrEqualTo(String value) {
            addCriterion("USERLASTLOGINTIME <=", value, "userlastlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlastlogintimeLike(String value) {
            addCriterion("USERLASTLOGINTIME like", value, "userlastlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlastlogintimeNotLike(String value) {
            addCriterion("USERLASTLOGINTIME not like", value, "userlastlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlastlogintimeIn(List<String> values) {
            addCriterion("USERLASTLOGINTIME in", values, "userlastlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlastlogintimeNotIn(List<String> values) {
            addCriterion("USERLASTLOGINTIME not in", values, "userlastlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlastlogintimeBetween(String value1, String value2) {
            addCriterion("USERLASTLOGINTIME between", value1, value2, "userlastlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlastlogintimeNotBetween(String value1, String value2) {
            addCriterion("USERLASTLOGINTIME not between", value1, value2, "userlastlogintime");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion1IsNull() {
            addCriterion("USERPWDQUESTION1 is null");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion1IsNotNull() {
            addCriterion("USERPWDQUESTION1 is not null");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion1EqualTo(String value) {
            addCriterion("USERPWDQUESTION1 =", value, "userpwdquestion1");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion1NotEqualTo(String value) {
            addCriterion("USERPWDQUESTION1 <>", value, "userpwdquestion1");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion1GreaterThan(String value) {
            addCriterion("USERPWDQUESTION1 >", value, "userpwdquestion1");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion1GreaterThanOrEqualTo(String value) {
            addCriterion("USERPWDQUESTION1 >=", value, "userpwdquestion1");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion1LessThan(String value) {
            addCriterion("USERPWDQUESTION1 <", value, "userpwdquestion1");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion1LessThanOrEqualTo(String value) {
            addCriterion("USERPWDQUESTION1 <=", value, "userpwdquestion1");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion1Like(String value) {
            addCriterion("USERPWDQUESTION1 like", value, "userpwdquestion1");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion1NotLike(String value) {
            addCriterion("USERPWDQUESTION1 not like", value, "userpwdquestion1");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion1In(List<String> values) {
            addCriterion("USERPWDQUESTION1 in", values, "userpwdquestion1");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion1NotIn(List<String> values) {
            addCriterion("USERPWDQUESTION1 not in", values, "userpwdquestion1");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion1Between(String value1, String value2) {
            addCriterion("USERPWDQUESTION1 between", value1, value2, "userpwdquestion1");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion1NotBetween(String value1, String value2) {
            addCriterion("USERPWDQUESTION1 not between", value1, value2, "userpwdquestion1");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer1IsNull() {
            addCriterion("USERPWDANSWER1 is null");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer1IsNotNull() {
            addCriterion("USERPWDANSWER1 is not null");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer1EqualTo(String value) {
            addCriterion("USERPWDANSWER1 =", value, "userpwdanswer1");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer1NotEqualTo(String value) {
            addCriterion("USERPWDANSWER1 <>", value, "userpwdanswer1");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer1GreaterThan(String value) {
            addCriterion("USERPWDANSWER1 >", value, "userpwdanswer1");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer1GreaterThanOrEqualTo(String value) {
            addCriterion("USERPWDANSWER1 >=", value, "userpwdanswer1");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer1LessThan(String value) {
            addCriterion("USERPWDANSWER1 <", value, "userpwdanswer1");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer1LessThanOrEqualTo(String value) {
            addCriterion("USERPWDANSWER1 <=", value, "userpwdanswer1");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer1Like(String value) {
            addCriterion("USERPWDANSWER1 like", value, "userpwdanswer1");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer1NotLike(String value) {
            addCriterion("USERPWDANSWER1 not like", value, "userpwdanswer1");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer1In(List<String> values) {
            addCriterion("USERPWDANSWER1 in", values, "userpwdanswer1");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer1NotIn(List<String> values) {
            addCriterion("USERPWDANSWER1 not in", values, "userpwdanswer1");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer1Between(String value1, String value2) {
            addCriterion("USERPWDANSWER1 between", value1, value2, "userpwdanswer1");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer1NotBetween(String value1, String value2) {
            addCriterion("USERPWDANSWER1 not between", value1, value2, "userpwdanswer1");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion2IsNull() {
            addCriterion("USERPWDQUESTION2 is null");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion2IsNotNull() {
            addCriterion("USERPWDQUESTION2 is not null");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion2EqualTo(String value) {
            addCriterion("USERPWDQUESTION2 =", value, "userpwdquestion2");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion2NotEqualTo(String value) {
            addCriterion("USERPWDQUESTION2 <>", value, "userpwdquestion2");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion2GreaterThan(String value) {
            addCriterion("USERPWDQUESTION2 >", value, "userpwdquestion2");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion2GreaterThanOrEqualTo(String value) {
            addCriterion("USERPWDQUESTION2 >=", value, "userpwdquestion2");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion2LessThan(String value) {
            addCriterion("USERPWDQUESTION2 <", value, "userpwdquestion2");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion2LessThanOrEqualTo(String value) {
            addCriterion("USERPWDQUESTION2 <=", value, "userpwdquestion2");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion2Like(String value) {
            addCriterion("USERPWDQUESTION2 like", value, "userpwdquestion2");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion2NotLike(String value) {
            addCriterion("USERPWDQUESTION2 not like", value, "userpwdquestion2");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion2In(List<String> values) {
            addCriterion("USERPWDQUESTION2 in", values, "userpwdquestion2");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion2NotIn(List<String> values) {
            addCriterion("USERPWDQUESTION2 not in", values, "userpwdquestion2");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion2Between(String value1, String value2) {
            addCriterion("USERPWDQUESTION2 between", value1, value2, "userpwdquestion2");
            return (Criteria) this;
        }

        public Criteria andUserpwdquestion2NotBetween(String value1, String value2) {
            addCriterion("USERPWDQUESTION2 not between", value1, value2, "userpwdquestion2");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer2IsNull() {
            addCriterion("USERPWDANSWER2 is null");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer2IsNotNull() {
            addCriterion("USERPWDANSWER2 is not null");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer2EqualTo(String value) {
            addCriterion("USERPWDANSWER2 =", value, "userpwdanswer2");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer2NotEqualTo(String value) {
            addCriterion("USERPWDANSWER2 <>", value, "userpwdanswer2");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer2GreaterThan(String value) {
            addCriterion("USERPWDANSWER2 >", value, "userpwdanswer2");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer2GreaterThanOrEqualTo(String value) {
            addCriterion("USERPWDANSWER2 >=", value, "userpwdanswer2");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer2LessThan(String value) {
            addCriterion("USERPWDANSWER2 <", value, "userpwdanswer2");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer2LessThanOrEqualTo(String value) {
            addCriterion("USERPWDANSWER2 <=", value, "userpwdanswer2");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer2Like(String value) {
            addCriterion("USERPWDANSWER2 like", value, "userpwdanswer2");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer2NotLike(String value) {
            addCriterion("USERPWDANSWER2 not like", value, "userpwdanswer2");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer2In(List<String> values) {
            addCriterion("USERPWDANSWER2 in", values, "userpwdanswer2");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer2NotIn(List<String> values) {
            addCriterion("USERPWDANSWER2 not in", values, "userpwdanswer2");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer2Between(String value1, String value2) {
            addCriterion("USERPWDANSWER2 between", value1, value2, "userpwdanswer2");
            return (Criteria) this;
        }

        public Criteria andUserpwdanswer2NotBetween(String value1, String value2) {
            addCriterion("USERPWDANSWER2 not between", value1, value2, "userpwdanswer2");
            return (Criteria) this;
        }

        public Criteria andUserpwdemailIsNull() {
            addCriterion("USERPWDEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUserpwdemailIsNotNull() {
            addCriterion("USERPWDEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUserpwdemailEqualTo(String value) {
            addCriterion("USERPWDEMAIL =", value, "userpwdemail");
            return (Criteria) this;
        }

        public Criteria andUserpwdemailNotEqualTo(String value) {
            addCriterion("USERPWDEMAIL <>", value, "userpwdemail");
            return (Criteria) this;
        }

        public Criteria andUserpwdemailGreaterThan(String value) {
            addCriterion("USERPWDEMAIL >", value, "userpwdemail");
            return (Criteria) this;
        }

        public Criteria andUserpwdemailGreaterThanOrEqualTo(String value) {
            addCriterion("USERPWDEMAIL >=", value, "userpwdemail");
            return (Criteria) this;
        }

        public Criteria andUserpwdemailLessThan(String value) {
            addCriterion("USERPWDEMAIL <", value, "userpwdemail");
            return (Criteria) this;
        }

        public Criteria andUserpwdemailLessThanOrEqualTo(String value) {
            addCriterion("USERPWDEMAIL <=", value, "userpwdemail");
            return (Criteria) this;
        }

        public Criteria andUserpwdemailLike(String value) {
            addCriterion("USERPWDEMAIL like", value, "userpwdemail");
            return (Criteria) this;
        }

        public Criteria andUserpwdemailNotLike(String value) {
            addCriterion("USERPWDEMAIL not like", value, "userpwdemail");
            return (Criteria) this;
        }

        public Criteria andUserpwdemailIn(List<String> values) {
            addCriterion("USERPWDEMAIL in", values, "userpwdemail");
            return (Criteria) this;
        }

        public Criteria andUserpwdemailNotIn(List<String> values) {
            addCriterion("USERPWDEMAIL not in", values, "userpwdemail");
            return (Criteria) this;
        }

        public Criteria andUserpwdemailBetween(String value1, String value2) {
            addCriterion("USERPWDEMAIL between", value1, value2, "userpwdemail");
            return (Criteria) this;
        }

        public Criteria andUserpwdemailNotBetween(String value1, String value2) {
            addCriterion("USERPWDEMAIL not between", value1, value2, "userpwdemail");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNull() {
            addCriterion("USEREMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNotNull() {
            addCriterion("USEREMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUseremailEqualTo(String value) {
            addCriterion("USEREMAIL =", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotEqualTo(String value) {
            addCriterion("USEREMAIL <>", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThan(String value) {
            addCriterion("USEREMAIL >", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThanOrEqualTo(String value) {
            addCriterion("USEREMAIL >=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThan(String value) {
            addCriterion("USEREMAIL <", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThanOrEqualTo(String value) {
            addCriterion("USEREMAIL <=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLike(String value) {
            addCriterion("USEREMAIL like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotLike(String value) {
            addCriterion("USEREMAIL not like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailIn(List<String> values) {
            addCriterion("USEREMAIL in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotIn(List<String> values) {
            addCriterion("USEREMAIL not in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailBetween(String value1, String value2) {
            addCriterion("USEREMAIL between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotBetween(String value1, String value2) {
            addCriterion("USEREMAIL not between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUserstarttimeIsNull() {
            addCriterion("USERSTARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andUserstarttimeIsNotNull() {
            addCriterion("USERSTARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUserstarttimeEqualTo(String value) {
            addCriterion("USERSTARTTIME =", value, "userstarttime");
            return (Criteria) this;
        }

        public Criteria andUserstarttimeNotEqualTo(String value) {
            addCriterion("USERSTARTTIME <>", value, "userstarttime");
            return (Criteria) this;
        }

        public Criteria andUserstarttimeGreaterThan(String value) {
            addCriterion("USERSTARTTIME >", value, "userstarttime");
            return (Criteria) this;
        }

        public Criteria andUserstarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("USERSTARTTIME >=", value, "userstarttime");
            return (Criteria) this;
        }

        public Criteria andUserstarttimeLessThan(String value) {
            addCriterion("USERSTARTTIME <", value, "userstarttime");
            return (Criteria) this;
        }

        public Criteria andUserstarttimeLessThanOrEqualTo(String value) {
            addCriterion("USERSTARTTIME <=", value, "userstarttime");
            return (Criteria) this;
        }

        public Criteria andUserstarttimeLike(String value) {
            addCriterion("USERSTARTTIME like", value, "userstarttime");
            return (Criteria) this;
        }

        public Criteria andUserstarttimeNotLike(String value) {
            addCriterion("USERSTARTTIME not like", value, "userstarttime");
            return (Criteria) this;
        }

        public Criteria andUserstarttimeIn(List<String> values) {
            addCriterion("USERSTARTTIME in", values, "userstarttime");
            return (Criteria) this;
        }

        public Criteria andUserstarttimeNotIn(List<String> values) {
            addCriterion("USERSTARTTIME not in", values, "userstarttime");
            return (Criteria) this;
        }

        public Criteria andUserstarttimeBetween(String value1, String value2) {
            addCriterion("USERSTARTTIME between", value1, value2, "userstarttime");
            return (Criteria) this;
        }

        public Criteria andUserstarttimeNotBetween(String value1, String value2) {
            addCriterion("USERSTARTTIME not between", value1, value2, "userstarttime");
            return (Criteria) this;
        }

        public Criteria andUserendtimeIsNull() {
            addCriterion("USERENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andUserendtimeIsNotNull() {
            addCriterion("USERENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUserendtimeEqualTo(String value) {
            addCriterion("USERENDTIME =", value, "userendtime");
            return (Criteria) this;
        }

        public Criteria andUserendtimeNotEqualTo(String value) {
            addCriterion("USERENDTIME <>", value, "userendtime");
            return (Criteria) this;
        }

        public Criteria andUserendtimeGreaterThan(String value) {
            addCriterion("USERENDTIME >", value, "userendtime");
            return (Criteria) this;
        }

        public Criteria andUserendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("USERENDTIME >=", value, "userendtime");
            return (Criteria) this;
        }

        public Criteria andUserendtimeLessThan(String value) {
            addCriterion("USERENDTIME <", value, "userendtime");
            return (Criteria) this;
        }

        public Criteria andUserendtimeLessThanOrEqualTo(String value) {
            addCriterion("USERENDTIME <=", value, "userendtime");
            return (Criteria) this;
        }

        public Criteria andUserendtimeLike(String value) {
            addCriterion("USERENDTIME like", value, "userendtime");
            return (Criteria) this;
        }

        public Criteria andUserendtimeNotLike(String value) {
            addCriterion("USERENDTIME not like", value, "userendtime");
            return (Criteria) this;
        }

        public Criteria andUserendtimeIn(List<String> values) {
            addCriterion("USERENDTIME in", values, "userendtime");
            return (Criteria) this;
        }

        public Criteria andUserendtimeNotIn(List<String> values) {
            addCriterion("USERENDTIME not in", values, "userendtime");
            return (Criteria) this;
        }

        public Criteria andUserendtimeBetween(String value1, String value2) {
            addCriterion("USERENDTIME between", value1, value2, "userendtime");
            return (Criteria) this;
        }

        public Criteria andUserendtimeNotBetween(String value1, String value2) {
            addCriterion("USERENDTIME not between", value1, value2, "userendtime");
            return (Criteria) this;
        }

        public Criteria andUserenableIsNull() {
            addCriterion("USERENABLE is null");
            return (Criteria) this;
        }

        public Criteria andUserenableIsNotNull() {
            addCriterion("USERENABLE is not null");
            return (Criteria) this;
        }

        public Criteria andUserenableEqualTo(String value) {
            addCriterion("USERENABLE =", value, "userenable");
            return (Criteria) this;
        }

        public Criteria andUserenableNotEqualTo(String value) {
            addCriterion("USERENABLE <>", value, "userenable");
            return (Criteria) this;
        }

        public Criteria andUserenableGreaterThan(String value) {
            addCriterion("USERENABLE >", value, "userenable");
            return (Criteria) this;
        }

        public Criteria andUserenableGreaterThanOrEqualTo(String value) {
            addCriterion("USERENABLE >=", value, "userenable");
            return (Criteria) this;
        }

        public Criteria andUserenableLessThan(String value) {
            addCriterion("USERENABLE <", value, "userenable");
            return (Criteria) this;
        }

        public Criteria andUserenableLessThanOrEqualTo(String value) {
            addCriterion("USERENABLE <=", value, "userenable");
            return (Criteria) this;
        }

        public Criteria andUserenableLike(String value) {
            addCriterion("USERENABLE like", value, "userenable");
            return (Criteria) this;
        }

        public Criteria andUserenableNotLike(String value) {
            addCriterion("USERENABLE not like", value, "userenable");
            return (Criteria) this;
        }

        public Criteria andUserenableIn(List<String> values) {
            addCriterion("USERENABLE in", values, "userenable");
            return (Criteria) this;
        }

        public Criteria andUserenableNotIn(List<String> values) {
            addCriterion("USERENABLE not in", values, "userenable");
            return (Criteria) this;
        }

        public Criteria andUserenableBetween(String value1, String value2) {
            addCriterion("USERENABLE between", value1, value2, "userenable");
            return (Criteria) this;
        }

        public Criteria andUserenableNotBetween(String value1, String value2) {
            addCriterion("USERENABLE not between", value1, value2, "userenable");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentidIsNull() {
            addCriterion("USERDEPARTMENTID is null");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentidIsNotNull() {
            addCriterion("USERDEPARTMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentidEqualTo(String value) {
            addCriterion("USERDEPARTMENTID =", value, "userdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentidNotEqualTo(String value) {
            addCriterion("USERDEPARTMENTID <>", value, "userdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentidGreaterThan(String value) {
            addCriterion("USERDEPARTMENTID >", value, "userdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentidGreaterThanOrEqualTo(String value) {
            addCriterion("USERDEPARTMENTID >=", value, "userdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentidLessThan(String value) {
            addCriterion("USERDEPARTMENTID <", value, "userdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentidLessThanOrEqualTo(String value) {
            addCriterion("USERDEPARTMENTID <=", value, "userdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentidLike(String value) {
            addCriterion("USERDEPARTMENTID like", value, "userdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentidNotLike(String value) {
            addCriterion("USERDEPARTMENTID not like", value, "userdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentidIn(List<String> values) {
            addCriterion("USERDEPARTMENTID in", values, "userdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentidNotIn(List<String> values) {
            addCriterion("USERDEPARTMENTID not in", values, "userdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentidBetween(String value1, String value2) {
            addCriterion("USERDEPARTMENTID between", value1, value2, "userdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentidNotBetween(String value1, String value2) {
            addCriterion("USERDEPARTMENTID not between", value1, value2, "userdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUsercreatoridIsNull() {
            addCriterion("USERCREATORID is null");
            return (Criteria) this;
        }

        public Criteria andUsercreatoridIsNotNull() {
            addCriterion("USERCREATORID is not null");
            return (Criteria) this;
        }

        public Criteria andUsercreatoridEqualTo(String value) {
            addCriterion("USERCREATORID =", value, "usercreatorid");
            return (Criteria) this;
        }

        public Criteria andUsercreatoridNotEqualTo(String value) {
            addCriterion("USERCREATORID <>", value, "usercreatorid");
            return (Criteria) this;
        }

        public Criteria andUsercreatoridGreaterThan(String value) {
            addCriterion("USERCREATORID >", value, "usercreatorid");
            return (Criteria) this;
        }

        public Criteria andUsercreatoridGreaterThanOrEqualTo(String value) {
            addCriterion("USERCREATORID >=", value, "usercreatorid");
            return (Criteria) this;
        }

        public Criteria andUsercreatoridLessThan(String value) {
            addCriterion("USERCREATORID <", value, "usercreatorid");
            return (Criteria) this;
        }

        public Criteria andUsercreatoridLessThanOrEqualTo(String value) {
            addCriterion("USERCREATORID <=", value, "usercreatorid");
            return (Criteria) this;
        }

        public Criteria andUsercreatoridLike(String value) {
            addCriterion("USERCREATORID like", value, "usercreatorid");
            return (Criteria) this;
        }

        public Criteria andUsercreatoridNotLike(String value) {
            addCriterion("USERCREATORID not like", value, "usercreatorid");
            return (Criteria) this;
        }

        public Criteria andUsercreatoridIn(List<String> values) {
            addCriterion("USERCREATORID in", values, "usercreatorid");
            return (Criteria) this;
        }

        public Criteria andUsercreatoridNotIn(List<String> values) {
            addCriterion("USERCREATORID not in", values, "usercreatorid");
            return (Criteria) this;
        }

        public Criteria andUsercreatoridBetween(String value1, String value2) {
            addCriterion("USERCREATORID between", value1, value2, "usercreatorid");
            return (Criteria) this;
        }

        public Criteria andUsercreatoridNotBetween(String value1, String value2) {
            addCriterion("USERCREATORID not between", value1, value2, "usercreatorid");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeIsNull() {
            addCriterion("USERCREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeIsNotNull() {
            addCriterion("USERCREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeEqualTo(String value) {
            addCriterion("USERCREATETIME =", value, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeNotEqualTo(String value) {
            addCriterion("USERCREATETIME <>", value, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeGreaterThan(String value) {
            addCriterion("USERCREATETIME >", value, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("USERCREATETIME >=", value, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeLessThan(String value) {
            addCriterion("USERCREATETIME <", value, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeLessThanOrEqualTo(String value) {
            addCriterion("USERCREATETIME <=", value, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeLike(String value) {
            addCriterion("USERCREATETIME like", value, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeNotLike(String value) {
            addCriterion("USERCREATETIME not like", value, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeIn(List<String> values) {
            addCriterion("USERCREATETIME in", values, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeNotIn(List<String> values) {
            addCriterion("USERCREATETIME not in", values, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeBetween(String value1, String value2) {
            addCriterion("USERCREATETIME between", value1, value2, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeNotBetween(String value1, String value2) {
            addCriterion("USERCREATETIME not between", value1, value2, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsermodifieridIsNull() {
            addCriterion("USERMODIFIERID is null");
            return (Criteria) this;
        }

        public Criteria andUsermodifieridIsNotNull() {
            addCriterion("USERMODIFIERID is not null");
            return (Criteria) this;
        }

        public Criteria andUsermodifieridEqualTo(String value) {
            addCriterion("USERMODIFIERID =", value, "usermodifierid");
            return (Criteria) this;
        }

        public Criteria andUsermodifieridNotEqualTo(String value) {
            addCriterion("USERMODIFIERID <>", value, "usermodifierid");
            return (Criteria) this;
        }

        public Criteria andUsermodifieridGreaterThan(String value) {
            addCriterion("USERMODIFIERID >", value, "usermodifierid");
            return (Criteria) this;
        }

        public Criteria andUsermodifieridGreaterThanOrEqualTo(String value) {
            addCriterion("USERMODIFIERID >=", value, "usermodifierid");
            return (Criteria) this;
        }

        public Criteria andUsermodifieridLessThan(String value) {
            addCriterion("USERMODIFIERID <", value, "usermodifierid");
            return (Criteria) this;
        }

        public Criteria andUsermodifieridLessThanOrEqualTo(String value) {
            addCriterion("USERMODIFIERID <=", value, "usermodifierid");
            return (Criteria) this;
        }

        public Criteria andUsermodifieridLike(String value) {
            addCriterion("USERMODIFIERID like", value, "usermodifierid");
            return (Criteria) this;
        }

        public Criteria andUsermodifieridNotLike(String value) {
            addCriterion("USERMODIFIERID not like", value, "usermodifierid");
            return (Criteria) this;
        }

        public Criteria andUsermodifieridIn(List<String> values) {
            addCriterion("USERMODIFIERID in", values, "usermodifierid");
            return (Criteria) this;
        }

        public Criteria andUsermodifieridNotIn(List<String> values) {
            addCriterion("USERMODIFIERID not in", values, "usermodifierid");
            return (Criteria) this;
        }

        public Criteria andUsermodifieridBetween(String value1, String value2) {
            addCriterion("USERMODIFIERID between", value1, value2, "usermodifierid");
            return (Criteria) this;
        }

        public Criteria andUsermodifieridNotBetween(String value1, String value2) {
            addCriterion("USERMODIFIERID not between", value1, value2, "usermodifierid");
            return (Criteria) this;
        }

        public Criteria andUsermodifytimeIsNull() {
            addCriterion("USERMODIFYTIME is null");
            return (Criteria) this;
        }

        public Criteria andUsermodifytimeIsNotNull() {
            addCriterion("USERMODIFYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUsermodifytimeEqualTo(String value) {
            addCriterion("USERMODIFYTIME =", value, "usermodifytime");
            return (Criteria) this;
        }

        public Criteria andUsermodifytimeNotEqualTo(String value) {
            addCriterion("USERMODIFYTIME <>", value, "usermodifytime");
            return (Criteria) this;
        }

        public Criteria andUsermodifytimeGreaterThan(String value) {
            addCriterion("USERMODIFYTIME >", value, "usermodifytime");
            return (Criteria) this;
        }

        public Criteria andUsermodifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("USERMODIFYTIME >=", value, "usermodifytime");
            return (Criteria) this;
        }

        public Criteria andUsermodifytimeLessThan(String value) {
            addCriterion("USERMODIFYTIME <", value, "usermodifytime");
            return (Criteria) this;
        }

        public Criteria andUsermodifytimeLessThanOrEqualTo(String value) {
            addCriterion("USERMODIFYTIME <=", value, "usermodifytime");
            return (Criteria) this;
        }

        public Criteria andUsermodifytimeLike(String value) {
            addCriterion("USERMODIFYTIME like", value, "usermodifytime");
            return (Criteria) this;
        }

        public Criteria andUsermodifytimeNotLike(String value) {
            addCriterion("USERMODIFYTIME not like", value, "usermodifytime");
            return (Criteria) this;
        }

        public Criteria andUsermodifytimeIn(List<String> values) {
            addCriterion("USERMODIFYTIME in", values, "usermodifytime");
            return (Criteria) this;
        }

        public Criteria andUsermodifytimeNotIn(List<String> values) {
            addCriterion("USERMODIFYTIME not in", values, "usermodifytime");
            return (Criteria) this;
        }

        public Criteria andUsermodifytimeBetween(String value1, String value2) {
            addCriterion("USERMODIFYTIME between", value1, value2, "usermodifytime");
            return (Criteria) this;
        }

        public Criteria andUsermodifytimeNotBetween(String value1, String value2) {
            addCriterion("USERMODIFYTIME not between", value1, value2, "usermodifytime");
            return (Criteria) this;
        }

        public Criteria andUserpagesizeIsNull() {
            addCriterion("USERPAGESIZE is null");
            return (Criteria) this;
        }

        public Criteria andUserpagesizeIsNotNull() {
            addCriterion("USERPAGESIZE is not null");
            return (Criteria) this;
        }

        public Criteria andUserpagesizeEqualTo(Long value) {
            addCriterion("USERPAGESIZE =", value, "userpagesize");
            return (Criteria) this;
        }

        public Criteria andUserpagesizeNotEqualTo(Long value) {
            addCriterion("USERPAGESIZE <>", value, "userpagesize");
            return (Criteria) this;
        }

        public Criteria andUserpagesizeGreaterThan(Long value) {
            addCriterion("USERPAGESIZE >", value, "userpagesize");
            return (Criteria) this;
        }

        public Criteria andUserpagesizeGreaterThanOrEqualTo(Long value) {
            addCriterion("USERPAGESIZE >=", value, "userpagesize");
            return (Criteria) this;
        }

        public Criteria andUserpagesizeLessThan(Long value) {
            addCriterion("USERPAGESIZE <", value, "userpagesize");
            return (Criteria) this;
        }

        public Criteria andUserpagesizeLessThanOrEqualTo(Long value) {
            addCriterion("USERPAGESIZE <=", value, "userpagesize");
            return (Criteria) this;
        }

        public Criteria andUserpagesizeIn(List<Long> values) {
            addCriterion("USERPAGESIZE in", values, "userpagesize");
            return (Criteria) this;
        }

        public Criteria andUserpagesizeNotIn(List<Long> values) {
            addCriterion("USERPAGESIZE not in", values, "userpagesize");
            return (Criteria) this;
        }

        public Criteria andUserpagesizeBetween(Long value1, Long value2) {
            addCriterion("USERPAGESIZE between", value1, value2, "userpagesize");
            return (Criteria) this;
        }

        public Criteria andUserpagesizeNotBetween(Long value1, Long value2) {
            addCriterion("USERPAGESIZE not between", value1, value2, "userpagesize");
            return (Criteria) this;
        }

        public Criteria andUsermobileIsNull() {
            addCriterion("USERMOBILE is null");
            return (Criteria) this;
        }

        public Criteria andUsermobileIsNotNull() {
            addCriterion("USERMOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andUsermobileEqualTo(String value) {
            addCriterion("USERMOBILE =", value, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsermobileNotEqualTo(String value) {
            addCriterion("USERMOBILE <>", value, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsermobileGreaterThan(String value) {
            addCriterion("USERMOBILE >", value, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsermobileGreaterThanOrEqualTo(String value) {
            addCriterion("USERMOBILE >=", value, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsermobileLessThan(String value) {
            addCriterion("USERMOBILE <", value, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsermobileLessThanOrEqualTo(String value) {
            addCriterion("USERMOBILE <=", value, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsermobileLike(String value) {
            addCriterion("USERMOBILE like", value, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsermobileNotLike(String value) {
            addCriterion("USERMOBILE not like", value, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsermobileIn(List<String> values) {
            addCriterion("USERMOBILE in", values, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsermobileNotIn(List<String> values) {
            addCriterion("USERMOBILE not in", values, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsermobileBetween(String value1, String value2) {
            addCriterion("USERMOBILE between", value1, value2, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsermobileNotBetween(String value1, String value2) {
            addCriterion("USERMOBILE not between", value1, value2, "usermobile");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDCARD =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDCARD <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDCARD >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDCARD <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDCARD <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDCARD like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDCARD not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDCARD in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDCARD not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDCARD between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDCARD not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
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

        public Criteria andPageidIsNull() {
            addCriterion("PAGEID is null");
            return (Criteria) this;
        }

        public Criteria andPageidIsNotNull() {
            addCriterion("PAGEID is not null");
            return (Criteria) this;
        }

        public Criteria andPageidEqualTo(BigDecimal value) {
            addCriterion("PAGEID =", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotEqualTo(BigDecimal value) {
            addCriterion("PAGEID <>", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidGreaterThan(BigDecimal value) {
            addCriterion("PAGEID >", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAGEID >=", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidLessThan(BigDecimal value) {
            addCriterion("PAGEID <", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAGEID <=", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidIn(List<BigDecimal> values) {
            addCriterion("PAGEID in", values, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotIn(List<BigDecimal> values) {
            addCriterion("PAGEID not in", values, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAGEID between", value1, value2, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAGEID not between", value1, value2, "pageid");
            return (Criteria) this;
        }

        public Criteria andLogincountIsNull() {
            addCriterion("LOGINCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLogincountIsNotNull() {
            addCriterion("LOGINCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLogincountEqualTo(BigDecimal value) {
            addCriterion("LOGINCOUNT =", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountNotEqualTo(BigDecimal value) {
            addCriterion("LOGINCOUNT <>", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountGreaterThan(BigDecimal value) {
            addCriterion("LOGINCOUNT >", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOGINCOUNT >=", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountLessThan(BigDecimal value) {
            addCriterion("LOGINCOUNT <", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOGINCOUNT <=", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountIn(List<BigDecimal> values) {
            addCriterion("LOGINCOUNT in", values, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountNotIn(List<BigDecimal> values) {
            addCriterion("LOGINCOUNT not in", values, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOGINCOUNT between", value1, value2, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOGINCOUNT not between", value1, value2, "logincount");
            return (Criteria) this;
        }

        public Criteria andSysidIsNull() {
            addCriterion("SYSID is null");
            return (Criteria) this;
        }

        public Criteria andSysidIsNotNull() {
            addCriterion("SYSID is not null");
            return (Criteria) this;
        }

        public Criteria andSysidEqualTo(String value) {
            addCriterion("SYSID =", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotEqualTo(String value) {
            addCriterion("SYSID <>", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidGreaterThan(String value) {
            addCriterion("SYSID >", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidGreaterThanOrEqualTo(String value) {
            addCriterion("SYSID >=", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLessThan(String value) {
            addCriterion("SYSID <", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLessThanOrEqualTo(String value) {
            addCriterion("SYSID <=", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLike(String value) {
            addCriterion("SYSID like", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotLike(String value) {
            addCriterion("SYSID not like", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidIn(List<String> values) {
            addCriterion("SYSID in", values, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotIn(List<String> values) {
            addCriterion("SYSID not in", values, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidBetween(String value1, String value2) {
            addCriterion("SYSID between", value1, value2, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotBetween(String value1, String value2) {
            addCriterion("SYSID not between", value1, value2, "sysid");
            return (Criteria) this;
        }

        public Criteria andOrderbyIsNull() {
            addCriterion("ORDERBY is null");
            return (Criteria) this;
        }

        public Criteria andOrderbyIsNotNull() {
            addCriterion("ORDERBY is not null");
            return (Criteria) this;
        }

        public Criteria andOrderbyEqualTo(BigDecimal value) {
            addCriterion("ORDERBY =", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotEqualTo(BigDecimal value) {
            addCriterion("ORDERBY <>", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyGreaterThan(BigDecimal value) {
            addCriterion("ORDERBY >", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDERBY >=", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyLessThan(BigDecimal value) {
            addCriterion("ORDERBY <", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDERBY <=", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyIn(List<BigDecimal> values) {
            addCriterion("ORDERBY in", values, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotIn(List<BigDecimal> values) {
            addCriterion("ORDERBY not in", values, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDERBY between", value1, value2, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDERBY not between", value1, value2, "orderby");
            return (Criteria) this;
        }

        public Criteria andUserpasswd1IsNull() {
            addCriterion("USERPASSWD1 is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswd1IsNotNull() {
            addCriterion("USERPASSWD1 is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswd1EqualTo(String value) {
            addCriterion("USERPASSWD1 =", value, "userpasswd1");
            return (Criteria) this;
        }

        public Criteria andUserpasswd1NotEqualTo(String value) {
            addCriterion("USERPASSWD1 <>", value, "userpasswd1");
            return (Criteria) this;
        }

        public Criteria andUserpasswd1GreaterThan(String value) {
            addCriterion("USERPASSWD1 >", value, "userpasswd1");
            return (Criteria) this;
        }

        public Criteria andUserpasswd1GreaterThanOrEqualTo(String value) {
            addCriterion("USERPASSWD1 >=", value, "userpasswd1");
            return (Criteria) this;
        }

        public Criteria andUserpasswd1LessThan(String value) {
            addCriterion("USERPASSWD1 <", value, "userpasswd1");
            return (Criteria) this;
        }

        public Criteria andUserpasswd1LessThanOrEqualTo(String value) {
            addCriterion("USERPASSWD1 <=", value, "userpasswd1");
            return (Criteria) this;
        }

        public Criteria andUserpasswd1Like(String value) {
            addCriterion("USERPASSWD1 like", value, "userpasswd1");
            return (Criteria) this;
        }

        public Criteria andUserpasswd1NotLike(String value) {
            addCriterion("USERPASSWD1 not like", value, "userpasswd1");
            return (Criteria) this;
        }

        public Criteria andUserpasswd1In(List<String> values) {
            addCriterion("USERPASSWD1 in", values, "userpasswd1");
            return (Criteria) this;
        }

        public Criteria andUserpasswd1NotIn(List<String> values) {
            addCriterion("USERPASSWD1 not in", values, "userpasswd1");
            return (Criteria) this;
        }

        public Criteria andUserpasswd1Between(String value1, String value2) {
            addCriterion("USERPASSWD1 between", value1, value2, "userpasswd1");
            return (Criteria) this;
        }

        public Criteria andUserpasswd1NotBetween(String value1, String value2) {
            addCriterion("USERPASSWD1 not between", value1, value2, "userpasswd1");
            return (Criteria) this;
        }

        public Criteria andIsfirstIsNull() {
            addCriterion("ISFIRST is null");
            return (Criteria) this;
        }

        public Criteria andIsfirstIsNotNull() {
            addCriterion("ISFIRST is not null");
            return (Criteria) this;
        }

        public Criteria andIsfirstEqualTo(String value) {
            addCriterion("ISFIRST =", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstNotEqualTo(String value) {
            addCriterion("ISFIRST <>", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstGreaterThan(String value) {
            addCriterion("ISFIRST >", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstGreaterThanOrEqualTo(String value) {
            addCriterion("ISFIRST >=", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstLessThan(String value) {
            addCriterion("ISFIRST <", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstLessThanOrEqualTo(String value) {
            addCriterion("ISFIRST <=", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstLike(String value) {
            addCriterion("ISFIRST like", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstNotLike(String value) {
            addCriterion("ISFIRST not like", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstIn(List<String> values) {
            addCriterion("ISFIRST in", values, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstNotIn(List<String> values) {
            addCriterion("ISFIRST not in", values, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstBetween(String value1, String value2) {
            addCriterion("ISFIRST between", value1, value2, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstNotBetween(String value1, String value2) {
            addCriterion("ISFIRST not between", value1, value2, "isfirst");
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