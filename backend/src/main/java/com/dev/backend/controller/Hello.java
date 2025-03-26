package com.dev.backend.controller;

import java.sql.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Hello {

    @GetMapping("/")
    public String hello() {
        return "Hello World " + java.util.Date.from(java.time.Instant.now());

    }
}
