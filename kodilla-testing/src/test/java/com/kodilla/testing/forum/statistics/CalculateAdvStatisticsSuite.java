package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

@DisplayName("Statistics Test Suite")
class CalculateAdvStatisticsSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);

        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(1000));
        when(statisticsMock.postsCount()).thenReturn(2000);
        when(statisticsMock.commentsCount()).thenReturn(3000);
    }

    @Mock
    private Statistics statisticsMock;

    private List<String> generateListOfNUsers(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            String theUser = "User" + n;
            resultList.add(theUser);
        }
        return resultList;
    }

    @Test
    void testCalculateAdvStatisticsWhenPostsIs0(){
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.postsCount()).thenReturn(0);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(1000, calculateStatistics.getUserQuantity());
        assertEquals(0, calculateStatistics.getPostQuantity());
        assertEquals(3000, calculateStatistics.getCommentQuantity());
        assertEquals(0, calculateStatistics.getPostsPerUser());
        assertEquals(3.0, calculateStatistics.getCommentPerUser());
        assertEquals(0, calculateStatistics.getCommentPerPost());
    }

    @Test
    void testCalcAdvStatWhenPostsIs1000(){
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(1000, calculateStatistics.getUserQuantity());
        assertEquals(1000, calculateStatistics.getPostQuantity());
        assertEquals(3000, calculateStatistics.getCommentQuantity());
        assertEquals(1.0, calculateStatistics.getPostsPerUser());
        assertEquals(3.0, calculateStatistics.getCommentPerUser());
        assertEquals(3.0, calculateStatistics.getCommentPerPost());
    }

    @Test
    void testCalcAdvStatWhenCommentsIs0(){
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.commentsCount()).thenReturn(0);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);


        // Then
        assertEquals(1000, calculateStatistics.getUserQuantity());
        assertEquals(2000, calculateStatistics.getPostQuantity());
        assertEquals(0, calculateStatistics.getCommentQuantity());
        assertEquals(2.0, calculateStatistics.getPostsPerUser());
        assertEquals(0.0, calculateStatistics.getCommentPerUser());
        assertEquals(0.0, calculateStatistics.getCommentPerPost());
    }

    @Test
    void testCalcuAdvStatWhenCommentsLessThanPosts(){
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.postsCount()).thenReturn(2000);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(1000, calculateStatistics.getUserQuantity());
        assertEquals(2000, calculateStatistics.getPostQuantity());
        assertEquals(1000, calculateStatistics.getCommentQuantity());
        assertEquals(2.0, calculateStatistics.getPostsPerUser());
        assertEquals(1.0, calculateStatistics.getCommentPerUser());
        assertEquals(0.5, calculateStatistics.getCommentPerPost());
    }

    @Test
    void testCalculateAdvStatWhenCommentsMoreThanPosts(){
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(1000, calculateStatistics.getUserQuantity());
        assertEquals(1000, calculateStatistics.getPostQuantity());
        assertEquals(2000, calculateStatistics.getCommentQuantity());
        assertEquals(1.0, calculateStatistics.getPostsPerUser());
        assertEquals(2.0, calculateStatistics.getCommentPerUser());
        assertEquals(2.0, calculateStatistics.getCommentPerPost());
    }

    @Test
    void testCalculateAdvStatWhenUsersIs0(){
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(0));

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(0, calculateStatistics.getUserQuantity());
        assertEquals(2000, calculateStatistics.getPostQuantity());
        assertEquals(3000, calculateStatistics.getCommentQuantity());
        assertEquals(0, calculateStatistics.getPostsPerUser());
        assertEquals(0, calculateStatistics.getCommentPerUser());
        assertEquals(1.5, calculateStatistics.getCommentPerPost());
    }

    @Test
    void testCalculateAdvStatWhenUsersIs100(){
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(100));


        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(100, calculateStatistics.getUserQuantity());
        assertEquals(2000, calculateStatistics.getPostQuantity());
        assertEquals(3000, calculateStatistics.getCommentQuantity());
        assertEquals(20.0, calculateStatistics.getPostsPerUser());
        assertEquals(30.0, calculateStatistics.getCommentPerUser());
        assertEquals(1.5, calculateStatistics.getCommentPerPost());
    }
}




