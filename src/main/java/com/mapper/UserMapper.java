package com.mapper;

import com.common.domain.User;
import com.common.domain.UserExample;

import java.util.List;

import com.mapper.extend.UserMapperExtend;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends UserMapperExtend {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long uidPk);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long uidPk);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}