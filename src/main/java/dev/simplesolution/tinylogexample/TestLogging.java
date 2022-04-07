package dev.simplesolution.tinylogexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestLogging implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(TestLogging.class);

    @Override
    public void run(String... args) throws Exception {
        logger.trace("Hello tinylog");
        logger.info("Hello tinylog");
        logger.debug("Hello tinylog");
        logger.warn("Hello tinylog");
        logger.error("Hello tinylog");
    }
}