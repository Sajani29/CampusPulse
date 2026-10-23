package com.campuspulse.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HealthController {
    @GetMapping("/api/v1/helo")
    public String hello(){
        return "campuspluse backend is working";
    }


}
