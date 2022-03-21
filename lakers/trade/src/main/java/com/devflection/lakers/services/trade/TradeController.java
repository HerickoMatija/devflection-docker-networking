package com.devflection.lakers.services.trade;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradeController {
    
    @GetMapping("/inquireAboutTrade")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "*")
    public String tradeInquiry() {
        return "Yes, lets make a trade!";
    }

}
