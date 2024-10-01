package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HundredsNumberTest {

    @Test
    public void testHundreds() {
        assertEquals("One Hundred", App.convertIntToString(100));  // Check conversion of 100
        assertEquals("Three Hundred", App.convertIntToString(300));  // Check conversion of 300
    }
}
