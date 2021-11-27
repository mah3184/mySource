package com.microservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.entity.HogeTest;

@RestController
public class DemoAController {
    @RequestMapping("/")
    public HogeTest getSentence() {
        return new HogeTest("テスト");
    }
}
