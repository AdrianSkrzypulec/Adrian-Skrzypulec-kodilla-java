package com.kodilla.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class LibraryTestSuite {

    @Autowired
    private Library library;


    @Test
    void testLoadFromDb() {
        //Given
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Library library = context.getBean(Library.class);
        //When
        library.loadFromDb();
        //Then
        //Do nothing
    }

    @Test
    void testSavetoDb() {
        //Goven
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Library library = context.getBean(Library.class);
        //When
        library.saveToDb();
        //Then
        //Do nothing
    }
}