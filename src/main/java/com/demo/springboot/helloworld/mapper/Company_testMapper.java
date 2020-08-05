package com.demo.springboot.helloworld.mapper;

import com.demo.springboot.helloworld.common.domain.Company_test;
import com.demo.springboot.helloworld.common.domain.Company_testExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Company_testMapper {
    long countByExample(Company_testExample example);

    int deleteByExample(Company_testExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Company_test record);

    int insertSelective(Company_test record);

    List<Company_test> selectByExample(Company_testExample example);

    Company_test selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Company_test record, @Param("example") Company_testExample example);

    int updateByExample(@Param("record") Company_test record, @Param("example") Company_testExample example);

    int updateByPrimaryKeySelective(Company_test record);

    int updateByPrimaryKey(Company_test record);
}