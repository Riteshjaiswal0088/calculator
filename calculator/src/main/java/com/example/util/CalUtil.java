package com.example.util;

public class CalUtil {

    public static int operation(int a, int b, String operator) {

        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            case "%":
                return a % b;
            default:
                throw new RuntimeException("Invalid String");
        }
    }

}
