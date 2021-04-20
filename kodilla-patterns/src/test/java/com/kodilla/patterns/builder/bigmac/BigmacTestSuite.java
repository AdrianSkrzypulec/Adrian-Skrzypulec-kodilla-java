package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Standard")
                .burgers(2)
//                .sauce("standard")
//                .ingredient("onion")
                .build();

        //When
        System.out.println(bigmac);
        //Then
    }
}






