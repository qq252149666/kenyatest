package com.kenya.bean;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andCompanyidIsNull() {
            addCriterion("companyId is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("companyId is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Integer value) {
            addCriterion("companyId =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Integer value) {
            addCriterion("companyId <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Integer value) {
            addCriterion("companyId >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("companyId >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Integer value) {
            addCriterion("companyId <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("companyId <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Integer> values) {
            addCriterion("companyId in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Integer> values) {
            addCriterion("companyId not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Integer value1, Integer value2) {
            addCriterion("companyId between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("companyId not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("companyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanystationIsNull() {
            addCriterion("companyStation is null");
            return (Criteria) this;
        }

        public Criteria andCompanystationIsNotNull() {
            addCriterion("companyStation is not null");
            return (Criteria) this;
        }

        public Criteria andCompanystationEqualTo(String value) {
            addCriterion("companyStation =", value, "companystation");
            return (Criteria) this;
        }

        public Criteria andCompanystationNotEqualTo(String value) {
            addCriterion("companyStation <>", value, "companystation");
            return (Criteria) this;
        }

        public Criteria andCompanystationGreaterThan(String value) {
            addCriterion("companyStation >", value, "companystation");
            return (Criteria) this;
        }

        public Criteria andCompanystationGreaterThanOrEqualTo(String value) {
            addCriterion("companyStation >=", value, "companystation");
            return (Criteria) this;
        }

        public Criteria andCompanystationLessThan(String value) {
            addCriterion("companyStation <", value, "companystation");
            return (Criteria) this;
        }

        public Criteria andCompanystationLessThanOrEqualTo(String value) {
            addCriterion("companyStation <=", value, "companystation");
            return (Criteria) this;
        }

        public Criteria andCompanystationLike(String value) {
            addCriterion("companyStation like", value, "companystation");
            return (Criteria) this;
        }

        public Criteria andCompanystationNotLike(String value) {
            addCriterion("companyStation not like", value, "companystation");
            return (Criteria) this;
        }

        public Criteria andCompanystationIn(List<String> values) {
            addCriterion("companyStation in", values, "companystation");
            return (Criteria) this;
        }

        public Criteria andCompanystationNotIn(List<String> values) {
            addCriterion("companyStation not in", values, "companystation");
            return (Criteria) this;
        }

        public Criteria andCompanystationBetween(String value1, String value2) {
            addCriterion("companyStation between", value1, value2, "companystation");
            return (Criteria) this;
        }

        public Criteria andCompanystationNotBetween(String value1, String value2) {
            addCriterion("companyStation not between", value1, value2, "companystation");
            return (Criteria) this;
        }

        public Criteria andCompanystationsalaryIsNull() {
            addCriterion("companyStationSalary is null");
            return (Criteria) this;
        }

        public Criteria andCompanystationsalaryIsNotNull() {
            addCriterion("companyStationSalary is not null");
            return (Criteria) this;
        }

        public Criteria andCompanystationsalaryEqualTo(Double value) {
            addCriterion("companyStationSalary =", value, "companystationsalary");
            return (Criteria) this;
        }

        public Criteria andCompanystationsalaryNotEqualTo(Double value) {
            addCriterion("companyStationSalary <>", value, "companystationsalary");
            return (Criteria) this;
        }

        public Criteria andCompanystationsalaryGreaterThan(Double value) {
            addCriterion("companyStationSalary >", value, "companystationsalary");
            return (Criteria) this;
        }

        public Criteria andCompanystationsalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("companyStationSalary >=", value, "companystationsalary");
            return (Criteria) this;
        }

        public Criteria andCompanystationsalaryLessThan(Double value) {
            addCriterion("companyStationSalary <", value, "companystationsalary");
            return (Criteria) this;
        }

        public Criteria andCompanystationsalaryLessThanOrEqualTo(Double value) {
            addCriterion("companyStationSalary <=", value, "companystationsalary");
            return (Criteria) this;
        }

        public Criteria andCompanystationsalaryIn(List<Double> values) {
            addCriterion("companyStationSalary in", values, "companystationsalary");
            return (Criteria) this;
        }

        public Criteria andCompanystationsalaryNotIn(List<Double> values) {
            addCriterion("companyStationSalary not in", values, "companystationsalary");
            return (Criteria) this;
        }

        public Criteria andCompanystationsalaryBetween(Double value1, Double value2) {
            addCriterion("companyStationSalary between", value1, value2, "companystationsalary");
            return (Criteria) this;
        }

        public Criteria andCompanystationsalaryNotBetween(Double value1, Double value2) {
            addCriterion("companyStationSalary not between", value1, value2, "companystationsalary");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneIsNull() {
            addCriterion("companyPhone is null");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneIsNotNull() {
            addCriterion("companyPhone is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneEqualTo(String value) {
            addCriterion("companyPhone =", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneNotEqualTo(String value) {
            addCriterion("companyPhone <>", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneGreaterThan(String value) {
            addCriterion("companyPhone >", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneGreaterThanOrEqualTo(String value) {
            addCriterion("companyPhone >=", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneLessThan(String value) {
            addCriterion("companyPhone <", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneLessThanOrEqualTo(String value) {
            addCriterion("companyPhone <=", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneLike(String value) {
            addCriterion("companyPhone like", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneNotLike(String value) {
            addCriterion("companyPhone not like", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneIn(List<String> values) {
            addCriterion("companyPhone in", values, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneNotIn(List<String> values) {
            addCriterion("companyPhone not in", values, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneBetween(String value1, String value2) {
            addCriterion("companyPhone between", value1, value2, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneNotBetween(String value1, String value2) {
            addCriterion("companyPhone not between", value1, value2, "companyphone");
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

        public Criteria andCompanyimg0IsNull() {
            addCriterion("companyImg0 is null");
            return (Criteria) this;
        }

        public Criteria andCompanyimg0IsNotNull() {
            addCriterion("companyImg0 is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyimg0EqualTo(String value) {
            addCriterion("companyImg0 =", value, "companyimg0");
            return (Criteria) this;
        }

        public Criteria andCompanyimg0NotEqualTo(String value) {
            addCriterion("companyImg0 <>", value, "companyimg0");
            return (Criteria) this;
        }

        public Criteria andCompanyimg0GreaterThan(String value) {
            addCriterion("companyImg0 >", value, "companyimg0");
            return (Criteria) this;
        }

        public Criteria andCompanyimg0GreaterThanOrEqualTo(String value) {
            addCriterion("companyImg0 >=", value, "companyimg0");
            return (Criteria) this;
        }

        public Criteria andCompanyimg0LessThan(String value) {
            addCriterion("companyImg0 <", value, "companyimg0");
            return (Criteria) this;
        }

        public Criteria andCompanyimg0LessThanOrEqualTo(String value) {
            addCriterion("companyImg0 <=", value, "companyimg0");
            return (Criteria) this;
        }

        public Criteria andCompanyimg0Like(String value) {
            addCriterion("companyImg0 like", value, "companyimg0");
            return (Criteria) this;
        }

        public Criteria andCompanyimg0NotLike(String value) {
            addCriterion("companyImg0 not like", value, "companyimg0");
            return (Criteria) this;
        }

        public Criteria andCompanyimg0In(List<String> values) {
            addCriterion("companyImg0 in", values, "companyimg0");
            return (Criteria) this;
        }

        public Criteria andCompanyimg0NotIn(List<String> values) {
            addCriterion("companyImg0 not in", values, "companyimg0");
            return (Criteria) this;
        }

        public Criteria andCompanyimg0Between(String value1, String value2) {
            addCriterion("companyImg0 between", value1, value2, "companyimg0");
            return (Criteria) this;
        }

        public Criteria andCompanyimg0NotBetween(String value1, String value2) {
            addCriterion("companyImg0 not between", value1, value2, "companyimg0");
            return (Criteria) this;
        }

        public Criteria andCompanyimg1IsNull() {
            addCriterion("companyImg1 is null");
            return (Criteria) this;
        }

        public Criteria andCompanyimg1IsNotNull() {
            addCriterion("companyImg1 is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyimg1EqualTo(String value) {
            addCriterion("companyImg1 =", value, "companyimg1");
            return (Criteria) this;
        }

        public Criteria andCompanyimg1NotEqualTo(String value) {
            addCriterion("companyImg1 <>", value, "companyimg1");
            return (Criteria) this;
        }

        public Criteria andCompanyimg1GreaterThan(String value) {
            addCriterion("companyImg1 >", value, "companyimg1");
            return (Criteria) this;
        }

        public Criteria andCompanyimg1GreaterThanOrEqualTo(String value) {
            addCriterion("companyImg1 >=", value, "companyimg1");
            return (Criteria) this;
        }

        public Criteria andCompanyimg1LessThan(String value) {
            addCriterion("companyImg1 <", value, "companyimg1");
            return (Criteria) this;
        }

        public Criteria andCompanyimg1LessThanOrEqualTo(String value) {
            addCriterion("companyImg1 <=", value, "companyimg1");
            return (Criteria) this;
        }

        public Criteria andCompanyimg1Like(String value) {
            addCriterion("companyImg1 like", value, "companyimg1");
            return (Criteria) this;
        }

        public Criteria andCompanyimg1NotLike(String value) {
            addCriterion("companyImg1 not like", value, "companyimg1");
            return (Criteria) this;
        }

        public Criteria andCompanyimg1In(List<String> values) {
            addCriterion("companyImg1 in", values, "companyimg1");
            return (Criteria) this;
        }

        public Criteria andCompanyimg1NotIn(List<String> values) {
            addCriterion("companyImg1 not in", values, "companyimg1");
            return (Criteria) this;
        }

        public Criteria andCompanyimg1Between(String value1, String value2) {
            addCriterion("companyImg1 between", value1, value2, "companyimg1");
            return (Criteria) this;
        }

        public Criteria andCompanyimg1NotBetween(String value1, String value2) {
            addCriterion("companyImg1 not between", value1, value2, "companyimg1");
            return (Criteria) this;
        }

        public Criteria andCompanyimg2IsNull() {
            addCriterion("companyImg2 is null");
            return (Criteria) this;
        }

        public Criteria andCompanyimg2IsNotNull() {
            addCriterion("companyImg2 is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyimg2EqualTo(String value) {
            addCriterion("companyImg2 =", value, "companyimg2");
            return (Criteria) this;
        }

        public Criteria andCompanyimg2NotEqualTo(String value) {
            addCriterion("companyImg2 <>", value, "companyimg2");
            return (Criteria) this;
        }

        public Criteria andCompanyimg2GreaterThan(String value) {
            addCriterion("companyImg2 >", value, "companyimg2");
            return (Criteria) this;
        }

        public Criteria andCompanyimg2GreaterThanOrEqualTo(String value) {
            addCriterion("companyImg2 >=", value, "companyimg2");
            return (Criteria) this;
        }

        public Criteria andCompanyimg2LessThan(String value) {
            addCriterion("companyImg2 <", value, "companyimg2");
            return (Criteria) this;
        }

        public Criteria andCompanyimg2LessThanOrEqualTo(String value) {
            addCriterion("companyImg2 <=", value, "companyimg2");
            return (Criteria) this;
        }

        public Criteria andCompanyimg2Like(String value) {
            addCriterion("companyImg2 like", value, "companyimg2");
            return (Criteria) this;
        }

        public Criteria andCompanyimg2NotLike(String value) {
            addCriterion("companyImg2 not like", value, "companyimg2");
            return (Criteria) this;
        }

        public Criteria andCompanyimg2In(List<String> values) {
            addCriterion("companyImg2 in", values, "companyimg2");
            return (Criteria) this;
        }

        public Criteria andCompanyimg2NotIn(List<String> values) {
            addCriterion("companyImg2 not in", values, "companyimg2");
            return (Criteria) this;
        }

        public Criteria andCompanyimg2Between(String value1, String value2) {
            addCriterion("companyImg2 between", value1, value2, "companyimg2");
            return (Criteria) this;
        }

        public Criteria andCompanyimg2NotBetween(String value1, String value2) {
            addCriterion("companyImg2 not between", value1, value2, "companyimg2");
            return (Criteria) this;
        }

        public Criteria andCompanyimg3IsNull() {
            addCriterion("companyImg3 is null");
            return (Criteria) this;
        }

        public Criteria andCompanyimg3IsNotNull() {
            addCriterion("companyImg3 is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyimg3EqualTo(String value) {
            addCriterion("companyImg3 =", value, "companyimg3");
            return (Criteria) this;
        }

        public Criteria andCompanyimg3NotEqualTo(String value) {
            addCriterion("companyImg3 <>", value, "companyimg3");
            return (Criteria) this;
        }

        public Criteria andCompanyimg3GreaterThan(String value) {
            addCriterion("companyImg3 >", value, "companyimg3");
            return (Criteria) this;
        }

        public Criteria andCompanyimg3GreaterThanOrEqualTo(String value) {
            addCriterion("companyImg3 >=", value, "companyimg3");
            return (Criteria) this;
        }

        public Criteria andCompanyimg3LessThan(String value) {
            addCriterion("companyImg3 <", value, "companyimg3");
            return (Criteria) this;
        }

        public Criteria andCompanyimg3LessThanOrEqualTo(String value) {
            addCriterion("companyImg3 <=", value, "companyimg3");
            return (Criteria) this;
        }

        public Criteria andCompanyimg3Like(String value) {
            addCriterion("companyImg3 like", value, "companyimg3");
            return (Criteria) this;
        }

        public Criteria andCompanyimg3NotLike(String value) {
            addCriterion("companyImg3 not like", value, "companyimg3");
            return (Criteria) this;
        }

        public Criteria andCompanyimg3In(List<String> values) {
            addCriterion("companyImg3 in", values, "companyimg3");
            return (Criteria) this;
        }

        public Criteria andCompanyimg3NotIn(List<String> values) {
            addCriterion("companyImg3 not in", values, "companyimg3");
            return (Criteria) this;
        }

        public Criteria andCompanyimg3Between(String value1, String value2) {
            addCriterion("companyImg3 between", value1, value2, "companyimg3");
            return (Criteria) this;
        }

        public Criteria andCompanyimg3NotBetween(String value1, String value2) {
            addCriterion("companyImg3 not between", value1, value2, "companyimg3");
            return (Criteria) this;
        }

        public Criteria andCompanyimg4IsNull() {
            addCriterion("companyImg4 is null");
            return (Criteria) this;
        }

        public Criteria andCompanyimg4IsNotNull() {
            addCriterion("companyImg4 is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyimg4EqualTo(String value) {
            addCriterion("companyImg4 =", value, "companyimg4");
            return (Criteria) this;
        }

        public Criteria andCompanyimg4NotEqualTo(String value) {
            addCriterion("companyImg4 <>", value, "companyimg4");
            return (Criteria) this;
        }

        public Criteria andCompanyimg4GreaterThan(String value) {
            addCriterion("companyImg4 >", value, "companyimg4");
            return (Criteria) this;
        }

        public Criteria andCompanyimg4GreaterThanOrEqualTo(String value) {
            addCriterion("companyImg4 >=", value, "companyimg4");
            return (Criteria) this;
        }

        public Criteria andCompanyimg4LessThan(String value) {
            addCriterion("companyImg4 <", value, "companyimg4");
            return (Criteria) this;
        }

        public Criteria andCompanyimg4LessThanOrEqualTo(String value) {
            addCriterion("companyImg4 <=", value, "companyimg4");
            return (Criteria) this;
        }

        public Criteria andCompanyimg4Like(String value) {
            addCriterion("companyImg4 like", value, "companyimg4");
            return (Criteria) this;
        }

        public Criteria andCompanyimg4NotLike(String value) {
            addCriterion("companyImg4 not like", value, "companyimg4");
            return (Criteria) this;
        }

        public Criteria andCompanyimg4In(List<String> values) {
            addCriterion("companyImg4 in", values, "companyimg4");
            return (Criteria) this;
        }

        public Criteria andCompanyimg4NotIn(List<String> values) {
            addCriterion("companyImg4 not in", values, "companyimg4");
            return (Criteria) this;
        }

        public Criteria andCompanyimg4Between(String value1, String value2) {
            addCriterion("companyImg4 between", value1, value2, "companyimg4");
            return (Criteria) this;
        }

        public Criteria andCompanyimg4NotBetween(String value1, String value2) {
            addCriterion("companyImg4 not between", value1, value2, "companyimg4");
            return (Criteria) this;
        }

        public Criteria andCompanyimg5IsNull() {
            addCriterion("companyImg5 is null");
            return (Criteria) this;
        }

        public Criteria andCompanyimg5IsNotNull() {
            addCriterion("companyImg5 is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyimg5EqualTo(String value) {
            addCriterion("companyImg5 =", value, "companyimg5");
            return (Criteria) this;
        }

        public Criteria andCompanyimg5NotEqualTo(String value) {
            addCriterion("companyImg5 <>", value, "companyimg5");
            return (Criteria) this;
        }

        public Criteria andCompanyimg5GreaterThan(String value) {
            addCriterion("companyImg5 >", value, "companyimg5");
            return (Criteria) this;
        }

        public Criteria andCompanyimg5GreaterThanOrEqualTo(String value) {
            addCriterion("companyImg5 >=", value, "companyimg5");
            return (Criteria) this;
        }

        public Criteria andCompanyimg5LessThan(String value) {
            addCriterion("companyImg5 <", value, "companyimg5");
            return (Criteria) this;
        }

        public Criteria andCompanyimg5LessThanOrEqualTo(String value) {
            addCriterion("companyImg5 <=", value, "companyimg5");
            return (Criteria) this;
        }

        public Criteria andCompanyimg5Like(String value) {
            addCriterion("companyImg5 like", value, "companyimg5");
            return (Criteria) this;
        }

        public Criteria andCompanyimg5NotLike(String value) {
            addCriterion("companyImg5 not like", value, "companyimg5");
            return (Criteria) this;
        }

        public Criteria andCompanyimg5In(List<String> values) {
            addCriterion("companyImg5 in", values, "companyimg5");
            return (Criteria) this;
        }

        public Criteria andCompanyimg5NotIn(List<String> values) {
            addCriterion("companyImg5 not in", values, "companyimg5");
            return (Criteria) this;
        }

        public Criteria andCompanyimg5Between(String value1, String value2) {
            addCriterion("companyImg5 between", value1, value2, "companyimg5");
            return (Criteria) this;
        }

        public Criteria andCompanyimg5NotBetween(String value1, String value2) {
            addCriterion("companyImg5 not between", value1, value2, "companyimg5");
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