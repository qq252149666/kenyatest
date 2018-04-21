package com.kenya.bean;

import java.util.ArrayList;
import java.util.List;

public class CompantPictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompantPictureExample() {
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

        public Criteria andPictureidIsNull() {
            addCriterion("pictureId is null");
            return (Criteria) this;
        }

        public Criteria andPictureidIsNotNull() {
            addCriterion("pictureId is not null");
            return (Criteria) this;
        }

        public Criteria andPictureidEqualTo(Integer value) {
            addCriterion("pictureId =", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidNotEqualTo(Integer value) {
            addCriterion("pictureId <>", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidGreaterThan(Integer value) {
            addCriterion("pictureId >", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pictureId >=", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidLessThan(Integer value) {
            addCriterion("pictureId <", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidLessThanOrEqualTo(Integer value) {
            addCriterion("pictureId <=", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidIn(List<Integer> values) {
            addCriterion("pictureId in", values, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidNotIn(List<Integer> values) {
            addCriterion("pictureId not in", values, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidBetween(Integer value1, Integer value2) {
            addCriterion("pictureId between", value1, value2, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidNotBetween(Integer value1, Integer value2) {
            addCriterion("pictureId not between", value1, value2, "pictureid");
            return (Criteria) this;
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

        public Criteria andPicturepath0IsNull() {
            addCriterion("picturePath0 is null");
            return (Criteria) this;
        }

        public Criteria andPicturepath0IsNotNull() {
            addCriterion("picturePath0 is not null");
            return (Criteria) this;
        }

        public Criteria andPicturepath0EqualTo(String value) {
            addCriterion("picturePath0 =", value, "picturepath0");
            return (Criteria) this;
        }

        public Criteria andPicturepath0NotEqualTo(String value) {
            addCriterion("picturePath0 <>", value, "picturepath0");
            return (Criteria) this;
        }

        public Criteria andPicturepath0GreaterThan(String value) {
            addCriterion("picturePath0 >", value, "picturepath0");
            return (Criteria) this;
        }

        public Criteria andPicturepath0GreaterThanOrEqualTo(String value) {
            addCriterion("picturePath0 >=", value, "picturepath0");
            return (Criteria) this;
        }

        public Criteria andPicturepath0LessThan(String value) {
            addCriterion("picturePath0 <", value, "picturepath0");
            return (Criteria) this;
        }

        public Criteria andPicturepath0LessThanOrEqualTo(String value) {
            addCriterion("picturePath0 <=", value, "picturepath0");
            return (Criteria) this;
        }

        public Criteria andPicturepath0Like(String value) {
            addCriterion("picturePath0 like", value, "picturepath0");
            return (Criteria) this;
        }

        public Criteria andPicturepath0NotLike(String value) {
            addCriterion("picturePath0 not like", value, "picturepath0");
            return (Criteria) this;
        }

        public Criteria andPicturepath0In(List<String> values) {
            addCriterion("picturePath0 in", values, "picturepath0");
            return (Criteria) this;
        }

        public Criteria andPicturepath0NotIn(List<String> values) {
            addCriterion("picturePath0 not in", values, "picturepath0");
            return (Criteria) this;
        }

        public Criteria andPicturepath0Between(String value1, String value2) {
            addCriterion("picturePath0 between", value1, value2, "picturepath0");
            return (Criteria) this;
        }

        public Criteria andPicturepath0NotBetween(String value1, String value2) {
            addCriterion("picturePath0 not between", value1, value2, "picturepath0");
            return (Criteria) this;
        }

        public Criteria andPricturepath1IsNull() {
            addCriterion("pricturePath1 is null");
            return (Criteria) this;
        }

        public Criteria andPricturepath1IsNotNull() {
            addCriterion("pricturePath1 is not null");
            return (Criteria) this;
        }

        public Criteria andPricturepath1EqualTo(String value) {
            addCriterion("pricturePath1 =", value, "pricturepath1");
            return (Criteria) this;
        }

        public Criteria andPricturepath1NotEqualTo(String value) {
            addCriterion("pricturePath1 <>", value, "pricturepath1");
            return (Criteria) this;
        }

        public Criteria andPricturepath1GreaterThan(String value) {
            addCriterion("pricturePath1 >", value, "pricturepath1");
            return (Criteria) this;
        }

        public Criteria andPricturepath1GreaterThanOrEqualTo(String value) {
            addCriterion("pricturePath1 >=", value, "pricturepath1");
            return (Criteria) this;
        }

        public Criteria andPricturepath1LessThan(String value) {
            addCriterion("pricturePath1 <", value, "pricturepath1");
            return (Criteria) this;
        }

        public Criteria andPricturepath1LessThanOrEqualTo(String value) {
            addCriterion("pricturePath1 <=", value, "pricturepath1");
            return (Criteria) this;
        }

        public Criteria andPricturepath1Like(String value) {
            addCriterion("pricturePath1 like", value, "pricturepath1");
            return (Criteria) this;
        }

        public Criteria andPricturepath1NotLike(String value) {
            addCriterion("pricturePath1 not like", value, "pricturepath1");
            return (Criteria) this;
        }

        public Criteria andPricturepath1In(List<String> values) {
            addCriterion("pricturePath1 in", values, "pricturepath1");
            return (Criteria) this;
        }

        public Criteria andPricturepath1NotIn(List<String> values) {
            addCriterion("pricturePath1 not in", values, "pricturepath1");
            return (Criteria) this;
        }

        public Criteria andPricturepath1Between(String value1, String value2) {
            addCriterion("pricturePath1 between", value1, value2, "pricturepath1");
            return (Criteria) this;
        }

        public Criteria andPricturepath1NotBetween(String value1, String value2) {
            addCriterion("pricturePath1 not between", value1, value2, "pricturepath1");
            return (Criteria) this;
        }

        public Criteria andPricturepath2IsNull() {
            addCriterion("pricturePath2 is null");
            return (Criteria) this;
        }

        public Criteria andPricturepath2IsNotNull() {
            addCriterion("pricturePath2 is not null");
            return (Criteria) this;
        }

        public Criteria andPricturepath2EqualTo(String value) {
            addCriterion("pricturePath2 =", value, "pricturepath2");
            return (Criteria) this;
        }

        public Criteria andPricturepath2NotEqualTo(String value) {
            addCriterion("pricturePath2 <>", value, "pricturepath2");
            return (Criteria) this;
        }

        public Criteria andPricturepath2GreaterThan(String value) {
            addCriterion("pricturePath2 >", value, "pricturepath2");
            return (Criteria) this;
        }

        public Criteria andPricturepath2GreaterThanOrEqualTo(String value) {
            addCriterion("pricturePath2 >=", value, "pricturepath2");
            return (Criteria) this;
        }

        public Criteria andPricturepath2LessThan(String value) {
            addCriterion("pricturePath2 <", value, "pricturepath2");
            return (Criteria) this;
        }

        public Criteria andPricturepath2LessThanOrEqualTo(String value) {
            addCriterion("pricturePath2 <=", value, "pricturepath2");
            return (Criteria) this;
        }

        public Criteria andPricturepath2Like(String value) {
            addCriterion("pricturePath2 like", value, "pricturepath2");
            return (Criteria) this;
        }

        public Criteria andPricturepath2NotLike(String value) {
            addCriterion("pricturePath2 not like", value, "pricturepath2");
            return (Criteria) this;
        }

        public Criteria andPricturepath2In(List<String> values) {
            addCriterion("pricturePath2 in", values, "pricturepath2");
            return (Criteria) this;
        }

        public Criteria andPricturepath2NotIn(List<String> values) {
            addCriterion("pricturePath2 not in", values, "pricturepath2");
            return (Criteria) this;
        }

        public Criteria andPricturepath2Between(String value1, String value2) {
            addCriterion("pricturePath2 between", value1, value2, "pricturepath2");
            return (Criteria) this;
        }

        public Criteria andPricturepath2NotBetween(String value1, String value2) {
            addCriterion("pricturePath2 not between", value1, value2, "pricturepath2");
            return (Criteria) this;
        }

        public Criteria andPricturepath3IsNull() {
            addCriterion("pricturePath3 is null");
            return (Criteria) this;
        }

        public Criteria andPricturepath3IsNotNull() {
            addCriterion("pricturePath3 is not null");
            return (Criteria) this;
        }

        public Criteria andPricturepath3EqualTo(String value) {
            addCriterion("pricturePath3 =", value, "pricturepath3");
            return (Criteria) this;
        }

        public Criteria andPricturepath3NotEqualTo(String value) {
            addCriterion("pricturePath3 <>", value, "pricturepath3");
            return (Criteria) this;
        }

        public Criteria andPricturepath3GreaterThan(String value) {
            addCriterion("pricturePath3 >", value, "pricturepath3");
            return (Criteria) this;
        }

        public Criteria andPricturepath3GreaterThanOrEqualTo(String value) {
            addCriterion("pricturePath3 >=", value, "pricturepath3");
            return (Criteria) this;
        }

        public Criteria andPricturepath3LessThan(String value) {
            addCriterion("pricturePath3 <", value, "pricturepath3");
            return (Criteria) this;
        }

        public Criteria andPricturepath3LessThanOrEqualTo(String value) {
            addCriterion("pricturePath3 <=", value, "pricturepath3");
            return (Criteria) this;
        }

        public Criteria andPricturepath3Like(String value) {
            addCriterion("pricturePath3 like", value, "pricturepath3");
            return (Criteria) this;
        }

        public Criteria andPricturepath3NotLike(String value) {
            addCriterion("pricturePath3 not like", value, "pricturepath3");
            return (Criteria) this;
        }

        public Criteria andPricturepath3In(List<String> values) {
            addCriterion("pricturePath3 in", values, "pricturepath3");
            return (Criteria) this;
        }

        public Criteria andPricturepath3NotIn(List<String> values) {
            addCriterion("pricturePath3 not in", values, "pricturepath3");
            return (Criteria) this;
        }

        public Criteria andPricturepath3Between(String value1, String value2) {
            addCriterion("pricturePath3 between", value1, value2, "pricturepath3");
            return (Criteria) this;
        }

        public Criteria andPricturepath3NotBetween(String value1, String value2) {
            addCriterion("pricturePath3 not between", value1, value2, "pricturepath3");
            return (Criteria) this;
        }

        public Criteria andPricturepath4IsNull() {
            addCriterion("pricturePath4 is null");
            return (Criteria) this;
        }

        public Criteria andPricturepath4IsNotNull() {
            addCriterion("pricturePath4 is not null");
            return (Criteria) this;
        }

        public Criteria andPricturepath4EqualTo(String value) {
            addCriterion("pricturePath4 =", value, "pricturepath4");
            return (Criteria) this;
        }

        public Criteria andPricturepath4NotEqualTo(String value) {
            addCriterion("pricturePath4 <>", value, "pricturepath4");
            return (Criteria) this;
        }

        public Criteria andPricturepath4GreaterThan(String value) {
            addCriterion("pricturePath4 >", value, "pricturepath4");
            return (Criteria) this;
        }

        public Criteria andPricturepath4GreaterThanOrEqualTo(String value) {
            addCriterion("pricturePath4 >=", value, "pricturepath4");
            return (Criteria) this;
        }

        public Criteria andPricturepath4LessThan(String value) {
            addCriterion("pricturePath4 <", value, "pricturepath4");
            return (Criteria) this;
        }

        public Criteria andPricturepath4LessThanOrEqualTo(String value) {
            addCriterion("pricturePath4 <=", value, "pricturepath4");
            return (Criteria) this;
        }

        public Criteria andPricturepath4Like(String value) {
            addCriterion("pricturePath4 like", value, "pricturepath4");
            return (Criteria) this;
        }

        public Criteria andPricturepath4NotLike(String value) {
            addCriterion("pricturePath4 not like", value, "pricturepath4");
            return (Criteria) this;
        }

        public Criteria andPricturepath4In(List<String> values) {
            addCriterion("pricturePath4 in", values, "pricturepath4");
            return (Criteria) this;
        }

        public Criteria andPricturepath4NotIn(List<String> values) {
            addCriterion("pricturePath4 not in", values, "pricturepath4");
            return (Criteria) this;
        }

        public Criteria andPricturepath4Between(String value1, String value2) {
            addCriterion("pricturePath4 between", value1, value2, "pricturepath4");
            return (Criteria) this;
        }

        public Criteria andPricturepath4NotBetween(String value1, String value2) {
            addCriterion("pricturePath4 not between", value1, value2, "pricturepath4");
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