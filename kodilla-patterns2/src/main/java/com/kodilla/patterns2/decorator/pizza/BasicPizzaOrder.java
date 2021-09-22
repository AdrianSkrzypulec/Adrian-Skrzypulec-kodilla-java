package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {

    public BasicPizzaOrder() {
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(10.0);
    }

    @Override
    public String getAddons() {
        return "Basic pizza + ";
    }
}
