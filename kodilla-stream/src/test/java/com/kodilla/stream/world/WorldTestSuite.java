package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        //Europe
        Continent continent1 = new Continent("Europe");
        Country country1 = new Country("Poland", new BigDecimal("38386000"));
        Country country2 = new Country("Germany", new BigDecimal("83019200"));
        Country country3 = new Country("Slovakia", new BigDecimal("5445802"));

        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);

        //North America
        Continent continent2 = new Continent("Asia");
        Country country4 = new Country("U.S.A.", new BigDecimal("326079000"));
        Country country5 = new Country("Canada", new BigDecimal("36708083"));
        Country country6 = new Country("Mexico", new BigDecimal("124574795"));

        continent2.addCountry(country4);
        continent2.addCountry(country5);
        continent2.addCountry(country6);

        //North Asia
        Continent continent3 = new Continent("North America");
        Country country7 = new Country("China", new BigDecimal("1420000000"));
        Country country8 = new Country("Japan", new BigDecimal("125396901"));
        Country country9 = new Country("Taiwan", new BigDecimal("23545963"));

        continent3.addCountry(country7);
        continent3.addCountry(country8);
        continent3.addCountry(country9);

        //World
        World theWorld = new World();

        theWorld.addContinent(continent1);
        theWorld.addContinent(continent2);
        theWorld.addContinent(continent3);

        //When
        BigDecimal totalPeople = theWorld.getPeopleQuantity();
        BigDecimal expectedPeopleQuantity = new BigDecimal("2183155744");

        //Then
        Assertions.assertEquals(expectedPeopleQuantity, totalPeople);
    }
}