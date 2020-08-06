package com.demo.springboot.helloworld.service;

import com.demo.springboot.helloworld.common.domain.User;
import com.demo.springboot.helloworld.common.domain.UserExample;
import com.demo.springboot.helloworld.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
        else {
                userMapper.setByIsLogin(user);
                return true;
        }

    }

    @Override
    public int register(User user) {
        List<User> users = userMapper.selectByEmail(user.getEmail());
        if (!users.isEmpty()) { //有重复邮箱
            return 1;
        } else {
            List<User> users1 = userMapper.selectByPhone(user.getPhone());
            if (!users1.isEmpty()) {
                return 2;
            } else {
                if (!user.getPassword().equals(user.getPassword2()) ) {
                    System.out.println("hh");
                    return 3;
                }else {
                    userMapper.insert(user);
                    //user.setIsLogin(1);
                    return 4;
                }
            }
        }
    }

    @Override
    public User find(User user) {
//        UserExample example=new UserExample();
//        example.createCriteria().andIsLoginEqualTo(1);
        return userMapper.selectByIs_login();

    }

    @Override
    public PageInfo<User> findusers(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<User> users=userMapper.selectByExample(null);
        return new PageInfo<>(users);
    }

    @Override
    public void outlogin(User user) {
        userMapper.outlogin(user);
    }

    @Override
    public void insert(User user) {
        userMapper.insertByLogin(user);

    }
}
