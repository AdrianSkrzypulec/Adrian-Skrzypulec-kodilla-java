package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapesCollection = new ArrayList<>();


    void addFigure(Shape shape) {
        shapesCollection.add(shape);
    }

    boolean removeFigure(Shape shape) {
        return shapesCollection.remove(shape);
    }

    Shape getFigure(int n) {
        if (n >= 0 && n < shapesCollection.size()) {
            return shapesCollection.get(n);
        }
        return null;
    }


    public int getShapeQuantity() {
        // dodane
        return shapesCollection.size();
    }

}
