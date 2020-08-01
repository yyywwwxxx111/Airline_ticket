package com.demo.springboot.helloworld.service;

import com.demo.springboot.helloworld.common.domain.Flight;

public interface SearchService {
    public Flight search(Flight flight);
    public String search(String fromcity, String tocity, String date);
}

