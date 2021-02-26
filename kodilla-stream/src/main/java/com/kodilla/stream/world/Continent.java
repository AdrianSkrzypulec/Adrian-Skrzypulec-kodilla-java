package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

   private final String continentName;
   private final List<Country> countryList = new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public List<Country> getColuntryList() {
        return countryList;
    }

    public void addCountry(Country country){
        countryList.add(country);
    }
}
//    Każdy kontynent będzie posiadał listę krajów
//  Klasa Continent powinna zawierać kolekcję krajów leżących na tym kontynencie.