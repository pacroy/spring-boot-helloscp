package com.pacroy.helloscp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pacroy on 9/23/17.
 */
@RestController
public class HelloScpController {
    @GetMapping("/")
    public String hello() {
        return "Hello SCP from Spring Boot";
    }
}
