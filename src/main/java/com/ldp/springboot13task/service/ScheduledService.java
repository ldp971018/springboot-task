package com.ldp.springboot13task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Return
 * @create 2019-05-29 10:00
 */
@Service
public class ScheduledService {


    @Autowired
    AsynService asynService;

    @Scheduled(cron = "0/5 * * * * MON-SAT")
    public void hello(){
        asynService.sayHello("你好");
        System.out.println("hello world");
    }
}
