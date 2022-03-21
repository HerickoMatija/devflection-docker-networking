package com.devflection.celtics.services.hr;

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
            "Al Horford", Money.of(27000000, USD),
            "Marcus Smart", Money.of(14000000, USD),
            "Jabari Parker", Money.of(1100000, USD)
        );
    }

}
