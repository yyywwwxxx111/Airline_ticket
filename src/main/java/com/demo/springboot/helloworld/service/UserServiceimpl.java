package com.demo.springboot.helloworld.service;

import com.demo.springboot.helloworld.common.domain.User;
import com.demo.springboot.helloworld.common.domain.UserExample;
import com.demo.springboot.helloworld.mapper.ServerMapper;
import com.demo.springboot.helloworld.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {

//    @Override
//    public List<User> getList() {
//        UserExample example = new UserExample();
//        List<User> user=userMapper.selectByExample(example);
//        return null;
//    }
        @Autowired
        UserMapper userMapper;


    @Override
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

    @Override
    public boolean register(User user) {
        UserExample example = new UserExample();
        List<User> users = userMapper.selectByEmail(user.getEmail());
        if (!users.isEmpty()) { //有重复邮箱
            System.out.println("hhh");
            return false;
        } else {
            List<User> users1 = userMapper.selectByPhone(user.getPhone());
            if (!users1.isEmpty()) {
                return false;
            } else {
                if (!user.getPassword().equals(user.getPassword2()) ) {
                    System.out.println("hh");
                    return false;
                }else {
                    userMapper.insert(user);
                    return true;
                }
            }
        }
    }
}
