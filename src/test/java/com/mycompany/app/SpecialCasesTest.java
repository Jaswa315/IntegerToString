package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SpecialCasesTest {

    @Test
    public void testMixedNumbers() {
        assertEquals("One Thousand One", App.convertIntToString(1001));  // Check conversion of 1001
        assertEquals("One Hundred Twenty Three Million Four Hundred Fifty Six Thousand Seven Hundred Eighty Nine",
                App.convertIntToString(123456789));  // Check conversion of 123,456,789
    }
}
