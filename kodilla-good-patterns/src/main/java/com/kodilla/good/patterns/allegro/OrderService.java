package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public interface OrderService {

    public boolean order(final User user, final Product product, int quantity);

}
