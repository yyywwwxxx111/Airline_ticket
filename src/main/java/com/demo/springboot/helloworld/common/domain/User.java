package com.demo.springboot.helloworld.common.domain;

import com.demo.springboot.helloworld.common.domain.extend.UserExtend;

public class User extends UserExtend {
    private Long uidPk;

    private String name;

    private String password;

    private String gender;

    private String email;

    public Long getUidPk() {
        return uidPk;
    }

    public void setUidPk(Long uidPk) {
        this.uidPk = uidPk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "uidPk=" + uidPk +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}