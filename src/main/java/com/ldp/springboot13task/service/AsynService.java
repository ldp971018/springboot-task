package com.ldp.springboot13task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author Return
 * @create 2019-05-29 9:49
 */
@Service
public class AsynService {

    @Async
    public String sayHello(String msg){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello"+msg);
        return msg;
    }
}
