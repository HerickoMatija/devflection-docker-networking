package com.devflection.celtics.services.hr;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HumanResourcesController {
    
    @GetMapping("/hr")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "*")
    public String health() {
        return "Hello from the Celtics HR Department!";
    }

}
