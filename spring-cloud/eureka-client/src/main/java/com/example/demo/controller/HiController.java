package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date: 2020/1/8
 * @author: zhangjingyu
 */
@RestController
public class HiController {

    @Value("${server.port}")
    String port;

    @GetMapping(value = "hi")
    public String sayHi(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }
}
