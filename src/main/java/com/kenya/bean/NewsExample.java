package com.kenya.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andNewsidIsNull() {
            addCriterion("newsId is null");
            return (Criteria) this;
        }

        public Criteria andNewsidIsNotNull() {
            addCriterion("newsId is not null");
            return (Criteria) this;
        }

        public Criteria andNewsidEqualTo(Integer value) {
            addCriterion("newsId =", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotEqualTo(Integer value) {
            addCriterion("newsId <>", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThan(Integer value) {
            addCriterion("newsId >", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("newsId >=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThan(Integer value) {
            addCriterion("newsId <", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThanOrEqualTo(Integer value) {
            addCriterion("newsId <=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidIn(List<Integer> values) {
            addCriterion("newsId in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotIn(List<Integer> values) {
            addCriterion("newsId not in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidBetween(Integer value1, Integer value2) {
            addCriterion("newsId between", value1, value2, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotBetween(Integer value1, Integer value2) {
            addCriterion("newsId not between", value1, value2, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewstitleIsNull() {
            addCriterion("newsTitle is null");
            return (Criteria) this;
        }

        public Criteria andNewstitleIsNotNull() {
            addCriterion("newsTitle is not null");
            return (Criteria) this;
        }

        public Criteria andNewstitleEqualTo(String value) {
            addCriterion("newsTitle =", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotEqualTo(String value) {
            addCriterion("newsTitle <>", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleGreaterThan(String value) {
            addCriterion("newsTitle >", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleGreaterThanOrEqualTo(String value) {
            addCriterion("newsTitle >=", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLessThan(String value) {
            addCriterion("newsTitle <", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLessThanOrEqualTo(String value) {
            addCriterion("newsTitle <=", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLike(String value) {
            addCriterion("newsTitle like", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotLike(String value) {
            addCriterion("newsTitle not like", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleIn(List<String> values) {
            addCriterion("newsTitle in", values, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotIn(List<String> values) {
            addCriterion("newsTitle not in", values, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleBetween(String value1, String value2) {
            addCriterion("newsTitle between", value1, value2, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotBetween(String value1, String value2) {
            addCriterion("newsTitle not between", value1, value2, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewsimg0IsNull() {
            addCriterion("newsImg0 is null");
            return (Criteria) this;
        }

        public Criteria andNewsimg0IsNotNull() {
            addCriterion("newsImg0 is not null");
            return (Criteria) this;
        }

        public Criteria andNewsimg0EqualTo(String value) {
            addCriterion("newsImg0 =", value, "newsimg0");
            return (Criteria) this;
        }

        public Criteria andNewsimg0NotEqualTo(String value) {
            addCriterion("newsImg0 <>", value, "newsimg0");
            return (Criteria) this;
        }

        public Criteria andNewsimg0GreaterThan(String value) {
            addCriterion("newsImg0 >", value, "newsimg0");
            return (Criteria) this;
        }

        public Criteria andNewsimg0GreaterThanOrEqualTo(String value) {
            addCriterion("newsImg0 >=", value, "newsimg0");
            return (Criteria) this;
        }

        public Criteria andNewsimg0LessThan(String value) {
            addCriterion("newsImg0 <", value, "newsimg0");
            return (Criteria) this;
        }

        public Criteria andNewsimg0LessThanOrEqualTo(String value) {
            addCriterion("newsImg0 <=", value, "newsimg0");
            return (Criteria) this;
        }

        public Criteria andNewsimg0Like(String value) {
            addCriterion("newsImg0 like", value, "newsimg0");
            return (Criteria) this;
        }

        public Criteria andNewsimg0NotLike(String value) {
            addCriterion("newsImg0 not like", value, "newsimg0");
            return (Criteria) this;
        }

        public Criteria andNewsimg0In(List<String> values) {
            addCriterion("newsImg0 in", values, "newsimg0");
            return (Criteria) this;
        }

        public Criteria andNewsimg0NotIn(List<String> values) {
            addCriterion("newsImg0 not in", values, "newsimg0");
            return (Criteria) this;
        }

        public Criteria andNewsimg0Between(String value1, String value2) {
            addCriterion("newsImg0 between", value1, value2, "newsimg0");
            return (Criteria) this;
        }

        public Criteria andNewsimg0NotBetween(String value1, String value2) {
            addCriterion("newsImg0 not between", value1, value2, "newsimg0");
            return (Criteria) this;
        }

        public Criteria andNewsimg1IsNull() {
            addCriterion("newsImg1 is null");
            return (Criteria) this;
        }

        public Criteria andNewsimg1IsNotNull() {
            addCriterion("newsImg1 is not null");
            return (Criteria) this;
        }

        public Criteria andNewsimg1EqualTo(String value) {
            addCriterion("newsImg1 =", value, "newsimg1");
            return (Criteria) this;
        }

        public Criteria andNewsimg1NotEqualTo(String value) {
            addCriterion("newsImg1 <>", value, "newsimg1");
            return (Criteria) this;
        }

        public Criteria andNewsimg1GreaterThan(String value) {
            addCriterion("newsImg1 >", value, "newsimg1");
            return (Criteria) this;
        }

        public Criteria andNewsimg1GreaterThanOrEqualTo(String value) {
            addCriterion("newsImg1 >=", value, "newsimg1");
            return (Criteria) this;
        }

        public Criteria andNewsimg1LessThan(String value) {
            addCriterion("newsImg1 <", value, "newsimg1");
            return (Criteria) this;
        }

        public Criteria andNewsimg1LessThanOrEqualTo(String value) {
            addCriterion("newsImg1 <=", value, "newsimg1");
            return (Criteria) this;
        }

        public Criteria andNewsimg1Like(String value) {
            addCriterion("newsImg1 like", value, "newsimg1");
            return (Criteria) this;
        }

        public Criteria andNewsimg1NotLike(String value) {
            addCriterion("newsImg1 not like", value, "newsimg1");
            return (Criteria) this;
        }

        public Criteria andNewsimg1In(List<String> values) {
            addCriterion("newsImg1 in", values, "newsimg1");
            return (Criteria) this;
        }

        public Criteria andNewsimg1NotIn(List<String> values) {
            addCriterion("newsImg1 not in", values, "newsimg1");
            return (Criteria) this;
        }

        public Criteria andNewsimg1Between(String value1, String value2) {
            addCriterion("newsImg1 between", value1, value2, "newsimg1");
            return (Criteria) this;
        }

        public Criteria andNewsimg1NotBetween(String value1, String value2) {
            addCriterion("newsImg1 not between", value1, value2, "newsimg1");
            return (Criteria) this;
        }

        public Criteria andNewsauthorIsNull() {
            addCriterion("NewsAuthor is null");
            return (Criteria) this;
        }

        public Criteria andNewsauthorIsNotNull() {
            addCriterion("NewsAuthor is not null");
            return (Criteria) this;
        }

        public Criteria andNewsauthorEqualTo(String value) {
            addCriterion("NewsAuthor =", value, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewsauthorNotEqualTo(String value) {
            addCriterion("NewsAuthor <>", value, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewsauthorGreaterThan(String value) {
            addCriterion("NewsAuthor >", value, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewsauthorGreaterThanOrEqualTo(String value) {
            addCriterion("NewsAuthor >=", value, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewsauthorLessThan(String value) {
            addCriterion("NewsAuthor <", value, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewsauthorLessThanOrEqualTo(String value) {
            addCriterion("NewsAuthor <=", value, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewsauthorLike(String value) {
            addCriterion("NewsAuthor like", value, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewsauthorNotLike(String value) {
            addCriterion("NewsAuthor not like", value, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewsauthorIn(List<String> values) {
            addCriterion("NewsAuthor in", values, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewsauthorNotIn(List<String> values) {
            addCriterion("NewsAuthor not in", values, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewsauthorBetween(String value1, String value2) {
            addCriterion("NewsAuthor between", value1, value2, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewsauthorNotBetween(String value1, String value2) {
            addCriterion("NewsAuthor not between", value1, value2, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewscreatetimeIsNull() {
            addCriterion("NewsCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andNewscreatetimeIsNotNull() {
            addCriterion("NewsCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andNewscreatetimeEqualTo(Date value) {
            addCriterion("NewsCreateTime =", value, "newscreatetime");
            return (Criteria) this;
        }

        public Criteria andNewscreatetimeNotEqualTo(Date value) {
            addCriterion("NewsCreateTime <>", value, "newscreatetime");
            return (Criteria) this;
        }

        public Criteria andNewscreatetimeGreaterThan(Date value) {
            addCriterion("NewsCreateTime >", value, "newscreatetime");
            return (Criteria) this;
        }

        public Criteria andNewscreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("NewsCreateTime >=", value, "newscreatetime");
            return (Criteria) this;
        }

        public Criteria andNewscreatetimeLessThan(Date value) {
            addCriterion("NewsCreateTime <", value, "newscreatetime");
            return (Criteria) this;
        }

        public Criteria andNewscreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("NewsCreateTime <=", value, "newscreatetime");
            return (Criteria) this;
        }

        public Criteria andNewscreatetimeIn(List<Date> values) {
            addCriterion("NewsCreateTime in", values, "newscreatetime");
            return (Criteria) this;
        }

        public Criteria andNewscreatetimeNotIn(List<Date> values) {
            addCriterion("NewsCreateTime not in", values, "newscreatetime");
            return (Criteria) this;
        }

        public Criteria andNewscreatetimeBetween(Date value1, Date value2) {
            addCriterion("NewsCreateTime between", value1, value2, "newscreatetime");
            return (Criteria) this;
        }

        public Criteria andNewscreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("NewsCreateTime not between", value1, value2, "newscreatetime");
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