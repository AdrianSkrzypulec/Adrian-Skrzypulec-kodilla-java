package com.kodilla.stream.array;

import java.util.Optional;
import java.util.stream.IntStream;

public interface ArrayOperations {

    public static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .map(number -> numbers[number])
                .forEach(System.out::println);

        double numberArray = IntStream.range(0, numbers.length)
                .map(number -> numbers[number])
                .average()
                .getAsDouble();
        return numberArray;
    }
}