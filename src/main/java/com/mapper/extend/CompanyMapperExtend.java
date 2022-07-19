package com.mapper.extend;

import com.common.domain.Company;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CompanyMapperExtend {

    List<Company> myList();

    void deleteCompaniesByIds(@Param("ids") List<Integer> ids);
}
