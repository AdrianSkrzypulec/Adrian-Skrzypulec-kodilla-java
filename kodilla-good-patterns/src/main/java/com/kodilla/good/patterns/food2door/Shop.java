package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class Shop {

    private String name;
    private String adres;
    private Map<String,Integer> products;

    public Shop(final String name, final String adres, final Map<String, Integer> products) {
        this.name = name;
        this.adres = adres;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public String getAdres() {
        return adres;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }
}