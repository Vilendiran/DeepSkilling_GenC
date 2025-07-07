package com.library;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class CountryApp {
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryApp.class);
    public static void main(String[] args) {
        LOGGER.debug("Inside main()");
        displayCountry();
    }
    public static void displayCountry() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        LOGGER.debug("Country: {}", country.toString());
    }
}