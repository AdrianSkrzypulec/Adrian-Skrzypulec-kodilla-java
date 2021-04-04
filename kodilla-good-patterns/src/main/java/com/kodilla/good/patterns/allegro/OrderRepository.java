package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public interface OrderRepository {

    public boolean createOrder(final User user, final Product product, int quantity);
}