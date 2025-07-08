package com.cognizant.spring_learn;

import com.cognizant.spring_learn.CountryController;
import com.cognizant.spring_learn.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        LOGGER.debug("Start - getCountry() with code: {}", code);
        Country country = countryService.getCountry(code);
        LOGGER.debug("End - getCountry()");
        return country;
    }
}
