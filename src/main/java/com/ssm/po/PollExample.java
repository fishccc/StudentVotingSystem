package com.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class PollExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PollExample() {
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

        public Criteria andVoteIdIsNull() {
            addCriterion("vote_id is null");
            return (Criteria) this;
        }

        public Criteria andVoteIdIsNotNull() {
            addCriterion("vote_id is not null");
            return (Criteria) this;
        }

        public Criteria andVoteIdEqualTo(Integer value) {
            addCriterion("vote_id =", value, "voteId");
            return (Criteria) this;
        }

        public Criteria andVoteIdNotEqualTo(Integer value) {
            addCriterion("vote_id <>", value, "voteId");
            return (Criteria) this;
        }

        public Criteria andVoteIdGreaterThan(Integer value) {
            addCriterion("vote_id >", value, "voteId");
            return (Criteria) this;
        }

        public Criteria andVoteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vote_id >=", value, "voteId");
            return (Criteria) this;
        }

        public Criteria andVoteIdLessThan(Integer value) {
            addCriterion("vote_id <", value, "voteId");
            return (Criteria) this;
        }

        public Criteria andVoteIdLessThanOrEqualTo(Integer value) {
            addCriterion("vote_id <=", value, "voteId");
            return (Criteria) this;
        }

        public Criteria andVoteIdIn(List<Integer> values) {
            addCriterion("vote_id in", values, "voteId");
            return (Criteria) this;
        }

        public Criteria andVoteIdNotIn(List<Integer> values) {
            addCriterion("vote_id not in", values, "voteId");
            return (Criteria) this;
        }

        public Criteria andVoteIdBetween(Integer value1, Integer value2) {
            addCriterion("vote_id between", value1, value2, "voteId");
            return (Criteria) this;
        }

        public Criteria andVoteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vote_id not between", value1, value2, "voteId");
            return (Criteria) this;
        }

        public Criteria andOption1NumIsNull() {
            addCriterion("option1_num is null");
            return (Criteria) this;
        }

        public Criteria andOption1NumIsNotNull() {
            addCriterion("option1_num is not null");
            return (Criteria) this;
        }

        public Criteria andOption1NumEqualTo(Integer value) {
            addCriterion("option1_num =", value, "option1Num");
            return (Criteria) this;
        }

        public Criteria andOption1NumNotEqualTo(Integer value) {
            addCriterion("option1_num <>", value, "option1Num");
            return (Criteria) this;
        }

        public Criteria andOption1NumGreaterThan(Integer value) {
            addCriterion("option1_num >", value, "option1Num");
            return (Criteria) this;
        }

        public Criteria andOption1NumGreaterThanOrEqualTo(Integer value) {
            addCriterion("option1_num >=", value, "option1Num");
            return (Criteria) this;
        }

        public Criteria andOption1NumLessThan(Integer value) {
            addCriterion("option1_num <", value, "option1Num");
            return (Criteria) this;
        }

        public Criteria andOption1NumLessThanOrEqualTo(Integer value) {
            addCriterion("option1_num <=", value, "option1Num");
            return (Criteria) this;
        }

        public Criteria andOption1NumIn(List<Integer> values) {
            addCriterion("option1_num in", values, "option1Num");
            return (Criteria) this;
        }

        public Criteria andOption1NumNotIn(List<Integer> values) {
            addCriterion("option1_num not in", values, "option1Num");
            return (Criteria) this;
        }

        public Criteria andOption1NumBetween(Integer value1, Integer value2) {
            addCriterion("option1_num between", value1, value2, "option1Num");
            return (Criteria) this;
        }

        public Criteria andOption1NumNotBetween(Integer value1, Integer value2) {
            addCriterion("option1_num not between", value1, value2, "option1Num");
            return (Criteria) this;
        }

        public Criteria andOption2NumIsNull() {
            addCriterion("option2_num is null");
            return (Criteria) this;
        }

        public Criteria andOption2NumIsNotNull() {
            addCriterion("option2_num is not null");
            return (Criteria) this;
        }

        public Criteria andOption2NumEqualTo(Integer value) {
            addCriterion("option2_num =", value, "option2Num");
            return (Criteria) this;
        }

        public Criteria andOption2NumNotEqualTo(Integer value) {
            addCriterion("option2_num <>", value, "option2Num");
            return (Criteria) this;
        }

        public Criteria andOption2NumGreaterThan(Integer value) {
            addCriterion("option2_num >", value, "option2Num");
            return (Criteria) this;
        }

        public Criteria andOption2NumGreaterThanOrEqualTo(Integer value) {
            addCriterion("option2_num >=", value, "option2Num");
            return (Criteria) this;
        }

        public Criteria andOption2NumLessThan(Integer value) {
            addCriterion("option2_num <", value, "option2Num");
            return (Criteria) this;
        }

        public Criteria andOption2NumLessThanOrEqualTo(Integer value) {
            addCriterion("option2_num <=", value, "option2Num");
            return (Criteria) this;
        }

        public Criteria andOption2NumIn(List<Integer> values) {
            addCriterion("option2_num in", values, "option2Num");
            return (Criteria) this;
        }

        public Criteria andOption2NumNotIn(List<Integer> values) {
            addCriterion("option2_num not in", values, "option2Num");
            return (Criteria) this;
        }

        public Criteria andOption2NumBetween(Integer value1, Integer value2) {
            addCriterion("option2_num between", value1, value2, "option2Num");
            return (Criteria) this;
        }

        public Criteria andOption2NumNotBetween(Integer value1, Integer value2) {
            addCriterion("option2_num not between", value1, value2, "option2Num");
            return (Criteria) this;
        }

        public Criteria andOption3NumIsNull() {
            addCriterion("option3_num is null");
            return (Criteria) this;
        }

        public Criteria andOption3NumIsNotNull() {
            addCriterion("option3_num is not null");
            return (Criteria) this;
        }

        public Criteria andOption3NumEqualTo(Integer value) {
            addCriterion("option3_num =", value, "option3Num");
            return (Criteria) this;
        }

        public Criteria andOption3NumNotEqualTo(Integer value) {
            addCriterion("option3_num <>", value, "option3Num");
            return (Criteria) this;
        }

        public Criteria andOption3NumGreaterThan(Integer value) {
            addCriterion("option3_num >", value, "option3Num");
            return (Criteria) this;
        }

        public Criteria andOption3NumGreaterThanOrEqualTo(Integer value) {
            addCriterion("option3_num >=", value, "option3Num");
            return (Criteria) this;
        }

        public Criteria andOption3NumLessThan(Integer value) {
            addCriterion("option3_num <", value, "option3Num");
            return (Criteria) this;
        }

        public Criteria andOption3NumLessThanOrEqualTo(Integer value) {
            addCriterion("option3_num <=", value, "option3Num");
            return (Criteria) this;
        }

        public Criteria andOption3NumIn(List<Integer> values) {
            addCriterion("option3_num in", values, "option3Num");
            return (Criteria) this;
        }

        public Criteria andOption3NumNotIn(List<Integer> values) {
            addCriterion("option3_num not in", values, "option3Num");
            return (Criteria) this;
        }

        public Criteria andOption3NumBetween(Integer value1, Integer value2) {
            addCriterion("option3_num between", value1, value2, "option3Num");
            return (Criteria) this;
        }

        public Criteria andOption3NumNotBetween(Integer value1, Integer value2) {
            addCriterion("option3_num not between", value1, value2, "option3Num");
            return (Criteria) this;
        }

        public Criteria andOption4NumIsNull() {
            addCriterion("option4_num is null");
            return (Criteria) this;
        }

        public Criteria andOption4NumIsNotNull() {
            addCriterion("option4_num is not null");
            return (Criteria) this;
        }

        public Criteria andOption4NumEqualTo(Integer value) {
            addCriterion("option4_num =", value, "option4Num");
            return (Criteria) this;
        }

        public Criteria andOption4NumNotEqualTo(Integer value) {
            addCriterion("option4_num <>", value, "option4Num");
            return (Criteria) this;
        }

        public Criteria andOption4NumGreaterThan(Integer value) {
            addCriterion("option4_num >", value, "option4Num");
            return (Criteria) this;
        }

        public Criteria andOption4NumGreaterThanOrEqualTo(Integer value) {
            addCriterion("option4_num >=", value, "option4Num");
            return (Criteria) this;
        }

        public Criteria andOption4NumLessThan(Integer value) {
            addCriterion("option4_num <", value, "option4Num");
            return (Criteria) this;
        }

        public Criteria andOption4NumLessThanOrEqualTo(Integer value) {
            addCriterion("option4_num <=", value, "option4Num");
            return (Criteria) this;
        }

        public Criteria andOption4NumIn(List<Integer> values) {
            addCriterion("option4_num in", values, "option4Num");
            return (Criteria) this;
        }

        public Criteria andOption4NumNotIn(List<Integer> values) {
            addCriterion("option4_num not in", values, "option4Num");
            return (Criteria) this;
        }

        public Criteria andOption4NumBetween(Integer value1, Integer value2) {
            addCriterion("option4_num between", value1, value2, "option4Num");
            return (Criteria) this;
        }

        public Criteria andOption4NumNotBetween(Integer value1, Integer value2) {
            addCriterion("option4_num not between", value1, value2, "option4Num");
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