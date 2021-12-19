package com.microservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.entity.HogeBTest;

@RestController
public class DemoBController {
    @RequestMapping("/TestB")
    public HogeBTest getSentence() {
        return new HogeBTest("テストBB");
    }
}
