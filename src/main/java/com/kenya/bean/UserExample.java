package com.kenya.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPswIsNull() {
            addCriterion("user_psw is null");
            return (Criteria) this;
        }

        public Criteria andUserPswIsNotNull() {
            addCriterion("user_psw is not null");
            return (Criteria) this;
        }

        public Criteria andUserPswEqualTo(String value) {
            addCriterion("user_psw =", value, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserPswNotEqualTo(String value) {
            addCriterion("user_psw <>", value, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserPswGreaterThan(String value) {
            addCriterion("user_psw >", value, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserPswGreaterThanOrEqualTo(String value) {
            addCriterion("user_psw >=", value, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserPswLessThan(String value) {
            addCriterion("user_psw <", value, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserPswLessThanOrEqualTo(String value) {
            addCriterion("user_psw <=", value, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserPswLike(String value) {
            addCriterion("user_psw like", value, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserPswNotLike(String value) {
            addCriterion("user_psw not like", value, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserPswIn(List<String> values) {
            addCriterion("user_psw in", values, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserPswNotIn(List<String> values) {
            addCriterion("user_psw not in", values, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserPswBetween(String value1, String value2) {
            addCriterion("user_psw between", value1, value2, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserPswNotBetween(String value1, String value2) {
            addCriterion("user_psw not between", value1, value2, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(Integer value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(Integer value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(Integer value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(Integer value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(Integer value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<Integer> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<Integer> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(Integer value1, Integer value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(Integer value1, Integer value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberIsNull() {
            addCriterion("user_phoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberIsNotNull() {
            addCriterion("user_phoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberEqualTo(String value) {
            addCriterion("user_phoneNumber =", value, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberNotEqualTo(String value) {
            addCriterion("user_phoneNumber <>", value, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberGreaterThan(String value) {
            addCriterion("user_phoneNumber >", value, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("user_phoneNumber >=", value, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberLessThan(String value) {
            addCriterion("user_phoneNumber <", value, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("user_phoneNumber <=", value, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberLike(String value) {
            addCriterion("user_phoneNumber like", value, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberNotLike(String value) {
            addCriterion("user_phoneNumber not like", value, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberIn(List<String> values) {
            addCriterion("user_phoneNumber in", values, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberNotIn(List<String> values) {
            addCriterion("user_phoneNumber not in", values, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberBetween(String value1, String value2) {
            addCriterion("user_phoneNumber between", value1, value2, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberNotBetween(String value1, String value2) {
            addCriterion("user_phoneNumber not between", value1, value2, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserHavecarIsNull() {
            addCriterion("user_haveCar is null");
            return (Criteria) this;
        }

        public Criteria andUserHavecarIsNotNull() {
            addCriterion("user_haveCar is not null");
            return (Criteria) this;
        }

        public Criteria andUserHavecarEqualTo(Integer value) {
            addCriterion("user_haveCar =", value, "userHavecar");
            return (Criteria) this;
        }

        public Criteria andUserHavecarNotEqualTo(Integer value) {
            addCriterion("user_haveCar <>", value, "userHavecar");
            return (Criteria) this;
        }

        public Criteria andUserHavecarGreaterThan(Integer value) {
            addCriterion("user_haveCar >", value, "userHavecar");
            return (Criteria) this;
        }

        public Criteria andUserHavecarGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_haveCar >=", value, "userHavecar");
            return (Criteria) this;
        }

        public Criteria andUserHavecarLessThan(Integer value) {
            addCriterion("user_haveCar <", value, "userHavecar");
            return (Criteria) this;
        }

        public Criteria andUserHavecarLessThanOrEqualTo(Integer value) {
            addCriterion("user_haveCar <=", value, "userHavecar");
            return (Criteria) this;
        }

        public Criteria andUserHavecarIn(List<Integer> values) {
            addCriterion("user_haveCar in", values, "userHavecar");
            return (Criteria) this;
        }

        public Criteria andUserHavecarNotIn(List<Integer> values) {
            addCriterion("user_haveCar not in", values, "userHavecar");
            return (Criteria) this;
        }

        public Criteria andUserHavecarBetween(Integer value1, Integer value2) {
            addCriterion("user_haveCar between", value1, value2, "userHavecar");
            return (Criteria) this;
        }

        public Criteria andUserHavecarNotBetween(Integer value1, Integer value2) {
            addCriterion("user_haveCar not between", value1, value2, "userHavecar");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNull() {
            addCriterion("user_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNotNull() {
            addCriterion("user_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday =", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday <>", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("user_birthday >", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday >=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("user_birthday <", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday <=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("user_birthday in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_birthday not in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_birthday between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_birthday not between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserPortraitIsNull() {
            addCriterion("user_portrait is null");
            return (Criteria) this;
        }

        public Criteria andUserPortraitIsNotNull() {
            addCriterion("user_portrait is not null");
            return (Criteria) this;
        }

        public Criteria andUserPortraitEqualTo(String value) {
            addCriterion("user_portrait =", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitNotEqualTo(String value) {
            addCriterion("user_portrait <>", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitGreaterThan(String value) {
            addCriterion("user_portrait >", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitGreaterThanOrEqualTo(String value) {
            addCriterion("user_portrait >=", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitLessThan(String value) {
            addCriterion("user_portrait <", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitLessThanOrEqualTo(String value) {
            addCriterion("user_portrait <=", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitLike(String value) {
            addCriterion("user_portrait like", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitNotLike(String value) {
            addCriterion("user_portrait not like", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitIn(List<String> values) {
            addCriterion("user_portrait in", values, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitNotIn(List<String> values) {
            addCriterion("user_portrait not in", values, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitBetween(String value1, String value2) {
            addCriterion("user_portrait between", value1, value2, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitNotBetween(String value1, String value2) {
            addCriterion("user_portrait not between", value1, value2, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserProhibitIsNull() {
            addCriterion("user_prohibit is null");
            return (Criteria) this;
        }

        public Criteria andUserProhibitIsNotNull() {
            addCriterion("user_prohibit is not null");
            return (Criteria) this;
        }

        public Criteria andUserProhibitEqualTo(String value) {
            addCriterion("user_prohibit =", value, "userProhibit");
            return (Criteria) this;
        }

        public Criteria andUserProhibitNotEqualTo(String value) {
            addCriterion("user_prohibit <>", value, "userProhibit");
            return (Criteria) this;
        }

        public Criteria andUserProhibitGreaterThan(String value) {
            addCriterion("user_prohibit >", value, "userProhibit");
            return (Criteria) this;
        }

        public Criteria andUserProhibitGreaterThanOrEqualTo(String value) {
            addCriterion("user_prohibit >=", value, "userProhibit");
            return (Criteria) this;
        }

        public Criteria andUserProhibitLessThan(String value) {
            addCriterion("user_prohibit <", value, "userProhibit");
            return (Criteria) this;
        }

        public Criteria andUserProhibitLessThanOrEqualTo(String value) {
            addCriterion("user_prohibit <=", value, "userProhibit");
            return (Criteria) this;
        }

        public Criteria andUserProhibitLike(String value) {
            addCriterion("user_prohibit like", value, "userProhibit");
            return (Criteria) this;
        }

        public Criteria andUserProhibitNotLike(String value) {
            addCriterion("user_prohibit not like", value, "userProhibit");
            return (Criteria) this;
        }

        public Criteria andUserProhibitIn(List<String> values) {
            addCriterion("user_prohibit in", values, "userProhibit");
            return (Criteria) this;
        }

        public Criteria andUserProhibitNotIn(List<String> values) {
            addCriterion("user_prohibit not in", values, "userProhibit");
            return (Criteria) this;
        }

        public Criteria andUserProhibitBetween(String value1, String value2) {
            addCriterion("user_prohibit between", value1, value2, "userProhibit");
            return (Criteria) this;
        }

        public Criteria andUserProhibitNotBetween(String value1, String value2) {
            addCriterion("user_prohibit not between", value1, value2, "userProhibit");
            return (Criteria) this;
        }

        public Criteria andUserDateIsNull() {
            addCriterion("user_Date is null");
            return (Criteria) this;
        }

        public Criteria andUserDateIsNotNull() {
            addCriterion("user_Date is not null");
            return (Criteria) this;
        }

        public Criteria andUserDateEqualTo(Date value) {
            addCriterionForJDBCDate("user_Date =", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_Date <>", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateGreaterThan(Date value) {
            addCriterionForJDBCDate("user_Date >", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_Date >=", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateLessThan(Date value) {
            addCriterionForJDBCDate("user_Date <", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_Date <=", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateIn(List<Date> values) {
            addCriterionForJDBCDate("user_Date in", values, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_Date not in", values, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_Date between", value1, value2, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_Date not between", value1, value2, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDeviceidIsNull() {
            addCriterion("user_deviceId is null");
            return (Criteria) this;
        }

        public Criteria andUserDeviceidIsNotNull() {
            addCriterion("user_deviceId is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeviceidEqualTo(String value) {
            addCriterion("user_deviceId =", value, "userDeviceid");
            return (Criteria) this;
        }

        public Criteria andUserDeviceidNotEqualTo(String value) {
            addCriterion("user_deviceId <>", value, "userDeviceid");
            return (Criteria) this;
        }

        public Criteria andUserDeviceidGreaterThan(String value) {
            addCriterion("user_deviceId >", value, "userDeviceid");
            return (Criteria) this;
        }

        public Criteria andUserDeviceidGreaterThanOrEqualTo(String value) {
            addCriterion("user_deviceId >=", value, "userDeviceid");
            return (Criteria) this;
        }

        public Criteria andUserDeviceidLessThan(String value) {
            addCriterion("user_deviceId <", value, "userDeviceid");
            return (Criteria) this;
        }

        public Criteria andUserDeviceidLessThanOrEqualTo(String value) {
            addCriterion("user_deviceId <=", value, "userDeviceid");
            return (Criteria) this;
        }

        public Criteria andUserDeviceidLike(String value) {
            addCriterion("user_deviceId like", value, "userDeviceid");
            return (Criteria) this;
        }

        public Criteria andUserDeviceidNotLike(String value) {
            addCriterion("user_deviceId not like", value, "userDeviceid");
            return (Criteria) this;
        }

        public Criteria andUserDeviceidIn(List<String> values) {
            addCriterion("user_deviceId in", values, "userDeviceid");
            return (Criteria) this;
        }

        public Criteria andUserDeviceidNotIn(List<String> values) {
            addCriterion("user_deviceId not in", values, "userDeviceid");
            return (Criteria) this;
        }

        public Criteria andUserDeviceidBetween(String value1, String value2) {
            addCriterion("user_deviceId between", value1, value2, "userDeviceid");
            return (Criteria) this;
        }

        public Criteria andUserDeviceidNotBetween(String value1, String value2) {
            addCriterion("user_deviceId not between", value1, value2, "userDeviceid");
            return (Criteria) this;
        }

        public Criteria andUserLoginlasttimeIsNull() {
            addCriterion("user_loginLastTime is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginlasttimeIsNotNull() {
            addCriterion("user_loginLastTime is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginlasttimeEqualTo(Date value) {
            addCriterionForJDBCDate("user_loginLastTime =", value, "userLoginlasttime");
            return (Criteria) this;
        }

        public Criteria andUserLoginlasttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_loginLastTime <>", value, "userLoginlasttime");
            return (Criteria) this;
        }

        public Criteria andUserLoginlasttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("user_loginLastTime >", value, "userLoginlasttime");
            return (Criteria) this;
        }

        public Criteria andUserLoginlasttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_loginLastTime >=", value, "userLoginlasttime");
            return (Criteria) this;
        }

        public Criteria andUserLoginlasttimeLessThan(Date value) {
            addCriterionForJDBCDate("user_loginLastTime <", value, "userLoginlasttime");
            return (Criteria) this;
        }

        public Criteria andUserLoginlasttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_loginLastTime <=", value, "userLoginlasttime");
            return (Criteria) this;
        }

        public Criteria andUserLoginlasttimeIn(List<Date> values) {
            addCriterionForJDBCDate("user_loginLastTime in", values, "userLoginlasttime");
            return (Criteria) this;
        }

        public Criteria andUserLoginlasttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_loginLastTime not in", values, "userLoginlasttime");
            return (Criteria) this;
        }

        public Criteria andUserLoginlasttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_loginLastTime between", value1, value2, "userLoginlasttime");
            return (Criteria) this;
        }

        public Criteria andUserLoginlasttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_loginLastTime not between", value1, value2, "userLoginlasttime");
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