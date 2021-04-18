package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Food", "Egg", 12);
            case PAINTING:
                return new PaintingTask("Remont", "White", "Door");
            case DRIVING:
                return new DrivingTask("Trip", "Sopot", "Car");
            default:
                return null;
        }
    }
}
