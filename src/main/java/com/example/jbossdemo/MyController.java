package com.example.jbossdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "hello this application running on JBOSS EAP use scope";
    }
}
