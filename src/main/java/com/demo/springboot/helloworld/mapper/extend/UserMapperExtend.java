package com.demo.springboot.helloworld.mapper.extend;

import com.demo.springboot.helloworld.common.domain.User;



import java.util.List;

public interface UserMapperExtend {
   // List<User> selectByName(@Param("name") String name, @Param("password") String password);


   // List<User> selectByAll(@Param("i") int i,@Param("user") User user);

    List<User> selectByEmail(String email);

    List<User> selectByPhone(String phone);

    User selectByIs_login();

    void setByIsLogin(User user);

    void outlogin(User user);

    void insertByLogin(User user);
}
