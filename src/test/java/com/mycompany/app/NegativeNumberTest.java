package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NegativeNumberTest {

    @Test
    public void testNegativeNumbers() {
        assertEquals("Negative One", App.convertIntToString(-1));  // Check conversion of -1
        assertEquals("Negative Forty Two", App.convertIntToString(-42));  // Check conversion of -42
        assertEquals("Negative One Hundred", App.convertIntToString(-100));  // Check conversion of -100
    }
}
