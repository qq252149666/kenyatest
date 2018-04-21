package com.kenya.bean;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodsidIsNull() {
            addCriterion("goodsId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("goodsId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(Integer value) {
            addCriterion("goodsId =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(Integer value) {
            addCriterion("goodsId <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(Integer value) {
            addCriterion("goodsId >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsId >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(Integer value) {
            addCriterion("goodsId <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("goodsId <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<Integer> values) {
            addCriterion("goodsId in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<Integer> values) {
            addCriterion("goodsId not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(Integer value1, Integer value2) {
            addCriterion("goodsId between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsId not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsName not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsimgsIsNull() {
            addCriterion("goodsImgs is null");
            return (Criteria) this;
        }

        public Criteria andGoodsimgsIsNotNull() {
            addCriterion("goodsImgs is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsimgsEqualTo(String value) {
            addCriterion("goodsImgs =", value, "goodsimgs");
            return (Criteria) this;
        }

        public Criteria andGoodsimgsNotEqualTo(String value) {
            addCriterion("goodsImgs <>", value, "goodsimgs");
            return (Criteria) this;
        }

        public Criteria andGoodsimgsGreaterThan(String value) {
            addCriterion("goodsImgs >", value, "goodsimgs");
            return (Criteria) this;
        }

        public Criteria andGoodsimgsGreaterThanOrEqualTo(String value) {
            addCriterion("goodsImgs >=", value, "goodsimgs");
            return (Criteria) this;
        }

        public Criteria andGoodsimgsLessThan(String value) {
            addCriterion("goodsImgs <", value, "goodsimgs");
            return (Criteria) this;
        }

        public Criteria andGoodsimgsLessThanOrEqualTo(String value) {
            addCriterion("goodsImgs <=", value, "goodsimgs");
            return (Criteria) this;
        }

        public Criteria andGoodsimgsLike(String value) {
            addCriterion("goodsImgs like", value, "goodsimgs");
            return (Criteria) this;
        }

        public Criteria andGoodsimgsNotLike(String value) {
            addCriterion("goodsImgs not like", value, "goodsimgs");
            return (Criteria) this;
        }

        public Criteria andGoodsimgsIn(List<String> values) {
            addCriterion("goodsImgs in", values, "goodsimgs");
            return (Criteria) this;
        }

        public Criteria andGoodsimgsNotIn(List<String> values) {
            addCriterion("goodsImgs not in", values, "goodsimgs");
            return (Criteria) this;
        }

        public Criteria andGoodsimgsBetween(String value1, String value2) {
            addCriterion("goodsImgs between", value1, value2, "goodsimgs");
            return (Criteria) this;
        }

        public Criteria andGoodsimgsNotBetween(String value1, String value2) {
            addCriterion("goodsImgs not between", value1, value2, "goodsimgs");
            return (Criteria) this;
        }

        public Criteria andGoodsimg1IsNull() {
            addCriterion("goodsImg1 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsimg1IsNotNull() {
            addCriterion("goodsImg1 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsimg1EqualTo(String value) {
            addCriterion("goodsImg1 =", value, "goodsimg1");
            return (Criteria) this;
        }

        public Criteria andGoodsimg1NotEqualTo(String value) {
            addCriterion("goodsImg1 <>", value, "goodsimg1");
            return (Criteria) this;
        }

        public Criteria andGoodsimg1GreaterThan(String value) {
            addCriterion("goodsImg1 >", value, "goodsimg1");
            return (Criteria) this;
        }

        public Criteria andGoodsimg1GreaterThanOrEqualTo(String value) {
            addCriterion("goodsImg1 >=", value, "goodsimg1");
            return (Criteria) this;
        }

        public Criteria andGoodsimg1LessThan(String value) {
            addCriterion("goodsImg1 <", value, "goodsimg1");
            return (Criteria) this;
        }

        public Criteria andGoodsimg1LessThanOrEqualTo(String value) {
            addCriterion("goodsImg1 <=", value, "goodsimg1");
            return (Criteria) this;
        }

        public Criteria andGoodsimg1Like(String value) {
            addCriterion("goodsImg1 like", value, "goodsimg1");
            return (Criteria) this;
        }

        public Criteria andGoodsimg1NotLike(String value) {
            addCriterion("goodsImg1 not like", value, "goodsimg1");
            return (Criteria) this;
        }

        public Criteria andGoodsimg1In(List<String> values) {
            addCriterion("goodsImg1 in", values, "goodsimg1");
            return (Criteria) this;
        }

        public Criteria andGoodsimg1NotIn(List<String> values) {
            addCriterion("goodsImg1 not in", values, "goodsimg1");
            return (Criteria) this;
        }

        public Criteria andGoodsimg1Between(String value1, String value2) {
            addCriterion("goodsImg1 between", value1, value2, "goodsimg1");
            return (Criteria) this;
        }

        public Criteria andGoodsimg1NotBetween(String value1, String value2) {
            addCriterion("goodsImg1 not between", value1, value2, "goodsimg1");
            return (Criteria) this;
        }

        public Criteria andGoodsimg2IsNull() {
            addCriterion("goodsImg2 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsimg2IsNotNull() {
            addCriterion("goodsImg2 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsimg2EqualTo(String value) {
            addCriterion("goodsImg2 =", value, "goodsimg2");
            return (Criteria) this;
        }

        public Criteria andGoodsimg2NotEqualTo(String value) {
            addCriterion("goodsImg2 <>", value, "goodsimg2");
            return (Criteria) this;
        }

        public Criteria andGoodsimg2GreaterThan(String value) {
            addCriterion("goodsImg2 >", value, "goodsimg2");
            return (Criteria) this;
        }

        public Criteria andGoodsimg2GreaterThanOrEqualTo(String value) {
            addCriterion("goodsImg2 >=", value, "goodsimg2");
            return (Criteria) this;
        }

        public Criteria andGoodsimg2LessThan(String value) {
            addCriterion("goodsImg2 <", value, "goodsimg2");
            return (Criteria) this;
        }

        public Criteria andGoodsimg2LessThanOrEqualTo(String value) {
            addCriterion("goodsImg2 <=", value, "goodsimg2");
            return (Criteria) this;
        }

        public Criteria andGoodsimg2Like(String value) {
            addCriterion("goodsImg2 like", value, "goodsimg2");
            return (Criteria) this;
        }

        public Criteria andGoodsimg2NotLike(String value) {
            addCriterion("goodsImg2 not like", value, "goodsimg2");
            return (Criteria) this;
        }

        public Criteria andGoodsimg2In(List<String> values) {
            addCriterion("goodsImg2 in", values, "goodsimg2");
            return (Criteria) this;
        }

        public Criteria andGoodsimg2NotIn(List<String> values) {
            addCriterion("goodsImg2 not in", values, "goodsimg2");
            return (Criteria) this;
        }

        public Criteria andGoodsimg2Between(String value1, String value2) {
            addCriterion("goodsImg2 between", value1, value2, "goodsimg2");
            return (Criteria) this;
        }

        public Criteria andGoodsimg2NotBetween(String value1, String value2) {
            addCriterion("goodsImg2 not between", value1, value2, "goodsimg2");
            return (Criteria) this;
        }

        public Criteria andGoodsimg3IsNull() {
            addCriterion("goodsImg3 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsimg3IsNotNull() {
            addCriterion("goodsImg3 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsimg3EqualTo(String value) {
            addCriterion("goodsImg3 =", value, "goodsimg3");
            return (Criteria) this;
        }

        public Criteria andGoodsimg3NotEqualTo(String value) {
            addCriterion("goodsImg3 <>", value, "goodsimg3");
            return (Criteria) this;
        }

        public Criteria andGoodsimg3GreaterThan(String value) {
            addCriterion("goodsImg3 >", value, "goodsimg3");
            return (Criteria) this;
        }

        public Criteria andGoodsimg3GreaterThanOrEqualTo(String value) {
            addCriterion("goodsImg3 >=", value, "goodsimg3");
            return (Criteria) this;
        }

        public Criteria andGoodsimg3LessThan(String value) {
            addCriterion("goodsImg3 <", value, "goodsimg3");
            return (Criteria) this;
        }

        public Criteria andGoodsimg3LessThanOrEqualTo(String value) {
            addCriterion("goodsImg3 <=", value, "goodsimg3");
            return (Criteria) this;
        }

        public Criteria andGoodsimg3Like(String value) {
            addCriterion("goodsImg3 like", value, "goodsimg3");
            return (Criteria) this;
        }

        public Criteria andGoodsimg3NotLike(String value) {
            addCriterion("goodsImg3 not like", value, "goodsimg3");
            return (Criteria) this;
        }

        public Criteria andGoodsimg3In(List<String> values) {
            addCriterion("goodsImg3 in", values, "goodsimg3");
            return (Criteria) this;
        }

        public Criteria andGoodsimg3NotIn(List<String> values) {
            addCriterion("goodsImg3 not in", values, "goodsimg3");
            return (Criteria) this;
        }

        public Criteria andGoodsimg3Between(String value1, String value2) {
            addCriterion("goodsImg3 between", value1, value2, "goodsimg3");
            return (Criteria) this;
        }

        public Criteria andGoodsimg3NotBetween(String value1, String value2) {
            addCriterion("goodsImg3 not between", value1, value2, "goodsimg3");
            return (Criteria) this;
        }

        public Criteria andGoodsimg4IsNull() {
            addCriterion("goodsImg4 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsimg4IsNotNull() {
            addCriterion("goodsImg4 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsimg4EqualTo(String value) {
            addCriterion("goodsImg4 =", value, "goodsimg4");
            return (Criteria) this;
        }

        public Criteria andGoodsimg4NotEqualTo(String value) {
            addCriterion("goodsImg4 <>", value, "goodsimg4");
            return (Criteria) this;
        }

        public Criteria andGoodsimg4GreaterThan(String value) {
            addCriterion("goodsImg4 >", value, "goodsimg4");
            return (Criteria) this;
        }

        public Criteria andGoodsimg4GreaterThanOrEqualTo(String value) {
            addCriterion("goodsImg4 >=", value, "goodsimg4");
            return (Criteria) this;
        }

        public Criteria andGoodsimg4LessThan(String value) {
            addCriterion("goodsImg4 <", value, "goodsimg4");
            return (Criteria) this;
        }

        public Criteria andGoodsimg4LessThanOrEqualTo(String value) {
            addCriterion("goodsImg4 <=", value, "goodsimg4");
            return (Criteria) this;
        }

        public Criteria andGoodsimg4Like(String value) {
            addCriterion("goodsImg4 like", value, "goodsimg4");
            return (Criteria) this;
        }

        public Criteria andGoodsimg4NotLike(String value) {
            addCriterion("goodsImg4 not like", value, "goodsimg4");
            return (Criteria) this;
        }

        public Criteria andGoodsimg4In(List<String> values) {
            addCriterion("goodsImg4 in", values, "goodsimg4");
            return (Criteria) this;
        }

        public Criteria andGoodsimg4NotIn(List<String> values) {
            addCriterion("goodsImg4 not in", values, "goodsimg4");
            return (Criteria) this;
        }

        public Criteria andGoodsimg4Between(String value1, String value2) {
            addCriterion("goodsImg4 between", value1, value2, "goodsimg4");
            return (Criteria) this;
        }

        public Criteria andGoodsimg4NotBetween(String value1, String value2) {
            addCriterion("goodsImg4 not between", value1, value2, "goodsimg4");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNull() {
            addCriterion("goodsPrice is null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNotNull() {
            addCriterion("goodsPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceEqualTo(Float value) {
            addCriterion("goodsPrice =", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotEqualTo(Float value) {
            addCriterion("goodsPrice <>", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThan(Float value) {
            addCriterion("goodsPrice >", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThanOrEqualTo(Float value) {
            addCriterion("goodsPrice >=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThan(Float value) {
            addCriterion("goodsPrice <", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThanOrEqualTo(Float value) {
            addCriterion("goodsPrice <=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIn(List<Float> values) {
            addCriterion("goodsPrice in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotIn(List<Float> values) {
            addCriterion("goodsPrice not in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceBetween(Float value1, Float value2) {
            addCriterion("goodsPrice between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotBetween(Float value1, Float value2) {
            addCriterion("goodsPrice not between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodsusernameIsNull() {
            addCriterion("goodsUserName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsusernameIsNotNull() {
            addCriterion("goodsUserName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsusernameEqualTo(String value) {
            addCriterion("goodsUserName =", value, "goodsusername");
            return (Criteria) this;
        }

        public Criteria andGoodsusernameNotEqualTo(String value) {
            addCriterion("goodsUserName <>", value, "goodsusername");
            return (Criteria) this;
        }

        public Criteria andGoodsusernameGreaterThan(String value) {
            addCriterion("goodsUserName >", value, "goodsusername");
            return (Criteria) this;
        }

        public Criteria andGoodsusernameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsUserName >=", value, "goodsusername");
            return (Criteria) this;
        }

        public Criteria andGoodsusernameLessThan(String value) {
            addCriterion("goodsUserName <", value, "goodsusername");
            return (Criteria) this;
        }

        public Criteria andGoodsusernameLessThanOrEqualTo(String value) {
            addCriterion("goodsUserName <=", value, "goodsusername");
            return (Criteria) this;
        }

        public Criteria andGoodsusernameLike(String value) {
            addCriterion("goodsUserName like", value, "goodsusername");
            return (Criteria) this;
        }

        public Criteria andGoodsusernameNotLike(String value) {
            addCriterion("goodsUserName not like", value, "goodsusername");
            return (Criteria) this;
        }

        public Criteria andGoodsusernameIn(List<String> values) {
            addCriterion("goodsUserName in", values, "goodsusername");
            return (Criteria) this;
        }

        public Criteria andGoodsusernameNotIn(List<String> values) {
            addCriterion("goodsUserName not in", values, "goodsusername");
            return (Criteria) this;
        }

        public Criteria andGoodsusernameBetween(String value1, String value2) {
            addCriterion("goodsUserName between", value1, value2, "goodsusername");
            return (Criteria) this;
        }

        public Criteria andGoodsusernameNotBetween(String value1, String value2) {
            addCriterion("goodsUserName not between", value1, value2, "goodsusername");
            return (Criteria) this;
        }

        public Criteria andGoodsphoneIsNull() {
            addCriterion("goodsPhone is null");
            return (Criteria) this;
        }

        public Criteria andGoodsphoneIsNotNull() {
            addCriterion("goodsPhone is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsphoneEqualTo(String value) {
            addCriterion("goodsPhone =", value, "goodsphone");
            return (Criteria) this;
        }

        public Criteria andGoodsphoneNotEqualTo(String value) {
            addCriterion("goodsPhone <>", value, "goodsphone");
            return (Criteria) this;
        }

        public Criteria andGoodsphoneGreaterThan(String value) {
            addCriterion("goodsPhone >", value, "goodsphone");
            return (Criteria) this;
        }

        public Criteria andGoodsphoneGreaterThanOrEqualTo(String value) {
            addCriterion("goodsPhone >=", value, "goodsphone");
            return (Criteria) this;
        }

        public Criteria andGoodsphoneLessThan(String value) {
            addCriterion("goodsPhone <", value, "goodsphone");
            return (Criteria) this;
        }

        public Criteria andGoodsphoneLessThanOrEqualTo(String value) {
            addCriterion("goodsPhone <=", value, "goodsphone");
            return (Criteria) this;
        }

        public Criteria andGoodsphoneLike(String value) {
            addCriterion("goodsPhone like", value, "goodsphone");
            return (Criteria) this;
        }

        public Criteria andGoodsphoneNotLike(String value) {
            addCriterion("goodsPhone not like", value, "goodsphone");
            return (Criteria) this;
        }

        public Criteria andGoodsphoneIn(List<String> values) {
            addCriterion("goodsPhone in", values, "goodsphone");
            return (Criteria) this;
        }

        public Criteria andGoodsphoneNotIn(List<String> values) {
            addCriterion("goodsPhone not in", values, "goodsphone");
            return (Criteria) this;
        }

        public Criteria andGoodsphoneBetween(String value1, String value2) {
            addCriterion("goodsPhone between", value1, value2, "goodsphone");
            return (Criteria) this;
        }

        public Criteria andGoodsphoneNotBetween(String value1, String value2) {
            addCriterion("goodsPhone not between", value1, value2, "goodsphone");
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