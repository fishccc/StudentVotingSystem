package com.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class VoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VoteExample() {
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

        public Criteria andLecturerIdIsNull() {
            addCriterion("lecturer_id is null");
            return (Criteria) this;
        }

        public Criteria andLecturerIdIsNotNull() {
            addCriterion("lecturer_id is not null");
            return (Criteria) this;
        }

        public Criteria andLecturerIdEqualTo(Integer value) {
            addCriterion("lecturer_id =", value, "lecturerId");
            return (Criteria) this;
        }

        public Criteria andLecturerIdNotEqualTo(Integer value) {
            addCriterion("lecturer_id <>", value, "lecturerId");
            return (Criteria) this;
        }

        public Criteria andLecturerIdGreaterThan(Integer value) {
            addCriterion("lecturer_id >", value, "lecturerId");
            return (Criteria) this;
        }

        public Criteria andLecturerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lecturer_id >=", value, "lecturerId");
            return (Criteria) this;
        }

        public Criteria andLecturerIdLessThan(Integer value) {
            addCriterion("lecturer_id <", value, "lecturerId");
            return (Criteria) this;
        }

        public Criteria andLecturerIdLessThanOrEqualTo(Integer value) {
            addCriterion("lecturer_id <=", value, "lecturerId");
            return (Criteria) this;
        }

        public Criteria andLecturerIdIn(List<Integer> values) {
            addCriterion("lecturer_id in", values, "lecturerId");
            return (Criteria) this;
        }

        public Criteria andLecturerIdNotIn(List<Integer> values) {
            addCriterion("lecturer_id not in", values, "lecturerId");
            return (Criteria) this;
        }

        public Criteria andLecturerIdBetween(Integer value1, Integer value2) {
            addCriterion("lecturer_id between", value1, value2, "lecturerId");
            return (Criteria) this;
        }

        public Criteria andLecturerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lecturer_id not between", value1, value2, "lecturerId");
            return (Criteria) this;
        }

        public Criteria andOption1IsNull() {
            addCriterion("option1 is null");
            return (Criteria) this;
        }

        public Criteria andOption1IsNotNull() {
            addCriterion("option1 is not null");
            return (Criteria) this;
        }

        public Criteria andOption1EqualTo(String value) {
            addCriterion("option1 =", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1NotEqualTo(String value) {
            addCriterion("option1 <>", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1GreaterThan(String value) {
            addCriterion("option1 >", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1GreaterThanOrEqualTo(String value) {
            addCriterion("option1 >=", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1LessThan(String value) {
            addCriterion("option1 <", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1LessThanOrEqualTo(String value) {
            addCriterion("option1 <=", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1Like(String value) {
            addCriterion("option1 like", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1NotLike(String value) {
            addCriterion("option1 not like", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1In(List<String> values) {
            addCriterion("option1 in", values, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1NotIn(List<String> values) {
            addCriterion("option1 not in", values, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1Between(String value1, String value2) {
            addCriterion("option1 between", value1, value2, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1NotBetween(String value1, String value2) {
            addCriterion("option1 not between", value1, value2, "option1");
            return (Criteria) this;
        }

        public Criteria andOption2IsNull() {
            addCriterion("option2 is null");
            return (Criteria) this;
        }

        public Criteria andOption2IsNotNull() {
            addCriterion("option2 is not null");
            return (Criteria) this;
        }

        public Criteria andOption2EqualTo(String value) {
            addCriterion("option2 =", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2NotEqualTo(String value) {
            addCriterion("option2 <>", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2GreaterThan(String value) {
            addCriterion("option2 >", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2GreaterThanOrEqualTo(String value) {
            addCriterion("option2 >=", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2LessThan(String value) {
            addCriterion("option2 <", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2LessThanOrEqualTo(String value) {
            addCriterion("option2 <=", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2Like(String value) {
            addCriterion("option2 like", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2NotLike(String value) {
            addCriterion("option2 not like", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2In(List<String> values) {
            addCriterion("option2 in", values, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2NotIn(List<String> values) {
            addCriterion("option2 not in", values, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2Between(String value1, String value2) {
            addCriterion("option2 between", value1, value2, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2NotBetween(String value1, String value2) {
            addCriterion("option2 not between", value1, value2, "option2");
            return (Criteria) this;
        }

        public Criteria andOption3IsNull() {
            addCriterion("option3 is null");
            return (Criteria) this;
        }

        public Criteria andOption3IsNotNull() {
            addCriterion("option3 is not null");
            return (Criteria) this;
        }

        public Criteria andOption3EqualTo(String value) {
            addCriterion("option3 =", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3NotEqualTo(String value) {
            addCriterion("option3 <>", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3GreaterThan(String value) {
            addCriterion("option3 >", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3GreaterThanOrEqualTo(String value) {
            addCriterion("option3 >=", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3LessThan(String value) {
            addCriterion("option3 <", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3LessThanOrEqualTo(String value) {
            addCriterion("option3 <=", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3Like(String value) {
            addCriterion("option3 like", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3NotLike(String value) {
            addCriterion("option3 not like", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3In(List<String> values) {
            addCriterion("option3 in", values, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3NotIn(List<String> values) {
            addCriterion("option3 not in", values, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3Between(String value1, String value2) {
            addCriterion("option3 between", value1, value2, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3NotBetween(String value1, String value2) {
            addCriterion("option3 not between", value1, value2, "option3");
            return (Criteria) this;
        }

        public Criteria andOption4IsNull() {
            addCriterion("option4 is null");
            return (Criteria) this;
        }

        public Criteria andOption4IsNotNull() {
            addCriterion("option4 is not null");
            return (Criteria) this;
        }

        public Criteria andOption4EqualTo(String value) {
            addCriterion("option4 =", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4NotEqualTo(String value) {
            addCriterion("option4 <>", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4GreaterThan(String value) {
            addCriterion("option4 >", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4GreaterThanOrEqualTo(String value) {
            addCriterion("option4 >=", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4LessThan(String value) {
            addCriterion("option4 <", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4LessThanOrEqualTo(String value) {
            addCriterion("option4 <=", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4Like(String value) {
            addCriterion("option4 like", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4NotLike(String value) {
            addCriterion("option4 not like", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4In(List<String> values) {
            addCriterion("option4 in", values, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4NotIn(List<String> values) {
            addCriterion("option4 not in", values, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4Between(String value1, String value2) {
            addCriterion("option4 between", value1, value2, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4NotBetween(String value1, String value2) {
            addCriterion("option4 not between", value1, value2, "option4");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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