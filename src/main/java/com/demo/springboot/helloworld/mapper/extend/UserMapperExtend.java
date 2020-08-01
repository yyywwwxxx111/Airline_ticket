package com.demo.springboot.helloworld.mapper.extend;

import com.demo.springboot.helloworld.common.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapperExtend {
    List<User> selectByName(@Param("name") String name, @Param("password") String password);


    List<User> selectByAll(@Param("i") int i,@Param("user") User user);

}
