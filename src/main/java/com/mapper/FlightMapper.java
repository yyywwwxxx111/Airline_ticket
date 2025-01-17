package com.mapper;

import com.common.domain.Flight;
import com.common.domain.FlightExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlightMapper {
    long countByExample(FlightExample example);

    int deleteByExample(FlightExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Flight record);

    int insertSelective(Flight record);

    List<Flight> selectByExample(FlightExample example);

    Flight selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Flight record, @Param("example") FlightExample example);

    int updateByExample(@Param("record") Flight record, @Param("example") FlightExample example);

    int updateByPrimaryKeySelective(Flight record);

    int updateByPrimaryKey(Flight record);
}