package com.demo.springboot.helloworld.common.domain;

public class Flight {
    private Integer tableid;

    private String id;

    private String airline;

    private String flightnumber;

    private String aircraft;

    private String fueloiltax;

    private String fromcity;

    private String fromairport;

    private String fromterminal;

    private String fromdatetime;

    private String tocity;

    private String toairport;

    private String toterminal;

    private String todatetime;

    private String ticketprices;

    private String aircraftcabin;

    public Integer getTableid() {
        return tableid;
    }

    public void setTableid(Integer tableid) {
        this.tableid = tableid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline == null ? null : airline.trim();
    }

    public String getFlightnumber() {
        return flightnumber;
    }

    public void setFlightnumber(String flightnumber) {
        this.flightnumber = flightnumber == null ? null : flightnumber.trim();
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft == null ? null : aircraft.trim();
    }

    public String getFueloiltax() {
        return fueloiltax;
    }

    public void setFueloiltax(String fueloiltax) {
        this.fueloiltax = fueloiltax == null ? null : fueloiltax.trim();
    }

    public String getFromcity() {
        return fromcity;
    }

    public void setFromcity(String fromcity) {
        this.fromcity = fromcity == null ? null : fromcity.trim();
    }

    public String getFromairport() {
        return fromairport;
    }

    public void setFromairport(String fromairport) {
        this.fromairport = fromairport == null ? null : fromairport.trim();
    }

    public String getFromterminal() {
        return fromterminal;
    }

    public void setFromterminal(String fromterminal) {
        this.fromterminal = fromterminal == null ? null : fromterminal.trim();
    }

    public String getFromdatetime() {
        return fromdatetime;
    }

    public void setFromdatetime(String fromdatetime) {
        this.fromdatetime = fromdatetime == null ? null : fromdatetime.trim();
    }

    public String getTocity() {
        return tocity;
    }

    public void setTocity(String tocity) {
        this.tocity = tocity == null ? null : tocity.trim();
    }

    public String getToairport() {
        return toairport;
    }

    public void setToairport(String toairport) {
        this.toairport = toairport == null ? null : toairport.trim();
    }

    public String getToterminal() {
        return toterminal;
    }

    public void setToterminal(String toterminal) {
        this.toterminal = toterminal == null ? null : toterminal.trim();
    }

    public String getTodatetime() {
        return todatetime;
    }

    public void setTodatetime(String todatetime) {
        this.todatetime = todatetime == null ? null : todatetime.trim();
    }

    public String getTicketprices() {
        return ticketprices;
    }

    public void setTicketprices(String ticketprices) {
        this.ticketprices = ticketprices == null ? null : ticketprices.trim();
    }

    public String getAircraftcabin() {
        return aircraftcabin;
    }

    public void setAircraftcabin(String aircraftcabin) {
        this.aircraftcabin = aircraftcabin == null ? null : aircraftcabin.trim();
    }

    public Flight(String fromcity, String fromdatetime, String tocity) {
        this.fromcity = fromcity;
        this.fromdatetime = fromdatetime;
        this.tocity = tocity;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "tableid=" + tableid +
                ", id='" + id + '\'' +
                ", airline='" + airline + '\'' +
                ", flightnumber='" + flightnumber + '\'' +
                ", aircraft='" + aircraft + '\'' +
                ", fueloiltax='" + fueloiltax + '\'' +
                ", fromcity='" + fromcity + '\'' +
                ", fromairport='" + fromairport + '\'' +
                ", fromterminal='" + fromterminal + '\'' +
                ", fromdatetime='" + fromdatetime + '\'' +
                ", tocity='" + tocity + '\'' +
                ", toairport='" + toairport + '\'' +
                ", toterminal='" + toterminal + '\'' +
                ", todatetime='" + todatetime + '\'' +
                ", ticketprices='" + ticketprices + '\'' +
                ", aircraftcabin='" + aircraftcabin + '\'' +
                '}';
    }
}