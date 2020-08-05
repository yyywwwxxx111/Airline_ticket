package com.demo.springboot.helloworld.mapper;

import com.demo.springboot.helloworld.common.domain.company;
import com.demo.springboot.helloworld.common.domain.companyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface companyMapper {
    long countByExample(companyExample example);

    int deleteByExample(companyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(company record);

    int insertSelective(company record);

    List<company> selectByExample(companyExample example);

    company selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") company record, @Param("example") companyExample example);

    int updateByExample(@Param("record") company record, @Param("example") companyExample example);

    int updateByPrimaryKeySelective(company record);

    int updateByPrimaryKey(company record);
}