package com.kodilla.good.patterns.food2door;

import java.util.Map;

class OrderProcessor {

    private Provider provider;

    public OrderProcessor(Provider provider) {
        this.provider = provider;
    }

    public OrderDto process(final OrderRequest orderRequest) {

        Shop shop = orderRequest.getDistributor();
        Map<String, Integer> productsAvailable = shop.getProducts();

        boolean isOrdered = provider.process(orderRequest, productsAvailable);

        if (isOrdered) {
            return new OrderDto(shop, true);
        } else {
            return new OrderDto(shop, false);
        }
    }
}
