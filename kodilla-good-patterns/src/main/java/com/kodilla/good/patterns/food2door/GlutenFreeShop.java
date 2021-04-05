package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class GlutenFreeShop implements Provider {

    public boolean process(OrderRequest orderRequest, Map<String, Integer> productsAvailable){
        System.out.println("The order has been completed");
        return true;
    }
}
