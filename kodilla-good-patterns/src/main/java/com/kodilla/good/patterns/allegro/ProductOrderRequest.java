package com.kodilla.good.patterns.allegro;

public class ProductOrderRequest {

    User user;
    Product product;
    int quantity;


    public ProductOrderRequest(User user, Product product, int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
