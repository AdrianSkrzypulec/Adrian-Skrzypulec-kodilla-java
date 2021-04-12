package com.kodilla.calculator;

import com.kodilla.spring.calculator.Calculator;
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
        calculator.add(5, 2);
        //Then
        //do nothing
    }

    @Test
    void testSub() {
        //Given
        //When
        calculator.sub(3, 2);
        //Then
        //do nothing
    }

    @Test
    void testMul() {
        //Given
        //When
        calculator.mul(2, 2);
        //Then
        //do nothing
    }

    @Test
    void testDiv() {
        //Given
        //When
        calculator.div(4, 2);
        //Then
        //do nothing
    }
}
