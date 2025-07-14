package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{number}")
    public Map<String, Object> getLoanByNumber(@PathVariable String number) {
        return Map.of(
                "number", number,
                "type", "car",
                "loan", 600000,
                "EMI", 4288,
                "tenure", 24
        );
    }
}
