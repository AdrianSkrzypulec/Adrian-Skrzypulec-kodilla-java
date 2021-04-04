package com.kodilla.good.patterns.allegro;

public class ProductOrderService implements OrderService{

    public boolean order(final User user, final Product product, int quantity) {

        System.out.println("Order for: " + user.getUserName() + " Product :" + product.productName + ", quantity:"
        + quantity + " total price:" + product.productPrice * quantity);

        return true;
    }
}
