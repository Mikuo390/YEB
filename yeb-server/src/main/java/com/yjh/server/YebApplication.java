package com.yjh.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 */
@SpringBootApplication
@MapperScan("com.yjh.server.mapper") //mapper扫描注解
public class YebApplication {
    public static void main(String[] args) {
        SpringApplication.run(YebApplication.class);
    }
}
