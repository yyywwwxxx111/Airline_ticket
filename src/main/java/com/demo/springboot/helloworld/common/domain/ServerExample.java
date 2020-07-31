package com.demo.springboot.helloworld.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServerExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andSidPkIsNull() {
            addCriterion("sid_pk is null");
            return (Criteria) this;
        }

        public Criteria andSidPkIsNotNull() {
            addCriterion("sid_pk is not null");
            return (Criteria) this;
        }

        public Criteria andSidPkEqualTo(Long value) {
            addCriterion("sid_pk =", value, "sidPk");
            return (Criteria) this;
        }

        public Criteria andSidPkNotEqualTo(Long value) {
            addCriterion("sid_pk <>", value, "sidPk");
            return (Criteria) this;
        }

        public Criteria andSidPkGreaterThan(Long value) {
            addCriterion("sid_pk >", value, "sidPk");
            return (Criteria) this;
        }

        public Criteria andSidPkGreaterThanOrEqualTo(Long value) {
            addCriterion("sid_pk >=", value, "sidPk");
            return (Criteria) this;
        }

        public Criteria andSidPkLessThan(Long value) {
            addCriterion("sid_pk <", value, "sidPk");
            return (Criteria) this;
        }

        public Criteria andSidPkLessThanOrEqualTo(Long value) {
            addCriterion("sid_pk <=", value, "sidPk");
            return (Criteria) this;
        }

        public Criteria andSidPkIn(List<Long> values) {
            addCriterion("sid_pk in", values, "sidPk");
            return (Criteria) this;
        }

        public Criteria andSidPkNotIn(List<Long> values) {
            addCriterion("sid_pk not in", values, "sidPk");
            return (Criteria) this;
        }

        public Criteria andSidPkBetween(Long value1, Long value2) {
            addCriterion("sid_pk between", value1, value2, "sidPk");
            return (Criteria) this;
        }

        public Criteria andSidPkNotBetween(Long value1, Long value2) {
            addCriterion("sid_pk not between", value1, value2, "sidPk");
            return (Criteria) this;
        }

        public Criteria andServerNameIsNull() {
            addCriterion("server_name is null");
            return (Criteria) this;
        }

        public Criteria andServerNameIsNotNull() {
            addCriterion("server_name is not null");
            return (Criteria) this;
        }

        public Criteria andServerNameEqualTo(String value) {
            addCriterion("server_name =", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotEqualTo(String value) {
            addCriterion("server_name <>", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameGreaterThan(String value) {
            addCriterion("server_name >", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameGreaterThanOrEqualTo(String value) {
            addCriterion("server_name >=", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLessThan(String value) {
            addCriterion("server_name <", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLessThanOrEqualTo(String value) {
            addCriterion("server_name <=", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLike(String value) {
            addCriterion("server_name like", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotLike(String value) {
            addCriterion("server_name not like", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameIn(List<String> values) {
            addCriterion("server_name in", values, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotIn(List<String> values) {
            addCriterion("server_name not in", values, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameBetween(String value1, String value2) {
            addCriterion("server_name between", value1, value2, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotBetween(String value1, String value2) {
            addCriterion("server_name not between", value1, value2, "serverName");
            return (Criteria) this;
        }

        public Criteria andEstTimeIsNull() {
            addCriterion("est_time is null");
            return (Criteria) this;
        }

        public Criteria andEstTimeIsNotNull() {
            addCriterion("est_time is not null");
            return (Criteria) this;
        }

        public Criteria andEstTimeEqualTo(Date value) {
            addCriterion("est_time =", value, "estTime");
            return (Criteria) this;
        }

        public Criteria andEstTimeNotEqualTo(Date value) {
            addCriterion("est_time <>", value, "estTime");
            return (Criteria) this;
        }

        public Criteria andEstTimeGreaterThan(Date value) {
            addCriterion("est_time >", value, "estTime");
            return (Criteria) this;
        }

        public Criteria andEstTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("est_time >=", value, "estTime");
            return (Criteria) this;
        }

        public Criteria andEstTimeLessThan(Date value) {
            addCriterion("est_time <", value, "estTime");
            return (Criteria) this;
        }

        public Criteria andEstTimeLessThanOrEqualTo(Date value) {
            addCriterion("est_time <=", value, "estTime");
            return (Criteria) this;
        }

        public Criteria andEstTimeIn(List<Date> values) {
            addCriterion("est_time in", values, "estTime");
            return (Criteria) this;
        }

        public Criteria andEstTimeNotIn(List<Date> values) {
            addCriterion("est_time not in", values, "estTime");
            return (Criteria) this;
        }

        public Criteria andEstTimeBetween(Date value1, Date value2) {
            addCriterion("est_time between", value1, value2, "estTime");
            return (Criteria) this;
        }

        public Criteria andEstTimeNotBetween(Date value1, Date value2) {
            addCriterion("est_time not between", value1, value2, "estTime");
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