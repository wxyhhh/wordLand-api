package com.wordland.model;

import java.util.ArrayList;
import java.util.List;

public class CET4WordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CET4WordExample() {
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

        public Criteria andCet4NumIsNull() {
            addCriterion("cet4_num is null");
            return (Criteria) this;
        }

        public Criteria andCet4NumIsNotNull() {
            addCriterion("cet4_num is not null");
            return (Criteria) this;
        }

        public Criteria andCet4NumEqualTo(Integer value) {
            addCriterion("cet4_num =", value, "cet4Num");
            return (Criteria) this;
        }

        public Criteria andCet4NumNotEqualTo(Integer value) {
            addCriterion("cet4_num <>", value, "cet4Num");
            return (Criteria) this;
        }

        public Criteria andCet4NumGreaterThan(Integer value) {
            addCriterion("cet4_num >", value, "cet4Num");
            return (Criteria) this;
        }

        public Criteria andCet4NumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cet4_num >=", value, "cet4Num");
            return (Criteria) this;
        }

        public Criteria andCet4NumLessThan(Integer value) {
            addCriterion("cet4_num <", value, "cet4Num");
            return (Criteria) this;
        }

        public Criteria andCet4NumLessThanOrEqualTo(Integer value) {
            addCriterion("cet4_num <=", value, "cet4Num");
            return (Criteria) this;
        }

        public Criteria andCet4NumIn(List<Integer> values) {
            addCriterion("cet4_num in", values, "cet4Num");
            return (Criteria) this;
        }

        public Criteria andCet4NumNotIn(List<Integer> values) {
            addCriterion("cet4_num not in", values, "cet4Num");
            return (Criteria) this;
        }

        public Criteria andCet4NumBetween(Integer value1, Integer value2) {
            addCriterion("cet4_num between", value1, value2, "cet4Num");
            return (Criteria) this;
        }

        public Criteria andCet4NumNotBetween(Integer value1, Integer value2) {
            addCriterion("cet4_num not between", value1, value2, "cet4Num");
            return (Criteria) this;
        }

        public Criteria andCet4WordIsNull() {
            addCriterion("cet4_word is null");
            return (Criteria) this;
        }

        public Criteria andCet4WordIsNotNull() {
            addCriterion("cet4_word is not null");
            return (Criteria) this;
        }

        public Criteria andCet4WordEqualTo(String value) {
            addCriterion("cet4_word =", value, "cet4Word");
            return (Criteria) this;
        }

        public Criteria andCet4WordNotEqualTo(String value) {
            addCriterion("cet4_word <>", value, "cet4Word");
            return (Criteria) this;
        }

        public Criteria andCet4WordGreaterThan(String value) {
            addCriterion("cet4_word >", value, "cet4Word");
            return (Criteria) this;
        }

        public Criteria andCet4WordGreaterThanOrEqualTo(String value) {
            addCriterion("cet4_word >=", value, "cet4Word");
            return (Criteria) this;
        }

        public Criteria andCet4WordLessThan(String value) {
            addCriterion("cet4_word <", value, "cet4Word");
            return (Criteria) this;
        }

        public Criteria andCet4WordLessThanOrEqualTo(String value) {
            addCriterion("cet4_word <=", value, "cet4Word");
            return (Criteria) this;
        }

        public Criteria andCet4WordLike(String value) {
            addCriterion("cet4_word like", value, "cet4Word");
            return (Criteria) this;
        }

        public Criteria andCet4WordNotLike(String value) {
            addCriterion("cet4_word not like", value, "cet4Word");
            return (Criteria) this;
        }

        public Criteria andCet4WordIn(List<String> values) {
            addCriterion("cet4_word in", values, "cet4Word");
            return (Criteria) this;
        }

        public Criteria andCet4WordNotIn(List<String> values) {
            addCriterion("cet4_word not in", values, "cet4Word");
            return (Criteria) this;
        }

        public Criteria andCet4WordBetween(String value1, String value2) {
            addCriterion("cet4_word between", value1, value2, "cet4Word");
            return (Criteria) this;
        }

        public Criteria andCet4WordNotBetween(String value1, String value2) {
            addCriterion("cet4_word not between", value1, value2, "cet4Word");
            return (Criteria) this;
        }

        public Criteria andCet4DescribeIsNull() {
            addCriterion("cet4_describe is null");
            return (Criteria) this;
        }

        public Criteria andCet4DescribeIsNotNull() {
            addCriterion("cet4_describe is not null");
            return (Criteria) this;
        }

        public Criteria andCet4DescribeEqualTo(String value) {
            addCriterion("cet4_describe =", value, "cet4Describe");
            return (Criteria) this;
        }

        public Criteria andCet4DescribeNotEqualTo(String value) {
            addCriterion("cet4_describe <>", value, "cet4Describe");
            return (Criteria) this;
        }

        public Criteria andCet4DescribeGreaterThan(String value) {
            addCriterion("cet4_describe >", value, "cet4Describe");
            return (Criteria) this;
        }

        public Criteria andCet4DescribeGreaterThanOrEqualTo(String value) {
            addCriterion("cet4_describe >=", value, "cet4Describe");
            return (Criteria) this;
        }

        public Criteria andCet4DescribeLessThan(String value) {
            addCriterion("cet4_describe <", value, "cet4Describe");
            return (Criteria) this;
        }

        public Criteria andCet4DescribeLessThanOrEqualTo(String value) {
            addCriterion("cet4_describe <=", value, "cet4Describe");
            return (Criteria) this;
        }

        public Criteria andCet4DescribeLike(String value) {
            addCriterion("cet4_describe like", value, "cet4Describe");
            return (Criteria) this;
        }

        public Criteria andCet4DescribeNotLike(String value) {
            addCriterion("cet4_describe not like", value, "cet4Describe");
            return (Criteria) this;
        }

        public Criteria andCet4DescribeIn(List<String> values) {
            addCriterion("cet4_describe in", values, "cet4Describe");
            return (Criteria) this;
        }

        public Criteria andCet4DescribeNotIn(List<String> values) {
            addCriterion("cet4_describe not in", values, "cet4Describe");
            return (Criteria) this;
        }

        public Criteria andCet4DescribeBetween(String value1, String value2) {
            addCriterion("cet4_describe between", value1, value2, "cet4Describe");
            return (Criteria) this;
        }

        public Criteria andCet4DescribeNotBetween(String value1, String value2) {
            addCriterion("cet4_describe not between", value1, value2, "cet4Describe");
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