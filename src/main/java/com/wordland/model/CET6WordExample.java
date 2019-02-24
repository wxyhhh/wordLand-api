package com.wordland.model;

import java.util.ArrayList;
import java.util.List;

public class CET6WordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CET6WordExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCet6NumIsNull() {
            addCriterion("cet6_num is null");
            return (Criteria) this;
        }

        public Criteria andCet6NumIsNotNull() {
            addCriterion("cet6_num is not null");
            return (Criteria) this;
        }

        public Criteria andCet6NumEqualTo(Integer value) {
            addCriterion("cet6_num =", value, "cet6Num");
            return (Criteria) this;
        }

        public Criteria andCet6NumNotEqualTo(Integer value) {
            addCriterion("cet6_num <>", value, "cet6Num");
            return (Criteria) this;
        }

        public Criteria andCet6NumGreaterThan(Integer value) {
            addCriterion("cet6_num >", value, "cet6Num");
            return (Criteria) this;
        }

        public Criteria andCet6NumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cet6_num >=", value, "cet6Num");
            return (Criteria) this;
        }

        public Criteria andCet6NumLessThan(Integer value) {
            addCriterion("cet6_num <", value, "cet6Num");
            return (Criteria) this;
        }

        public Criteria andCet6NumLessThanOrEqualTo(Integer value) {
            addCriterion("cet6_num <=", value, "cet6Num");
            return (Criteria) this;
        }

        public Criteria andCet6NumIn(List<Integer> values) {
            addCriterion("cet6_num in", values, "cet6Num");
            return (Criteria) this;
        }

        public Criteria andCet6NumNotIn(List<Integer> values) {
            addCriterion("cet6_num not in", values, "cet6Num");
            return (Criteria) this;
        }

        public Criteria andCet6NumBetween(Integer value1, Integer value2) {
            addCriterion("cet6_num between", value1, value2, "cet6Num");
            return (Criteria) this;
        }

        public Criteria andCet6NumNotBetween(Integer value1, Integer value2) {
            addCriterion("cet6_num not between", value1, value2, "cet6Num");
            return (Criteria) this;
        }

        public Criteria andCet6WordIsNull() {
            addCriterion("cet6_word is null");
            return (Criteria) this;
        }

        public Criteria andCet6WordIsNotNull() {
            addCriterion("cet6_word is not null");
            return (Criteria) this;
        }

        public Criteria andCet6WordEqualTo(String value) {
            addCriterion("cet6_word =", value, "cet6Word");
            return (Criteria) this;
        }

        public Criteria andCet6WordNotEqualTo(String value) {
            addCriterion("cet6_word <>", value, "cet6Word");
            return (Criteria) this;
        }

        public Criteria andCet6WordGreaterThan(String value) {
            addCriterion("cet6_word >", value, "cet6Word");
            return (Criteria) this;
        }

        public Criteria andCet6WordGreaterThanOrEqualTo(String value) {
            addCriterion("cet6_word >=", value, "cet6Word");
            return (Criteria) this;
        }

        public Criteria andCet6WordLessThan(String value) {
            addCriterion("cet6_word <", value, "cet6Word");
            return (Criteria) this;
        }

        public Criteria andCet6WordLessThanOrEqualTo(String value) {
            addCriterion("cet6_word <=", value, "cet6Word");
            return (Criteria) this;
        }

        public Criteria andCet6WordLike(String value) {
            addCriterion("cet6_word like", value, "cet6Word");
            return (Criteria) this;
        }

        public Criteria andCet6WordNotLike(String value) {
            addCriterion("cet6_word not like", value, "cet6Word");
            return (Criteria) this;
        }

        public Criteria andCet6WordIn(List<String> values) {
            addCriterion("cet6_word in", values, "cet6Word");
            return (Criteria) this;
        }

        public Criteria andCet6WordNotIn(List<String> values) {
            addCriterion("cet6_word not in", values, "cet6Word");
            return (Criteria) this;
        }

        public Criteria andCet6WordBetween(String value1, String value2) {
            addCriterion("cet6_word between", value1, value2, "cet6Word");
            return (Criteria) this;
        }

        public Criteria andCet6WordNotBetween(String value1, String value2) {
            addCriterion("cet6_word not between", value1, value2, "cet6Word");
            return (Criteria) this;
        }

        public Criteria andCet6DescribeIsNull() {
            addCriterion("cet6_describe is null");
            return (Criteria) this;
        }

        public Criteria andCet6DescribeIsNotNull() {
            addCriterion("cet6_describe is not null");
            return (Criteria) this;
        }

        public Criteria andCet6DescribeEqualTo(String value) {
            addCriterion("cet6_describe =", value, "cet6Describe");
            return (Criteria) this;
        }

        public Criteria andCet6DescribeNotEqualTo(String value) {
            addCriterion("cet6_describe <>", value, "cet6Describe");
            return (Criteria) this;
        }

        public Criteria andCet6DescribeGreaterThan(String value) {
            addCriterion("cet6_describe >", value, "cet6Describe");
            return (Criteria) this;
        }

        public Criteria andCet6DescribeGreaterThanOrEqualTo(String value) {
            addCriterion("cet6_describe >=", value, "cet6Describe");
            return (Criteria) this;
        }

        public Criteria andCet6DescribeLessThan(String value) {
            addCriterion("cet6_describe <", value, "cet6Describe");
            return (Criteria) this;
        }

        public Criteria andCet6DescribeLessThanOrEqualTo(String value) {
            addCriterion("cet6_describe <=", value, "cet6Describe");
            return (Criteria) this;
        }

        public Criteria andCet6DescribeLike(String value) {
            addCriterion("cet6_describe like", value, "cet6Describe");
            return (Criteria) this;
        }

        public Criteria andCet6DescribeNotLike(String value) {
            addCriterion("cet6_describe not like", value, "cet6Describe");
            return (Criteria) this;
        }

        public Criteria andCet6DescribeIn(List<String> values) {
            addCriterion("cet6_describe in", values, "cet6Describe");
            return (Criteria) this;
        }

        public Criteria andCet6DescribeNotIn(List<String> values) {
            addCriterion("cet6_describe not in", values, "cet6Describe");
            return (Criteria) this;
        }

        public Criteria andCet6DescribeBetween(String value1, String value2) {
            addCriterion("cet6_describe between", value1, value2, "cet6Describe");
            return (Criteria) this;
        }

        public Criteria andCet6DescribeNotBetween(String value1, String value2) {
            addCriterion("cet6_describe not between", value1, value2, "cet6Describe");
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