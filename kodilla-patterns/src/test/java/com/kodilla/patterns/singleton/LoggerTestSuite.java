package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    void testLastLog() {
        //Given
        logger = logger.INSTANCE;
        logger.log("test.log");
        //When
        String logName = logger.getLastLog();
        System.out.println("Log name: " + logName);
        //Then
        assertEquals("test.log", logName);
    }

}
