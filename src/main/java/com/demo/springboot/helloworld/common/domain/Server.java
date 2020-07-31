package com.demo.springboot.helloworld.common.domain;

import java.util.Date;

public class Server {
    private Long sidPk;

    private String serverName;

    private Date estTime;

    public Long getSidPk() {
        return sidPk;
    }

    public void setSidPk(Long sidPk) {
        this.sidPk = sidPk;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
    }

    public Date getEstTime() {
        return estTime;
    }

    public void setEstTime(Date estTime) {
        this.estTime = estTime;
    }
}