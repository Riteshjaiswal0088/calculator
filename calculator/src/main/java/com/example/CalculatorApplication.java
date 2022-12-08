package com.example;


import com.example.calculator.Calculator;

import java.util.Scanner;

import static com.example.calculator.Calculator.evaluation;

public class CalculatorApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter expression:");
        String input = sc.nextLine();
        System.out.println(evaluation(input));
    }

}
