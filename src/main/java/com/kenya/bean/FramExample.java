package com.kenya.bean;

import java.util.ArrayList;
import java.util.List;

public class FramExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FramExample() {
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

        public Criteria andFramidIsNull() {
            addCriterion("framId is null");
            return (Criteria) this;
        }

        public Criteria andFramidIsNotNull() {
            addCriterion("framId is not null");
            return (Criteria) this;
        }

        public Criteria andFramidEqualTo(Integer value) {
            addCriterion("framId =", value, "framid");
            return (Criteria) this;
        }

        public Criteria andFramidNotEqualTo(Integer value) {
            addCriterion("framId <>", value, "framid");
            return (Criteria) this;
        }

        public Criteria andFramidGreaterThan(Integer value) {
            addCriterion("framId >", value, "framid");
            return (Criteria) this;
        }

        public Criteria andFramidGreaterThanOrEqualTo(Integer value) {
            addCriterion("framId >=", value, "framid");
            return (Criteria) this;
        }

        public Criteria andFramidLessThan(Integer value) {
            addCriterion("framId <", value, "framid");
            return (Criteria) this;
        }

        public Criteria andFramidLessThanOrEqualTo(Integer value) {
            addCriterion("framId <=", value, "framid");
            return (Criteria) this;
        }

        public Criteria andFramidIn(List<Integer> values) {
            addCriterion("framId in", values, "framid");
            return (Criteria) this;
        }

        public Criteria andFramidNotIn(List<Integer> values) {
            addCriterion("framId not in", values, "framid");
            return (Criteria) this;
        }

        public Criteria andFramidBetween(Integer value1, Integer value2) {
            addCriterion("framId between", value1, value2, "framid");
            return (Criteria) this;
        }

        public Criteria andFramidNotBetween(Integer value1, Integer value2) {
            addCriterion("framId not between", value1, value2, "framid");
            return (Criteria) this;
        }

        public Criteria andFramnameIsNull() {
            addCriterion("framName is null");
            return (Criteria) this;
        }

        public Criteria andFramnameIsNotNull() {
            addCriterion("framName is not null");
            return (Criteria) this;
        }

        public Criteria andFramnameEqualTo(String value) {
            addCriterion("framName =", value, "framname");
            return (Criteria) this;
        }

        public Criteria andFramnameNotEqualTo(String value) {
            addCriterion("framName <>", value, "framname");
            return (Criteria) this;
        }

        public Criteria andFramnameGreaterThan(String value) {
            addCriterion("framName >", value, "framname");
            return (Criteria) this;
        }

        public Criteria andFramnameGreaterThanOrEqualTo(String value) {
            addCriterion("framName >=", value, "framname");
            return (Criteria) this;
        }

        public Criteria andFramnameLessThan(String value) {
            addCriterion("framName <", value, "framname");
            return (Criteria) this;
        }

        public Criteria andFramnameLessThanOrEqualTo(String value) {
            addCriterion("framName <=", value, "framname");
            return (Criteria) this;
        }

        public Criteria andFramnameLike(String value) {
            addCriterion("framName like", value, "framname");
            return (Criteria) this;
        }

        public Criteria andFramnameNotLike(String value) {
            addCriterion("framName not like", value, "framname");
            return (Criteria) this;
        }

        public Criteria andFramnameIn(List<String> values) {
            addCriterion("framName in", values, "framname");
            return (Criteria) this;
        }

        public Criteria andFramnameNotIn(List<String> values) {
            addCriterion("framName not in", values, "framname");
            return (Criteria) this;
        }

        public Criteria andFramnameBetween(String value1, String value2) {
            addCriterion("framName between", value1, value2, "framname");
            return (Criteria) this;
        }

        public Criteria andFramnameNotBetween(String value1, String value2) {
            addCriterion("framName not between", value1, value2, "framname");
            return (Criteria) this;
        }

        public Criteria andFramimgsIsNull() {
            addCriterion("framImgs is null");
            return (Criteria) this;
        }

        public Criteria andFramimgsIsNotNull() {
            addCriterion("framImgs is not null");
            return (Criteria) this;
        }

        public Criteria andFramimgsEqualTo(String value) {
            addCriterion("framImgs =", value, "framimgs");
            return (Criteria) this;
        }

        public Criteria andFramimgsNotEqualTo(String value) {
            addCriterion("framImgs <>", value, "framimgs");
            return (Criteria) this;
        }

        public Criteria andFramimgsGreaterThan(String value) {
            addCriterion("framImgs >", value, "framimgs");
            return (Criteria) this;
        }

        public Criteria andFramimgsGreaterThanOrEqualTo(String value) {
            addCriterion("framImgs >=", value, "framimgs");
            return (Criteria) this;
        }

        public Criteria andFramimgsLessThan(String value) {
            addCriterion("framImgs <", value, "framimgs");
            return (Criteria) this;
        }

        public Criteria andFramimgsLessThanOrEqualTo(String value) {
            addCriterion("framImgs <=", value, "framimgs");
            return (Criteria) this;
        }

        public Criteria andFramimgsLike(String value) {
            addCriterion("framImgs like", value, "framimgs");
            return (Criteria) this;
        }

        public Criteria andFramimgsNotLike(String value) {
            addCriterion("framImgs not like", value, "framimgs");
            return (Criteria) this;
        }

        public Criteria andFramimgsIn(List<String> values) {
            addCriterion("framImgs in", values, "framimgs");
            return (Criteria) this;
        }

        public Criteria andFramimgsNotIn(List<String> values) {
            addCriterion("framImgs not in", values, "framimgs");
            return (Criteria) this;
        }

        public Criteria andFramimgsBetween(String value1, String value2) {
            addCriterion("framImgs between", value1, value2, "framimgs");
            return (Criteria) this;
        }

        public Criteria andFramimgsNotBetween(String value1, String value2) {
            addCriterion("framImgs not between", value1, value2, "framimgs");
            return (Criteria) this;
        }

        public Criteria andFramimg1IsNull() {
            addCriterion("framImg1 is null");
            return (Criteria) this;
        }

        public Criteria andFramimg1IsNotNull() {
            addCriterion("framImg1 is not null");
            return (Criteria) this;
        }

        public Criteria andFramimg1EqualTo(String value) {
            addCriterion("framImg1 =", value, "framimg1");
            return (Criteria) this;
        }

        public Criteria andFramimg1NotEqualTo(String value) {
            addCriterion("framImg1 <>", value, "framimg1");
            return (Criteria) this;
        }

        public Criteria andFramimg1GreaterThan(String value) {
            addCriterion("framImg1 >", value, "framimg1");
            return (Criteria) this;
        }

        public Criteria andFramimg1GreaterThanOrEqualTo(String value) {
            addCriterion("framImg1 >=", value, "framimg1");
            return (Criteria) this;
        }

        public Criteria andFramimg1LessThan(String value) {
            addCriterion("framImg1 <", value, "framimg1");
            return (Criteria) this;
        }

        public Criteria andFramimg1LessThanOrEqualTo(String value) {
            addCriterion("framImg1 <=", value, "framimg1");
            return (Criteria) this;
        }

        public Criteria andFramimg1Like(String value) {
            addCriterion("framImg1 like", value, "framimg1");
            return (Criteria) this;
        }

        public Criteria andFramimg1NotLike(String value) {
            addCriterion("framImg1 not like", value, "framimg1");
            return (Criteria) this;
        }

        public Criteria andFramimg1In(List<String> values) {
            addCriterion("framImg1 in", values, "framimg1");
            return (Criteria) this;
        }

        public Criteria andFramimg1NotIn(List<String> values) {
            addCriterion("framImg1 not in", values, "framimg1");
            return (Criteria) this;
        }

        public Criteria andFramimg1Between(String value1, String value2) {
            addCriterion("framImg1 between", value1, value2, "framimg1");
            return (Criteria) this;
        }

        public Criteria andFramimg1NotBetween(String value1, String value2) {
            addCriterion("framImg1 not between", value1, value2, "framimg1");
            return (Criteria) this;
        }

        public Criteria andFramimg2IsNull() {
            addCriterion("framImg2 is null");
            return (Criteria) this;
        }

        public Criteria andFramimg2IsNotNull() {
            addCriterion("framImg2 is not null");
            return (Criteria) this;
        }

        public Criteria andFramimg2EqualTo(String value) {
            addCriterion("framImg2 =", value, "framimg2");
            return (Criteria) this;
        }

        public Criteria andFramimg2NotEqualTo(String value) {
            addCriterion("framImg2 <>", value, "framimg2");
            return (Criteria) this;
        }

        public Criteria andFramimg2GreaterThan(String value) {
            addCriterion("framImg2 >", value, "framimg2");
            return (Criteria) this;
        }

        public Criteria andFramimg2GreaterThanOrEqualTo(String value) {
            addCriterion("framImg2 >=", value, "framimg2");
            return (Criteria) this;
        }

        public Criteria andFramimg2LessThan(String value) {
            addCriterion("framImg2 <", value, "framimg2");
            return (Criteria) this;
        }

        public Criteria andFramimg2LessThanOrEqualTo(String value) {
            addCriterion("framImg2 <=", value, "framimg2");
            return (Criteria) this;
        }

        public Criteria andFramimg2Like(String value) {
            addCriterion("framImg2 like", value, "framimg2");
            return (Criteria) this;
        }

        public Criteria andFramimg2NotLike(String value) {
            addCriterion("framImg2 not like", value, "framimg2");
            return (Criteria) this;
        }

        public Criteria andFramimg2In(List<String> values) {
            addCriterion("framImg2 in", values, "framimg2");
            return (Criteria) this;
        }

        public Criteria andFramimg2NotIn(List<String> values) {
            addCriterion("framImg2 not in", values, "framimg2");
            return (Criteria) this;
        }

        public Criteria andFramimg2Between(String value1, String value2) {
            addCriterion("framImg2 between", value1, value2, "framimg2");
            return (Criteria) this;
        }

        public Criteria andFramimg2NotBetween(String value1, String value2) {
            addCriterion("framImg2 not between", value1, value2, "framimg2");
            return (Criteria) this;
        }

        public Criteria andFramimg3IsNull() {
            addCriterion("framImg3 is null");
            return (Criteria) this;
        }

        public Criteria andFramimg3IsNotNull() {
            addCriterion("framImg3 is not null");
            return (Criteria) this;
        }

        public Criteria andFramimg3EqualTo(String value) {
            addCriterion("framImg3 =", value, "framimg3");
            return (Criteria) this;
        }

        public Criteria andFramimg3NotEqualTo(String value) {
            addCriterion("framImg3 <>", value, "framimg3");
            return (Criteria) this;
        }

        public Criteria andFramimg3GreaterThan(String value) {
            addCriterion("framImg3 >", value, "framimg3");
            return (Criteria) this;
        }

        public Criteria andFramimg3GreaterThanOrEqualTo(String value) {
            addCriterion("framImg3 >=", value, "framimg3");
            return (Criteria) this;
        }

        public Criteria andFramimg3LessThan(String value) {
            addCriterion("framImg3 <", value, "framimg3");
            return (Criteria) this;
        }

        public Criteria andFramimg3LessThanOrEqualTo(String value) {
            addCriterion("framImg3 <=", value, "framimg3");
            return (Criteria) this;
        }

        public Criteria andFramimg3Like(String value) {
            addCriterion("framImg3 like", value, "framimg3");
            return (Criteria) this;
        }

        public Criteria andFramimg3NotLike(String value) {
            addCriterion("framImg3 not like", value, "framimg3");
            return (Criteria) this;
        }

        public Criteria andFramimg3In(List<String> values) {
            addCriterion("framImg3 in", values, "framimg3");
            return (Criteria) this;
        }

        public Criteria andFramimg3NotIn(List<String> values) {
            addCriterion("framImg3 not in", values, "framimg3");
            return (Criteria) this;
        }

        public Criteria andFramimg3Between(String value1, String value2) {
            addCriterion("framImg3 between", value1, value2, "framimg3");
            return (Criteria) this;
        }

        public Criteria andFramimg3NotBetween(String value1, String value2) {
            addCriterion("framImg3 not between", value1, value2, "framimg3");
            return (Criteria) this;
        }

        public Criteria andFramimg4IsNull() {
            addCriterion("framImg4 is null");
            return (Criteria) this;
        }

        public Criteria andFramimg4IsNotNull() {
            addCriterion("framImg4 is not null");
            return (Criteria) this;
        }

        public Criteria andFramimg4EqualTo(String value) {
            addCriterion("framImg4 =", value, "framimg4");
            return (Criteria) this;
        }

        public Criteria andFramimg4NotEqualTo(String value) {
            addCriterion("framImg4 <>", value, "framimg4");
            return (Criteria) this;
        }

        public Criteria andFramimg4GreaterThan(String value) {
            addCriterion("framImg4 >", value, "framimg4");
            return (Criteria) this;
        }

        public Criteria andFramimg4GreaterThanOrEqualTo(String value) {
            addCriterion("framImg4 >=", value, "framimg4");
            return (Criteria) this;
        }

        public Criteria andFramimg4LessThan(String value) {
            addCriterion("framImg4 <", value, "framimg4");
            return (Criteria) this;
        }

        public Criteria andFramimg4LessThanOrEqualTo(String value) {
            addCriterion("framImg4 <=", value, "framimg4");
            return (Criteria) this;
        }

        public Criteria andFramimg4Like(String value) {
            addCriterion("framImg4 like", value, "framimg4");
            return (Criteria) this;
        }

        public Criteria andFramimg4NotLike(String value) {
            addCriterion("framImg4 not like", value, "framimg4");
            return (Criteria) this;
        }

        public Criteria andFramimg4In(List<String> values) {
            addCriterion("framImg4 in", values, "framimg4");
            return (Criteria) this;
        }

        public Criteria andFramimg4NotIn(List<String> values) {
            addCriterion("framImg4 not in", values, "framimg4");
            return (Criteria) this;
        }

        public Criteria andFramimg4Between(String value1, String value2) {
            addCriterion("framImg4 between", value1, value2, "framimg4");
            return (Criteria) this;
        }

        public Criteria andFramimg4NotBetween(String value1, String value2) {
            addCriterion("framImg4 not between", value1, value2, "framimg4");
            return (Criteria) this;
        }

        public Criteria andFramtypeIsNull() {
            addCriterion("framType is null");
            return (Criteria) this;
        }

        public Criteria andFramtypeIsNotNull() {
            addCriterion("framType is not null");
            return (Criteria) this;
        }

        public Criteria andFramtypeEqualTo(String value) {
            addCriterion("framType =", value, "framtype");
            return (Criteria) this;
        }

        public Criteria andFramtypeNotEqualTo(String value) {
            addCriterion("framType <>", value, "framtype");
            return (Criteria) this;
        }

        public Criteria andFramtypeGreaterThan(String value) {
            addCriterion("framType >", value, "framtype");
            return (Criteria) this;
        }

        public Criteria andFramtypeGreaterThanOrEqualTo(String value) {
            addCriterion("framType >=", value, "framtype");
            return (Criteria) this;
        }

        public Criteria andFramtypeLessThan(String value) {
            addCriterion("framType <", value, "framtype");
            return (Criteria) this;
        }

        public Criteria andFramtypeLessThanOrEqualTo(String value) {
            addCriterion("framType <=", value, "framtype");
            return (Criteria) this;
        }

        public Criteria andFramtypeLike(String value) {
            addCriterion("framType like", value, "framtype");
            return (Criteria) this;
        }

        public Criteria andFramtypeNotLike(String value) {
            addCriterion("framType not like", value, "framtype");
            return (Criteria) this;
        }

        public Criteria andFramtypeIn(List<String> values) {
            addCriterion("framType in", values, "framtype");
            return (Criteria) this;
        }

        public Criteria andFramtypeNotIn(List<String> values) {
            addCriterion("framType not in", values, "framtype");
            return (Criteria) this;
        }

        public Criteria andFramtypeBetween(String value1, String value2) {
            addCriterion("framType between", value1, value2, "framtype");
            return (Criteria) this;
        }

        public Criteria andFramtypeNotBetween(String value1, String value2) {
            addCriterion("framType not between", value1, value2, "framtype");
            return (Criteria) this;
        }

        public Criteria andFramuserIsNull() {
            addCriterion("framUser is null");
            return (Criteria) this;
        }

        public Criteria andFramuserIsNotNull() {
            addCriterion("framUser is not null");
            return (Criteria) this;
        }

        public Criteria andFramuserEqualTo(String value) {
            addCriterion("framUser =", value, "framuser");
            return (Criteria) this;
        }

        public Criteria andFramuserNotEqualTo(String value) {
            addCriterion("framUser <>", value, "framuser");
            return (Criteria) this;
        }

        public Criteria andFramuserGreaterThan(String value) {
            addCriterion("framUser >", value, "framuser");
            return (Criteria) this;
        }

        public Criteria andFramuserGreaterThanOrEqualTo(String value) {
            addCriterion("framUser >=", value, "framuser");
            return (Criteria) this;
        }

        public Criteria andFramuserLessThan(String value) {
            addCriterion("framUser <", value, "framuser");
            return (Criteria) this;
        }

        public Criteria andFramuserLessThanOrEqualTo(String value) {
            addCriterion("framUser <=", value, "framuser");
            return (Criteria) this;
        }

        public Criteria andFramuserLike(String value) {
            addCriterion("framUser like", value, "framuser");
            return (Criteria) this;
        }

        public Criteria andFramuserNotLike(String value) {
            addCriterion("framUser not like", value, "framuser");
            return (Criteria) this;
        }

        public Criteria andFramuserIn(List<String> values) {
            addCriterion("framUser in", values, "framuser");
            return (Criteria) this;
        }

        public Criteria andFramuserNotIn(List<String> values) {
            addCriterion("framUser not in", values, "framuser");
            return (Criteria) this;
        }

        public Criteria andFramuserBetween(String value1, String value2) {
            addCriterion("framUser between", value1, value2, "framuser");
            return (Criteria) this;
        }

        public Criteria andFramuserNotBetween(String value1, String value2) {
            addCriterion("framUser not between", value1, value2, "framuser");
            return (Criteria) this;
        }

        public Criteria andFramphoneIsNull() {
            addCriterion("framPhone is null");
            return (Criteria) this;
        }

        public Criteria andFramphoneIsNotNull() {
            addCriterion("framPhone is not null");
            return (Criteria) this;
        }

        public Criteria andFramphoneEqualTo(String value) {
            addCriterion("framPhone =", value, "framphone");
            return (Criteria) this;
        }

        public Criteria andFramphoneNotEqualTo(String value) {
            addCriterion("framPhone <>", value, "framphone");
            return (Criteria) this;
        }

        public Criteria andFramphoneGreaterThan(String value) {
            addCriterion("framPhone >", value, "framphone");
            return (Criteria) this;
        }

        public Criteria andFramphoneGreaterThanOrEqualTo(String value) {
            addCriterion("framPhone >=", value, "framphone");
            return (Criteria) this;
        }

        public Criteria andFramphoneLessThan(String value) {
            addCriterion("framPhone <", value, "framphone");
            return (Criteria) this;
        }

        public Criteria andFramphoneLessThanOrEqualTo(String value) {
            addCriterion("framPhone <=", value, "framphone");
            return (Criteria) this;
        }

        public Criteria andFramphoneLike(String value) {
            addCriterion("framPhone like", value, "framphone");
            return (Criteria) this;
        }

        public Criteria andFramphoneNotLike(String value) {
            addCriterion("framPhone not like", value, "framphone");
            return (Criteria) this;
        }

        public Criteria andFramphoneIn(List<String> values) {
            addCriterion("framPhone in", values, "framphone");
            return (Criteria) this;
        }

        public Criteria andFramphoneNotIn(List<String> values) {
            addCriterion("framPhone not in", values, "framphone");
            return (Criteria) this;
        }

        public Criteria andFramphoneBetween(String value1, String value2) {
            addCriterion("framPhone between", value1, value2, "framphone");
            return (Criteria) this;
        }

        public Criteria andFramphoneNotBetween(String value1, String value2) {
            addCriterion("framPhone not between", value1, value2, "framphone");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
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