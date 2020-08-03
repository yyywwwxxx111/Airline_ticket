package com.demo.springboot.helloworld.controller;


import com.demo.springboot.helloworld.common.domain.Flight;
import com.demo.springboot.helloworld.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SearchController {
    @Autowired
    SearchService searchService;
//    FlightRepository flightRepository;
//    @RequestMapping(value = "/fenye",method = RequestMethod.GET)
//    public String getlists(ModelMap model){
//        List<Flight> flight =new ArrayList<Flight>();
//        long geshu=5;//设置每页显示的数据的条数
//        long top1=(long) flight.size();
//        long top=top1/geshu+1;
//        model.addAttribute("top",top);//将最大页面数传到前端页面
//        return "/fenye";
//    }
//    @PostMapping(value="/data")
//    @ResponseBody
//    public List<Flight> data(long number){
//        List<Flight> persons=new ArrayList<Flight>();
//        long geshu=5;
//        long di=(number-1)*geshu+1;
//        long gao=number*5;
//        persons=flightRepository.findByIdBetween(di,gao);//传递上下限
//        return persons;//将数据传到前端
//    }
//    @RequestMapping("/show")
//    public String getShow() {
//        return "show";
//    }
    @RequestMapping("/views/book/doubles_search_show")
//    @ResponseBody
    public String getshow(Model model , @RequestParam("fromcity") String fromcity, @RequestParam("tocity") String tocity,
                           @RequestParam("date") String date, Flight flight){
//        return Result.success(searchService.search(fromcity,tocity,date),"分页 查询ticket 对象");
        List<Flight> flights = searchService.search(fromcity,tocity,date);
        model.addAttribute("flights", flights);
        return "views/book/doubles_search_show";
    }
}
