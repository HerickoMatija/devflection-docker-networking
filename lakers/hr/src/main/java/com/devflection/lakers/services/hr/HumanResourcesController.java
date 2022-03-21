package com.devflection.lakers.services.hr;

import java.util.Map;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import org.javamoney.moneta.Money;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanResourcesController {
    
    private static final CurrencyUnit USD = Monetary.getCurrency("USD");

    @GetMapping("/availableToTrade")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "*")
    public Map<String, Money> health() {
        return Map.of(
            "Russel Westbrook", Money.of(44000000, USD),
            "Talen Horton-Tucker", Money.of(9500000, USD),
            "Carmelo Anthony", Money.of(2600000, USD)
        );
    }

}
