package com.baseball.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class DemoController {
    @RequestMapping("/test")
    public OutputData get(){
        OutputData data = new OutputData();
        data.id = 123;
        data.value = "hello";
        data.date = new Date();
        return data;
    }
    
}
