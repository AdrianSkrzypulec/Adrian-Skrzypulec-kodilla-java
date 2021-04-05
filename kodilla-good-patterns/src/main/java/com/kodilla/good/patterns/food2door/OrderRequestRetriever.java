package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

class OrderRequestRetriever {

    public OrderRequest retrieve() {

        HashMap<String, Integer> productsAvailable = new HashMap<>();
        productsAvailable.put("Kale", 100);
        productsAvailable.put("Broccoli", 5);
        productsAvailable.put("Tofu", 100);

        Shop shop = new Shop("Extra Food Shop", "Zrowa Wieś", productsAvailable);

        HashMap<String, Integer> productsOrdered = new HashMap<>();
        productsOrdered.put("Kale",5);
        productsOrdered.put("Broccoli", 10);
        productsOrdered.put("Tofu", 9);

        return new OrderRequest(shop, productsOrdered);
    }
}