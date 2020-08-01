package com.demo.springboot.helloworld.service;

import com.demo.springboot.helloworld.common.domain.Flight;
import com.demo.springboot.helloworld.common.domain.FlightExample;
import com.demo.springboot.helloworld.mapper.FlightMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceIml implements SearchService{
    @Autowired
    private FlightMapper flightMapper;

    @Override
    public Flight search(Flight flight){
        return flight;
    }
    public String search(String fromcity, String tocity, String date){
//        Flight flight = new Flight(fromcity,tocity,date)
        String[] dated = date.split("\\s+");
        FlightExample flightExample = new FlightExample();
        flightExample.createCriteria().andFromcityEqualTo(fromcity).andTocityEqualTo(tocity).andFromdatetimeLessThan(dated[0]);//.andPasswordEqualTo(admin.getPassword());
        List<Flight> flights1 = flightMapper.selectByExample(flightExample);
        String results = "";
        for(Flight i:flights1){
            results = results + i.toString() + "\n";
        }
        if(flights1.size()<=0){
            return "null";
        }

        FlightExample flightExample1 = new FlightExample();
        flightExample1.createCriteria().andFromcityEqualTo(tocity).andTocityEqualTo(fromcity).andFromdatetimeGreaterThan(dated[1]);//.andPasswordEqualTo(admin.getPassword());
        List<Flight> flights2 = flightMapper.selectByExample(flightExample1);

        for(Flight i:flights2){
            results = results + i.toString() + "\n";
        }
        return (results.length()>0?results:"null");
    }
}
