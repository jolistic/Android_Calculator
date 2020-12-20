package com.java.androidcalculator;

public class ForTestingClass {

    public static String sqrtEvent(String inputText) {
        String number = inputText.toString();
        double result = Math.sqrt(Double.parseDouble(number));
        return String.valueOf(result);
    }
}
