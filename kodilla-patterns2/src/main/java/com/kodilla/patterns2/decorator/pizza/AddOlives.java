package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AddOlives extends AbstrackPizzaDecorator {

    public AddOlives(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5.0));
    }

    @Override
    public String getAddons() {
        return super.getAddons() + "olives, ";
    }
}
