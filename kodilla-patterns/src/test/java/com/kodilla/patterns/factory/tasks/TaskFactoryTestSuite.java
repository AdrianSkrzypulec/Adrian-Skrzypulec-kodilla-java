package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //Whem
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        assertEquals("Food", shopping.getTaskName());
        assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPainting() {
        TaskFactory taskFactory = new TaskFactory();
        //Whem
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
//        painting.executeTask();
        //Then
        assertEquals("Remont", painting.getTaskName());
        assertEquals(false, painting.isTaskExecuted());
    }

    @Test
    void testFactoryDriving() {
        TaskFactory taskFactory = new TaskFactory();
        //Whem
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        assertEquals("Trip", driving.getTaskName());
        assertEquals(true, driving.isTaskExecuted());
    }
}
