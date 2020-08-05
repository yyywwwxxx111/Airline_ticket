package com.demo.springboot.helloworld.mapper.extend;

import com.demo.springboot.helloworld.common.domain.Company;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CompanyMapperExtend {

    List<Company> myList();

    void deleteCompaniesByIds(@Param("ids") List<Integer> ids);
}
