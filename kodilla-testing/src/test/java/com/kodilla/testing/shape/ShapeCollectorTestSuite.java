package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Collector Suite")
public class ShapeCollectorTestSuite {

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
    }

    @Nested
    @DisplayName("Tests for shapes")
    class TestShape {

        @Test
        void testAddFigure() {
            //Given
            ShapeCollector firstShape = new ShapeCollector();
            Shape circle = new Circle("Cirkle", 3.14);
            //When
            firstShape.addFigure(circle);
            //Then
            Assertions.assertEquals(1, firstShape.getShapeQuantity());
        }

        @Test
        void testRmoveFigure() {
            //Given
            ShapeCollector firstShape = new ShapeCollector();
            Shape circle = new Circle("Cirkle", 3.14);
            firstShape.addFigure(circle);

            //When
            boolean result = firstShape.removeFigure(circle);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, firstShape.getShapeQuantity());

        }

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector firstShape = new ShapeCollector();
            Circle circle = new Circle("Cirkle", 3.14);
            firstShape.addFigure(circle);

            //When
            Shape retrievedShape = firstShape.getFigure(0);
            Shape notExistedShape = firstShape.getFigure(-1);
            Shape notExistedShape2 = firstShape.getFigure(5);


            //Then
            Assertions.assertEquals(circle, retrievedShape);
            Assertions.assertEquals(null, notExistedShape);
            Assertions.assertEquals(null, notExistedShape2);

        }

    }
}

