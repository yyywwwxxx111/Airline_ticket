package com.demo.springboot.helloworld.controller;

import com.demo.springboot.helloworld.common.domain.User;
import com.demo.springboot.helloworld.common.utils.Result;
import com.demo.springboot.helloworld.service.UserService;
import com.demo.springboot.helloworld.service.Usr_mngService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Usr_mngController {

    @Autowired
    public Usr_mngService usr_mngService;


    @RequestMapping("/usrmng")
    @ResponseBody
    public Object getTicket(@RequestParam(defaultValue = "1") int pageNo,
                            @RequestParam(defaultValue = "10") int pageSize, long uid) {


            //uid=
        return Result.success(usr_mngService.finduser(pageNo,pageSize,uid),"分页 查询user 对象");


    }
}