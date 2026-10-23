package com.campuspulse.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HealthController {
    @GetMapping("/api/v1/hello")

    public String hellooo(){
        return "campuspluse backend is working";
    }


}
