package com.mapper;

import com.common.domain.usr_flight;
import com.common.domain.usr_flightExample;

import java.util.List;

import com.mapper.extend.Usr_flightMapperExtend;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Usr_flightMapper extends Usr_flightMapperExtend {
    long countByExample(usr_flightExample example);

    int deleteByExample(usr_flightExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(usr_flight record);

    int insertSelective(usr_flight record);

    List<usr_flight> selectByExample(usr_flightExample example);

    usr_flight selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") usr_flight record, @Param("example") usr_flightExample example);

    int updateByExample(@Param("record") usr_flight record, @Param("example") usr_flightExample example);

    int updateByPrimaryKeySelective(usr_flight record);

    int updateByPrimaryKey(usr_flight record);
}