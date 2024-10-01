package com.mycompany.app;

import java.util.HashMap;
import java.util.Map;

public class App {

    // Map for single-digit numbers
    static Map<Integer, String> ones = new HashMap<>(Map.ofEntries(
            Map.entry(0, "Zero"),
            Map.entry(1, "One"),
            Map.entry(2, "Two"),
            Map.entry(3, "Three"),
            Map.entry(4, "Four"),
            Map.entry(5, "Five"),
            Map.entry(6, "Six"),
            Map.entry(7, "Seven"),
            Map.entry(8, "Eight"),
            Map.entry(9, "Nine")
    ));

    public static String convertIntToString(int value) {
        return ones.getOrDefault(value, "");  // Return the string value for single-digit numbers
    }
}
