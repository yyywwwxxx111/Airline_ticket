package com.demo.springboot.helloworld.service;


import com.demo.springboot.helloworld.common.domain.flight_ticket;
import com.demo.springboot.helloworld.mapper.Usr_flightMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Usr_mngServiceimpl implements Usr_mngService {

    @Autowired
    Usr_flightMapper usr_flightMapper;

    @Override
    public PageInfo<flight_ticket> finduser(int pageNo, int pageSize,long uid) {
        PageHelper.startPage(pageNo,pageSize);
        List<flight_ticket> flight= usr_flightMapper.selectByMatch(uid);
        return new PageInfo<>(flight);

    }
}
