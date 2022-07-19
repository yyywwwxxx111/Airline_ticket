package com.controller;

import com.common.domain.User;
import com.common.utils.Result;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/login")
public class Usercontroller {
    //获取参数的第一种方式
    //1 直接获取,通过@RequestParam 指定具体参数名,基本类型做参数，必须加@RequestParam默认值
    //2 java bean方式获取 创建个User类
    //3 获取数组 没讲
    //把对象传递到页面视图层 Model Modelmap





    @Autowired
    UserService userService;
    @RequestMapping("/login")
   //@ResponseBody
    public String login(ModelMap model , String email, String password) {

        User user = new User();
        User users = new User();
        if (userService.find(user) ==null) {//如果未登陆
            users.setEmail(email);
            users.setPassword(password);
            if (userService.match(users)) {

                return "login_success";
            } else {
                String msg = "用户名或密码错误";//回显到视图层
                //model.addAttribute("err_msg",msg);//回显
                model.put("err_msg", msg);
                return "login";
            }


        }else
        {
            String msg = "请先退出登陆";//回显到视图层
            //model.addAttribute("err_msg",msg);//回显
            model.put("err_msg", msg);
            return "login";

        }
    }

    @RequestMapping("/register")
    public String register(ModelMap model,String phone,String email,String password,String password2,@RequestParam(defaultValue = "张三") String name
    ,@RequestParam(defaultValue = "男") String gender,@RequestParam(defaultValue = "0") int is_login ) {
        User user = new User();
        user.setPhone(phone);
        user.setEmail(email);
        user.setPassword(password);
        user.setPassword2(password2);
        user.setName(name);
        user.setGender(gender);
        user.setIsLogin(is_login);


        switch (userService.register(user)) {
            case 1: {
                String msg = "邮箱已被注册";//回显到视图层
                model.put("err_msg", msg);//回显
                return "register";

            }
            case 2: {
                String msg = "手机号已被注册";//回显到视图层
                model.put("err_msg", msg);//回显
                return "register";
            }
            case 3: {
                String msg = "两次密码不正确";//回显到视图层
                model.put("err_msg", msg);//回显
                return "register";
            }
            case 4: {
                System.out.println("ok!");

            }

        }

        return "profile";
    }

    @RequestMapping(value="/page/profile")
    public String profile(ModelMap model) {
        User user = new User();
        User users = new User();
        users = userService.find(user);
        model.put("name", users.getName());
        model.put("exp", users.getExp());
        model.put("school", users.getSchool());
        //System.out.println();
        /////////查询机票信息//////////
        return "profile";

    }



    @RequestMapping(value = "/getuser")
    @ResponseBody
    public Object usgmngg(@RequestParam(defaultValue = "1") int pageNo,
                          @RequestParam(defaultValue = "10") int pageSize){



        return Result.success(userService.findusers(pageNo,pageSize),"分页 查询user 对象");

    }




    @RequestMapping("/outlogin")
    public String relogin(){
        User user=new User();
        User users=new User();
        users=userService.find(user);
        userService.outlogin(users);
        return "login";
    }

    @RequestMapping("/revise")
    public String revisee(@RequestParam(value="name") String name,
                          @RequestParam(value="email") String email,
                          @RequestParam(value="major")String major,
                          @RequestParam(value="phone")String phone,
                          @RequestParam(value="school")String school,
                          @RequestParam(value="exp")String exp ){

        User user=new User();
//        User users=new User();
//        users=userService.find(users);
        user.setName(name);
        user.setPhone(phone);
        user.setEmail(email);
        user.setExp(exp);
        user.setMajor(major);
        user.setSchool(school);
//        user.setPassword(users.getPassword());
//        user.setGender(users.getGender());
//        user.setPassword2(users.getPassword2());
//        user.setIsLogin(users.getIsLogin());


        userService.insert(user);
        return "index";
    }




}




//    public String login(ModelMap model , @RequestParam("email") String Email, String password,
//                        @RequestParam(defaultValue = "0") int age, User user){
//
//
//        return userService.match();
//
//
//
//
////        if(Email.equals("admin@123") && password.equals("admin123")){
////
////
////            System.out.println("ok!");
////            return"login_success";
////        }
////        else{
////            System.out.println("no!");
////            String msg="用户名或密码错误";//回显到视图层
////            //model.addAttribute("err_msg",msg);//回显
////            model.put("err_msg",msg);
////            return "login";
////
////        }
//
//    }

//    @Autowired
//    UserService userService;
//
//    //@Requestmapping默认返回页面html
//    //如果要返回json，多加一个注解
//    @ResponseBody
//
//    public List<User> list(){
//
//        return userService.getList();
//
//    }



