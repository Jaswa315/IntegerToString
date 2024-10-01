package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ZeroNumberTest {

    @Test
    public void testZero() {
        assertEquals("Zero", App.convertIntToString(0));  // Check zero conversion
    }
}
