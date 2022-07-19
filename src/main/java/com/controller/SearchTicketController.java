package com.controller;

import com.common.utils.Result;
import com.common.domain.flight_ticket;
import com.service.Usr_mngService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SearchTicketController {

    @Autowired
    Usr_mngService usr_mngService;

    @RequestMapping("/search")
    @ResponseBody
    public Object SearchTicket(@RequestParam(defaultValue = "1") int pageNo,
                               @RequestParam(defaultValue = "10") int pageSize,String dateDay,
                                String departCity,
                               String destination){




      String dateDay1=dateDay.substring(0,5);
      String dateDay2=dateDay1.replace('/','-');
       flight_ticket flight=new flight_ticket();
       flight.setDateDay(dateDay2);
       flight.setDepartCity(departCity);
       flight.setDestination(destination);
        return Result.success(usr_mngService.findticket(pageNo,pageSize,flight),"分页 查询user 对象");
    }


}
