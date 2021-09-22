package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstrackPizzaDecorator implements PizzaOrder{
    private final PizzaOrder pizzaOrder;

    public AbstrackPizzaDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getCost() {
       return pizzaOrder.getCost();
    }

    @Override
    public String getAddons() {
        return pizzaOrder.getAddons();
    }
}
