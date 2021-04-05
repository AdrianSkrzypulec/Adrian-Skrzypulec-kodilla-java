package com.kodilla.good.patterns.food2door;

public class OrderDto {
    public Shop shop;
    public boolean isOrdered;

    public OrderDto(final Shop shop, final boolean isOrdered) {
        this.shop = shop;
        this.isOrdered = isOrdered;
    }

    public Shop getDistributor() {
        return shop;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
