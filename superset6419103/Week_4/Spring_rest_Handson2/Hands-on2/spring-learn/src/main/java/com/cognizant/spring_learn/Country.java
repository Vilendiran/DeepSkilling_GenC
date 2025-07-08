package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Country {
    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);
    private String code;
    private String name;

    // Default constructor is
    public Country() {
        LOGGER.debug("Inside Country Constructor.");
    }

    // Getter for code is
    public String getCode() {
        LOGGER.debug("Inside getCode()");
        return code;
    }

    // Setter for code is
    public void setCode(String code) {
        LOGGER.debug("Inside setCode()");
        this.code = code;
    }

    // Getter for name
    public String getName() {
        LOGGER.debug("Inside getName()");
        return name;
    }

    // Setter for name is
    public void setName(String name) {
        LOGGER.debug("Inside setName()");
        this.name = name;
    }
    // toString() for logging/debugging is
    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}
