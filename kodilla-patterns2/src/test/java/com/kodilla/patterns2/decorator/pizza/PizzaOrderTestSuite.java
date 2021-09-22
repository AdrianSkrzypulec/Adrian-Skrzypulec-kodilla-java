package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrderTestSuite {

    @Test
    void TestPizzaOrder() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AddSalami(pizzaOrder);
        pizzaOrder = new AddOlives(pizzaOrder);
        pizzaOrder = new AddJalapeno(pizzaOrder);

        //When
        BigDecimal cost = pizzaOrder.getCost();
        String finalPizza = pizzaOrder.getAddons();
        System.out.println("Ordered " + finalPizza + " - Total cost: " + cost);

        //Then
        assertEquals(new BigDecimal(25), cost);
        assertEquals("Basic pizza + salami, olives, jalapeno, ", finalPizza);
    }
}