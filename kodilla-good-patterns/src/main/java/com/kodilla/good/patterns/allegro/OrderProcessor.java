package com.kodilla.good.patterns.allegro;

public class OrderProcessor {

    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductOrderRepository productOrderRepository;

    public OrderProcessor(final InformationService informationService,
                          final ProductOrderService productOrderService,
                          final ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }

    public ProductOrderDto process(final ProductOrderRequest productOrderRequest) {
        boolean isOrdered = productOrderService.order(productOrderRequest.getUser(), productOrderRequest.getProduct(),
                                                    productOrderRequest.getQuantity());

        if (isOrdered) {
            informationService.inform(productOrderRequest.getUser());
            productOrderRepository.createOrder(productOrderRequest.getUser(), productOrderRequest.getProduct(),
                    productOrderRequest.getQuantity());
            return new ProductOrderDto(productOrderRequest.getUser(), true);
        } else {
            return new ProductOrderDto(productOrderRequest.getUser(), false);
        }
    }
}
