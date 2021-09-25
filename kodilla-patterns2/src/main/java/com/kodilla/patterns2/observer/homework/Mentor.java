package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String name;
    private int taskCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(StudentTaskQueue studentTaskQueue) {
        System.out.println(name + ": New task " + studentTaskQueue.getName() + "\n" +
                " (total: " + studentTaskQueue.getStudentTasks().size() + " tasks)");
        taskCount++;
    }

    public String getName() {
        return name;
    }

    public int getTaskCount() {
        return taskCount;
    }
}
