package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    // Basic test case for a small positive number
    @Test
    public void testSingleDigitNumber() {
        assertEquals("Two", App.convertIntToString(2));  // Convert 2 to "Two"
    }
}
