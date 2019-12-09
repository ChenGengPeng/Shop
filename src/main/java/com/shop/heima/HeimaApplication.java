package com.shop.heima;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shop.heima.dao")
public class HeimaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeimaApplication.class, args);
    }

}
