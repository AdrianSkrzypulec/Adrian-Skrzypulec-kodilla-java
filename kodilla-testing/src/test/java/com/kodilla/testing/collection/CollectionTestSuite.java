package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Collection Test Suit")
public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Test Suit: begin");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Test Suit: end");
    }

    @DisplayName("When list is empty then works fine")
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> firstEmptyList = new ArrayList<>();
        OddNumbersExterminator examinedList = new OddNumbersExterminator();

        //When
        List <Integer> result = examinedList.exterminate(firstEmptyList);
        List<Integer> secondEmptyList = new ArrayList<>();
        System.out.println("Testing empty lists: " + result + " and " + secondEmptyList);

        //Then
        Assertions.assertEquals(secondEmptyList, result);
    }

    @DisplayName("When list has only odd numbers then works fine")
    @Test
    void testOddNumbersExterminatorNormalList(){

        //Given
        List<Integer> numbersList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        OddNumbersExterminator examinedList = new OddNumbersExterminator();
//        List<Integer> numbersList = new ArrayList<>();
//        numbersList.add(1);
//        numbersList.add(2);
//        numbersList.add(3);
//        numbersList.add(4);
//        numbersList.add(5);
//        numbersList.add(6);
//        numbersList.add(7);
//        numbersList.add(8);
//        numbersList.add(9);
//        numbersList.add(10);

        //When
        List <Integer> result = examinedList.exterminate(numbersList);
        List<Integer> expectedOddNumbers = Arrays.asList(2,4,6,8,10);
        System.out.println("Testing: " + result + " and " + expectedOddNumbers);

        //Then
        Assertions.assertEquals(expectedOddNumbers, result);
    }
}