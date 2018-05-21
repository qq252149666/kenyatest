package com.kenya.bean;

import java.util.ArrayList;
import java.util.List;

public class FundsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FundsExample() {
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

        public Criteria andFundsidIsNull() {
            addCriterion("fundsId is null");
            return (Criteria) this;
        }

        public Criteria andFundsidIsNotNull() {
            addCriterion("fundsId is not null");
            return (Criteria) this;
        }

        public Criteria andFundsidEqualTo(Integer value) {
            addCriterion("fundsId =", value, "fundsid");
            return (Criteria) this;
        }

        public Criteria andFundsidNotEqualTo(Integer value) {
            addCriterion("fundsId <>", value, "fundsid");
            return (Criteria) this;
        }

        public Criteria andFundsidGreaterThan(Integer value) {
            addCriterion("fundsId >", value, "fundsid");
            return (Criteria) this;
        }

        public Criteria andFundsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fundsId >=", value, "fundsid");
            return (Criteria) this;
        }

        public Criteria andFundsidLessThan(Integer value) {
            addCriterion("fundsId <", value, "fundsid");
            return (Criteria) this;
        }

        public Criteria andFundsidLessThanOrEqualTo(Integer value) {
            addCriterion("fundsId <=", value, "fundsid");
            return (Criteria) this;
        }

        public Criteria andFundsidIn(List<Integer> values) {
            addCriterion("fundsId in", values, "fundsid");
            return (Criteria) this;
        }

        public Criteria andFundsidNotIn(List<Integer> values) {
            addCriterion("fundsId not in", values, "fundsid");
            return (Criteria) this;
        }

        public Criteria andFundsidBetween(Integer value1, Integer value2) {
            addCriterion("fundsId between", value1, value2, "fundsid");
            return (Criteria) this;
        }

        public Criteria andFundsidNotBetween(Integer value1, Integer value2) {
            addCriterion("fundsId not between", value1, value2, "fundsid");
            return (Criteria) this;
        }

        public Criteria andFundsnameIsNull() {
            addCriterion("fundsName is null");
            return (Criteria) this;
        }

        public Criteria andFundsnameIsNotNull() {
            addCriterion("fundsName is not null");
            return (Criteria) this;
        }

        public Criteria andFundsnameEqualTo(String value) {
            addCriterion("fundsName =", value, "fundsname");
            return (Criteria) this;
        }

        public Criteria andFundsnameNotEqualTo(String value) {
            addCriterion("fundsName <>", value, "fundsname");
            return (Criteria) this;
        }

        public Criteria andFundsnameGreaterThan(String value) {
            addCriterion("fundsName >", value, "fundsname");
            return (Criteria) this;
        }

        public Criteria andFundsnameGreaterThanOrEqualTo(String value) {
            addCriterion("fundsName >=", value, "fundsname");
            return (Criteria) this;
        }

        public Criteria andFundsnameLessThan(String value) {
            addCriterion("fundsName <", value, "fundsname");
            return (Criteria) this;
        }

        public Criteria andFundsnameLessThanOrEqualTo(String value) {
            addCriterion("fundsName <=", value, "fundsname");
            return (Criteria) this;
        }

        public Criteria andFundsnameLike(String value) {
            addCriterion("fundsName like", value, "fundsname");
            return (Criteria) this;
        }

        public Criteria andFundsnameNotLike(String value) {
            addCriterion("fundsName not like", value, "fundsname");
            return (Criteria) this;
        }

        public Criteria andFundsnameIn(List<String> values) {
            addCriterion("fundsName in", values, "fundsname");
            return (Criteria) this;
        }

        public Criteria andFundsnameNotIn(List<String> values) {
            addCriterion("fundsName not in", values, "fundsname");
            return (Criteria) this;
        }

        public Criteria andFundsnameBetween(String value1, String value2) {
            addCriterion("fundsName between", value1, value2, "fundsname");
            return (Criteria) this;
        }

        public Criteria andFundsnameNotBetween(String value1, String value2) {
            addCriterion("fundsName not between", value1, value2, "fundsname");
            return (Criteria) this;
        }

        public Criteria andFundspriceIsNull() {
            addCriterion("fundsPrice is null");
            return (Criteria) this;
        }

        public Criteria andFundspriceIsNotNull() {
            addCriterion("fundsPrice is not null");
            return (Criteria) this;
        }

        public Criteria andFundspriceEqualTo(Float value) {
            addCriterion("fundsPrice =", value, "fundsprice");
            return (Criteria) this;
        }

        public Criteria andFundspriceNotEqualTo(Float value) {
            addCriterion("fundsPrice <>", value, "fundsprice");
            return (Criteria) this;
        }

        public Criteria andFundspriceGreaterThan(Float value) {
            addCriterion("fundsPrice >", value, "fundsprice");
            return (Criteria) this;
        }

        public Criteria andFundspriceGreaterThanOrEqualTo(Float value) {
            addCriterion("fundsPrice >=", value, "fundsprice");
            return (Criteria) this;
        }

        public Criteria andFundspriceLessThan(Float value) {
            addCriterion("fundsPrice <", value, "fundsprice");
            return (Criteria) this;
        }

        public Criteria andFundspriceLessThanOrEqualTo(Float value) {
            addCriterion("fundsPrice <=", value, "fundsprice");
            return (Criteria) this;
        }

        public Criteria andFundspriceIn(List<Float> values) {
            addCriterion("fundsPrice in", values, "fundsprice");
            return (Criteria) this;
        }

        public Criteria andFundspriceNotIn(List<Float> values) {
            addCriterion("fundsPrice not in", values, "fundsprice");
            return (Criteria) this;
        }

        public Criteria andFundspriceBetween(Float value1, Float value2) {
            addCriterion("fundsPrice between", value1, value2, "fundsprice");
            return (Criteria) this;
        }

        public Criteria andFundspriceNotBetween(Float value1, Float value2) {
            addCriterion("fundsPrice not between", value1, value2, "fundsprice");
            return (Criteria) this;
        }

        public Criteria andFundsdescIsNull() {
            addCriterion("fundsDesc is null");
            return (Criteria) this;
        }

        public Criteria andFundsdescIsNotNull() {
            addCriterion("fundsDesc is not null");
            return (Criteria) this;
        }

        public Criteria andFundsdescEqualTo(String value) {
            addCriterion("fundsDesc =", value, "fundsdesc");
            return (Criteria) this;
        }

        public Criteria andFundsdescNotEqualTo(String value) {
            addCriterion("fundsDesc <>", value, "fundsdesc");
            return (Criteria) this;
        }

        public Criteria andFundsdescGreaterThan(String value) {
            addCriterion("fundsDesc >", value, "fundsdesc");
            return (Criteria) this;
        }

        public Criteria andFundsdescGreaterThanOrEqualTo(String value) {
            addCriterion("fundsDesc >=", value, "fundsdesc");
            return (Criteria) this;
        }

        public Criteria andFundsdescLessThan(String value) {
            addCriterion("fundsDesc <", value, "fundsdesc");
            return (Criteria) this;
        }

        public Criteria andFundsdescLessThanOrEqualTo(String value) {
            addCriterion("fundsDesc <=", value, "fundsdesc");
            return (Criteria) this;
        }

        public Criteria andFundsdescLike(String value) {
            addCriterion("fundsDesc like", value, "fundsdesc");
            return (Criteria) this;
        }

        public Criteria andFundsdescNotLike(String value) {
            addCriterion("fundsDesc not like", value, "fundsdesc");
            return (Criteria) this;
        }

        public Criteria andFundsdescIn(List<String> values) {
            addCriterion("fundsDesc in", values, "fundsdesc");
            return (Criteria) this;
        }

        public Criteria andFundsdescNotIn(List<String> values) {
            addCriterion("fundsDesc not in", values, "fundsdesc");
            return (Criteria) this;
        }

        public Criteria andFundsdescBetween(String value1, String value2) {
            addCriterion("fundsDesc between", value1, value2, "fundsdesc");
            return (Criteria) this;
        }

        public Criteria andFundsdescNotBetween(String value1, String value2) {
            addCriterion("fundsDesc not between", value1, value2, "fundsdesc");
            return (Criteria) this;
        }

        public Criteria andFundsphoneIsNull() {
            addCriterion("fundsPhone is null");
            return (Criteria) this;
        }

        public Criteria andFundsphoneIsNotNull() {
            addCriterion("fundsPhone is not null");
            return (Criteria) this;
        }

        public Criteria andFundsphoneEqualTo(String value) {
            addCriterion("fundsPhone =", value, "fundsphone");
            return (Criteria) this;
        }

        public Criteria andFundsphoneNotEqualTo(String value) {
            addCriterion("fundsPhone <>", value, "fundsphone");
            return (Criteria) this;
        }

        public Criteria andFundsphoneGreaterThan(String value) {
            addCriterion("fundsPhone >", value, "fundsphone");
            return (Criteria) this;
        }

        public Criteria andFundsphoneGreaterThanOrEqualTo(String value) {
            addCriterion("fundsPhone >=", value, "fundsphone");
            return (Criteria) this;
        }

        public Criteria andFundsphoneLessThan(String value) {
            addCriterion("fundsPhone <", value, "fundsphone");
            return (Criteria) this;
        }

        public Criteria andFundsphoneLessThanOrEqualTo(String value) {
            addCriterion("fundsPhone <=", value, "fundsphone");
            return (Criteria) this;
        }

        public Criteria andFundsphoneLike(String value) {
            addCriterion("fundsPhone like", value, "fundsphone");
            return (Criteria) this;
        }

        public Criteria andFundsphoneNotLike(String value) {
            addCriterion("fundsPhone not like", value, "fundsphone");
            return (Criteria) this;
        }

        public Criteria andFundsphoneIn(List<String> values) {
            addCriterion("fundsPhone in", values, "fundsphone");
            return (Criteria) this;
        }

        public Criteria andFundsphoneNotIn(List<String> values) {
            addCriterion("fundsPhone not in", values, "fundsphone");
            return (Criteria) this;
        }

        public Criteria andFundsphoneBetween(String value1, String value2) {
            addCriterion("fundsPhone between", value1, value2, "fundsphone");
            return (Criteria) this;
        }

        public Criteria andFundsphoneNotBetween(String value1, String value2) {
            addCriterion("fundsPhone not between", value1, value2, "fundsphone");
            return (Criteria) this;
        }

        public Criteria andFundsimgsIsNull() {
            addCriterion("fundsImgs is null");
            return (Criteria) this;
        }

        public Criteria andFundsimgsIsNotNull() {
            addCriterion("fundsImgs is not null");
            return (Criteria) this;
        }

        public Criteria andFundsimgsEqualTo(String value) {
            addCriterion("fundsImgs =", value, "fundsimgs");
            return (Criteria) this;
        }

        public Criteria andFundsimgsNotEqualTo(String value) {
            addCriterion("fundsImgs <>", value, "fundsimgs");
            return (Criteria) this;
        }

        public Criteria andFundsimgsGreaterThan(String value) {
            addCriterion("fundsImgs >", value, "fundsimgs");
            return (Criteria) this;
        }

        public Criteria andFundsimgsGreaterThanOrEqualTo(String value) {
            addCriterion("fundsImgs >=", value, "fundsimgs");
            return (Criteria) this;
        }

        public Criteria andFundsimgsLessThan(String value) {
            addCriterion("fundsImgs <", value, "fundsimgs");
            return (Criteria) this;
        }

        public Criteria andFundsimgsLessThanOrEqualTo(String value) {
            addCriterion("fundsImgs <=", value, "fundsimgs");
            return (Criteria) this;
        }

        public Criteria andFundsimgsLike(String value) {
            addCriterion("fundsImgs like", value, "fundsimgs");
            return (Criteria) this;
        }

        public Criteria andFundsimgsNotLike(String value) {
            addCriterion("fundsImgs not like", value, "fundsimgs");
            return (Criteria) this;
        }

        public Criteria andFundsimgsIn(List<String> values) {
            addCriterion("fundsImgs in", values, "fundsimgs");
            return (Criteria) this;
        }

        public Criteria andFundsimgsNotIn(List<String> values) {
            addCriterion("fundsImgs not in", values, "fundsimgs");
            return (Criteria) this;
        }

        public Criteria andFundsimgsBetween(String value1, String value2) {
            addCriterion("fundsImgs between", value1, value2, "fundsimgs");
            return (Criteria) this;
        }

        public Criteria andFundsimgsNotBetween(String value1, String value2) {
            addCriterion("fundsImgs not between", value1, value2, "fundsimgs");
            return (Criteria) this;
        }

        public Criteria andFundsimg1IsNull() {
            addCriterion("fundsImg1 is null");
            return (Criteria) this;
        }

        public Criteria andFundsimg1IsNotNull() {
            addCriterion("fundsImg1 is not null");
            return (Criteria) this;
        }

        public Criteria andFundsimg1EqualTo(String value) {
            addCriterion("fundsImg1 =", value, "fundsimg1");
            return (Criteria) this;
        }

        public Criteria andFundsimg1NotEqualTo(String value) {
            addCriterion("fundsImg1 <>", value, "fundsimg1");
            return (Criteria) this;
        }

        public Criteria andFundsimg1GreaterThan(String value) {
            addCriterion("fundsImg1 >", value, "fundsimg1");
            return (Criteria) this;
        }

        public Criteria andFundsimg1GreaterThanOrEqualTo(String value) {
            addCriterion("fundsImg1 >=", value, "fundsimg1");
            return (Criteria) this;
        }

        public Criteria andFundsimg1LessThan(String value) {
            addCriterion("fundsImg1 <", value, "fundsimg1");
            return (Criteria) this;
        }

        public Criteria andFundsimg1LessThanOrEqualTo(String value) {
            addCriterion("fundsImg1 <=", value, "fundsimg1");
            return (Criteria) this;
        }

        public Criteria andFundsimg1Like(String value) {
            addCriterion("fundsImg1 like", value, "fundsimg1");
            return (Criteria) this;
        }

        public Criteria andFundsimg1NotLike(String value) {
            addCriterion("fundsImg1 not like", value, "fundsimg1");
            return (Criteria) this;
        }

        public Criteria andFundsimg1In(List<String> values) {
            addCriterion("fundsImg1 in", values, "fundsimg1");
            return (Criteria) this;
        }

        public Criteria andFundsimg1NotIn(List<String> values) {
            addCriterion("fundsImg1 not in", values, "fundsimg1");
            return (Criteria) this;
        }

        public Criteria andFundsimg1Between(String value1, String value2) {
            addCriterion("fundsImg1 between", value1, value2, "fundsimg1");
            return (Criteria) this;
        }

        public Criteria andFundsimg1NotBetween(String value1, String value2) {
            addCriterion("fundsImg1 not between", value1, value2, "fundsimg1");
            return (Criteria) this;
        }

        public Criteria andFundsimg2IsNull() {
            addCriterion("fundsImg2 is null");
            return (Criteria) this;
        }

        public Criteria andFundsimg2IsNotNull() {
            addCriterion("fundsImg2 is not null");
            return (Criteria) this;
        }

        public Criteria andFundsimg2EqualTo(String value) {
            addCriterion("fundsImg2 =", value, "fundsimg2");
            return (Criteria) this;
        }

        public Criteria andFundsimg2NotEqualTo(String value) {
            addCriterion("fundsImg2 <>", value, "fundsimg2");
            return (Criteria) this;
        }

        public Criteria andFundsimg2GreaterThan(String value) {
            addCriterion("fundsImg2 >", value, "fundsimg2");
            return (Criteria) this;
        }

        public Criteria andFundsimg2GreaterThanOrEqualTo(String value) {
            addCriterion("fundsImg2 >=", value, "fundsimg2");
            return (Criteria) this;
        }

        public Criteria andFundsimg2LessThan(String value) {
            addCriterion("fundsImg2 <", value, "fundsimg2");
            return (Criteria) this;
        }

        public Criteria andFundsimg2LessThanOrEqualTo(String value) {
            addCriterion("fundsImg2 <=", value, "fundsimg2");
            return (Criteria) this;
        }

        public Criteria andFundsimg2Like(String value) {
            addCriterion("fundsImg2 like", value, "fundsimg2");
            return (Criteria) this;
        }

        public Criteria andFundsimg2NotLike(String value) {
            addCriterion("fundsImg2 not like", value, "fundsimg2");
            return (Criteria) this;
        }

        public Criteria andFundsimg2In(List<String> values) {
            addCriterion("fundsImg2 in", values, "fundsimg2");
            return (Criteria) this;
        }

        public Criteria andFundsimg2NotIn(List<String> values) {
            addCriterion("fundsImg2 not in", values, "fundsimg2");
            return (Criteria) this;
        }

        public Criteria andFundsimg2Between(String value1, String value2) {
            addCriterion("fundsImg2 between", value1, value2, "fundsimg2");
            return (Criteria) this;
        }

        public Criteria andFundsimg2NotBetween(String value1, String value2) {
            addCriterion("fundsImg2 not between", value1, value2, "fundsimg2");
            return (Criteria) this;
        }

        public Criteria andFundsimg3IsNull() {
            addCriterion("fundsImg3 is null");
            return (Criteria) this;
        }

        public Criteria andFundsimg3IsNotNull() {
            addCriterion("fundsImg3 is not null");
            return (Criteria) this;
        }

        public Criteria andFundsimg3EqualTo(String value) {
            addCriterion("fundsImg3 =", value, "fundsimg3");
            return (Criteria) this;
        }

        public Criteria andFundsimg3NotEqualTo(String value) {
            addCriterion("fundsImg3 <>", value, "fundsimg3");
            return (Criteria) this;
        }

        public Criteria andFundsimg3GreaterThan(String value) {
            addCriterion("fundsImg3 >", value, "fundsimg3");
            return (Criteria) this;
        }

        public Criteria andFundsimg3GreaterThanOrEqualTo(String value) {
            addCriterion("fundsImg3 >=", value, "fundsimg3");
            return (Criteria) this;
        }

        public Criteria andFundsimg3LessThan(String value) {
            addCriterion("fundsImg3 <", value, "fundsimg3");
            return (Criteria) this;
        }

        public Criteria andFundsimg3LessThanOrEqualTo(String value) {
            addCriterion("fundsImg3 <=", value, "fundsimg3");
            return (Criteria) this;
        }

        public Criteria andFundsimg3Like(String value) {
            addCriterion("fundsImg3 like", value, "fundsimg3");
            return (Criteria) this;
        }

        public Criteria andFundsimg3NotLike(String value) {
            addCriterion("fundsImg3 not like", value, "fundsimg3");
            return (Criteria) this;
        }

        public Criteria andFundsimg3In(List<String> values) {
            addCriterion("fundsImg3 in", values, "fundsimg3");
            return (Criteria) this;
        }

        public Criteria andFundsimg3NotIn(List<String> values) {
            addCriterion("fundsImg3 not in", values, "fundsimg3");
            return (Criteria) this;
        }

        public Criteria andFundsimg3Between(String value1, String value2) {
            addCriterion("fundsImg3 between", value1, value2, "fundsimg3");
            return (Criteria) this;
        }

        public Criteria andFundsimg3NotBetween(String value1, String value2) {
            addCriterion("fundsImg3 not between", value1, value2, "fundsimg3");
            return (Criteria) this;
        }

        public Criteria andFundsimg4IsNull() {
            addCriterion("fundsImg4 is null");
            return (Criteria) this;
        }

        public Criteria andFundsimg4IsNotNull() {
            addCriterion("fundsImg4 is not null");
            return (Criteria) this;
        }

        public Criteria andFundsimg4EqualTo(String value) {
            addCriterion("fundsImg4 =", value, "fundsimg4");
            return (Criteria) this;
        }

        public Criteria andFundsimg4NotEqualTo(String value) {
            addCriterion("fundsImg4 <>", value, "fundsimg4");
            return (Criteria) this;
        }

        public Criteria andFundsimg4GreaterThan(String value) {
            addCriterion("fundsImg4 >", value, "fundsimg4");
            return (Criteria) this;
        }

        public Criteria andFundsimg4GreaterThanOrEqualTo(String value) {
            addCriterion("fundsImg4 >=", value, "fundsimg4");
            return (Criteria) this;
        }

        public Criteria andFundsimg4LessThan(String value) {
            addCriterion("fundsImg4 <", value, "fundsimg4");
            return (Criteria) this;
        }

        public Criteria andFundsimg4LessThanOrEqualTo(String value) {
            addCriterion("fundsImg4 <=", value, "fundsimg4");
            return (Criteria) this;
        }

        public Criteria andFundsimg4Like(String value) {
            addCriterion("fundsImg4 like", value, "fundsimg4");
            return (Criteria) this;
        }

        public Criteria andFundsimg4NotLike(String value) {
            addCriterion("fundsImg4 not like", value, "fundsimg4");
            return (Criteria) this;
        }

        public Criteria andFundsimg4In(List<String> values) {
            addCriterion("fundsImg4 in", values, "fundsimg4");
            return (Criteria) this;
        }

        public Criteria andFundsimg4NotIn(List<String> values) {
            addCriterion("fundsImg4 not in", values, "fundsimg4");
            return (Criteria) this;
        }

        public Criteria andFundsimg4Between(String value1, String value2) {
            addCriterion("fundsImg4 between", value1, value2, "fundsimg4");
            return (Criteria) this;
        }

        public Criteria andFundsimg4NotBetween(String value1, String value2) {
            addCriterion("fundsImg4 not between", value1, value2, "fundsimg4");
            return (Criteria) this;
        }

        public Criteria andFundsuserIsNull() {
            addCriterion("fundsUser is null");
            return (Criteria) this;
        }

        public Criteria andFundsuserIsNotNull() {
            addCriterion("fundsUser is not null");
            return (Criteria) this;
        }

        public Criteria andFundsuserEqualTo(String value) {
            addCriterion("fundsUser =", value, "fundsuser");
            return (Criteria) this;
        }

        public Criteria andFundsuserNotEqualTo(String value) {
            addCriterion("fundsUser <>", value, "fundsuser");
            return (Criteria) this;
        }

        public Criteria andFundsuserGreaterThan(String value) {
            addCriterion("fundsUser >", value, "fundsuser");
            return (Criteria) this;
        }

        public Criteria andFundsuserGreaterThanOrEqualTo(String value) {
            addCriterion("fundsUser >=", value, "fundsuser");
            return (Criteria) this;
        }

        public Criteria andFundsuserLessThan(String value) {
            addCriterion("fundsUser <", value, "fundsuser");
            return (Criteria) this;
        }

        public Criteria andFundsuserLessThanOrEqualTo(String value) {
            addCriterion("fundsUser <=", value, "fundsuser");
            return (Criteria) this;
        }

        public Criteria andFundsuserLike(String value) {
            addCriterion("fundsUser like", value, "fundsuser");
            return (Criteria) this;
        }

        public Criteria andFundsuserNotLike(String value) {
            addCriterion("fundsUser not like", value, "fundsuser");
            return (Criteria) this;
        }

        public Criteria andFundsuserIn(List<String> values) {
            addCriterion("fundsUser in", values, "fundsuser");
            return (Criteria) this;
        }

        public Criteria andFundsuserNotIn(List<String> values) {
            addCriterion("fundsUser not in", values, "fundsuser");
            return (Criteria) this;
        }

        public Criteria andFundsuserBetween(String value1, String value2) {
            addCriterion("fundsUser between", value1, value2, "fundsuser");
            return (Criteria) this;
        }

        public Criteria andFundsuserNotBetween(String value1, String value2) {
            addCriterion("fundsUser not between", value1, value2, "fundsuser");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNull() {
            addCriterion("adminId is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("adminId is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(Integer value) {
            addCriterion("adminId =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(Integer value) {
            addCriterion("adminId <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(Integer value) {
            addCriterion("adminId >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminId >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(Integer value) {
            addCriterion("adminId <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(Integer value) {
            addCriterion("adminId <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<Integer> values) {
            addCriterion("adminId in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<Integer> values) {
            addCriterion("adminId not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(Integer value1, Integer value2) {
            addCriterion("adminId between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(Integer value1, Integer value2) {
            addCriterion("adminId not between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andFundadvantageIsNull() {
            addCriterion("FundAdvantage is null");
            return (Criteria) this;
        }

        public Criteria andFundadvantageIsNotNull() {
            addCriterion("FundAdvantage is not null");
            return (Criteria) this;
        }

        public Criteria andFundadvantageEqualTo(String value) {
            addCriterion("FundAdvantage =", value, "fundadvantage");
            return (Criteria) this;
        }

        public Criteria andFundadvantageNotEqualTo(String value) {
            addCriterion("FundAdvantage <>", value, "fundadvantage");
            return (Criteria) this;
        }

        public Criteria andFundadvantageGreaterThan(String value) {
            addCriterion("FundAdvantage >", value, "fundadvantage");
            return (Criteria) this;
        }

        public Criteria andFundadvantageGreaterThanOrEqualTo(String value) {
            addCriterion("FundAdvantage >=", value, "fundadvantage");
            return (Criteria) this;
        }

        public Criteria andFundadvantageLessThan(String value) {
            addCriterion("FundAdvantage <", value, "fundadvantage");
            return (Criteria) this;
        }

        public Criteria andFundadvantageLessThanOrEqualTo(String value) {
            addCriterion("FundAdvantage <=", value, "fundadvantage");
            return (Criteria) this;
        }

        public Criteria andFundadvantageLike(String value) {
            addCriterion("FundAdvantage like", value, "fundadvantage");
            return (Criteria) this;
        }

        public Criteria andFundadvantageNotLike(String value) {
            addCriterion("FundAdvantage not like", value, "fundadvantage");
            return (Criteria) this;
        }

        public Criteria andFundadvantageIn(List<String> values) {
            addCriterion("FundAdvantage in", values, "fundadvantage");
            return (Criteria) this;
        }

        public Criteria andFundadvantageNotIn(List<String> values) {
            addCriterion("FundAdvantage not in", values, "fundadvantage");
            return (Criteria) this;
        }

        public Criteria andFundadvantageBetween(String value1, String value2) {
            addCriterion("FundAdvantage between", value1, value2, "fundadvantage");
            return (Criteria) this;
        }

        public Criteria andFundadvantageNotBetween(String value1, String value2) {
            addCriterion("FundAdvantage not between", value1, value2, "fundadvantage");
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