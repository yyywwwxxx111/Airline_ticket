package com.demo.springboot.helloworld.controller;

import com.demo.springboot.helloworld.common.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Usercontroller {
    //获取参数的第一种方式
    //1 直接获取,通过@RequestParam 指定具体参数名,基本类型做参数，必须加@RequestParam默认值
    //2 java bean方式获取 创建个User类
    //3 获取数组 没讲
    //把对象传递到页面视图层 Model Modelmap



//    public String login(String email,String password){
//
//        if(email.equals("admin@123") && password.equals("admin123")){
//
//
//            System.out.println("ok!");
//            return"login_success";
//        }
//        else{
//            System.out.println("no!");
//            return "login";
//
//        }
//
//    }
    @RequestMapping("/login")
    public String login(ModelMap model , @RequestParam("email") String Email, String password,
                        @RequestParam(defaultValue = "0") int age, User user){

        if(Email.equals("admin@123") && password.equals("admin123")){


            System.out.println("ok!");
            return"login_success";
        }
        else{
            System.out.println("no!");
            String msg="用户名或密码错误";//回显到视图层
            //model.addAttribute("err_msg",msg);//回显
            model.put("err_msg",msg);
            return "login";

        }

    }

}
