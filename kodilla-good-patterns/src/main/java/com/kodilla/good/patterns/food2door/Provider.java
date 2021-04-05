package com.kodilla.good.patterns.food2door;

import java.util.Map;

public interface Provider {

    boolean process(OrderRequest orderRequest, Map<String, Integer> products);
}
