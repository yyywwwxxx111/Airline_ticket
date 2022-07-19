package com.service;


import com.common.domain.flight_ticket;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

@Service
public interface Usr_mngService {

    PageInfo<flight_ticket> finduser(int pageNo, int pageSize,long uid);

    Object findticket(int pageNo, int pageSize, flight_ticket flight);
}
