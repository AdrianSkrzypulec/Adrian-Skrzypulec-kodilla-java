package com.kodilla.good.patterns.allegro;

public interface OrderRepository {

    public boolean createOrder(final User user, final Product product, int quantity);
}