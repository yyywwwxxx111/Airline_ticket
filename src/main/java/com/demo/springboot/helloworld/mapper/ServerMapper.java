package com.demo.springboot.helloworld.mapper;

import com.demo.springboot.helloworld.common.domain.Server;
import com.demo.springboot.helloworld.common.domain.ServerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServerMapper {
    long countByExample(ServerExample example);

    int deleteByExample(ServerExample example);

    int deleteByPrimaryKey(Long sidPk);

    int insert(Server record);

    int insertSelective(Server record);

    List<Server> selectByExample(ServerExample example);

    Server selectByPrimaryKey(Long sidPk);

    int updateByExampleSelective(@Param("record") Server record, @Param("example") ServerExample example);

    int updateByExample(@Param("record") Server record, @Param("example") ServerExample example);

    int updateByPrimaryKeySelective(Server record);

    int updateByPrimaryKey(Server record);
}