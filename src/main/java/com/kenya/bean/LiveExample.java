package com.kenya.bean;

import java.util.ArrayList;
import java.util.List;

public class LiveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LiveExample() {
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

        public Criteria andLiveidIsNull() {
            addCriterion("liveId is null");
            return (Criteria) this;
        }

        public Criteria andLiveidIsNotNull() {
            addCriterion("liveId is not null");
            return (Criteria) this;
        }

        public Criteria andLiveidEqualTo(Integer value) {
            addCriterion("liveId =", value, "liveid");
            return (Criteria) this;
        }

        public Criteria andLiveidNotEqualTo(Integer value) {
            addCriterion("liveId <>", value, "liveid");
            return (Criteria) this;
        }

        public Criteria andLiveidGreaterThan(Integer value) {
            addCriterion("liveId >", value, "liveid");
            return (Criteria) this;
        }

        public Criteria andLiveidGreaterThanOrEqualTo(Integer value) {
            addCriterion("liveId >=", value, "liveid");
            return (Criteria) this;
        }

        public Criteria andLiveidLessThan(Integer value) {
            addCriterion("liveId <", value, "liveid");
            return (Criteria) this;
        }

        public Criteria andLiveidLessThanOrEqualTo(Integer value) {
            addCriterion("liveId <=", value, "liveid");
            return (Criteria) this;
        }

        public Criteria andLiveidIn(List<Integer> values) {
            addCriterion("liveId in", values, "liveid");
            return (Criteria) this;
        }

        public Criteria andLiveidNotIn(List<Integer> values) {
            addCriterion("liveId not in", values, "liveid");
            return (Criteria) this;
        }

        public Criteria andLiveidBetween(Integer value1, Integer value2) {
            addCriterion("liveId between", value1, value2, "liveid");
            return (Criteria) this;
        }

        public Criteria andLiveidNotBetween(Integer value1, Integer value2) {
            addCriterion("liveId not between", value1, value2, "liveid");
            return (Criteria) this;
        }

        public Criteria andLivephoneIsNull() {
            addCriterion("livePhone is null");
            return (Criteria) this;
        }

        public Criteria andLivephoneIsNotNull() {
            addCriterion("livePhone is not null");
            return (Criteria) this;
        }

        public Criteria andLivephoneEqualTo(String value) {
            addCriterion("livePhone =", value, "livephone");
            return (Criteria) this;
        }

        public Criteria andLivephoneNotEqualTo(String value) {
            addCriterion("livePhone <>", value, "livephone");
            return (Criteria) this;
        }

        public Criteria andLivephoneGreaterThan(String value) {
            addCriterion("livePhone >", value, "livephone");
            return (Criteria) this;
        }

        public Criteria andLivephoneGreaterThanOrEqualTo(String value) {
            addCriterion("livePhone >=", value, "livephone");
            return (Criteria) this;
        }

        public Criteria andLivephoneLessThan(String value) {
            addCriterion("livePhone <", value, "livephone");
            return (Criteria) this;
        }

        public Criteria andLivephoneLessThanOrEqualTo(String value) {
            addCriterion("livePhone <=", value, "livephone");
            return (Criteria) this;
        }

        public Criteria andLivephoneLike(String value) {
            addCriterion("livePhone like", value, "livephone");
            return (Criteria) this;
        }

        public Criteria andLivephoneNotLike(String value) {
            addCriterion("livePhone not like", value, "livephone");
            return (Criteria) this;
        }

        public Criteria andLivephoneIn(List<String> values) {
            addCriterion("livePhone in", values, "livephone");
            return (Criteria) this;
        }

        public Criteria andLivephoneNotIn(List<String> values) {
            addCriterion("livePhone not in", values, "livephone");
            return (Criteria) this;
        }

        public Criteria andLivephoneBetween(String value1, String value2) {
            addCriterion("livePhone between", value1, value2, "livephone");
            return (Criteria) this;
        }

        public Criteria andLivephoneNotBetween(String value1, String value2) {
            addCriterion("livePhone not between", value1, value2, "livephone");
            return (Criteria) this;
        }

        public Criteria andLivenameIsNull() {
            addCriterion("liveName is null");
            return (Criteria) this;
        }

        public Criteria andLivenameIsNotNull() {
            addCriterion("liveName is not null");
            return (Criteria) this;
        }

        public Criteria andLivenameEqualTo(String value) {
            addCriterion("liveName =", value, "livename");
            return (Criteria) this;
        }

        public Criteria andLivenameNotEqualTo(String value) {
            addCriterion("liveName <>", value, "livename");
            return (Criteria) this;
        }

        public Criteria andLivenameGreaterThan(String value) {
            addCriterion("liveName >", value, "livename");
            return (Criteria) this;
        }

        public Criteria andLivenameGreaterThanOrEqualTo(String value) {
            addCriterion("liveName >=", value, "livename");
            return (Criteria) this;
        }

        public Criteria andLivenameLessThan(String value) {
            addCriterion("liveName <", value, "livename");
            return (Criteria) this;
        }

        public Criteria andLivenameLessThanOrEqualTo(String value) {
            addCriterion("liveName <=", value, "livename");
            return (Criteria) this;
        }

        public Criteria andLivenameLike(String value) {
            addCriterion("liveName like", value, "livename");
            return (Criteria) this;
        }

        public Criteria andLivenameNotLike(String value) {
            addCriterion("liveName not like", value, "livename");
            return (Criteria) this;
        }

        public Criteria andLivenameIn(List<String> values) {
            addCriterion("liveName in", values, "livename");
            return (Criteria) this;
        }

        public Criteria andLivenameNotIn(List<String> values) {
            addCriterion("liveName not in", values, "livename");
            return (Criteria) this;
        }

        public Criteria andLivenameBetween(String value1, String value2) {
            addCriterion("liveName between", value1, value2, "livename");
            return (Criteria) this;
        }

        public Criteria andLivenameNotBetween(String value1, String value2) {
            addCriterion("liveName not between", value1, value2, "livename");
            return (Criteria) this;
        }

        public Criteria andLivetypeIsNull() {
            addCriterion("liveType is null");
            return (Criteria) this;
        }

        public Criteria andLivetypeIsNotNull() {
            addCriterion("liveType is not null");
            return (Criteria) this;
        }

        public Criteria andLivetypeEqualTo(String value) {
            addCriterion("liveType =", value, "livetype");
            return (Criteria) this;
        }

        public Criteria andLivetypeNotEqualTo(String value) {
            addCriterion("liveType <>", value, "livetype");
            return (Criteria) this;
        }

        public Criteria andLivetypeGreaterThan(String value) {
            addCriterion("liveType >", value, "livetype");
            return (Criteria) this;
        }

        public Criteria andLivetypeGreaterThanOrEqualTo(String value) {
            addCriterion("liveType >=", value, "livetype");
            return (Criteria) this;
        }

        public Criteria andLivetypeLessThan(String value) {
            addCriterion("liveType <", value, "livetype");
            return (Criteria) this;
        }

        public Criteria andLivetypeLessThanOrEqualTo(String value) {
            addCriterion("liveType <=", value, "livetype");
            return (Criteria) this;
        }

        public Criteria andLivetypeLike(String value) {
            addCriterion("liveType like", value, "livetype");
            return (Criteria) this;
        }

        public Criteria andLivetypeNotLike(String value) {
            addCriterion("liveType not like", value, "livetype");
            return (Criteria) this;
        }

        public Criteria andLivetypeIn(List<String> values) {
            addCriterion("liveType in", values, "livetype");
            return (Criteria) this;
        }

        public Criteria andLivetypeNotIn(List<String> values) {
            addCriterion("liveType not in", values, "livetype");
            return (Criteria) this;
        }

        public Criteria andLivetypeBetween(String value1, String value2) {
            addCriterion("liveType between", value1, value2, "livetype");
            return (Criteria) this;
        }

        public Criteria andLivetypeNotBetween(String value1, String value2) {
            addCriterion("liveType not between", value1, value2, "livetype");
            return (Criteria) this;
        }

        public Criteria andLiveimgsIsNull() {
            addCriterion("liveImgs is null");
            return (Criteria) this;
        }

        public Criteria andLiveimgsIsNotNull() {
            addCriterion("liveImgs is not null");
            return (Criteria) this;
        }

        public Criteria andLiveimgsEqualTo(String value) {
            addCriterion("liveImgs =", value, "liveimgs");
            return (Criteria) this;
        }

        public Criteria andLiveimgsNotEqualTo(String value) {
            addCriterion("liveImgs <>", value, "liveimgs");
            return (Criteria) this;
        }

        public Criteria andLiveimgsGreaterThan(String value) {
            addCriterion("liveImgs >", value, "liveimgs");
            return (Criteria) this;
        }

        public Criteria andLiveimgsGreaterThanOrEqualTo(String value) {
            addCriterion("liveImgs >=", value, "liveimgs");
            return (Criteria) this;
        }

        public Criteria andLiveimgsLessThan(String value) {
            addCriterion("liveImgs <", value, "liveimgs");
            return (Criteria) this;
        }

        public Criteria andLiveimgsLessThanOrEqualTo(String value) {
            addCriterion("liveImgs <=", value, "liveimgs");
            return (Criteria) this;
        }

        public Criteria andLiveimgsLike(String value) {
            addCriterion("liveImgs like", value, "liveimgs");
            return (Criteria) this;
        }

        public Criteria andLiveimgsNotLike(String value) {
            addCriterion("liveImgs not like", value, "liveimgs");
            return (Criteria) this;
        }

        public Criteria andLiveimgsIn(List<String> values) {
            addCriterion("liveImgs in", values, "liveimgs");
            return (Criteria) this;
        }

        public Criteria andLiveimgsNotIn(List<String> values) {
            addCriterion("liveImgs not in", values, "liveimgs");
            return (Criteria) this;
        }

        public Criteria andLiveimgsBetween(String value1, String value2) {
            addCriterion("liveImgs between", value1, value2, "liveimgs");
            return (Criteria) this;
        }

        public Criteria andLiveimgsNotBetween(String value1, String value2) {
            addCriterion("liveImgs not between", value1, value2, "liveimgs");
            return (Criteria) this;
        }

        public Criteria andLiveimg1IsNull() {
            addCriterion("liveImg1 is null");
            return (Criteria) this;
        }

        public Criteria andLiveimg1IsNotNull() {
            addCriterion("liveImg1 is not null");
            return (Criteria) this;
        }

        public Criteria andLiveimg1EqualTo(String value) {
            addCriterion("liveImg1 =", value, "liveimg1");
            return (Criteria) this;
        }

        public Criteria andLiveimg1NotEqualTo(String value) {
            addCriterion("liveImg1 <>", value, "liveimg1");
            return (Criteria) this;
        }

        public Criteria andLiveimg1GreaterThan(String value) {
            addCriterion("liveImg1 >", value, "liveimg1");
            return (Criteria) this;
        }

        public Criteria andLiveimg1GreaterThanOrEqualTo(String value) {
            addCriterion("liveImg1 >=", value, "liveimg1");
            return (Criteria) this;
        }

        public Criteria andLiveimg1LessThan(String value) {
            addCriterion("liveImg1 <", value, "liveimg1");
            return (Criteria) this;
        }

        public Criteria andLiveimg1LessThanOrEqualTo(String value) {
            addCriterion("liveImg1 <=", value, "liveimg1");
            return (Criteria) this;
        }

        public Criteria andLiveimg1Like(String value) {
            addCriterion("liveImg1 like", value, "liveimg1");
            return (Criteria) this;
        }

        public Criteria andLiveimg1NotLike(String value) {
            addCriterion("liveImg1 not like", value, "liveimg1");
            return (Criteria) this;
        }

        public Criteria andLiveimg1In(List<String> values) {
            addCriterion("liveImg1 in", values, "liveimg1");
            return (Criteria) this;
        }

        public Criteria andLiveimg1NotIn(List<String> values) {
            addCriterion("liveImg1 not in", values, "liveimg1");
            return (Criteria) this;
        }

        public Criteria andLiveimg1Between(String value1, String value2) {
            addCriterion("liveImg1 between", value1, value2, "liveimg1");
            return (Criteria) this;
        }

        public Criteria andLiveimg1NotBetween(String value1, String value2) {
            addCriterion("liveImg1 not between", value1, value2, "liveimg1");
            return (Criteria) this;
        }

        public Criteria andLiveimg2IsNull() {
            addCriterion("liveImg2 is null");
            return (Criteria) this;
        }

        public Criteria andLiveimg2IsNotNull() {
            addCriterion("liveImg2 is not null");
            return (Criteria) this;
        }

        public Criteria andLiveimg2EqualTo(String value) {
            addCriterion("liveImg2 =", value, "liveimg2");
            return (Criteria) this;
        }

        public Criteria andLiveimg2NotEqualTo(String value) {
            addCriterion("liveImg2 <>", value, "liveimg2");
            return (Criteria) this;
        }

        public Criteria andLiveimg2GreaterThan(String value) {
            addCriterion("liveImg2 >", value, "liveimg2");
            return (Criteria) this;
        }

        public Criteria andLiveimg2GreaterThanOrEqualTo(String value) {
            addCriterion("liveImg2 >=", value, "liveimg2");
            return (Criteria) this;
        }

        public Criteria andLiveimg2LessThan(String value) {
            addCriterion("liveImg2 <", value, "liveimg2");
            return (Criteria) this;
        }

        public Criteria andLiveimg2LessThanOrEqualTo(String value) {
            addCriterion("liveImg2 <=", value, "liveimg2");
            return (Criteria) this;
        }

        public Criteria andLiveimg2Like(String value) {
            addCriterion("liveImg2 like", value, "liveimg2");
            return (Criteria) this;
        }

        public Criteria andLiveimg2NotLike(String value) {
            addCriterion("liveImg2 not like", value, "liveimg2");
            return (Criteria) this;
        }

        public Criteria andLiveimg2In(List<String> values) {
            addCriterion("liveImg2 in", values, "liveimg2");
            return (Criteria) this;
        }

        public Criteria andLiveimg2NotIn(List<String> values) {
            addCriterion("liveImg2 not in", values, "liveimg2");
            return (Criteria) this;
        }

        public Criteria andLiveimg2Between(String value1, String value2) {
            addCriterion("liveImg2 between", value1, value2, "liveimg2");
            return (Criteria) this;
        }

        public Criteria andLiveimg2NotBetween(String value1, String value2) {
            addCriterion("liveImg2 not between", value1, value2, "liveimg2");
            return (Criteria) this;
        }

        public Criteria andLiveimg3IsNull() {
            addCriterion("liveImg3 is null");
            return (Criteria) this;
        }

        public Criteria andLiveimg3IsNotNull() {
            addCriterion("liveImg3 is not null");
            return (Criteria) this;
        }

        public Criteria andLiveimg3EqualTo(String value) {
            addCriterion("liveImg3 =", value, "liveimg3");
            return (Criteria) this;
        }

        public Criteria andLiveimg3NotEqualTo(String value) {
            addCriterion("liveImg3 <>", value, "liveimg3");
            return (Criteria) this;
        }

        public Criteria andLiveimg3GreaterThan(String value) {
            addCriterion("liveImg3 >", value, "liveimg3");
            return (Criteria) this;
        }

        public Criteria andLiveimg3GreaterThanOrEqualTo(String value) {
            addCriterion("liveImg3 >=", value, "liveimg3");
            return (Criteria) this;
        }

        public Criteria andLiveimg3LessThan(String value) {
            addCriterion("liveImg3 <", value, "liveimg3");
            return (Criteria) this;
        }

        public Criteria andLiveimg3LessThanOrEqualTo(String value) {
            addCriterion("liveImg3 <=", value, "liveimg3");
            return (Criteria) this;
        }

        public Criteria andLiveimg3Like(String value) {
            addCriterion("liveImg3 like", value, "liveimg3");
            return (Criteria) this;
        }

        public Criteria andLiveimg3NotLike(String value) {
            addCriterion("liveImg3 not like", value, "liveimg3");
            return (Criteria) this;
        }

        public Criteria andLiveimg3In(List<String> values) {
            addCriterion("liveImg3 in", values, "liveimg3");
            return (Criteria) this;
        }

        public Criteria andLiveimg3NotIn(List<String> values) {
            addCriterion("liveImg3 not in", values, "liveimg3");
            return (Criteria) this;
        }

        public Criteria andLiveimg3Between(String value1, String value2) {
            addCriterion("liveImg3 between", value1, value2, "liveimg3");
            return (Criteria) this;
        }

        public Criteria andLiveimg3NotBetween(String value1, String value2) {
            addCriterion("liveImg3 not between", value1, value2, "liveimg3");
            return (Criteria) this;
        }

        public Criteria andLiveimg4IsNull() {
            addCriterion("liveImg4 is null");
            return (Criteria) this;
        }

        public Criteria andLiveimg4IsNotNull() {
            addCriterion("liveImg4 is not null");
            return (Criteria) this;
        }

        public Criteria andLiveimg4EqualTo(String value) {
            addCriterion("liveImg4 =", value, "liveimg4");
            return (Criteria) this;
        }

        public Criteria andLiveimg4NotEqualTo(String value) {
            addCriterion("liveImg4 <>", value, "liveimg4");
            return (Criteria) this;
        }

        public Criteria andLiveimg4GreaterThan(String value) {
            addCriterion("liveImg4 >", value, "liveimg4");
            return (Criteria) this;
        }

        public Criteria andLiveimg4GreaterThanOrEqualTo(String value) {
            addCriterion("liveImg4 >=", value, "liveimg4");
            return (Criteria) this;
        }

        public Criteria andLiveimg4LessThan(String value) {
            addCriterion("liveImg4 <", value, "liveimg4");
            return (Criteria) this;
        }

        public Criteria andLiveimg4LessThanOrEqualTo(String value) {
            addCriterion("liveImg4 <=", value, "liveimg4");
            return (Criteria) this;
        }

        public Criteria andLiveimg4Like(String value) {
            addCriterion("liveImg4 like", value, "liveimg4");
            return (Criteria) this;
        }

        public Criteria andLiveimg4NotLike(String value) {
            addCriterion("liveImg4 not like", value, "liveimg4");
            return (Criteria) this;
        }

        public Criteria andLiveimg4In(List<String> values) {
            addCriterion("liveImg4 in", values, "liveimg4");
            return (Criteria) this;
        }

        public Criteria andLiveimg4NotIn(List<String> values) {
            addCriterion("liveImg4 not in", values, "liveimg4");
            return (Criteria) this;
        }

        public Criteria andLiveimg4Between(String value1, String value2) {
            addCriterion("liveImg4 between", value1, value2, "liveimg4");
            return (Criteria) this;
        }

        public Criteria andLiveimg4NotBetween(String value1, String value2) {
            addCriterion("liveImg4 not between", value1, value2, "liveimg4");
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