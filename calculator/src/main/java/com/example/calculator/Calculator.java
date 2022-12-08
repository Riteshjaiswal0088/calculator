package com.example.calculator;

import com.example.util.CalUtil;

import java.util.Arrays;
import java.util.Collections;

public class Calculator {

    public static int evaluation(String input) {
        String[] splitString = input.split("");
        int length = splitString.length;
        if (length < 3 || length > 5) {
            System.out.println("Invalid input String");
        }
        int result = 0;
        try {
            if (length == 5) {
                if ("*/%".contains(splitString[3]))
                    Collections.reverse(Arrays.asList(splitString));
                int a = Integer.parseInt(splitString[0]);
                String operator1 = splitString[1];
                int b = Integer.parseInt(splitString[2]);
                String operator2 = splitString[3];
                int c = Integer.parseInt(splitString[4]);
                result = CalUtil.operation(CalUtil.operation(a, b, operator1), c, operator2);
            } else {
                int a = Integer.parseInt(splitString[0]);
                String operator = splitString[1];
                int b = Integer.parseInt(splitString[2]);
                result = CalUtil.operation(a, b, operator);
            }
        } catch (NumberFormatException exception) {
            System.out.println("Please provide valid expression only digit[0-9] and operators are allowed");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return result;
    }
}
