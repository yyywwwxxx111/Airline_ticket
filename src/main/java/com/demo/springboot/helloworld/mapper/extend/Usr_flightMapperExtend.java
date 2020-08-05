package com.demo.springboot.helloworld.mapper.extend;

import com.demo.springboot.helloworld.common.domain.flight_ticket;

import java.util.List;

public interface Usr_flightMapperExtend {
    List<flight_ticket> selectByMatch(long uid_pk);
}
