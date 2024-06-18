package com.example.services.impl;

import com.example.dto.res.HelloResponse;
import com.example.services.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public HelloResponse getHelloMessage() {
        return new HelloResponse("Hello");
    }
}
