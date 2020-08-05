package com.demo.springboot.helloworld.controller;

import com.demo.springboot.helloworld.common.domain.Company;
import com.demo.springboot.helloworld.common.utils.Result;
import com.demo.springboot.helloworld.mapper.CompanyMapper;
import com.demo.springboot.helloworld.service.CompanyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Companycontroller {
    //获取参数的第一种方式
    //1 直接获取,通过@RequestParam 指定具体参数名,基本类型做参数，必须加@RequestParam默认值
    //2 java bean方式获取 创建个User类
    //3 获取数组 没讲
    //把对象传递到页面视图层 Model Modelmap
    @Autowired
    CompanyService companyService;

    @ResponseBody
    //@RequestMapping("/company")
    @GetMapping("/company")
//    public PageInfo<Company> getList(){
//        return companyService.getList();
//    }
    public Object getList(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "5") int pageSize){
        return Result.success(companyService.getList(pageNo, pageSize), "分页 查询company对象");
    }

    @GetMapping("/listcompanies")
    public String toCompanyPage(){
        return "/company";
    }

}
