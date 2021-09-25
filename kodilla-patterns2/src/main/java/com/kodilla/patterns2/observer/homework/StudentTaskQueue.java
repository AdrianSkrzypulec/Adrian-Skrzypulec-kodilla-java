package com.kodilla.patterns2.observer.homework;

import java.util.*;

public class StudentTaskQueue implements Observable {

    private final List<Observer> observers;
    private final Deque<String> studentTasks;
    private final String name;

    public StudentTaskQueue(String name) {
        this.observers = new ArrayList<>();
        this.studentTasks = new ArrayDeque<>();
        this.name = name;
    }

    public void addStudentTask(String task) {
        studentTasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public Deque<String> getStudentTasks() {
        return studentTasks;
    }

    public String getName() {
        return name;
    }
}
