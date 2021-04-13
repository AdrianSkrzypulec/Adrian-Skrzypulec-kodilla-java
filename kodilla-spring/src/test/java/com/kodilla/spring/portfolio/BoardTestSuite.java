package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("toDoList");
        board.getInProgressList().addTask("inProgressList");
        board.getDoneList().addTask("doneList");

        //Then
        Assertions.assertEquals("toDoList", board.getToDoList().getTasks().get(0));
        Assertions.assertEquals("inProgressList", board.getInProgressList().getTasks().get(0));
        Assertions.assertEquals("doneList", board.getDoneList().getTasks().get(0));

    }
}
