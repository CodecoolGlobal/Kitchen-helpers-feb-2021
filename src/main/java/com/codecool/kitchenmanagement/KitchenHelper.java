package com.codecool.kitchenmanagement;

import java.util.Map;
import java.util.Optional;

public class KitchenHelper extends Employee {
    private Map<Ingredient, Integer> ingredients;

    public Optional<Ingredient> giveIngredient(Ingredient ingredient) {
        Integer amount = ingredients.getOrDefault(ingredient, 0);
        if (amount > 0) {
            ingredients.put(ingredient, amount - 1);
            return Optional.of(ingredient);
        }
        return Optional.empty();
    }
}
