package com.demo.springboot.helloworld.controller;


import com.demo.springboot.helloworld.common.domain.Flight;
import com.demo.springboot.helloworld.common.utils.Result;
import com.demo.springboot.helloworld.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SearchController {
    @Autowired
    SearchService searchService;
    @RequestMapping("/getTickets")
    @ResponseBody
    public Object getTicks(ModelMap model , @RequestParam("fromcity") String fromcity, @RequestParam("tocity") String tocity,
                           @RequestParam("date") String date, Flight flight){
//        return Result.success(searchService.search(fromcity,tocity,date),"分页 查询ticket 对象");
        return searchService.search(fromcity,tocity,date);
    }

}
