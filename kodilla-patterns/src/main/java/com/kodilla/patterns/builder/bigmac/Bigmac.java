package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigmac {

    private final String bun;
    private final int burgers;
    private List<String> sauce ;
    private List<String> ingredients;

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private List<String> sauce = Arrays.asList("standard", "1000 islands", "barbecue");
        private List<String> ingredients = Arrays.asList("onion", "jalapeno", "bacon", "chorizo", "mushrooms", "cheese");

        public Bigmac.BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public Bigmac.BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public Bigmac.BigmacBuilder sauce(String sauce) {
            this.sauce.add(sauce);
            return this;
        }

        public Bigmac.BigmacBuilder ingredient(String ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, ingredients, sauce);
        }
    }

    public Bigmac(final String bun, final int burgers, List<String> ingredients, List<String> sauce) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce =  new ArrayList<>(sauce);
        this.ingredients = new ArrayList<>(ingredients);
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce=" + sauce +
                ", ingredients=" + ingredients +
                '}';
    }
}
