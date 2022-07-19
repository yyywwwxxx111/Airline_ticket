package com.service;


import com.common.domain.User;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

@Service
public interface UserService {


     boolean match(User user);

     int register( User user);

     User find(User user);

     PageInfo<User> findusers(int pageNo, int pageSize);

     void outlogin(User user);

     void insert(User user);
}
