package com.kenya.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class JobSeekerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobSeekerExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andJobseekeridIsNull() {
            addCriterion("JobSeekerId is null");
            return (Criteria) this;
        }

        public Criteria andJobseekeridIsNotNull() {
            addCriterion("JobSeekerId is not null");
            return (Criteria) this;
        }

        public Criteria andJobseekeridEqualTo(Integer value) {
            addCriterion("JobSeekerId =", value, "jobseekerid");
            return (Criteria) this;
        }

        public Criteria andJobseekeridNotEqualTo(Integer value) {
            addCriterion("JobSeekerId <>", value, "jobseekerid");
            return (Criteria) this;
        }

        public Criteria andJobseekeridGreaterThan(Integer value) {
            addCriterion("JobSeekerId >", value, "jobseekerid");
            return (Criteria) this;
        }

        public Criteria andJobseekeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("JobSeekerId >=", value, "jobseekerid");
            return (Criteria) this;
        }

        public Criteria andJobseekeridLessThan(Integer value) {
            addCriterion("JobSeekerId <", value, "jobseekerid");
            return (Criteria) this;
        }

        public Criteria andJobseekeridLessThanOrEqualTo(Integer value) {
            addCriterion("JobSeekerId <=", value, "jobseekerid");
            return (Criteria) this;
        }

        public Criteria andJobseekeridIn(List<Integer> values) {
            addCriterion("JobSeekerId in", values, "jobseekerid");
            return (Criteria) this;
        }

        public Criteria andJobseekeridNotIn(List<Integer> values) {
            addCriterion("JobSeekerId not in", values, "jobseekerid");
            return (Criteria) this;
        }

        public Criteria andJobseekeridBetween(Integer value1, Integer value2) {
            addCriterion("JobSeekerId between", value1, value2, "jobseekerid");
            return (Criteria) this;
        }

        public Criteria andJobseekeridNotBetween(Integer value1, Integer value2) {
            addCriterion("JobSeekerId not between", value1, value2, "jobseekerid");
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

        public Criteria andSnameIsNull() {
            addCriterion("sName is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sName is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sName =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sName <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sName >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sName >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sName <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sName <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sName like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sName not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sName in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sName not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sName between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sName not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSheadportraitIsNull() {
            addCriterion("sHeadPortrait is null");
            return (Criteria) this;
        }

        public Criteria andSheadportraitIsNotNull() {
            addCriterion("sHeadPortrait is not null");
            return (Criteria) this;
        }

        public Criteria andSheadportraitEqualTo(String value) {
            addCriterion("sHeadPortrait =", value, "sheadportrait");
            return (Criteria) this;
        }

        public Criteria andSheadportraitNotEqualTo(String value) {
            addCriterion("sHeadPortrait <>", value, "sheadportrait");
            return (Criteria) this;
        }

        public Criteria andSheadportraitGreaterThan(String value) {
            addCriterion("sHeadPortrait >", value, "sheadportrait");
            return (Criteria) this;
        }

        public Criteria andSheadportraitGreaterThanOrEqualTo(String value) {
            addCriterion("sHeadPortrait >=", value, "sheadportrait");
            return (Criteria) this;
        }

        public Criteria andSheadportraitLessThan(String value) {
            addCriterion("sHeadPortrait <", value, "sheadportrait");
            return (Criteria) this;
        }

        public Criteria andSheadportraitLessThanOrEqualTo(String value) {
            addCriterion("sHeadPortrait <=", value, "sheadportrait");
            return (Criteria) this;
        }

        public Criteria andSheadportraitLike(String value) {
            addCriterion("sHeadPortrait like", value, "sheadportrait");
            return (Criteria) this;
        }

        public Criteria andSheadportraitNotLike(String value) {
            addCriterion("sHeadPortrait not like", value, "sheadportrait");
            return (Criteria) this;
        }

        public Criteria andSheadportraitIn(List<String> values) {
            addCriterion("sHeadPortrait in", values, "sheadportrait");
            return (Criteria) this;
        }

        public Criteria andSheadportraitNotIn(List<String> values) {
            addCriterion("sHeadPortrait not in", values, "sheadportrait");
            return (Criteria) this;
        }

        public Criteria andSheadportraitBetween(String value1, String value2) {
            addCriterion("sHeadPortrait between", value1, value2, "sheadportrait");
            return (Criteria) this;
        }

        public Criteria andSheadportraitNotBetween(String value1, String value2) {
            addCriterion("sHeadPortrait not between", value1, value2, "sheadportrait");
            return (Criteria) this;
        }

        public Criteria andSsexIsNull() {
            addCriterion("sSex is null");
            return (Criteria) this;
        }

        public Criteria andSsexIsNotNull() {
            addCriterion("sSex is not null");
            return (Criteria) this;
        }

        public Criteria andSsexEqualTo(Integer value) {
            addCriterion("sSex =", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotEqualTo(Integer value) {
            addCriterion("sSex <>", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThan(Integer value) {
            addCriterion("sSex >", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sSex >=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThan(Integer value) {
            addCriterion("sSex <", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThanOrEqualTo(Integer value) {
            addCriterion("sSex <=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexIn(List<Integer> values) {
            addCriterion("sSex in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotIn(List<Integer> values) {
            addCriterion("sSex not in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexBetween(Integer value1, Integer value2) {
            addCriterion("sSex between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotBetween(Integer value1, Integer value2) {
            addCriterion("sSex not between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSjobwantIsNull() {
            addCriterion("sJobWant is null");
            return (Criteria) this;
        }

        public Criteria andSjobwantIsNotNull() {
            addCriterion("sJobWant is not null");
            return (Criteria) this;
        }

        public Criteria andSjobwantEqualTo(String value) {
            addCriterion("sJobWant =", value, "sjobwant");
            return (Criteria) this;
        }

        public Criteria andSjobwantNotEqualTo(String value) {
            addCriterion("sJobWant <>", value, "sjobwant");
            return (Criteria) this;
        }

        public Criteria andSjobwantGreaterThan(String value) {
            addCriterion("sJobWant >", value, "sjobwant");
            return (Criteria) this;
        }

        public Criteria andSjobwantGreaterThanOrEqualTo(String value) {
            addCriterion("sJobWant >=", value, "sjobwant");
            return (Criteria) this;
        }

        public Criteria andSjobwantLessThan(String value) {
            addCriterion("sJobWant <", value, "sjobwant");
            return (Criteria) this;
        }

        public Criteria andSjobwantLessThanOrEqualTo(String value) {
            addCriterion("sJobWant <=", value, "sjobwant");
            return (Criteria) this;
        }

        public Criteria andSjobwantLike(String value) {
            addCriterion("sJobWant like", value, "sjobwant");
            return (Criteria) this;
        }

        public Criteria andSjobwantNotLike(String value) {
            addCriterion("sJobWant not like", value, "sjobwant");
            return (Criteria) this;
        }

        public Criteria andSjobwantIn(List<String> values) {
            addCriterion("sJobWant in", values, "sjobwant");
            return (Criteria) this;
        }

        public Criteria andSjobwantNotIn(List<String> values) {
            addCriterion("sJobWant not in", values, "sjobwant");
            return (Criteria) this;
        }

        public Criteria andSjobwantBetween(String value1, String value2) {
            addCriterion("sJobWant between", value1, value2, "sjobwant");
            return (Criteria) this;
        }

        public Criteria andSjobwantNotBetween(String value1, String value2) {
            addCriterion("sJobWant not between", value1, value2, "sjobwant");
            return (Criteria) this;
        }

        public Criteria andScallnumIsNull() {
            addCriterion("sCallNum is null");
            return (Criteria) this;
        }

        public Criteria andScallnumIsNotNull() {
            addCriterion("sCallNum is not null");
            return (Criteria) this;
        }

        public Criteria andScallnumEqualTo(String value) {
            addCriterion("sCallNum =", value, "scallnum");
            return (Criteria) this;
        }

        public Criteria andScallnumNotEqualTo(String value) {
            addCriterion("sCallNum <>", value, "scallnum");
            return (Criteria) this;
        }

        public Criteria andScallnumGreaterThan(String value) {
            addCriterion("sCallNum >", value, "scallnum");
            return (Criteria) this;
        }

        public Criteria andScallnumGreaterThanOrEqualTo(String value) {
            addCriterion("sCallNum >=", value, "scallnum");
            return (Criteria) this;
        }

        public Criteria andScallnumLessThan(String value) {
            addCriterion("sCallNum <", value, "scallnum");
            return (Criteria) this;
        }

        public Criteria andScallnumLessThanOrEqualTo(String value) {
            addCriterion("sCallNum <=", value, "scallnum");
            return (Criteria) this;
        }

        public Criteria andScallnumLike(String value) {
            addCriterion("sCallNum like", value, "scallnum");
            return (Criteria) this;
        }

        public Criteria andScallnumNotLike(String value) {
            addCriterion("sCallNum not like", value, "scallnum");
            return (Criteria) this;
        }

        public Criteria andScallnumIn(List<String> values) {
            addCriterion("sCallNum in", values, "scallnum");
            return (Criteria) this;
        }

        public Criteria andScallnumNotIn(List<String> values) {
            addCriterion("sCallNum not in", values, "scallnum");
            return (Criteria) this;
        }

        public Criteria andScallnumBetween(String value1, String value2) {
            addCriterion("sCallNum between", value1, value2, "scallnum");
            return (Criteria) this;
        }

        public Criteria andScallnumNotBetween(String value1, String value2) {
            addCriterion("sCallNum not between", value1, value2, "scallnum");
            return (Criteria) this;
        }

        public Criteria andSbirthdayIsNull() {
            addCriterion("sBirthday is null");
            return (Criteria) this;
        }

        public Criteria andSbirthdayIsNotNull() {
            addCriterion("sBirthday is not null");
            return (Criteria) this;
        }

        public Criteria andSbirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("sBirthday =", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("sBirthday <>", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("sBirthday >", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sBirthday >=", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayLessThan(Date value) {
            addCriterionForJDBCDate("sBirthday <", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sBirthday <=", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("sBirthday in", values, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("sBirthday not in", values, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sBirthday between", value1, value2, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sBirthday not between", value1, value2, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andJobtimeIsNull() {
            addCriterion("jobTime is null");
            return (Criteria) this;
        }

        public Criteria andJobtimeIsNotNull() {
            addCriterion("jobTime is not null");
            return (Criteria) this;
        }

        public Criteria andJobtimeEqualTo(Date value) {
            addCriterionForJDBCDate("jobTime =", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("jobTime <>", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("jobTime >", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jobTime >=", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeLessThan(Date value) {
            addCriterionForJDBCDate("jobTime <", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jobTime <=", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeIn(List<Date> values) {
            addCriterionForJDBCDate("jobTime in", values, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("jobTime not in", values, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jobTime between", value1, value2, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jobTime not between", value1, value2, "jobtime");
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