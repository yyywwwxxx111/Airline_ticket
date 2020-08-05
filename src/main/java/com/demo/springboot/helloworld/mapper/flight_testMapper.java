package com.demo.springboot.helloworld.mapper;

import com.demo.springboot.helloworld.common.domain.flight_test;
import com.demo.springboot.helloworld.common.domain.flight_testExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface flight_testMapper {
    long countByExample(flight_testExample example);

    int deleteByExample(flight_testExample example);

    int deleteByPrimaryKey(Integer ind);

    int insert(flight_test record);

    int insertSelective(flight_test record);

    List<flight_test> selectByExample(flight_testExample example);

    flight_test selectByPrimaryKey(Integer ind);

    int updateByExampleSelective(@Param("record") flight_test record, @Param("example") flight_testExample example);

    int updateByExample(@Param("record") flight_test record, @Param("example") flight_testExample example);

    int updateByPrimaryKeySelective(flight_test record);

    int updateByPrimaryKey(flight_test record);
}