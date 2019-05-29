package com.ldp.springboot13task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling  //开启定时任务
@EnableAsync //开启异步处理
@SpringBootApplication
public class Springboot13TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot13TaskApplication.class, args);
    }

}
