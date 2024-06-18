package com.hellows.controllers;

import com.hellows.dto.res.HelloResponse;
import com.hellows.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public HelloResponse sayHello() {
        return helloService.getHelloMessage();
    }
}
