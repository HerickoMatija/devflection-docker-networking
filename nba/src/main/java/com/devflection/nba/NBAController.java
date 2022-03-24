package com.devflection.nba;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class NBAController {
    
    @GetMapping("/nba")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "*")
    public String tradeInquiry() {
        return "NBA: Where amazing happens!";
    }

}
