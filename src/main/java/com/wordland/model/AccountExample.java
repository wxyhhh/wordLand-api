package com.wordland.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountExample() {
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

        public Criteria andAccountNicknameIsNull() {
            addCriterion("account_nickname is null");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameIsNotNull() {
            addCriterion("account_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameEqualTo(String value) {
            addCriterion("account_nickname =", value, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameNotEqualTo(String value) {
            addCriterion("account_nickname <>", value, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameGreaterThan(String value) {
            addCriterion("account_nickname >", value, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("account_nickname >=", value, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameLessThan(String value) {
            addCriterion("account_nickname <", value, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameLessThanOrEqualTo(String value) {
            addCriterion("account_nickname <=", value, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameLike(String value) {
            addCriterion("account_nickname like", value, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameNotLike(String value) {
            addCriterion("account_nickname not like", value, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameIn(List<String> values) {
            addCriterion("account_nickname in", values, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameNotIn(List<String> values) {
            addCriterion("account_nickname not in", values, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameBetween(String value1, String value2) {
            addCriterion("account_nickname between", value1, value2, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountNicknameNotBetween(String value1, String value2) {
            addCriterion("account_nickname not between", value1, value2, "accountNickname");
            return (Criteria) this;
        }

        public Criteria andAccountCet4IsNull() {
            addCriterion("account_cet4 is null");
            return (Criteria) this;
        }

        public Criteria andAccountCet4IsNotNull() {
            addCriterion("account_cet4 is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCet4EqualTo(Integer value) {
            addCriterion("account_cet4 =", value, "accountCet4");
            return (Criteria) this;
        }

        public Criteria andAccountCet4NotEqualTo(Integer value) {
            addCriterion("account_cet4 <>", value, "accountCet4");
            return (Criteria) this;
        }

        public Criteria andAccountCet4GreaterThan(Integer value) {
            addCriterion("account_cet4 >", value, "accountCet4");
            return (Criteria) this;
        }

        public Criteria andAccountCet4GreaterThanOrEqualTo(Integer value) {
            addCriterion("account_cet4 >=", value, "accountCet4");
            return (Criteria) this;
        }

        public Criteria andAccountCet4LessThan(Integer value) {
            addCriterion("account_cet4 <", value, "accountCet4");
            return (Criteria) this;
        }

        public Criteria andAccountCet4LessThanOrEqualTo(Integer value) {
            addCriterion("account_cet4 <=", value, "accountCet4");
            return (Criteria) this;
        }

        public Criteria andAccountCet4In(List<Integer> values) {
            addCriterion("account_cet4 in", values, "accountCet4");
            return (Criteria) this;
        }

        public Criteria andAccountCet4NotIn(List<Integer> values) {
            addCriterion("account_cet4 not in", values, "accountCet4");
            return (Criteria) this;
        }

        public Criteria andAccountCet4Between(Integer value1, Integer value2) {
            addCriterion("account_cet4 between", value1, value2, "accountCet4");
            return (Criteria) this;
        }

        public Criteria andAccountCet4NotBetween(Integer value1, Integer value2) {
            addCriterion("account_cet4 not between", value1, value2, "accountCet4");
            return (Criteria) this;
        }

        public Criteria andAccountCet4TodayIsNull() {
            addCriterion("account_cet4_today is null");
            return (Criteria) this;
        }

        public Criteria andAccountCet4TodayIsNotNull() {
            addCriterion("account_cet4_today is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCet4TodayEqualTo(Integer value) {
            addCriterion("account_cet4_today =", value, "accountCet4Today");
            return (Criteria) this;
        }

        public Criteria andAccountCet4TodayNotEqualTo(Integer value) {
            addCriterion("account_cet4_today <>", value, "accountCet4Today");
            return (Criteria) this;
        }

        public Criteria andAccountCet4TodayGreaterThan(Integer value) {
            addCriterion("account_cet4_today >", value, "accountCet4Today");
            return (Criteria) this;
        }

        public Criteria andAccountCet4TodayGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_cet4_today >=", value, "accountCet4Today");
            return (Criteria) this;
        }

        public Criteria andAccountCet4TodayLessThan(Integer value) {
            addCriterion("account_cet4_today <", value, "accountCet4Today");
            return (Criteria) this;
        }

        public Criteria andAccountCet4TodayLessThanOrEqualTo(Integer value) {
            addCriterion("account_cet4_today <=", value, "accountCet4Today");
            return (Criteria) this;
        }

        public Criteria andAccountCet4TodayIn(List<Integer> values) {
            addCriterion("account_cet4_today in", values, "accountCet4Today");
            return (Criteria) this;
        }

        public Criteria andAccountCet4TodayNotIn(List<Integer> values) {
            addCriterion("account_cet4_today not in", values, "accountCet4Today");
            return (Criteria) this;
        }

        public Criteria andAccountCet4TodayBetween(Integer value1, Integer value2) {
            addCriterion("account_cet4_today between", value1, value2, "accountCet4Today");
            return (Criteria) this;
        }

        public Criteria andAccountCet4TodayNotBetween(Integer value1, Integer value2) {
            addCriterion("account_cet4_today not between", value1, value2, "accountCet4Today");
            return (Criteria) this;
        }

        public Criteria andAccountCet6IsNull() {
            addCriterion("account_cet6 is null");
            return (Criteria) this;
        }

        public Criteria andAccountCet6IsNotNull() {
            addCriterion("account_cet6 is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCet6EqualTo(Integer value) {
            addCriterion("account_cet6 =", value, "accountCet6");
            return (Criteria) this;
        }

        public Criteria andAccountCet6NotEqualTo(Integer value) {
            addCriterion("account_cet6 <>", value, "accountCet6");
            return (Criteria) this;
        }

        public Criteria andAccountCet6GreaterThan(Integer value) {
            addCriterion("account_cet6 >", value, "accountCet6");
            return (Criteria) this;
        }

        public Criteria andAccountCet6GreaterThanOrEqualTo(Integer value) {
            addCriterion("account_cet6 >=", value, "accountCet6");
            return (Criteria) this;
        }

        public Criteria andAccountCet6LessThan(Integer value) {
            addCriterion("account_cet6 <", value, "accountCet6");
            return (Criteria) this;
        }

        public Criteria andAccountCet6LessThanOrEqualTo(Integer value) {
            addCriterion("account_cet6 <=", value, "accountCet6");
            return (Criteria) this;
        }

        public Criteria andAccountCet6In(List<Integer> values) {
            addCriterion("account_cet6 in", values, "accountCet6");
            return (Criteria) this;
        }

        public Criteria andAccountCet6NotIn(List<Integer> values) {
            addCriterion("account_cet6 not in", values, "accountCet6");
            return (Criteria) this;
        }

        public Criteria andAccountCet6Between(Integer value1, Integer value2) {
            addCriterion("account_cet6 between", value1, value2, "accountCet6");
            return (Criteria) this;
        }

        public Criteria andAccountCet6NotBetween(Integer value1, Integer value2) {
            addCriterion("account_cet6 not between", value1, value2, "accountCet6");
            return (Criteria) this;
        }

        public Criteria andAccountCet6TodayIsNull() {
            addCriterion("account_cet6_today is null");
            return (Criteria) this;
        }

        public Criteria andAccountCet6TodayIsNotNull() {
            addCriterion("account_cet6_today is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCet6TodayEqualTo(Integer value) {
            addCriterion("account_cet6_today =", value, "accountCet6Today");
            return (Criteria) this;
        }

        public Criteria andAccountCet6TodayNotEqualTo(Integer value) {
            addCriterion("account_cet6_today <>", value, "accountCet6Today");
            return (Criteria) this;
        }

        public Criteria andAccountCet6TodayGreaterThan(Integer value) {
            addCriterion("account_cet6_today >", value, "accountCet6Today");
            return (Criteria) this;
        }

        public Criteria andAccountCet6TodayGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_cet6_today >=", value, "accountCet6Today");
            return (Criteria) this;
        }

        public Criteria andAccountCet6TodayLessThan(Integer value) {
            addCriterion("account_cet6_today <", value, "accountCet6Today");
            return (Criteria) this;
        }

        public Criteria andAccountCet6TodayLessThanOrEqualTo(Integer value) {
            addCriterion("account_cet6_today <=", value, "accountCet6Today");
            return (Criteria) this;
        }

        public Criteria andAccountCet6TodayIn(List<Integer> values) {
            addCriterion("account_cet6_today in", values, "accountCet6Today");
            return (Criteria) this;
        }

        public Criteria andAccountCet6TodayNotIn(List<Integer> values) {
            addCriterion("account_cet6_today not in", values, "accountCet6Today");
            return (Criteria) this;
        }

        public Criteria andAccountCet6TodayBetween(Integer value1, Integer value2) {
            addCriterion("account_cet6_today between", value1, value2, "accountCet6Today");
            return (Criteria) this;
        }

        public Criteria andAccountCet6TodayNotBetween(Integer value1, Integer value2) {
            addCriterion("account_cet6_today not between", value1, value2, "accountCet6Today");
            return (Criteria) this;
        }

        public Criteria andAccountCounterIsNull() {
            addCriterion("account_counter is null");
            return (Criteria) this;
        }

        public Criteria andAccountCounterIsNotNull() {
            addCriterion("account_counter is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCounterEqualTo(Integer value) {
            addCriterion("account_counter =", value, "accountCounter");
            return (Criteria) this;
        }

        public Criteria andAccountCounterNotEqualTo(Integer value) {
            addCriterion("account_counter <>", value, "accountCounter");
            return (Criteria) this;
        }

        public Criteria andAccountCounterGreaterThan(Integer value) {
            addCriterion("account_counter >", value, "accountCounter");
            return (Criteria) this;
        }

        public Criteria andAccountCounterGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_counter >=", value, "accountCounter");
            return (Criteria) this;
        }

        public Criteria andAccountCounterLessThan(Integer value) {
            addCriterion("account_counter <", value, "accountCounter");
            return (Criteria) this;
        }

        public Criteria andAccountCounterLessThanOrEqualTo(Integer value) {
            addCriterion("account_counter <=", value, "accountCounter");
            return (Criteria) this;
        }

        public Criteria andAccountCounterIn(List<Integer> values) {
            addCriterion("account_counter in", values, "accountCounter");
            return (Criteria) this;
        }

        public Criteria andAccountCounterNotIn(List<Integer> values) {
            addCriterion("account_counter not in", values, "accountCounter");
            return (Criteria) this;
        }

        public Criteria andAccountCounterBetween(Integer value1, Integer value2) {
            addCriterion("account_counter between", value1, value2, "accountCounter");
            return (Criteria) this;
        }

        public Criteria andAccountCounterNotBetween(Integer value1, Integer value2) {
            addCriterion("account_counter not between", value1, value2, "accountCounter");
            return (Criteria) this;
        }

        public Criteria andAccountTimeIsNull() {
            addCriterion("account_time is null");
            return (Criteria) this;
        }

        public Criteria andAccountTimeIsNotNull() {
            addCriterion("account_time is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTimeEqualTo(Date value) {
            addCriterionForJDBCDate("account_time =", value, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("account_time <>", value, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("account_time >", value, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("account_time >=", value, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeLessThan(Date value) {
            addCriterionForJDBCDate("account_time <", value, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("account_time <=", value, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeIn(List<Date> values) {
            addCriterionForJDBCDate("account_time in", values, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("account_time not in", values, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("account_time between", value1, value2, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("account_time not between", value1, value2, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdIsNull() {
            addCriterion("account_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdIsNotNull() {
            addCriterion("account_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdEqualTo(Integer value) {
            addCriterion("account_user_id =", value, "accountUserId");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdNotEqualTo(Integer value) {
            addCriterion("account_user_id <>", value, "accountUserId");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdGreaterThan(Integer value) {
            addCriterion("account_user_id >", value, "accountUserId");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_user_id >=", value, "accountUserId");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdLessThan(Integer value) {
            addCriterion("account_user_id <", value, "accountUserId");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_user_id <=", value, "accountUserId");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdIn(List<Integer> values) {
            addCriterion("account_user_id in", values, "accountUserId");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdNotIn(List<Integer> values) {
            addCriterion("account_user_id not in", values, "accountUserId");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdBetween(Integer value1, Integer value2) {
            addCriterion("account_user_id between", value1, value2, "accountUserId");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_user_id not between", value1, value2, "accountUserId");
            return (Criteria) this;
        }

        public Criteria andAccountSettingIsNull() {
            addCriterion("account_setting is null");
            return (Criteria) this;
        }

        public Criteria andAccountSettingIsNotNull() {
            addCriterion("account_setting is not null");
            return (Criteria) this;
        }

        public Criteria andAccountSettingEqualTo(Integer value) {
            addCriterion("account_setting =", value, "accountSetting");
            return (Criteria) this;
        }

        public Criteria andAccountSettingNotEqualTo(Integer value) {
            addCriterion("account_setting <>", value, "accountSetting");
            return (Criteria) this;
        }

        public Criteria andAccountSettingGreaterThan(Integer value) {
            addCriterion("account_setting >", value, "accountSetting");
            return (Criteria) this;
        }

        public Criteria andAccountSettingGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_setting >=", value, "accountSetting");
            return (Criteria) this;
        }

        public Criteria andAccountSettingLessThan(Integer value) {
            addCriterion("account_setting <", value, "accountSetting");
            return (Criteria) this;
        }

        public Criteria andAccountSettingLessThanOrEqualTo(Integer value) {
            addCriterion("account_setting <=", value, "accountSetting");
            return (Criteria) this;
        }

        public Criteria andAccountSettingIn(List<Integer> values) {
            addCriterion("account_setting in", values, "accountSetting");
            return (Criteria) this;
        }

        public Criteria andAccountSettingNotIn(List<Integer> values) {
            addCriterion("account_setting not in", values, "accountSetting");
            return (Criteria) this;
        }

        public Criteria andAccountSettingBetween(Integer value1, Integer value2) {
            addCriterion("account_setting between", value1, value2, "accountSetting");
            return (Criteria) this;
        }

        public Criteria andAccountSettingNotBetween(Integer value1, Integer value2) {
            addCriterion("account_setting not between", value1, value2, "accountSetting");
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