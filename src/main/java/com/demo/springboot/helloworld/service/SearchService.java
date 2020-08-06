package com.demo.springboot.helloworld.service;

import com.demo.springboot.helloworld.common.domain.Flight;
import com.demo.springboot.helloworld.common.domain.flight_ticket;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import java.util.List;


public interface SearchService {
    public List<flight_ticket> search(String fromcity, String tocity, String date);
//    public String search(String fromcity, String tocity, String date);
}

