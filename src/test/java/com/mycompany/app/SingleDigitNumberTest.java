package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SingleDigitNumberTest {

    @Test
    public void testSingleDigits() {
        assertEquals("One", App.convertIntToString(1));  // Check conversion of 1
        assertEquals("Two", App.convertIntToString(2));  // Check conversion of 2
        assertEquals("Nine", App.convertIntToString(9));  // Check conversion of 9
    }
}
