package com.insuracne.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InsuracneOrderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_insuracne_order
     *
     * @mbggenerated Sat Mar 25 12:55:25 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_insuracne_order
     *
     * @mbggenerated Sat Mar 25 12:55:25 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_insuracne_order
     *
     * @mbggenerated Sat Mar 25 12:55:25 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_insuracne_order
     *
     * @mbggenerated Sat Mar 25 12:55:25 CST 2017
     */
    public InsuracneOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_insuracne_order
     *
     * @mbggenerated Sat Mar 25 12:55:25 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_insuracne_order
     *
     * @mbggenerated Sat Mar 25 12:55:25 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_insuracne_order
     *
     * @mbggenerated Sat Mar 25 12:55:25 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_insuracne_order
     *
     * @mbggenerated Sat Mar 25 12:55:25 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_insuracne_order
     *
     * @mbggenerated Sat Mar 25 12:55:25 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_insuracne_order
     *
     * @mbggenerated Sat Mar 25 12:55:25 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_insuracne_order
     *
     * @mbggenerated Sat Mar 25 12:55:25 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_insuracne_order
     *
     * @mbggenerated Sat Mar 25 12:55:25 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_insuracne_order
     *
     * @mbggenerated Sat Mar 25 12:55:25 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_insuracne_order
     *
     * @mbggenerated Sat Mar 25 12:55:25 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_insuracne_order
     *
     * @mbggenerated Sat Mar 25 12:55:25 CST 2017
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andInsNoIsNull() {
            addCriterion("ins_no is null");
            return (Criteria) this;
        }

        public Criteria andInsNoIsNotNull() {
            addCriterion("ins_no is not null");
            return (Criteria) this;
        }

        public Criteria andInsNoEqualTo(String value) {
            addCriterion("ins_no =", value, "insNo");
            return (Criteria) this;
        }

        public Criteria andInsNoNotEqualTo(String value) {
            addCriterion("ins_no <>", value, "insNo");
            return (Criteria) this;
        }

        public Criteria andInsNoGreaterThan(String value) {
            addCriterion("ins_no >", value, "insNo");
            return (Criteria) this;
        }

        public Criteria andInsNoGreaterThanOrEqualTo(String value) {
            addCriterion("ins_no >=", value, "insNo");
            return (Criteria) this;
        }

        public Criteria andInsNoLessThan(String value) {
            addCriterion("ins_no <", value, "insNo");
            return (Criteria) this;
        }

        public Criteria andInsNoLessThanOrEqualTo(String value) {
            addCriterion("ins_no <=", value, "insNo");
            return (Criteria) this;
        }

        public Criteria andInsNoLike(String value) {
            addCriterion("ins_no like", value, "insNo");
            return (Criteria) this;
        }

        public Criteria andInsNoNotLike(String value) {
            addCriterion("ins_no not like", value, "insNo");
            return (Criteria) this;
        }

        public Criteria andInsNoIn(List<String> values) {
            addCriterion("ins_no in", values, "insNo");
            return (Criteria) this;
        }

        public Criteria andInsNoNotIn(List<String> values) {
            addCriterion("ins_no not in", values, "insNo");
            return (Criteria) this;
        }

        public Criteria andInsNoBetween(String value1, String value2) {
            addCriterion("ins_no between", value1, value2, "insNo");
            return (Criteria) this;
        }

        public Criteria andInsNoNotBetween(String value1, String value2) {
            addCriterion("ins_no not between", value1, value2, "insNo");
            return (Criteria) this;
        }

        public Criteria andBeneIdIsNull() {
            addCriterion("bene_id is null");
            return (Criteria) this;
        }

        public Criteria andBeneIdIsNotNull() {
            addCriterion("bene_id is not null");
            return (Criteria) this;
        }

        public Criteria andBeneIdEqualTo(Long value) {
            addCriterion("bene_id =", value, "beneId");
            return (Criteria) this;
        }

        public Criteria andBeneIdNotEqualTo(Long value) {
            addCriterion("bene_id <>", value, "beneId");
            return (Criteria) this;
        }

        public Criteria andBeneIdGreaterThan(Long value) {
            addCriterion("bene_id >", value, "beneId");
            return (Criteria) this;
        }

        public Criteria andBeneIdGreaterThanOrEqualTo(Long value) {
            addCriterion("bene_id >=", value, "beneId");
            return (Criteria) this;
        }

        public Criteria andBeneIdLessThan(Long value) {
            addCriterion("bene_id <", value, "beneId");
            return (Criteria) this;
        }

        public Criteria andBeneIdLessThanOrEqualTo(Long value) {
            addCriterion("bene_id <=", value, "beneId");
            return (Criteria) this;
        }

        public Criteria andBeneIdIn(List<Long> values) {
            addCriterion("bene_id in", values, "beneId");
            return (Criteria) this;
        }

        public Criteria andBeneIdNotIn(List<Long> values) {
            addCriterion("bene_id not in", values, "beneId");
            return (Criteria) this;
        }

        public Criteria andBeneIdBetween(Long value1, Long value2) {
            addCriterion("bene_id between", value1, value2, "beneId");
            return (Criteria) this;
        }

        public Criteria andBeneIdNotBetween(Long value1, Long value2) {
            addCriterion("bene_id not between", value1, value2, "beneId");
            return (Criteria) this;
        }

        public Criteria andInsTypeIsNull() {
            addCriterion("ins_type is null");
            return (Criteria) this;
        }

        public Criteria andInsTypeIsNotNull() {
            addCriterion("ins_type is not null");
            return (Criteria) this;
        }

        public Criteria andInsTypeEqualTo(Integer value) {
            addCriterion("ins_type =", value, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeNotEqualTo(Integer value) {
            addCriterion("ins_type <>", value, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeGreaterThan(Integer value) {
            addCriterion("ins_type >", value, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ins_type >=", value, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeLessThan(Integer value) {
            addCriterion("ins_type <", value, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ins_type <=", value, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeIn(List<Integer> values) {
            addCriterion("ins_type in", values, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeNotIn(List<Integer> values) {
            addCriterion("ins_type not in", values, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeBetween(Integer value1, Integer value2) {
            addCriterion("ins_type between", value1, value2, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ins_type not between", value1, value2, "insType");
            return (Criteria) this;
        }

        public Criteria andBeneAmountIsNull() {
            addCriterion("bene_amount is null");
            return (Criteria) this;
        }

        public Criteria andBeneAmountIsNotNull() {
            addCriterion("bene_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBeneAmountEqualTo(BigDecimal value) {
            addCriterion("bene_amount =", value, "beneAmount");
            return (Criteria) this;
        }

        public Criteria andBeneAmountNotEqualTo(BigDecimal value) {
            addCriterion("bene_amount <>", value, "beneAmount");
            return (Criteria) this;
        }

        public Criteria andBeneAmountGreaterThan(BigDecimal value) {
            addCriterion("bene_amount >", value, "beneAmount");
            return (Criteria) this;
        }

        public Criteria andBeneAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("bene_amount >=", value, "beneAmount");
            return (Criteria) this;
        }

        public Criteria andBeneAmountLessThan(BigDecimal value) {
            addCriterion("bene_amount <", value, "beneAmount");
            return (Criteria) this;
        }

        public Criteria andBeneAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bene_amount <=", value, "beneAmount");
            return (Criteria) this;
        }

        public Criteria andBeneAmountIn(List<BigDecimal> values) {
            addCriterion("bene_amount in", values, "beneAmount");
            return (Criteria) this;
        }

        public Criteria andBeneAmountNotIn(List<BigDecimal> values) {
            addCriterion("bene_amount not in", values, "beneAmount");
            return (Criteria) this;
        }

        public Criteria andBeneAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bene_amount between", value1, value2, "beneAmount");
            return (Criteria) this;
        }

        public Criteria andBeneAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bene_amount not between", value1, value2, "beneAmount");
            return (Criteria) this;
        }

        public Criteria andBeneYearIsNull() {
            addCriterion("bene_year is null");
            return (Criteria) this;
        }

        public Criteria andBeneYearIsNotNull() {
            addCriterion("bene_year is not null");
            return (Criteria) this;
        }

        public Criteria andBeneYearEqualTo(Integer value) {
            addCriterion("bene_year =", value, "beneYear");
            return (Criteria) this;
        }

        public Criteria andBeneYearNotEqualTo(Integer value) {
            addCriterion("bene_year <>", value, "beneYear");
            return (Criteria) this;
        }

        public Criteria andBeneYearGreaterThan(Integer value) {
            addCriterion("bene_year >", value, "beneYear");
            return (Criteria) this;
        }

        public Criteria andBeneYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("bene_year >=", value, "beneYear");
            return (Criteria) this;
        }

        public Criteria andBeneYearLessThan(Integer value) {
            addCriterion("bene_year <", value, "beneYear");
            return (Criteria) this;
        }

        public Criteria andBeneYearLessThanOrEqualTo(Integer value) {
            addCriterion("bene_year <=", value, "beneYear");
            return (Criteria) this;
        }

        public Criteria andBeneYearIn(List<Integer> values) {
            addCriterion("bene_year in", values, "beneYear");
            return (Criteria) this;
        }

        public Criteria andBeneYearNotIn(List<Integer> values) {
            addCriterion("bene_year not in", values, "beneYear");
            return (Criteria) this;
        }

        public Criteria andBeneYearBetween(Integer value1, Integer value2) {
            addCriterion("bene_year between", value1, value2, "beneYear");
            return (Criteria) this;
        }

        public Criteria andBeneYearNotBetween(Integer value1, Integer value2) {
            addCriterion("bene_year not between", value1, value2, "beneYear");
            return (Criteria) this;
        }

        public Criteria andInsStartDateIsNull() {
            addCriterion("ins_start_date is null");
            return (Criteria) this;
        }

        public Criteria andInsStartDateIsNotNull() {
            addCriterion("ins_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andInsStartDateEqualTo(Date value) {
            addCriterion("ins_start_date =", value, "insStartDate");
            return (Criteria) this;
        }

        public Criteria andInsStartDateNotEqualTo(Date value) {
            addCriterion("ins_start_date <>", value, "insStartDate");
            return (Criteria) this;
        }

        public Criteria andInsStartDateGreaterThan(Date value) {
            addCriterion("ins_start_date >", value, "insStartDate");
            return (Criteria) this;
        }

        public Criteria andInsStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ins_start_date >=", value, "insStartDate");
            return (Criteria) this;
        }

        public Criteria andInsStartDateLessThan(Date value) {
            addCriterion("ins_start_date <", value, "insStartDate");
            return (Criteria) this;
        }

        public Criteria andInsStartDateLessThanOrEqualTo(Date value) {
            addCriterion("ins_start_date <=", value, "insStartDate");
            return (Criteria) this;
        }

        public Criteria andInsStartDateIn(List<Date> values) {
            addCriterion("ins_start_date in", values, "insStartDate");
            return (Criteria) this;
        }

        public Criteria andInsStartDateNotIn(List<Date> values) {
            addCriterion("ins_start_date not in", values, "insStartDate");
            return (Criteria) this;
        }

        public Criteria andInsStartDateBetween(Date value1, Date value2) {
            addCriterion("ins_start_date between", value1, value2, "insStartDate");
            return (Criteria) this;
        }

        public Criteria andInsStartDateNotBetween(Date value1, Date value2) {
            addCriterion("ins_start_date not between", value1, value2, "insStartDate");
            return (Criteria) this;
        }

        public Criteria andInsYearIsNull() {
            addCriterion("ins_year is null");
            return (Criteria) this;
        }

        public Criteria andInsYearIsNotNull() {
            addCriterion("ins_year is not null");
            return (Criteria) this;
        }

        public Criteria andInsYearEqualTo(Integer value) {
            addCriterion("ins_year =", value, "insYear");
            return (Criteria) this;
        }

        public Criteria andInsYearNotEqualTo(Integer value) {
            addCriterion("ins_year <>", value, "insYear");
            return (Criteria) this;
        }

        public Criteria andInsYearGreaterThan(Integer value) {
            addCriterion("ins_year >", value, "insYear");
            return (Criteria) this;
        }

        public Criteria andInsYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("ins_year >=", value, "insYear");
            return (Criteria) this;
        }

        public Criteria andInsYearLessThan(Integer value) {
            addCriterion("ins_year <", value, "insYear");
            return (Criteria) this;
        }

        public Criteria andInsYearLessThanOrEqualTo(Integer value) {
            addCriterion("ins_year <=", value, "insYear");
            return (Criteria) this;
        }

        public Criteria andInsYearIn(List<Integer> values) {
            addCriterion("ins_year in", values, "insYear");
            return (Criteria) this;
        }

        public Criteria andInsYearNotIn(List<Integer> values) {
            addCriterion("ins_year not in", values, "insYear");
            return (Criteria) this;
        }

        public Criteria andInsYearBetween(Integer value1, Integer value2) {
            addCriterion("ins_year between", value1, value2, "insYear");
            return (Criteria) this;
        }

        public Criteria andInsYearNotBetween(Integer value1, Integer value2) {
            addCriterion("ins_year not between", value1, value2, "insYear");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(Long value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(Long value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(Long value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(Long value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(Long value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(Long value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<Long> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<Long> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(Long value1, Long value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(Long value1, Long value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(Long value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Long value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Long value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Long value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Long value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Long value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Long> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Long> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Long value1, Long value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Long value1, Long value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Byte value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Byte value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Byte value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Byte value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Byte value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Byte> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Byte> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Byte value1, Byte value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_insuracne_order
     *
     * @mbggenerated do_not_delete_during_merge Sat Mar 25 12:55:25 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_insuracne_order
     *
     * @mbggenerated Sat Mar 25 12:55:25 CST 2017
     */
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