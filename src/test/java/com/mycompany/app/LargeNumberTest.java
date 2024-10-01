package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LargeNumberTest {

    @Test
    public void testLargeNumbers() {
        assertEquals("One Million", App.convertIntToString(1000000));  // Check conversion of 1,000,000
        assertEquals("One Billion", App.convertIntToString(1000000000));  // Check conversion of 1,000,000,000
    }
}
