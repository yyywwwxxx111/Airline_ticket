package com.demo.springboot.helloworld.common.domain;

import java.util.ArrayList;
import java.util.List;

public class FlightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlightExample() {
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

        public Criteria andTableidIsNull() {
            addCriterion("TableID is null");
            return (Criteria) this;
        }

        public Criteria andTableidIsNotNull() {
            addCriterion("TableID is not null");
            return (Criteria) this;
        }

        public Criteria andTableidEqualTo(Integer value) {
            addCriterion("TableID =", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotEqualTo(Integer value) {
            addCriterion("TableID <>", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidGreaterThan(Integer value) {
            addCriterion("TableID >", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TableID >=", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidLessThan(Integer value) {
            addCriterion("TableID <", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidLessThanOrEqualTo(Integer value) {
            addCriterion("TableID <=", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidIn(List<Integer> values) {
            addCriterion("TableID in", values, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotIn(List<Integer> values) {
            addCriterion("TableID not in", values, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidBetween(Integer value1, Integer value2) {
            addCriterion("TableID between", value1, value2, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotBetween(Integer value1, Integer value2) {
            addCriterion("TableID not between", value1, value2, "tableid");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAirlineIsNull() {
            addCriterion("Airline is null");
            return (Criteria) this;
        }

        public Criteria andAirlineIsNotNull() {
            addCriterion("Airline is not null");
            return (Criteria) this;
        }

        public Criteria andAirlineEqualTo(String value) {
            addCriterion("Airline =", value, "airline");
            return (Criteria) this;
        }

        public Criteria andAirlineNotEqualTo(String value) {
            addCriterion("Airline <>", value, "airline");
            return (Criteria) this;
        }

        public Criteria andAirlineGreaterThan(String value) {
            addCriterion("Airline >", value, "airline");
            return (Criteria) this;
        }

        public Criteria andAirlineGreaterThanOrEqualTo(String value) {
            addCriterion("Airline >=", value, "airline");
            return (Criteria) this;
        }

        public Criteria andAirlineLessThan(String value) {
            addCriterion("Airline <", value, "airline");
            return (Criteria) this;
        }

        public Criteria andAirlineLessThanOrEqualTo(String value) {
            addCriterion("Airline <=", value, "airline");
            return (Criteria) this;
        }

        public Criteria andAirlineLike(String value) {
            addCriterion("Airline like", value, "airline");
            return (Criteria) this;
        }

        public Criteria andAirlineNotLike(String value) {
            addCriterion("Airline not like", value, "airline");
            return (Criteria) this;
        }

        public Criteria andAirlineIn(List<String> values) {
            addCriterion("Airline in", values, "airline");
            return (Criteria) this;
        }

        public Criteria andAirlineNotIn(List<String> values) {
            addCriterion("Airline not in", values, "airline");
            return (Criteria) this;
        }

        public Criteria andAirlineBetween(String value1, String value2) {
            addCriterion("Airline between", value1, value2, "airline");
            return (Criteria) this;
        }

        public Criteria andAirlineNotBetween(String value1, String value2) {
            addCriterion("Airline not between", value1, value2, "airline");
            return (Criteria) this;
        }

        public Criteria andFlightnumberIsNull() {
            addCriterion("FlightNumber is null");
            return (Criteria) this;
        }

        public Criteria andFlightnumberIsNotNull() {
            addCriterion("FlightNumber is not null");
            return (Criteria) this;
        }

        public Criteria andFlightnumberEqualTo(String value) {
            addCriterion("FlightNumber =", value, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andFlightnumberNotEqualTo(String value) {
            addCriterion("FlightNumber <>", value, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andFlightnumberGreaterThan(String value) {
            addCriterion("FlightNumber >", value, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andFlightnumberGreaterThanOrEqualTo(String value) {
            addCriterion("FlightNumber >=", value, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andFlightnumberLessThan(String value) {
            addCriterion("FlightNumber <", value, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andFlightnumberLessThanOrEqualTo(String value) {
            addCriterion("FlightNumber <=", value, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andFlightnumberLike(String value) {
            addCriterion("FlightNumber like", value, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andFlightnumberNotLike(String value) {
            addCriterion("FlightNumber not like", value, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andFlightnumberIn(List<String> values) {
            addCriterion("FlightNumber in", values, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andFlightnumberNotIn(List<String> values) {
            addCriterion("FlightNumber not in", values, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andFlightnumberBetween(String value1, String value2) {
            addCriterion("FlightNumber between", value1, value2, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andFlightnumberNotBetween(String value1, String value2) {
            addCriterion("FlightNumber not between", value1, value2, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andAircraftIsNull() {
            addCriterion("Aircraft is null");
            return (Criteria) this;
        }

        public Criteria andAircraftIsNotNull() {
            addCriterion("Aircraft is not null");
            return (Criteria) this;
        }

        public Criteria andAircraftEqualTo(String value) {
            addCriterion("Aircraft =", value, "aircraft");
            return (Criteria) this;
        }

        public Criteria andAircraftNotEqualTo(String value) {
            addCriterion("Aircraft <>", value, "aircraft");
            return (Criteria) this;
        }

        public Criteria andAircraftGreaterThan(String value) {
            addCriterion("Aircraft >", value, "aircraft");
            return (Criteria) this;
        }

        public Criteria andAircraftGreaterThanOrEqualTo(String value) {
            addCriterion("Aircraft >=", value, "aircraft");
            return (Criteria) this;
        }

        public Criteria andAircraftLessThan(String value) {
            addCriterion("Aircraft <", value, "aircraft");
            return (Criteria) this;
        }

        public Criteria andAircraftLessThanOrEqualTo(String value) {
            addCriterion("Aircraft <=", value, "aircraft");
            return (Criteria) this;
        }

        public Criteria andAircraftLike(String value) {
            addCriterion("Aircraft like", value, "aircraft");
            return (Criteria) this;
        }

        public Criteria andAircraftNotLike(String value) {
            addCriterion("Aircraft not like", value, "aircraft");
            return (Criteria) this;
        }

        public Criteria andAircraftIn(List<String> values) {
            addCriterion("Aircraft in", values, "aircraft");
            return (Criteria) this;
        }

        public Criteria andAircraftNotIn(List<String> values) {
            addCriterion("Aircraft not in", values, "aircraft");
            return (Criteria) this;
        }

        public Criteria andAircraftBetween(String value1, String value2) {
            addCriterion("Aircraft between", value1, value2, "aircraft");
            return (Criteria) this;
        }

        public Criteria andAircraftNotBetween(String value1, String value2) {
            addCriterion("Aircraft not between", value1, value2, "aircraft");
            return (Criteria) this;
        }

        public Criteria andFueloiltaxIsNull() {
            addCriterion("FuelOilTax is null");
            return (Criteria) this;
        }

        public Criteria andFueloiltaxIsNotNull() {
            addCriterion("FuelOilTax is not null");
            return (Criteria) this;
        }

        public Criteria andFueloiltaxEqualTo(String value) {
            addCriterion("FuelOilTax =", value, "fueloiltax");
            return (Criteria) this;
        }

        public Criteria andFueloiltaxNotEqualTo(String value) {
            addCriterion("FuelOilTax <>", value, "fueloiltax");
            return (Criteria) this;
        }

        public Criteria andFueloiltaxGreaterThan(String value) {
            addCriterion("FuelOilTax >", value, "fueloiltax");
            return (Criteria) this;
        }

        public Criteria andFueloiltaxGreaterThanOrEqualTo(String value) {
            addCriterion("FuelOilTax >=", value, "fueloiltax");
            return (Criteria) this;
        }

        public Criteria andFueloiltaxLessThan(String value) {
            addCriterion("FuelOilTax <", value, "fueloiltax");
            return (Criteria) this;
        }

        public Criteria andFueloiltaxLessThanOrEqualTo(String value) {
            addCriterion("FuelOilTax <=", value, "fueloiltax");
            return (Criteria) this;
        }

        public Criteria andFueloiltaxLike(String value) {
            addCriterion("FuelOilTax like", value, "fueloiltax");
            return (Criteria) this;
        }

        public Criteria andFueloiltaxNotLike(String value) {
            addCriterion("FuelOilTax not like", value, "fueloiltax");
            return (Criteria) this;
        }

        public Criteria andFueloiltaxIn(List<String> values) {
            addCriterion("FuelOilTax in", values, "fueloiltax");
            return (Criteria) this;
        }

        public Criteria andFueloiltaxNotIn(List<String> values) {
            addCriterion("FuelOilTax not in", values, "fueloiltax");
            return (Criteria) this;
        }

        public Criteria andFueloiltaxBetween(String value1, String value2) {
            addCriterion("FuelOilTax between", value1, value2, "fueloiltax");
            return (Criteria) this;
        }

        public Criteria andFueloiltaxNotBetween(String value1, String value2) {
            addCriterion("FuelOilTax not between", value1, value2, "fueloiltax");
            return (Criteria) this;
        }

        public Criteria andFromcityIsNull() {
            addCriterion("FromCity is null");
            return (Criteria) this;
        }

        public Criteria andFromcityIsNotNull() {
            addCriterion("FromCity is not null");
            return (Criteria) this;
        }

        public Criteria andFromcityEqualTo(String value) {
            addCriterion("FromCity =", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityNotEqualTo(String value) {
            addCriterion("FromCity <>", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityGreaterThan(String value) {
            addCriterion("FromCity >", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityGreaterThanOrEqualTo(String value) {
            addCriterion("FromCity >=", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityLessThan(String value) {
            addCriterion("FromCity <", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityLessThanOrEqualTo(String value) {
            addCriterion("FromCity <=", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityLike(String value) {
            addCriterion("FromCity like", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityNotLike(String value) {
            addCriterion("FromCity not like", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityIn(List<String> values) {
            addCriterion("FromCity in", values, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityNotIn(List<String> values) {
            addCriterion("FromCity not in", values, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityBetween(String value1, String value2) {
            addCriterion("FromCity between", value1, value2, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityNotBetween(String value1, String value2) {
            addCriterion("FromCity not between", value1, value2, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromairportIsNull() {
            addCriterion("FromAirport is null");
            return (Criteria) this;
        }

        public Criteria andFromairportIsNotNull() {
            addCriterion("FromAirport is not null");
            return (Criteria) this;
        }

        public Criteria andFromairportEqualTo(String value) {
            addCriterion("FromAirport =", value, "fromairport");
            return (Criteria) this;
        }

        public Criteria andFromairportNotEqualTo(String value) {
            addCriterion("FromAirport <>", value, "fromairport");
            return (Criteria) this;
        }

        public Criteria andFromairportGreaterThan(String value) {
            addCriterion("FromAirport >", value, "fromairport");
            return (Criteria) this;
        }

        public Criteria andFromairportGreaterThanOrEqualTo(String value) {
            addCriterion("FromAirport >=", value, "fromairport");
            return (Criteria) this;
        }

        public Criteria andFromairportLessThan(String value) {
            addCriterion("FromAirport <", value, "fromairport");
            return (Criteria) this;
        }

        public Criteria andFromairportLessThanOrEqualTo(String value) {
            addCriterion("FromAirport <=", value, "fromairport");
            return (Criteria) this;
        }

        public Criteria andFromairportLike(String value) {
            addCriterion("FromAirport like", value, "fromairport");
            return (Criteria) this;
        }

        public Criteria andFromairportNotLike(String value) {
            addCriterion("FromAirport not like", value, "fromairport");
            return (Criteria) this;
        }

        public Criteria andFromairportIn(List<String> values) {
            addCriterion("FromAirport in", values, "fromairport");
            return (Criteria) this;
        }

        public Criteria andFromairportNotIn(List<String> values) {
            addCriterion("FromAirport not in", values, "fromairport");
            return (Criteria) this;
        }

        public Criteria andFromairportBetween(String value1, String value2) {
            addCriterion("FromAirport between", value1, value2, "fromairport");
            return (Criteria) this;
        }

        public Criteria andFromairportNotBetween(String value1, String value2) {
            addCriterion("FromAirport not between", value1, value2, "fromairport");
            return (Criteria) this;
        }

        public Criteria andFromterminalIsNull() {
            addCriterion("FromTerminal is null");
            return (Criteria) this;
        }

        public Criteria andFromterminalIsNotNull() {
            addCriterion("FromTerminal is not null");
            return (Criteria) this;
        }

        public Criteria andFromterminalEqualTo(String value) {
            addCriterion("FromTerminal =", value, "fromterminal");
            return (Criteria) this;
        }

        public Criteria andFromterminalNotEqualTo(String value) {
            addCriterion("FromTerminal <>", value, "fromterminal");
            return (Criteria) this;
        }

        public Criteria andFromterminalGreaterThan(String value) {
            addCriterion("FromTerminal >", value, "fromterminal");
            return (Criteria) this;
        }

        public Criteria andFromterminalGreaterThanOrEqualTo(String value) {
            addCriterion("FromTerminal >=", value, "fromterminal");
            return (Criteria) this;
        }

        public Criteria andFromterminalLessThan(String value) {
            addCriterion("FromTerminal <", value, "fromterminal");
            return (Criteria) this;
        }

        public Criteria andFromterminalLessThanOrEqualTo(String value) {
            addCriterion("FromTerminal <=", value, "fromterminal");
            return (Criteria) this;
        }

        public Criteria andFromterminalLike(String value) {
            addCriterion("FromTerminal like", value, "fromterminal");
            return (Criteria) this;
        }

        public Criteria andFromterminalNotLike(String value) {
            addCriterion("FromTerminal not like", value, "fromterminal");
            return (Criteria) this;
        }

        public Criteria andFromterminalIn(List<String> values) {
            addCriterion("FromTerminal in", values, "fromterminal");
            return (Criteria) this;
        }

        public Criteria andFromterminalNotIn(List<String> values) {
            addCriterion("FromTerminal not in", values, "fromterminal");
            return (Criteria) this;
        }

        public Criteria andFromterminalBetween(String value1, String value2) {
            addCriterion("FromTerminal between", value1, value2, "fromterminal");
            return (Criteria) this;
        }

        public Criteria andFromterminalNotBetween(String value1, String value2) {
            addCriterion("FromTerminal not between", value1, value2, "fromterminal");
            return (Criteria) this;
        }

        public Criteria andFromdatetimeIsNull() {
            addCriterion("FromDateTime is null");
            return (Criteria) this;
        }

        public Criteria andFromdatetimeIsNotNull() {
            addCriterion("FromDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andFromdatetimeEqualTo(String value) {
            addCriterion("FromDateTime =", value, "fromdatetime");
            return (Criteria) this;
        }

        public Criteria andFromdatetimeNotEqualTo(String value) {
            addCriterion("FromDateTime <>", value, "fromdatetime");
            return (Criteria) this;
        }

        public Criteria andFromdatetimeGreaterThan(String value) {
            addCriterion("FromDateTime >", value, "fromdatetime");
            return (Criteria) this;
        }

        public Criteria andFromdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("FromDateTime >=", value, "fromdatetime");
            return (Criteria) this;
        }

        public Criteria andFromdatetimeLessThan(String value) {
            addCriterion("FromDateTime <", value, "fromdatetime");
            return (Criteria) this;
        }

        public Criteria andFromdatetimeLessThanOrEqualTo(String value) {
            addCriterion("FromDateTime <=", value, "fromdatetime");
            return (Criteria) this;
        }

        public Criteria andFromdatetimeLike(String value) {
            addCriterion("FromDateTime like", value, "fromdatetime");
            return (Criteria) this;
        }

        public Criteria andFromdatetimeNotLike(String value) {
            addCriterion("FromDateTime not like", value, "fromdatetime");
            return (Criteria) this;
        }

        public Criteria andFromdatetimeIn(List<String> values) {
            addCriterion("FromDateTime in", values, "fromdatetime");
            return (Criteria) this;
        }

        public Criteria andFromdatetimeNotIn(List<String> values) {
            addCriterion("FromDateTime not in", values, "fromdatetime");
            return (Criteria) this;
        }

        public Criteria andFromdatetimeBetween(String value1, String value2) {
            addCriterion("FromDateTime between", value1, value2, "fromdatetime");
            return (Criteria) this;
        }

        public Criteria andFromdatetimeNotBetween(String value1, String value2) {
            addCriterion("FromDateTime not between", value1, value2, "fromdatetime");
            return (Criteria) this;
        }

        public Criteria andTocityIsNull() {
            addCriterion("ToCity is null");
            return (Criteria) this;
        }

        public Criteria andTocityIsNotNull() {
            addCriterion("ToCity is not null");
            return (Criteria) this;
        }

        public Criteria andTocityEqualTo(String value) {
            addCriterion("ToCity =", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityNotEqualTo(String value) {
            addCriterion("ToCity <>", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityGreaterThan(String value) {
            addCriterion("ToCity >", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityGreaterThanOrEqualTo(String value) {
            addCriterion("ToCity >=", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityLessThan(String value) {
            addCriterion("ToCity <", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityLessThanOrEqualTo(String value) {
            addCriterion("ToCity <=", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityLike(String value) {
            addCriterion("ToCity like", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityNotLike(String value) {
            addCriterion("ToCity not like", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityIn(List<String> values) {
            addCriterion("ToCity in", values, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityNotIn(List<String> values) {
            addCriterion("ToCity not in", values, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityBetween(String value1, String value2) {
            addCriterion("ToCity between", value1, value2, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityNotBetween(String value1, String value2) {
            addCriterion("ToCity not between", value1, value2, "tocity");
            return (Criteria) this;
        }

        public Criteria andToairportIsNull() {
            addCriterion("ToAirport is null");
            return (Criteria) this;
        }

        public Criteria andToairportIsNotNull() {
            addCriterion("ToAirport is not null");
            return (Criteria) this;
        }

        public Criteria andToairportEqualTo(String value) {
            addCriterion("ToAirport =", value, "toairport");
            return (Criteria) this;
        }

        public Criteria andToairportNotEqualTo(String value) {
            addCriterion("ToAirport <>", value, "toairport");
            return (Criteria) this;
        }

        public Criteria andToairportGreaterThan(String value) {
            addCriterion("ToAirport >", value, "toairport");
            return (Criteria) this;
        }

        public Criteria andToairportGreaterThanOrEqualTo(String value) {
            addCriterion("ToAirport >=", value, "toairport");
            return (Criteria) this;
        }

        public Criteria andToairportLessThan(String value) {
            addCriterion("ToAirport <", value, "toairport");
            return (Criteria) this;
        }

        public Criteria andToairportLessThanOrEqualTo(String value) {
            addCriterion("ToAirport <=", value, "toairport");
            return (Criteria) this;
        }

        public Criteria andToairportLike(String value) {
            addCriterion("ToAirport like", value, "toairport");
            return (Criteria) this;
        }

        public Criteria andToairportNotLike(String value) {
            addCriterion("ToAirport not like", value, "toairport");
            return (Criteria) this;
        }

        public Criteria andToairportIn(List<String> values) {
            addCriterion("ToAirport in", values, "toairport");
            return (Criteria) this;
        }

        public Criteria andToairportNotIn(List<String> values) {
            addCriterion("ToAirport not in", values, "toairport");
            return (Criteria) this;
        }

        public Criteria andToairportBetween(String value1, String value2) {
            addCriterion("ToAirport between", value1, value2, "toairport");
            return (Criteria) this;
        }

        public Criteria andToairportNotBetween(String value1, String value2) {
            addCriterion("ToAirport not between", value1, value2, "toairport");
            return (Criteria) this;
        }

        public Criteria andToterminalIsNull() {
            addCriterion("ToTerminal is null");
            return (Criteria) this;
        }

        public Criteria andToterminalIsNotNull() {
            addCriterion("ToTerminal is not null");
            return (Criteria) this;
        }

        public Criteria andToterminalEqualTo(String value) {
            addCriterion("ToTerminal =", value, "toterminal");
            return (Criteria) this;
        }

        public Criteria andToterminalNotEqualTo(String value) {
            addCriterion("ToTerminal <>", value, "toterminal");
            return (Criteria) this;
        }

        public Criteria andToterminalGreaterThan(String value) {
            addCriterion("ToTerminal >", value, "toterminal");
            return (Criteria) this;
        }

        public Criteria andToterminalGreaterThanOrEqualTo(String value) {
            addCriterion("ToTerminal >=", value, "toterminal");
            return (Criteria) this;
        }

        public Criteria andToterminalLessThan(String value) {
            addCriterion("ToTerminal <", value, "toterminal");
            return (Criteria) this;
        }

        public Criteria andToterminalLessThanOrEqualTo(String value) {
            addCriterion("ToTerminal <=", value, "toterminal");
            return (Criteria) this;
        }

        public Criteria andToterminalLike(String value) {
            addCriterion("ToTerminal like", value, "toterminal");
            return (Criteria) this;
        }

        public Criteria andToterminalNotLike(String value) {
            addCriterion("ToTerminal not like", value, "toterminal");
            return (Criteria) this;
        }

        public Criteria andToterminalIn(List<String> values) {
            addCriterion("ToTerminal in", values, "toterminal");
            return (Criteria) this;
        }

        public Criteria andToterminalNotIn(List<String> values) {
            addCriterion("ToTerminal not in", values, "toterminal");
            return (Criteria) this;
        }

        public Criteria andToterminalBetween(String value1, String value2) {
            addCriterion("ToTerminal between", value1, value2, "toterminal");
            return (Criteria) this;
        }

        public Criteria andToterminalNotBetween(String value1, String value2) {
            addCriterion("ToTerminal not between", value1, value2, "toterminal");
            return (Criteria) this;
        }

        public Criteria andTodatetimeIsNull() {
            addCriterion("ToDateTime is null");
            return (Criteria) this;
        }

        public Criteria andTodatetimeIsNotNull() {
            addCriterion("ToDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andTodatetimeEqualTo(String value) {
            addCriterion("ToDateTime =", value, "todatetime");
            return (Criteria) this;
        }

        public Criteria andTodatetimeNotEqualTo(String value) {
            addCriterion("ToDateTime <>", value, "todatetime");
            return (Criteria) this;
        }

        public Criteria andTodatetimeGreaterThan(String value) {
            addCriterion("ToDateTime >", value, "todatetime");
            return (Criteria) this;
        }

        public Criteria andTodatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("ToDateTime >=", value, "todatetime");
            return (Criteria) this;
        }

        public Criteria andTodatetimeLessThan(String value) {
            addCriterion("ToDateTime <", value, "todatetime");
            return (Criteria) this;
        }

        public Criteria andTodatetimeLessThanOrEqualTo(String value) {
            addCriterion("ToDateTime <=", value, "todatetime");
            return (Criteria) this;
        }

        public Criteria andTodatetimeLike(String value) {
            addCriterion("ToDateTime like", value, "todatetime");
            return (Criteria) this;
        }

        public Criteria andTodatetimeNotLike(String value) {
            addCriterion("ToDateTime not like", value, "todatetime");
            return (Criteria) this;
        }

        public Criteria andTodatetimeIn(List<String> values) {
            addCriterion("ToDateTime in", values, "todatetime");
            return (Criteria) this;
        }

        public Criteria andTodatetimeNotIn(List<String> values) {
            addCriterion("ToDateTime not in", values, "todatetime");
            return (Criteria) this;
        }

        public Criteria andTodatetimeBetween(String value1, String value2) {
            addCriterion("ToDateTime between", value1, value2, "todatetime");
            return (Criteria) this;
        }

        public Criteria andTodatetimeNotBetween(String value1, String value2) {
            addCriterion("ToDateTime not between", value1, value2, "todatetime");
            return (Criteria) this;
        }

        public Criteria andTicketpricesIsNull() {
            addCriterion("TicketPrices is null");
            return (Criteria) this;
        }

        public Criteria andTicketpricesIsNotNull() {
            addCriterion("TicketPrices is not null");
            return (Criteria) this;
        }

        public Criteria andTicketpricesEqualTo(String value) {
            addCriterion("TicketPrices =", value, "ticketprices");
            return (Criteria) this;
        }

        public Criteria andTicketpricesNotEqualTo(String value) {
            addCriterion("TicketPrices <>", value, "ticketprices");
            return (Criteria) this;
        }

        public Criteria andTicketpricesGreaterThan(String value) {
            addCriterion("TicketPrices >", value, "ticketprices");
            return (Criteria) this;
        }

        public Criteria andTicketpricesGreaterThanOrEqualTo(String value) {
            addCriterion("TicketPrices >=", value, "ticketprices");
            return (Criteria) this;
        }

        public Criteria andTicketpricesLessThan(String value) {
            addCriterion("TicketPrices <", value, "ticketprices");
            return (Criteria) this;
        }

        public Criteria andTicketpricesLessThanOrEqualTo(String value) {
            addCriterion("TicketPrices <=", value, "ticketprices");
            return (Criteria) this;
        }

        public Criteria andTicketpricesLike(String value) {
            addCriterion("TicketPrices like", value, "ticketprices");
            return (Criteria) this;
        }

        public Criteria andTicketpricesNotLike(String value) {
            addCriterion("TicketPrices not like", value, "ticketprices");
            return (Criteria) this;
        }

        public Criteria andTicketpricesIn(List<String> values) {
            addCriterion("TicketPrices in", values, "ticketprices");
            return (Criteria) this;
        }

        public Criteria andTicketpricesNotIn(List<String> values) {
            addCriterion("TicketPrices not in", values, "ticketprices");
            return (Criteria) this;
        }

        public Criteria andTicketpricesBetween(String value1, String value2) {
            addCriterion("TicketPrices between", value1, value2, "ticketprices");
            return (Criteria) this;
        }

        public Criteria andTicketpricesNotBetween(String value1, String value2) {
            addCriterion("TicketPrices not between", value1, value2, "ticketprices");
            return (Criteria) this;
        }

        public Criteria andAircraftcabinIsNull() {
            addCriterion("AircraftCabin is null");
            return (Criteria) this;
        }

        public Criteria andAircraftcabinIsNotNull() {
            addCriterion("AircraftCabin is not null");
            return (Criteria) this;
        }

        public Criteria andAircraftcabinEqualTo(String value) {
            addCriterion("AircraftCabin =", value, "aircraftcabin");
            return (Criteria) this;
        }

        public Criteria andAircraftcabinNotEqualTo(String value) {
            addCriterion("AircraftCabin <>", value, "aircraftcabin");
            return (Criteria) this;
        }

        public Criteria andAircraftcabinGreaterThan(String value) {
            addCriterion("AircraftCabin >", value, "aircraftcabin");
            return (Criteria) this;
        }

        public Criteria andAircraftcabinGreaterThanOrEqualTo(String value) {
            addCriterion("AircraftCabin >=", value, "aircraftcabin");
            return (Criteria) this;
        }

        public Criteria andAircraftcabinLessThan(String value) {
            addCriterion("AircraftCabin <", value, "aircraftcabin");
            return (Criteria) this;
        }

        public Criteria andAircraftcabinLessThanOrEqualTo(String value) {
            addCriterion("AircraftCabin <=", value, "aircraftcabin");
            return (Criteria) this;
        }

        public Criteria andAircraftcabinLike(String value) {
            addCriterion("AircraftCabin like", value, "aircraftcabin");
            return (Criteria) this;
        }

        public Criteria andAircraftcabinNotLike(String value) {
            addCriterion("AircraftCabin not like", value, "aircraftcabin");
            return (Criteria) this;
        }

        public Criteria andAircraftcabinIn(List<String> values) {
            addCriterion("AircraftCabin in", values, "aircraftcabin");
            return (Criteria) this;
        }

        public Criteria andAircraftcabinNotIn(List<String> values) {
            addCriterion("AircraftCabin not in", values, "aircraftcabin");
            return (Criteria) this;
        }

        public Criteria andAircraftcabinBetween(String value1, String value2) {
            addCriterion("AircraftCabin between", value1, value2, "aircraftcabin");
            return (Criteria) this;
        }

        public Criteria andAircraftcabinNotBetween(String value1, String value2) {
            addCriterion("AircraftCabin not between", value1, value2, "aircraftcabin");
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