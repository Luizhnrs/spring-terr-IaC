package com.lab.api_to_deploy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController(value = "/test")
public class ApiController {
    @GetMapping
    public ResponseEntity<TimeStampResponse> test(){
        return ResponseEntity.ok(new TimeStampResponse(Instant.now()));
    }
}
