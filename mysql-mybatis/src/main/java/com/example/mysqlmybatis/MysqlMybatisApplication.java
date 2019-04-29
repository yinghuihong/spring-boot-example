package com.example.mysqlmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mysqlmybatis.dao")
public class MysqlMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysqlMybatisApplication.class, args);
    }

}
