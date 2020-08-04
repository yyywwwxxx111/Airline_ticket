package com.demo.springboot.helloworld.service;


import com.demo.springboot.helloworld.common.domain.User;
import com.github.pagehelper.PageInfo;
import org.springframework.ui.Model;

public interface UserService {


     boolean match(User user);

     int register( User user);

     User find(User user);

     PageInfo<User> findusers(int pageNo, int pageSize);

     void outlogin(User user);
}
