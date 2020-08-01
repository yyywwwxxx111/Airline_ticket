package com.demo.springboot.helloworld.service;

import com.demo.springboot.helloworld.common.domain.User;
import com.demo.springboot.helloworld.common.domain.UserExample;
import com.demo.springboot.helloworld.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    UserMapper userMapper;

//    @Override
//    public List<User> getList() {
//        UserExample example = new UserExample();
//        List<User> user=userMapper.selectByExample(example);
//        return null;
//    }




    public boolean match(User user) {
        UserExample example = new UserExample();
        example.createCriteria().andEmailEqualTo(user.getEmail()).andPasswordEqualTo(user.getPassword());
        List<User> users = userMapper.selectByExample(example);
        if (users.isEmpty()){
            return false;
        }
        else
            return true;

    }
}
