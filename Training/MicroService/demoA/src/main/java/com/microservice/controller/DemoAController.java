package com.microservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.entity.HogeATest;

@RestController
public class DemoAController {
    @RequestMapping("/TestA")
    public HogeATest getSentence() {
        return new HogeATest("テストA");
    }
}
