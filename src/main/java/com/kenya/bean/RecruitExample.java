package com.kenya.bean;

import java.util.ArrayList;
import java.util.List;

public class RecruitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecruitExample() {
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

        public Criteria andRecruitidIsNull() {
            addCriterion("recruitId is null");
            return (Criteria) this;
        }

        public Criteria andRecruitidIsNotNull() {
            addCriterion("recruitId is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitidEqualTo(Integer value) {
            addCriterion("recruitId =", value, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidNotEqualTo(Integer value) {
            addCriterion("recruitId <>", value, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidGreaterThan(Integer value) {
            addCriterion("recruitId >", value, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("recruitId >=", value, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidLessThan(Integer value) {
            addCriterion("recruitId <", value, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidLessThanOrEqualTo(Integer value) {
            addCriterion("recruitId <=", value, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidIn(List<Integer> values) {
            addCriterion("recruitId in", values, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidNotIn(List<Integer> values) {
            addCriterion("recruitId not in", values, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidBetween(Integer value1, Integer value2) {
            addCriterion("recruitId between", value1, value2, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidNotBetween(Integer value1, Integer value2) {
            addCriterion("recruitId not between", value1, value2, "recruitid");
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

        public Criteria andCompanyoperatingIsNull() {
            addCriterion("companyOperating is null");
            return (Criteria) this;
        }

        public Criteria andCompanyoperatingIsNotNull() {
            addCriterion("companyOperating is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyoperatingEqualTo(String value) {
            addCriterion("companyOperating =", value, "companyoperating");
            return (Criteria) this;
        }

        public Criteria andCompanyoperatingNotEqualTo(String value) {
            addCriterion("companyOperating <>", value, "companyoperating");
            return (Criteria) this;
        }

        public Criteria andCompanyoperatingGreaterThan(String value) {
            addCriterion("companyOperating >", value, "companyoperating");
            return (Criteria) this;
        }

        public Criteria andCompanyoperatingGreaterThanOrEqualTo(String value) {
            addCriterion("companyOperating >=", value, "companyoperating");
            return (Criteria) this;
        }

        public Criteria andCompanyoperatingLessThan(String value) {
            addCriterion("companyOperating <", value, "companyoperating");
            return (Criteria) this;
        }

        public Criteria andCompanyoperatingLessThanOrEqualTo(String value) {
            addCriterion("companyOperating <=", value, "companyoperating");
            return (Criteria) this;
        }

        public Criteria andCompanyoperatingLike(String value) {
            addCriterion("companyOperating like", value, "companyoperating");
            return (Criteria) this;
        }

        public Criteria andCompanyoperatingNotLike(String value) {
            addCriterion("companyOperating not like", value, "companyoperating");
            return (Criteria) this;
        }

        public Criteria andCompanyoperatingIn(List<String> values) {
            addCriterion("companyOperating in", values, "companyoperating");
            return (Criteria) this;
        }

        public Criteria andCompanyoperatingNotIn(List<String> values) {
            addCriterion("companyOperating not in", values, "companyoperating");
            return (Criteria) this;
        }

        public Criteria andCompanyoperatingBetween(String value1, String value2) {
            addCriterion("companyOperating between", value1, value2, "companyoperating");
            return (Criteria) this;
        }

        public Criteria andCompanyoperatingNotBetween(String value1, String value2) {
            addCriterion("companyOperating not between", value1, value2, "companyoperating");
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

        public Criteria andCompanycallnumberIsNull() {
            addCriterion("companyCallNumber is null");
            return (Criteria) this;
        }

        public Criteria andCompanycallnumberIsNotNull() {
            addCriterion("companyCallNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCompanycallnumberEqualTo(String value) {
            addCriterion("companyCallNumber =", value, "companycallnumber");
            return (Criteria) this;
        }

        public Criteria andCompanycallnumberNotEqualTo(String value) {
            addCriterion("companyCallNumber <>", value, "companycallnumber");
            return (Criteria) this;
        }

        public Criteria andCompanycallnumberGreaterThan(String value) {
            addCriterion("companyCallNumber >", value, "companycallnumber");
            return (Criteria) this;
        }

        public Criteria andCompanycallnumberGreaterThanOrEqualTo(String value) {
            addCriterion("companyCallNumber >=", value, "companycallnumber");
            return (Criteria) this;
        }

        public Criteria andCompanycallnumberLessThan(String value) {
            addCriterion("companyCallNumber <", value, "companycallnumber");
            return (Criteria) this;
        }

        public Criteria andCompanycallnumberLessThanOrEqualTo(String value) {
            addCriterion("companyCallNumber <=", value, "companycallnumber");
            return (Criteria) this;
        }

        public Criteria andCompanycallnumberLike(String value) {
            addCriterion("companyCallNumber like", value, "companycallnumber");
            return (Criteria) this;
        }

        public Criteria andCompanycallnumberNotLike(String value) {
            addCriterion("companyCallNumber not like", value, "companycallnumber");
            return (Criteria) this;
        }

        public Criteria andCompanycallnumberIn(List<String> values) {
            addCriterion("companyCallNumber in", values, "companycallnumber");
            return (Criteria) this;
        }

        public Criteria andCompanycallnumberNotIn(List<String> values) {
            addCriterion("companyCallNumber not in", values, "companycallnumber");
            return (Criteria) this;
        }

        public Criteria andCompanycallnumberBetween(String value1, String value2) {
            addCriterion("companyCallNumber between", value1, value2, "companycallnumber");
            return (Criteria) this;
        }

        public Criteria andCompanycallnumberNotBetween(String value1, String value2) {
            addCriterion("companyCallNumber not between", value1, value2, "companycallnumber");
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