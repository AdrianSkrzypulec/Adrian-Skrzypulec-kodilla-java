package com.kodilla.good.patterns.allegro;

public class ProductOrderDto {

    public User user;
    public boolean isOrdered;

    public ProductOrderDto(final User user, final boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser() { return user; }

    public boolean isOrdered() { return isOrdered; }

}
