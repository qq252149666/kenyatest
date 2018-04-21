package com.kenya.bean;

import java.util.ArrayList;
import java.util.List;

public class LeaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeaseExample() {
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

        public Criteria andLeaseidIsNull() {
            addCriterion("leaseId is null");
            return (Criteria) this;
        }

        public Criteria andLeaseidIsNotNull() {
            addCriterion("leaseId is not null");
            return (Criteria) this;
        }

        public Criteria andLeaseidEqualTo(Integer value) {
            addCriterion("leaseId =", value, "leaseid");
            return (Criteria) this;
        }

        public Criteria andLeaseidNotEqualTo(Integer value) {
            addCriterion("leaseId <>", value, "leaseid");
            return (Criteria) this;
        }

        public Criteria andLeaseidGreaterThan(Integer value) {
            addCriterion("leaseId >", value, "leaseid");
            return (Criteria) this;
        }

        public Criteria andLeaseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("leaseId >=", value, "leaseid");
            return (Criteria) this;
        }

        public Criteria andLeaseidLessThan(Integer value) {
            addCriterion("leaseId <", value, "leaseid");
            return (Criteria) this;
        }

        public Criteria andLeaseidLessThanOrEqualTo(Integer value) {
            addCriterion("leaseId <=", value, "leaseid");
            return (Criteria) this;
        }

        public Criteria andLeaseidIn(List<Integer> values) {
            addCriterion("leaseId in", values, "leaseid");
            return (Criteria) this;
        }

        public Criteria andLeaseidNotIn(List<Integer> values) {
            addCriterion("leaseId not in", values, "leaseid");
            return (Criteria) this;
        }

        public Criteria andLeaseidBetween(Integer value1, Integer value2) {
            addCriterion("leaseId between", value1, value2, "leaseid");
            return (Criteria) this;
        }

        public Criteria andLeaseidNotBetween(Integer value1, Integer value2) {
            addCriterion("leaseId not between", value1, value2, "leaseid");
            return (Criteria) this;
        }

        public Criteria andLeaseimgsIsNull() {
            addCriterion("leaseImgs is null");
            return (Criteria) this;
        }

        public Criteria andLeaseimgsIsNotNull() {
            addCriterion("leaseImgs is not null");
            return (Criteria) this;
        }

        public Criteria andLeaseimgsEqualTo(String value) {
            addCriterion("leaseImgs =", value, "leaseimgs");
            return (Criteria) this;
        }

        public Criteria andLeaseimgsNotEqualTo(String value) {
            addCriterion("leaseImgs <>", value, "leaseimgs");
            return (Criteria) this;
        }

        public Criteria andLeaseimgsGreaterThan(String value) {
            addCriterion("leaseImgs >", value, "leaseimgs");
            return (Criteria) this;
        }

        public Criteria andLeaseimgsGreaterThanOrEqualTo(String value) {
            addCriterion("leaseImgs >=", value, "leaseimgs");
            return (Criteria) this;
        }

        public Criteria andLeaseimgsLessThan(String value) {
            addCriterion("leaseImgs <", value, "leaseimgs");
            return (Criteria) this;
        }

        public Criteria andLeaseimgsLessThanOrEqualTo(String value) {
            addCriterion("leaseImgs <=", value, "leaseimgs");
            return (Criteria) this;
        }

        public Criteria andLeaseimgsLike(String value) {
            addCriterion("leaseImgs like", value, "leaseimgs");
            return (Criteria) this;
        }

        public Criteria andLeaseimgsNotLike(String value) {
            addCriterion("leaseImgs not like", value, "leaseimgs");
            return (Criteria) this;
        }

        public Criteria andLeaseimgsIn(List<String> values) {
            addCriterion("leaseImgs in", values, "leaseimgs");
            return (Criteria) this;
        }

        public Criteria andLeaseimgsNotIn(List<String> values) {
            addCriterion("leaseImgs not in", values, "leaseimgs");
            return (Criteria) this;
        }

        public Criteria andLeaseimgsBetween(String value1, String value2) {
            addCriterion("leaseImgs between", value1, value2, "leaseimgs");
            return (Criteria) this;
        }

        public Criteria andLeaseimgsNotBetween(String value1, String value2) {
            addCriterion("leaseImgs not between", value1, value2, "leaseimgs");
            return (Criteria) this;
        }

        public Criteria andLeasenameIsNull() {
            addCriterion("leaseName is null");
            return (Criteria) this;
        }

        public Criteria andLeasenameIsNotNull() {
            addCriterion("leaseName is not null");
            return (Criteria) this;
        }

        public Criteria andLeasenameEqualTo(String value) {
            addCriterion("leaseName =", value, "leasename");
            return (Criteria) this;
        }

        public Criteria andLeasenameNotEqualTo(String value) {
            addCriterion("leaseName <>", value, "leasename");
            return (Criteria) this;
        }

        public Criteria andLeasenameGreaterThan(String value) {
            addCriterion("leaseName >", value, "leasename");
            return (Criteria) this;
        }

        public Criteria andLeasenameGreaterThanOrEqualTo(String value) {
            addCriterion("leaseName >=", value, "leasename");
            return (Criteria) this;
        }

        public Criteria andLeasenameLessThan(String value) {
            addCriterion("leaseName <", value, "leasename");
            return (Criteria) this;
        }

        public Criteria andLeasenameLessThanOrEqualTo(String value) {
            addCriterion("leaseName <=", value, "leasename");
            return (Criteria) this;
        }

        public Criteria andLeasenameLike(String value) {
            addCriterion("leaseName like", value, "leasename");
            return (Criteria) this;
        }

        public Criteria andLeasenameNotLike(String value) {
            addCriterion("leaseName not like", value, "leasename");
            return (Criteria) this;
        }

        public Criteria andLeasenameIn(List<String> values) {
            addCriterion("leaseName in", values, "leasename");
            return (Criteria) this;
        }

        public Criteria andLeasenameNotIn(List<String> values) {
            addCriterion("leaseName not in", values, "leasename");
            return (Criteria) this;
        }

        public Criteria andLeasenameBetween(String value1, String value2) {
            addCriterion("leaseName between", value1, value2, "leasename");
            return (Criteria) this;
        }

        public Criteria andLeasenameNotBetween(String value1, String value2) {
            addCriterion("leaseName not between", value1, value2, "leasename");
            return (Criteria) this;
        }

        public Criteria andLeasepriceIsNull() {
            addCriterion("leasePrice is null");
            return (Criteria) this;
        }

        public Criteria andLeasepriceIsNotNull() {
            addCriterion("leasePrice is not null");
            return (Criteria) this;
        }

        public Criteria andLeasepriceEqualTo(Float value) {
            addCriterion("leasePrice =", value, "leaseprice");
            return (Criteria) this;
        }

        public Criteria andLeasepriceNotEqualTo(Float value) {
            addCriterion("leasePrice <>", value, "leaseprice");
            return (Criteria) this;
        }

        public Criteria andLeasepriceGreaterThan(Float value) {
            addCriterion("leasePrice >", value, "leaseprice");
            return (Criteria) this;
        }

        public Criteria andLeasepriceGreaterThanOrEqualTo(Float value) {
            addCriterion("leasePrice >=", value, "leaseprice");
            return (Criteria) this;
        }

        public Criteria andLeasepriceLessThan(Float value) {
            addCriterion("leasePrice <", value, "leaseprice");
            return (Criteria) this;
        }

        public Criteria andLeasepriceLessThanOrEqualTo(Float value) {
            addCriterion("leasePrice <=", value, "leaseprice");
            return (Criteria) this;
        }

        public Criteria andLeasepriceIn(List<Float> values) {
            addCriterion("leasePrice in", values, "leaseprice");
            return (Criteria) this;
        }

        public Criteria andLeasepriceNotIn(List<Float> values) {
            addCriterion("leasePrice not in", values, "leaseprice");
            return (Criteria) this;
        }

        public Criteria andLeasepriceBetween(Float value1, Float value2) {
            addCriterion("leasePrice between", value1, value2, "leaseprice");
            return (Criteria) this;
        }

        public Criteria andLeasepriceNotBetween(Float value1, Float value2) {
            addCriterion("leasePrice not between", value1, value2, "leaseprice");
            return (Criteria) this;
        }

        public Criteria andLeasephoneIsNull() {
            addCriterion("leasePhone is null");
            return (Criteria) this;
        }

        public Criteria andLeasephoneIsNotNull() {
            addCriterion("leasePhone is not null");
            return (Criteria) this;
        }

        public Criteria andLeasephoneEqualTo(String value) {
            addCriterion("leasePhone =", value, "leasephone");
            return (Criteria) this;
        }

        public Criteria andLeasephoneNotEqualTo(String value) {
            addCriterion("leasePhone <>", value, "leasephone");
            return (Criteria) this;
        }

        public Criteria andLeasephoneGreaterThan(String value) {
            addCriterion("leasePhone >", value, "leasephone");
            return (Criteria) this;
        }

        public Criteria andLeasephoneGreaterThanOrEqualTo(String value) {
            addCriterion("leasePhone >=", value, "leasephone");
            return (Criteria) this;
        }

        public Criteria andLeasephoneLessThan(String value) {
            addCriterion("leasePhone <", value, "leasephone");
            return (Criteria) this;
        }

        public Criteria andLeasephoneLessThanOrEqualTo(String value) {
            addCriterion("leasePhone <=", value, "leasephone");
            return (Criteria) this;
        }

        public Criteria andLeasephoneLike(String value) {
            addCriterion("leasePhone like", value, "leasephone");
            return (Criteria) this;
        }

        public Criteria andLeasephoneNotLike(String value) {
            addCriterion("leasePhone not like", value, "leasephone");
            return (Criteria) this;
        }

        public Criteria andLeasephoneIn(List<String> values) {
            addCriterion("leasePhone in", values, "leasephone");
            return (Criteria) this;
        }

        public Criteria andLeasephoneNotIn(List<String> values) {
            addCriterion("leasePhone not in", values, "leasephone");
            return (Criteria) this;
        }

        public Criteria andLeasephoneBetween(String value1, String value2) {
            addCriterion("leasePhone between", value1, value2, "leasephone");
            return (Criteria) this;
        }

        public Criteria andLeasephoneNotBetween(String value1, String value2) {
            addCriterion("leasePhone not between", value1, value2, "leasephone");
            return (Criteria) this;
        }

        public Criteria andLeasesquareIsNull() {
            addCriterion("leaseSquare is null");
            return (Criteria) this;
        }

        public Criteria andLeasesquareIsNotNull() {
            addCriterion("leaseSquare is not null");
            return (Criteria) this;
        }

        public Criteria andLeasesquareEqualTo(String value) {
            addCriterion("leaseSquare =", value, "leasesquare");
            return (Criteria) this;
        }

        public Criteria andLeasesquareNotEqualTo(String value) {
            addCriterion("leaseSquare <>", value, "leasesquare");
            return (Criteria) this;
        }

        public Criteria andLeasesquareGreaterThan(String value) {
            addCriterion("leaseSquare >", value, "leasesquare");
            return (Criteria) this;
        }

        public Criteria andLeasesquareGreaterThanOrEqualTo(String value) {
            addCriterion("leaseSquare >=", value, "leasesquare");
            return (Criteria) this;
        }

        public Criteria andLeasesquareLessThan(String value) {
            addCriterion("leaseSquare <", value, "leasesquare");
            return (Criteria) this;
        }

        public Criteria andLeasesquareLessThanOrEqualTo(String value) {
            addCriterion("leaseSquare <=", value, "leasesquare");
            return (Criteria) this;
        }

        public Criteria andLeasesquareLike(String value) {
            addCriterion("leaseSquare like", value, "leasesquare");
            return (Criteria) this;
        }

        public Criteria andLeasesquareNotLike(String value) {
            addCriterion("leaseSquare not like", value, "leasesquare");
            return (Criteria) this;
        }

        public Criteria andLeasesquareIn(List<String> values) {
            addCriterion("leaseSquare in", values, "leasesquare");
            return (Criteria) this;
        }

        public Criteria andLeasesquareNotIn(List<String> values) {
            addCriterion("leaseSquare not in", values, "leasesquare");
            return (Criteria) this;
        }

        public Criteria andLeasesquareBetween(String value1, String value2) {
            addCriterion("leaseSquare between", value1, value2, "leasesquare");
            return (Criteria) this;
        }

        public Criteria andLeasesquareNotBetween(String value1, String value2) {
            addCriterion("leaseSquare not between", value1, value2, "leasesquare");
            return (Criteria) this;
        }

        public Criteria andLeaseaddressIsNull() {
            addCriterion("leaseAddress is null");
            return (Criteria) this;
        }

        public Criteria andLeaseaddressIsNotNull() {
            addCriterion("leaseAddress is not null");
            return (Criteria) this;
        }

        public Criteria andLeaseaddressEqualTo(String value) {
            addCriterion("leaseAddress =", value, "leaseaddress");
            return (Criteria) this;
        }

        public Criteria andLeaseaddressNotEqualTo(String value) {
            addCriterion("leaseAddress <>", value, "leaseaddress");
            return (Criteria) this;
        }

        public Criteria andLeaseaddressGreaterThan(String value) {
            addCriterion("leaseAddress >", value, "leaseaddress");
            return (Criteria) this;
        }

        public Criteria andLeaseaddressGreaterThanOrEqualTo(String value) {
            addCriterion("leaseAddress >=", value, "leaseaddress");
            return (Criteria) this;
        }

        public Criteria andLeaseaddressLessThan(String value) {
            addCriterion("leaseAddress <", value, "leaseaddress");
            return (Criteria) this;
        }

        public Criteria andLeaseaddressLessThanOrEqualTo(String value) {
            addCriterion("leaseAddress <=", value, "leaseaddress");
            return (Criteria) this;
        }

        public Criteria andLeaseaddressLike(String value) {
            addCriterion("leaseAddress like", value, "leaseaddress");
            return (Criteria) this;
        }

        public Criteria andLeaseaddressNotLike(String value) {
            addCriterion("leaseAddress not like", value, "leaseaddress");
            return (Criteria) this;
        }

        public Criteria andLeaseaddressIn(List<String> values) {
            addCriterion("leaseAddress in", values, "leaseaddress");
            return (Criteria) this;
        }

        public Criteria andLeaseaddressNotIn(List<String> values) {
            addCriterion("leaseAddress not in", values, "leaseaddress");
            return (Criteria) this;
        }

        public Criteria andLeaseaddressBetween(String value1, String value2) {
            addCriterion("leaseAddress between", value1, value2, "leaseaddress");
            return (Criteria) this;
        }

        public Criteria andLeaseaddressNotBetween(String value1, String value2) {
            addCriterion("leaseAddress not between", value1, value2, "leaseaddress");
            return (Criteria) this;
        }

        public Criteria andLeasehomeIsNull() {
            addCriterion("leaseHome is null");
            return (Criteria) this;
        }

        public Criteria andLeasehomeIsNotNull() {
            addCriterion("leaseHome is not null");
            return (Criteria) this;
        }

        public Criteria andLeasehomeEqualTo(String value) {
            addCriterion("leaseHome =", value, "leasehome");
            return (Criteria) this;
        }

        public Criteria andLeasehomeNotEqualTo(String value) {
            addCriterion("leaseHome <>", value, "leasehome");
            return (Criteria) this;
        }

        public Criteria andLeasehomeGreaterThan(String value) {
            addCriterion("leaseHome >", value, "leasehome");
            return (Criteria) this;
        }

        public Criteria andLeasehomeGreaterThanOrEqualTo(String value) {
            addCriterion("leaseHome >=", value, "leasehome");
            return (Criteria) this;
        }

        public Criteria andLeasehomeLessThan(String value) {
            addCriterion("leaseHome <", value, "leasehome");
            return (Criteria) this;
        }

        public Criteria andLeasehomeLessThanOrEqualTo(String value) {
            addCriterion("leaseHome <=", value, "leasehome");
            return (Criteria) this;
        }

        public Criteria andLeasehomeLike(String value) {
            addCriterion("leaseHome like", value, "leasehome");
            return (Criteria) this;
        }

        public Criteria andLeasehomeNotLike(String value) {
            addCriterion("leaseHome not like", value, "leasehome");
            return (Criteria) this;
        }

        public Criteria andLeasehomeIn(List<String> values) {
            addCriterion("leaseHome in", values, "leasehome");
            return (Criteria) this;
        }

        public Criteria andLeasehomeNotIn(List<String> values) {
            addCriterion("leaseHome not in", values, "leasehome");
            return (Criteria) this;
        }

        public Criteria andLeasehomeBetween(String value1, String value2) {
            addCriterion("leaseHome between", value1, value2, "leasehome");
            return (Criteria) this;
        }

        public Criteria andLeasehomeNotBetween(String value1, String value2) {
            addCriterion("leaseHome not between", value1, value2, "leasehome");
            return (Criteria) this;
        }

        public Criteria andLeaseimg1IsNull() {
            addCriterion("leaseImg1 is null");
            return (Criteria) this;
        }

        public Criteria andLeaseimg1IsNotNull() {
            addCriterion("leaseImg1 is not null");
            return (Criteria) this;
        }

        public Criteria andLeaseimg1EqualTo(String value) {
            addCriterion("leaseImg1 =", value, "leaseimg1");
            return (Criteria) this;
        }

        public Criteria andLeaseimg1NotEqualTo(String value) {
            addCriterion("leaseImg1 <>", value, "leaseimg1");
            return (Criteria) this;
        }

        public Criteria andLeaseimg1GreaterThan(String value) {
            addCriterion("leaseImg1 >", value, "leaseimg1");
            return (Criteria) this;
        }

        public Criteria andLeaseimg1GreaterThanOrEqualTo(String value) {
            addCriterion("leaseImg1 >=", value, "leaseimg1");
            return (Criteria) this;
        }

        public Criteria andLeaseimg1LessThan(String value) {
            addCriterion("leaseImg1 <", value, "leaseimg1");
            return (Criteria) this;
        }

        public Criteria andLeaseimg1LessThanOrEqualTo(String value) {
            addCriterion("leaseImg1 <=", value, "leaseimg1");
            return (Criteria) this;
        }

        public Criteria andLeaseimg1Like(String value) {
            addCriterion("leaseImg1 like", value, "leaseimg1");
            return (Criteria) this;
        }

        public Criteria andLeaseimg1NotLike(String value) {
            addCriterion("leaseImg1 not like", value, "leaseimg1");
            return (Criteria) this;
        }

        public Criteria andLeaseimg1In(List<String> values) {
            addCriterion("leaseImg1 in", values, "leaseimg1");
            return (Criteria) this;
        }

        public Criteria andLeaseimg1NotIn(List<String> values) {
            addCriterion("leaseImg1 not in", values, "leaseimg1");
            return (Criteria) this;
        }

        public Criteria andLeaseimg1Between(String value1, String value2) {
            addCriterion("leaseImg1 between", value1, value2, "leaseimg1");
            return (Criteria) this;
        }

        public Criteria andLeaseimg1NotBetween(String value1, String value2) {
            addCriterion("leaseImg1 not between", value1, value2, "leaseimg1");
            return (Criteria) this;
        }

        public Criteria andLeaseimg2IsNull() {
            addCriterion("leaseImg2 is null");
            return (Criteria) this;
        }

        public Criteria andLeaseimg2IsNotNull() {
            addCriterion("leaseImg2 is not null");
            return (Criteria) this;
        }

        public Criteria andLeaseimg2EqualTo(String value) {
            addCriterion("leaseImg2 =", value, "leaseimg2");
            return (Criteria) this;
        }

        public Criteria andLeaseimg2NotEqualTo(String value) {
            addCriterion("leaseImg2 <>", value, "leaseimg2");
            return (Criteria) this;
        }

        public Criteria andLeaseimg2GreaterThan(String value) {
            addCriterion("leaseImg2 >", value, "leaseimg2");
            return (Criteria) this;
        }

        public Criteria andLeaseimg2GreaterThanOrEqualTo(String value) {
            addCriterion("leaseImg2 >=", value, "leaseimg2");
            return (Criteria) this;
        }

        public Criteria andLeaseimg2LessThan(String value) {
            addCriterion("leaseImg2 <", value, "leaseimg2");
            return (Criteria) this;
        }

        public Criteria andLeaseimg2LessThanOrEqualTo(String value) {
            addCriterion("leaseImg2 <=", value, "leaseimg2");
            return (Criteria) this;
        }

        public Criteria andLeaseimg2Like(String value) {
            addCriterion("leaseImg2 like", value, "leaseimg2");
            return (Criteria) this;
        }

        public Criteria andLeaseimg2NotLike(String value) {
            addCriterion("leaseImg2 not like", value, "leaseimg2");
            return (Criteria) this;
        }

        public Criteria andLeaseimg2In(List<String> values) {
            addCriterion("leaseImg2 in", values, "leaseimg2");
            return (Criteria) this;
        }

        public Criteria andLeaseimg2NotIn(List<String> values) {
            addCriterion("leaseImg2 not in", values, "leaseimg2");
            return (Criteria) this;
        }

        public Criteria andLeaseimg2Between(String value1, String value2) {
            addCriterion("leaseImg2 between", value1, value2, "leaseimg2");
            return (Criteria) this;
        }

        public Criteria andLeaseimg2NotBetween(String value1, String value2) {
            addCriterion("leaseImg2 not between", value1, value2, "leaseimg2");
            return (Criteria) this;
        }

        public Criteria andLeaseimg3IsNull() {
            addCriterion("leaseImg3 is null");
            return (Criteria) this;
        }

        public Criteria andLeaseimg3IsNotNull() {
            addCriterion("leaseImg3 is not null");
            return (Criteria) this;
        }

        public Criteria andLeaseimg3EqualTo(String value) {
            addCriterion("leaseImg3 =", value, "leaseimg3");
            return (Criteria) this;
        }

        public Criteria andLeaseimg3NotEqualTo(String value) {
            addCriterion("leaseImg3 <>", value, "leaseimg3");
            return (Criteria) this;
        }

        public Criteria andLeaseimg3GreaterThan(String value) {
            addCriterion("leaseImg3 >", value, "leaseimg3");
            return (Criteria) this;
        }

        public Criteria andLeaseimg3GreaterThanOrEqualTo(String value) {
            addCriterion("leaseImg3 >=", value, "leaseimg3");
            return (Criteria) this;
        }

        public Criteria andLeaseimg3LessThan(String value) {
            addCriterion("leaseImg3 <", value, "leaseimg3");
            return (Criteria) this;
        }

        public Criteria andLeaseimg3LessThanOrEqualTo(String value) {
            addCriterion("leaseImg3 <=", value, "leaseimg3");
            return (Criteria) this;
        }

        public Criteria andLeaseimg3Like(String value) {
            addCriterion("leaseImg3 like", value, "leaseimg3");
            return (Criteria) this;
        }

        public Criteria andLeaseimg3NotLike(String value) {
            addCriterion("leaseImg3 not like", value, "leaseimg3");
            return (Criteria) this;
        }

        public Criteria andLeaseimg3In(List<String> values) {
            addCriterion("leaseImg3 in", values, "leaseimg3");
            return (Criteria) this;
        }

        public Criteria andLeaseimg3NotIn(List<String> values) {
            addCriterion("leaseImg3 not in", values, "leaseimg3");
            return (Criteria) this;
        }

        public Criteria andLeaseimg3Between(String value1, String value2) {
            addCriterion("leaseImg3 between", value1, value2, "leaseimg3");
            return (Criteria) this;
        }

        public Criteria andLeaseimg3NotBetween(String value1, String value2) {
            addCriterion("leaseImg3 not between", value1, value2, "leaseimg3");
            return (Criteria) this;
        }

        public Criteria andLeaseimg4IsNull() {
            addCriterion("leaseImg4 is null");
            return (Criteria) this;
        }

        public Criteria andLeaseimg4IsNotNull() {
            addCriterion("leaseImg4 is not null");
            return (Criteria) this;
        }

        public Criteria andLeaseimg4EqualTo(String value) {
            addCriterion("leaseImg4 =", value, "leaseimg4");
            return (Criteria) this;
        }

        public Criteria andLeaseimg4NotEqualTo(String value) {
            addCriterion("leaseImg4 <>", value, "leaseimg4");
            return (Criteria) this;
        }

        public Criteria andLeaseimg4GreaterThan(String value) {
            addCriterion("leaseImg4 >", value, "leaseimg4");
            return (Criteria) this;
        }

        public Criteria andLeaseimg4GreaterThanOrEqualTo(String value) {
            addCriterion("leaseImg4 >=", value, "leaseimg4");
            return (Criteria) this;
        }

        public Criteria andLeaseimg4LessThan(String value) {
            addCriterion("leaseImg4 <", value, "leaseimg4");
            return (Criteria) this;
        }

        public Criteria andLeaseimg4LessThanOrEqualTo(String value) {
            addCriterion("leaseImg4 <=", value, "leaseimg4");
            return (Criteria) this;
        }

        public Criteria andLeaseimg4Like(String value) {
            addCriterion("leaseImg4 like", value, "leaseimg4");
            return (Criteria) this;
        }

        public Criteria andLeaseimg4NotLike(String value) {
            addCriterion("leaseImg4 not like", value, "leaseimg4");
            return (Criteria) this;
        }

        public Criteria andLeaseimg4In(List<String> values) {
            addCriterion("leaseImg4 in", values, "leaseimg4");
            return (Criteria) this;
        }

        public Criteria andLeaseimg4NotIn(List<String> values) {
            addCriterion("leaseImg4 not in", values, "leaseimg4");
            return (Criteria) this;
        }

        public Criteria andLeaseimg4Between(String value1, String value2) {
            addCriterion("leaseImg4 between", value1, value2, "leaseimg4");
            return (Criteria) this;
        }

        public Criteria andLeaseimg4NotBetween(String value1, String value2) {
            addCriterion("leaseImg4 not between", value1, value2, "leaseimg4");
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