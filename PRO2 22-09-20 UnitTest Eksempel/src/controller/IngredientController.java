package controller;

import model.Ingredient;

import java.util.HashMap;

public class IngredientController implements IngredientControllerI {

    private HashMap<String, Ingredient> ingredients;

    public IngredientController() {
        this.ingredients = new HashMap<>();
    }

    @Override
    public Ingredient storeIngredient(Ingredient ingredient) {
        Ingredient ingredientStored = ingredients.get(ingredient.getName());
        if (ingredient.getUnit().equals(ingredientStored.getUnit())) {
            if (ingredientStored != null) {
                ingredientStored.setAmount(ingredientStored.getAmount() + ingredient.getAmount());
                return ingredientStored;
            } else {
                ingredients.put(ingredient.getName(), ingredient);
                return ingredient;
            }
        } else {
            throw new RuntimeException("Mismatch in ingedient unit and the stored ingredient unit. This ingredient uses the unit: " + ingredient.getUnit() + " while the stored ingredient uses the " + ingredientStored.getUnit() + " unit.");
        }
    }

    @Override
    public void collectIngredient(String name, int amount) {
        Ingredient ingredientStored = ingredients.get(name);
        if (ingredientStored != null) {
            ingredientStored.setAmount(ingredientStored.getAmount() - amount);
        } else {
            String message = String.format("No supply of '%s' registered", name);
            throw new RuntimeException(message);
        }
    }
}
