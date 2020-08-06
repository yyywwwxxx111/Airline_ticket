package com.demo.springboot.helloworld.service;

import com.demo.springboot.helloworld.common.domain.Flight;
import com.demo.springboot.helloworld.common.domain.FlightExample;
import com.demo.springboot.helloworld.common.domain.flight_ticket;
import com.demo.springboot.helloworld.common.domain.flight_ticketExample;
import com.demo.springboot.helloworld.mapper.FlightMapper;
import com.demo.springboot.helloworld.mapper.flight_ticketMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class SearchServiceIml implements SearchService {
    @Autowired
    private flight_ticketMapper flight_ticketMapper;

    @Override
    public List<flight_ticket> search(String fromcity, String tocity, String date) {
        String[] dated = date.split("\\s+");
        dated[0] = dated[0].substring(0, 5) + "%";
        dated[1] = dated[1].substring(0, 5) + "%";
        System.out.println(dated[0]);
        flight_ticketExample flightExample = new flight_ticketExample();
        flightExample.createCriteria().andDepartCityEqualTo(fromcity).andDestinationEqualTo(tocity).andDateDayLike(dated[0]);//.andPasswordEqualTo(admin.getPassword());
        List<flight_ticket> flights1 = flight_ticketMapper.selectByExample(flightExample);
//        for(Flight i:flights1){
//            model.addAttribute(i);
//        }

        flight_ticketExample flightExample1 = new flight_ticketExample();
        flightExample1.createCriteria().andDepartCityEqualTo(tocity).andDestinationEqualTo(fromcity).andDateDayLike(dated[1]);//.andPasswordEqualTo(admin.getPassword());
        List<flight_ticket> flights2 = flight_ticketMapper.selectByExample(flightExample1);

        for (flight_ticket i : flights2) {
            flights1.add(i);
        }
//        for(Flight i:flights2){
//            model.addAttribute(i);
//        }
        return flights1;
//    public String search(Model model, String fromcity, String tocity, String date){
////        Flight flight = new Flight(fromcity,tocity,date)
//        String[] dated = date.split("\\s+");
//        dated[0]= dated[0].substring(0,5)+"%";
//        dated[1]= dated[1].substring(0,5)+"%";
//        System.out.println(dated[0]);
//        FlightExample flightExample = new FlightExample();
////        flightExample.createCriteria().andDepartCityEqualTo(fromcity).andDestinationEqualTo(tocity).andDateDayLessThan(dated[0]);//.andPasswordEqualTo(admin.getPassword());
//        flightExample.createCriteria().andDepartCityEqualTo(fromcity).andDestinationEqualTo(tocity).andDateDayLike(dated[0]);//.andPasswordEqualTo(admin.getPassword());
//        List<Flight> flights1 = flightMapper.selectByExample(flightExample);
//        String results = "";
//        for(Flight i:flights1){
//            results = results + i.toString() + "\n";
//        }
//        if(flights1.size()<=0){
//            return "null";
//        }
//
//
//        FlightExample flightExample1 = new FlightExample();
//        flightExample1.createCriteria().andDepartCityEqualTo(tocity).andDestinationEqualTo(fromcity).andDateDayLike(dated[1]);//.andPasswordEqualTo(admin.getPassword());
//        List<Flight> flights2 = flightMapper.selectByExample(flightExample1);
//
//        for(Flight i:flights2){
//            results = results + i.toString() + "\n";
//
//
//        return (results.length()>0?results:"null");
    }
}
