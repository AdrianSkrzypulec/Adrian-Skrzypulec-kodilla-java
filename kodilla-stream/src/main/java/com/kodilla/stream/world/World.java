package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private final List<Continent> continentList = new ArrayList<>();

    public void addContinent(Continent continent) {

        continentList.add(continent);
    }

    BigDecimal getPeopleQuantity() {

        return continentList.stream()
                .flatMap(country -> country.getColuntryList().stream())
                .map(Country::getCounytyPopulation)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

}
// W klasie World napisz metodę getPeopleQuantity() zwracającą liczbę typu BigDecimal,
// która żywając flatMap() oraz reduce() obliczy sumę ludności wszystkich krajów na wszystkich kontynentach.