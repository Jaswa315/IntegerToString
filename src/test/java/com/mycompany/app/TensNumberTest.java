package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TensNumberTest {

    @Test
    public void testTens() {
        assertEquals("Twenty", App.convertIntToString(20));  // Check conversion of 20
        assertEquals("Thirty", App.convertIntToString(30));  // Check conversion of 30
        assertEquals("Ninety", App.convertIntToString(90));  // Check conversion of 90
    }
}
