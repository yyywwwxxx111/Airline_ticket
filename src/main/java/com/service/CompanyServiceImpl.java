package com.service;

import com.common.domain.Company;
import com.mapper.CompanyMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    //自动注入mapper
    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public PageInfo<Company> getList(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<Company> companies = companyMapper.myList();
        PageInfo<Company> companyPageInfo = new PageInfo<>(companies);
        return companyPageInfo;
    }

    @Override
    public void deleteCompanyById(Company company) {
        companyMapper.deleteByPrimaryKey(company.getId());
    }

    @Override
    public void deleteCompaniesByIds(List<Integer> ids) {
        companyMapper.deleteCompaniesByIds(ids);
    }

}
