package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testAdd() {
        //Given
        //When
        double result = calculator.add(5, 2);
        //Then
        Assertions.assertEquals(7, result);
    }

    @Test
    void testSub() {
        //Given
        //When
        double result = calculator.sub(3, 2);
        //Then
        Assertions.assertEquals(1, result);
    }

    @Test
    void testMul() {
        //Given
        //When
        double result = calculator.mul(2, 2);
        //Then
        Assertions.assertEquals(4, result);
    }

    @Test
    void testDiv() {
        //Given
        //When
        double result = calculator.div(4, 2);
        //Then
        Assertions.assertEquals(2, result);
    }
}
