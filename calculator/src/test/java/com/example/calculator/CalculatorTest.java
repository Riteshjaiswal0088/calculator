package com.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"5-2+8","5+8-2","5-8*2"})
    void evaluationThreeParam(String input) {
        Assertions.assertEquals(11,Calculator.evaluation(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"6-2","8/2","2*2"})
    void evaluationTwoParam(String input) {
        Assertions.assertEquals(4,Calculator.evaluation(input));
    }
}