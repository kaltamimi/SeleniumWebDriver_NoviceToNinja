package log4jsection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemo {

    private final static Logger log = LogManager.getLogger(LoggingDemo.class.getName());

    public static void main(String[] args) {
        log.debug("Debug Message Logged");
        log.error("Error Message Logged");
        log.fatal("Fatal Message Logged");
    }
}
