package superset6419103.Week_2.SLF4J;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class LoggingExample {
    private static final Logger logger= (Logger) LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.error("It is an error message");
        logger.warn("It is an warning message");
        System.out.println("Logger class:"+logger.getClass().getName());
    }
}
