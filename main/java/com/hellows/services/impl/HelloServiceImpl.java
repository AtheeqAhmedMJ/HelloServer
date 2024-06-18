package com.hellows.services.impl;

import com.hellows.dto.res.HelloResponse;
import com.hellows.services.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public HelloResponse getHelloMessage() {
        return new HelloResponse("Hello");
    }
}
