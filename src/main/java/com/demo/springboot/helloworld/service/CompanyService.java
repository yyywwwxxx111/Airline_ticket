package com.demo.springboot.helloworld.service;

import com.demo.springboot.helloworld.common.domain.Company;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface CompanyService {
    public PageInfo<Company> getList(int pageNo, int pageSize);

    void deleteCompanyById(Company company);

    void deleteCompaniesByIds(List<Integer> ids);
}
