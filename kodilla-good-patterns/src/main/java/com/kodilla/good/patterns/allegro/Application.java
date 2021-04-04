package com.kodilla.good.patterns.allegro;

public class Application {

    public static void main(String[] args) {

        ProductOrderRequestRetriever retriever = new ProductOrderRequestRetriever();
        ProductOrderRequest orderRequest = retriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(), new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
