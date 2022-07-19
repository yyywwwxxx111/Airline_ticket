package com.service;

import com.common.domain.flight_ticket;

import java.util.List;


public interface SearchService {
    public List<flight_ticket> search(String fromcity, String tocity, String date);
//    public String search(String fromcity, String tocity, String date);
}

