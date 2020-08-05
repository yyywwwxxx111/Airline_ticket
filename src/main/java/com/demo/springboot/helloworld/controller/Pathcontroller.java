package com.demo.springboot.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Pathcontroller {


    @RequestMapping(value = "/page/{path}")
    public String toPage(@PathVariable("path") String p)
    {
        return p;
    }

    @RequestMapping(value = "/index")
    public String toPagee()
    {
        return "index";
    }

}
