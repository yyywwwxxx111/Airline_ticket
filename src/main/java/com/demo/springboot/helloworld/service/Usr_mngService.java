package com.demo.springboot.helloworld.service;


import com.demo.springboot.helloworld.common.domain.flight_ticket;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

@Service
public interface Usr_mngService {

    PageInfo<flight_ticket> finduser(int pageNo, int pageSize,long uid);
}
