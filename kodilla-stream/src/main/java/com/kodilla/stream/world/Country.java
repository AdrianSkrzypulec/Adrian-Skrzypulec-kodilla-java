package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String countryName;
    private final BigDecimal counytyPopulation;

    public Country(String countryName, BigDecimal countryPopulation) {
        this.countryName = countryName;
        this.counytyPopulation = countryPopulation;
    }

    public BigDecimal getCounytyPopulation() {
        return counytyPopulation;
    }
}
//Klasa Country ma udostępniać metodę getPeopleQuantity() zwracającą liczbę typu BigDecimal.