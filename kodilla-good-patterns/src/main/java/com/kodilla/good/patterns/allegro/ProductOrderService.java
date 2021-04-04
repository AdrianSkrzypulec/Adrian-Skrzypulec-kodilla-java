package com.kodilla.good.patterns.allegro;

public class ProductOrderService implements OrderService{

    public boolean order(final User user, final Product product, int quantity) {

        System.out.println("Order for: " + user.getUserName() + "\nProduct :" + product.getProductName() + "\nquantity: "
        + quantity + "\ntotal price: " + product.getProductPrice() * quantity + "\n");

        return true;
    }
}
