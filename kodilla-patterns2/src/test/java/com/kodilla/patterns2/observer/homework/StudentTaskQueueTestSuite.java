package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTaskQueueTestSuite {

    @Test
    void name() {

        //Given
        Student student = new Student();
        Mentor mentor = new Mentor("Mentor");

        student.registerObserver(mentor);
        student.addStudentTask("Homework");

        //When
        int mentorNotification = mentor.getTaskCount();

        //Then
        assertEquals(1, mentorNotification);
    }
}