package com.demo.springboot.helloworld.common.domain;

import java.util.ArrayList;
import java.util.List;

public class flight_testExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public flight_testExample() {
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

        public Criteria andIndIsNull() {
            addCriterion("ind is null");
            return (Criteria) this;
        }

        public Criteria andIndIsNotNull() {
            addCriterion("ind is not null");
            return (Criteria) this;
        }

        public Criteria andIndEqualTo(Integer value) {
            addCriterion("ind =", value, "ind");
            return (Criteria) this;
        }

        public Criteria andIndNotEqualTo(Integer value) {
            addCriterion("ind <>", value, "ind");
            return (Criteria) this;
        }

        public Criteria andIndGreaterThan(Integer value) {
            addCriterion("ind >", value, "ind");
            return (Criteria) this;
        }

        public Criteria andIndGreaterThanOrEqualTo(Integer value) {
            addCriterion("ind >=", value, "ind");
            return (Criteria) this;
        }

        public Criteria andIndLessThan(Integer value) {
            addCriterion("ind <", value, "ind");
            return (Criteria) this;
        }

        public Criteria andIndLessThanOrEqualTo(Integer value) {
            addCriterion("ind <=", value, "ind");
            return (Criteria) this;
        }

        public Criteria andIndIn(List<Integer> values) {
            addCriterion("ind in", values, "ind");
            return (Criteria) this;
        }

        public Criteria andIndNotIn(List<Integer> values) {
            addCriterion("ind not in", values, "ind");
            return (Criteria) this;
        }

        public Criteria andIndBetween(Integer value1, Integer value2) {
            addCriterion("ind between", value1, value2, "ind");
            return (Criteria) this;
        }

        public Criteria andIndNotBetween(Integer value1, Integer value2) {
            addCriterion("ind not between", value1, value2, "ind");
            return (Criteria) this;
        }

        public Criteria andDateDayIsNull() {
            addCriterion("date_day is null");
            return (Criteria) this;
        }

        public Criteria andDateDayIsNotNull() {
            addCriterion("date_day is not null");
            return (Criteria) this;
        }

        public Criteria andDateDayEqualTo(String value) {
            addCriterion("date_day =", value, "dateDay");
            return (Criteria) this;
        }

        public Criteria andDateDayNotEqualTo(String value) {
            addCriterion("date_day <>", value, "dateDay");
            return (Criteria) this;
        }

        public Criteria andDateDayGreaterThan(String value) {
            addCriterion("date_day >", value, "dateDay");
            return (Criteria) this;
        }

        public Criteria andDateDayGreaterThanOrEqualTo(String value) {
            addCriterion("date_day >=", value, "dateDay");
            return (Criteria) this;
        }

        public Criteria andDateDayLessThan(String value) {
            addCriterion("date_day <", value, "dateDay");
            return (Criteria) this;
        }

        public Criteria andDateDayLessThanOrEqualTo(String value) {
            addCriterion("date_day <=", value, "dateDay");
            return (Criteria) this;
        }

        public Criteria andDateDayLike(String value) {
            addCriterion("date_day like", value, "dateDay");
            return (Criteria) this;
        }

        public Criteria andDateDayNotLike(String value) {
            addCriterion("date_day not like", value, "dateDay");
            return (Criteria) this;
        }

        public Criteria andDateDayIn(List<String> values) {
            addCriterion("date_day in", values, "dateDay");
            return (Criteria) this;
        }

        public Criteria andDateDayNotIn(List<String> values) {
            addCriterion("date_day not in", values, "dateDay");
            return (Criteria) this;
        }

        public Criteria andDateDayBetween(String value1, String value2) {
            addCriterion("date_day between", value1, value2, "dateDay");
            return (Criteria) this;
        }

        public Criteria andDateDayNotBetween(String value1, String value2) {
            addCriterion("date_day not between", value1, value2, "dateDay");
            return (Criteria) this;
        }

        public Criteria andDepartCityIsNull() {
            addCriterion("depart_city is null");
            return (Criteria) this;
        }

        public Criteria andDepartCityIsNotNull() {
            addCriterion("depart_city is not null");
            return (Criteria) this;
        }

        public Criteria andDepartCityEqualTo(String value) {
            addCriterion("depart_city =", value, "departCity");
            return (Criteria) this;
        }

        public Criteria andDepartCityNotEqualTo(String value) {
            addCriterion("depart_city <>", value, "departCity");
            return (Criteria) this;
        }

        public Criteria andDepartCityGreaterThan(String value) {
            addCriterion("depart_city >", value, "departCity");
            return (Criteria) this;
        }

        public Criteria andDepartCityGreaterThanOrEqualTo(String value) {
            addCriterion("depart_city >=", value, "departCity");
            return (Criteria) this;
        }

        public Criteria andDepartCityLessThan(String value) {
            addCriterion("depart_city <", value, "departCity");
            return (Criteria) this;
        }

        public Criteria andDepartCityLessThanOrEqualTo(String value) {
            addCriterion("depart_city <=", value, "departCity");
            return (Criteria) this;
        }

        public Criteria andDepartCityLike(String value) {
            addCriterion("depart_city like", value, "departCity");
            return (Criteria) this;
        }

        public Criteria andDepartCityNotLike(String value) {
            addCriterion("depart_city not like", value, "departCity");
            return (Criteria) this;
        }

        public Criteria andDepartCityIn(List<String> values) {
            addCriterion("depart_city in", values, "departCity");
            return (Criteria) this;
        }

        public Criteria andDepartCityNotIn(List<String> values) {
            addCriterion("depart_city not in", values, "departCity");
            return (Criteria) this;
        }

        public Criteria andDepartCityBetween(String value1, String value2) {
            addCriterion("depart_city between", value1, value2, "departCity");
            return (Criteria) this;
        }

        public Criteria andDepartCityNotBetween(String value1, String value2) {
            addCriterion("depart_city not between", value1, value2, "departCity");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("destination is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("destination is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("destination =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("destination <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("destination >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("destination >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("destination <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("destination <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("destination like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("destination not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("destination in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("destination not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("destination between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("destination not between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andFlightIsNull() {
            addCriterion("flight is null");
            return (Criteria) this;
        }

        public Criteria andFlightIsNotNull() {
            addCriterion("flight is not null");
            return (Criteria) this;
        }

        public Criteria andFlightEqualTo(String value) {
            addCriterion("flight =", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightNotEqualTo(String value) {
            addCriterion("flight <>", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightGreaterThan(String value) {
            addCriterion("flight >", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightGreaterThanOrEqualTo(String value) {
            addCriterion("flight >=", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightLessThan(String value) {
            addCriterion("flight <", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightLessThanOrEqualTo(String value) {
            addCriterion("flight <=", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightLike(String value) {
            addCriterion("flight like", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightNotLike(String value) {
            addCriterion("flight not like", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightIn(List<String> values) {
            addCriterion("flight in", values, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightNotIn(List<String> values) {
            addCriterion("flight not in", values, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightBetween(String value1, String value2) {
            addCriterion("flight between", value1, value2, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightNotBetween(String value1, String value2) {
            addCriterion("flight not between", value1, value2, "flight");
            return (Criteria) this;
        }

        public Criteria andDepartTimeIsNull() {
            addCriterion("depart_time is null");
            return (Criteria) this;
        }

        public Criteria andDepartTimeIsNotNull() {
            addCriterion("depart_time is not null");
            return (Criteria) this;
        }

        public Criteria andDepartTimeEqualTo(String value) {
            addCriterion("depart_time =", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeNotEqualTo(String value) {
            addCriterion("depart_time <>", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeGreaterThan(String value) {
            addCriterion("depart_time >", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("depart_time >=", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeLessThan(String value) {
            addCriterion("depart_time <", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeLessThanOrEqualTo(String value) {
            addCriterion("depart_time <=", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeLike(String value) {
            addCriterion("depart_time like", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeNotLike(String value) {
            addCriterion("depart_time not like", value, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeIn(List<String> values) {
            addCriterion("depart_time in", values, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeNotIn(List<String> values) {
            addCriterion("depart_time not in", values, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeBetween(String value1, String value2) {
            addCriterion("depart_time between", value1, value2, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartTimeNotBetween(String value1, String value2) {
            addCriterion("depart_time not between", value1, value2, "departTime");
            return (Criteria) this;
        }

        public Criteria andDepartAirportIsNull() {
            addCriterion("depart_airport is null");
            return (Criteria) this;
        }

        public Criteria andDepartAirportIsNotNull() {
            addCriterion("depart_airport is not null");
            return (Criteria) this;
        }

        public Criteria andDepartAirportEqualTo(String value) {
            addCriterion("depart_airport =", value, "departAirport");
            return (Criteria) this;
        }

        public Criteria andDepartAirportNotEqualTo(String value) {
            addCriterion("depart_airport <>", value, "departAirport");
            return (Criteria) this;
        }

        public Criteria andDepartAirportGreaterThan(String value) {
            addCriterion("depart_airport >", value, "departAirport");
            return (Criteria) this;
        }

        public Criteria andDepartAirportGreaterThanOrEqualTo(String value) {
            addCriterion("depart_airport >=", value, "departAirport");
            return (Criteria) this;
        }

        public Criteria andDepartAirportLessThan(String value) {
            addCriterion("depart_airport <", value, "departAirport");
            return (Criteria) this;
        }

        public Criteria andDepartAirportLessThanOrEqualTo(String value) {
            addCriterion("depart_airport <=", value, "departAirport");
            return (Criteria) this;
        }

        public Criteria andDepartAirportLike(String value) {
            addCriterion("depart_airport like", value, "departAirport");
            return (Criteria) this;
        }

        public Criteria andDepartAirportNotLike(String value) {
            addCriterion("depart_airport not like", value, "departAirport");
            return (Criteria) this;
        }

        public Criteria andDepartAirportIn(List<String> values) {
            addCriterion("depart_airport in", values, "departAirport");
            return (Criteria) this;
        }

        public Criteria andDepartAirportNotIn(List<String> values) {
            addCriterion("depart_airport not in", values, "departAirport");
            return (Criteria) this;
        }

        public Criteria andDepartAirportBetween(String value1, String value2) {
            addCriterion("depart_airport between", value1, value2, "departAirport");
            return (Criteria) this;
        }

        public Criteria andDepartAirportNotBetween(String value1, String value2) {
            addCriterion("depart_airport not between", value1, value2, "departAirport");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(String value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(String value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(String value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(String value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(String value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(String value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLike(String value) {
            addCriterion("duration like", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotLike(String value) {
            addCriterion("duration not like", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<String> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<String> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(String value1, String value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(String value1, String value2) {
            addCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNull() {
            addCriterion("arrival_time is null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNotNull() {
            addCriterion("arrival_time is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeEqualTo(String value) {
            addCriterion("arrival_time =", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotEqualTo(String value) {
            addCriterion("arrival_time <>", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThan(String value) {
            addCriterion("arrival_time >", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThanOrEqualTo(String value) {
            addCriterion("arrival_time >=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThan(String value) {
            addCriterion("arrival_time <", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThanOrEqualTo(String value) {
            addCriterion("arrival_time <=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLike(String value) {
            addCriterion("arrival_time like", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotLike(String value) {
            addCriterion("arrival_time not like", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIn(List<String> values) {
            addCriterion("arrival_time in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotIn(List<String> values) {
            addCriterion("arrival_time not in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeBetween(String value1, String value2) {
            addCriterion("arrival_time between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotBetween(String value1, String value2) {
            addCriterion("arrival_time not between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalAirportIsNull() {
            addCriterion("arrival_airport is null");
            return (Criteria) this;
        }

        public Criteria andArrivalAirportIsNotNull() {
            addCriterion("arrival_airport is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalAirportEqualTo(String value) {
            addCriterion("arrival_airport =", value, "arrivalAirport");
            return (Criteria) this;
        }

        public Criteria andArrivalAirportNotEqualTo(String value) {
            addCriterion("arrival_airport <>", value, "arrivalAirport");
            return (Criteria) this;
        }

        public Criteria andArrivalAirportGreaterThan(String value) {
            addCriterion("arrival_airport >", value, "arrivalAirport");
            return (Criteria) this;
        }

        public Criteria andArrivalAirportGreaterThanOrEqualTo(String value) {
            addCriterion("arrival_airport >=", value, "arrivalAirport");
            return (Criteria) this;
        }

        public Criteria andArrivalAirportLessThan(String value) {
            addCriterion("arrival_airport <", value, "arrivalAirport");
            return (Criteria) this;
        }

        public Criteria andArrivalAirportLessThanOrEqualTo(String value) {
            addCriterion("arrival_airport <=", value, "arrivalAirport");
            return (Criteria) this;
        }

        public Criteria andArrivalAirportLike(String value) {
            addCriterion("arrival_airport like", value, "arrivalAirport");
            return (Criteria) this;
        }

        public Criteria andArrivalAirportNotLike(String value) {
            addCriterion("arrival_airport not like", value, "arrivalAirport");
            return (Criteria) this;
        }

        public Criteria andArrivalAirportIn(List<String> values) {
            addCriterion("arrival_airport in", values, "arrivalAirport");
            return (Criteria) this;
        }

        public Criteria andArrivalAirportNotIn(List<String> values) {
            addCriterion("arrival_airport not in", values, "arrivalAirport");
            return (Criteria) this;
        }

        public Criteria andArrivalAirportBetween(String value1, String value2) {
            addCriterion("arrival_airport between", value1, value2, "arrivalAirport");
            return (Criteria) this;
        }

        public Criteria andArrivalAirportNotBetween(String value1, String value2) {
            addCriterion("arrival_airport not between", value1, value2, "arrivalAirport");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
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