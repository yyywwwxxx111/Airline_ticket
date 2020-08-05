package com.demo.springboot.helloworld.mapper;

import com.demo.springboot.helloworld.common.domain.Company;
import com.demo.springboot.helloworld.common.domain.CompanyExample;
import java.util.List;

import com.demo.springboot.helloworld.mapper.extend.CompanyMapperExtend;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper extends CompanyMapperExtend {
    long countByExample(CompanyExample example);

    int deleteByExample(CompanyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Company record);

    int insertSelective(Company record);

    List<Company> selectByExample(CompanyExample example);

    Company selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);

    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
}