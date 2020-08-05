package com.demo.springboot.helloworld.mapper;

import com.demo.springboot.helloworld.common.domain.flight_ticket;
import com.demo.springboot.helloworld.common.domain.flight_ticketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface flight_ticketMapper {
    long countByExample(flight_ticketExample example);

    int deleteByExample(flight_ticketExample example);

    int deleteByPrimaryKey(Long id);

    int insert(flight_ticket record);

    int insertSelective(flight_ticket record);

    List<flight_ticket> selectByExample(flight_ticketExample example);

    flight_ticket selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") flight_ticket record, @Param("example") flight_ticketExample example);

    int updateByExample(@Param("record") flight_ticket record, @Param("example") flight_ticketExample example);

    int updateByPrimaryKeySelective(flight_ticket record);

    int updateByPrimaryKey(flight_ticket record);
}