package com.kenya.bean;

import java.util.ArrayList;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andProjectidIsNull() {
            addCriterion("projectId is null");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNotNull() {
            addCriterion("projectId is not null");
            return (Criteria) this;
        }

        public Criteria andProjectidEqualTo(Integer value) {
            addCriterion("projectId =", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotEqualTo(Integer value) {
            addCriterion("projectId <>", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThan(Integer value) {
            addCriterion("projectId >", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("projectId >=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThan(Integer value) {
            addCriterion("projectId <", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThanOrEqualTo(Integer value) {
            addCriterion("projectId <=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidIn(List<Integer> values) {
            addCriterion("projectId in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotIn(List<Integer> values) {
            addCriterion("projectId not in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidBetween(Integer value1, Integer value2) {
            addCriterion("projectId between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("projectId not between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("projectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("projectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("projectName =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("projectName <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("projectName >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("projectName >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("projectName <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("projectName <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("projectName like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("projectName not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("projectName in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("projectName not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("projectName between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("projectName not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectpriceIsNull() {
            addCriterion("projectPrice is null");
            return (Criteria) this;
        }

        public Criteria andProjectpriceIsNotNull() {
            addCriterion("projectPrice is not null");
            return (Criteria) this;
        }

        public Criteria andProjectpriceEqualTo(String value) {
            addCriterion("projectPrice =", value, "projectprice");
            return (Criteria) this;
        }

        public Criteria andProjectpriceNotEqualTo(String value) {
            addCriterion("projectPrice <>", value, "projectprice");
            return (Criteria) this;
        }

        public Criteria andProjectpriceGreaterThan(String value) {
            addCriterion("projectPrice >", value, "projectprice");
            return (Criteria) this;
        }

        public Criteria andProjectpriceGreaterThanOrEqualTo(String value) {
            addCriterion("projectPrice >=", value, "projectprice");
            return (Criteria) this;
        }

        public Criteria andProjectpriceLessThan(String value) {
            addCriterion("projectPrice <", value, "projectprice");
            return (Criteria) this;
        }

        public Criteria andProjectpriceLessThanOrEqualTo(String value) {
            addCriterion("projectPrice <=", value, "projectprice");
            return (Criteria) this;
        }

        public Criteria andProjectpriceLike(String value) {
            addCriterion("projectPrice like", value, "projectprice");
            return (Criteria) this;
        }

        public Criteria andProjectpriceNotLike(String value) {
            addCriterion("projectPrice not like", value, "projectprice");
            return (Criteria) this;
        }

        public Criteria andProjectpriceIn(List<String> values) {
            addCriterion("projectPrice in", values, "projectprice");
            return (Criteria) this;
        }

        public Criteria andProjectpriceNotIn(List<String> values) {
            addCriterion("projectPrice not in", values, "projectprice");
            return (Criteria) this;
        }

        public Criteria andProjectpriceBetween(String value1, String value2) {
            addCriterion("projectPrice between", value1, value2, "projectprice");
            return (Criteria) this;
        }

        public Criteria andProjectpriceNotBetween(String value1, String value2) {
            addCriterion("projectPrice not between", value1, value2, "projectprice");
            return (Criteria) this;
        }

        public Criteria andProjectdescIsNull() {
            addCriterion("projectDesc is null");
            return (Criteria) this;
        }

        public Criteria andProjectdescIsNotNull() {
            addCriterion("projectDesc is not null");
            return (Criteria) this;
        }

        public Criteria andProjectdescEqualTo(String value) {
            addCriterion("projectDesc =", value, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectdescNotEqualTo(String value) {
            addCriterion("projectDesc <>", value, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectdescGreaterThan(String value) {
            addCriterion("projectDesc >", value, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectdescGreaterThanOrEqualTo(String value) {
            addCriterion("projectDesc >=", value, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectdescLessThan(String value) {
            addCriterion("projectDesc <", value, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectdescLessThanOrEqualTo(String value) {
            addCriterion("projectDesc <=", value, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectdescLike(String value) {
            addCriterion("projectDesc like", value, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectdescNotLike(String value) {
            addCriterion("projectDesc not like", value, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectdescIn(List<String> values) {
            addCriterion("projectDesc in", values, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectdescNotIn(List<String> values) {
            addCriterion("projectDesc not in", values, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectdescBetween(String value1, String value2) {
            addCriterion("projectDesc between", value1, value2, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectdescNotBetween(String value1, String value2) {
            addCriterion("projectDesc not between", value1, value2, "projectdesc");
            return (Criteria) this;
        }

        public Criteria andProjectphoneIsNull() {
            addCriterion("projectPhone is null");
            return (Criteria) this;
        }

        public Criteria andProjectphoneIsNotNull() {
            addCriterion("projectPhone is not null");
            return (Criteria) this;
        }

        public Criteria andProjectphoneEqualTo(String value) {
            addCriterion("projectPhone =", value, "projectphone");
            return (Criteria) this;
        }

        public Criteria andProjectphoneNotEqualTo(String value) {
            addCriterion("projectPhone <>", value, "projectphone");
            return (Criteria) this;
        }

        public Criteria andProjectphoneGreaterThan(String value) {
            addCriterion("projectPhone >", value, "projectphone");
            return (Criteria) this;
        }

        public Criteria andProjectphoneGreaterThanOrEqualTo(String value) {
            addCriterion("projectPhone >=", value, "projectphone");
            return (Criteria) this;
        }

        public Criteria andProjectphoneLessThan(String value) {
            addCriterion("projectPhone <", value, "projectphone");
            return (Criteria) this;
        }

        public Criteria andProjectphoneLessThanOrEqualTo(String value) {
            addCriterion("projectPhone <=", value, "projectphone");
            return (Criteria) this;
        }

        public Criteria andProjectphoneLike(String value) {
            addCriterion("projectPhone like", value, "projectphone");
            return (Criteria) this;
        }

        public Criteria andProjectphoneNotLike(String value) {
            addCriterion("projectPhone not like", value, "projectphone");
            return (Criteria) this;
        }

        public Criteria andProjectphoneIn(List<String> values) {
            addCriterion("projectPhone in", values, "projectphone");
            return (Criteria) this;
        }

        public Criteria andProjectphoneNotIn(List<String> values) {
            addCriterion("projectPhone not in", values, "projectphone");
            return (Criteria) this;
        }

        public Criteria andProjectphoneBetween(String value1, String value2) {
            addCriterion("projectPhone between", value1, value2, "projectphone");
            return (Criteria) this;
        }

        public Criteria andProjectphoneNotBetween(String value1, String value2) {
            addCriterion("projectPhone not between", value1, value2, "projectphone");
            return (Criteria) this;
        }

        public Criteria andProjectimgsIsNull() {
            addCriterion("projectImgs is null");
            return (Criteria) this;
        }

        public Criteria andProjectimgsIsNotNull() {
            addCriterion("projectImgs is not null");
            return (Criteria) this;
        }

        public Criteria andProjectimgsEqualTo(String value) {
            addCriterion("projectImgs =", value, "projectimgs");
            return (Criteria) this;
        }

        public Criteria andProjectimgsNotEqualTo(String value) {
            addCriterion("projectImgs <>", value, "projectimgs");
            return (Criteria) this;
        }

        public Criteria andProjectimgsGreaterThan(String value) {
            addCriterion("projectImgs >", value, "projectimgs");
            return (Criteria) this;
        }

        public Criteria andProjectimgsGreaterThanOrEqualTo(String value) {
            addCriterion("projectImgs >=", value, "projectimgs");
            return (Criteria) this;
        }

        public Criteria andProjectimgsLessThan(String value) {
            addCriterion("projectImgs <", value, "projectimgs");
            return (Criteria) this;
        }

        public Criteria andProjectimgsLessThanOrEqualTo(String value) {
            addCriterion("projectImgs <=", value, "projectimgs");
            return (Criteria) this;
        }

        public Criteria andProjectimgsLike(String value) {
            addCriterion("projectImgs like", value, "projectimgs");
            return (Criteria) this;
        }

        public Criteria andProjectimgsNotLike(String value) {
            addCriterion("projectImgs not like", value, "projectimgs");
            return (Criteria) this;
        }

        public Criteria andProjectimgsIn(List<String> values) {
            addCriterion("projectImgs in", values, "projectimgs");
            return (Criteria) this;
        }

        public Criteria andProjectimgsNotIn(List<String> values) {
            addCriterion("projectImgs not in", values, "projectimgs");
            return (Criteria) this;
        }

        public Criteria andProjectimgsBetween(String value1, String value2) {
            addCriterion("projectImgs between", value1, value2, "projectimgs");
            return (Criteria) this;
        }

        public Criteria andProjectimgsNotBetween(String value1, String value2) {
            addCriterion("projectImgs not between", value1, value2, "projectimgs");
            return (Criteria) this;
        }

        public Criteria andProjectimg1IsNull() {
            addCriterion("projectImg1 is null");
            return (Criteria) this;
        }

        public Criteria andProjectimg1IsNotNull() {
            addCriterion("projectImg1 is not null");
            return (Criteria) this;
        }

        public Criteria andProjectimg1EqualTo(String value) {
            addCriterion("projectImg1 =", value, "projectimg1");
            return (Criteria) this;
        }

        public Criteria andProjectimg1NotEqualTo(String value) {
            addCriterion("projectImg1 <>", value, "projectimg1");
            return (Criteria) this;
        }

        public Criteria andProjectimg1GreaterThan(String value) {
            addCriterion("projectImg1 >", value, "projectimg1");
            return (Criteria) this;
        }

        public Criteria andProjectimg1GreaterThanOrEqualTo(String value) {
            addCriterion("projectImg1 >=", value, "projectimg1");
            return (Criteria) this;
        }

        public Criteria andProjectimg1LessThan(String value) {
            addCriterion("projectImg1 <", value, "projectimg1");
            return (Criteria) this;
        }

        public Criteria andProjectimg1LessThanOrEqualTo(String value) {
            addCriterion("projectImg1 <=", value, "projectimg1");
            return (Criteria) this;
        }

        public Criteria andProjectimg1Like(String value) {
            addCriterion("projectImg1 like", value, "projectimg1");
            return (Criteria) this;
        }

        public Criteria andProjectimg1NotLike(String value) {
            addCriterion("projectImg1 not like", value, "projectimg1");
            return (Criteria) this;
        }

        public Criteria andProjectimg1In(List<String> values) {
            addCriterion("projectImg1 in", values, "projectimg1");
            return (Criteria) this;
        }

        public Criteria andProjectimg1NotIn(List<String> values) {
            addCriterion("projectImg1 not in", values, "projectimg1");
            return (Criteria) this;
        }

        public Criteria andProjectimg1Between(String value1, String value2) {
            addCriterion("projectImg1 between", value1, value2, "projectimg1");
            return (Criteria) this;
        }

        public Criteria andProjectimg1NotBetween(String value1, String value2) {
            addCriterion("projectImg1 not between", value1, value2, "projectimg1");
            return (Criteria) this;
        }

        public Criteria andProjectimg2IsNull() {
            addCriterion("projectImg2 is null");
            return (Criteria) this;
        }

        public Criteria andProjectimg2IsNotNull() {
            addCriterion("projectImg2 is not null");
            return (Criteria) this;
        }

        public Criteria andProjectimg2EqualTo(String value) {
            addCriterion("projectImg2 =", value, "projectimg2");
            return (Criteria) this;
        }

        public Criteria andProjectimg2NotEqualTo(String value) {
            addCriterion("projectImg2 <>", value, "projectimg2");
            return (Criteria) this;
        }

        public Criteria andProjectimg2GreaterThan(String value) {
            addCriterion("projectImg2 >", value, "projectimg2");
            return (Criteria) this;
        }

        public Criteria andProjectimg2GreaterThanOrEqualTo(String value) {
            addCriterion("projectImg2 >=", value, "projectimg2");
            return (Criteria) this;
        }

        public Criteria andProjectimg2LessThan(String value) {
            addCriterion("projectImg2 <", value, "projectimg2");
            return (Criteria) this;
        }

        public Criteria andProjectimg2LessThanOrEqualTo(String value) {
            addCriterion("projectImg2 <=", value, "projectimg2");
            return (Criteria) this;
        }

        public Criteria andProjectimg2Like(String value) {
            addCriterion("projectImg2 like", value, "projectimg2");
            return (Criteria) this;
        }

        public Criteria andProjectimg2NotLike(String value) {
            addCriterion("projectImg2 not like", value, "projectimg2");
            return (Criteria) this;
        }

        public Criteria andProjectimg2In(List<String> values) {
            addCriterion("projectImg2 in", values, "projectimg2");
            return (Criteria) this;
        }

        public Criteria andProjectimg2NotIn(List<String> values) {
            addCriterion("projectImg2 not in", values, "projectimg2");
            return (Criteria) this;
        }

        public Criteria andProjectimg2Between(String value1, String value2) {
            addCriterion("projectImg2 between", value1, value2, "projectimg2");
            return (Criteria) this;
        }

        public Criteria andProjectimg2NotBetween(String value1, String value2) {
            addCriterion("projectImg2 not between", value1, value2, "projectimg2");
            return (Criteria) this;
        }

        public Criteria andProjectimg3IsNull() {
            addCriterion("projectImg3 is null");
            return (Criteria) this;
        }

        public Criteria andProjectimg3IsNotNull() {
            addCriterion("projectImg3 is not null");
            return (Criteria) this;
        }

        public Criteria andProjectimg3EqualTo(String value) {
            addCriterion("projectImg3 =", value, "projectimg3");
            return (Criteria) this;
        }

        public Criteria andProjectimg3NotEqualTo(String value) {
            addCriterion("projectImg3 <>", value, "projectimg3");
            return (Criteria) this;
        }

        public Criteria andProjectimg3GreaterThan(String value) {
            addCriterion("projectImg3 >", value, "projectimg3");
            return (Criteria) this;
        }

        public Criteria andProjectimg3GreaterThanOrEqualTo(String value) {
            addCriterion("projectImg3 >=", value, "projectimg3");
            return (Criteria) this;
        }

        public Criteria andProjectimg3LessThan(String value) {
            addCriterion("projectImg3 <", value, "projectimg3");
            return (Criteria) this;
        }

        public Criteria andProjectimg3LessThanOrEqualTo(String value) {
            addCriterion("projectImg3 <=", value, "projectimg3");
            return (Criteria) this;
        }

        public Criteria andProjectimg3Like(String value) {
            addCriterion("projectImg3 like", value, "projectimg3");
            return (Criteria) this;
        }

        public Criteria andProjectimg3NotLike(String value) {
            addCriterion("projectImg3 not like", value, "projectimg3");
            return (Criteria) this;
        }

        public Criteria andProjectimg3In(List<String> values) {
            addCriterion("projectImg3 in", values, "projectimg3");
            return (Criteria) this;
        }

        public Criteria andProjectimg3NotIn(List<String> values) {
            addCriterion("projectImg3 not in", values, "projectimg3");
            return (Criteria) this;
        }

        public Criteria andProjectimg3Between(String value1, String value2) {
            addCriterion("projectImg3 between", value1, value2, "projectimg3");
            return (Criteria) this;
        }

        public Criteria andProjectimg3NotBetween(String value1, String value2) {
            addCriterion("projectImg3 not between", value1, value2, "projectimg3");
            return (Criteria) this;
        }

        public Criteria andProjectimg4IsNull() {
            addCriterion("projectImg4 is null");
            return (Criteria) this;
        }

        public Criteria andProjectimg4IsNotNull() {
            addCriterion("projectImg4 is not null");
            return (Criteria) this;
        }

        public Criteria andProjectimg4EqualTo(String value) {
            addCriterion("projectImg4 =", value, "projectimg4");
            return (Criteria) this;
        }

        public Criteria andProjectimg4NotEqualTo(String value) {
            addCriterion("projectImg4 <>", value, "projectimg4");
            return (Criteria) this;
        }

        public Criteria andProjectimg4GreaterThan(String value) {
            addCriterion("projectImg4 >", value, "projectimg4");
            return (Criteria) this;
        }

        public Criteria andProjectimg4GreaterThanOrEqualTo(String value) {
            addCriterion("projectImg4 >=", value, "projectimg4");
            return (Criteria) this;
        }

        public Criteria andProjectimg4LessThan(String value) {
            addCriterion("projectImg4 <", value, "projectimg4");
            return (Criteria) this;
        }

        public Criteria andProjectimg4LessThanOrEqualTo(String value) {
            addCriterion("projectImg4 <=", value, "projectimg4");
            return (Criteria) this;
        }

        public Criteria andProjectimg4Like(String value) {
            addCriterion("projectImg4 like", value, "projectimg4");
            return (Criteria) this;
        }

        public Criteria andProjectimg4NotLike(String value) {
            addCriterion("projectImg4 not like", value, "projectimg4");
            return (Criteria) this;
        }

        public Criteria andProjectimg4In(List<String> values) {
            addCriterion("projectImg4 in", values, "projectimg4");
            return (Criteria) this;
        }

        public Criteria andProjectimg4NotIn(List<String> values) {
            addCriterion("projectImg4 not in", values, "projectimg4");
            return (Criteria) this;
        }

        public Criteria andProjectimg4Between(String value1, String value2) {
            addCriterion("projectImg4 between", value1, value2, "projectimg4");
            return (Criteria) this;
        }

        public Criteria andProjectimg4NotBetween(String value1, String value2) {
            addCriterion("projectImg4 not between", value1, value2, "projectimg4");
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

        public Criteria andProjectuserIsNull() {
            addCriterion("projectUser is null");
            return (Criteria) this;
        }

        public Criteria andProjectuserIsNotNull() {
            addCriterion("projectUser is not null");
            return (Criteria) this;
        }

        public Criteria andProjectuserEqualTo(String value) {
            addCriterion("projectUser =", value, "projectuser");
            return (Criteria) this;
        }

        public Criteria andProjectuserNotEqualTo(String value) {
            addCriterion("projectUser <>", value, "projectuser");
            return (Criteria) this;
        }

        public Criteria andProjectuserGreaterThan(String value) {
            addCriterion("projectUser >", value, "projectuser");
            return (Criteria) this;
        }

        public Criteria andProjectuserGreaterThanOrEqualTo(String value) {
            addCriterion("projectUser >=", value, "projectuser");
            return (Criteria) this;
        }

        public Criteria andProjectuserLessThan(String value) {
            addCriterion("projectUser <", value, "projectuser");
            return (Criteria) this;
        }

        public Criteria andProjectuserLessThanOrEqualTo(String value) {
            addCriterion("projectUser <=", value, "projectuser");
            return (Criteria) this;
        }

        public Criteria andProjectuserLike(String value) {
            addCriterion("projectUser like", value, "projectuser");
            return (Criteria) this;
        }

        public Criteria andProjectuserNotLike(String value) {
            addCriterion("projectUser not like", value, "projectuser");
            return (Criteria) this;
        }

        public Criteria andProjectuserIn(List<String> values) {
            addCriterion("projectUser in", values, "projectuser");
            return (Criteria) this;
        }

        public Criteria andProjectuserNotIn(List<String> values) {
            addCriterion("projectUser not in", values, "projectuser");
            return (Criteria) this;
        }

        public Criteria andProjectuserBetween(String value1, String value2) {
            addCriterion("projectUser between", value1, value2, "projectuser");
            return (Criteria) this;
        }

        public Criteria andProjectuserNotBetween(String value1, String value2) {
            addCriterion("projectUser not between", value1, value2, "projectuser");
            return (Criteria) this;
        }

        public Criteria andProjectaddressIsNull() {
            addCriterion("projectAddress is null");
            return (Criteria) this;
        }

        public Criteria andProjectaddressIsNotNull() {
            addCriterion("projectAddress is not null");
            return (Criteria) this;
        }

        public Criteria andProjectaddressEqualTo(String value) {
            addCriterion("projectAddress =", value, "projectaddress");
            return (Criteria) this;
        }

        public Criteria andProjectaddressNotEqualTo(String value) {
            addCriterion("projectAddress <>", value, "projectaddress");
            return (Criteria) this;
        }

        public Criteria andProjectaddressGreaterThan(String value) {
            addCriterion("projectAddress >", value, "projectaddress");
            return (Criteria) this;
        }

        public Criteria andProjectaddressGreaterThanOrEqualTo(String value) {
            addCriterion("projectAddress >=", value, "projectaddress");
            return (Criteria) this;
        }

        public Criteria andProjectaddressLessThan(String value) {
            addCriterion("projectAddress <", value, "projectaddress");
            return (Criteria) this;
        }

        public Criteria andProjectaddressLessThanOrEqualTo(String value) {
            addCriterion("projectAddress <=", value, "projectaddress");
            return (Criteria) this;
        }

        public Criteria andProjectaddressLike(String value) {
            addCriterion("projectAddress like", value, "projectaddress");
            return (Criteria) this;
        }

        public Criteria andProjectaddressNotLike(String value) {
            addCriterion("projectAddress not like", value, "projectaddress");
            return (Criteria) this;
        }

        public Criteria andProjectaddressIn(List<String> values) {
            addCriterion("projectAddress in", values, "projectaddress");
            return (Criteria) this;
        }

        public Criteria andProjectaddressNotIn(List<String> values) {
            addCriterion("projectAddress not in", values, "projectaddress");
            return (Criteria) this;
        }

        public Criteria andProjectaddressBetween(String value1, String value2) {
            addCriterion("projectAddress between", value1, value2, "projectaddress");
            return (Criteria) this;
        }

        public Criteria andProjectaddressNotBetween(String value1, String value2) {
            addCriterion("projectAddress not between", value1, value2, "projectaddress");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIsNull() {
            addCriterion("projectType is null");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIsNotNull() {
            addCriterion("projectType is not null");
            return (Criteria) this;
        }

        public Criteria andProjecttypeEqualTo(String value) {
            addCriterion("projectType =", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeNotEqualTo(String value) {
            addCriterion("projectType <>", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeGreaterThan(String value) {
            addCriterion("projectType >", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeGreaterThanOrEqualTo(String value) {
            addCriterion("projectType >=", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeLessThan(String value) {
            addCriterion("projectType <", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeLessThanOrEqualTo(String value) {
            addCriterion("projectType <=", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeLike(String value) {
            addCriterion("projectType like", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeNotLike(String value) {
            addCriterion("projectType not like", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIn(List<String> values) {
            addCriterion("projectType in", values, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeNotIn(List<String> values) {
            addCriterion("projectType not in", values, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeBetween(String value1, String value2) {
            addCriterion("projectType between", value1, value2, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeNotBetween(String value1, String value2) {
            addCriterion("projectType not between", value1, value2, "projecttype");
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