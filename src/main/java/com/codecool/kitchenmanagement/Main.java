package com.codecool.kitchenmanagement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ramsay: WHAT ARE YOU?");
        System.out.println("Kitchen helper: An idiot sandwich.");
        System.out.println("Ramsay: IDIOT SANDWICH WHAT?");
        System.out.println("Kitchen helper: An idiot sandwich, chef Ramsay.");
//        BigDecimal;
//        BigInteger;

//        1000110011
//        double a = 0.1;
//        double b = 0.2;
//        System.out.println(a + b);
//
//        BigDecimal x = BigDecimal.valueOf(0.1);
//        BigDecimal y = new BigDecimal("0.2");
//        System.out.println(x.add(y));
        KitchenHelper helper = new KitchenHelper();
        Optional<Ingredient> ingredient = helper.giveIngredient(Ingredient.MEAT);
        if (ingredient.isPresent()) {
            Ingredient i = ingredient.get();
        }
        ingredient.ifPresent(i -> {
            System.out.println(i);
        });


    }
}
