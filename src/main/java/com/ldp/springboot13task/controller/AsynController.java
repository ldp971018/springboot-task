package com.ldp.springboot13task.controller;

import com.ldp.springboot13task.service.AsynService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Return
 * @create 2019-05-29 9:52
 */
@Controller
public class AsynController {
    @Autowired
    AsynService asynService;

    @GetMapping("/asyn/{msg}")
    @ResponseBody
    public String asyn(@PathVariable("msg") String msg){
       return asynService.sayHello(msg);
    }
}
