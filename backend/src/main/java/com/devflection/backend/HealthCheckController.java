package com.devflection.backend;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HealthCheckController {

    @GetMapping("/health")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "http://localhost:3000")
    String healthcheck() {
        return "ok";
    }

}