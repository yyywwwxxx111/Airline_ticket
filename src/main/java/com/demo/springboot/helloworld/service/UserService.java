package com.demo.springboot.helloworld.service;


import com.demo.springboot.helloworld.common.domain.User;

public interface UserService {


     boolean match(User user);

     boolean register(User user);
}
