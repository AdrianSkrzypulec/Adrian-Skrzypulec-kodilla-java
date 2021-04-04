package com.kodilla.good.patterns.allegro;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve() {

        User user = new User("Adam", "Nowak", "AdamN");
        Product product = new Product("PlayStation 5", 2299.00);
        int quantity = 2;

        return new ProductOrderRequest(user, product, quantity);
    }
}