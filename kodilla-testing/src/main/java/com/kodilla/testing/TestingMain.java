package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int resultSum = calculator.add(1, 2);
        int resultSubstrate = calculator.subtract(2, 1);

        if (resultSum == 3) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if (resultSubstrate == 1) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
