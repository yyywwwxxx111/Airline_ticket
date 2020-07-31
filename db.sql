drop database if exists Project; -- 数据库名不能用中划线-
create database Project;
use Project;
CREATE TABLE User
(
    uid_pk serial PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    password VARCHAR(15) NOT NULL,
    gender CHAR(2) NOT null,
    email VARCHAR(20) NOT NULL UNIQUE,
    est_time timestamp NOT NULL
);

CREATE TABLE Server
(
    sid_pk serial PRIMARY KEY,
    server_name VARCHAR(20) NOT NULL,
    est_time timestamp NOT NULL
);



