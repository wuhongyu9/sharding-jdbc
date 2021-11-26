package com.why.sharding.sub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.why.sharding.sub.mapper")
public class SubApplication {
    public static void main(String[] args) {
        SpringApplication.run(SubApplication.class,args);
    }
}
