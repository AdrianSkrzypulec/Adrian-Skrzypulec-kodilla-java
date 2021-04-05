package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class OrderRequest {
    private Map<String, Integer> products;
    private Shop shop;

    public OrderRequest(Shop shop, Map<String, Integer> products) {
        this.products = products;
        this.shop = shop;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public Shop getDistributor() {
        return shop;
    }
}