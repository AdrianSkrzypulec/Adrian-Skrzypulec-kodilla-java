package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Standard")
                .burgers(2)
                .sauce("barbecue")
                .sauce("standard")
                .ingredient("onion")
                .ingredient("jalapeno")
                .ingredient("bacon")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManySauce = bigmac.getSauce().size();

        //Then
        assertEquals(3, howManyIngredients);
        assertEquals(2, howManySauce);
    }
}






